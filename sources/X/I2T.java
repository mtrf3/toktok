package X;

import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;

/* loaded from: classes8.dex */
public final class I2T implements FetchResourcesListener {
    public final /* synthetic */ I2U LIZ;

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        I2U i2u = this.LIZ;
        if (i2u != null) {
            i2u.onSuccess();
        }
    }

    public I2T(C31815CeB c31815CeB) {
        this.LIZ = c31815CeB;
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        I2U i2u = this.LIZ;
        if (i2u != null) {
            i2u.onFailed(exc);
        }
    }
}
