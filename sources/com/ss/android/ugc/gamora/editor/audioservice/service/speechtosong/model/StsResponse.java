package com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsResponse {

    @InterfaceC65349Pkn("extra")
    public final Extra extra;

    @InterfaceC65349Pkn("result")
    public final List<StsResult> result;

    @InterfaceC65349Pkn("template_id_list")
    public final List<String> templateIdList;

    @InterfaceC65349Pkn("warp_timemaps")
    public final Map<String, List<List<Float>>> warpTimeMaps;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StsResponse)) {
            return false;
        }
        StsResponse stsResponse = (StsResponse) obj;
        return o.LJ(this.extra, stsResponse.extra) && o.LJ(this.result, stsResponse.result) && o.LJ(this.templateIdList, stsResponse.templateIdList) && o.LJ(this.warpTimeMaps, stsResponse.warpTimeMaps);
    }

    public final int hashCode() {
        Extra extra = this.extra;
        int hashCode = (extra == null ? 0 : extra.hashCode()) * 31;
        List<StsResult> list = this.result;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.templateIdList;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, List<List<Float>>> map = this.warpTimeMaps;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StsResponse(extra=");
        LIZ.append(this.extra);
        LIZ.append(", result=");
        LIZ.append(this.result);
        LIZ.append(", templateIdList=");
        LIZ.append(this.templateIdList);
        LIZ.append(", warpTimeMaps=");
        return C15890jp.LIZ(LIZ, this.warpTimeMaps, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StsResponse(Extra extra, List<StsResult> list, List<String> list2, Map<String, ? extends List<? extends List<Float>>> map) {
        this.extra = extra;
        this.result = list;
        this.templateIdList = list2;
        this.warpTimeMaps = map;
    }
}
