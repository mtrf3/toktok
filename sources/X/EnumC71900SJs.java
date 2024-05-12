package X;

/* renamed from: X.SJs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71900SJs {
    LINEAR(0.0f, 1.0f),
    EASE_IN(0.42f, 1.0f),
    EASE_OUT(0.0f, 0.58f),
    EASE_IN_OUT(0.42f, 0.58f);

    public final float LJLIL;
    public final float LJLJI;
    public final float LJLILLLLZI = 0.0f;
    public final float LJLJJI = 1.0f;

    public static EnumC71900SJs valueOf(String str) {
        return (EnumC71900SJs) V0N.LJJJ(EnumC71900SJs.class, str);
    }

    public final float getX0() {
        return this.LJLIL;
    }

    public final float getX1() {
        return this.LJLJI;
    }

    public final float getY0() {
        return this.LJLILLLLZI;
    }

    public final float getY1() {
        return this.LJLJJI;
    }

    EnumC71900SJs(float f, float f2) {
        this.LJLIL = f;
        this.LJLJI = f2;
    }
}
