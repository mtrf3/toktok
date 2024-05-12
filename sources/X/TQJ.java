package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQJ implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TY7 LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave channel succ for ");
        LIZ.append(this.LJLIL);
        C0NB.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZ));
        TYQ.LIZLLL("LinkIn_leave_Success", "position:leaveChannel");
        C74838TYs.LJ().LJJIIZ = true;
    }

    public TQJ(String str, TY7 ty7) {
        this.LJLIL = str;
        this.LJLILLLLZI = ty7;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        String LIZ;
        String str;
        o.LJIIIZ(error, "error");
        this.LJLILLLLZI.getClass();
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_MultiGuestV3GuestBeInvitedPresenter_", LJ, LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_MultiGuestV3GuestBeInvitedPresenter_", 280, LIZ3);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("leave channel failed for ");
        String LIZIZ = q.LIZIZ(LIZ4, this.LJLIL, ',', LIZ4);
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ(LIZ, LIZIZ, str);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("position:leaveChannel; throwable:");
        LIZ5.append(th);
        TYQ.LIZLLL("LinkIn_leave_Failed", X1D.LIZIZ(LIZ5));
        C74838TYs.LJ().LJJIIZ = false;
    }
}
