package X;

/* renamed from: X.OeV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62411OeV {
    public static final void LIZ(String str, Integer num, C8BR<?, ?> c8br, OSZ<Integer, String> osz) {
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = str;
        c62683Oit.LIZLLL = 1;
        if (num != null) {
            c62683Oit.LJ = num.intValue();
        }
        if (osz != null && osz.getFirst() != null) {
            c62683Oit.LJFF = osz.getFirst().intValue();
        }
        if (c8br != null) {
            c8br.LJIILL(c62683Oit.LIZ());
        }
    }
}
