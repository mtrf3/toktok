package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HBh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43653HBh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(CreativeInfo creativeInfo) {
        String path = new File(LIZIZ(creativeInfo).getPath(), "audit.png").getPath();
        o.LJIIIIZZ(path, "File(dir, \"audit.png\").path");
        return path;
    }

    public static File LIZIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZJ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.NOWS, null, 12);
    }

    public static File LIZLLL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJII(creativeInfo, EnumC43652HBg.NOW_SHARE_CACHE, "", true);
    }

    public static String LIZJ(CreativeInfo creativeInfo, boolean z) {
        String str;
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (z) {
            str = "outer.jpg";
        } else {
            str = "inner.jpg";
        }
        String path = new File(LIZIZ(creativeInfo).getPath(), str).getPath();
        o.LJIIIIZZ(path, "File(dir, fileName).path");
        return path;
    }
}
