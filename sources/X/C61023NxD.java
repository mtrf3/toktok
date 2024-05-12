package X;

import ujb.o;

/* renamed from: X.NxD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61023NxD extends F9E {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public final boolean L() {
        if (o.LJJJJJL(this.LJLILLLLZI) || o.LJJJJJL(this.LJLJI)) {
            return true;
        }
        return false;
    }

    public C61023NxD(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }
}
