package X;

/* renamed from: X.ONe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61798ONe {
    public static final C5H3<C61798ONe> LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C61817ONx.LJLIL);
    public final C0M6<String, C61815ONv> LIZ = new C0M6<>(100);
    public final C0M6<String, C61811ONr> LIZIZ = new C0M6<>(100);
    public final C0M6<String, OMH> LIZJ = new C0M6<>(100);

    public final C61811ONr LIZ(String str) {
        C0M6<String, C61811ONr> c0m6;
        if (str == null || (c0m6 = this.LIZIZ) == null) {
            return null;
        }
        return c0m6.LIZIZ(str);
    }

    public final C61815ONv LIZIZ(String str) {
        C0M6<String, C61815ONv> c0m6 = this.LIZ;
        if (c0m6 != null) {
            return c0m6.LIZIZ(str);
        }
        return null;
    }

    public final boolean LIZJ(int i, String str) {
        C0M6<String, OMH> c0m6;
        OMH LIZIZ;
        if (str == null || (c0m6 = this.LIZJ) == null || (LIZIZ = c0m6.LIZIZ(str)) == null || LIZIZ.LJLIL != i) {
            return false;
        }
        return LIZIZ.LJLILLLLZI;
    }

    public final void LIZLLL(String str, C61811ONr c61811ONr) {
        C0M6<String, C61811ONr> c0m6;
        if (str != null && (c0m6 = this.LIZIZ) != null) {
            c0m6.LIZJ(str, c61811ONr);
        }
    }

    public final void LJ(String str, C61815ONv c61815ONv) {
        C0M6<String, C61815ONv> c0m6;
        if (str != null && (c0m6 = this.LIZ) != null) {
            c0m6.LIZJ(str, c61815ONv);
        }
    }

    public final void LJFF(String str, OMH omh) {
        C0M6<String, OMH> c0m6;
        if (str != null && (c0m6 = this.LIZJ) != null) {
            c0m6.LIZJ(str, omh);
        }
    }
}
