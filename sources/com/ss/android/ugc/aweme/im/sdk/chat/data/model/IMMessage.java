package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMMessage extends F9E {
    public final C109544Rq message;
    public final MessageState state;

    public static /* synthetic */ IMMessage copy$default(IMMessage iMMessage, C109544Rq c109544Rq, MessageState messageState, int i, Object obj) {
        if ((i & 1) != 0) {
            c109544Rq = iMMessage.message;
        }
        if ((i & 2) != 0) {
            messageState = iMMessage.state;
        }
        return iMMessage.copy(c109544Rq, messageState);
    }

    public final IMMessage copy(C109544Rq message, MessageState state) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(state, "state");
        return new IMMessage(message, state);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.message, this.state};
    }

    public final C109544Rq getMessage() {
        return this.message;
    }

    public final MessageState getState() {
        return this.state;
    }

    public IMMessage(C109544Rq message, MessageState state) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(state, "state");
        this.message = message;
        this.state = state;
    }
}
