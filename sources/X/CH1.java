package X;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class CH1 extends C29401Dk {
    public final String LJLJLJ;
    public final String LJLJLLL;

    @Override // X.C29401Dk, X.C276516r, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" TYPE = CustomApiServerException, url = ");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", xTtLogId = ");
        LIZ.append(this.LJLJLLL);
        LIZ.append("  ");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public String getUrl() {
        return this.LJLJLJ;
    }

    public String getxTtLogId() {
        return this.LJLJLLL;
    }

    public CH1(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.LJLJLJ = "";
        } else {
            this.LJLJLJ = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJLJLLL = "";
        } else {
            this.LJLJLLL = str2;
        }
    }
}
