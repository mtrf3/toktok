package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32001Nk extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C32001Nk(String name, String key, boolean z) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(key, "key");
        this.LJLIL = name;
        this.LJLILLLLZI = key;
        this.LJLJI = z;
    }
}
