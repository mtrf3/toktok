package X;

import Y.ARunnableS25S0200000_6;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS153S0200000_6;

/* renamed from: X.EbL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36735EbL implements InterfaceC36736EbM {
    public boolean LIZ;
    public boolean LIZJ;
    public final Executor LJ;
    public final InterfaceC36737EbN LJFF;
    public final InterfaceC36766Ebq LJI;
    public final ConcurrentHashMap<String, C36734EbK> LIZIZ = new ConcurrentHashMap<>();
    public String LIZLLL = "";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    @Override // X.InterfaceC36736EbM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.util.Collection<X.C36755Ebf>, java.util.SortedMap<java.lang.String, java.lang.String>> LIZ(X.C36730EbG r17) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36735EbL.LIZ(X.EbG):X.OSZ");
    }

    public final void LIZIZ(AqS153S0200000_6 aqS153S0200000_6) {
        if (this.LIZ) {
            aqS153S0200000_6.invoke();
        } else {
            this.LJ.execute(new ARunnableS25S0200000_6(aqS153S0200000_6, this, 24));
        }
    }

    public C36735EbL(Executor executor, InterfaceC36737EbN interfaceC36737EbN, InterfaceC36766Ebq interfaceC36766Ebq) {
        this.LJ = executor;
        this.LJFF = interfaceC36737EbN;
        this.LJI = interfaceC36766Ebq;
    }
}
