/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.model.rich.action;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = true)
public class SendMessageRichMessageAction extends AbstractRichMessageAction {
    private final SendMessageRichMessageActionParams params;

    public SendMessageRichMessageAction(@NonNull String text) {
        super("sendMessage");
        this.params = new SendMessageRichMessageActionParams(text);
    }

    public SendMessageRichMessageActionParams getParams() {return this.params;}

    @Getter
    @ToString
    @EqualsAndHashCode
    public static class SendMessageRichMessageActionParams {
        private final String text;

        public SendMessageRichMessageActionParams(@NonNull String text) {
            this.text = text;
        }
    }
}
