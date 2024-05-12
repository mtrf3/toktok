package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U5y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76638U5y implements InterfaceC76768UAy<InviteResult> {
    public final /* synthetic */ C68322mC<LayoutDSLConfig> LJLIL;
    public final /* synthetic */ InterfaceC75414Tik<InviteResult> LJLILLLLZI;
    public final /* synthetic */ U65 LJLJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(InviteResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        LayoutDSLConfig layoutDSLConfig = this.LJLIL.element;
        if (layoutDSLConfig != null) {
            U6E LJJI = this.LJLJI.LJFF().LJJI();
            LJJI.getClass();
            LJJI.LJI.invoke("onInviteSucceed");
            LJJI.LIZJ.invoke(Boolean.TRUE);
            LJJI.LJ.invoke(layoutDSLConfig);
        }
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1071);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public C76638U5y(C68322mC<LayoutDSLConfig> c68322mC, InterfaceC75414Tik<InviteResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = interfaceC75414Tik;
        this.LJLJI = u65;
    }
}
