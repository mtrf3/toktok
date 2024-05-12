package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76604U4q implements InterfaceC76768UAy<CancelInviteResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelInviteResult> LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelInviteResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76604U4q(InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1191);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
