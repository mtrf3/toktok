package com.ss.android.ugc.aweme.canvas;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ForwardVideo implements Serializable {

    @InterfaceC65349Pkn("awemeId")
    public final String awemeId;

    @InterfaceC65349Pkn("cacheCoverModel")
    public final UrlModel cacheCoverModel;

    @InterfaceC65349Pkn("needSetCookie")
    public final boolean needSetCookie;

    @InterfaceC65349Pkn("originCoverModel")
    public final UrlModel originCoverModel;

    @InterfaceC65349Pkn("playAddressList")
    public List<String> playAddressList;

    @InterfaceC65349Pkn("simVideoUrlModel")
    public final SimVideoUrlModel simVideoUrlModel;

    @InterfaceC65349Pkn("sourceCoverList")
    public final List<String> sourceCoverList;

    @InterfaceC65349Pkn("sourceDuration")
    public final int sourceDuration;

    @InterfaceC65349Pkn("sourceHeight")
    public final int sourceHeight;

    @InterfaceC65349Pkn("sourceMeta")
    public final String sourceMeta;

    @InterfaceC65349Pkn("sourceVID")
    public final String sourceVID;

    @InterfaceC65349Pkn("sourceWidth")
    public final int sourceWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForwardVideo copy$default(ForwardVideo forwardVideo, List list, List list2, int i, int i2, int i3, String str, String str2, String str3, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = forwardVideo.playAddressList;
        }
        if ((i4 & 2) != 0) {
            list2 = forwardVideo.sourceCoverList;
        }
        if ((i4 & 4) != 0) {
            i = forwardVideo.sourceWidth;
        }
        if ((i4 & 8) != 0) {
            i2 = forwardVideo.sourceHeight;
        }
        if ((i4 & 16) != 0) {
            i3 = forwardVideo.sourceDuration;
        }
        if ((i4 & 32) != 0) {
            str = forwardVideo.sourceMeta;
        }
        if ((i4 & 64) != 0) {
            str2 = forwardVideo.sourceVID;
        }
        if ((i4 & 128) != 0) {
            str3 = forwardVideo.awemeId;
        }
        if ((i4 & 256) != 0) {
            z = forwardVideo.needSetCookie;
        }
        if ((i4 & 512) != 0) {
            simVideoUrlModel = forwardVideo.simVideoUrlModel;
        }
        if ((i4 & 1024) != 0) {
            urlModel = forwardVideo.cacheCoverModel;
        }
        if ((i4 & 2048) != 0) {
            urlModel2 = forwardVideo.originCoverModel;
        }
        return forwardVideo.copy(list, list2, i, i2, i3, str, str2, str3, z, simVideoUrlModel, urlModel, urlModel2);
    }

    public final ForwardVideo copy(List<String> playAddressList, List<String> sourceCoverList, int i, int i2, int i3, String str, String sourceVID, String awemeId, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2) {
        o.LJIIIZ(playAddressList, "playAddressList");
        o.LJIIIZ(sourceCoverList, "sourceCoverList");
        o.LJIIIZ(sourceVID, "sourceVID");
        o.LJIIIZ(awemeId, "awemeId");
        return new ForwardVideo(playAddressList, sourceCoverList, i, i2, i3, str, sourceVID, awemeId, z, simVideoUrlModel, urlModel, urlModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardVideo)) {
            return false;
        }
        ForwardVideo forwardVideo = (ForwardVideo) obj;
        return o.LJ(this.playAddressList, forwardVideo.playAddressList) && o.LJ(this.sourceCoverList, forwardVideo.sourceCoverList) && this.sourceWidth == forwardVideo.sourceWidth && this.sourceHeight == forwardVideo.sourceHeight && this.sourceDuration == forwardVideo.sourceDuration && o.LJ(this.sourceMeta, forwardVideo.sourceMeta) && o.LJ(this.sourceVID, forwardVideo.sourceVID) && o.LJ(this.awemeId, forwardVideo.awemeId) && this.needSetCookie == forwardVideo.needSetCookie && o.LJ(this.simVideoUrlModel, forwardVideo.simVideoUrlModel) && o.LJ(this.cacheCoverModel, forwardVideo.cacheCoverModel) && o.LJ(this.originCoverModel, forwardVideo.originCoverModel);
    }

    public String toString() {
        return "ForwardVideo(playAddressList=" + this.playAddressList + ", sourceCoverList=" + this.sourceCoverList + ", sourceWidth=" + this.sourceWidth + ", sourceHeight=" + this.sourceHeight + ", sourceDuration=" + this.sourceDuration + ", sourceMeta=" + this.sourceMeta + ", sourceVID=" + this.sourceVID + ", awemeId=" + this.awemeId + ", needSetCookie=" + this.needSetCookie + ", simVideoUrlModel=" + this.simVideoUrlModel + ", cacheCoverModel=" + this.cacheCoverModel + ", originCoverModel=" + this.originCoverModel + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZIZ = (((((AnonymousClass391.LIZIZ(this.sourceCoverList, this.playAddressList.hashCode() * 31, 31) + this.sourceWidth) * 31) + this.sourceHeight) * 31) + this.sourceDuration) * 31;
        String str = this.sourceMeta;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.awemeId, C79062V1e.LJ(this.sourceVID, (LIZIZ + hashCode) * 31, 31), 31);
        boolean z = this.needSetCookie;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        SimVideoUrlModel simVideoUrlModel = this.simVideoUrlModel;
        if (simVideoUrlModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = simVideoUrlModel.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        UrlModel urlModel = this.cacheCoverModel;
        if (urlModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        UrlModel urlModel2 = this.originCoverModel;
        if (urlModel2 != null) {
            i = urlModel2.hashCode();
        }
        return i5 + i;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final UrlModel getCacheCoverModel() {
        return this.cacheCoverModel;
    }

    public final boolean getNeedSetCookie() {
        return this.needSetCookie;
    }

    public final UrlModel getOriginCoverModel() {
        return this.originCoverModel;
    }

    public final List<String> getPlayAddressList() {
        return this.playAddressList;
    }

    public final SimVideoUrlModel getSimVideoUrlModel() {
        return this.simVideoUrlModel;
    }

    public final List<String> getSourceCoverList() {
        return this.sourceCoverList;
    }

    public final int getSourceDuration() {
        return this.sourceDuration;
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final String getSourceMeta() {
        return this.sourceMeta;
    }

    public final String getSourceVID() {
        return this.sourceVID;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    public final void setPlayAddressList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.playAddressList = list;
    }

    public ForwardVideo(List<String> playAddressList, List<String> sourceCoverList, int i, int i2, int i3, String str, String sourceVID, String awemeId, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2) {
        o.LJIIIZ(playAddressList, "playAddressList");
        o.LJIIIZ(sourceCoverList, "sourceCoverList");
        o.LJIIIZ(sourceVID, "sourceVID");
        o.LJIIIZ(awemeId, "awemeId");
        this.playAddressList = playAddressList;
        this.sourceCoverList = sourceCoverList;
        this.sourceWidth = i;
        this.sourceHeight = i2;
        this.sourceDuration = i3;
        this.sourceMeta = str;
        this.sourceVID = sourceVID;
        this.awemeId = awemeId;
        this.needSetCookie = z;
        this.simVideoUrlModel = simVideoUrlModel;
        this.cacheCoverModel = urlModel;
        this.originCoverModel = urlModel2;
    }

    public ForwardVideo(List list, List list2, int i, int i2, int i3, String str, String str2, String str3, boolean z, SimVideoUrlModel simVideoUrlModel, UrlModel urlModel, UrlModel urlModel2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i4 & 2) != 0 ? C61878OQg.INSTANCE : list2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? "" : str, (i4 & 64) != 0 ? "" : str2, (i4 & 128) == 0 ? str3 : "", (i4 & 256) == 0 ? z : false, (i4 & 512) != 0 ? null : simVideoUrlModel, (i4 & 1024) != 0 ? null : urlModel, (i4 & 2048) == 0 ? urlModel2 : null);
    }
}
