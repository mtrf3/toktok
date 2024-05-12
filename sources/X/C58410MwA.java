package X;

/* renamed from: X.MwA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58410MwA {
    public static final java.util.Map<Integer, String> LIZ = C113554cx.LJJL(new OSZ(0, "audio"), new OSZ(1, "enhance"), new OSZ(2, "enhance"), new OSZ(3, "props"), new OSZ(4, "props"));

    public static final String LIZ(int i) {
        String str = LIZ.get(Integer.valueOf(i));
        if (str == null) {
            return "audio";
        }
        return str;
    }
}
