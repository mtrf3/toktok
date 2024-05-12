package com.ss.android.ugc.aweme.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManagementPagePaidVideo {

    @InterfaceC65349Pkn("cover_uri")
    public final String coverUri;

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("item_id")
    public final String id;

    @InterfaceC65349Pkn("is_intro")
    public final boolean isIntro;

    @InterfaceC65349Pkn("desc")
    public final String title;

    @InterfaceC65349Pkn("status")
    public final ManagementPagePaidVideoStatus videoStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagementPagePaidVideo)) {
            return false;
        }
        ManagementPagePaidVideo managementPagePaidVideo = (ManagementPagePaidVideo) obj;
        return o.LJ(this.id, managementPagePaidVideo.id) && o.LJ(this.title, managementPagePaidVideo.title) && this.duration == managementPagePaidVideo.duration && o.LJ(this.coverUrl, managementPagePaidVideo.coverUrl) && this.isIntro == managementPagePaidVideo.isIntro && o.LJ(this.coverUri, managementPagePaidVideo.coverUri) && this.videoStatus == managementPagePaidVideo.videoStatus;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ManagementPagePaidVideo(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", isIntro=");
        LIZ.append(this.isIntro);
        LIZ.append(", coverUri=");
        LIZ.append(this.coverUri);
        LIZ.append(", videoStatus=");
        LIZ.append(this.videoStatus);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.duration, C79062V1e.LJ(this.title, this.id.hashCode() * 31, 31), 31);
        String str = this.coverUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        boolean z = this.isIntro;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str2 = this.coverUri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.videoStatus.hashCode() + ((i4 + i) * 31);
    }

    public ManagementPagePaidVideo(String id, String title, long j, String str, boolean z, String str2, ManagementPagePaidVideoStatus videoStatus) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(videoStatus, "videoStatus");
        this.id = id;
        this.title = title;
        this.duration = j;
        this.coverUrl = str;
        this.isIntro = z;
        this.coverUri = str2;
        this.videoStatus = videoStatus;
    }

    public /* synthetic */ ManagementPagePaidVideo(String str, String str2, long j, String str3, boolean z, String str4, ManagementPagePaidVideoStatus managementPagePaidVideoStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) == 0 ? str4 : null, managementPagePaidVideoStatus);
    }
}
