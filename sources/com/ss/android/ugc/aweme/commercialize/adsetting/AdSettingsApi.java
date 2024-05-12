package com.ss.android.ugc.aweme.commercialize.adsetting;

import X.C25945AGf;
import X.E4Q;
import X.E4T;
import X.InterfaceC37276Ek4;
import X.InterfaceC64989Pez;

/* loaded from: classes5.dex */
public interface AdSettingsApi {
    public static final C25945AGf LIZ = C25945AGf.LIZ;

    @E4Q("/aweme/v1/ad/settings/")
    InterfaceC37276Ek4<String> requestAdSettings(@InterfaceC64989Pez("item_id") String str);

    @E4T("/aweme/v1/ad/settings/code/delete/")
    InterfaceC37276Ek4<String> requestCodeDelete(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("confirm") boolean z);

    @E4T("/tiktok/v1/ad/auth/extend/")
    InterfaceC37276Ek4<String> requestCodeExtend(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("extend_time") long j);

    @E4T("/aweme/v1/ad/settings/code/generate/")
    InterfaceC37276Ek4<String> requestCodeGenerate(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("start_time") long j, @InterfaceC64989Pez("end_time") long j2);

    @E4T("/tiktok/v1/ad/dark/post/update/")
    InterfaceC37276Ek4<String> requestDarkPostUpdate(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("status") int i);

    @E4T("/aweme/v1/ad/settings/promote/update/")
    InterfaceC37276Ek4<String> requestPromoteUpdate(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("promotable") boolean z);
}
