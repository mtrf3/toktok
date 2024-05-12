package com.ss.android.ugc.aweme.feed.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.O1A;
import com.google.gson.o;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class AnchorCommonStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("custom_anchor_state")
    public int anchorState;

    @InterfaceC65349Pkn("general_type")
    public int generalType;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @O1A
    @InterfaceC65349Pkn("new_style_bubble_icon")
    public UrlModel newStyleBubbleIcon;

    @InterfaceC65349Pkn("real_count")
    public int realCount;

    @InterfaceC65349Pkn("show_in_search_result")
    public boolean showInSearchResult;

    @InterfaceC65349Pkn("thumbnail")
    public UrlModel thumbnail;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("language")
    public String language = "";

    @InterfaceC65349Pkn("schema")
    public String schema = "";

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("most_relevant_product_id")
    public String mostRelevantProductId = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    @InterfaceC65349Pkn("deep_link")
    public String deepLink = "";

    @InterfaceC65349Pkn("universal_link")
    public String universalLink = "";

    @InterfaceC65349Pkn("show_type")
    public int showType = 1;

    @InterfaceC65349Pkn("description")
    public String description = "";

    @InterfaceC65349Pkn("actions")
    public List<AnchorPanelAction> actions = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("component_key")
    public String componentKey = "";

    @InterfaceC65349Pkn("impression_id")
    public String impressionId = "";

    public final String subType() {
        String str;
        try {
            new o();
            String str2 = this.extra;
            if (str2 == null) {
                str2 = "";
            }
            p LJJIJL = o.LIZ(str2).LJIIZILJ().LJJIJL("sub_type");
            if (LJJIJL != null) {
                str = LJJIJL.LJJIFFI();
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final List<AnchorPanelAction> getActions() {
        return this.actions;
    }

    public final int getAnchorState() {
        return this.anchorState;
    }

    public final String getComponentKey() {
        return this.componentKey;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getGeneralType() {
        return this.generalType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMostRelevantProductId() {
        return this.mostRelevantProductId;
    }

    public final UrlModel getNewStyleBubbleIcon() {
        return this.newStyleBubbleIcon;
    }

    public final int getRealCount() {
        return this.realCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean getShowInSearchResult() {
        return this.showInSearchResult;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAnchorState(int i) {
        this.anchorState = i;
    }

    public final void setComponentKey(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.componentKey = str;
    }

    public final void setExtra(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setImpressionId(String str) {
        this.impressionId = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setNewStyleBubbleIcon(UrlModel urlModel) {
        this.newStyleBubbleIcon = urlModel;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
