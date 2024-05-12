package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.0wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24000wu {
    public boolean LIZ = true;
    public String LIZIZ = "";
    public String LIZJ;
    public List<C24000wu> LIZLLL;

    public final String LIZ() {
        if (TextUtils.isEmpty(this.LIZJ)) {
            return V1M.LJJ(this.LIZIZ, new String[0]);
        }
        return V1M.LJJ(this.LIZIZ, this.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mIsValid=");
        LIZ.append(this.LIZ);
        LIZ.append(", mErrorMessage='");
        LIZ.append(LIZ());
        LIZ.append('\'');
        LIZ.append(", mChildElementValidity=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public final void LIZIZ(String str, String... strArr) {
        this.LIZIZ = str;
        if (strArr.length > 0) {
            this.LIZJ = strArr[0];
        }
    }
}
