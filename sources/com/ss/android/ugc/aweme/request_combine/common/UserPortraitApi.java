package com.ss.android.ugc.aweme.request_combine.common;

import X.C38306F1q;
import X.C38333F2r;
import X.C76L;
import X.E4Q;
import X.EFJ;
import X.InterfaceC64989Pez;
import com.google.gson.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UserPortraitApi {
    public static final IRetrofit LIZ = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ);

    /* loaded from: classes7.dex */
    public interface RealApi {
        @E4Q("/tiktok/v1/efficiency_portrait/")
        C76L<m> fetchPortraits(@InterfaceC64989Pez("group_list") String str);
    }

    public static final m LIZ() {
        m mVar = null;
        try {
            mVar = ((RealApi) LIZ.create(RealApi.class)).fetchPortraits("bitrate_selection,socket_dynamic_timeout_strategy").get();
            return mVar;
        } catch (IncompatibleClassChangeError e) {
            e.printStackTrace();
            return mVar;
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof C38333F2r) {
                C38306F1q c38306F1q = (C38306F1q) e2.getCause();
                o.LJI(c38306F1q);
                int errorCode = c38306F1q.getErrorCode();
                if (errorCode == 9 || errorCode == 14) {
                    return mVar;
                }
            }
            throw e2;
        }
    }
}
