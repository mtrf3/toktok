package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hwk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45706Hwk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(long j, boolean z) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", C44847Hit.LIZ(j));
        c6bk.LIZ.put("is_from_editor_pro", Integer.valueOf(z ? 1 : 0));
        JSONObject LJ = c6bk.LJ();
        o.LJIIIIZZ(LJ, "newBuilder()\n           …\n                .build()");
        C43882HKc.LIZ.LJIILIIL("library_resource_download_takes_time", LJ, null);
    }

    public static void LIZIZ(String str, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C6BK c6bk = new C6BK();
        if (str == null) {
            str = "";
        }
        c6bk.LIZ.put("url", str);
        c6bk.LIZ.put("is_from_editor_pro", Integer.valueOf(z2 ? 1 : 0));
        C43882HKc.LIZLLL(i, "library_download_error_rate", c6bk.LJ(), true);
    }

    public static void LIZ(Integer num, String str, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("search_text", str);
        c6bk.LIZ.put("response_material_count", num);
        c6bk.LIZ.put("is_from_editor_pro", Integer.valueOf(z2 ? 1 : 0));
        C43882HKc.LIZLLL(i, "library_list_load_failure_rate", c6bk.LJ(), true);
    }
}
