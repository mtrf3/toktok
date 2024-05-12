package X;

import android.graphics.drawable.Drawable;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.7OR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OR implements C33Q {
    public final Drawable LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    public C7OR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7OR)) {
            return false;
        }
        C7OR c7or = (C7OR) obj;
        return o.LJ(this.LJLIL, c7or.LJLIL) && this.LJLILLLLZI == c7or.LJLILLLLZI && this.LJLJI == c7or.LJLJI && o.LJ(this.LJLJJI, c7or.LJLJJI) && this.LJLJJL == c7or.LJLJJL && this.LJLJJLL == c7or.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i = ((hashCode * 31) + this.LJLILLLLZI) * 31;
        boolean z = this.LJLJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((C79062V1e.LJ(this.LJLJJI, (i + i2) * 31, 31) + this.LJLJJL) * 31) + this.LJLJJLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCommentState(commentImageDrawable=");
        LIZ.append(this.LJLIL);
        LIZ.append(", commentGiftVisible=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", commentGiftAnimate=");
        LIZ.append(this.LJLJI);
        LIZ.append(", commentCountText=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", commentCountVisible=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", commentLayoutVisible=");
        return b0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C7OR(int i) {
        this(null, 8, false, "", 8, 0);
    }

    public static C7OR LIZ(C7OR c7or, Drawable drawable, String str, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = i;
        Drawable drawable2 = drawable;
        String commentCountText = str;
        if ((i2 & 1) != 0) {
            drawable2 = c7or.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = c7or.LJLILLLLZI;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            z = c7or.LJLJI;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            commentCountText = c7or.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            i5 = c7or.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            i4 = c7or.LJLJJLL;
        } else {
            i4 = 0;
        }
        c7or.getClass();
        o.LJIIIZ(commentCountText, "commentCountText");
        return new C7OR(drawable2, i3, z, commentCountText, i5, i4);
    }

    public C7OR(Drawable drawable, int i, boolean z, String commentCountText, int i2, int i3) {
        o.LJIIIZ(commentCountText, "commentCountText");
        this.LJLIL = drawable;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = commentCountText;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
    }
}
