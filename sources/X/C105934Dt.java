package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105934Dt implements C33Q {
    public final boolean LJLIL;
    public final C105964Dw LJLILLLLZI;
    public final C43I<Exception> LJLJI;
    public final Long LJLJJI;
    public final C4E2 LJLJJL;

    public C105934Dt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105934Dt)) {
            return false;
        }
        C105934Dt c105934Dt = (C105934Dt) obj;
        return this.LJLIL == c105934Dt.LJLIL && o.LJ(this.LJLILLLLZI, c105934Dt.LJLILLLLZI) && o.LJ(this.LJLJI, c105934Dt.LJLJI) && o.LJ(this.LJLJJI, c105934Dt.LJLJJI) && this.LJLJJL == c105934Dt.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJLILLLLZI.hashCode() + (r0 * 31)) * 31;
        C43I<Exception> c43i = this.LJLJI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        Long l = this.LJLJJI;
        return this.LJLJJL.hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSpeechState(displaySpeechPanel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", speechContent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", speechError=");
        LIZ.append(this.LJLJI);
        LIZ.append(", recordTimestamp=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", volumeStatus=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C105934Dt(int i) {
        this(false, C105964Dw.LJLJI, null, null, C4E2.LOW_VOLUME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C105934Dt(boolean z, C105964Dw speechContent, C43I<? extends Exception> c43i, Long l, C4E2 volumeStatus) {
        o.LJIIIZ(speechContent, "speechContent");
        o.LJIIIZ(volumeStatus, "volumeStatus");
        this.LJLIL = z;
        this.LJLILLLLZI = speechContent;
        this.LJLJI = c43i;
        this.LJLJJI = l;
        this.LJLJJL = volumeStatus;
    }

    public static C105934Dt LIZ(C105934Dt c105934Dt, boolean z, C105964Dw c105964Dw, C43I c43i, Long l, C4E2 c4e2, int i) {
        C4E2 volumeStatus = c4e2;
        Long l2 = l;
        C43I c43i2 = c43i;
        boolean z2 = z;
        C105964Dw speechContent = c105964Dw;
        if ((i & 1) != 0) {
            z2 = c105934Dt.LJLIL;
        }
        if ((i & 2) != 0) {
            speechContent = c105934Dt.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c105934Dt.LJLJI;
        }
        if ((i & 8) != 0) {
            l2 = c105934Dt.LJLJJI;
        }
        if ((i & 16) != 0) {
            volumeStatus = c105934Dt.LJLJJL;
        }
        c105934Dt.getClass();
        o.LJIIIZ(speechContent, "speechContent");
        o.LJIIIZ(volumeStatus, "volumeStatus");
        return new C105934Dt(z2, speechContent, c43i2, l2, volumeStatus);
    }
}
