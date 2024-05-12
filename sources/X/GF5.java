package X;

import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GF5 extends GF6 {
    public final /* synthetic */ GF7 LIZ;
    public final /* synthetic */ InterfaceC40967G5z LIZIZ;

    @Override // X.GF6, X.WMQ
    public final void LJIJ(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(this.LIZ.getScene(), scene)) {
            this.LIZIZ.LIZ();
        }
    }

    public GF5(GF7 gf7, InterfaceC40967G5z interfaceC40967G5z) {
        this.LIZ = gf7;
        this.LIZIZ = interfaceC40967G5z;
    }

    @Override // X.GF6, X.WMQ
    public final void LJIILLIIL(WM7 scene, Bundle bundle) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(this.LIZ.getScene(), scene)) {
            InterfaceC40967G5z interfaceC40967G5z = this.LIZIZ;
            View view = scene.mView;
            o.LJIIIIZZ(view, "scene.view");
            interfaceC40967G5z.onViewCreated(view, bundle);
        }
    }
}
