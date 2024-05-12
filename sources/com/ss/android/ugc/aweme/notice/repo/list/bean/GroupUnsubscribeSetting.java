package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GroupUnsubscribeSetting {

    @InterfaceC65349Pkn("account_type")
    public final String accountType;

    @InterfaceC65349Pkn("group_description")
    public final String desc;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("image_url")
    public final UrlModel imageUrl;

    @InterfaceC65349Pkn("image_url_dark")
    public final UrlModel imageUrlDark;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("unsubscribe_channel_settings")
    public final List<UnSubscribeSettingsData> unsubscribeCategoryList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupUnsubscribeSetting)) {
            return false;
        }
        GroupUnsubscribeSetting groupUnsubscribeSetting = (GroupUnsubscribeSetting) obj;
        return this.group == groupUnsubscribeSetting.group && o.LJ(this.name, groupUnsubscribeSetting.name) && o.LJ(this.desc, groupUnsubscribeSetting.desc) && o.LJ(this.imageUrl, groupUnsubscribeSetting.imageUrl) && o.LJ(this.imageUrlDark, groupUnsubscribeSetting.imageUrlDark) && o.LJ(this.unsubscribeCategoryList, groupUnsubscribeSetting.unsubscribeCategoryList) && o.LJ(this.accountType, groupUnsubscribeSetting.accountType);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.desc, C79062V1e.LJ(this.name, this.group * 31, 31), 31);
        UrlModel urlModel = this.imageUrl;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        UrlModel urlModel2 = this.imageUrlDark;
        if (urlModel2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<UnSubscribeSettingsData> list = this.unsubscribeCategoryList;
        if (list != null) {
            i = list.hashCode();
        }
        return this.accountType.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupUnsubscribeSetting(group=");
        LIZ.append(this.group);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", imageUrlDark=");
        LIZ.append(this.imageUrlDark);
        LIZ.append(", unsubscribeCategoryList=");
        LIZ.append(this.unsubscribeCategoryList);
        LIZ.append(", accountType=");
        return q.LIZIZ(LIZ, this.accountType, ')', LIZ);
    }

    public GroupUnsubscribeSetting(int i, String str, String str2, UrlModel urlModel, UrlModel urlModel2, List<UnSubscribeSettingsData> list, String str3) {
        HH1.LIZ(str, "name", str2, "desc", str3, "accountType");
        this.group = i;
        this.name = str;
        this.desc = str2;
        this.imageUrl = urlModel;
        this.imageUrlDark = urlModel2;
        this.unsubscribeCategoryList = list;
        this.accountType = str3;
    }

    public /* synthetic */ GroupUnsubscribeSetting(int i, String str, String str2, UrlModel urlModel, UrlModel urlModel2, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, urlModel, urlModel2, list, (i2 & 64) != 0 ? "" : str3);
    }
}
