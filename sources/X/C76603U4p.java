package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76603U4p implements InterfaceC76768UAy<CancelApplyResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelApplyResult> LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelApplyResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76603U4p(InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1211);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite success error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
