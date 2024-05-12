package com.ss.android.ugc.aweme.search.pages.sug.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSugWordResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public Map<String, String> logPB;

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @InterfaceC65349Pkn("sug_word_list")
    public List<SearchSugInfo> sugWordList;

    public final String LJ() {
        Map<String, String> map = this.logPB;
        if (map == null || map.isEmpty()) {
            return "";
        }
        Map<String, String> map2 = this.logPB;
        o.LJI(map2);
        String str = map2.get("impr_id");
        if (str == null || str.length() == 0) {
            return "";
        }
        Map<String, String> map3 = this.logPB;
        o.LJI(map3);
        String str2 = map3.get("impr_id");
        o.LJI(str2);
        return str2;
    }
}
