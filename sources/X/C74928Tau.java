package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;

/* renamed from: X.Tau, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74928Tau implements InterfaceC75220Tfc {
    public final /* synthetic */ MultiGuestPreviewFragment LIZ;

    @Override // X.InterfaceC75220Tfc
    public final void LIZ() {
        ConstraintLayout constraintLayout;
        MultiGuestPreviewFragment multiGuestPreviewFragment = this.LIZ;
        if (multiGuestPreviewFragment.LLIIIL != null && (constraintLayout = multiGuestPreviewFragment.LLIIIZ) != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZIZ() {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        MultiGuestPreviewFragment multiGuestPreviewFragment = this.LIZ;
        if (multiGuestPreviewFragment.LLIIIL != null && (multiGuestEffectSwitchFragment = multiGuestPreviewFragment.LJLLL) != null) {
            C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
            int i = multiGuestEffectSwitchFragment.LJZL;
            c74964TbU.getClass();
            if (i == 1) {
                MultiGuestPreviewFragment multiGuestPreviewFragment2 = this.LIZ;
                if (multiGuestPreviewFragment2.LLIIIZ != null) {
                    multiGuestPreviewFragment2.LLIIIL.setVisibility(0);
                    this.LIZ.LLIIIZ.setVisibility(0);
                    return;
                }
            }
        }
        ConstraintLayout constraintLayout = this.LIZ.LLIIIZ;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    @Override // X.InterfaceC75220Tfc
    public final C76923UGx LIZJ() {
        return this.LIZ.LLIIIL;
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZLLL() {
        ConstraintLayout constraintLayout = this.LIZ.LLIIIZ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    public C74928Tau(MultiGuestPreviewFragment multiGuestPreviewFragment) {
        this.LIZ = multiGuestPreviewFragment;
    }
}
