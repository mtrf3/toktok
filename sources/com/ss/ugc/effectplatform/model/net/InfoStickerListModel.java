package com.ss.ugc.effectplatform.model.net;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class InfoStickerListModel extends F9E {
    public Integer cursor;
    public String extra;
    public Boolean has_more;
    public List<InfoStickerEffect> sticker_list;
    public String subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoStickerListModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoStickerListModel copy$default(InfoStickerListModel infoStickerListModel, String str, Integer num, Boolean bool, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoStickerListModel.subtitle;
        }
        if ((i & 2) != 0) {
            num = infoStickerListModel.cursor;
        }
        if ((i & 4) != 0) {
            bool = infoStickerListModel.has_more;
        }
        if ((i & 8) != 0) {
            list = infoStickerListModel.sticker_list;
        }
        if ((i & 16) != 0) {
            str2 = infoStickerListModel.extra;
        }
        return infoStickerListModel.copy(str, num, bool, list, str2);
    }

    public final InfoStickerListModel copy(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        return new InfoStickerListModel(str, num, bool, list, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.subtitle, this.cursor, this.has_more, this.sticker_list, this.extra};
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> getSticker_list() {
        return this.sticker_list;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setSticker_list(List<InfoStickerEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public InfoStickerListModel(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        this.subtitle = str;
        this.cursor = num;
        this.has_more = bool;
        this.sticker_list = list;
        this.extra = str2;
    }

    public /* synthetic */ InfoStickerListModel(String str, Integer num, Boolean bool, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) == 0 ? str2 : null);
    }
}
