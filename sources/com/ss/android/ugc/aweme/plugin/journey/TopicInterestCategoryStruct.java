package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TopicInterestCategoryStruct {

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("localized_title")
    public String localizedTitle;

    @InterfaceC65349Pkn("topics")
    public final List<TopicInterestCategoryItemStruct> topics;

    public TopicInterestCategoryStruct(String id, String str, String str2, List<TopicInterestCategoryItemStruct> list) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.localizedTitle = str;
        this.iconUrl = str2;
        this.topics = list;
    }

    public /* synthetic */ TopicInterestCategoryStruct(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
