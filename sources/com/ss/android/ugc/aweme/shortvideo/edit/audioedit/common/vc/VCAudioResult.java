package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VCAudioResult {

    @InterfaceC65349Pkn("data")
    public final String data;

    @InterfaceC65349Pkn("original_vid")
    public final String originalVid;

    @InterfaceC65349Pkn("sami_status")
    public final Integer samiStatus;

    @InterfaceC65349Pkn("speaker")
    public final String speaker;

    @InterfaceC65349Pkn("task_id")
    public final String taskId;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("vid")
    public final String vid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCAudioResult)) {
            return false;
        }
        VCAudioResult vCAudioResult = (VCAudioResult) obj;
        return o.LJ(this.data, vCAudioResult.data) && o.LJ(this.taskId, vCAudioResult.taskId) && o.LJ(this.url, vCAudioResult.url) && o.LJ(this.speaker, vCAudioResult.speaker) && o.LJ(this.vid, vCAudioResult.vid) && o.LJ(this.originalVid, vCAudioResult.originalVid) && o.LJ(this.samiStatus, vCAudioResult.samiStatus);
    }

    public final int hashCode() {
        String str = this.data;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.speaker;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vid;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.originalVid;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.samiStatus;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VCAudioResult(data=");
        LIZ.append(this.data);
        LIZ.append(", taskId=");
        LIZ.append(this.taskId);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", speaker=");
        LIZ.append(this.speaker);
        LIZ.append(", vid=");
        LIZ.append(this.vid);
        LIZ.append(", originalVid=");
        LIZ.append(this.originalVid);
        LIZ.append(", samiStatus=");
        return s0.LIZJ(LIZ, this.samiStatus, ')', LIZ);
    }

    public VCAudioResult(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.data = str;
        this.taskId = str2;
        this.url = str3;
        this.speaker = str4;
        this.vid = str5;
        this.originalVid = str6;
        this.samiStatus = num;
    }
}
