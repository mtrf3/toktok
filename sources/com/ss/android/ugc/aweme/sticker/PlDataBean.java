package com.ss.android.ugc.aweme.sticker;

import X.InterfaceC65349Pkn;
import X.RUR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PlDataBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<PlDataBean> CREATOR = new RUR();

    @InterfaceC65349Pkn("albumFilter")
    public int albumFilter;

    @InterfaceC65349Pkn("alg")
    public ArrayList<String> alg;

    @InterfaceC65349Pkn("defaultHeight")
    public int defaultHeight;

    @InterfaceC65349Pkn("defaultWidth")
    public int defaultWidth;

    @InterfaceC65349Pkn("face_count_max")
    public int faceCountMax;

    @InterfaceC65349Pkn("face_count_min")
    public int faceCountMin;

    @InterfaceC65349Pkn("guide")
    public boolean guide;

    @InterfaceC65349Pkn("imgK")
    public String imgK;

    @InterfaceC65349Pkn("loading")
    public boolean loading;

    @InterfaceC65349Pkn("max_count")
    public int maxCount;

    @InterfaceC65349Pkn("min_count")
    public int minCount;

    @InterfaceC65349Pkn("minFilterHeight")
    public int minFilterHeight;

    @InterfaceC65349Pkn("minFilterWidth")
    public int minFilterWidth;

    @InterfaceC65349Pkn("relation")
    public String relation;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PlDataBean() {
        /*
            r17 = this;
            r1 = 0
            r4 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.PlDataBean.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> arrayList = this.alg;
        parcel.writeInt(arrayList.size());
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeString(this.relation);
        parcel.writeString(this.imgK);
        parcel.writeInt(this.loading ? 1 : 0);
        parcel.writeInt(this.guide ? 1 : 0);
        parcel.writeInt(this.albumFilter);
        parcel.writeInt(this.faceCountMin);
        parcel.writeInt(this.faceCountMax);
        parcel.writeInt(this.minCount);
        parcel.writeInt(this.maxCount);
        parcel.writeInt(this.defaultHeight);
        parcel.writeInt(this.defaultWidth);
        parcel.writeInt(this.minFilterHeight);
        parcel.writeInt(this.minFilterWidth);
    }

    public final int getAlbumFilter() {
        return this.albumFilter;
    }

    public final ArrayList<String> getAlg() {
        return this.alg;
    }

    public final int getDefaultHeight() {
        return this.defaultHeight;
    }

    public final int getDefaultWidth() {
        return this.defaultWidth;
    }

    public final int getFaceCountMax() {
        return this.faceCountMax;
    }

    public final int getFaceCountMin() {
        return this.faceCountMin;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final String getImgK() {
        return this.imgK;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final int getMinFilterHeight() {
        return this.minFilterHeight;
    }

    public final int getMinFilterWidth() {
        return this.minFilterWidth;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final void setAlbumFilter(int i) {
        this.albumFilter = i;
    }

    public final void setAlg(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.alg = arrayList;
    }

    public final void setDefaultHeight(int i) {
        this.defaultHeight = i;
    }

    public final void setDefaultWidth(int i) {
        this.defaultWidth = i;
    }

    public final void setFaceCountMax(int i) {
        this.faceCountMax = i;
    }

    public final void setFaceCountMin(int i) {
        this.faceCountMin = i;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setImgK(String str) {
        this.imgK = str;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public final void setMinCount(int i) {
        this.minCount = i;
    }

    public final void setMinFilterHeight(int i) {
        this.minFilterHeight = i;
    }

    public final void setMinFilterWidth(int i) {
        this.minFilterWidth = i;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }

    public PlDataBean(ArrayList<String> alg, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        o.LJIIIZ(alg, "alg");
        this.alg = alg;
        this.relation = str;
        this.imgK = str2;
        this.loading = z;
        this.guide = z2;
        this.albumFilter = i;
        this.faceCountMin = i2;
        this.faceCountMax = i3;
        this.minCount = i4;
        this.maxCount = i5;
        this.defaultHeight = i6;
        this.defaultWidth = i7;
        this.minFilterHeight = i8;
        this.minFilterWidth = i9;
    }

    public /* synthetic */ PlDataBean(ArrayList arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : arrayList, (i10 & 2) != 0 ? null : str, (i10 & 4) == 0 ? str2 : null, (i10 & 8) != 0 ? true : z, (i10 & 16) == 0 ? z2 : true, (i10 & 32) != 0 ? 0 : i, (i10 & 64) != 0 ? 2 : i2, (i10 & 128) != 0 ? 5 : i3, (i10 & 256) != 0 ? -1 : i4, (i10 & 512) != 0 ? -1 : i5, (i10 & 1024) != 0 ? -1 : i6, (i10 & 2048) == 0 ? i7 : -1, (i10 & 4096) != 0 ? 0 : i8, (i10 & FileUtils.BUFFER_SIZE) == 0 ? i9 : 0);
    }
}
