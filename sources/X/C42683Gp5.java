package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gp5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42683Gp5 extends GF6 {
    public final /* synthetic */ C42684Gp6 LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LIZIZ;

    @Override // X.GF6, X.WMQ
    public final void LIZ(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        LJIJI(scene);
    }

    @Override // X.GF6, X.WMQ
    public final void LIZIZ(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        LJIJI(scene);
    }

    @Override // X.GF6, X.WMQ
    public final void LIZJ(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        LJIJI(scene);
    }

    public final void LJIJI(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        if (this.LIZ.LIZIZ.containsKey(scene.getClass().getName())) {
            this.LIZIZ.invoke(Boolean.TRUE, this.LIZ.LIZIZ.get(scene.getClass().getName()));
        } else {
            this.LIZIZ.invoke(Boolean.FALSE, this.LIZ.LIZIZ.get(scene.getClass().getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42683Gp5(C42684Gp6 c42684Gp6, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = c42684Gp6;
        this.LIZIZ = interfaceC88471Ynr;
    }
}
