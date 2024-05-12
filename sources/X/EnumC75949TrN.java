package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.TrN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75949TrN {
    REQUEST(R.string.kkj, R.string.kki),
    ACCEPT(R.string.kkg, R.string.kkf);

    public final int LJLIL;
    public final int LJLILLLLZI;

    public static EnumC75949TrN valueOf(String str) {
        return (EnumC75949TrN) V0N.LJJJ(EnumC75949TrN.class, str);
    }

    public final int getContentResId() {
        return this.LJLILLLLZI;
    }

    public final int getTitleResId() {
        return this.LJLIL;
    }

    EnumC75949TrN(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
