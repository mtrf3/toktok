package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5WH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WH extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C147295qH LJLILLLLZI;
    public final /* synthetic */ InterfaceC142865j8 LJLJI;
    public final /* synthetic */ List<String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5WH(InterfaceC142865j8 interfaceC142865j8, C147295qH c147295qH, List list, boolean z) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = c147295qH;
        this.LJLJI = interfaceC142865j8;
        this.LJLJJI = list;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        InterfaceC153045zY LLLIZZ;
        C122034qd LJJI;
        C5WG LJIIIIZZ;
        if (this.LJLIL && (LLLIZZ = this.LJLILLLLZI.LLLIZZ()) != null && (LJJI = C17N.LJJI(LLLIZZ)) != null && (LJIIIIZZ = LJJI.LJIIIIZZ()) != null) {
            Iterator<String> it = this.LJLJJI.iterator();
            while (it.hasNext()) {
                LJIIIIZZ.LJIL(it.next());
            }
        }
        this.LJLJI.LIZJ();
        return C76800UCe.LIZ;
    }
}
