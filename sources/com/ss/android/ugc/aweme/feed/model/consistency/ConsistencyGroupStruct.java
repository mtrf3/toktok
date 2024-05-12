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
public final class ConsistencyGroupStruct implements Serializable {

    @InterfaceC65349Pkn("consistency_video_type")
    public Integer consistencyVideoType;

    @InterfaceC65349Pkn("delete_reason")
    public String deleteReason;

    @InterfaceC65349Pkn("delete_stage")
    public Integer deleteStage;

    @InterfaceC65349Pkn("provide_reason")
    public String provideReason;

    @InterfaceC65349Pkn("provide_stage")
    public Integer provideStage;

    @InterfaceC65349Pkn("rerank_reason")
    public String rerankReason;

    @InterfaceC65349Pkn("sec_video_type")
    public List<String> secVideoType = new ArrayList();

    @InterfaceC65349Pkn("group_extra_info")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public HashMap<String, String> groupExtraInfo = new HashMap<>();

    @InterfaceC65349Pkn("rerank_reason_list")
    public List<String> rerankReasonList = new ArrayList();

    public final Integer getConsistencyVideoType() {
        return this.consistencyVideoType;
    }

    public final String getDeleteReason() {
        return this.deleteReason;
    }

    public final Integer getDeleteStage() {
        return this.deleteStage;
    }

    public final HashMap<String, String> getGroupExtraInfo() {
        return this.groupExtraInfo;
    }

    public final String getProvideReason() {
        return this.provideReason;
    }

    public final Integer getProvideStage() {
        return this.provideStage;
    }

    public final String getRerankReason() {
        return this.rerankReason;
    }

    public final List<String> getRerankReasonList() {
        return this.rerankReasonList;
    }

    public final List<String> getSecVideoType() {
        return this.secVideoType;
    }

    public final void setConsistencyVideoType(Integer num) {
        this.consistencyVideoType = num;
    }

    public final void setDeleteReason(String str) {
        this.deleteReason = str;
    }

    public final void setDeleteStage(Integer num) {
        this.deleteStage = num;
    }

    public final void setGroupExtraInfo(HashMap<String, String> hashMap) {
        this.groupExtraInfo = hashMap;
    }

    public final void setProvideReason(String str) {
        this.provideReason = str;
    }

    public final void setProvideStage(Integer num) {
        this.provideStage = num;
    }

    public final void setRerankReason(String str) {
        this.rerankReason = str;
    }

    public final void setRerankReasonList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.rerankReasonList = list;
    }

    public final void setSecVideoType(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.secVideoType = list;
    }
}
