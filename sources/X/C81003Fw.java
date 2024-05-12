package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81003Fw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List secUidList) {
        o.LJIIIZ(secUidList, "secUidList");
        if (C79004UzY.LJJIFFI(secUidList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = secUidList.iterator();
        while (it.hasNext()) {
            C1DI.LIZIZ(sb, "\"", (String) it.next(), "\",");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "secUidsBuilder.toString()");
        if (TextUtils.isEmpty(sb2)) {
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('[');
        String substring = sb2.substring(0, s.LJJLIIJ(sb2, ",", 6));
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring);
        LIZ2.append(']');
        return X1D.LIZIZ(LIZ2);
    }
}
