package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.5oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145995oB {
    public final java.util.Map<String, String> LIZ = new HashMap();

    public static C145995oB LJII() {
        return new C145995oB();
    }

    public final void LJFF(java.util.Map map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final void LIZ(int i, String str) {
        LJI(str, String.valueOf(i));
    }

    public final void LIZIZ(long j, String str) {
        LJI(str, String.valueOf(j));
    }

    public final void LIZJ(Object obj, String str) {
        if (obj != null) {
            LIZLLL(str, GsonProtectorUtils.toJson(new Gson(), obj));
        }
    }

    public final void LIZLLL(String str, String str2) {
        LJI(str, str2);
    }

    public final void LJ(String str, boolean z) {
        LJI(str, String.valueOf(z));
    }

    public final void LJI(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C146005oC.LIZ(str2));
    }
}
