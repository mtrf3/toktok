package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;

/* loaded from: classes6.dex */
public class BorderInfo {

    @InterfaceC65349Pkn("avatar_background_border_color")
    public String avatarBackgroundBorderColor = "";

    @InterfaceC65349Pkn("avatar_background_color")
    public String avatarBackgroundColor = "";

    @InterfaceC65349Pkn("border_privilege_log_extra")
    public PrivilegeLogExtra borderLogExtra;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("level")
    public long level;

    @InterfaceC65349Pkn("profile_decoration_ribbon")
    public ImageModel profileDecorationRibbon;

    @InterfaceC65349Pkn("profile_privilege_log_extra")
    public PrivilegeLogExtra ribbonLogExtra;

    @InterfaceC65349Pkn("source")
    public String source;

    public final int hashCode() {
        int i;
        ImageModel imageModel = this.icon;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        long j = this.level;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BorderInfo borderInfo = (BorderInfo) obj;
        if (this.level != borderInfo.level) {
            return false;
        }
        ImageModel imageModel = this.icon;
        ImageModel imageModel2 = borderInfo.icon;
        if (imageModel != null) {
            return imageModel.equals(imageModel2);
        }
        if (imageModel2 == null) {
            return true;
        }
        return false;
    }
}
