package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mqj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58073Mqj extends F9E {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final EnumC58072Mqi LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C58073Mqj() {
        this(-1L, 0, EnumC58072Mqi.NONE, false);
    }

    public C58073Mqj(long j, int i, EnumC58072Mqi status, boolean z) {
        o.LJIIIZ(status, "status");
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = status;
        this.LJLJJI = z;
    }

    public static C58073Mqj L(C58073Mqj c58073Mqj, long j, EnumC58072Mqi enumC58072Mqi, int i) {
        int i2;
        boolean z;
        EnumC58072Mqi status = enumC58072Mqi;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c58073Mqj.LJLIL;
        }
        if ((i & 2) != 0) {
            i2 = c58073Mqj.LJLILLLLZI;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            status = c58073Mqj.LJLJI;
        }
        if ((i & 8) != 0) {
            z = c58073Mqj.LJLJJI;
        } else {
            z = false;
        }
        c58073Mqj.getClass();
        o.LJIIIZ(status, "status");
        return new C58073Mqj(j2, i2, status, z);
    }
}
