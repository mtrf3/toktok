package Y;

import X.AbstractC73672Svk;
import X.C213178Yf;
import X.C7UB;
import X.C7UF;
import X.InterfaceC48038ItG;
import X.TBW;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.nows.ProfileNowApi;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoResponse;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDhS96S0100000_3 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            default:
                return null;
        }
    }

    public IDhS96S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS96S0100000_3 iDhS96S0100000_3, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) iDhS96S0100000_3.l0;
        awemeListFragmentImpl.getClass();
        AbstractC73672Svk<NowArchiveResponse> fetchArchiveData = ProfileNowApi.LIZIZ.fetchArchiveData(0L, 10L, 2);
        awemeListFragmentImpl.LLLIL.set(true);
        return fetchArchiveData;
    }

    public static final Object apply$1(IDhS96S0100000_3 iDhS96S0100000_3, Object obj) {
        SubOnlyVideoResponse it = (SubOnlyVideoResponse) obj;
        o.LJIIIZ(it, "it");
        List<? extends Aweme> list = it.awemeList;
        SubOnlyVideoViewModel subOnlyVideoViewModel = (SubOnlyVideoViewModel) iDhS96S0100000_3.l0;
        boolean z = subOnlyVideoViewModel.LJLIL;
        return new C7UB(list, new C7UF(subOnlyVideoViewModel.LJLILLLLZI, it.minTime, it.maxTime, subOnlyVideoViewModel.LJLJI, z), it.hasMore);
    }

    public static final Object apply$2(IDhS96S0100000_3 iDhS96S0100000_3, Object obj) {
        boolean z;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        if (response.status_code != 0) {
            ((WatchHistoryListViewModel) iDhS96S0100000_3.l0).gv0();
            z = false;
        } else {
            ((WatchHistoryListViewModel) iDhS96S0100000_3.l0).listClear();
            ((WatchHistoryListViewModel) iDhS96S0100000_3.l0).iv0();
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$3(IDhS96S0100000_3 iDhS96S0100000_3, Object it) {
        o.LJIIIZ(it, "it");
        return new C213178Yf(((TBW) iDhS96S0100000_3.l0).get(it));
    }

    public static final Object apply$4(IDhS96S0100000_3 iDhS96S0100000_3, Object it) {
        o.LJIIIZ(it, "it");
        return new C213178Yf(((TBW) iDhS96S0100000_3.l0).get(it));
    }

    public static final Object apply$5(IDhS96S0100000_3 iDhS96S0100000_3, Object obj) {
        return new C213178Yf(((TBW) iDhS96S0100000_3.l0).get(obj));
    }
}
