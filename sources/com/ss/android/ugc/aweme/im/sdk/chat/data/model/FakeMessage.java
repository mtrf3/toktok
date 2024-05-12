package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109494Rl;
import X.C109544Rq;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FakeMessage extends C109544Rq {
    public FakeMessageContent fakeContent;

    /* loaded from: classes2.dex */
    public static final class Builder extends C109494Rl {
        @Override // X.C109494Rl
        public FakeMessage newMessage() {
            return new FakeMessage();
        }

        public final Builder setFakeContent$im_base_release(FakeMessageContent content) {
            o.LJIIIZ(content, "content");
            C109544Rq c109544Rq = this.msg;
            o.LJII(c109544Rq, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage");
            ((FakeMessage) c109544Rq).fakeContent = content;
            return this;
        }
    }

    public final boolean isValid$im_base_release() {
        FakeMessageContent fakeMessageContent = this.fakeContent;
        if (fakeMessageContent == null || !fakeMessageContent.isValid()) {
            return false;
        }
        return true;
    }

    public final FakeMessageContent getFakeContent() {
        return this.fakeContent;
    }

    public final boolean needUpdate$im_base_release(FakeMessage old) {
        o.LJIIIZ(old, "old");
        FakeMessageContent fakeMessageContent = this.fakeContent;
        if (fakeMessageContent == null || !fakeMessageContent.needUpdate(old.fakeContent)) {
            return false;
        }
        return true;
    }

    public final void updateFrom$im_base_release(FakeMessage fakeMessage) {
        if (fakeMessage == null) {
            return;
        }
        setUuid(fakeMessage.getUuid());
        setCreatedAt(fakeMessage.getCreatedAt());
    }
}
