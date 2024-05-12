package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.8JX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JX implements C33Q {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public C8JX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8JX)) {
            return false;
        }
        C8JX c8jx = (C8JX) obj;
        return this.LJLIL == c8jx.LJLIL && o.LJ(this.LJLILLLLZI, c8jx.LJLILLLLZI) && o.LJ(this.LJLJI, c8jx.LJLJI) && this.LJLJJI == c8jx.LJLJJI && this.LJLJJL == c8jx.LJLJJL;
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJLJJI) * 31) + this.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotosensitiveVideoMaskState(contentVisible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", titleText=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", contentText=");
        LIZ.append(this.LJLJI);
        LIZ.append(", positiveButtonVisible=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", negativeButtonVisible=");
        return b0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C8JX(int i) {
        this(8, null, null, 8, 8);
    }

    public C8JX(int i, String str, String str2, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }
}
