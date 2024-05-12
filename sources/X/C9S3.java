package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9S3, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9S3 implements C33Q {
    public final double LJLIL;
    public final int LJLILLLLZI;
    public final C9SN LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final List<String> LJLJJLL;
    public final C9Q1 LJLJL;
    public final C43I<EnumC236939Rp> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final C43I<C9SV> LJLL;
    public final C43I<EnumC236919Rn> LJLLI;
    public final C43I<C9S1> LJLLILLLL;
    public final C43I<C76800UCe> LJLLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9S3)) {
            return false;
        }
        C9S3 c9s3 = (C9S3) obj;
        return Double.compare(this.LJLIL, c9s3.LJLIL) == 0 && this.LJLILLLLZI == c9s3.LJLILLLLZI && this.LJLJI == c9s3.LJLJI && this.LJLJJI == c9s3.LJLJJI && this.LJLJJL == c9s3.LJLJJL && o.LJ(this.LJLJJLL, c9s3.LJLJJLL) && this.LJLJL == c9s3.LJLJL && o.LJ(this.LJLJLJ, c9s3.LJLJLJ) && o.LJ(this.LJLJLLL, c9s3.LJLJLLL) && o.LJ(this.LJLL, c9s3.LJLL) && o.LJ(this.LJLLI, c9s3.LJLLI) && o.LJ(this.LJLLILLLL, c9s3.LJLLILLLL) && o.LJ(this.LJLLJ, c9s3.LJLLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJLJI.hashCode() + (((C16880lQ.LLJI(this.LJLIL) * 31) + this.LJLILLLLZI) * 31)) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.LJLJJL) * 31;
        List<String> list = this.LJLJJLL;
        int hashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        C9Q1 c9q1 = this.LJLJL;
        int hashCode3 = (hashCode2 + (c9q1 == null ? 0 : c9q1.hashCode())) * 31;
        C43I<EnumC236939Rp> c43i = this.LJLJLJ;
        int hashCode4 = (hashCode3 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJLLL;
        int hashCode5 = (hashCode4 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C9SV> c43i3 = this.LJLL;
        int hashCode6 = (hashCode5 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<EnumC236919Rn> c43i4 = this.LJLLI;
        int hashCode7 = (hashCode6 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<C9S1> c43i5 = this.LJLLILLLL;
        int hashCode8 = (hashCode7 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<C76800UCe> c43i6 = this.LJLLJ;
        return hashCode8 + (c43i6 != null ? c43i6.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineModeManagerState(cachedVideoSize=" + this.LJLIL + ", cachedVideoCount=" + this.LJLILLLLZI + ", downloadState=" + this.LJLJI + ", isWifiOnly=" + this.LJLJJI + ", cacheCount=" + this.LJLJJL + ", watchedList=" + this.LJLJJLL + ", sheetStyle=" + this.LJLJL + ", sheetUpdateEvent=" + this.LJLJLJ + ", backPressEvent=" + this.LJLJLLL + ", popupVideoToastEvent=" + this.LJLL + ", popupSheetToastEvent=" + this.LJLLI + ", popupDialogEvent=" + this.LJLLILLLL + ", returnFypEvent=" + this.LJLLJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9S3(double d, int i, C9SN downloadState, boolean z, int i2, List<String> list, C9Q1 c9q1, C43I<? extends EnumC236939Rp> c43i, C43I<C76800UCe> c43i2, C43I<? extends C9SV> c43i3, C43I<? extends EnumC236919Rn> c43i4, C43I<? extends C9S1> c43i5, C43I<C76800UCe> c43i6) {
        o.LJIIIZ(downloadState, "downloadState");
        this.LJLIL = d;
        this.LJLILLLLZI = i;
        this.LJLJI = downloadState;
        this.LJLJJI = z;
        this.LJLJJL = i2;
        this.LJLJJLL = list;
        this.LJLJL = c9q1;
        this.LJLJLJ = c43i;
        this.LJLJLLL = c43i2;
        this.LJLL = c43i3;
        this.LJLLI = c43i4;
        this.LJLLILLLL = c43i5;
        this.LJLLJ = c43i6;
    }

    public static C9S3 LIZ(C9S3 c9s3, double d, int i, C9SN c9sn, boolean z, int i2, List list, C9Q1 c9q1, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, int i3) {
        C43I c43i7 = c43i6;
        C43I c43i8 = c43i5;
        C43I c43i9 = c43i4;
        C43I c43i10 = c43i3;
        C43I c43i11 = c43i2;
        C43I c43i12 = c43i;
        C9Q1 c9q12 = c9q1;
        int i4 = i;
        double d2 = d;
        C9SN downloadState = c9sn;
        boolean z2 = z;
        int i5 = i2;
        List list2 = list;
        if ((i3 & 1) != 0) {
            d2 = c9s3.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i4 = c9s3.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            downloadState = c9s3.LJLJI;
        }
        if ((i3 & 8) != 0) {
            z2 = c9s3.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            i5 = c9s3.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            list2 = c9s3.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            c9q12 = c9s3.LJLJL;
        }
        if ((i3 & 128) != 0) {
            c43i12 = c9s3.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            c43i11 = c9s3.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            c43i10 = c9s3.LJLL;
        }
        if ((i3 & 1024) != 0) {
            c43i9 = c9s3.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            c43i8 = c9s3.LJLLILLLL;
        }
        if ((i3 & 4096) != 0) {
            c43i7 = c9s3.LJLLJ;
        }
        c9s3.getClass();
        o.LJIIIZ(downloadState, "downloadState");
        return new C9S3(d2, i4, downloadState, z2, i5, list2, c9q12, c43i12, c43i11, c43i10, c43i9, c43i8, c43i7);
    }
}
