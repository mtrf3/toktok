package X;

import java.util.Objects;

/* renamed from: X.4G6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4G6 extends C3UY {
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZLLL), Long.valueOf(this.LJ), Long.valueOf(this.LJFF)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4G6) {
            return C78966Uyw.LJIIIZ(((C4G6) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("StickerDownloadEventBody:%s,%s,%s", LIZ());
    }

    public C4G6(boolean z, long j, long j2) {
        super(C0DC.LIZIZ("is_successful", Boolean.valueOf(z)), C51029K0z.LJJIIZI(new OSZ("unzip_time", Long.valueOf(j2 >= -1 ? j2 : -1L))), C51029K0z.LJJIIZI(new OSZ("resource_id", Long.valueOf(j))));
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = j2;
    }
}
