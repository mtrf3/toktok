package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchLandingPageExtraData extends F9E implements Serializable {

    @InterfaceC65349Pkn("img_url")
    public final String cardImageUrl;

    @InterfaceC65349Pkn("title")
    public final String cardTitle;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("list_item_id")
    public final String listItemId;

    @InterfaceC65349Pkn("list_result_type")
    public final String listItemType;

    @InterfaceC65349Pkn("page_type")
    public final String pageType;

    @InterfaceC65349Pkn("search_id")
    public final String searchId;

    @InterfaceC65349Pkn("search_keyword")
    public final String searchKeyWord;

    @InterfaceC65349Pkn("search_result_id")
    public final String searchResultId;

    @InterfaceC65349Pkn("token_type")
    public final String tokenType;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchLandingPageExtraData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchLandingPageExtraData copy$default(SearchLandingPageExtraData searchLandingPageExtraData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchLandingPageExtraData.searchId;
        }
        if ((i & 2) != 0) {
            str2 = searchLandingPageExtraData.searchResultId;
        }
        if ((i & 4) != 0) {
            str3 = searchLandingPageExtraData.listItemId;
        }
        if ((i & 8) != 0) {
            str4 = searchLandingPageExtraData.listItemType;
        }
        if ((i & 16) != 0) {
            str5 = searchLandingPageExtraData.enterFrom;
        }
        if ((i & 32) != 0) {
            str6 = searchLandingPageExtraData.searchKeyWord;
        }
        if ((i & 64) != 0) {
            str7 = searchLandingPageExtraData.tokenType;
        }
        if ((i & 128) != 0) {
            str8 = searchLandingPageExtraData.pageType;
        }
        if ((i & 256) != 0) {
            str9 = searchLandingPageExtraData.cardImageUrl;
        }
        if ((i & 512) != 0) {
            str10 = searchLandingPageExtraData.cardTitle;
        }
        return searchLandingPageExtraData.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final SearchLandingPageExtraData copy(String searchId, String searchResultId, String listItemId, String listItemType, String enterFrom, String searchKeyWord, String tokenType, String pageType, String cardImageUrl, String cardTitle) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(listItemId, "listItemId");
        o.LJIIIZ(listItemType, "listItemType");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(searchKeyWord, "searchKeyWord");
        o.LJIIIZ(tokenType, "tokenType");
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(cardImageUrl, "cardImageUrl");
        o.LJIIIZ(cardTitle, "cardTitle");
        return new SearchLandingPageExtraData(searchId, searchResultId, listItemId, listItemType, enterFrom, searchKeyWord, tokenType, pageType, cardImageUrl, cardTitle);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.searchId, this.searchResultId, this.listItemId, this.listItemType, this.enterFrom, this.searchKeyWord, this.tokenType, this.pageType, this.cardImageUrl, this.cardTitle};
    }

    public final String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getListItemId() {
        return this.listItemId;
    }

    public final String getListItemType() {
        return this.listItemType;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public final String getSearchResultId() {
        return this.searchResultId;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public SearchLandingPageExtraData(String searchId, String searchResultId, String listItemId, String listItemType, String enterFrom, String searchKeyWord, String tokenType, String pageType, String cardImageUrl, String cardTitle) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(listItemId, "listItemId");
        o.LJIIIZ(listItemType, "listItemType");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(searchKeyWord, "searchKeyWord");
        o.LJIIIZ(tokenType, "tokenType");
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(cardImageUrl, "cardImageUrl");
        o.LJIIIZ(cardTitle, "cardTitle");
        this.searchId = searchId;
        this.searchResultId = searchResultId;
        this.listItemId = listItemId;
        this.listItemType = listItemType;
        this.enterFrom = enterFrom;
        this.searchKeyWord = searchKeyWord;
        this.tokenType = tokenType;
        this.pageType = pageType;
        this.cardImageUrl = cardImageUrl;
        this.cardTitle = cardTitle;
    }

    public /* synthetic */ SearchLandingPageExtraData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}
