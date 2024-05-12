package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36011bB extends F9E {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
        }
    }

    public /* synthetic */ C36011bB(String str) {
        this(str, (String) null);
    }

    public C36011bB(String domain, String str) {
        o.LJIIJ(domain, "domain");
        this.LJLILLLLZI = domain;
        this.LJLJI = str;
    }

    public C36011bB(Object obj, Object obj2) {
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
