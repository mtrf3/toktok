package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;

/* renamed from: X.Tat, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74927Tat implements InterfaceC75220Tfc {
    public final /* synthetic */ GuestMediaManageFragment LIZ;

    @Override // X.InterfaceC75220Tfc
    public final void LIZ() {
        C76923UGx c76923UGx = this.LIZ.LLI;
        if (c76923UGx != null) {
            c76923UGx.setVisibility(8);
        }
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZIZ() {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
        if (guestMediaManageFragment.LLI != null && (multiGuestEffectSwitchFragment = guestMediaManageFragment.LLIIIL) != null) {
            C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
            int i = multiGuestEffectSwitchFragment.LJZL;
            c74964TbU.getClass();
            if (i == 1) {
                GuestMediaManageFragment guestMediaManageFragment2 = this.LIZ;
                if (guestMediaManageFragment2.LLIFFJFJJ != null) {
                    guestMediaManageFragment2.LLI.setVisibility(0);
                    this.LIZ.LLIFFJFJJ.setVisibility(0);
                    return;
                }
            }
        }
        ConstraintLayout constraintLayout = this.LIZ.LLIFFJFJJ;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(4);
    }

    @Override // X.InterfaceC75220Tfc
    public final C76923UGx LIZJ() {
        return this.LIZ.LLI;
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZLLL() {
        ConstraintLayout constraintLayout = this.LIZ.LLIFFJFJJ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    public C74927Tat(GuestMediaManageFragment guestMediaManageFragment) {
        this.LIZ = guestMediaManageFragment;
    }
}
