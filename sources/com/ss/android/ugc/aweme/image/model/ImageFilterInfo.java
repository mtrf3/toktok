package com.ss.android.ugc.aweme.image.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageFilterInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageFilterInfo> CREATOR = new Parcelable.Creator<ImageFilterInfo>() { // from class: X.5wR
        @Override // android.os.Parcelable.Creator
        public final ImageFilterInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            float readFloat = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new ImageFilterInfo(readString, readString2, readFloat, z, readString3, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageFilterInfo[] newArray(int i) {
            return new ImageFilterInfo[i];
        }
    };

    @InterfaceC65349Pkn("compareKey")
    public String compareKey;

    @InterfaceC65349Pkn("filterId")
    public String filterId;

    @InterfaceC65349Pkn("filterIntensityRatio")
    public float filterIntensityRatio;

    @InterfaceC65349Pkn("filterLabel")
    public String filterLabel;

    @InterfaceC65349Pkn("is_composer")
    public boolean isComposer;

    @InterfaceC65349Pkn("needRender")
    public boolean needRender;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageFilterInfo() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r5 = r1
            r6 = r4
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.model.ImageFilterInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.filterId);
        out.writeString(this.filterLabel);
        out.writeFloat(this.filterIntensityRatio);
        out.writeInt(this.isComposer ? 1 : 0);
        out.writeString(this.compareKey);
        out.writeInt(this.needRender ? 1 : 0);
    }

    public final String getCompareKey() {
        return this.compareKey;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final float getFilterIntensityRatio() {
        return this.filterIntensityRatio;
    }

    public final String getFilterLabel() {
        return this.filterLabel;
    }

    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final boolean isComposer() {
        return this.isComposer;
    }

    public final ImageFilterInfo copy(ImageFilterInfo filterInfo) {
        o.LJIIIZ(filterInfo, "filterInfo");
        this.isComposer = filterInfo.isComposer;
        this.filterId = filterInfo.filterId;
        this.filterLabel = filterInfo.filterLabel;
        this.filterIntensityRatio = filterInfo.filterIntensityRatio;
        this.compareKey = filterInfo.compareKey;
        return this;
    }

    public final boolean isSameFilter(ImageFilterInfo filterInfo) {
        o.LJIIIZ(filterInfo, "filterInfo");
        if (this.isComposer != filterInfo.isComposer || !o.LJ(this.filterId, filterInfo.filterId) || this.filterIntensityRatio != filterInfo.filterIntensityRatio) {
            return false;
        }
        return true;
    }

    public final void setCompareKey(String str) {
        this.compareKey = str;
    }

    public final void setComposer(boolean z) {
        this.isComposer = z;
    }

    public final void setFilterId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.filterId = str;
    }

    public final void setFilterIntensityRatio(float f) {
        this.filterIntensityRatio = f;
    }

    public final void setFilterLabel(String str) {
        this.filterLabel = str;
    }

    public final void setNeedRender(boolean z) {
        this.needRender = z;
    }

    public ImageFilterInfo(String filterId, String str, float f, boolean z, String str2, boolean z2) {
        o.LJIIIZ(filterId, "filterId");
        this.filterId = filterId;
        this.filterLabel = str;
        this.filterIntensityRatio = f;
        this.isComposer = z;
        this.compareKey = str2;
        this.needRender = z2;
    }

    public /* synthetic */ ImageFilterInfo(String str, String str2, float f, boolean z, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? -1.0f : f, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? false : z2);
    }
}
