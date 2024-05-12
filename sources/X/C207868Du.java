package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207868Du {
    public final int LIZ;
    public final int LIZIZ;
    public final Intent LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207868Du)) {
            return false;
        }
        C207868Du c207868Du = (C207868Du) obj;
        return this.LIZ == c207868Du.LIZ && this.LIZIZ == c207868Du.LIZIZ && o.LJ(this.LIZJ, c207868Du.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Intent intent = this.LIZJ;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarUploadData(requestCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", resultCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C207868Du(int i, int i2, Intent intent) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = intent;
    }
}
