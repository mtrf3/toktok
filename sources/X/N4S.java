package X;

import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class N4S extends F9E {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public java.util.Set<EnumC58794N5q> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL)};
    }

    public N4S(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LJLIL = false;
        this.LJLILLLLZI = 1;
        this.LJLJI = 0;
        this.LJLJJI = linkedHashSet;
        this.LJLJJL = true;
        this.LJLJJLL = true;
    }
}
