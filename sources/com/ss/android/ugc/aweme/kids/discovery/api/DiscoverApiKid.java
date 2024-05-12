package com.ss.android.ugc.aweme.kids.discovery.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import X.J8S;
import com.ss.android.ugc.aweme.kids.discovery.model.CategoryList;

/* loaded from: classes9.dex */
public interface DiscoverApiKid {
    public static final J8S LIZ = J8S.LIZ;

    @E8L("/tiktok/v1/kids/category/list/")
    AbstractC73672Svk<CategoryList> getCategoryV2List(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("is_complete") Integer num);
}
