package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCT implements JCQ {
    public final /* synthetic */ FeedPipViewModel LIZ;

    @Override // X.JCQ
    public final void onEmpty() {
        this.LIZ.LJLLLL.setValue(EnumC48781JCn.SUCCEED);
        FeedPipViewModel feedPipViewModel = this.LIZ;
        feedPipViewModel.LJLLILLLL = false;
        feedPipViewModel.LJLLJ.setValue(Boolean.FALSE);
    }

    @Override // X.JCQ
    public final void onError() {
        this.LIZ.LJLLLL.setValue(EnumC48781JCn.LOAD_ERROR);
    }

    public JCT(FeedPipViewModel feedPipViewModel) {
        this.LIZ = feedPipViewModel;
    }

    @Override // X.JCQ
    public final void LIZ(List<? extends Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LIZ.LJLLLL.setValue(EnumC48781JCn.SUCCEED);
        if (list.isEmpty()) {
            FeedPipViewModel feedPipViewModel = this.LIZ;
            feedPipViewModel.LJLLILLLL = false;
            feedPipViewModel.LJLLJ.setValue(Boolean.FALSE);
            return;
        }
        ((ArrayList) this.LIZ.LJLJLLL).clear();
        ((ArrayList) this.LIZ.LJLJLLL).addAll(list);
        this.LIZ.lv0(list);
        int size = ((ArrayList) this.LIZ.hv0()).size();
        FeedPipViewModel feedPipViewModel2 = this.LIZ;
        if (size <= feedPipViewModel2.LJLZ + 1) {
            return;
        }
        feedPipViewModel2.LJLLI.setValue(feedPipViewModel2.hv0());
        FeedPipViewModel feedPipViewModel3 = this.LIZ;
        feedPipViewModel3.kv0(feedPipViewModel3.LJLZ + 1);
        FeedPipViewModel feedPipViewModel4 = this.LIZ;
        feedPipViewModel4.LJLIL.setValue((FeedPipViewModel$currentAweme$1) ListProtector.get(feedPipViewModel4.hv0(), this.LIZ.LJLZ));
        this.LIZ.LJLLILLLL = z;
    }
}
