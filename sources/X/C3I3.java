package X;

import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3I3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I3 extends AbstractC51036K1g<Object, LiveEventResponse> {
    public final List<Object> LJLIL = new ArrayList();
    public final List<LiveEventModule> LJLILLLLZI = new ArrayList();

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return false;
    }

    public C3I3() {
        new ArrayList();
    }

    @Override // X.AbstractC51036K1g
    public final List<Object> getItems() {
        return this.LJLIL;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(Object obj) {
        LiveEventResponse liveEventResponse = (LiveEventResponse) obj;
        if (liveEventResponse != null) {
            if (this.mListQueryType == 1) {
                ((ArrayList) this.LJLILLLLZI).clear();
                ((ArrayList) this.LJLIL).clear();
                ((ArrayList) this.LJLILLLLZI).addAll(liveEventResponse.eventList);
            }
            ((ArrayList) this.LJLIL).addAll(this.LJLILLLLZI);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        FGR.LIZIZ().LIZ(this.mHandler, C3I5.LJLIL, 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        FGR.LIZIZ().LIZ(this.mHandler, C3I5.LJLIL, 0);
    }
}
