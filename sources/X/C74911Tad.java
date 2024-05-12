package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tad, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74911Tad implements InterfaceC75222Tfe {
    public final /* synthetic */ MultiGuestPreviewFragment LIZ;

    public C74911Tad(MultiGuestPreviewFragment multiGuestPreviewFragment) {
        this.LIZ = multiGuestPreviewFragment;
    }

    @Override // X.InterfaceC75222Tfe
    public final boolean LIZ(LiveEffect liveEffect) {
        if (liveEffect.realId.equals("")) {
            return true;
        }
        try {
            return this.LIZ.LLILLIZIL.LIZ(liveEffect);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZIZ(LiveEffect liveEffect) {
        this.LIZ.Zl(liveEffect);
        C31014CFe.LJFF(String.valueOf(liveEffect.effectId));
        C31014CFe.LJI(liveEffect.getResourceId());
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZJ(LiveEffect liveEffect) {
        MultiGuestPreviewFragment multiGuestPreviewFragment = this.LIZ;
        InterfaceC08130Tp interfaceC08130Tp = multiGuestPreviewFragment.LLILLIZIL;
        if (interfaceC08130Tp == null || multiGuestPreviewFragment.LLILLJJLI == null) {
            return;
        }
        if (interfaceC08130Tp.LIZ(liveEffect)) {
            this.LIZ.LLILLJJLI.LJLLLLLL(2, liveEffect, C0TY.LIZJ);
        } else {
            MultiGuestPreviewFragment multiGuestPreviewFragment2 = this.LIZ;
            multiGuestPreviewFragment2.LLILLIZIL.LIZIZ(C0TY.LIZJ, liveEffect, (InterfaceC08110Tn) EUR.LIZ(multiGuestPreviewFragment2.LLJLLL));
        }
    }
}
