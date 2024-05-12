package X;

import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3L1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3L1 {
    public static C3L2 LIZ(int i, int i2, C63120Opw c63120Opw, int i3, long j) {
        int i4;
        long j2;
        C3L2 c3l2 = new C3L2(null, null);
        Resources resources = EF7.LIZIZ().getResources();
        c3l2.LJIIJJI(j);
        if (!C3U8.LIZJ() && C3U8.LIZ() && i3 == 0) {
            String string = resources.getString(R.string.i44);
            o.LJIIIIZZ(string, "resources.getString(R.st…settings_filtered_header)");
            c3l2.LLIIL = string;
            c3l2.LJLJJL = resources.getQuantityString(R.plurals.ix, i2, Integer.valueOf(i2));
        } else {
            String string2 = resources.getString(R.string.i3d);
            o.LJIIIIZZ(string2, "resources.getString(R.st…ng.message_request_inbox)");
            c3l2.LLIIL = string2;
            if (C4T4.LIZ() >= 1) {
                if (C72302sc.LIZIZ()) {
                    i4 = i;
                } else {
                    i4 = 0;
                }
                c3l2.LJLLILLLL = i4;
                if (i > 0) {
                    c3l2.LJLJJL = resources.getQuantityString(R.plurals.m, i, Integer.valueOf(i));
                } else {
                    c3l2.LJLJJL = resources.getQuantityString(R.plurals.m, i3, Integer.valueOf(i3));
                }
            } else {
                c3l2.LJLJJL = resources.getQuantityString(R.plurals.ix, i, Integer.valueOf(i));
            }
        }
        if (c63120Opw != null) {
            C3L5 LIZIZ = C82473Ln.LIZIZ(c63120Opw, null, false, 14);
            if (LIZIZ != null) {
                j2 = LIZIZ.LJLJL;
            } else if (c63120Opw != null) {
                j2 = c63120Opw.getUpdatedTime();
            }
            c3l2.LJIIJJI(j2);
            c3l2.LJLIL = c3l2.LJLJL;
            c3l2.LLIIJI = "";
            return c3l2;
        }
        C3LR.LIZ.getClass();
        j2 = C3LR.LIZ().LIZ.getLong("TIMESTAMP", 0L);
        c3l2.LJIIJJI(j2);
        c3l2.LJLIL = c3l2.LJLJL;
        c3l2.LLIIJI = "";
        return c3l2;
    }
}
