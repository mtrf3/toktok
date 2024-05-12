package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes12.dex */
public final class BlackApiManager {
    public static final BlackApi LIZ = (BlackApi) C46104I7o.LJIIZILJ(Api.LIZ, BlackApi.class);

    /* loaded from: classes12.dex */
    public interface BlackApi {
        @E4Q("/aweme/v1/user/block/list/")
        C76L<BlackList> fetchBlackList(@InterfaceC64989Pez("index") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/aweme/v1/im/set/chatpriv/")
        C76L<BaseResponse> setChatAuthority(@InterfaceC64989Pez("val") int i);
    }

    public static BlackList LIZ(int i) {
        try {
            return LIZ.fetchBlackList(i, 10).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
