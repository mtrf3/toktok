package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JvL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50715JvL extends F9E implements InterfaceC50315Jot {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    public C50715JvL() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    public /* synthetic */ C50715JvL(int i) {
        this(0, "", "", false, 0L);
    }

    public C50715JvL(int i, String contentBeforeClear, String lastSug, boolean z, long j) {
        o.LJIIIZ(contentBeforeClear, "contentBeforeClear");
        o.LJIIIZ(lastSug, "lastSug");
        this.LJLIL = contentBeforeClear;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
        this.LJLJJI = lastSug;
        this.LJLJJL = i;
    }

    public static C50715JvL L(C50715JvL c50715JvL, String str, long j, boolean z, String str2, int i, int i2) {
        int i3 = i;
        String lastSug = str2;
        boolean z2 = z;
        String contentBeforeClear = str;
        long j2 = j;
        if ((i2 & 1) != 0) {
            contentBeforeClear = c50715JvL.LJLIL;
        }
        if ((i2 & 2) != 0) {
            j2 = c50715JvL.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z2 = c50715JvL.LJLJI;
        }
        if ((i2 & 8) != 0) {
            lastSug = c50715JvL.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            i3 = c50715JvL.LJLJJL;
        }
        c50715JvL.getClass();
        o.LJIIIZ(contentBeforeClear, "contentBeforeClear");
        o.LJIIIZ(lastSug, "lastSug");
        return new C50715JvL(i3, contentBeforeClear, lastSug, z2, j2);
    }
}
