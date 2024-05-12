package X;

import Y.AfS57S0200000_8;
import Y.AfS60S0100000_8;
import android.app.Activity;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KOu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51648KOu extends AbstractC51036K1g<Aweme, FeedsResponse> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final String LJLIL;
    public final InterfaceC51622KNu LJLILLLLZI;
    public final C73318Sq2 LJLJI;
    public Activity LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return ((FeedsResponse) this.mData).list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FeedsResponse) t).hasMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final void handleData(FeedsResponse feedsResponse) {
        boolean z = true;
        this.LJLJJLL++;
        if (feedsResponse != null) {
            this.mIsNewDataEmpty = feedsResponse.list.isEmpty();
            T t = this.mData;
            ((FeedsResponse) t).hasMore = feedsResponse.hasMore;
            ((FeedsResponse) t).list.addAll(feedsResponse.list);
            FeedsResponse feedsResponse2 = (FeedsResponse) this.mData;
            if (feedsResponse.list.size() <= 0) {
                z = false;
            }
            feedsResponse2.hasMore = z;
            ((FeedsResponse) this.mData).isNewUser = feedsResponse.isNewUser;
        }
    }

    public final void LJIIJJI(boolean z) {
        int i;
        this.mIsLoading = true;
        C73318Sq2 c73318Sq2 = this.LJLJI;
        C51649KOv c51649KOv = IDynamicApi.LIZ;
        String str = this.LJLJJL;
        if (str != null) {
            c51649KOv.getClass();
            IDynamicApi iDynamicApi = (IDynamicApi) RetrofitFactory.LIZLLL().create(str).create(IDynamicApi.class);
            String str2 = this.LJLJJL;
            if (str2 != null) {
                HashMap hashMap = new HashMap();
                if (z) {
                    i = 0;
                } else {
                    i = this.LJLJJLL;
                }
                hashMap.put("page", String.valueOf(i));
                hashMap.put("size", String.valueOf(this.LJLJL));
                c73318Sq2.LIZ(iDynamicApi.loadVideos(str2, hashMap).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS60S0100000_8(this, 11), new AfS60S0100000_8(this, 12)));
                return;
            }
            o.LJIJI("requestUrl");
            throw null;
        }
        o.LJIJI("requestUrl");
        throw null;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIJJI(false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIJJI(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51648KOu(FeedsResponse feedsResponse, String str, InterfaceC51622KNu interfaceC51622KNu) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC51622KNu;
        this.mData = feedsResponse;
        this.LJLJI = new C73318Sq2();
        this.LJLJL = 20;
    }

    public final void LJIIIZ(String str, int i, int i2, Activity activity) {
        this.LJLJJL = str;
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJJI = activity;
        C73318Sq2 c73318Sq2 = this.LJLJI;
        IDynamicApi.LIZ.getClass();
        IDynamicApi iDynamicApi = (IDynamicApi) RetrofitFactory.LIZLLL().create(str).create(IDynamicApi.class);
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("size", String.valueOf(i2));
        c73318Sq2.LIZ(iDynamicApi.loadVideos(str, hashMap).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0200000_8(this, activity, 3), new AfS60S0100000_8(this, 10)));
    }
}
