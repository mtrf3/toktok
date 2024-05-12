package com.ss.android.ugc.aweme.im.sdk.common.controller.websocket;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class IMBusinessWsPayload extends F9E implements Serializable {

    @InterfaceC65349Pkn("action")
    public final int action;

    public static /* synthetic */ IMBusinessWsPayload copy$default(IMBusinessWsPayload iMBusinessWsPayload, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iMBusinessWsPayload.action;
        }
        return iMBusinessWsPayload.copy(i);
    }

    public final IMBusinessWsPayload copy(int i) {
        return new IMBusinessWsPayload(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.action)};
    }

    public final int getAction() {
        return this.action;
    }

    public IMBusinessWsPayload(int i) {
        this.action = i;
    }
}
