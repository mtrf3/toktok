package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76596U4i implements InterfaceC76768UAy<KickOutAllResult> {
    public final /* synthetic */ U65 LJLIL;
    public final /* synthetic */ InterfaceC75414Tik<KickOutAllResult> LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(KickOutAllResult value) {
        o.LJIIIZ(value, "value");
        String LJIIIIZZ = U65.LJIIIIZZ(1934);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOutAll result=");
        LIZ.append(value);
        C32014ChO.LJFF(LJIIIIZZ, X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<KickOutAllResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76596U4i(IDo0S413S0100000_13 iDo0S413S0100000_13, U65 u65) {
        this.LJLIL = u65;
        this.LJLILLLLZI = iDo0S413S0100000_13;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1234);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOutAll fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<KickOutAllResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
