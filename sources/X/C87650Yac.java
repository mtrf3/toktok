package X;

/* renamed from: X.Yac, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C87650Yac implements Cloneable {
    public final float LJLIL;
    public final EnumC87634YaM LJLILLLLZI;

    public final boolean LJFF() {
        if (this.LJLIL < 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (this.LJLIL == 0.0f) {
            return true;
        }
        return false;
    }

    public C87650Yac() {
        this.LJLIL = 0.0f;
        this.LJLILLLLZI = EnumC87634YaM.px;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(this.LJLIL));
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final float LIZIZ(C87697YbN c87697YbN) {
        float f;
        if (this.LJLILLLLZI == EnumC87634YaM.percent) {
            YLD yld = c87697YbN.LJ;
            VU6 vu6 = yld.LJI;
            if (vu6 != null || (vu6 = yld.LJFF) != null) {
                float f2 = vu6.LIZJ;
                if (f2 == vu6.LIZLLL) {
                    f = this.LJLIL;
                } else {
                    f2 = (float) (Math.sqrt((r1 * r1) + (f2 * f2)) / 1.414213562373095d);
                    f = this.LJLIL;
                }
                return (f * f2) / 100.0f;
            }
            return this.LJLIL;
        }
        return LIZLLL(c87697YbN);
    }

    public final float LIZJ(C87697YbN c87697YbN) {
        if (this.LJLILLLLZI == EnumC87634YaM.percent) {
            return (this.LJLIL * 1.0f) / 100.0f;
        }
        return LIZLLL(c87697YbN);
    }

    public final float LIZLLL(C87697YbN c87697YbN) {
        switch (this.LJLILLLLZI.ordinal()) {
            case 1:
            case 9:
            case 10:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLIL);
                LIZ.append(this.LJLILLLLZI.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                float f = c87697YbN.LIZIZ;
                return VPR.LIZJ(LIZIZ, f, f);
            case 2:
                return (c87697YbN.LIZIZ / 2.0f) * this.LJLIL;
            case 3:
                float f2 = this.LJLIL;
                c87697YbN.getClass();
                return f2 * 96.0f;
            case 4:
                float f3 = this.LJLIL;
                c87697YbN.getClass();
                return (f3 * 96.0f) / 2.54f;
            case 5:
                float f4 = this.LJLIL;
                c87697YbN.getClass();
                return (f4 * 96.0f) / 25.4f;
            case 6:
                float f5 = this.LJLIL;
                c87697YbN.getClass();
                return (f5 * 96.0f) / 72.0f;
            case 7:
                float f6 = this.LJLIL;
                c87697YbN.getClass();
                return (f6 * 96.0f) / 6.0f;
            case 8:
                YLD yld = c87697YbN.LJ;
                VU6 vu6 = yld.LJI;
                if (vu6 != null || (vu6 = yld.LJFF) != null) {
                    return (this.LJLIL * vu6.LIZJ) / 100.0f;
                }
                return this.LJLIL;
            default:
                return this.LJLIL;
        }
    }

    public final float LJ(C87697YbN c87697YbN) {
        if (this.LJLILLLLZI == EnumC87634YaM.percent) {
            YLD yld = c87697YbN.LJ;
            VU6 vu6 = yld.LJI;
            if (vu6 != null || (vu6 = yld.LJFF) != null) {
                return (this.LJLIL * vu6.LIZLLL) / 100.0f;
            }
            return this.LJLIL;
        }
        return LIZLLL(c87697YbN);
    }

    public C87650Yac(float f, EnumC87634YaM enumC87634YaM) {
        this.LJLIL = f;
        this.LJLILLLLZI = enumC87634YaM;
    }

    public final float LIZ(float f, float f2) {
        switch (this.LJLILLLLZI.ordinal()) {
            case 1:
            case 9:
            case 10:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLIL);
                LIZ.append(this.LJLILLLLZI.toString());
                return VPR.LIZJ(X1D.LIZIZ(LIZ), f, f2);
            case 2:
            case 8:
            default:
                return this.LJLIL;
            case 3:
                return this.LJLIL * 96.0f;
            case 4:
                return (this.LJLIL * 96.0f) / 2.54f;
            case 5:
                return (this.LJLIL * 96.0f) / 25.4f;
            case 6:
                return (this.LJLIL * 96.0f) / 72.0f;
            case 7:
                return (this.LJLIL * 96.0f) / 6.0f;
        }
    }
}
