package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139795eB extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C139795eB(String name, String from, String to, String resName, String str, int i) {
        from = (i & 2) != 0 ? "" : from;
        to = (i & 4) != 0 ? "" : to;
        resName = (i & 8) != 0 ? "" : resName;
        String extra = (i & 16) == 0 ? str : "";
        o.LJIIIZ(name, "name");
        o.LJIIIZ(from, "from");
        o.LJIIIZ(to, "to");
        o.LJIIIZ(resName, "resName");
        o.LJIIIZ(extra, "extra");
        this.LJLIL = name;
        this.LJLILLLLZI = from;
        this.LJLJI = to;
        this.LJLJJI = resName;
        this.LJLJJL = extra;
    }
}
