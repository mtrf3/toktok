package X;

import Y.AfS2S0100100_3;
import Y.AfS55S0100000_3;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189887cm extends AbstractC65781Prl implements InterfaceC88472Yns<C189907co, C76800UCe> {
    public final /* synthetic */ PoiDetailInfoViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189887cm(PoiDetailInfoViewModel poiDetailInfoViewModel, String str, long j) {
        super(1);
        this.LJLIL = poiDetailInfoViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C189907co c189907co) {
        C189907co it = c189907co;
        o.LJIIIZ(it, "it");
        if (!(it.LJLIL instanceof C72922tc)) {
            this.LJLIL.setState(C189897cn.LJLIL);
            PoiListApi.LIZ.getClass();
            C73454SsE LJJIIZ = C78540Us4.LJJIIZ(C189927cq.LIZ().getPoiDetail(this.LJLILLLLZI));
            long j = this.LJLJI;
            PoiDetailInfoViewModel poiDetailInfoViewModel = this.LJLIL;
            LJJIIZ.LJJJLIIL(new AfS2S0100100_3(j, poiDetailInfoViewModel, 4), new AfS55S0100000_3(poiDetailInfoViewModel, 84));
        }
        return C76800UCe.LIZ;
    }
}
