package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AqS0S0410000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tck, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75042Tck implements TXY {
    public Fragment LIZ;
    public IWindowAbility LIZIZ;

    public final Fragment LIZJ() {
        Fragment fragment = this.LIZ;
        if (fragment == null || !fragment.isAdded()) {
            return null;
        }
        Fragment fragment2 = this.LIZ;
        if (fragment2 != null) {
            return fragment2;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public final IWindowAbility LIZLLL() {
        IWindowAbility iWindowAbility;
        IWindowAbility iWindowAbility2 = this.LIZIZ;
        if (iWindowAbility2 == null) {
            Fragment LIZJ = LIZJ();
            if (LIZJ == null || (iWindowAbility = (IWindowAbility) UC0.LJIIL(UC0.LJJIJLIJ(LIZJ), IWindowAbility.class, null)) == null) {
                return null;
            }
            this.LIZIZ = iWindowAbility;
            return iWindowAbility;
        }
        return iWindowAbility2;
    }

    @Override // X.TXY
    public final void E7() {
        IWindowAbility LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.E7();
        }
    }

    @Override // X.TXY
    public final void LIZIZ() {
        IWindowAbility LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.e00();
        }
        this.LIZIZ = null;
        Fragment LIZJ = LIZJ();
        if (LIZJ != null) {
            C8VV.LJIIIIZZ(LIZJ, C65352Pkq.LIZ(WindowMaskAssem.class));
            UC0.LJJLIIIJ(C55230Lly.LIZJ(LIZJ, "linkMicScope"), IWindowAbility.class, null);
        }
    }

    @Override // X.TXY
    public final void I2(boolean z, boolean z2) {
        Fragment LIZJ = LIZJ();
        if (LIZJ != null) {
            C44729Hgz.LIZ(UC0.LJJIJLIJ(LIZJ), z);
        }
        IWindowAbility LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.I2(z, z2);
        }
    }

    @Override // X.TXY
    public final void LIZ(LiveWidget widget, ViewGroup mAnchorContainer, TRS trs, boolean z) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        Fragment LJIIIZ = C79234V7u.LJIIIZ(mAnchorContainer);
        if (LJIIIZ != null) {
            this.LIZ = LJIIIZ;
            C8VV.LIZ(LJIIIZ, false, new AqS0S0410000_13(LJIIIZ, z, widget, trs, mAnchorContainer, 1));
        }
    }
}
