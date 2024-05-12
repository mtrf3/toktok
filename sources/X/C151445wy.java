package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.5wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151445wy {
    public static final /* synthetic */ int LIZ = 0;

    public static File LIZ(CreativeInfo creativeInfo, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIIIZ(creativeInfo, EnumC43649HBd.PHOTO_MODE, "edit_temp", z);
    }

    public static File LIZIZ(CreativeInfo creativeInfo, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIIIZ(creativeInfo, EnumC43649HBd.PHOTO_MODE, "origin", z);
    }
}
