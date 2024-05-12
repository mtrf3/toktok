package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes6.dex */
public class NobleLevelInfo {

    @InterfaceC65349Pkn("expire_time")
    public long expireTime;

    @InterfaceC65349Pkn("noble_background")
    public ImageModel nobleBackground;

    @InterfaceC65349Pkn("noble_background_color")
    public List<String> nobleBackgroundColor;

    @InterfaceC65349Pkn("noble_big_icon")
    public ImageModel nobleBigIcon;

    @InterfaceC65349Pkn("noble_boarder")
    public ImageModel nobleBoarder;

    @InterfaceC65349Pkn("noble_icon")
    public ImageModel nobleIcon;

    @InterfaceC65349Pkn("noble_icon_with_back")
    public ImageModel nobleIconWithBack;

    @InterfaceC65349Pkn("noble_level")
    public long nobleLevel;

    @InterfaceC65349Pkn("noble_name")
    public String nobleName;

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j) {
        this.nobleLevel = j;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }
}
