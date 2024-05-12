package X;

import android.view.Window;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Gos, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42670Gos extends GF6 {
    public final /* synthetic */ SAAActivity LIZ;

    public C42670Gos(SAAActivity sAAActivity) {
        this.LIZ = sAAActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6, X.WMQ
    public final void LIZ(WM7 scene) {
        InterfaceC42675Gox interfaceC42675Gox;
        o.LJIIIZ(scene, "scene");
        if ((scene instanceof InterfaceC42675Gox) && (interfaceC42675Gox = (InterfaceC42675Gox) scene) != null) {
            interfaceC42675Gox.j1();
        }
    }

    @Override // X.GF6, X.WMQ
    public final void LJII(WM7 scene) {
        AbstractC42651GoZ abstractC42651GoZ;
        Window window;
        o.LJIIIZ(scene, "scene");
        this.LIZ.LJLJLJ.setCustomTag("saa_page", scene.getClass().getName());
        if ((scene instanceof AbstractC42651GoZ) && (abstractC42651GoZ = (AbstractC42651GoZ) scene) != null && (window = this.LIZ.getWindow()) != null) {
            window.setSoftInputMode(abstractC42651GoZ.LJLIL.LJ);
        }
    }

    @Override // X.GF6, X.WMQ
    public final void LJIILL(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ.LJLJLJ.setCustomTag("saa_page", scene.getClass().getName());
    }
}
