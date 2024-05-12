package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public class FHM implements InterfaceC38722FHq {
    public final java.util.Set<Object> LIZ = new CopyOnWriteArraySet();

    @Override // X.InterfaceC38722FHq
    public FHP LIZ() {
        long nanoTime = System.nanoTime();
        Keva repoSync = KevaImpl.getRepoSync("precise_exposure_repo", 1);
        LJIIIZ(nanoTime, "precise_exposure_repo");
        return new C792839g(repoSync);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LIZIZ() {
        long nanoTime = System.nanoTime();
        Keva LJIIIIZZ = LJIIIIZZ("config_center_repo");
        LJIIIZ(nanoTime, "config_center_repo");
        return new C792839g(LJIIIIZZ);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LIZJ() {
        long nanoTime = System.nanoTime();
        Keva repoSync = KevaImpl.getRepoSync("config_center_meta_repo", 1);
        LJIIIZ(nanoTime, "config_center_meta_repo");
        return new C792839g(repoSync);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LIZLLL() {
        long nanoTime = System.nanoTime();
        Keva repoSync = KevaImpl.getRepoSync("unregistered_config", 1);
        LJIIIZ(nanoTime, "unregistered_config");
        return new C792839g(repoSync);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LJ() {
        long nanoTime = System.nanoTime();
        Keva LJIIIIZZ = LJIIIIZZ("libra_config_center_repo");
        LJIIIZ(nanoTime, "libra_config_center_repo");
        C36732EbI.LIZLLL.getClass();
        C36732EbI.LIZJ = true;
        return new C792839g(LJIIIIZZ);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LJFF() {
        long nanoTime = System.nanoTime();
        Keva repoSync = KevaImpl.getRepoSync("launch_center_repo", 0);
        LJIIIZ(nanoTime, "launch_center_repo");
        return new C792839g(repoSync);
    }

    @Override // X.InterfaceC38722FHq
    public FHP LJI() {
        long nanoTime = System.nanoTime();
        Keva LJIIIIZZ = LJIIIIZZ("hybrid_config_center_repo");
        LJIIIZ(nanoTime, "hybrid_config_center_repo");
        return new C792839g(LJIIIIZZ);
    }

    public static Keva LJIIIIZZ(String str) {
        if (FHC.LIZIZ().LJ == 2) {
            return KevaMultiProcessCache.getRepoSync(str);
        }
        return KevaImpl.getRepoSync(str, 1);
    }

    @Override // X.InterfaceC38722FHq
    public void LJII(FI6 fi6) {
        ((CopyOnWriteArraySet) this.LIZ).add(fi6);
    }

    public static void LJIIIZ(long j, String str) {
        C38718FHm c38718FHm = new C38718FHm();
        c38718FHm.LIZIZ = "config_center_keva_init";
        c38718FHm.LIZ("cost", String.valueOf(System.nanoTime() - j));
        c38718FHm.LIZ("repo", str);
        C38719FHn.LIZIZ.onEvent(c38718FHm);
    }
}
