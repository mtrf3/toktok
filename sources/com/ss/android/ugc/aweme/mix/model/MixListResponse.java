package com.ss.android.ugc.aweme.mix.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class MixListResponse extends BaseResponse implements Serializable {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("mix_list")
    public List<MixStruct> mixList;

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getKeyWord() {
        return this.LJLIL;
    }

    public final List<MixStruct> getMixList() {
        return this.mixList;
    }

    public final String getSearchId() {
        return this.LJLILLLLZI;
    }

    public final String getSearchResultId() {
        return this.LJLJI;
    }

    public final String getSearchType() {
        return this.LJLJJI;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setKeyWord(String str) {
        this.LJLIL = str;
    }

    public final void setMixList(List<MixStruct> list) {
        this.mixList = list;
    }

    public final void setSearchId(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setSearchResultId(String str) {
        this.LJLJI = str;
    }

    public final void setSearchType(String str) {
        this.LJLJJI = str;
    }
}
