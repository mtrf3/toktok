package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76605U4r implements InterfaceC76768UAy<DestroyChannelResult> {
    public final /* synthetic */ U65 LJLIL;
    public final /* synthetic */ InterfaceC75414Tik<DestroyChannelResult> LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(DestroyChannelResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        this.LJLIL.LJFF().destroy();
        InterfaceC75414Tik<DestroyChannelResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    public C76605U4r(InterfaceC75414Tik interfaceC75414Tik, U65 u65) {
        this.LJLIL = u65;
        this.LJLILLLLZI = interfaceC75414Tik;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(995);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<DestroyChannelResult> interfaceC75414Tik = this.LJLILLLLZI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
