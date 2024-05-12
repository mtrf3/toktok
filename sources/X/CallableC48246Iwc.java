package X;

import com.bytedance.keva.Keva;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48246Iwc<V> implements Callable {
    public static final CallableC48246Iwc<V> LJLIL = new CallableC48246Iwc<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        File[] listFiles;
        String LIZIZ = C48247Iwd.LIZIZ();
        if (LIZIZ != null && (listFiles = new File(LIZIZ).listFiles()) != null) {
            for (File file : listFiles) {
                if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                    C16880lQ.LLLZZIL(file);
                }
            }
            Keva repo = Keva.getRepo("push_video_preload");
            o.LJIIIIZZ(repo, "getRepo(\"push_video_preload\")");
            repo.storeInt("preload_video_count", 0);
        }
        return C76800UCe.LIZ;
    }
}
