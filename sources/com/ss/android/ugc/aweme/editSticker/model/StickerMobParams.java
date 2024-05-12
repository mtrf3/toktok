package com.ss.android.ugc.aweme.editSticker.model;

import X.InterfaceC65349Pkn;
import X.X66;
import X.X67;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class StickerMobParams implements Serializable, Parcelable {

    @InterfaceC65349Pkn("creationId")
    public String creationId;

    @InterfaceC65349Pkn("customCutoutModelType")
    public int customCutoutModelType;

    @InterfaceC65349Pkn("customStickerEntrance")
    public String customStickerEntrance;

    @InterfaceC65349Pkn("isCrop")
    public boolean isCrop;

    @InterfaceC65349Pkn("isCutout")
    public boolean isCutout;

    @InterfaceC65349Pkn("panelPosition")
    public int panelPosition;

    @InterfaceC65349Pkn("propId")
    public String propId;

    @InterfaceC65349Pkn("selectFrom")
    public String selectFrom;

    @InterfaceC65349Pkn("shootWay")
    public String shootWay;

    @InterfaceC65349Pkn("stickerType")
    public String stickerType;

    @InterfaceC65349Pkn("tabName")
    public String tabName;
    public static final X67 Companion = new X67();
    public static final Parcelable.Creator<StickerMobParams> CREATOR = new X66();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StickerMobParams() {
        /*
            r14 = this;
            r1 = 0
            r3 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r3
            r9 = r3
            r10 = r1
            r11 = r3
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.model.StickerMobParams.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.selectFrom);
        parcel.writeString(this.stickerType);
        parcel.writeInt(this.panelPosition);
        parcel.writeString(this.tabName);
        parcel.writeString(this.creationId);
        parcel.writeString(this.propId);
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.isCutout ? 1 : 0);
        parcel.writeInt(this.isCrop ? 1 : 0);
        parcel.writeString(this.customStickerEntrance);
        parcel.writeInt(this.customCutoutModelType);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getCustomCutoutModelType() {
        return this.customCutoutModelType;
    }

    public final String getCustomStickerEntrance() {
        return this.customStickerEntrance;
    }

    public final int getPanelPosition() {
        return this.panelPosition;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getSelectFrom() {
        return this.selectFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStickerType() {
        return this.stickerType;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final boolean isCrop() {
        return this.isCrop;
    }

    public final boolean isCutout() {
        return this.isCutout;
    }

    public final void setCreationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.creationId = str;
    }

    public final void setCrop(boolean z) {
        this.isCrop = z;
    }

    public final void setCustomCutoutModelType(int i) {
        this.customCutoutModelType = i;
    }

    public final void setCustomStickerEntrance(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.customStickerEntrance = str;
    }

    public final void setCutout(boolean z) {
        this.isCutout = z;
    }

    public final void setPanelPosition(int i) {
        this.panelPosition = i;
    }

    public final void setPropId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.propId = str;
    }

    public final void setSelectFrom(String str) {
        this.selectFrom = str;
    }

    public final void setShootWay(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.shootWay = str;
    }

    public final void setStickerType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.stickerType = str;
    }

    public final void setTabName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tabName = str;
    }

    public StickerMobParams(String str, String stickerType, int i, String tabName, String creationId, String propId, String shootWay, boolean z, boolean z2, String customStickerEntrance, int i2) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(propId, "propId");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(customStickerEntrance, "customStickerEntrance");
        this.selectFrom = str;
        this.stickerType = stickerType;
        this.panelPosition = i;
        this.tabName = tabName;
        this.creationId = creationId;
        this.propId = propId;
        this.shootWay = shootWay;
        this.isCutout = z;
        this.isCrop = z2;
        this.customStickerEntrance = customStickerEntrance;
        this.customCutoutModelType = i2;
    }

    public /* synthetic */ StickerMobParams(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? false : z, (i3 & 256) == 0 ? z2 : false, (i3 & 512) == 0 ? str7 : "", (i3 & 1024) == 0 ? i2 : -1);
    }
}
