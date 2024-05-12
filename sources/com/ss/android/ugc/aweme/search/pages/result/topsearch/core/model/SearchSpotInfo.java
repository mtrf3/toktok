package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSpotInfo {

    @InterfaceC65349Pkn("button_link")
    public final String buttonSchema;

    @InterfaceC65349Pkn("button_title")
    public final String buttonText;

    @InterfaceC65349Pkn("event_id")
    public final Long eventId;

    @InterfaceC65349Pkn("event_id_str")
    public final String eventIdStr;

    @InterfaceC65349Pkn("icon")
    public String frameIcon;

    @InterfaceC65349Pkn("hot_value")
    public long hotValue;

    @InterfaceC65349Pkn("rank_number")
    public String rankNumber;

    @InterfaceC65349Pkn("sentence")
    public String sentence = "";

    public final int hashCode() {
        return this.sentence.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SearchSpotInfo.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpotInfo");
        if (o.LJ(this.sentence, ((SearchSpotInfo) obj).sentence)) {
            return true;
        }
        return false;
    }
}
