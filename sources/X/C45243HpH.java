package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HpH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C45243HpH {
    public static boolean LIZJ(View view, String str) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C85256Xd6.LIZIZ(context);
    }

    public static void LIZIZ(StringBuilder sb, String str, StringBuilder sb2) {
        sb.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(sb2));
    }

    public static HashMap LIZ(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }
}
