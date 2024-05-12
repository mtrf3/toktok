package com.ss.android.ugc.aweme.shortvideo.model;

import X.C279117r;
import X.F9E;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PhotoModeExposureData extends F9E implements Parcelable {
    public static final Parcelable.Creator<PhotoModeExposureData> CREATOR = new Creator();
    public final List<SingleImageData> imageList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoModeExposureData copy$default(PhotoModeExposureData photoModeExposureData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = photoModeExposureData.imageList;
        }
        return photoModeExposureData.copy(list);
    }

    public final PhotoModeExposureData copy(List<SingleImageData> imageList) {
        o.LJIIIZ(imageList, "imageList");
        return new PhotoModeExposureData(imageList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imageList};
    }

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PhotoModeExposureData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModeExposureData[] newArray(int i) {
            return new PhotoModeExposureData[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModeExposureData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SingleImageData.CREATOR, parcel, arrayList, i, 1);
            }
            return new PhotoModeExposureData(arrayList);
        }
    }

    public PhotoModeExposureData(List<SingleImageData> imageList) {
        o.LJIIIZ(imageList, "imageList");
        this.imageList = imageList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.imageList, out);
        while (LIZJ.hasNext()) {
            ((SingleImageData) LIZJ.next()).writeToParcel(out, i);
        }
    }
}
