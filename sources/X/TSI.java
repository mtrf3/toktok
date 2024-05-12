package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSI implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ String LJLIL;

    public TSI(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkIn_leave_Success ");
        LIZ.append(this.LJLIL);
        TYP.LIZ("GameLinkGuestBeInvitedPresenter", X1D.LIZIZ(LIZ), false);
        C74838TYs.LJ().LJJIIZ = true;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkIn_leave_Failed for ");
        String msg = q.LIZIZ(LIZ, this.LJLIL, ',', LIZ);
        o.LJIIIZ(msg, "msg");
        C0NB.LJFF("GameLinkGuestBeInvitedPresenter", msg, th);
        C74838TYs.LJ().LJJIIZ = false;
    }
}
