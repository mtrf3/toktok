package com.ss.android.ugc.aweme.kpro;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class KproPopupSetting {

    @InterfaceC65349Pkn("background_image_url")
    public final String backGroundImageUrl;

    @InterfaceC65349Pkn("btn_label")
    public final String btn_label;

    @InterfaceC65349Pkn("complete_id")
    public final String complete_id;

    @InterfaceC65349Pkn("mask")
    public final String mask;

    @InterfaceC65349Pkn("primary_btn")
    public final KproPopupButtonSetting primaryBtn;

    @InterfaceC65349Pkn("rand_time")
    public final long rand_time;

    @InterfaceC65349Pkn("secondary_btn")
    public final KproPopupButtonSetting secondaryBtn;

    @InterfaceC65349Pkn("sub_title")
    public final String sub_title;

    @InterfaceC65349Pkn("time_range")
    public final KproPopupPeriod[] time_range;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_image_url")
    public final String title_image_url;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KproPopupSetting)) {
            return false;
        }
        KproPopupSetting kproPopupSetting = (KproPopupSetting) obj;
        return o.LJ(this.type, kproPopupSetting.type) && o.LJ(this.backGroundImageUrl, kproPopupSetting.backGroundImageUrl) && o.LJ(this.title_image_url, kproPopupSetting.title_image_url) && o.LJ(this.title, kproPopupSetting.title) && o.LJ(this.sub_title, kproPopupSetting.sub_title) && o.LJ(this.mask, kproPopupSetting.mask) && o.LJ(this.btn_label, kproPopupSetting.btn_label) && this.rand_time == kproPopupSetting.rand_time && o.LJ(this.complete_id, kproPopupSetting.complete_id) && o.LJ(this.url, kproPopupSetting.url) && o.LJ(this.time_range, kproPopupSetting.time_range) && o.LJ(this.primaryBtn, kproPopupSetting.primaryBtn) && o.LJ(this.secondaryBtn, kproPopupSetting.secondaryBtn);
    }

    public final String toString() {
        return "KproPopupSetting(type=" + this.type + ", backGroundImageUrl=" + this.backGroundImageUrl + ", title_image_url=" + this.title_image_url + ", title=" + this.title + ", sub_title=" + this.sub_title + ", mask=" + this.mask + ", btn_label=" + this.btn_label + ", rand_time=" + this.rand_time + ", complete_id=" + this.complete_id + ", url=" + this.url + ", time_range=" + Arrays.toString(this.time_range) + ", primaryBtn=" + this.primaryBtn + ", secondaryBtn=" + this.secondaryBtn + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        String str = this.type;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.backGroundImageUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.title_image_url;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.title;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.sub_title;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.mask;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.btn_label;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int LJ = C79062V1e.LJ(this.complete_id, JBR.LIZJ(this.rand_time, (i7 + hashCode7) * 31, 31), 31);
        String str8 = this.url;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int hashCode10 = (Arrays.hashCode(this.time_range) + ((LJ + hashCode8) * 31)) * 31;
        KproPopupButtonSetting kproPopupButtonSetting = this.primaryBtn;
        if (kproPopupButtonSetting == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = kproPopupButtonSetting.hashCode();
        }
        int i8 = (hashCode10 + hashCode9) * 31;
        KproPopupButtonSetting kproPopupButtonSetting2 = this.secondaryBtn;
        if (kproPopupButtonSetting2 != null) {
            i = kproPopupButtonSetting2.hashCode();
        }
        return i8 + i;
    }

    public KproPopupSetting(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String complete_id, String str8, KproPopupPeriod[] time_range, KproPopupButtonSetting kproPopupButtonSetting, KproPopupButtonSetting kproPopupButtonSetting2) {
        o.LJIIIZ(complete_id, "complete_id");
        o.LJIIIZ(time_range, "time_range");
        this.type = str;
        this.backGroundImageUrl = str2;
        this.title_image_url = str3;
        this.title = str4;
        this.sub_title = str5;
        this.mask = str6;
        this.btn_label = str7;
        this.rand_time = j;
        this.complete_id = complete_id;
        this.url = str8;
        this.time_range = time_range;
        this.primaryBtn = kproPopupButtonSetting;
        this.secondaryBtn = kproPopupButtonSetting2;
    }
}
