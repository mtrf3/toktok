package X;

import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;

/* loaded from: classes16.dex */
public final class YF6 implements InterfaceC80651Vl1 {
    public final /* synthetic */ AwemePagerAssemV2 LIZ;

    @Override // X.InterfaceC80651Vl1
    public final void LIZIZ() {
        AwemePagerAssemV2 awemePagerAssemV2 = this.LIZ;
        float f = awemePagerAssemV2.LLFFF;
        Float valueOf = Float.valueOf(0.0f);
        if (f == 0.0f || awemePagerAssemV2.LLFII) {
            return;
        }
        int X3 = awemePagerAssemV2.X3();
        AwemePagerAssemV2 awemePagerAssemV22 = this.LIZ;
        if (X3 >= awemePagerAssemV22.LLFF) {
            return;
        }
        C80648Vky c80648Vky = awemePagerAssemV22.LJLJL;
        if (c80648Vky != null) {
            C80077Vbl.LIZ(c80648Vky, new OSZ(valueOf, valueOf), new OSZ(valueOf, Float.valueOf(awemePagerAssemV22.x3())), 250L, new SJI(), awemePagerAssemV22.p4());
        }
        this.LIZ.LLFII = true;
    }

    @Override // X.InterfaceC80651Vl1
    public final boolean LIZ() {
        if (!C26360AWe.LIZ()) {
            return false;
        }
        int X3 = this.LIZ.X3();
        C80648Vky c80648Vky = this.LIZ.LJLJL;
        if (c80648Vky == null || c80648Vky.LIZ() || C1JI.LJJ(X3)) {
            return false;
        }
        AwemePagerAssemV2 awemePagerAssemV2 = this.LIZ;
        if (X3 >= awemePagerAssemV2.LLFF || awemePagerAssemV2.LLFFF != 0.0f) {
            return false;
        }
        return true;
    }

    public YF6(AwemePagerAssemV2 awemePagerAssemV2) {
        this.LIZ = awemePagerAssemV2;
    }
}
