package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.assem.ProductListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S54 extends AbstractC65781Prl implements InterfaceC65784Pro<C73306Spq> {
    public static final S54 LJLIL = new S54();

    public S54() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C73306Spq invoke() {
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_magnify_glass;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        String LJFF = C86V.LJFF(R.string.p0);
        o.LJIIIIZZ(LJFF, "getString(R.string.No_search_result)");
        c73306Spq.LJFF = LJFF;
        String NO_RESULT_FOUND_MESSAGE = ProductListAssem.LJLLJ;
        o.LJIIIIZZ(NO_RESULT_FOUND_MESSAGE, "NO_RESULT_FOUND_MESSAGE");
        c73306Spq.LJI = NO_RESULT_FOUND_MESSAGE;
        return c73306Spq;
    }
}
