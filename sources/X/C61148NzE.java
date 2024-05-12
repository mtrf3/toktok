package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NzE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61148NzE extends F9E {
    public final InterfaceC61155NzL LJLIL;
    public final C61150NzG LJLILLLLZI;
    public final Y7M LJLJI;
    public final ACZ LJLJJI;
    public final C25836ACa LJLJJL;
    public final AD1 LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    public C61148NzE(C61145NzB c61145NzB, C61150NzG c61150NzG, ACL acl, ACZ acz, C25836ACa initData, AD1 debugInfo) {
        o.LJIIIZ(initData, "initData");
        o.LJIIIZ(debugInfo, "debugInfo");
        this.LJLIL = c61145NzB;
        this.LJLILLLLZI = c61150NzG;
        this.LJLJI = acl;
        this.LJLJJI = acz;
        this.LJLJJL = initData;
        this.LJLJJLL = debugInfo;
    }
}
