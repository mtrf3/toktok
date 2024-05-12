package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6B implements InterfaceC76768UAy<JoinChannelResult> {
    public final /* synthetic */ U65 LJLIL;
    public final /* synthetic */ InterfaceC75414Tik<JoinChannelResult> LJLILLLLZI = null;

    public U6B(U65 u65) {
        this.LJLIL = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(JoinChannelResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U6E LJJI = this.LJLIL.LJFF().LJJI();
        LJJI.LJI.invoke("onJoinChannelSucceed");
        Layout LIZJ = LJJI.LIZIZ.LIZJ(true);
        LJJI.LIZJ.invoke(Boolean.TRUE);
        if (LIZJ != null) {
            LJJI.LIZLLL.invoke(LIZJ).booleanValue();
        }
        this.LJLIL.LJLJJL.LLLLZLL().LJJIJ("business_multi_guest_guest_apply_click_go_live");
        U8H LJFF = this.LJLIL.LJFF();
        LJFF.LJJLJ(true);
        Layout LIZJ2 = LJFF.LJIJJ().LIZJ(false);
        if (LIZJ2 != null) {
            U8H.LJJLIIIJJIZ(LJFF, LIZJ2, true, false, null, 24);
        }
        InterfaceC75414Tik<JoinChannelResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1279);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        C0RO.LIZ(C15380j0.LIZLLL(), th, null);
        InterfaceC75414Tik<JoinChannelResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
