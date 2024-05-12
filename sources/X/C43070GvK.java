package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.GvK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43070GvK {
    public static final java.util.Set<String> LIZ = new LinkedHashSet();

    public static final void LIZ(String folder) {
        o.LJIIIZ(folder, "folder");
        String LJIJJLI = C78966Uyw.LJIJJLI(folder);
        String absolutePath = C60903NvH.LJ.getFilesDir().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getApplication().filesDir.absolutePath");
        if (o.LJ(LJIJJLI, C78966Uyw.LJIJJLI(absolutePath)) || o.LJ(LJIJJLI, C60903NvH.LJIIJJI().LJJIJL().getPathService().getCreativeRoot()) || o.LJ(LJIJJLI, C60903NvH.LJIIJJI().LJJIJL().getPathService().getPersistentRoot()) || o.LJ(LJIJJLI, C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILIIL()) || o.LJ(LJIJJLI, C60903NvH.LJIIJJI().LJJIJL().getPathService().getRoot())) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(LIZ);
        C44687HgJ.LJIILLIIL(folder, new C43071GvL(linkedHashSet));
    }
}
