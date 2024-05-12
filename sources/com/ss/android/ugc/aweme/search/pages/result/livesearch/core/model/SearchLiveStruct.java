package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class SearchLiveStruct implements Serializable {
    public LogPbBean LJLIL;

    @InterfaceC65349Pkn("lives")
    public Aweme liveAweme;

    @InterfaceC65349Pkn("type")
    public int type;

    public int hashCode() {
        return this.liveAweme.hashCode() + (this.type * 31);
    }

    public Aweme getLiveAweme() {
        return this.liveAweme;
    }

    public LogPbBean getLogPbBean() {
        return this.LJLIL;
    }

    public int getType() {
        return this.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) obj;
        if (this.type != searchLiveStruct.type) {
            return false;
        }
        return this.liveAweme.equals(searchLiveStruct.liveAweme);
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.LJLIL = logPbBean;
    }

    public void setType(int i) {
        this.type = i;
    }
}
