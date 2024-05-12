package X;

import android.text.TextUtils;

/* renamed from: X.Ixa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48306Ixa implements Cloneable {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{r='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", a='");
        return C77800Ug8.LIZJ(LIZ, this.LJLILLLLZI, '\'', '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C48306Ixa)) {
            return false;
        }
        C48306Ixa c48306Ixa = (C48306Ixa) obj;
        if (TextUtils.equals(this.LJLILLLLZI, c48306Ixa.LJLILLLLZI) && TextUtils.equals(this.LJLIL, c48306Ixa.LJLIL)) {
            return true;
        }
        return false;
    }

    public C48306Ixa(String str, String str2) {
        if (TextUtils.isEmpty(str) || str.startsWith("https")) {
            this.LJLIL = str;
            if (TextUtils.isEmpty(str2) || str2.startsWith("https")) {
                this.LJLILLLLZI = str2;
                return;
            }
            throw new IllegalArgumentException("url protocol should be https");
        }
        throw new IllegalArgumentException("url protocol should be https");
    }
}
