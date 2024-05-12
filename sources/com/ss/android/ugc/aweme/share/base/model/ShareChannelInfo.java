package com.ss.android.ugc.aweme.share.base.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ShareChannelInfo extends F9E {

    @InterfaceC65349Pkn("platform_id")
    public final String channelKey;

    @InterfaceC65349Pkn("icon_url")
    public final String iconRes;

    @InterfaceC65349Pkn("label")
    public final String labelName;

    @InterfaceC65349Pkn("package_name")
    public final String packageName;

    @InterfaceC65349Pkn("target_component_info")
    public final TargetComponentInfo targetComponentInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareChannelInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.channelKey, this.packageName, this.labelName, this.iconRes, this.targetComponentInfo};
    }

    public ShareChannelInfo(String str, String str2, String str3, String str4, TargetComponentInfo targetComponentInfo) {
        C43588H8u.LIZLLL(str, "channelKey", str2, "packageName", str3, "labelName", str4, "iconRes");
        this.channelKey = str;
        this.packageName = str2;
        this.labelName = str3;
        this.iconRes = str4;
        this.targetComponentInfo = targetComponentInfo;
    }

    public /* synthetic */ ShareChannelInfo(String str, String str2, String str3, String str4, TargetComponentInfo targetComponentInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : targetComponentInfo);
    }
}
