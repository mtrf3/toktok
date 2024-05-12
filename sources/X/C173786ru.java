package X;

import Y.ACallableS1S1000000_2;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173786ru {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        File file = new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIL());
        if (!file.exists()) {
            file.mkdirs();
        }
        String path = file.getPath();
        o.LJIIIIZZ(path, "dir.path");
        return path;
    }

    public static String LIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJIL(creativeInfo);
    }

    public static String LIZJ(String id) {
        o.LJIIIZ(id, "id");
        String path = new File(LIZIZ(), i0.LJFF(id, "_watermark.png")).getPath();
        o.LJIIIIZZ(path, "File(getWatermarkDirPath… + \"_watermark.png\").path");
        return path;
    }

    public static final void LIZLLL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LIZ2 = LIZ(creativeInfo);
        if (TextUtils.isEmpty(LIZ2)) {
            return;
        }
        C10K.LIZIZ(new ACallableS1S1000000_2(LIZ2, 0), C10K.LJI, null);
    }
}
