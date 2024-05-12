package X;

import kotlin.jvm.internal.o;

/* renamed from: X.95y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2313095y extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public C2313095y(String logEnterMethod, int i, boolean z, int i2, int i3, String logEnterFrom) {
        o.LJIIIZ(logEnterMethod, "logEnterMethod");
        o.LJIIIZ(logEnterFrom, "logEnterFrom");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = logEnterMethod;
        this.LJLJJI = logEnterFrom;
        this.LJLJJL = z;
        this.LJLJJLL = i3;
    }
}
