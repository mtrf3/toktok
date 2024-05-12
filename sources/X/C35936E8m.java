package X;

import java.util.HashMap;

/* renamed from: X.E8m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35936E8m {
    public final java.util.Map<String, String> LIZ = new HashMap();

    public final void LIZ(int i, String str) {
        LIZLLL(str, String.valueOf(i));
    }

    public final void LIZIZ(long j, String str) {
        LIZLLL(str, String.valueOf(j));
    }

    public final void LIZJ(String str, String str2) {
        LIZLLL(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C35937E8n.LIZ(str2));
    }
}
