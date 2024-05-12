package X;

import Y.ACallableS82S0200000_4;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.9st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250839st extends C8BS<SearchUserSugResponse> {
    public boolean LJLIL;
    public C250859sv LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C247079mp.LJLIL);

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.search.model.SearchUserSugResponse] */
    @Override // X.C8BS
    public final void handleData(SearchUserSugResponse searchUserSugResponse) {
        SearchUserSugResponse searchUserSugResponse2;
        List<String> list;
        SearchUserSugResponse searchUserSugResponse3 = searchUserSugResponse;
        if (searchUserSugResponse3 == 0) {
            return;
        }
        T t = this.mData;
        if (t == 0) {
            this.mData = searchUserSugResponse3;
        } else {
            SearchUserSugResponse searchUserSugResponse4 = (SearchUserSugResponse) t;
            searchUserSugResponse4.logPbBean = searchUserSugResponse3.logPbBean;
            searchUserSugResponse4.requestId = searchUserSugResponse3.requestId;
            searchUserSugResponse4.hasMore = searchUserSugResponse3.hasMore;
        }
        C250859sv c250859sv = this.LJLILLLLZI;
        if (c250859sv != null && (list = c250859sv.LJFF) != null && list.isEmpty()) {
            SearchUserSugResponse searchUserSugResponse5 = (SearchUserSugResponse) this.mData;
            if (searchUserSugResponse5 == null) {
                return;
            }
            searchUserSugResponse5.sugList = searchUserSugResponse3.sugList;
            return;
        }
        List<? extends SearchSugEntity> list2 = searchUserSugResponse3.sugList;
        if (list2 == null) {
            return;
        }
        List<? extends SearchSugEntity> list3 = null;
        if (!(!list2.isEmpty()) || (searchUserSugResponse2 = (SearchUserSugResponse) this.mData) == null) {
            return;
        }
        List<? extends SearchSugEntity> list4 = searchUserSugResponse2.sugList;
        if (list4 != null) {
            list3 = ORZ.LLIIIZ(list2, list4);
        }
        searchUserSugResponse2.sugList = list3;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        Object obj;
        boolean z;
        Object obj2;
        C250859sv c250859sv;
        Boolean bool;
        o.LJIIIZ(params, "params");
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        Integer num = null;
        if (params.length > 0) {
            obj = params[0];
        } else {
            obj = null;
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLIL = z;
        if (1 < params.length) {
            obj2 = params[1];
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof C250859sv) || (c250859sv = (C250859sv) obj2) == null) {
            return false;
        }
        if (a.LJFF().LJJJJI()) {
            num = 1;
        }
        c250859sv.LJI = num;
        if (this.LJLIL) {
            this.mIsLoading = false;
        }
        this.LJLILLLLZI = c250859sv;
        C32022ChW.LIZIZ().LIZ(this.mHandler, new ACallableS82S0200000_4(this, c250859sv, 2), 0);
        return true;
    }
}
