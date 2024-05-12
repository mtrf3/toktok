package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76602U4o implements InterfaceC76768UAy<KickOutResult> {
    public final /* synthetic */ InterfaceC75414Tik<KickOutResult> LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(KickOutResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOut success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<KickOutResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76602U4o(InterfaceC75414Tik<KickOutResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1234);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOut fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<KickOutResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
