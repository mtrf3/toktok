package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Picture extends F9E {

    @InterfaceC65349Pkn("animation")
    public Animation animation;

    @InterfaceC65349Pkn("background_image")
    public String bgImage;

    @InterfaceC65349Pkn("button")
    public FeedButton button;

    @InterfaceC65349Pkn("highlight_title")
    public Title highlightTitle;

    @InterfaceC65349Pkn("material_id")
    public final String materialId;

    @InterfaceC65349Pkn("multi_show_count")
    public final int multiShowCount;

    @InterfaceC65349Pkn("music_url")
    public final String music;

    @InterfaceC65349Pkn("subtitle")
    public Title subTitle;

    @InterfaceC65349Pkn("title")
    public final Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Integer.valueOf(this.multiShowCount), this.title, this.music, this.highlightTitle, this.subTitle, this.animation, this.bgImage, this.button};
    }

    public Picture(String materialId, int i, Title title, String music, Title highlightTitle, Title subTitle, Animation animation, String bgImage, FeedButton button) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(music, "music");
        o.LJIIIZ(highlightTitle, "highlightTitle");
        o.LJIIIZ(subTitle, "subTitle");
        o.LJIIIZ(animation, "animation");
        o.LJIIIZ(bgImage, "bgImage");
        o.LJIIIZ(button, "button");
        this.materialId = materialId;
        this.multiShowCount = i;
        this.title = title;
        this.music = music;
        this.highlightTitle = highlightTitle;
        this.subTitle = subTitle;
        this.animation = animation;
        this.bgImage = bgImage;
        this.button = button;
    }

    public /* synthetic */ Picture(String str, int i, Title title, String str2, Title title2, Title title3, Animation animation, String str3, FeedButton feedButton, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i, title, str2, title2, title3, animation, str3, feedButton);
    }
}
