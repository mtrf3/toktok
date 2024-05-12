package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.391, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class AnonymousClass391 {
    public static int LIZ(double d) {
        return O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(d)));
    }

    public static Integer LIZJ(int i) {
        return Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))));
    }

    public static Integer LIZLLL(String str, int i) {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ(str, i));
    }

    public static ArrayList LJ(List list, String str) {
        o.LJIIIZ(list, str);
        return new ArrayList();
    }

    public static int LIZIZ(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static void LJFF(HashMap hashMap, String str, String str2, long j, String str3) {
        hashMap.put(str, str2);
        hashMap.put(str3, String.valueOf(j));
    }
}
