package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Ntj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60807Ntj implements InterfaceC60812Nto {
    public C73305Spp LIZ;

    @Override // X.InterfaceC60812Nto
    public final C73305Spp getView() {
        C73305Spp c73305Spp = this.LIZ;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.InterfaceC60812Nto
    public final void hide() {
        C73305Spp c73305Spp = this.LIZ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // X.InterfaceC60812Nto
    public final void show() {
        C73305Spp c73305Spp = this.LIZ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            c73305Spp.LJFF();
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // X.InterfaceC60812Nto
    public final void LIZ(Context context) {
        this.LIZ = new C73305Spp(context, null, 6);
    }
}
