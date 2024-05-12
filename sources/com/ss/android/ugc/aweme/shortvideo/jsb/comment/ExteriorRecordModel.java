package com.ss.android.ugc.aweme.shortvideo.jsb.comment;

import X.AnonymousClass391;
import X.C07670Rv;
import X.C0MT;
import X.HB6;
import X.HB8;
import X.HB9;
import X.HBJ;
import X.HUJ;
import X.JBR;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExteriorRecordModel implements Parcelable {
    public final String PreviousPage;
    public final HB9 bottomTabType;
    public final Float imageCompress;
    public final long maxRecordSeconds;
    public final int maxSelectAssetCount;
    public final int maxSelectVideoCount;
    public final long minRecordSeconds;
    public final HB8 recordPageType;
    public final boolean showPreviewAfterRecord;
    public final ArrayList<Integer> targetSize;
    public final List<HUJ> toolBarList;
    public final Float videoCompress;
    public static final HBJ Companion = new HBJ();
    public static final Parcelable.Creator<ExteriorRecordModel> CREATOR = new HB6();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExteriorRecordModel)) {
            return false;
        }
        ExteriorRecordModel exteriorRecordModel = (ExteriorRecordModel) obj;
        return this.recordPageType == exteriorRecordModel.recordPageType && o.LJ(this.toolBarList, exteriorRecordModel.toolBarList) && this.bottomTabType == exteriorRecordModel.bottomTabType && this.minRecordSeconds == exteriorRecordModel.minRecordSeconds && this.maxRecordSeconds == exteriorRecordModel.maxRecordSeconds && this.maxSelectVideoCount == exteriorRecordModel.maxSelectVideoCount && this.maxSelectAssetCount == exteriorRecordModel.maxSelectAssetCount && o.LJ(this.imageCompress, exteriorRecordModel.imageCompress) && o.LJ(this.videoCompress, exteriorRecordModel.videoCompress) && o.LJ(this.targetSize, exteriorRecordModel.targetSize) && this.showPreviewAfterRecord == exteriorRecordModel.showPreviewAfterRecord && o.LJ(this.PreviousPage, exteriorRecordModel.PreviousPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZJ = (((JBR.LIZJ(this.maxRecordSeconds, JBR.LIZJ(this.minRecordSeconds, (this.bottomTabType.hashCode() + AnonymousClass391.LIZIZ(this.toolBarList, this.recordPageType.hashCode() * 31, 31)) * 31, 31), 31) + this.maxSelectVideoCount) * 31) + this.maxSelectAssetCount) * 31;
        Float f = this.imageCompress;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Float f2 = this.videoCompress;
        if (f2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ArrayList<Integer> arrayList = this.targetSize;
        if (arrayList == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.showPreviewAfterRecord;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str = this.PreviousPage;
        if (str != null) {
            i = str.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExteriorRecordModel(recordPageType=");
        sb.append(this.recordPageType);
        sb.append(", toolBarList=");
        sb.append(this.toolBarList);
        sb.append(", bottomTabType=");
        sb.append(this.bottomTabType);
        sb.append(", minRecordSeconds=");
        sb.append(this.minRecordSeconds);
        sb.append(", maxRecordSeconds=");
        sb.append(this.maxRecordSeconds);
        sb.append(", maxSelectVideoCount=");
        sb.append(this.maxSelectVideoCount);
        sb.append(", maxSelectAssetCount=");
        sb.append(this.maxSelectAssetCount);
        sb.append(", imageCompress=");
        sb.append(this.imageCompress);
        sb.append(", videoCompress=");
        sb.append(this.videoCompress);
        sb.append(", targetSize=");
        sb.append(this.targetSize);
        sb.append(", showPreviewAfterRecord=");
        sb.append(this.showPreviewAfterRecord);
        sb.append(", PreviousPage=");
        return C07670Rv.LIZIZ(sb, this.PreviousPage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.recordPageType.name());
        Iterator LIZJ = UC7.LIZJ(this.toolBarList, out);
        while (LIZJ.hasNext()) {
            out.writeString(((HUJ) LIZJ.next()).name());
        }
        out.writeString(this.bottomTabType.name());
        out.writeLong(this.minRecordSeconds);
        out.writeLong(this.maxRecordSeconds);
        out.writeInt(this.maxSelectVideoCount);
        out.writeInt(this.maxSelectAssetCount);
        Float f = this.imageCompress;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Float f2 = this.videoCompress;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f2);
        }
        ArrayList<Integer> arrayList = this.targetSize;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                out.writeInt(it.next().intValue());
            }
        }
        out.writeInt(this.showPreviewAfterRecord ? 1 : 0);
        out.writeString(this.PreviousPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExteriorRecordModel(HB8 recordPageType, List<? extends HUJ> toolBarList, HB9 bottomTabType, long j, long j2, int i, int i2, Float f, Float f2, ArrayList<Integer> arrayList, boolean z, String str) {
        o.LJIIIZ(recordPageType, "recordPageType");
        o.LJIIIZ(toolBarList, "toolBarList");
        o.LJIIIZ(bottomTabType, "bottomTabType");
        this.recordPageType = recordPageType;
        this.toolBarList = toolBarList;
        this.bottomTabType = bottomTabType;
        this.minRecordSeconds = j;
        this.maxRecordSeconds = j2;
        this.maxSelectVideoCount = i;
        this.maxSelectAssetCount = i2;
        this.imageCompress = f;
        this.videoCompress = f2;
        this.targetSize = arrayList;
        this.showPreviewAfterRecord = z;
        this.PreviousPage = str;
    }
}
