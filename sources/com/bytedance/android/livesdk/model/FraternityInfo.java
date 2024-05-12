package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public class FraternityInfo {

    @InterfaceC65349Pkn("background")
    public ImageModel background;

    @InterfaceC65349Pkn("font_color")
    public String fontColor;

    @InterfaceC65349Pkn("level")
    public long level;

    @InterfaceC65349Pkn("name")
    public String name;

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.name) && this.level > 0 && this.background != null) {
            return true;
        }
        return false;
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public void setLevel(long j) {
        this.level = j;
    }

    public void setName(String str) {
        this.name = str;
    }
}
