package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PromoteEventPayload implements Serializable {

    @InterfaceC65349Pkn("categories")
    public PromoteEventCategories categories;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("type")
    public String type;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteEventPayload() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final PromoteEventCategories getCategories() {
        return this.categories;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCategories(PromoteEventCategories promoteEventCategories) {
        this.categories = promoteEventCategories;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.type = str;
    }

    public PromoteEventPayload(String name, String type, PromoteEventCategories promoteEventCategories) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(type, "type");
        this.name = name;
        this.type = type;
        this.categories = promoteEventCategories;
    }

    public /* synthetic */ PromoteEventPayload(String str, String str2, PromoteEventCategories promoteEventCategories, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "promote_entrance_click" : str, (i & 2) != 0 ? "event" : str2, (i & 4) != 0 ? null : promoteEventCategories);
    }
}
