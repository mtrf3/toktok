package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pyc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66206Pyc extends F9E {
    public final C66211Pyh LJLIL;
    public final java.util.Set<C66211Pyh> LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final C66210Pyg LJLJJL;
    public final java.util.Map<String, Float> LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    public C66206Pyc(C66211Pyh c66211Pyh, java.util.Set<C66211Pyh> requestInfoList, boolean z, String str, C66210Pyg c66210Pyg, java.util.Map<String, Float> map) {
        o.LJIIIZ(requestInfoList, "requestInfoList");
        this.LJLIL = c66211Pyh;
        this.LJLILLLLZI = requestInfoList;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = c66210Pyg;
        this.LJLJJLL = map;
    }
}
