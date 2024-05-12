package X;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75097Tdd implements InterfaceC75014TcI {
    public final /* synthetic */ C75103Tdj LIZ;
    public final /* synthetic */ DialogInterface LIZIZ;

    @Override // X.InterfaceC75014TcI
    public final void LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LIZ.LLIFFJFJJ, C113554cx.LJJLIIIIJ(new OSZ("action", "zoom"), new OSZ("step", "onZoomSuccess")));
        DialogInterface dialogInterface = this.LIZIZ;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public C75097Tdd(C75103Tdj c75103Tdj, DialogInterface dialogInterface) {
        this.LIZ = c75103Tdj;
        this.LIZIZ = dialogInterface;
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZ(int i, String linkMicId, String errorMessage, Throwable th) {
        String str;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(errorMessage, "errorMessage");
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str2 = this.LIZ.LLIFFJFJJ;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("action", "zoom");
        oszArr[1] = new OSZ("step", "onZoomFail");
        oszArr[2] = new OSZ("errorCode", Integer.valueOf(i));
        oszArr[3] = new OSZ("errorMessage", errorMessage);
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        oszArr[4] = new OSZ("throwable", str);
        LJIILIIL.LJIIIIZZ(str2, C113554cx.LJJLIIIIJ(oszArr));
        DialogInterface dialogInterface = this.LIZIZ;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (th != null) {
            C74947TbD.LJIILJJIL(this.LIZ.LJLIL, th);
            return;
        }
        if (i == EnumC75004Tc8.E_C_GUEST_REJECT_ZOOM.ordinal() || i == 4004307) {
            Object[] objArr = new Object[1];
            User user = this.LIZ.LLD;
            if (user != null) {
                objArr[0] = C05170If.LIZ(user);
                C30868C9o.LJI(C15380j0.LJIILL(R.string.nf2, objArr));
                return;
            } else {
                o.LJIJI("oTargetUser");
                throw null;
            }
        }
        C30868C9o.LJI(errorMessage);
    }
}
