package com.ss.android.ugc.aweme.friendstab.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SocialFeedRedDotRequest {

    @InterfaceC65349Pkn("client_read_gids")
    public final List<String> clientReadGids;

    @InterfaceC65349Pkn("client_read_gids_all")
    public final List<String> clientReadGidsAll;

    @InterfaceC65349Pkn("client_read_gids_notification")
    public final List<String> clientReadGidsNotification;

    @InterfaceC65349Pkn("guide_btn_cnt")
    public final int guideButtonCount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialFeedRedDotRequest copy$default(SocialFeedRedDotRequest socialFeedRedDotRequest, List list, List list2, List list3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = socialFeedRedDotRequest.clientReadGids;
        }
        if ((i2 & 2) != 0) {
            list2 = socialFeedRedDotRequest.clientReadGidsNotification;
        }
        if ((i2 & 4) != 0) {
            list3 = socialFeedRedDotRequest.clientReadGidsAll;
        }
        if ((i2 & 8) != 0) {
            i = socialFeedRedDotRequest.guideButtonCount;
        }
        return socialFeedRedDotRequest.copy(list, list2, list3, i);
    }

    public final SocialFeedRedDotRequest copy(List<String> list, List<String> list2, List<String> list3, int i) {
        return new SocialFeedRedDotRequest(list, list2, list3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialFeedRedDotRequest)) {
            return false;
        }
        SocialFeedRedDotRequest socialFeedRedDotRequest = (SocialFeedRedDotRequest) obj;
        return o.LJ(this.clientReadGids, socialFeedRedDotRequest.clientReadGids) && o.LJ(this.clientReadGidsNotification, socialFeedRedDotRequest.clientReadGidsNotification) && o.LJ(this.clientReadGidsAll, socialFeedRedDotRequest.clientReadGidsAll) && this.guideButtonCount == socialFeedRedDotRequest.guideButtonCount;
    }

    public int hashCode() {
        List<String> list = this.clientReadGids;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.clientReadGidsNotification;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.clientReadGidsAll;
        return ((hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.guideButtonCount;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialFeedRedDotRequest(clientReadGids=");
        LIZ.append(this.clientReadGids);
        LIZ.append(", clientReadGidsNotification=");
        LIZ.append(this.clientReadGidsNotification);
        LIZ.append(", clientReadGidsAll=");
        LIZ.append(this.clientReadGidsAll);
        LIZ.append(", guideButtonCount=");
        return b0.LIZJ(LIZ, this.guideButtonCount, ')', LIZ);
    }

    public final List<String> getClientReadGids() {
        return this.clientReadGids;
    }

    public final List<String> getClientReadGidsAll() {
        return this.clientReadGidsAll;
    }

    public final List<String> getClientReadGidsNotification() {
        return this.clientReadGidsNotification;
    }

    public final int getGuideButtonCount() {
        return this.guideButtonCount;
    }

    public SocialFeedRedDotRequest(List<String> list, List<String> list2, List<String> list3, int i) {
        this.clientReadGids = list;
        this.clientReadGidsNotification = list2;
        this.clientReadGidsAll = list3;
        this.guideButtonCount = i;
    }

    public /* synthetic */ SocialFeedRedDotRequest(List list, List list2, List list3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i2 & 8) != 0 ? 0 : i);
    }
}
