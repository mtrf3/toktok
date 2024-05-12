package com.ss.android.ugc.aweme.vision;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class RDPhotoSearchTraceTime implements Serializable {
    public Long LJLIL;
    public Long LJLILLLLZI;
    public Long LJLJI;
    public Long LJLJJI;

    @InterfaceC65349Pkn("request_end_timestamp")
    public Long netReceive;

    @InterfaceC65349Pkn("request_start_timestamp")
    public Long netRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public RDPhotoSearchTraceTime() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RDPhotoSearchTraceTime copy$default(RDPhotoSearchTraceTime rDPhotoSearchTraceTime, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i, Object obj) {
        if ((i & 1) != 0) {
            l = rDPhotoSearchTraceTime.LJLIL;
        }
        if ((i & 2) != 0) {
            l2 = rDPhotoSearchTraceTime.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            l3 = rDPhotoSearchTraceTime.LJLJI;
        }
        if ((i & 8) != 0) {
            l4 = rDPhotoSearchTraceTime.netRequest;
        }
        if ((i & 16) != 0) {
            l5 = rDPhotoSearchTraceTime.netReceive;
        }
        if ((i & 32) != 0) {
            l6 = rDPhotoSearchTraceTime.LJLJJI;
        }
        return rDPhotoSearchTraceTime.copy(l, l2, l3, l4, l5, l6);
    }

    public final RDPhotoSearchTraceTime copy(Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        return new RDPhotoSearchTraceTime(l, l2, l3, l4, l5, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RDPhotoSearchTraceTime)) {
            return false;
        }
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = (RDPhotoSearchTraceTime) obj;
        return o.LJ(this.LJLIL, rDPhotoSearchTraceTime.LJLIL) && o.LJ(this.LJLILLLLZI, rDPhotoSearchTraceTime.LJLILLLLZI) && o.LJ(this.LJLJI, rDPhotoSearchTraceTime.LJLJI) && o.LJ(this.netRequest, rDPhotoSearchTraceTime.netRequest) && o.LJ(this.netReceive, rDPhotoSearchTraceTime.netReceive) && o.LJ(this.LJLJJI, rDPhotoSearchTraceTime.LJLJJI);
    }

    public int hashCode() {
        Long l = this.LJLIL;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.netRequest;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.netReceive;
        int hashCode5 = (hashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.LJLJJI;
        return hashCode5 + (l6 != null ? l6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RDPhotoSearchTraceTime(enterResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", bgStartLoad=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", bgLoaded=");
        LIZ.append(this.LJLJI);
        LIZ.append(", netRequest=");
        LIZ.append(this.netRequest);
        LIZ.append(", netReceive=");
        LIZ.append(this.netReceive);
        LIZ.append(", netDataProcess=");
        return JBR.LJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final Long getBgLoaded() {
        return this.LJLJI;
    }

    public final Long getBgStartLoad() {
        return this.LJLILLLLZI;
    }

    public final Long getEnterResult() {
        return this.LJLIL;
    }

    public final Long getNetDataProcess() {
        return this.LJLJJI;
    }

    public final Long getNetReceive() {
        return this.netReceive;
    }

    public final Long getNetRequest() {
        return this.netRequest;
    }

    public final void setBgLoaded(Long l) {
        this.LJLJI = l;
    }

    public final void setBgStartLoad(Long l) {
        this.LJLILLLLZI = l;
    }

    public final void setEnterResult(Long l) {
        this.LJLIL = l;
    }

    public final void setNetDataProcess(Long l) {
        this.LJLJJI = l;
    }

    public final void setNetReceive(Long l) {
        this.netReceive = l;
    }

    public final void setNetRequest(Long l) {
        this.netRequest = l;
    }

    public RDPhotoSearchTraceTime(Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        this.LJLIL = l;
        this.LJLILLLLZI = l2;
        this.LJLJI = l3;
        this.netRequest = l4;
        this.netReceive = l5;
        this.LJLJJI = l6;
    }

    public /* synthetic */ RDPhotoSearchTraceTime(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : l5, (i & 32) == 0 ? l6 : null);
    }
}
