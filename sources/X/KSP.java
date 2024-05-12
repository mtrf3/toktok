package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSP extends AbstractC65781Prl implements InterfaceC88472Yns<KSM, KSM> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSP(String str, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final KSM invoke(KSM setState) {
        o.LJIIIZ(setState, "$this$setState");
        String nowSelectCell = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        o.LJIIIZ(nowSelectCell, "nowSelectCell");
        return new KSM(nowSelectCell, z);
    }
}
