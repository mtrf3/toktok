package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tac, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74910Tac implements InterfaceC75222Tfe {
    public final /* synthetic */ GuestMediaManageFragment LIZ;

    public C74910Tac(GuestMediaManageFragment guestMediaManageFragment) {
        this.LIZ = guestMediaManageFragment;
    }

    @Override // X.InterfaceC75222Tfe
    public final boolean LIZ(LiveEffect liveEffect) {
        if (liveEffect.realId.equals("")) {
            return true;
        }
        try {
            return this.LIZ.LLILZ.LIZ(liveEffect);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZIZ(LiveEffect liveEffect) {
        InterfaceC31981Ni interfaceC31981Ni;
        InterfaceC31981Ni interfaceC31981Ni2 = this.LIZ.LLJJIJI;
        if (interfaceC31981Ni2 != null) {
            interfaceC31981Ni2.LIZLLL(C0TY.LIZJ);
        }
        if (!TextUtils.equals(liveEffect.realId, "") && (interfaceC31981Ni = this.LIZ.LLJJIJI) != null) {
            interfaceC31981Ni.LIZIZ(liveEffect, C0TY.LIZJ);
        }
        this.LIZ.LLILIL = liveEffect;
        C31014CFe.LJFF(String.valueOf(liveEffect.effectId));
        C31014CFe.LJI(this.LIZ.LLILIL.getResourceId());
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZJ(LiveEffect liveEffect) {
        GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
        InterfaceC08130Tp interfaceC08130Tp = guestMediaManageFragment.LLILZ;
        if (interfaceC08130Tp == null || guestMediaManageFragment.LLILZIL == null) {
            return;
        }
        if (interfaceC08130Tp.LIZ(liveEffect)) {
            this.LIZ.LLILZIL.LJLLLLLL(2, liveEffect, C0TY.LIZJ);
        } else {
            GuestMediaManageFragment guestMediaManageFragment2 = this.LIZ;
            guestMediaManageFragment2.LLILZ.LIZIZ(C0TY.LIZJ, liveEffect, guestMediaManageFragment2.LLJLLL);
        }
    }
}
