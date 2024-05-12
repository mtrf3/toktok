package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CommercePitayaInfo implements Serializable {

    @InterfaceC65349Pkn("client_ai_upload_json_str")
    public String pitayaUpload;

    @InterfaceC65349Pkn("sati_param_for_pitaya")
    public String satiParamForPitaya;

    /* JADX WARN: Multi-variable type inference failed */
    public CommercePitayaInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommercePitayaInfo copy$default(CommercePitayaInfo commercePitayaInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commercePitayaInfo.pitayaUpload;
        }
        if ((i & 2) != 0) {
            str2 = commercePitayaInfo.satiParamForPitaya;
        }
        return commercePitayaInfo.copy(str, str2);
    }

    public final CommercePitayaInfo copy(String str, String str2) {
        return new CommercePitayaInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommercePitayaInfo)) {
            return false;
        }
        CommercePitayaInfo commercePitayaInfo = (CommercePitayaInfo) obj;
        return o.LJ(this.pitayaUpload, commercePitayaInfo.pitayaUpload) && o.LJ(this.satiParamForPitaya, commercePitayaInfo.satiParamForPitaya);
    }

    public int hashCode() {
        String str = this.pitayaUpload;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.satiParamForPitaya;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommercePitayaInfo(pitayaUpload=");
        LIZ.append(this.pitayaUpload);
        LIZ.append(", satiParamForPitaya=");
        return q.LIZIZ(LIZ, this.satiParamForPitaya, ')', LIZ);
    }

    public final String getPitayaUpload() {
        return this.pitayaUpload;
    }

    public final String getSatiParamForPitaya() {
        return this.satiParamForPitaya;
    }

    public final void setPitayaUpload(String str) {
        this.pitayaUpload = str;
    }

    public final void setSatiParamForPitaya(String str) {
        this.satiParamForPitaya = str;
    }

    public CommercePitayaInfo(String str, String str2) {
        this.pitayaUpload = str;
        this.satiParamForPitaya = str2;
    }

    public /* synthetic */ CommercePitayaInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
