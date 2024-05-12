package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50561ye extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC32701Qc, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC11790dD LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50561ye(float f, InterfaceC11790dD interfaceC11790dD, boolean z, long j, long j2) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC11790dD;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC32701Qc interfaceC32701Qc) {
        InterfaceC32701Qc graphicsLayer = interfaceC32701Qc;
        o.LJIIIZ(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.LJJ(graphicsLayer.LJJJJIZL(this.LJLIL));
        graphicsLayer.LJJLL(this.LJLILLLLZI);
        graphicsLayer.LJIL(this.LJLJI);
        graphicsLayer.LJJIIZI(this.LJLJJI);
        graphicsLayer.LJJIJIIJI(this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
