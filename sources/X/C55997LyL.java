package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LyL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C55997LyL extends TBS implements InterfaceC88473Ynt<List<? extends ToolEntryVO>, Integer, Integer, C76800UCe> {
    public C55997LyL(ShopMainContentAssem shopMainContentAssem) {
        super(3, shopMainContentAssem, ShopMainContentAssem.class, "sendPanelButtonShowEvent", "sendPanelButtonShowEvent(Ljava/util/List;II)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(List<? extends ToolEntryVO> list, Integer num, Integer num2) {
        List<? extends ToolEntryVO> p0 = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(p0, "p0");
        ((ShopMainContentAssem) this.receiver).C3(intValue, intValue2, p0);
        return C76800UCe.LIZ;
    }
}
