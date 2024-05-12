package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditInfo implements Serializable {

    @InterfaceC65349Pkn("captionContentList")
    public List<String> captionContentList;

    @InterfaceC65349Pkn("effectIdList")
    public List<String> effectIdList;

    @InterfaceC65349Pkn("filterIdList")
    public List<String> filterIdList;

    @InterfaceC65349Pkn("musicIdList")
    public List<String> musicIdList;

    @InterfaceC65349Pkn("stickerContentList")
    public List<String> stickerContentList;

    @InterfaceC65349Pkn("stickerIdList")
    public List<String> stickerIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public EditInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean hasInfo() {
        if (this.effectIdList != null || this.musicIdList != null || this.stickerIdList != null || this.stickerContentList != null || this.captionContentList != null || this.filterIdList != null) {
            return true;
        }
        return false;
    }

    public final List<String> getCaptionContentList() {
        return this.captionContentList;
    }

    public final List<String> getEffectIdList() {
        return this.effectIdList;
    }

    public final List<String> getFilterIdList() {
        return this.filterIdList;
    }

    public final List<String> getMusicIdList() {
        return this.musicIdList;
    }

    public final List<String> getStickerContentList() {
        return this.stickerContentList;
    }

    public final List<String> getStickerIdList() {
        return this.stickerIdList;
    }

    public final boolean isEqualWith(EditInfo editInfo) {
        if (editInfo == null || !o.LJ(this.effectIdList, editInfo.effectIdList) || !o.LJ(this.musicIdList, editInfo.musicIdList) || !o.LJ(this.stickerIdList, editInfo.stickerIdList) || !o.LJ(this.stickerContentList, editInfo.stickerContentList) || !o.LJ(this.captionContentList, editInfo.captionContentList)) {
            return false;
        }
        return o.LJ(this.filterIdList, editInfo.filterIdList);
    }

    public final void setCaptionContentList(List<String> list) {
        this.captionContentList = list;
    }

    public final void setEffectIdList(List<String> list) {
        this.effectIdList = list;
    }

    public final void setFilterIdList(List<String> list) {
        this.filterIdList = list;
    }

    public final void setMusicIdList(List<String> list) {
        this.musicIdList = list;
    }

    public final void setStickerContentList(List<String> list) {
        this.stickerContentList = list;
    }

    public final void setStickerIdList(List<String> list) {
        this.stickerIdList = list;
    }

    public EditInfo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.effectIdList = list;
        this.musicIdList = list2;
        this.stickerIdList = list3;
        this.stickerContentList = list4;
        this.captionContentList = list5;
        this.filterIdList = list6;
    }

    public /* synthetic */ EditInfo(List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) == 0 ? list6 : null);
    }
}
