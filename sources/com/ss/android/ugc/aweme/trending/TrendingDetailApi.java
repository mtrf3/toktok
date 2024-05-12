package com.ss.android.ugc.aweme.trending;

import X.AbstractC73672Svk;
import X.C37227EjH;
import X.E8L;
import X.E8M;
import X.InterfaceC195737mD;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.search.TrendingItems;

/* loaded from: classes7.dex */
public interface TrendingDetailApi {
    public static final C37227EjH LIZ = C37227EjH.LIZ;

    @E8M("/aweme/v1/trending/search/inflow/")
    @InterfaceC195757mF
    AbstractC73672Svk<TrendingItems> getTrendingDetailDataSearch(@InterfaceC64985Pev("event_id") String str, @InterfaceC64985Pev("offset") int i, @InterfaceC64985Pev("count") int i2, @InterfaceC64985Pev("item_id") String str2, @InterfaceC64985Pev("billboard_type") int i3, @InterfaceC64985Pev("event_list") String str3);

    @E8L("tiktok/trends/inflow/video/v1/")
    AbstractC73672Svk<TrendingItems> getTrendingDetailFYP(@InterfaceC64986Pew("event_id") String str, @InterfaceC64986Pew("offset") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("billboard_type") int i3, @InterfaceC64986Pew("event_list") String str3, @InterfaceC64986Pew("item_list") String str4, @InterfaceC64986Pew("need_billboard") boolean z, @InterfaceC64986Pew("is_preload") Integer num, @InterfaceC195737mD Object obj);
}
