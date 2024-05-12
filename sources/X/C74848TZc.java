package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TZc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74848TZc implements InterfaceC75414Tik<KickOutResult> {
    public final /* synthetic */ C74846TZa LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ LinkPlayerInfo LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(KickOutResult value) {
        o.LJIIIZ(value, "value");
        TYQ.LIZJ("moderator kickOut_Success");
        this.LJLIL.LJLJJL.remove(this.LJLILLLLZI);
        this.LJLJI.LIZLLL = true;
        C28847BTv.LIZJ();
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LJLIL.LJLJL;
        if (multiGuestAsGuestModeratorManageDialog != null) {
            multiGuestAsGuestModeratorManageDialog.LJIILL(this.LJLJJI);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_kickOut_Failed", X1D.LIZIZ(LIZ));
        this.LJLIL.LJLJJL.remove(this.LJLILLLLZI);
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LJLIL.LJLJL;
        if (multiGuestAsGuestModeratorManageDialog != null) {
            multiGuestAsGuestModeratorManageDialog.LJJI(th);
        }
        BPP.LIZLLL(((InterfaceC31336CRo) this.LJLIL.mView).getContext(), th, R.string.su8);
    }

    public C74848TZc(C74846TZa c74846TZa, String str, LinkPlayerInfo linkPlayerInfo, long j) {
        this.LJLIL = c74846TZa;
        this.LJLILLLLZI = str;
        this.LJLJI = linkPlayerInfo;
        this.LJLJJI = j;
    }
}
