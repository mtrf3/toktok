package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5an, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137695an {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137695an)) {
            return false;
        }
        C137695an c137695an = (C137695an) obj;
        return o.LJ(this.LIZ, c137695an.LIZ) && o.LJ(this.LIZIZ, c137695an.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextSpeakerModel(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", speaker=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C137695an(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
