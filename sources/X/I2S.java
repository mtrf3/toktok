package X;

import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;

/* loaded from: classes8.dex */
public final class I2S implements ISaveVideoToDraftListener {
    public final /* synthetic */ I2U LIZ;

    @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
    public final void onSuccess() {
        I2U i2u = this.LIZ;
        if (i2u != null) {
            i2u.onSuccess();
        }
    }

    public I2S(C36781cQ c36781cQ) {
        this.LIZ = c36781cQ;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
    public final void onFailed(Exception exc) {
        I2U i2u = this.LIZ;
        if (i2u != null && exc != null) {
            i2u.onFailed(exc);
        }
    }
}
