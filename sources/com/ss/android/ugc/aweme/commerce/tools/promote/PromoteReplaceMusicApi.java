package com.ss.android.ugc.aweme.commerce.tools.promote;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public final class PromoteReplaceMusicApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes8.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/aweme/v1/promote/api/item/modify/music")
        InterfaceC37276Ek4<BaseResponse> get(@InterfaceC64987Pex("itemID") String str, @InterfaceC64987Pex("prevMusicID") String str2, @InterfaceC64987Pex("modifyMusicID") String str3, @InterfaceC64987Pex("retry") int i);
    }
}
