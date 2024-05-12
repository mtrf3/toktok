package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Pile extends F9E {

    @InterfaceC65349Pkn("background_cards")
    public List<String> bgCards;

    @InterfaceC65349Pkn("background_image")
    public String bgImage;

    @InterfaceC65349Pkn("button")
    public ThemeButton button;

    @InterfaceC65349Pkn("material_id")
    public String materialId;

    @InterfaceC65349Pkn("multi_show_count")
    public int multiShowCount;

    @InterfaceC65349Pkn("music_url")
    public final String music;

    @InterfaceC65349Pkn("picture_pile")
    public List<String> picturePile;

    @InterfaceC65349Pkn("pile_description")
    public final Title pileDescription;

    @InterfaceC65349Pkn("placeholders")
    public List<TextPlaceHolder> placeHolders;

    @InterfaceC65349Pkn("refresh_count")
    public int refreshCount;

    @InterfaceC65349Pkn("title")
    public final Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Integer.valueOf(this.multiShowCount), this.music, Integer.valueOf(this.refreshCount), this.title, this.bgImage, this.placeHolders, this.button, this.bgCards, this.picturePile, this.pileDescription};
    }

    public Pile(String materialId, int i, String music, int i2, Title title, String bgImage, List<TextPlaceHolder> list, ThemeButton themeButton, List<String> list2, List<String> list3, Title pileDescription) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(music, "music");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(bgImage, "bgImage");
        o.LJIIIZ(pileDescription, "pileDescription");
        this.materialId = materialId;
        this.multiShowCount = i;
        this.music = music;
        this.refreshCount = i2;
        this.title = title;
        this.bgImage = bgImage;
        this.placeHolders = list;
        this.button = themeButton;
        this.bgCards = list2;
        this.picturePile = list3;
        this.pileDescription = pileDescription;
    }

    public /* synthetic */ Pile(String str, int i, String str2, int i2, Title title, String str3, List list, ThemeButton themeButton, List list2, List list3, Title title2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, i, str2, i2, title, str3, list, themeButton, list2, list3, title2);
    }
}
