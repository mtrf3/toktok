package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CompactPicture extends F9E {

    @InterfaceC65349Pkn("animation")
    public Animation animation;

    @InterfaceC65349Pkn("background_image")
    public String bgImage;

    @InterfaceC65349Pkn("button")
    public ThemeButton button;

    @InterfaceC65349Pkn("highlight_title")
    public Title highlightTitle;

    @InterfaceC65349Pkn("material_id")
    public final String materialId;

    @InterfaceC65349Pkn("multi_show_count")
    public final int multiShowCount;

    @InterfaceC65349Pkn("music_url")
    public final String music;

    @InterfaceC65349Pkn("placeholders")
    public List<TextPlaceHolder> placeHolders;

    @InterfaceC65349Pkn("refresh_count")
    public int refreshCount;

    @InterfaceC65349Pkn("subtitle")
    public Title subTitle;

    @InterfaceC65349Pkn("title")
    public final Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Integer.valueOf(this.multiShowCount), this.music, Integer.valueOf(this.refreshCount), this.title, this.highlightTitle, this.subTitle, this.animation, this.bgImage, this.placeHolders, this.button};
    }

    public CompactPicture(String materialId, int i, String music, int i2, Title title, Title highlightTitle, Title subTitle, Animation animation, String bgImage, List<TextPlaceHolder> list, ThemeButton button) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(music, "music");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(highlightTitle, "highlightTitle");
        o.LJIIIZ(subTitle, "subTitle");
        o.LJIIIZ(animation, "animation");
        o.LJIIIZ(bgImage, "bgImage");
        o.LJIIIZ(button, "button");
        this.materialId = materialId;
        this.multiShowCount = i;
        this.music = music;
        this.refreshCount = i2;
        this.title = title;
        this.highlightTitle = highlightTitle;
        this.subTitle = subTitle;
        this.animation = animation;
        this.bgImage = bgImage;
        this.placeHolders = list;
        this.button = button;
    }

    public /* synthetic */ CompactPicture(String str, int i, String str2, int i2, Title title, Title title2, Title title3, Animation animation, String str3, List list, ThemeButton themeButton, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, i, str2, i2, title, title2, title3, animation, str3, list, themeButton);
    }
}
