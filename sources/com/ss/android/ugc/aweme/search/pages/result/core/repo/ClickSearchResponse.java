package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ClickSearchResponse {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @InterfaceC65349Pkn("sug_word_list")
    public final List<ClickSearchWord> wordsList;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickSearchResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickSearchResponse)) {
            return false;
        }
        ClickSearchResponse clickSearchResponse = (ClickSearchResponse) obj;
        return o.LJ(this.wordsList, clickSearchResponse.wordsList) && o.LJ(this.logPbBean, clickSearchResponse.logPbBean) && o.LJ(this.qrecVirtualEnable, clickSearchResponse.qrecVirtualEnable);
    }

    public final int hashCode() {
        List<ClickSearchWord> list = this.wordsList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int hashCode2 = (hashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        String str = this.qrecVirtualEnable;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickSearchResponse(wordsList=");
        LIZ.append(this.wordsList);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(", qrecVirtualEnable=");
        return q.LIZIZ(LIZ, this.qrecVirtualEnable, ')', LIZ);
    }

    public ClickSearchResponse(List<ClickSearchWord> list, LogPbBean logPbBean, String str) {
        this.wordsList = list;
        this.logPbBean = logPbBean;
        this.qrecVirtualEnable = str;
    }

    public /* synthetic */ ClickSearchResponse(List list, LogPbBean logPbBean, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : logPbBean, (i & 4) != 0 ? null : str);
    }
}
