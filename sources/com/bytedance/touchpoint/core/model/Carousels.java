package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Carousels extends F9E {

    @InterfaceC65349Pkn("background_image")
    public String bgImage;

    @InterfaceC65349Pkn("button")
    public ThemeButton button;

    @InterfaceC65349Pkn("carousel")
    public List<CarouselContent> carousel;

    @InterfaceC65349Pkn("carousel_highlight_color")
    public HighLightText highlightColor;

    @InterfaceC65349Pkn("material_id")
    public String materialId;

    @InterfaceC65349Pkn("multi_show_count")
    public int multiShowCount;

    @InterfaceC65349Pkn("music_url")
    public final String music;

    @InterfaceC65349Pkn("carousel_normal_color")
    public String normalColor;

    @InterfaceC65349Pkn("placeholders")
    public List<TextPlaceHolder> placeHolders;

    @InterfaceC65349Pkn("refresh_count")
    public int refreshCount;

    @InterfaceC65349Pkn("switch_after_seconds")
    public int switchSeconds;

    @InterfaceC65349Pkn("title_image")
    public String titleImage;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Integer.valueOf(this.multiShowCount), this.music, Integer.valueOf(this.refreshCount), Integer.valueOf(this.switchSeconds), this.bgImage, this.titleImage, this.highlightColor, this.normalColor, this.placeHolders, this.carousel, this.button};
    }

    public Carousels(String materialId, int i, String music, int i2, int i3, String bgImage, String titleImage, HighLightText highLightText, String normalColor, List<TextPlaceHolder> list, List<CarouselContent> carousel, ThemeButton themeButton) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(music, "music");
        o.LJIIIZ(bgImage, "bgImage");
        o.LJIIIZ(titleImage, "titleImage");
        o.LJIIIZ(normalColor, "normalColor");
        o.LJIIIZ(carousel, "carousel");
        this.materialId = materialId;
        this.multiShowCount = i;
        this.music = music;
        this.refreshCount = i2;
        this.switchSeconds = i3;
        this.bgImage = bgImage;
        this.titleImage = titleImage;
        this.highlightColor = highLightText;
        this.normalColor = normalColor;
        this.placeHolders = list;
        this.carousel = carousel;
        this.button = themeButton;
    }

    public /* synthetic */ Carousels(String str, int i, String str2, int i2, int i3, String str3, String str4, HighLightText highLightText, String str5, List list, List list2, ThemeButton themeButton, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, i, str2, i2, i3, str3, str4, highLightText, (i4 & 256) != 0 ? "#000000" : str5, list, list2, themeButton);
    }
}
