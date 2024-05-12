package X;

import java.util.List;

/* renamed from: X.HkU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44946HkU extends F9E {
    public List<String> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public Boolean LJLJJLL;
    public final boolean LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL, Boolean.valueOf(this.LJLJL)};
    }

    public C44946HkU(boolean z, boolean z2, int i, int i2, Boolean bool, int i3) {
        bool = (i3 & 16) != 0 ? Boolean.FALSE : bool;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = bool;
        this.LJLJL = false;
    }
}
