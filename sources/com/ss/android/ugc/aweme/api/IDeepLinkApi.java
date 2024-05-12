package com.ss.android.ugc.aweme.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.bytedance.retrofit2.mime.TypedInput;

/* loaded from: classes7.dex */
public interface IDeepLinkApi {
    @E8L
    InterfaceC37276Ek4<TypedInput> fetchLongUrl(@InterfaceC195747mE String str, @InterfaceC195737mD Object obj);

    @E8L("/tiktok/linker/target/get/v1/")
    AbstractC73672Svk<LinkTransResult> transUrl(@InterfaceC64986Pew("url") String str);

    @E8L("/tiktok/linker/target/get/v1/")
    InterfaceC37276Ek4<LinkTransResult> transUrlCall(@InterfaceC64986Pew("url") String str);
}
