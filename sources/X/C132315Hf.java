package X;

/* renamed from: X.5Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132315Hf extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C132315Hf() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C132315Hf(int i) {
        this(false, true, true);
    }

    public C132315Hf(boolean z, boolean z2, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
    }

    public static C132315Hf L(C132315Hf c132315Hf, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c132315Hf.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c132315Hf.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z3 = c132315Hf.LJLJI;
        }
        c132315Hf.getClass();
        return new C132315Hf(z, z2, z3);
    }
}
