package X;

import android.os.Bundle;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.UdE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77620UdE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ RechargeViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77620UdE(RechargeViewModel rechargeViewModel) {
        super(0);
        this.LJLIL = rechargeViewModel;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Bundle bundle = this.LJLIL.LJLLL;
        if (bundle != null && bundle.getBoolean("key_bundle_gift_has_sent_before")) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
