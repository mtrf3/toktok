package X;

import java.util.LinkedHashMap;

/* renamed from: X.13c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C267213c implements Comparable<C267213c> {
    public int LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLIL = 1.0f;
    public float LJLJLJ = 1.0f;
    public float LJLJLLL = 1.0f;
    public float LJLL = Float.NaN;
    public float LJLLI = Float.NaN;
    public float LJLLLL = Float.NaN;
    public float LJLLLLLL = Float.NaN;
    public final LinkedHashMap<String, C019405u> LJLZ = new LinkedHashMap<>();

    @Override // java.lang.Comparable
    public final int compareTo(C267213c c267213c) {
        c267213c.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public static boolean LIZLLL(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                return false;
            }
            return true;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r8, java.util.HashMap r9) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267213c.LIZJ(int, java.util.HashMap):void");
    }

    public final void LJ(C018205i c018205i, AnonymousClass064 anonymousClass064, int i) {
        float f;
        c018205i.getX();
        c018205i.getY();
        c018205i.getWidth();
        c018205i.getHeight();
        C019905z LJIILL = anonymousClass064.LJIILL(i);
        AnonymousClass062 anonymousClass062 = LJIILL.LIZIZ;
        int i2 = anonymousClass062.LIZJ;
        this.LJLILLLLZI = i2;
        int i3 = anonymousClass062.LIZIZ;
        this.LJLJI = i3;
        if (i3 != 0 && i2 == 0) {
            f = 0.0f;
        } else {
            f = anonymousClass062.LIZLLL;
        }
        this.LJLIL = f;
        AnonymousClass063 anonymousClass063 = LJIILL.LJ;
        this.LJLJJI = anonymousClass063.LJIIL;
        this.LJLJJL = anonymousClass063.LIZIZ;
        this.LJLJJLL = anonymousClass063.LIZJ;
        this.LJLJL = anonymousClass063.LIZLLL;
        this.LJLJLJ = anonymousClass063.LJ;
        this.LJLJLLL = anonymousClass063.LJFF;
        this.LJLL = anonymousClass063.LJI;
        this.LJLLI = anonymousClass063.LJII;
        this.LJLLILLLL = anonymousClass063.LJIIIIZZ;
        this.LJLLJ = anonymousClass063.LJIIIZ;
        this.LJLLL = anonymousClass063.LJIIJ;
        C11Y.LIZJ(LJIILL.LIZJ.LIZJ);
        this.LJLLLL = LJIILL.LIZJ.LJI;
        this.LJLLLLLL = LJIILL.LIZIZ.LJ;
        for (String str : LJIILL.LJFF.keySet()) {
            C019405u c019405u = LJIILL.LJFF.get(str);
            if (c019405u.LIZIZ != EnumC019305t.STRING_TYPE) {
                this.LJLZ.put(str, c019405u);
            }
        }
    }
}
