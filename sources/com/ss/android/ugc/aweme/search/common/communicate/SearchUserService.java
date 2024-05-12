package com.ss.android.ugc.aweme.search.common.communicate;

import X.C00F;
import X.C10K;
import X.C250859sv;
import X.C250889sy;
import X.C58096Mr6;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchUserService implements ISearchUserService {
    public static ISearchUserService LJFF() {
        Object LIZ = C58096Mr6.LIZ(ISearchUserService.class, false);
        if (LIZ != null) {
            return (ISearchUserService) LIZ;
        }
        if (C58096Mr6.F4 == null) {
            synchronized (ISearchUserService.class) {
                if (C58096Mr6.F4 == null) {
                    C58096Mr6.F4 = new SearchUserService();
                }
            }
        }
        return C58096Mr6.F4;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final boolean LJ() {
        if (C00F.LIZ(31744, 0, "disable_relationship", true) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final C10K<SearchUserSugResponse> LIZIZ(C250859sv c250859sv) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchUserSugAsync, key: ");
        LIZ.append(c250859sv.LIZJ);
        LIZ.append(", count: ");
        LIZ.append(c250859sv.LJ);
        LIZ.append(", source: ");
        LIZ.append(c250859sv.LIZLLL);
        LIZ.append(", filter-size: ");
        List<String> list = c250859sv.LJFF;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        return ((SearchSugApi.Api) SearchSugApi.LIZ.getValue()).fetchUserSugAsync(c250859sv.LIZ, c250859sv.LIZIZ, c250859sv.LIZJ, c250859sv.LIZLLL, c250859sv.LJ, SearchSugApi.LIZ(c250859sv.LJFF));
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final SearchUserSugResponse LIZLLL(C250859sv request) {
        Integer num;
        o.LJIIIZ(request, "request");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchUserSug, key: ");
        LIZ.append(request.LIZJ);
        LIZ.append(", count: ");
        LIZ.append(request.LJ);
        LIZ.append(", source: ");
        LIZ.append(request.LIZLLL);
        LIZ.append(", filter-size: ");
        List<String> list = request.LJFF;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        SearchUserSugResponse searchUserSugResponse = ((SearchSugApi.Api) SearchSugApi.LIZ.getValue()).fetchUserSug(request.LIZ, request.LIZIZ, request.LIZJ, request.LIZLLL, request.LJ, SearchSugApi.LIZ(request.LJFF), request.LJI).execute().LIZIZ;
        o.LJIIIIZZ(searchUserSugResponse, "RETROFIT.fetchUserSug(re…ute()\n            .body()");
        return searchUserSugResponse;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String LIZ(Context context, String str) {
        return C250889sy.LIZIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String LIZJ(Context context, Integer num) {
        return C250889sy.LIZ(context, num);
    }
}
