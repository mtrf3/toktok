package X;

import Y.IDxS306S0100000_5;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import defpackage.g0;

/* renamed from: X.Bjp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29617Bjp extends AbstractC38123Exj<Object, Object> {
    public InterfaceC92693kP LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        InterfaceC92693kP interfaceC92693kP = this.LJLIL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr c38131Exr) {
        if (g0.LJIILJJIL(c38131Exr.LIZ) == null) {
            finishWithFailure();
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Context context = c38131Exr.LIZ;
        C29356Bfc c29356Bfc = new C29356Bfc();
        c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syn);
        ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new IDxS306S0100000_5(this, 1));
    }
}
