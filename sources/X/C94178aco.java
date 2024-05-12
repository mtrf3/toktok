package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aco, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94178aco extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL)};
    }

    public C94178aco(int i, String effectId, boolean z, String iconUrl, String name, boolean z2) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(name, "name");
        this.LJLIL = effectId;
        this.LJLILLLLZI = iconUrl;
        this.LJLJI = name;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = z2;
    }
}
