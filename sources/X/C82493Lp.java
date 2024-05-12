package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.3Lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82493Lp extends AbstractC82843My {
    public final int LJLIL;
    public final int LJLILLLLZI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82493Lp() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82493Lp.<init>():void");
    }

    public static /* synthetic */ C82493Lp copy$default(C82493Lp c82493Lp, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c82493Lp.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = c82493Lp.getBackground();
        }
        return c82493Lp.copy(i, i2);
    }

    public final int component2() {
        return getBackground();
    }

    public final C82493Lp copy(int i, int i2) {
        return new C82493Lp(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82493Lp)) {
            return false;
        }
        C82493Lp c82493Lp = (C82493Lp) obj;
        return this.LJLIL == c82493Lp.LJLIL && getBackground() == c82493Lp.getBackground();
    }

    public int hashCode() {
        return getBackground() + (this.LJLIL * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionUnreadViewNumState(num=");
        LIZ.append(this.LJLIL);
        LIZ.append(", background=");
        LIZ.append(getBackground());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC82843My
    public int getBackground() {
        return this.LJLILLLLZI;
    }

    public final int getNum() {
        return this.LJLIL;
    }

    public C82493Lp(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    public /* synthetic */ C82493Lp(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? R.attr.eb : i2);
    }
}
