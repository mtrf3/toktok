package com.ss.android.ugc.aweme.utils;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RecommendConsumeParams implements Serializable {

    @InterfaceC65349Pkn("author_id")
    public ArrayList<String> author_id;

    @InterfaceC65349Pkn("bool_params")
    public BoolParams bool_params;

    @InterfaceC65349Pkn("client_cache")
    public ArrayList<String> client_cache;

    @InterfaceC65349Pkn("day_r_num")
    public ArrayList<Integer> day_r_num;

    @InterfaceC65349Pkn("day_v_num")
    public ArrayList<Integer> day_v_num;

    @InterfaceC65349Pkn("day_view_time")
    public Long day_view_time;

    @InterfaceC65349Pkn("duration")
    public ArrayList<Long> duration;

    @InterfaceC65349Pkn("model_type")
    public ArrayList<Integer> model_type;

    @InterfaceC65349Pkn("playtime")
    public ArrayList<Long> playtime;

    @InterfaceC65349Pkn("playtime_currentlive")
    public ArrayList<Long> playtime_currentlive;

    @InterfaceC65349Pkn("playtime_live")
    public ArrayList<Long> playtime_live;

    @InterfaceC65349Pkn("session_r_num")
    public ArrayList<Integer> session_r_num;

    @InterfaceC65349Pkn("session_v_num")
    public ArrayList<Integer> session_v_num;

    @InterfaceC65349Pkn("vid")
    public ArrayList<String> vid;

    @InterfaceC65349Pkn("vv")
    public ArrayList<Integer> vv;

    public RecommendConsumeParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static /* synthetic */ RecommendConsumeParams copy$default(RecommendConsumeParams recommendConsumeParams, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9, ArrayList arrayList10, ArrayList arrayList11, Long l, ArrayList arrayList12, ArrayList arrayList13, BoolParams boolParams, int i, Object obj) {
        ArrayList arrayList14 = arrayList2;
        ArrayList arrayList15 = arrayList;
        ArrayList arrayList16 = arrayList4;
        ArrayList arrayList17 = arrayList3;
        ArrayList arrayList18 = arrayList6;
        ArrayList arrayList19 = arrayList5;
        ArrayList arrayList20 = arrayList8;
        ArrayList arrayList21 = arrayList7;
        ArrayList arrayList22 = arrayList10;
        ArrayList arrayList23 = arrayList9;
        Long l2 = l;
        ArrayList arrayList24 = arrayList11;
        ArrayList arrayList25 = arrayList13;
        ArrayList arrayList26 = arrayList12;
        BoolParams boolParams2 = boolParams;
        if ((i & 1) != 0) {
            arrayList15 = recommendConsumeParams.vid;
        }
        if ((i & 2) != 0) {
            arrayList14 = recommendConsumeParams.model_type;
        }
        if ((i & 4) != 0) {
            arrayList17 = recommendConsumeParams.playtime;
        }
        if ((i & 8) != 0) {
            arrayList16 = recommendConsumeParams.playtime_live;
        }
        if ((i & 16) != 0) {
            arrayList19 = recommendConsumeParams.playtime_currentlive;
        }
        if ((i & 32) != 0) {
            arrayList18 = recommendConsumeParams.duration;
        }
        if ((i & 64) != 0) {
            arrayList21 = recommendConsumeParams.vv;
        }
        if ((i & 128) != 0) {
            arrayList20 = recommendConsumeParams.session_v_num;
        }
        if ((i & 256) != 0) {
            arrayList23 = recommendConsumeParams.session_r_num;
        }
        if ((i & 512) != 0) {
            arrayList22 = recommendConsumeParams.day_v_num;
        }
        if ((i & 1024) != 0) {
            arrayList24 = recommendConsumeParams.day_r_num;
        }
        if ((i & 2048) != 0) {
            l2 = recommendConsumeParams.day_view_time;
        }
        if ((i & 4096) != 0) {
            arrayList26 = recommendConsumeParams.author_id;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            arrayList25 = recommendConsumeParams.client_cache;
        }
        if ((i & 16384) != 0) {
            boolParams2 = recommendConsumeParams.bool_params;
        }
        return recommendConsumeParams.copy(arrayList15, arrayList14, arrayList17, arrayList16, arrayList19, arrayList18, arrayList21, arrayList20, arrayList23, arrayList22, arrayList24, l2, arrayList26, arrayList25, boolParams2);
    }

    public final RecommendConsumeParams copy(ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Long> arrayList3, ArrayList<Long> arrayList4, ArrayList<Long> arrayList5, ArrayList<Long> arrayList6, ArrayList<Integer> arrayList7, ArrayList<Integer> arrayList8, ArrayList<Integer> arrayList9, ArrayList<Integer> arrayList10, ArrayList<Integer> arrayList11, Long l, ArrayList<String> arrayList12, ArrayList<String> arrayList13, BoolParams boolParams) {
        return new RecommendConsumeParams(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, l, arrayList12, arrayList13, boolParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendConsumeParams)) {
            return false;
        }
        RecommendConsumeParams recommendConsumeParams = (RecommendConsumeParams) obj;
        return o.LJ(this.vid, recommendConsumeParams.vid) && o.LJ(this.model_type, recommendConsumeParams.model_type) && o.LJ(this.playtime, recommendConsumeParams.playtime) && o.LJ(this.playtime_live, recommendConsumeParams.playtime_live) && o.LJ(this.playtime_currentlive, recommendConsumeParams.playtime_currentlive) && o.LJ(this.duration, recommendConsumeParams.duration) && o.LJ(this.vv, recommendConsumeParams.vv) && o.LJ(this.session_v_num, recommendConsumeParams.session_v_num) && o.LJ(this.session_r_num, recommendConsumeParams.session_r_num) && o.LJ(this.day_v_num, recommendConsumeParams.day_v_num) && o.LJ(this.day_r_num, recommendConsumeParams.day_r_num) && o.LJ(this.day_view_time, recommendConsumeParams.day_view_time) && o.LJ(this.author_id, recommendConsumeParams.author_id) && o.LJ(this.client_cache, recommendConsumeParams.client_cache) && o.LJ(this.bool_params, recommendConsumeParams.bool_params);
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.vid;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<Integer> arrayList2 = this.model_type;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<Long> arrayList3 = this.playtime;
        int hashCode3 = (hashCode2 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList<Long> arrayList4 = this.playtime_live;
        int hashCode4 = (hashCode3 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        ArrayList<Long> arrayList5 = this.playtime_currentlive;
        int hashCode5 = (hashCode4 + (arrayList5 == null ? 0 : arrayList5.hashCode())) * 31;
        ArrayList<Long> arrayList6 = this.duration;
        int hashCode6 = (hashCode5 + (arrayList6 == null ? 0 : arrayList6.hashCode())) * 31;
        ArrayList<Integer> arrayList7 = this.vv;
        int hashCode7 = (hashCode6 + (arrayList7 == null ? 0 : arrayList7.hashCode())) * 31;
        ArrayList<Integer> arrayList8 = this.session_v_num;
        int hashCode8 = (hashCode7 + (arrayList8 == null ? 0 : arrayList8.hashCode())) * 31;
        ArrayList<Integer> arrayList9 = this.session_r_num;
        int hashCode9 = (hashCode8 + (arrayList9 == null ? 0 : arrayList9.hashCode())) * 31;
        ArrayList<Integer> arrayList10 = this.day_v_num;
        int hashCode10 = (hashCode9 + (arrayList10 == null ? 0 : arrayList10.hashCode())) * 31;
        ArrayList<Integer> arrayList11 = this.day_r_num;
        int hashCode11 = (hashCode10 + (arrayList11 == null ? 0 : arrayList11.hashCode())) * 31;
        Long l = this.day_view_time;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        ArrayList<String> arrayList12 = this.author_id;
        int hashCode13 = (hashCode12 + (arrayList12 == null ? 0 : arrayList12.hashCode())) * 31;
        ArrayList<String> arrayList13 = this.client_cache;
        int hashCode14 = (hashCode13 + (arrayList13 == null ? 0 : arrayList13.hashCode())) * 31;
        BoolParams boolParams = this.bool_params;
        return hashCode14 + (boolParams != null ? boolParams.hashCode() : 0);
    }

    public String toString() {
        return "RecommendConsumeParams(vid=" + this.vid + ", model_type=" + this.model_type + ", playtime=" + this.playtime + ", playtime_live=" + this.playtime_live + ", playtime_currentlive=" + this.playtime_currentlive + ", duration=" + this.duration + ", vv=" + this.vv + ", session_v_num=" + this.session_v_num + ", session_r_num=" + this.session_r_num + ", day_v_num=" + this.day_v_num + ", day_r_num=" + this.day_r_num + ", day_view_time=" + this.day_view_time + ", author_id=" + this.author_id + ", client_cache=" + this.client_cache + ", bool_params=" + this.bool_params + ')';
    }

    public final ArrayList<String> getAuthor_id() {
        return this.author_id;
    }

    public final BoolParams getBool_params() {
        return this.bool_params;
    }

    public final ArrayList<String> getClient_cache() {
        return this.client_cache;
    }

    public final ArrayList<Integer> getDay_r_num() {
        return this.day_r_num;
    }

    public final ArrayList<Integer> getDay_v_num() {
        return this.day_v_num;
    }

    public final Long getDay_view_time() {
        return this.day_view_time;
    }

    public final ArrayList<Long> getDuration() {
        return this.duration;
    }

    public final ArrayList<Integer> getModel_type() {
        return this.model_type;
    }

    public final ArrayList<Long> getPlaytime() {
        return this.playtime;
    }

    public final ArrayList<Long> getPlaytime_currentlive() {
        return this.playtime_currentlive;
    }

    public final ArrayList<Long> getPlaytime_live() {
        return this.playtime_live;
    }

    public final ArrayList<Integer> getSession_r_num() {
        return this.session_r_num;
    }

    public final ArrayList<Integer> getSession_v_num() {
        return this.session_v_num;
    }

    public final ArrayList<String> getVid() {
        return this.vid;
    }

    public final ArrayList<Integer> getVv() {
        return this.vv;
    }

    public final void setAuthor_id(ArrayList<String> arrayList) {
        this.author_id = arrayList;
    }

    public final void setBool_params(BoolParams boolParams) {
        this.bool_params = boolParams;
    }

    public final void setClient_cache(ArrayList<String> arrayList) {
        this.client_cache = arrayList;
    }

    public final void setDay_r_num(ArrayList<Integer> arrayList) {
        this.day_r_num = arrayList;
    }

    public final void setDay_v_num(ArrayList<Integer> arrayList) {
        this.day_v_num = arrayList;
    }

    public final void setDay_view_time(Long l) {
        this.day_view_time = l;
    }

    public final void setDuration(ArrayList<Long> arrayList) {
        this.duration = arrayList;
    }

    public final void setModel_type(ArrayList<Integer> arrayList) {
        this.model_type = arrayList;
    }

    public final void setPlaytime(ArrayList<Long> arrayList) {
        this.playtime = arrayList;
    }

    public final void setPlaytime_currentlive(ArrayList<Long> arrayList) {
        this.playtime_currentlive = arrayList;
    }

    public final void setPlaytime_live(ArrayList<Long> arrayList) {
        this.playtime_live = arrayList;
    }

    public final void setSession_r_num(ArrayList<Integer> arrayList) {
        this.session_r_num = arrayList;
    }

    public final void setSession_v_num(ArrayList<Integer> arrayList) {
        this.session_v_num = arrayList;
    }

    public final void setVid(ArrayList<String> arrayList) {
        this.vid = arrayList;
    }

    public final void setVv(ArrayList<Integer> arrayList) {
        this.vv = arrayList;
    }

    public RecommendConsumeParams(ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Long> arrayList3, ArrayList<Long> arrayList4, ArrayList<Long> arrayList5, ArrayList<Long> arrayList6, ArrayList<Integer> arrayList7, ArrayList<Integer> arrayList8, ArrayList<Integer> arrayList9, ArrayList<Integer> arrayList10, ArrayList<Integer> arrayList11, Long l, ArrayList<String> arrayList12, ArrayList<String> arrayList13, BoolParams boolParams) {
        this.vid = arrayList;
        this.model_type = arrayList2;
        this.playtime = arrayList3;
        this.playtime_live = arrayList4;
        this.playtime_currentlive = arrayList5;
        this.duration = arrayList6;
        this.vv = arrayList7;
        this.session_v_num = arrayList8;
        this.session_r_num = arrayList9;
        this.day_v_num = arrayList10;
        this.day_r_num = arrayList11;
        this.day_view_time = l;
        this.author_id = arrayList12;
        this.client_cache = arrayList13;
        this.bool_params = boolParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecommendConsumeParams(java.util.ArrayList r30, java.util.ArrayList r31, java.util.ArrayList r32, java.util.ArrayList r33, java.util.ArrayList r34, java.util.ArrayList r35, java.util.ArrayList r36, java.util.ArrayList r37, java.util.ArrayList r38, java.util.ArrayList r39, java.util.ArrayList r40, java.lang.Long r41, java.util.ArrayList r42, java.util.ArrayList r43, com.ss.android.ugc.aweme.utils.BoolParams r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.RecommendConsumeParams.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.Long, java.util.ArrayList, java.util.ArrayList, com.ss.android.ugc.aweme.utils.BoolParams, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
