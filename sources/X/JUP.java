package X;

import com.bytedance.android.livesdk.live.model.FilterInfoData;

/* loaded from: classes9.dex */
public final class JUP implements BOM {
    public final /* synthetic */ JUK LIZ;

    @Override // X.BOM
    public final void onFailed() {
    }

    public JUP(JUK juk) {
        this.LIZ = juk;
    }

    @Override // X.BOM
    public final void LIZ(FilterInfoData filterInfoData, boolean z) {
        if (!z) {
            this.LIZ.LJFF();
            InterfaceC86353Xun mLivePlayHelper = this.LIZ.getMLivePlayHelper();
            if (mLivePlayHelper != null) {
                mLivePlayHelper.LLZZLLIL();
            }
            this.LIZ.getStatusDelegate().LIZ();
        }
    }
}
