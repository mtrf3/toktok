package X;

import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YFA implements MFC {
    public final /* synthetic */ AwemePagerAssem LIZ;

    public YFA(AwemePagerAssem awemePagerAssem) {
        this.LIZ = awemePagerAssem;
    }

    @Override // X.MFC
    public final void LIZ(int i) {
        C80648Vky c80648Vky = this.LIZ.LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.X3().Jv0(false);
            this.LIZ.X3().Iv0(false);
        }
    }

    @Override // X.MFC
    public final void LIZIZ(int i, boolean z) {
        C80648Vky c80648Vky = this.LIZ.LJLJJL;
        if (c80648Vky != null) {
            o.LJI(c80648Vky);
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.X3().Jv0(true);
            this.LIZ.X3().Iv0(true);
        }
    }
}
