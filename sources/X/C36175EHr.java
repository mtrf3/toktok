package X;

import android.text.TextUtils;

/* renamed from: X.EHr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36175EHr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Exception exc) {
        C198517qh c198517qh = new C198517qh();
        if (!TextUtils.isEmpty("error")) {
            c198517qh.LIZLLL("msg_type", "error");
        }
        c198517qh.LIZLLL("error_desc", android.util.Log.getStackTraceString(exc));
        if (!TextUtils.isEmpty(null)) {
            c198517qh.LIZLLL("tag", null);
        }
        if (!TextUtils.isEmpty(null)) {
            c198517qh.LIZLLL("channel_name", null);
        }
        if (!TextUtils.isEmpty(null)) {
            c198517qh.LIZLLL("module_name", null);
        }
        c198517qh.LIZ.isEmpty();
    }
}
