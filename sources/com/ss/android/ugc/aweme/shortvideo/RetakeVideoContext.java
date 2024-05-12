package com.ss.android.ugc.aweme.shortvideo;

import X.C136905Yw;
import X.C43073GvN;
import X.C62850Ola;
import X.EnumC43649HBd;
import X.InterfaceC136915Yx;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VERecordData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class RetakeVideoContext implements Parcelable, InterfaceC136915Yx {
    public static final C136905Yw CREATOR = new Parcelable.Creator<RetakeVideoContext>() { // from class: X.5Yw
        @Override // android.os.Parcelable.Creator
        public final RetakeVideoContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            o.LJIIIZ(parcel, "parcel");
            CreativeInfo creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
            if (creativeInfo == null) {
                creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            }
            RetakeVideoContext retakeVideoContext = new RetakeVideoContext(creativeInfo);
            retakeVideoContext.duration = parcel.readLong();
            retakeVideoContext.start = parcel.readLong();
            retakeVideoContext.retakeIndex = parcel.readInt();
            retakeVideoContext.recordData = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
            String readString = parcel.readString();
            if (readString == null) {
                readString = C43073GvN.LIZLLL(C62850Ola.LJ(), retakeVideoContext.creativeInfo, EnumC43649HBd.RECORD, null, false, 12);
            }
            retakeVideoContext.retakeDir = readString;
            retakeVideoContext.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
            retakeVideoContext.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
            retakeVideoContext.musicOrigin = parcel.readString();
            boolean z5 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            retakeVideoContext.isFromEditorPro = z;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            retakeVideoContext.isFromLibrary = z2;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            retakeVideoContext.isAddClips = z3;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            retakeVideoContext.disableBGM = z4;
            if (parcel.readInt() != 0) {
                z5 = true;
            }
            retakeVideoContext.isReplace = z5;
            return retakeVideoContext;
        }

        @Override // android.os.Parcelable.Creator
        public final RetakeVideoContext[] newArray(int i) {
            return new RetakeVideoContext[i];
        }
    };
    public final CreativeInfo creativeInfo;
    public boolean disableBGM;
    public long duration;
    public boolean isAddClips;
    public boolean isFromEditorPro;
    public boolean isFromLibrary;
    public boolean isReplace;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicOrigin;
    public VERecordData recordData;
    public String retakeDir;
    public int retakeIndex;
    public long start;
    public StitchParams stitchParams;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RetakeVideoContext(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
        this.retakeDir = C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.RECORD, null, false, 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.start);
        parcel.writeInt(this.retakeIndex);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeString(this.retakeDir);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeParcelable(this.stitchParams, i);
        String str = this.musicOrigin;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.isFromEditorPro ? 1 : 0);
        parcel.writeInt(this.isFromLibrary ? 1 : 0);
        parcel.writeInt(this.isAddClips ? 1 : 0);
        parcel.writeInt(this.disableBGM ? 1 : 0);
        parcel.writeInt(this.isReplace ? 1 : 0);
    }
}
