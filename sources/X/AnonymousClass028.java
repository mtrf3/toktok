package X;

import android.content.IntentFilter;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.028, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class AnonymousClass028 {
    public static IntentFilter LIZ(String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        return intentFilter;
    }

    public static Throwable LJFF(Throwable th) {
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        return C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public static boolean LJI(AndroidRuntimeException androidRuntimeException, String str) {
        TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, str);
        return TTLSBuildConfig.canThrowException();
    }

    public static Object LIZIZ(ArrayList arrayList, int i, ArrayList arrayList2) {
        return ListProtector.get(arrayList2, arrayList.size() - i);
    }

    public static String LIZJ(String str, String str2, String str3) {
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, str);
        String lowerCase = str2.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, str3);
        return lowerCase;
    }

    public static String LIZLLL(StringBuilder sb, String str, Class cls, StringBuilder sb2) {
        sb.append(str);
        sb.append(cls.getName());
        return X1D.LIZIZ(sb2);
    }

    public static StringBuilder LJ(String str, String str2, String str3, int i, String str4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        LIZ.append(i);
        LIZ.append(str4);
        return LIZ;
    }
}
