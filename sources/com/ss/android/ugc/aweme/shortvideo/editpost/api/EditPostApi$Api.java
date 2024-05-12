package com.ss.android.ugc.aweme.shortvideo.editpost.api;

import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public interface EditPostApi$Api {
    @E8M("/tiktok/post/edit/v1/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<EditPostResponse> createEditPost(@InterfaceC36229EJt LinkedHashMap<String, String> linkedHashMap);
}
