package com.ss.android.ugc.aweme.creative.model;

import X.C41957GdN;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OnThisDayData extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<OnThisDayData> CREATOR = new C41957GdN();

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("forwardType")
    public int forwardType;

    @InterfaceC65349Pkn("is_from_on_this_forward")
    public boolean isFromOnThisDay;

    @InterfaceC65349Pkn("loaded_sticker_page")
    public List<Integer> loadedIndexList;

    @InterfaceC65349Pkn("loaded_sticker")
    public boolean loadedSticker;

    @InterfaceC65349Pkn("past_memory_key")
    public String pastMemoryKey;

    @InterfaceC65349Pkn("viewedVideo")
    public int viewedVideo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OnThisDayData() {
        /*
            r11 = this;
            r1 = 0
            r4 = 0
            r5 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r7 = r4
            r8 = r1
            r10 = r4
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.OnThisDayData.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnThisDayData copy$default(OnThisDayData onThisDayData, boolean z, int i, int i2, String str, long j, List list, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = onThisDayData.isFromOnThisDay;
        }
        if ((i3 & 2) != 0) {
            i = onThisDayData.viewedVideo;
        }
        if ((i3 & 4) != 0) {
            i2 = onThisDayData.forwardType;
        }
        if ((i3 & 8) != 0) {
            str = onThisDayData.pastMemoryKey;
        }
        if ((i3 & 16) != 0) {
            j = onThisDayData.createTime;
        }
        if ((i3 & 32) != 0) {
            list = onThisDayData.loadedIndexList;
        }
        if ((i3 & 64) != 0) {
            z2 = onThisDayData.loadedSticker;
        }
        return onThisDayData.copy(z, i, i2, str, j, list, z2);
    }

    public final OnThisDayData copy(boolean z, int i, int i2, String pastMemoryKey, long j, List<Integer> loadedIndexList, boolean z2) {
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        o.LJIIIZ(loadedIndexList, "loadedIndexList");
        return new OnThisDayData(z, i, i2, pastMemoryKey, j, loadedIndexList, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isFromOnThisDay), Integer.valueOf(this.viewedVideo), Integer.valueOf(this.forwardType), this.pastMemoryKey, Long.valueOf(this.createTime), this.loadedIndexList, Boolean.valueOf(this.loadedSticker)};
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getForwardType() {
        return this.forwardType;
    }

    public final List<Integer> getLoadedIndexList() {
        return this.loadedIndexList;
    }

    public final boolean getLoadedSticker() {
        return this.loadedSticker;
    }

    public final String getPastMemoryKey() {
        return this.pastMemoryKey;
    }

    public final int getViewedVideo() {
        return this.viewedVideo;
    }

    public final boolean isFromOnThisDay() {
        return this.isFromOnThisDay;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setForwardType(int i) {
        this.forwardType = i;
    }

    public final void setFromOnThisDay(boolean z) {
        this.isFromOnThisDay = z;
    }

    public final void setLoadedIndexList(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.loadedIndexList = list;
    }

    public final void setLoadedSticker(boolean z) {
        this.loadedSticker = z;
    }

    public final void setPastMemoryKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.pastMemoryKey = str;
    }

    public final void setViewedVideo(int i) {
        this.viewedVideo = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isFromOnThisDay ? 1 : 0);
        out.writeInt(this.viewedVideo);
        out.writeInt(this.forwardType);
        out.writeString(this.pastMemoryKey);
        out.writeLong(this.createTime);
        Iterator LIZJ = UC7.LIZJ(this.loadedIndexList, out);
        while (LIZJ.hasNext()) {
            out.writeInt(((Number) LIZJ.next()).intValue());
        }
        out.writeInt(this.loadedSticker ? 1 : 0);
    }

    public OnThisDayData(boolean z, int i, int i2, String pastMemoryKey, long j, List<Integer> loadedIndexList, boolean z2) {
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        o.LJIIIZ(loadedIndexList, "loadedIndexList");
        this.isFromOnThisDay = z;
        this.viewedVideo = i;
        this.forwardType = i2;
        this.pastMemoryKey = pastMemoryKey;
        this.createTime = j;
        this.loadedIndexList = loadedIndexList;
        this.loadedSticker = z2;
    }

    public /* synthetic */ OnThisDayData(boolean z, int i, int i2, String str, long j, List list, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? new ArrayList() : list, (i3 & 64) == 0 ? z2 : false);
    }
}
