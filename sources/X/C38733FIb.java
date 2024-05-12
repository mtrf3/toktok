package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.FIb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38733FIb {
    public static File LIZ;

    public static File LIZ(Context context) {
        C56672Kh.LIZ().LIZLLL("kevabaksp_getFile_dir");
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_getFile_dir");
        C56672Kh.LIZ().LIZLLL("kevabaksp_getFile_file");
        LIZ = new File(LLIIJLIL, "keva_bak_sp_record");
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_getFile_file");
        C56672Kh.LIZ().LIZLLL("kevabaksp_getFile_exit");
        boolean exists = LLIIJLIL.exists();
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_getFile_exit");
        C56672Kh.LIZ().LIZLLL("kevabaksp_getFile_mkdir");
        if (exists) {
            LLIIJLIL.mkdir();
        }
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_getFile_mkdir");
        File file = LIZ;
        o.LJII(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }
}
