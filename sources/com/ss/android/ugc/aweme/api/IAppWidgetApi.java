package com.ss.android.ugc.aweme.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;

/* loaded from: classes7.dex */
public interface IAppWidgetApi {
    @E8L("/tiktok/v1/widget/challenge/")
    InterfaceC37276Ek4<AppWidgetStruct> fetchChallenge(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("widget_size") int i2);
}
