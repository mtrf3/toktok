package com.ss.android.ugc.aweme.discover.model;

import X.C64668PZo;
import X.InterfaceC50111Jlb;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchApiResult extends BaseResponse implements InterfaceC65316PkG, K4J {

    @InterfaceC65349Pkn("components")
    public List<ComponentInfo> components;

    @InterfaceC65349Pkn("header")
    public DynamicPatch dynamicHeader;

    @InterfaceC65349Pkn("mask_layer")
    public DynamicPatch dynamicMask;

    @InterfaceC65349Pkn("global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;

    @InterfaceC65349Pkn("headers")
    public List<SearchHeaderData> headerData;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC50111Jlb
    @InterfaceC65349Pkn("prefer_layout")
    public String preferredLayout;

    @InterfaceC65349Pkn("query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    public String requestId = "";
    public C64668PZo requestInfo;

    @InterfaceC65349Pkn("search_nil_info")
    public SearchNilInfo searchNilInfo;

    @InterfaceC65349Pkn("search_nil_text")
    public SearchNilText searchNilText;

    @Override // X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.K4J
    public C64668PZo getRequestInfo() {
        return this.requestInfo;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.K4J
    public void setRequestInfo(C64668PZo c64668PZo) {
        this.requestInfo = c64668PZo;
    }
}
