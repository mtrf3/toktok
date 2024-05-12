package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NzG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61150NzG extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final C25837ACb LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C61150NzG(String str, String str2, String toLanguage, int i, C25837ACb c25837ACb) {
        o.LJIIIZ(toLanguage, "toLanguage");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = toLanguage;
        this.LJLJJI = i;
        this.LJLJJL = c25837ACb;
    }
}
