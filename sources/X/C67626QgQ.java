package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QgQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67626QgQ extends AbstractC65781Prl implements InterfaceC88472Yns<AEL, AEL> {
    public final /* synthetic */ AbstractViewOnClickListenerC67619QgJ LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67626QgQ(AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ, int i) {
        super(1);
        this.LJLIL = abstractViewOnClickListenerC67619QgJ;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final AEL invoke(AEL ael) {
        AEL it = ael;
        o.LJIIIZ(it, "it");
        return AEL.LJIILJJIL(it, this.LJLIL.LJIILIIL(this.LJLILLLLZI, new Object[0]), false, null, true, false, false, 15355);
    }
}
