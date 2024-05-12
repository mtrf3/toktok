package com.ss.android.ugc.aweme.notification.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NotificationSubscribeSettingsList extends BaseResponse {

    @InterfaceC65349Pkn("unsubscribe_settings")
    public final List<UnSubscribeSettingsData> unSubscribeSettingList;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSubscribeSettingsList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationSubscribeSettingsList) && o.LJ(this.unSubscribeSettingList, ((NotificationSubscribeSettingsList) obj).unSubscribeSettingList);
    }

    public final int hashCode() {
        List<UnSubscribeSettingsData> list = this.unSubscribeSettingList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotificationSubscribeSettingsList(unSubscribeSettingList=");
        return C1NE.LIZIZ(LIZ, this.unSubscribeSettingList, ')', LIZ);
    }

    public NotificationSubscribeSettingsList(List<UnSubscribeSettingsData> list) {
        this.unSubscribeSettingList = list;
    }

    public /* synthetic */ NotificationSubscribeSettingsList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
