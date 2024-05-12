package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ProviderEffectModel {
    public int cursor;
    public String extra;
    public String feed_session_id;
    public boolean has_more;
    public String impression_id;
    public Integer last_clip_cursor;
    public Integer last_gif_cursor;
    public List<? extends ProviderEffect> library_list;
    public String media_source;
    public String search_tips;
    public List<? extends ProviderEffect> sticker_list;
    public String subtitle;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProviderEffectModel() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.ProviderEffectModel.<init>():void");
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFeed_session_id() {
        return this.feed_session_id;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getImpression_id() {
        return this.impression_id;
    }

    public Integer getLast_clip_cursor() {
        return this.last_clip_cursor;
    }

    public Integer getLast_gif_cursor() {
        return this.last_gif_cursor;
    }

    public List<ProviderEffect> getLibrary_list() {
        return this.library_list;
    }

    public String getMedia_source() {
        return this.media_source;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFeed_session_id(String str) {
        this.feed_session_id = str;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setImpression_id(String str) {
        this.impression_id = str;
    }

    public void setLast_clip_cursor(Integer num) {
        this.last_clip_cursor = num;
    }

    public void setLast_gif_cursor(Integer num) {
        this.last_gif_cursor = num;
    }

    public void setLibrary_list(List<? extends ProviderEffect> list) {
        this.library_list = list;
    }

    public void setMedia_source(String str) {
        this.media_source = str;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setSticker_list(List<? extends ProviderEffect> list) {
        o.LJIIJ(list, "<set-?>");
        this.sticker_list = list;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public ProviderEffectModel(String str, int i, boolean z, List<? extends ProviderEffect> sticker_list, String str2, String str3, String str4, Integer num, Integer num2, List<? extends ProviderEffect> list, String str5, String str6) {
        o.LJIIJ(sticker_list, "sticker_list");
        this.search_tips = str;
        this.cursor = i;
        this.has_more = z;
        this.sticker_list = sticker_list;
        this.subtitle = str2;
        this.extra = str3;
        this.impression_id = str4;
        this.last_clip_cursor = num;
        this.last_gif_cursor = num2;
        this.library_list = list;
        this.media_source = str5;
        this.feed_session_id = str6;
    }

    public /* synthetic */ ProviderEffectModel(String str, int i, boolean z, List list, String str2, String str3, String str4, Integer num, Integer num2, List list2, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : list2, (i2 & 1024) != 0 ? null : str5, (i2 & 2048) == 0 ? str6 : null);
    }
}
