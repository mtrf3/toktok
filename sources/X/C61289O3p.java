package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.jvm.internal.o;

/* renamed from: X.O3p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61289O3p extends AbstractC65781Prl implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public final /* synthetic */ Forest LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;
    public final /* synthetic */ RequestParams LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61289O3p(Forest forest, C68322mC c68322mC, RequestParams requestParams, long j, boolean z, InterfaceC88472Yns interfaceC88472Yns, String str) {
        super(1);
        this.LJLIL = forest;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = requestParams;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        String str;
        C61295O3v it = c61295O3v;
        o.LJIIJ(it, "it");
        C61295O3v reuseResponse = this.LJLIL.reuseResponse(it, (C61302O4c) this.LJLILLLLZI.element, this.LJLJI, this.LJLJJI);
        this.LJLIL.triggerCallback(this.LJLJJL, this.LJLJJLL, reuseResponse);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request reused in fetchResourceAsync, url:");
        LIZ.append(this.LJLJL);
        LIZ.append(" succeed:");
        LIZ.append(it.LJZL);
        if (it.LJZI.getScene() == EnumC61028NxI.LYNX_IMAGE) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("image:");
            LIZ2.append(it.O());
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = "";
        }
        LIZ.append(str);
        C39930Flm.LJI(null, X1D.LIZIZ(LIZ), true, 1);
        C39900FlI.LIZ(reuseResponse);
        C61288O3o.LIZJ(reuseResponse);
        return C76800UCe.LIZ;
    }
}
