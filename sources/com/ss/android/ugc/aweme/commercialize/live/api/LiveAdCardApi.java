package com.ss.android.ugc.aweme.commercialize.live.api;

import X.C59415NTn;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;

/* loaded from: classes11.dex */
public interface LiveAdCardApi {
    public static final C59415NTn LIZ = C59415NTn.LIZ;

    @E8L("/tiktok/v1/ad/live/component/detail/")
    InterfaceC37276Ek4<LiveAdCardModel> getLiveAdCardInfo(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("sec_author_id") String str3, @InterfaceC64986Pew("component_type") int i, @InterfaceC64986Pew("creative_id") long j);
}
