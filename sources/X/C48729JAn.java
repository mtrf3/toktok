package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JAn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48729JAn extends AbstractC65781Prl implements InterfaceC88472Yns<JBB, JBB> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48729JAn(long j, long j2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final JBB invoke(JBB jbb) {
        JBB setStateImmediate = jbb;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        long j = 1000;
        return JBB.LIZ(setStateImmediate, null, new C43I(Integer.valueOf((int) ((this.LJLIL / j) - (this.LJLILLLLZI / j)))), null, null, null, null, 61);
    }
}
