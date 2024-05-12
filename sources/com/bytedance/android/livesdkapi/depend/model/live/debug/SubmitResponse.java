package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class SubmitResponse extends F9E implements Serializable {

    @InterfaceC65349Pkn("success")
    public boolean success;

    public static /* synthetic */ SubmitResponse copy$default(SubmitResponse submitResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = submitResponse.success;
        }
        return submitResponse.copy(z);
    }

    public final SubmitResponse copy(boolean z) {
        return new SubmitResponse(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success)};
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public SubmitResponse(boolean z) {
        this.success = z;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }
}
