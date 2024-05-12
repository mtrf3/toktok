package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import kotlin.jvm.internal.o;

/* renamed from: X.RiW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70304RiW extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ DynamicPage LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70304RiW(long j, long j2, long j3, DynamicPage dynamicPage) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = j3;
        this.LJLJJI = dynamicPage;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        long j = this.LJLIL;
        long j2 = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        DynamicPage dynamicPage = this.LJLJJI;
        sendLog.LIZJ("duration", Long.valueOf(j - j2));
        sendLog.LIZJ("start_click_to_now", Long.valueOf(j - j3));
        CommonData commonData = dynamicPage.commonData;
        if (commonData == null || (str = commonData.productId) == null) {
            str = "";
        }
        sendLog.LIZJ("product_id", str);
        return C76800UCe.LIZ;
    }
}
