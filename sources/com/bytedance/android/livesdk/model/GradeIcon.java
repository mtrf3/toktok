package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes16.dex */
public class GradeIcon {

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("icon_diamond")
    public int iconDiamond;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("level_str")
    public String levelStr;

    public final int hashCode() {
        int i;
        String str = this.levelStr;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.iconDiamond) * 31;
        ImageModel imageModel = this.icon;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return ((i3 + i2) * 31) + this.level;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradeIcon gradeIcon = (GradeIcon) obj;
        if (this.iconDiamond != gradeIcon.iconDiamond || this.level != gradeIcon.level) {
            return false;
        }
        String str = this.levelStr;
        if (str == null ? gradeIcon.levelStr != null : !str.equals(gradeIcon.levelStr)) {
            return false;
        }
        ImageModel imageModel = this.icon;
        ImageModel imageModel2 = gradeIcon.icon;
        if (imageModel != null) {
            return imageModel.equals(imageModel2);
        }
        if (imageModel2 == null) {
            return true;
        }
        return false;
    }
}
