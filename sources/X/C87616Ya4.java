package X;

import kotlin.jvm.internal.AqS147S0200000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87616Ya4 extends AbstractC65781Prl implements InterfaceC88472Yns<C41875Gc3, C76800UCe> {
    public final /* synthetic */ C87612Ya0 LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87616Ya4(C87612Ya0 c87612Ya0, InterfaceC88472Yns interfaceC88472Yns, String str) {
        super(1);
        this.LJLIL = c87612Ya0;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C41875Gc3 it) {
        o.LJIIIZ(it, "it");
        try {
            this.LJLILLLLZI.invoke(it);
        } catch (Throwable th) {
            this.LJLIL.LIZ.LIZ(new AqS147S0200000_16(this, th, 11));
        }
        return C76800UCe.LIZ;
    }
}
