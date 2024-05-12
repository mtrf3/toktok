package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.7y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203127y8 implements C33Q {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final Boolean LJLJJLL;
    public final boolean LJLJL;
    public final C43I<C76800UCe> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final boolean LJLL;
    public final int LJLLI;
    public final C43I<C76800UCe> LJLLILLLL;
    public final C43I<C76800UCe> LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;

    public C203127y8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C203127y8)) {
            return false;
        }
        C203127y8 c203127y8 = (C203127y8) obj;
        return this.LJLIL == c203127y8.LJLIL && this.LJLILLLLZI == c203127y8.LJLILLLLZI && this.LJLJI == c203127y8.LJLJI && this.LJLJJI == c203127y8.LJLJJI && this.LJLJJL == c203127y8.LJLJJL && o.LJ(this.LJLJJLL, c203127y8.LJLJJLL) && this.LJLJL == c203127y8.LJLJL && o.LJ(this.LJLJLJ, c203127y8.LJLJLJ) && o.LJ(this.LJLJLLL, c203127y8.LJLJLLL) && this.LJLL == c203127y8.LJLL && this.LJLLI == c203127y8.LJLLI && o.LJ(this.LJLLILLLL, c203127y8.LJLLILLLL) && o.LJ(this.LJLLJ, c203127y8.LJLLJ) && this.LJLLL == c203127y8.LJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LJLIL * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.LJLJI;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJLJJI;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z4 = this.LJLJJL;
        int i8 = z4;
        if (z4 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        Boolean bool = this.LJLJJLL;
        int hashCode = (i9 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z5 = this.LJLJL;
        int i10 = z5;
        if (z5 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        C43I<C76800UCe> c43i = this.LJLJLJ;
        int hashCode2 = (i11 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJLLL;
        int hashCode3 = (hashCode2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        boolean z6 = this.LJLL;
        int i12 = z6;
        if (z6 != 0) {
            i12 = 1;
        }
        int i13 = (((hashCode3 + i12) * 31) + this.LJLLI) * 31;
        C43I<C76800UCe> c43i3 = this.LJLLILLLL;
        int hashCode4 = (i13 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C76800UCe> c43i4 = this.LJLLJ;
        return ((hashCode4 + (c43i4 != null ? c43i4.hashCode() : 0)) * 31) + (this.LJLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoStateV2(currentPhotoIndex=");
        sb.append(this.LJLIL);
        sb.append(", isAutoScrollEnabled=");
        sb.append(this.LJLILLLLZI);
        sb.append(", isPinching=");
        sb.append(this.LJLJI);
        sb.append(", isDragging=");
        sb.append(this.LJLJJI);
        sb.append(", isVisible=");
        sb.append(this.LJLJJL);
        sb.append(", isMusicPaused=");
        sb.append(this.LJLJJLL);
        sb.append(", hasAtLeastOneImageLoaded=");
        sb.append(this.LJLJL);
        sb.append(", onHolderSelectedEvent=");
        sb.append(this.LJLJLJ);
        sb.append(", onHolderUnSelectedEvent=");
        sb.append(this.LJLJLLL);
        sb.append(", isAutoScrollResumable=");
        sb.append(this.LJLL);
        sb.append(", photoLoopCompletionCount=");
        sb.append(this.LJLLI);
        sb.append(", photosPlayFinished=");
        sb.append(this.LJLLILLLL);
        sb.append(", videoPlayFinishedFirstTime=");
        sb.append(this.LJLLJ);
        sb.append(", isSwipeHintEnabled=");
        return C08880Wm.LIZJ(sb, this.LJLLL, ')');
    }

    public /* synthetic */ C203127y8(int i) {
        this(0, true, false, false, false, null, false, null, null, true, 0, null, null, false);
    }

    public C203127y8(int i, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, C43I<C76800UCe> c43i, C43I<C76800UCe> c43i2, boolean z6, int i2, C43I<C76800UCe> c43i3, C43I<C76800UCe> c43i4, boolean z7) {
        boolean z8;
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = bool;
        this.LJLJL = z5;
        this.LJLJLJ = c43i;
        this.LJLJLLL = c43i2;
        this.LJLL = z6;
        this.LJLLI = i2;
        this.LJLLILLLL = c43i3;
        this.LJLLJ = c43i4;
        this.LJLLL = z7;
        boolean z9 = false;
        if (z && z6 && z4 && !z2 && !z3 && !o.LJ(bool, Boolean.TRUE) && z5) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.LJLLLL = z8;
        if (z4 && z5 && z7) {
            z9 = true;
        }
        this.LJLLLLLL = z9;
    }

    public static C203127y8 LIZ(C203127y8 c203127y8, int i, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, C43I c43i, C43I c43i2, boolean z6, int i2, C43I c43i3, C43I c43i4, boolean z7, int i3) {
        boolean z8 = z7;
        C43I c43i5 = c43i4;
        C43I c43i6 = c43i3;
        int i4 = i2;
        boolean z9 = z6;
        C43I c43i7 = c43i2;
        C43I c43i8 = c43i;
        boolean z10 = z5;
        boolean z11 = z;
        int i5 = i;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        Boolean bool2 = bool;
        if ((i3 & 1) != 0) {
            i5 = c203127y8.LJLIL;
        }
        if ((i3 & 2) != 0) {
            z11 = c203127y8.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z12 = c203127y8.LJLJI;
        }
        if ((i3 & 8) != 0) {
            z13 = c203127y8.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            z14 = c203127y8.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            bool2 = c203127y8.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            z10 = c203127y8.LJLJL;
        }
        if ((i3 & 128) != 0) {
            c43i8 = c203127y8.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            c43i7 = c203127y8.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z9 = c203127y8.LJLL;
        }
        if ((i3 & 1024) != 0) {
            i4 = c203127y8.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            c43i6 = c203127y8.LJLLILLLL;
        }
        if ((i3 & 4096) != 0) {
            c43i5 = c203127y8.LJLLJ;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            z8 = c203127y8.LJLLL;
        }
        c203127y8.getClass();
        return new C203127y8(i5, z11, z12, z13, z14, bool2, z10, c43i8, c43i7, z9, i4, c43i6, c43i5, z8);
    }
}
