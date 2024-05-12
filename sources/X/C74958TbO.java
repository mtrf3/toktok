package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.ies.sdk.datachannel.Channel;

/* renamed from: X.TbO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74958TbO implements InterfaceC75220Tfc {
    public final /* synthetic */ AbsMultiGuestNewPreviewFragment LIZ;

    @Override // X.InterfaceC75220Tfc
    public final void LIZ() {
        Channel<Integer> hv0;
        Integer value;
        AbsMultiGuestNewPreviewViewModel Kl = this.LIZ.Kl();
        if (Kl == null || (hv0 = Kl.hv0()) == null || (value = hv0.getValue()) == null || value.intValue() != 2) {
            return;
        }
        AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment = this.LIZ;
        if (absMultiGuestNewPreviewFragment.LJLJI == null) {
            return;
        }
        absMultiGuestNewPreviewFragment.Jl().LJI(absMultiGuestNewPreviewFragment.LJLLILLLL);
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZIZ() {
        ConstraintLayout constraintLayout;
        Channel<Integer> hv0;
        Integer value;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        C76923UGx c76923UGx;
        AbsMultiGuestNewPreviewViewModel Kl = this.LIZ.Kl();
        if (Kl != null && (hv0 = Kl.hv0()) != null && (value = hv0.getValue()) != null && value.intValue() == 2 && (multiGuestEffectSwitchFragment = this.LIZ.LLFFF) != null) {
            int i = multiGuestEffectSwitchFragment.LJZL;
            InterfaceC74965TbV.LIZLLL.getClass();
            if (i == 1 && ((c76923UGx = this.LIZ.LJLLJ) == null || c76923UGx.getVisibility() != 8)) {
                AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment = this.LIZ;
                if (absMultiGuestNewPreviewFragment.LJLJI != null) {
                    absMultiGuestNewPreviewFragment.Jl().LJIILLIIL(absMultiGuestNewPreviewFragment.LJLLILLLL);
                }
            }
        }
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = this.LIZ.LLFFF;
        if (multiGuestEffectSwitchFragment2 != null) {
            int i2 = multiGuestEffectSwitchFragment2.LJZL;
            InterfaceC74965TbV.LIZLLL.getClass();
            if (C74964TbU.LIZIZ(i2) && (constraintLayout = this.LIZ.LJLLILLLL) != null) {
                C29306Beo.LJI(constraintLayout);
            }
        }
    }

    @Override // X.InterfaceC75220Tfc
    public final C76923UGx LIZJ() {
        return this.LIZ.LJLLJ;
    }

    @Override // X.InterfaceC75220Tfc
    public final void LIZLLL() {
        ConstraintLayout constraintLayout = this.LIZ.LJLLILLLL;
        if (constraintLayout != null) {
            C87277YNd.LJJIIZ(constraintLayout);
        }
    }

    public C74958TbO(AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment) {
        this.LIZ = absMultiGuestNewPreviewFragment;
    }
}
