package X;

import Y.ARunnableS43S0100000_7;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.Gp9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42687Gp9 extends GF6 {
    public final /* synthetic */ NavigationScene LIZ;
    public final /* synthetic */ Class LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZJ;

    @Override // X.GF6, X.WMQ
    public final void LJIIIIZZ(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene.getClass(), this.LIZIZ)) {
            new SafeHandler(this.LIZ).post(new ARunnableS43S0100000_7(this, 94));
            this.LIZJ.invoke();
        }
    }

    public C42687Gp9(NavigationScene navigationScene, Class cls, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = navigationScene;
        this.LIZIZ = cls;
        this.LIZJ = interfaceC65784Pro;
    }
}
