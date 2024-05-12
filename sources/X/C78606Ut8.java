package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;

/* renamed from: X.Ut8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78606Ut8 {
    public static final C78606Ut8[] LJIIIIZZ = {new C78606Ut8(3, 5, 8, 8, 1, false), new C78606Ut8(5, 7, 10, 10, 1, false), new C78606Ut8(5, 7, 16, 6, 1, true), new C78606Ut8(8, 10, 12, 12, 1, false), new C78606Ut8(10, 11, 14, 6, 2, true), new C78606Ut8(12, 12, 14, 14, 1, false), new C78606Ut8(16, 14, 24, 10, 1, true), new C78606Ut8(18, 14, 16, 16, 1, false), new C78606Ut8(22, 18, 18, 18, 1, false), new C78606Ut8(22, 18, 16, 10, 2, true), new C78606Ut8(30, 20, 20, 20, 1, false), new C78606Ut8(32, 24, 16, 14, 2, true), new C78606Ut8(36, 24, 22, 22, 1, false), new C78606Ut8(44, 28, 24, 24, 1, false), new C78606Ut8(49, 28, 22, 14, 2, true), new C78606Ut8(62, 36, 14, 14, 4, false), new C78606Ut8(86, 42, 16, 16, 4, false), new C78606Ut8(114, 48, 18, 18, 4, false), new C78606Ut8(144, 56, 20, 20, 4, false), new C78606Ut8(174, 68, 22, 22, 4, false), new C78606Ut8(204, 84, 24, 24, 4, 102, 42, false), new C78606Ut8(280, 112, 14, 14, 16, UserLevelGeckoUpdateSetting.DEFAULT, 56, false), new C78606Ut8(368, 144, 16, 16, 16, 92, 36, false), new C78606Ut8(456, 192, 18, 18, 16, 114, 48, false), new C78606Ut8(576, 224, 20, 20, 16, 144, 56, false), new C78606Ut8(696, 272, 22, 22, 16, 174, 68, false), new C78606Ut8(816, 336, 24, 24, 16, 136, 56, false), new C78606Ut8(1050, 408, 18, 18, 36, 175, 68, false), new C78606Ut8(1304, 496, 20, 20, 36, 163, 62, false), new C78608UtA()};
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final int LIZIZ() {
        int i = this.LJFF;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    public int LIZJ() {
        return this.LIZIZ / this.LJI;
    }

    public final int LJ() {
        int i = this.LJFF;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int LIZLLL() {
        return (LIZIZ() * this.LIZLLL) + (LIZIZ() << 1);
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        if (this.LIZ) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        LIZ.append(str);
        LIZ.append(" data region ");
        LIZ.append(this.LIZLLL);
        LIZ.append('x');
        LIZ.append(this.LJ);
        LIZ.append(", symbol size ");
        LIZ.append(LIZLLL());
        LIZ.append('x');
        LIZ.append((LJ() * this.LJ) + (LJ() << 1));
        LIZ.append(", symbol data size ");
        LIZ.append(LIZIZ() * this.LIZLLL);
        LIZ.append('x');
        LIZ.append(LJ() * this.LJ);
        LIZ.append(", codewords ");
        LIZ.append(this.LIZIZ);
        LIZ.append('+');
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public int LIZ(int i) {
        return this.LJI;
    }

    public static C78606Ut8 LJFF(int i, EnumC46485IMf enumC46485IMf, C73952vH c73952vH, C73952vH c73952vH2) {
        C78606Ut8[] c78606Ut8Arr = LJIIIIZZ;
        int i2 = 0;
        do {
            C78606Ut8 c78606Ut8 = c78606Ut8Arr[i2];
            if ((enumC46485IMf != EnumC46485IMf.FORCE_SQUARE || !c78606Ut8.LIZ) && ((enumC46485IMf != EnumC46485IMf.FORCE_RECTANGLE || c78606Ut8.LIZ) && ((c73952vH == null || (c78606Ut8.LIZLLL() >= 0 && (c78606Ut8.LJ() * c78606Ut8.LJ) + (c78606Ut8.LJ() << 1) >= 0)) && ((c73952vH2 == null || (c78606Ut8.LIZLLL() <= 0 && (c78606Ut8.LJ() * c78606Ut8.LJ) + (c78606Ut8.LJ() << 1) <= 0)) && i <= c78606Ut8.LIZIZ)))) {
                return c78606Ut8;
            }
            i2++;
        } while (i2 < 30);
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    public C78606Ut8(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(i, i2, i3, i4, i5, i, i2, z);
    }

    public C78606Ut8(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
    }
}
