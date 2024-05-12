package X;

import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;

/* loaded from: classes16.dex */
public final class YFB implements MFC {
    public final /* synthetic */ AwemePagerAssemV2 LIZ;

    public YFB(AwemePagerAssemV2 awemePagerAssemV2) {
        this.LIZ = awemePagerAssemV2;
    }

    @Override // X.MFC
    public final void LIZ(int i) {
        C80648Vky c80648Vky = this.LIZ.LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.k4().Jv0(false);
            this.LIZ.k4().Iv0(false);
        }
    }

    @Override // X.MFC
    public final void LIZIZ(int i, boolean z) {
        C80648Vky c80648Vky = this.LIZ.LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.k4().Jv0(true);
            this.LIZ.k4().Iv0(true);
        }
    }
}
