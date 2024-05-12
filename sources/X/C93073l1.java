package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import kotlin.jvm.internal.o;

/* renamed from: X.3l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93073l1 {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public Range LIZLLL;

    public final int hashCode() {
        int i;
        int i2;
        String str = this.LIZIZ;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.LIZJ;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (((i4 + i2) * 31) + this.LIZ) * 31;
        Range range = this.LIZLLL;
        if (range != null) {
            i3 = range.hashCode();
        }
        return i5 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93073l1)) {
            return false;
        }
        C93073l1 c93073l1 = (C93073l1) obj;
        if (this.LIZ == c93073l1.LIZ && o.LJ(this.LIZJ, c93073l1.LIZJ) && o.LJ(this.LIZIZ, c93073l1.LIZIZ) && o.LJ(this.LIZLLL, c93073l1.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C93073l1(String str, String str2, int i) {
        this.LIZIZ = str2;
        this.LIZJ = str;
        this.LIZ = i;
    }
}
