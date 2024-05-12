package X;

import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YF5 implements InterfaceC80651Vl1 {
    public final /* synthetic */ AwemePagerAssem LIZ;

    @Override // X.InterfaceC80651Vl1
    public final void LIZIZ() {
        List<ProfileListFragment> list;
        AwemePagerAssem awemePagerAssem = this.LIZ;
        float f = awemePagerAssem.LLFFF;
        Float valueOf = Float.valueOf(0.0f);
        if (f == 0.0f || awemePagerAssem.LLFII) {
            return;
        }
        int U3 = awemePagerAssem.U3();
        AwemePagerAssem awemePagerAssem2 = this.LIZ;
        if (U3 >= awemePagerAssem2.LLFF) {
            return;
        }
        C80648Vky c80648Vky = awemePagerAssem2.LJLJJL;
        o.LJI(c80648Vky);
        C80077Vbl.LIZ(c80648Vky, new OSZ(valueOf, valueOf), new OSZ(valueOf, Float.valueOf(this.LIZ.x3())), 250L, new SJI(), this.LIZ.m4());
        AwemePagerAssem awemePagerAssem3 = this.LIZ;
        awemePagerAssem3.LLFII = true;
        if (awemePagerAssem3.I4() || (list = this.LIZ.LJLJI) == null) {
            return;
        }
        Iterator<ProfileListFragment> it = list.iterator();
        while (it.hasNext()) {
            it.next().LL();
        }
    }

    @Override // X.InterfaceC80651Vl1
    public final boolean LIZ() {
        if (!C26360AWe.LIZ()) {
            return false;
        }
        int U3 = this.LIZ.U3();
        C80648Vky c80648Vky = this.LIZ.LJLJJL;
        if (c80648Vky == null || c80648Vky.LIZ() || C1JI.LJJ(U3)) {
            return false;
        }
        AwemePagerAssem awemePagerAssem = this.LIZ;
        if (U3 >= awemePagerAssem.LLFF || awemePagerAssem.LLFFF != 0.0f) {
            return false;
        }
        return true;
    }

    public YF5(AwemePagerAssem awemePagerAssem) {
        this.LIZ = awemePagerAssem;
    }
}
