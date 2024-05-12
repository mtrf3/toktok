package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;

/* loaded from: classes8.dex */
public final class GH7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ BaseAccountFlowFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GH7(BaseAccountFlowFragment baseAccountFlowFragment) {
        super(0);
        this.LJLIL = baseAccountFlowFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("use_sheet_style", false));
        }
        return null;
    }
}
