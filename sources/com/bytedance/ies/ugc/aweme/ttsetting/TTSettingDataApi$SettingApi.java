package com.bytedance.ies.ugc.aweme.ttsetting;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.google.gson.j;

/* loaded from: classes7.dex */
public interface TTSettingDataApi$SettingApi {
    @E8L("/service/settings/v2/")
    InterfaceC37276Ek4<j> getResponse(@InterfaceC64986Pew("has_local_cache") boolean z, @InterfaceC64986Pew("app") int i, @InterfaceC64986Pew("default") int i2);
}
