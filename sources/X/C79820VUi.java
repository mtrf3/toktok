package X;

import android.text.TextUtils;

/* renamed from: X.VUi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79820VUi {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZ << (this.LIZIZ + 16);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79820VUi)) {
            return false;
        }
        C79820VUi c79820VUi = (C79820VUi) obj;
        if (c79820VUi.LIZ != this.LIZ || c79820VUi.LIZIZ != this.LIZIZ || !TextUtils.equals(c79820VUi.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    public C79820VUi(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
