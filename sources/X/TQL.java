package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQL implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ TQV LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        TYQ.LIZLLL("LinkIn_leave_Success", "position:leaveChannel");
        TQV tqv = this.LJLIL;
        tqv.LJLJL = false;
        tqv.LJLJLJ = false;
        C74838TYs.LJ().LJJIIZ = true;
        this.LJLIL.leaveAction(this.LJLILLLLZI);
    }

    public TQL(TQV tqv, boolean z) {
        this.LJLIL = tqv;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        TQV tqv = this.LJLIL;
        tqv.LJLJL = false;
        if (th != null && tqv.mView != 0) {
            tqv.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:leaveChannel; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_leave_Failed", X1D.LIZIZ(LIZ));
        C74838TYs.LJ().LJJIIZ = false;
        this.LJLIL.leaveAction(this.LJLILLLLZI);
    }
}
