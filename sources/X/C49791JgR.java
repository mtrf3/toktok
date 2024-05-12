package X;

/* renamed from: X.JgR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49791JgR {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49792JgS.LJLIL);

    public static java.util.Map LIZJ() {
        return (java.util.Map) LIZ.getValue();
    }

    public static final void LIZ(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (LIZJ().get(Integer.valueOf(intValue)) != null) {
                LIZJ().put(Integer.valueOf(intValue), "");
            }
        }
    }

    public static final void LIZIZ(int i) {
        if (LIZJ().get(Integer.valueOf(i)) != null) {
            LIZJ().remove(Integer.valueOf(i));
        }
    }

    public static final void LIZLLL(Integer num, String str) {
        if (num != null) {
            int intValue = num.intValue();
            java.util.Map LIZJ = LIZJ();
            Integer valueOf = Integer.valueOf(intValue);
            if (str == null) {
                str = "";
            }
            LIZJ.put(valueOf, str);
        }
    }
}
