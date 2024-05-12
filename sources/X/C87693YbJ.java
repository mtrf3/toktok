package X;

import java.util.Locale;

/* renamed from: X.YbJ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C87693YbJ {
    public final String LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final C87694YbK LIZLLL = new C87694YbK();

    public static boolean LJFF(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final int LIZ() {
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.LIZIZ = i3;
        if (i3 >= i2) {
            return -1;
        }
        return this.LIZ.charAt(i3);
    }

    public final boolean LJ() {
        if (this.LIZIZ == this.LIZJ) {
            return true;
        }
        return false;
    }

    public final float LJI() {
        float LIZ = this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ, this.LIZ);
        if (!Float.isNaN(LIZ)) {
            this.LIZIZ = this.LIZLLL.LIZ;
        }
        return LIZ;
    }

    public final void LJIIJJI() {
        while (true) {
            int i = this.LIZIZ;
            if (i >= this.LIZJ || !LJFF(this.LIZ.charAt(i))) {
                return;
            } else {
                this.LIZIZ++;
            }
        }
    }

    public final C87650Yac LJII() {
        float LJI = LJI();
        EnumC87634YaM enumC87634YaM = null;
        if (Float.isNaN(LJI)) {
            return null;
        }
        if (!LJ()) {
            if (this.LIZ.charAt(this.LIZIZ) == '%') {
                this.LIZIZ++;
                enumC87634YaM = EnumC87634YaM.percent;
            } else {
                int i = this.LIZIZ;
                int i2 = this.LIZJ;
                if (i <= i2 - 2) {
                    if (i <= i2 - 3) {
                        try {
                            String substring = this.LIZ.substring(i, i + 3);
                            if ("rem".equals(substring)) {
                                this.LIZIZ += 3;
                                enumC87634YaM = EnumC87634YaM.rem;
                            } else if ("rpx".equals(substring)) {
                                this.LIZIZ += 3;
                                enumC87634YaM = EnumC87634YaM.rpx;
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    String str = this.LIZ;
                    int i3 = this.LIZIZ;
                    EnumC87634YaM valueOf = EnumC87634YaM.valueOf(str.substring(i3, i3 + 2).toLowerCase(Locale.US));
                    this.LIZIZ += 2;
                    enumC87634YaM = valueOf;
                }
            }
            if (enumC87634YaM != null) {
                return new C87650Yac(LJI, enumC87634YaM);
            }
        }
        return new C87650Yac(LJI, EnumC87634YaM.px);
    }

    public final String LJIIIIZZ() {
        if (!LJ()) {
            char charAt = this.LIZ.charAt(this.LIZIZ);
            if (!LJFF(charAt) && charAt != ' ') {
                int i = this.LIZIZ;
                int LIZ = LIZ();
                while (LIZ != -1 && LIZ != 32 && !LJFF(LIZ)) {
                    LIZ = LIZ();
                }
                return this.LIZ.substring(i, this.LIZIZ);
            }
        }
        return null;
    }

    public final float LJIIIZ() {
        LJIIJ();
        float LIZ = this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ, this.LIZ);
        if (!Float.isNaN(LIZ)) {
            this.LIZIZ = this.LIZLLL.LIZ;
        }
        return LIZ;
    }

    public final void LJIIJ() {
        LJIIJJI();
        int i = this.LIZIZ;
        if (i == this.LIZJ || this.LIZ.charAt(i) != ',') {
            return;
        }
        this.LIZIZ++;
        LJIIJJI();
    }

    public C87693YbJ(String str) {
        String trim = str.trim();
        this.LIZ = trim;
        this.LIZJ = trim.length();
    }

    public final Boolean LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        LJIIJ();
        int i = this.LIZIZ;
        if (i == this.LIZJ) {
            return null;
        }
        char charAt = this.LIZ.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z = true;
        this.LIZIZ++;
        if (charAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final float LIZJ(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        LJIIJ();
        return LJI();
    }

    public final boolean LIZLLL(char c) {
        int i = this.LIZIZ;
        if (i < this.LIZJ && this.LIZ.charAt(i) == c) {
            this.LIZIZ++;
            return true;
        }
        return false;
    }
}
