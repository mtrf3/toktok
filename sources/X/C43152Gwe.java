package X;

import com.bytedance.keva.Keva;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43152Gwe {
    public static final boolean LIZ = InterfaceC44948HkW.LJI.isOpenTaskDegradationOpti();
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("av_effect_storage");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
    }

    public static void LIZ() {
        String LJJIJ;
        String LJJLIIIIJ;
        String LJI;
        long j;
        long j2;
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZIZ()) {
            return;
        }
        LJJIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJ("");
        File file = new File(LJJIJ);
        LJJLIIIIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIIJ("");
        File file2 = new File(LJJLIIIIJ);
        LJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJI("");
        File file3 = new File(LJI);
        long j3 = 0;
        if (file.exists()) {
            j = C38891fp.LJIL(file.getAbsolutePath());
        } else {
            j = 0;
        }
        if (file2.exists()) {
            j2 = C38891fp.LJIL(file2.getAbsolutePath());
        } else {
            j2 = 0;
        }
        if (file3.exists()) {
            j3 = C38891fp.LJIL(file3.getAbsolutePath());
        }
        C145995oB LIZ2 = UFE.LIZ(j, "effect_size");
        LIZ2.LIZIZ(j2, "filter_size");
        LIZ2.LIZIZ(j3, "mv_size");
        LIZ2.LIZIZ(j + j2 + j3, "storage_size");
        GXR.LIZ("tool_performance_effect_storage_space", LIZ2.LIZ);
    }
}
