package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import ujb.o;
import ujb.s;

/* renamed from: X.Eje, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37250Eje {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (o.LJJJLIIL(str, "http", false)) {
            return str;
        }
        if (LIZIZ(str)) {
            if (s.LJJJLZIJ(str, "://", false)) {
                return str;
            }
            return i0.LJFF("file://", str);
        }
        return "";
    }

    public static final boolean LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && (C1B6.LIZIZ(str) || C268613q.LJIIJJI(EF7.LIZIZ(), UriProtector.parse(str)))) {
            return true;
        }
        return false;
    }
}
