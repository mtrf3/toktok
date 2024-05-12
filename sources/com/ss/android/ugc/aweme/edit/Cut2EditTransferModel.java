package com.ss.android.ugc.aweme.edit;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class Cut2EditTransferModel extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<Cut2EditTransferModel> CREATOR = new Parcelable.Creator<Cut2EditTransferModel>() { // from class: X.5WA
        @Override // android.os.Parcelable.Creator
        public final Cut2EditTransferModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new Cut2EditTransferModel(z, z2, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Cut2EditTransferModel[] newArray(int i) {
            return new Cut2EditTransferModel[i];
        }
    };

    @InterfaceC65349Pkn(alternate = {"f"}, value = "compressVideoTime")
    public final long compressVideoTime;

    @InterfaceC65349Pkn(alternate = {"e"}, value = "downloadResTime")
    public final long downloadResTime;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "isVideoCompressed")
    public final boolean isVideoCompressed;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "musicList")
    public final List<AVMusic> musicList;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "musicSyncMode")
    public final boolean musicSyncMode;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "resizeImageTime")
    public final long resizeImageTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Cut2EditTransferModel() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r10 = 63
            r0 = r12
            r2 = r1
            r6 = r4
            r8 = r4
            r11 = r3
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.edit.Cut2EditTransferModel.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cut2EditTransferModel copy$default(Cut2EditTransferModel cut2EditTransferModel, boolean z, boolean z2, List list, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cut2EditTransferModel.isVideoCompressed;
        }
        if ((i & 2) != 0) {
            z2 = cut2EditTransferModel.musicSyncMode;
        }
        if ((i & 4) != 0) {
            list = cut2EditTransferModel.musicList;
        }
        if ((i & 8) != 0) {
            j = cut2EditTransferModel.resizeImageTime;
        }
        if ((i & 16) != 0) {
            j2 = cut2EditTransferModel.downloadResTime;
        }
        if ((i & 32) != 0) {
            j3 = cut2EditTransferModel.compressVideoTime;
        }
        return cut2EditTransferModel.copy(z, z2, list, j, j2, j3);
    }

    public final Cut2EditTransferModel copy(boolean z, boolean z2, List<AVMusic> musicList, long j, long j2, long j3) {
        o.LJIIIZ(musicList, "musicList");
        return new Cut2EditTransferModel(z, z2, musicList, j, j2, j3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isVideoCompressed), Boolean.valueOf(this.musicSyncMode), this.musicList, Long.valueOf(this.resizeImageTime), Long.valueOf(this.downloadResTime), Long.valueOf(this.compressVideoTime)};
    }

    public final long getCompressVideoTime() {
        return this.compressVideoTime;
    }

    public final long getDownloadResTime() {
        return this.downloadResTime;
    }

    public final List<AVMusic> getMusicList() {
        return this.musicList;
    }

    public final boolean getMusicSyncMode() {
        return this.musicSyncMode;
    }

    public final long getResizeImageTime() {
        return this.resizeImageTime;
    }

    public final boolean isVideoCompressed() {
        return this.isVideoCompressed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isVideoCompressed ? 1 : 0);
        out.writeInt(this.musicSyncMode ? 1 : 0);
        Iterator LIZJ = UC7.LIZJ(this.musicList, out);
        while (LIZJ.hasNext()) {
            out.writeSerializable((Serializable) LIZJ.next());
        }
        out.writeLong(this.resizeImageTime);
        out.writeLong(this.downloadResTime);
        out.writeLong(this.compressVideoTime);
    }

    public Cut2EditTransferModel(boolean z, boolean z2, List<AVMusic> musicList, long j, long j2, long j3) {
        o.LJIIIZ(musicList, "musicList");
        this.isVideoCompressed = z;
        this.musicSyncMode = z2;
        this.musicList = musicList;
        this.resizeImageTime = j;
        this.downloadResTime = j2;
        this.compressVideoTime = j3;
    }

    public /* synthetic */ Cut2EditTransferModel(boolean z, boolean z2, List list, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) == 0 ? j3 : 0L);
    }
}
