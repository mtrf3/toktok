package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dwm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35516Dwm {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35516Dwm)) {
            return false;
        }
        C35516Dwm c35516Dwm = (C35516Dwm) obj;
        return o.LJ(this.LIZ, c35516Dwm.LIZ) && o.LJ(this.LIZIZ, c35516Dwm.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C35516Dwm() {
        this("", "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UgcTemplateData(templateUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", templateMd5=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35516Dwm(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
