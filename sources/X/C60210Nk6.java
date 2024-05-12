package X;

import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.IDqS185S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nk6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60210Nk6 extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC40516FvE, android.net.Uri, Boolean, C76800UCe> {
    public final /* synthetic */ C60194Njq LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60210Nk6(C60194Njq c60194Njq, AqS176S0100000_10 aqS176S0100000_10, AqS176S0100000_10 aqS176S0100000_102, IDqS185S0200000_10 iDqS185S0200000_10, AqS141S0200000_10 aqS141S0200000_10) {
        super(3);
        this.LJLIL = c60194Njq;
        this.LJLILLLLZI = aqS176S0100000_10;
        this.LJLJI = aqS176S0100000_102;
        this.LJLJJI = iDqS185S0200000_10;
        this.LJLJJL = aqS141S0200000_10;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC40516FvE interfaceC40516FvE, android.net.Uri uri, Boolean bool) {
        InterfaceC40516FvE instanceApi = interfaceC40516FvE;
        android.net.Uri uri2 = uri;
        boolean booleanValue = bool.booleanValue();
        o.LJIIJ(instanceApi, "instanceApi");
        o.LJIIJ(uri2, "uri");
        if ((instanceApi instanceof AbstractC60239NkZ) && instanceApi != null) {
            AbstractC60239NkZ abstractC60239NkZ = (AbstractC60239NkZ) instanceApi;
            if (booleanValue) {
                this.LJLILLLLZI.invoke(this.LJLIL.LJLJI);
                abstractC60239NkZ.LJIILL(new AqS141S0200000_10(abstractC60239NkZ, new C60211Nk7(abstractC60239NkZ, this, booleanValue, uri2), 52));
            } else {
                abstractC60239NkZ.LIZIZ();
                this.LJLJJI.invoke(abstractC60239NkZ, abstractC60239NkZ.LLFF, Boolean.valueOf(booleanValue));
            }
        }
        return C76800UCe.LIZ;
    }
}
