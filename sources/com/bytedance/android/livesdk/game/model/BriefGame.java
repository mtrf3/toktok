package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class BriefGame extends F9E {

    @InterfaceC65349Pkn("android_package")
    public String androidPackage;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("ios_bundle_id")
    public String iosBundleId;

    @InterfaceC65349Pkn("labels")
    public List<String> labels;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("open_gll")
    public int openGll;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        String str = this.idStr;
        String str2 = this.name;
        String str3 = this.icon;
        List<String> list = this.labels;
        String str4 = this.androidPackage;
        String str5 = this.iosBundleId;
        return new Object[]{l, l, str, str, str2, str2, str3, str3, list, list, list, str4, str4, str5, str5};
    }
}
