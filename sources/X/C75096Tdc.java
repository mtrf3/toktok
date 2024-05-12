package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75096Tdc implements InterfaceC75014TcI {
    public final /* synthetic */ C75093TdZ LIZ;
    public final /* synthetic */ LinkPlayerInfo LIZIZ;

    @Override // X.InterfaceC75014TcI
    public final void LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C75093TdZ c75093TdZ = this.LIZ;
        c75093TdZ.getClass();
        C28733BPl.LJIILIIL().LJIIIIZZ(c75093TdZ.LLIIJLIL, C113554cx.LJJLIIIIJ(new OSZ("action", "zoom"), new OSZ("step", "onZoomSuccess")));
    }

    public C75096Tdc(C75093TdZ c75093TdZ, LinkPlayerInfo linkPlayerInfo) {
        this.LIZ = c75093TdZ;
        this.LIZIZ = linkPlayerInfo;
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZ(int i, String linkMicId, String message, Throwable th) {
        String str;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
        C75093TdZ c75093TdZ = this.LIZ;
        c75093TdZ.getClass();
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str2 = c75093TdZ.LLIIJLIL;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("action", "zoom");
        oszArr[1] = new OSZ("step", "onZoomFail");
        oszArr[2] = new OSZ("errorCode", Integer.valueOf(i));
        oszArr[3] = new OSZ("errorMessage", message);
        User user = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        oszArr[4] = new OSZ("throwable", str);
        LJIILIIL.LJIIIIZZ(str2, C113554cx.LJJLIIIIJ(oszArr));
        if (th != null) {
            C74947TbD.LJIILJJIL(this.LIZ.LLIIIL, th);
            return;
        }
        if (i == EnumC75004Tc8.E_C_GUEST_REJECT_ZOOM.ordinal() || i == 4004307) {
            Object[] objArr = new Object[1];
            LinkPlayerInfo linkPlayerInfo = this.LIZIZ;
            if (linkPlayerInfo != null) {
                user = linkPlayerInfo.mUser;
            }
            objArr[0] = C05170If.LIZ(user);
            C30868C9o.LJI(C15380j0.LJIILL(R.string.nf2, objArr));
            return;
        }
        C30868C9o.LJI(message);
    }
}
