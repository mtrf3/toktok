package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;

/* loaded from: classes5.dex */
public final class A5I extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ PaidSeriesAddedListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5I(PaidSeriesAddedListFragment paidSeriesAddedListFragment) {
        super(0);
        this.LJLIL = paidSeriesAddedListFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_before_live");
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
