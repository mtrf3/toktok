package com.ss.android.ugc.aweme.profile.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes5.dex */
public final class BlockApi {
    public static final BlockService LIZ = (BlockService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(BlockService.class);

    /* loaded from: classes5.dex */
    public interface BlockService {
        @E8L("/aweme/v1/user/block/")
        InterfaceC37276Ek4<BlockStruct> block(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2, @InterfaceC64986Pew("block_type") int i, @InterfaceC64986Pew("source") int i2);
    }
}
