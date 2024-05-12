package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Wrt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83625Wrt extends AbstractC83637Ws5 {
    public final String LIZIZ = "type_scene_cover";
    public final java.util.Set<String> LIZJ = new LinkedHashSet();
    public final ReentrantLock LIZLLL = new ReentrantLock(true);
    public final C83626Wru LJ;

    @Override // X.InterfaceC83706WtC
    public final String getType() {
        return this.LIZIZ;
    }

    public C83625Wrt(C83626Wru c83626Wru) {
        this.LJ = c83626Wru;
    }

    public final void LIZIZ(I0E scene, Cert cert) {
        o.LJIIIZ(scene, "scene");
        String name = scene.name();
        this.LIZLLL.lock();
        String obj = this.LIZJ.toString();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: onSceneCoverHide: sceneName: ");
        LIZ.append(name);
        LIZ.append(", curSceneSet: ");
        LIZ.append(obj);
        LIZ.append('}');
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LIZJ.remove(name);
        if (this.LIZJ.isEmpty()) {
            LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(1, 1), new NDG(this.LJ.LIZ(new C83678Wsk(false, 2), "action_name_start_preview"), cert)));
        }
        this.LIZLLL.unlock();
    }

    public final void LIZJ(I0E scene, C78862UxG c78862UxG) {
        o.LJIIIZ(scene, "scene");
        String name = scene.name();
        this.LIZLLL.lock();
        String obj = this.LIZJ.toString();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: onSceneCoverShow: sceneName: ");
        LIZ.append(name);
        LIZ.append(", curSceneSet: ");
        LIZ.append(obj);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (this.LIZJ.isEmpty()) {
            LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(2, 2), new NDG(this.LJ.LIZ(new C83684Wsq(false), "action_name_stop_preview"), c78862UxG)));
        }
        this.LIZJ.add(name);
        this.LIZLLL.unlock();
    }
}
