package X;

/* loaded from: classes14.dex */
public final class V84 {
    public static final C65767PrX<Integer> LIZ = C65767PrX.of((Object[]) new Integer[]{2, 7, 4, 5});

    public static int LIZ(V85 v85, W8X w8x) {
        w8x.LJIILIIL();
        int i = w8x.LJLJJL;
        C65767PrX<Integer> c65767PrX = LIZ;
        int indexOf = c65767PrX.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            int i2 = 0;
            if (v85.LIZ != -1) {
                i2 = v85.LIZ();
            }
            return c65767PrX.get(((i2 / 90) + indexOf) % c65767PrX.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int LIZIZ(V85 v85, W8X w8x) {
        int i;
        if (v85.LIZ == -2) {
            return 0;
        }
        w8x.LJIILIIL();
        int i2 = w8x.LJLJJI;
        if (i2 != 90 && i2 != 180 && i2 != 270) {
            i = 0;
        } else {
            w8x.LJIILIIL();
            i = w8x.LJLJJI;
        }
        if (v85.LIZ == -1) {
            return i;
        }
        return (v85.LIZ() + i) % 360;
    }

    public static int LIZJ(V85 v85, C79238V7y c79238V7y, W8X w8x, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || c79238V7y == null) {
            return 8;
        }
        int LIZIZ = LIZIZ(v85, w8x);
        C65767PrX<Integer> c65767PrX = LIZ;
        w8x.LJIILIIL();
        if (c65767PrX.contains(Integer.valueOf(w8x.LJLJJL))) {
            i = LIZ(v85, w8x);
        } else {
            i = 0;
        }
        if (LIZIZ == 90 || LIZIZ == 270 || i == 5 || i == 7) {
            w8x.LJIILIIL();
            i2 = w8x.LJLJL;
            w8x.LJIILIIL();
            i3 = w8x.LJLJJLL;
        } else {
            w8x.LJIILIIL();
            i2 = w8x.LJLJJLL;
            w8x.LJIILIIL();
            i3 = w8x.LJLJL;
        }
        float f = i2;
        float f2 = i3;
        float max = Math.max(c79238V7y.LIZ / f, c79238V7y.LIZIZ / f2);
        float f3 = f * max;
        float f4 = c79238V7y.LIZJ;
        if (f3 > f4) {
            max = f4 / f;
        }
        if (f2 * max > f4) {
            max = f4 / f2;
        }
        int i4 = (int) ((max * 8.0f) + c79238V7y.LIZLLL);
        if (i4 > 8) {
            return 8;
        }
        if (i4 < 1) {
            return 1;
        }
        return i4;
    }
}
