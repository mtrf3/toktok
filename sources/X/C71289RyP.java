package X;

import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* renamed from: X.RyP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71289RyP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ OrderCenterEntry LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ TradeEntranceInfo LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71289RyP(OrderCenterEntry orderCenterEntry, boolean z, TradeEntranceInfo tradeEntranceInfo, String str) {
        super(0);
        this.LJLIL = orderCenterEntry;
        this.LJLILLLLZI = z;
        this.LJLJI = tradeEntranceInfo;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC71293RyT interfaceC71293RyT = this.LJLIL.LJLJI;
        if (interfaceC71293RyT != null) {
            boolean z = this.LJLILLLLZI;
            String title = this.LJLJI.getTitle();
            if (title == null) {
                title = "";
            }
            ((SettingNewVersionFragment) ((XXB) interfaceC71293RyT).LJLIL).lambda$initOrderCenterEntry$120(z, title, this.LJLJJI, this.LJLJI.getIconUrl(), this.LJLJI.getIconDarkUrl());
            return C76800UCe.LIZ;
        }
        return null;
    }
}
