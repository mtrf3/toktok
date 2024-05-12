package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GzR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43325GzR extends AbstractC51036K1g<Aweme, CollectionDetailModel> {
    public final List<Aweme> LJLIL = new ArrayList();

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
    public final void loadMoreList(Object... p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return this.LJLIL;
    }
}
