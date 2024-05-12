package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public class DoodleTemplate {

    @InterfaceC65349Pkn("template_id")
    public long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;
    public boolean selected;

    public long getId() {
        return this.id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
