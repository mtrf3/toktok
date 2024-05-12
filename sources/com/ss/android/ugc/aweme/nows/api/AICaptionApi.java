package com.ss.android.ugc.aweme.nows.api;

import X.E8M;
import X.ENY;
import X.InterfaceC64977Pen;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;

/* loaded from: classes7.dex */
public interface AICaptionApi {
    @ENY
    @E8M("/tiktok/v1/aigc_caption/generate")
    Object getImageInfo(@InterfaceC64977Pen("file") TypedFile typedFile, @InterfaceC64986Pew("translate_to") String str, InterfaceC67352kd<? super AICaptionNetworkModule.AICaptionResponse> interfaceC67352kd);
}
