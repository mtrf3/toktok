package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76601U4n implements InterfaceC76768UAy<ChangeMaxPositionResult> {
    public final /* synthetic */ InterfaceC75414Tik<ChangeMaxPositionResult> LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ChangeMaxPositionResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMaxPosition success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76601U4n(InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik, U65 u65) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = u65;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1254);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMaxPosition fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
