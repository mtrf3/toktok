package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9BX, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BX implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C9BH LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final EnumC232679Bf LJLJJL;

    public C9BX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9BX)) {
            return false;
        }
        C9BX c9bx = (C9BX) obj;
        return o.LJ(this.LJLIL, c9bx.LJLIL) && o.LJ(this.LJLILLLLZI, c9bx.LJLILLLLZI) && this.LJLJI == c9bx.LJLJI && o.LJ(this.LJLJJI, c9bx.LJLJJI) && this.LJLJJL == c9bx.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProgressDragHintState(captionUpdateEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentCaptionInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", captionLoaded=");
        LIZ.append(this.LJLJI);
        LIZ.append(", awemeId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", captionSource=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        C43I<C76800UCe> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        C9BH c9bh = this.LJLILLLLZI;
        if (c9bh != null) {
            i = c9bh.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LJLJI;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return this.LJLJJL.hashCode() + C79062V1e.LJ(this.LJLJJI, (i3 + i4) * 31, 31);
    }

    public /* synthetic */ C9BX(int i) {
        this(null, null, false, "", EnumC232679Bf.NONE);
    }

    public C9BX(C43I<C76800UCe> c43i, C9BH c9bh, boolean z, String awemeId, EnumC232679Bf captionSource) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(captionSource, "captionSource");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c9bh;
        this.LJLJI = z;
        this.LJLJJI = awemeId;
        this.LJLJJL = captionSource;
    }

    public static C9BX LIZ(C9BX c9bx, C9BH c9bh, boolean z, EnumC232679Bf enumC232679Bf, int i) {
        C43I<C76800UCe> c43i;
        EnumC232679Bf captionSource = enumC232679Bf;
        C9BH c9bh2 = c9bh;
        boolean z2 = z;
        String awemeId = null;
        if ((i & 1) != 0) {
            c43i = c9bx.LJLIL;
        } else {
            c43i = null;
        }
        if ((i & 2) != 0) {
            c9bh2 = c9bx.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c9bx.LJLJI;
        }
        if ((i & 8) != 0) {
            awemeId = c9bx.LJLJJI;
        }
        if ((i & 16) != 0) {
            captionSource = c9bx.LJLJJL;
        }
        c9bx.getClass();
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(captionSource, "captionSource");
        return new C9BX(c43i, c9bh2, z2, awemeId, captionSource);
    }
}
