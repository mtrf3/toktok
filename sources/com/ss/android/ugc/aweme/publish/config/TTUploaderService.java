package com.ss.android.ugc.aweme.publish.config;

import X.AbstractC73672Svk;
import X.C60903NvH;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.EnumC41098GBa;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;

/* loaded from: classes8.dex */
public final class TTUploaderService {

    /* loaded from: classes8.dex */
    public interface RetrofitService {
        @E4Q("/aweme/v1/pre/post/check/")
        C76L<Object> getServerPrePostResult(@InterfaceC64989Pez("check_type") int i, @InterfaceC64989Pez("freq_limit") int i2);

        @E4T("/aweme/v1/post/prompts/")
        AbstractC73672Svk<CheckTitleSensitivityResult> getTitleSensitivityResult(@InterfaceC64989Pez("text") String str, @InterfaceC64989Pez("text_type") int i);
    }

    public static AbstractC73672Svk<CheckTitleSensitivityResult> LIZ(String str, EnumC41098GBa enumC41098GBa) {
        return ((RetrofitService) C60903NvH.LJIIJJI().getNetworkService().retrofitCreate(AVApiImpl.LIZJ().LIZ(), RetrofitService.class)).getTitleSensitivityResult(str, enumC41098GBa.getValue());
    }
}
