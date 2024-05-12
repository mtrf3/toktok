package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import java.io.File;
import org.json.JSONArray;

/* renamed from: X.PKd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64267PKd {
    public final Context LIZ;
    public final String LJII;
    public final int LJ = PJA.LJIIIIZZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "custom_event_settings", "fd_track", "track_water_line");
    public final int LIZLLL = PJA.LJIIIIZZ(1000, "custom_event_settings", "fd_track", "track_dump_line");
    public final int LJFF = PJA.LJIIIIZZ(60000, "custom_event_settings", "fd_track", "track_sleep_time");
    public final int LJIIIIZZ = PJA.LJIIIIZZ(10, "custom_event_settings", "fd_track", "backtrace_limit");
    public final String LJI = "all";
    public int LIZIZ = 0;
    public boolean LIZJ = false;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6 A[Catch: all -> 0x01b3, IOException -> 0x01be, TryCatch #6 {IOException -> 0x01be, all -> 0x01b3, blocks: (B:8:0x002c, B:10:0x0033, B:11:0x003b, B:13:0x0045, B:16:0x004c, B:18:0x0056, B:19:0x0065, B:21:0x0068, B:25:0x0072, B:26:0x007e, B:28:0x008f, B:29:0x0099, B:31:0x00a1, B:40:0x00ec, B:42:0x00f6, B:43:0x00f8, B:45:0x00fe, B:47:0x010a, B:49:0x0117, B:86:0x00dc, B:23:0x00b8), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.io.File r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64267PKd.LIZIZ(java.io.File):int");
    }

    public C64267PKd(Context context, File file) {
        this.LJII = file.getAbsolutePath();
        this.LIZ = context;
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static int LIZ(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
