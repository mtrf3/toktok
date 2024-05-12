package com.ss.android.ugc.aweme.feed.model.consistency;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConsistencyRspStruct implements Serializable {

    @InterfaceC65349Pkn("consistency_extra_info")
    public String consistencyExtraInfo;

    @InterfaceC65349Pkn("consistency_req_extra_info")
    public String consistencyReqExtraInfo;

    @InterfaceC65349Pkn("consistency_user_extra_info")
    public String consistencyUserExtraInfo;

    @InterfaceC65349Pkn("c_rsp_type")
    public int rspType;

    @InterfaceC65349Pkn("consistency_groups")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public HashMap<Long, ConsistencyGroupStruct> consistencyGroups = new HashMap<>();

    @InterfaceC65349Pkn("final_gid_list")
    public List<Long> finalGidList = new ArrayList();

    @InterfaceC65349Pkn("sort_gid_list")
    public List<Long> sortGidList = new ArrayList();

    @InterfaceC65349Pkn("sati_gid_list")
    public List<Long> satiGidList = new ArrayList();

    @InterfaceC65349Pkn("fyp_gid_list")
    public List<Long> fypGidList = new ArrayList();

    @InterfaceC65349Pkn("client_gid_list")
    public List<Long> clientGidList = new ArrayList();

    @InterfaceC65349Pkn("rerank_reason_list")
    public List<String> rerankReasonLis = new ArrayList();

    public final List<Long> getClientGidList() {
        return this.clientGidList;
    }

    public final String getConsistencyExtraInfo() {
        return this.consistencyExtraInfo;
    }

    public final HashMap<Long, ConsistencyGroupStruct> getConsistencyGroups() {
        return this.consistencyGroups;
    }

    public final String getConsistencyReqExtraInfo() {
        return this.consistencyReqExtraInfo;
    }

    public final String getConsistencyUserExtraInfo() {
        return this.consistencyUserExtraInfo;
    }

    public final List<Long> getFinalGidList() {
        return this.finalGidList;
    }

    public final List<Long> getFypGidList() {
        return this.fypGidList;
    }

    public final List<String> getRerankReasonLis() {
        return this.rerankReasonLis;
    }

    public final int getRspType() {
        return this.rspType;
    }

    public final List<Long> getSatiGidList() {
        return this.satiGidList;
    }

    public final List<Long> getSortGidList() {
        return this.sortGidList;
    }

    public final void setClientGidList(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.clientGidList = list;
    }

    public final void setConsistencyExtraInfo(String str) {
        this.consistencyExtraInfo = str;
    }

    public final void setConsistencyGroups(HashMap<Long, ConsistencyGroupStruct> hashMap) {
        this.consistencyGroups = hashMap;
    }

    public final void setConsistencyReqExtraInfo(String str) {
        this.consistencyReqExtraInfo = str;
    }

    public final void setConsistencyUserExtraInfo(String str) {
        this.consistencyUserExtraInfo = str;
    }

    public final void setFinalGidList(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.finalGidList = list;
    }

    public final void setFypGidList(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.fypGidList = list;
    }

    public final void setRerankReasonLis(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.rerankReasonLis = list;
    }

    public final void setRspType(int i) {
        this.rspType = i;
    }

    public final void setSatiGidList(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.satiGidList = list;
    }

    public final void setSortGidList(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.sortGidList = list;
    }
}
