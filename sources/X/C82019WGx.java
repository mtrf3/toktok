package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WGx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82019WGx implements InterfaceC82015WGt {
    public final /* synthetic */ C82016WGu LIZ;

    public C82019WGx(C82016WGu c82016WGu) {
        this.LIZ = c82016WGu;
    }

    @Override // X.InterfaceC82015WGt
    public final boolean LIZ(View view, C82013WGr c82013WGr) {
        o.LJIIIZ(view, "view");
        return this.LIZ.LIZ.LIZJ(c82013WGr);
    }

    @Override // X.InterfaceC82015WGt
    public final boolean LIZIZ(View view, C82013WGr c82013WGr) {
        o.LJIIIZ(view, "view");
        return this.LIZ.LIZ.LIZ(c82013WGr);
    }

    @Override // X.InterfaceC82015WGt
    public final void LIZJ(View view, C82013WGr detector) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(detector, "detector");
        this.LIZ.LIZ.LIZIZ(detector);
    }
}
