package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;

/* renamed from: X.RAk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69110RAk extends AbstractC65781Prl implements InterfaceC65784Pro<Bundle> {
    public final /* synthetic */ CommonFlowActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69110RAk(CommonFlowActivity commonFlowActivity) {
        super(0);
        this.LJLIL = commonFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Bundle invoke() {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(this.LJLIL.getIntent());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        LLJJIJI.remove("next_page");
        return LLJJIJI;
    }
}
