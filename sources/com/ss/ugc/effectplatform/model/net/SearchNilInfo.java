package com.ss.ugc.effectplatform.model.net;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SearchNilInfo {
    public String is_load_more;
    public String search_nil_item;
    public String search_nil_type;
    public Integer text_type;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchNilInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final String getSearch_nil_item() {
        return this.search_nil_item;
    }

    public final String getSearch_nil_type() {
        return this.search_nil_type;
    }

    public final Integer getText_type() {
        return this.text_type;
    }

    public final String is_load_more() {
        return this.is_load_more;
    }

    public final void setSearch_nil_item(String str) {
        this.search_nil_item = str;
    }

    public final void setSearch_nil_type(String str) {
        this.search_nil_type = str;
    }

    public final void setText_type(Integer num) {
        this.text_type = num;
    }

    public final void set_load_more(String str) {
        this.is_load_more = str;
    }

    public SearchNilInfo(String str, String str2, String str3, Integer num) {
        this.search_nil_type = str;
        this.is_load_more = str2;
        this.search_nil_item = str3;
        this.text_type = num;
    }

    public /* synthetic */ SearchNilInfo(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
