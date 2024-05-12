package X;

/* renamed from: X.Iy3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48335Iy3 {
    public static OSZ LIZIZ(String str) {
        C48338Iy6 c48338Iy6;
        C48334Iy2 c48334Iy2 = C48334Iy2.LJFF.get(str);
        if (c48334Iy2 != null && (c48338Iy6 = c48334Iy2.LIZJ) != null) {
            return new OSZ(Integer.valueOf((int) c48338Iy6.LIZ), Integer.valueOf((int) c48338Iy6.LIZJ));
        }
        return new OSZ(-1, -1);
    }

    public static void LIZ(String str, C48338Iy6 c48338Iy6, C48338Iy6 c48338Iy62) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("monitor change value => \nscene = ", str, "\napp memory change: ");
        C48339Iy7.LIZLLL(c48338Iy6.LIZ, c48338Iy62.LIZ, LIZIZ, " Mb, system memory change: ");
        C48339Iy7.LIZLLL(c48338Iy6.LIZIZ, c48338Iy62.LIZIZ, LIZIZ, " Mb, available memory change: ");
        LIZIZ.append(c48338Iy6.LIZJ - c48338Iy62.LIZJ);
        LIZIZ.append("Mb. ");
        X1D.LIZIZ(LIZIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('\n');
        LIZ.append("av-performance\n");
        H7B.LJ(X1D.LIZIZ(LIZ));
    }
}
