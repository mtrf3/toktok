package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TopicInterestCategoryItemStruct {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("interest_type")
    public final Integer interest_type;

    @InterfaceC65349Pkn("level")
    public final Integer level;

    @InterfaceC65349Pkn("selected")
    public final Boolean selected;

    @InterfaceC65349Pkn("text")
    public String text;

    public TopicInterestCategoryItemStruct(String id, String str, Integer num, Integer num2, Boolean bool) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.text = str;
        this.interest_type = num;
        this.level = num2;
        this.selected = bool;
    }

    public /* synthetic */ TopicInterestCategoryItemStruct(String str, String str2, Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) == 0 ? bool : null);
    }
}
