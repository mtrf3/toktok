package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListUpgradeFragment;

/* renamed from: X.TsN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76011TsN implements InterfaceC74841TYv {
    public final /* synthetic */ C76016TsS LIZ;
    public final /* synthetic */ MultiCoHostInviteListContract$AbsView LIZIZ;

    @Override // X.InterfaceC74841TYv
    public final void LIZ(boolean z) {
        if (!z && this.LIZ.LJLLILLLL.size() > 0) {
            C74838TYs.LJ().LJI.remove(this);
            this.LIZIZ.xl();
            this.LIZ.LLF.LIZJ();
        }
    }

    public C76011TsN(C76016TsS c76016TsS, MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment) {
        this.LIZ = c76016TsS;
        this.LIZIZ = multiHostInviteListUpgradeFragment;
    }
}
