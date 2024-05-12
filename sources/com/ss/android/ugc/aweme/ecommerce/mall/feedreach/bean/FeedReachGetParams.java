package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.google.gson.m;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedReachGetParams {

    @InterfaceC65349Pkn("author_uid")
    public final String authorUid;

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("pid_list")
    public final List<String> pidList;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    @InterfaceC65349Pkn("shop_tab_position")
    public final int shopTabPosition;

    @InterfaceC65349Pkn("related_user_info")
    public final m userInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedReachGetParams)) {
            return false;
        }
        FeedReachGetParams feedReachGetParams = (FeedReachGetParams) obj;
        return o.LJ(this.pidList, feedReachGetParams.pidList) && o.LJ(this.awemeId, feedReachGetParams.awemeId) && o.LJ(this.authorUid, feedReachGetParams.authorUid) && this.shopTabPosition == feedReachGetParams.shopTabPosition && this.scene == feedReachGetParams.scene && o.LJ(this.userInfo, feedReachGetParams.userInfo);
    }

    public final int hashCode() {
        List<String> list = this.pidList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.awemeId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorUid;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.shopTabPosition) * 31) + this.scene) * 31;
        m mVar = this.userInfo;
        return hashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedReachGetParams(pidList=");
        LIZ.append(this.pidList);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", authorUid=");
        LIZ.append(this.authorUid);
        LIZ.append(", shopTabPosition=");
        LIZ.append(this.shopTabPosition);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", userInfo=");
        LIZ.append(this.userInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FeedReachGetParams(List<String> list, String str, String str2, int i, int i2, m mVar) {
        this.pidList = list;
        this.awemeId = str;
        this.authorUid = str2;
        this.shopTabPosition = i;
        this.scene = i2;
        this.userInfo = mVar;
    }

    public /* synthetic */ FeedReachGetParams(List list, String str, String str2, int i, int i2, m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, i, i2, (i3 & 32) != 0 ? null : mVar);
    }
}
