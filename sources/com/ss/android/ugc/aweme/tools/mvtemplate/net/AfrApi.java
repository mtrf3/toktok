package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.AbstractC73672Svk;
import X.E8M;
import X.ENY;
import X.InterfaceC64977Pen;
import X.InterfaceC64986Pew;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.j;

/* loaded from: classes7.dex */
public interface AfrApi {
    @ENY
    @E8M("/media/api/pic/afr")
    AbstractC73672Svk<ImageResponse> getImageInfo(@InterfaceC64986Pew("algorithms") String str, @InterfaceC64986Pew("key") String str2, @InterfaceC64986Pew("algorithm_type") String str3, @InterfaceC64977Pen("file") TypedFile typedFile, @InterfaceC64977Pen("conf") j jVar);

    @ENY
    @E8M("/media/api/pic/video")
    AbstractC73672Svk<VideoResponse> getVideoInfo(@InterfaceC64986Pew("algorithm") String str, @InterfaceC64986Pew("key") String str2, @InterfaceC64986Pew("algorithm_type") int i, @InterfaceC64977Pen("file") TypedFile typedFile, @InterfaceC64977Pen("conf") j jVar);
}
