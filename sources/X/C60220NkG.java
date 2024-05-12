package X;

import java.util.List;
import kotlin.jvm.internal.AqS1S0800000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NkG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60220NkG extends AbstractC65781Prl implements InterfaceC88472Yns<android.net.Uri, C76800UCe> {
    public final /* synthetic */ InterfaceC40516FvE LJLIL;
    public final /* synthetic */ C60222NkI LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC60250Nkk LJLJJI;
    public final /* synthetic */ List LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60220NkG(InterfaceC40516FvE interfaceC40516FvE, C60222NkI c60222NkI, boolean z, InterfaceC60201Njx interfaceC60201Njx, InterfaceC60250Nkk interfaceC60250Nkk, List list, AqS1S0800000_10 aqS1S0800000_10, AqS1S0800000_10 aqS1S0800000_102) {
        super(1);
        this.LJLIL = interfaceC40516FvE;
        this.LJLILLLLZI = c60222NkI;
        this.LJLJI = z;
        this.LJLJJI = interfaceC60250Nkk;
        this.LJLJJL = list;
        this.LJLJJLL = aqS1S0800000_10;
        this.LJLJL = aqS1S0800000_102;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(android.net.Uri uri) {
        android.net.Uri it = uri;
        o.LJIIJ(it, "it");
        F3T f3t = this.LJLILLLLZI.LJLILLLLZI;
        f3t.LJFF(C60223NkJ.class, new C60223NkJ(this.LJLIL, this.LJLJI));
        this.LJLJJLL.invoke(new C60222NkI(it, f3t));
        return C76800UCe.LIZ;
    }
}
