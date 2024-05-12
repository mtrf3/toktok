package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JAp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48731JAp extends AbstractC65781Prl implements InterfaceC88472Yns<JBB, JBB> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48731JAp(int i, int i2) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final JBB invoke(JBB jbb) {
        JBB setStateImmediate = jbb;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        int i3 = i2 / 1000;
        if ((i > i3 || i < 0) && i2 != -1) {
            i = i3;
        }
        return JBB.LIZ(setStateImmediate, null, null, new C43I(Integer.valueOf(i)), null, null, null, 59);
    }
}
