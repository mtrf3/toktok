package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C48339Iy7;
import X.C79062V1e;
import X.GPV;
import X.HCF;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordPageOptionalConfig implements Parcelable {
    public static final Parcelable.Creator<RecordPageOptionalConfig> CREATOR = new HCF();

    @GPV
    public final CompressConfig compressConfig;

    @GPV
    public final int exteriorRecordPageType;

    @GPV
    public final boolean nopeMemory;

    @GPV
    public final OptionalComponents optionalComponents;

    @GPV
    public final String previousPage;

    @GPV
    public final RecordBottomTabConfig recordBottomTabConfig;

    @GPV
    public final String shootWay;

    @GPV
    public final boolean showPreviewAfterRecord;

    @GPV
    public final ArrayList<String> toolbarType;

    @GPV
    public final UploadConfig uploadConfig;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPageOptionalConfig)) {
            return false;
        }
        RecordPageOptionalConfig recordPageOptionalConfig = (RecordPageOptionalConfig) obj;
        return this.exteriorRecordPageType == recordPageOptionalConfig.exteriorRecordPageType && o.LJ(this.toolbarType, recordPageOptionalConfig.toolbarType) && o.LJ(this.optionalComponents, recordPageOptionalConfig.optionalComponents) && o.LJ(this.shootWay, recordPageOptionalConfig.shootWay) && o.LJ(this.recordBottomTabConfig, recordPageOptionalConfig.recordBottomTabConfig) && o.LJ(this.uploadConfig, recordPageOptionalConfig.uploadConfig) && this.showPreviewAfterRecord == recordPageOptionalConfig.showPreviewAfterRecord && o.LJ(this.compressConfig, recordPageOptionalConfig.compressConfig) && o.LJ(this.previousPage, recordPageOptionalConfig.previousPage) && this.nopeMemory == recordPageOptionalConfig.nopeMemory;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.exteriorRecordPageType);
        out.writeStringList(this.toolbarType);
        this.optionalComponents.writeToParcel(out, i);
        out.writeString(this.shootWay);
        this.recordBottomTabConfig.writeToParcel(out, i);
        UploadConfig uploadConfig = this.uploadConfig;
        if (uploadConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            uploadConfig.writeToParcel(out, i);
        }
        out.writeInt(this.showPreviewAfterRecord ? 1 : 0);
        CompressConfig compressConfig = this.compressConfig;
        if (compressConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            compressConfig.writeToParcel(out, i);
        }
        out.writeString(this.previousPage);
        out.writeInt(this.nopeMemory ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.recordBottomTabConfig.hashCode() + C79062V1e.LJ(this.shootWay, (this.optionalComponents.hashCode() + ((this.toolbarType.hashCode() + (this.exteriorRecordPageType * 31)) * 31)) * 31, 31)) * 31;
        UploadConfig uploadConfig = this.uploadConfig;
        int i = 0;
        if (uploadConfig == null) {
            hashCode = 0;
        } else {
            hashCode = uploadConfig.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        boolean z = this.showPreviewAfterRecord;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        CompressConfig compressConfig = this.compressConfig;
        if (compressConfig == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = compressConfig.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str = this.previousPage;
        if (str != null) {
            i = str.hashCode();
        }
        int i7 = (i6 + i) * 31;
        if (!this.nopeMemory) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordPageOptionalConfig(exteriorRecordPageType=");
        LIZ.append(this.exteriorRecordPageType);
        LIZ.append(", toolbarType=");
        LIZ.append(this.toolbarType);
        LIZ.append(", optionalComponents=");
        LIZ.append(this.optionalComponents);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", recordBottomTabConfig=");
        LIZ.append(this.recordBottomTabConfig);
        LIZ.append(", uploadConfig=");
        LIZ.append(this.uploadConfig);
        LIZ.append(", showPreviewAfterRecord=");
        LIZ.append(this.showPreviewAfterRecord);
        LIZ.append(", compressConfig=");
        LIZ.append(this.compressConfig);
        LIZ.append(", previousPage=");
        LIZ.append(this.previousPage);
        LIZ.append(", nopeMemory=");
        return C48339Iy7.LIZJ(LIZ, this.nopeMemory, ')', LIZ);
    }

    public RecordPageOptionalConfig(int i, ArrayList<String> toolbarType, OptionalComponents optionalComponents, String shootWay, RecordBottomTabConfig recordBottomTabConfig, UploadConfig uploadConfig, boolean z, CompressConfig compressConfig, String str, boolean z2) {
        o.LJIIIZ(toolbarType, "toolbarType");
        o.LJIIIZ(optionalComponents, "optionalComponents");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(recordBottomTabConfig, "recordBottomTabConfig");
        this.exteriorRecordPageType = i;
        this.toolbarType = toolbarType;
        this.optionalComponents = optionalComponents;
        this.shootWay = shootWay;
        this.recordBottomTabConfig = recordBottomTabConfig;
        this.uploadConfig = uploadConfig;
        this.showPreviewAfterRecord = z;
        this.compressConfig = compressConfig;
        this.previousPage = str;
        this.nopeMemory = z2;
    }
}
