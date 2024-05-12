package X;

import Y.AfS55S0100000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224348rG extends AbstractC51036K1g<Aweme, Aweme> {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;
    public final List<Aweme> LJLJI;
    public final C73318Sq2 LJLJJI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    @Override // X.C8BS
    public final Object getData() {
        return ORZ.LJLLLL(this.LJLJI);
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return this.LJLJI;
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        C55480Lq0.LIZIZ.LIZLLL(249372176, 4);
        C78999UzT.LJFF(StoryApi.LIZIZ.getUserStoriesSingle(C47261Igj.LJJIJ(this.LJLIL).toString(), null).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS55S0100000_3(this, 70), new AfS55S0100000_3(this, 71)), this.LJLJJI);
    }

    public C224348rG(String str, Aweme aweme) {
        this.LJLIL = str;
        this.LJLILLLLZI = aweme;
        ArrayList arrayList = new ArrayList();
        this.LJLJI = arrayList;
        this.LJLJJI = new C73318Sq2();
        if (aweme != null) {
            arrayList.add(aweme);
        }
    }
}
