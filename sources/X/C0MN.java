package X;

import android.R;

/* renamed from: X.0MN, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0MN {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    public final int LJLIL;
    public final int LJLILLLLZI;

    public static C0MN valueOf(String str) {
        return (C0MN) V0N.LJJJ(C0MN.class, str);
    }

    public final int getTitleResource() {
        int i = C0MM.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return R.string.selectAll;
                    }
                    throw new C162476Zf();
                }
                return R.string.cut;
            }
            return R.string.paste;
        }
        return R.string.copy;
    }

    public final int getId() {
        return this.LJLIL;
    }

    public final int getOrder() {
        return this.LJLILLLLZI;
    }

    C0MN(int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = i;
    }
}
