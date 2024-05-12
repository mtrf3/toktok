package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C03660Ck {
    public static HashMap LIZJ(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static String LIZ(ActivityC45651qj activityC45651qj, int i, String str) {
        String string = activityC45651qj.getResources().getString(i);
        o.LJIIIIZZ(string, str);
        return string;
    }

    public static String LIZIZ(String str, Object[] objArr, StringBuilder sb, String str2, StringBuilder sb2) {
        sb.append(BML.LIZ(str, objArr));
        sb.append(str2);
        return X1D.LIZIZ(sb2);
    }
}
