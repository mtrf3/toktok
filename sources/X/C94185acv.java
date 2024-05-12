package X;

import kotlin.jvm.internal.o;

/* renamed from: X.acv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94185acv extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    public C94185acv() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C94185acv(int i) {
        this("", -1, 0, false);
    }

    public C94185acv(String selectedCategory, int i, int i2, boolean z) {
        o.LJIIIZ(selectedCategory, "selectedCategory");
        this.LJLIL = selectedCategory;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
    }

    public static C94185acv L(C94185acv c94185acv, int i, boolean z, int i2) {
        String selectedCategory;
        int i3;
        if ((i2 & 1) != 0) {
            selectedCategory = c94185acv.LJLIL;
        } else {
            selectedCategory = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c94185acv.LJLILLLLZI;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i = c94185acv.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z = c94185acv.LJLJJI;
        }
        c94185acv.getClass();
        o.LJIIIZ(selectedCategory, "selectedCategory");
        return new C94185acv(selectedCategory, i3, i, z);
    }
}
