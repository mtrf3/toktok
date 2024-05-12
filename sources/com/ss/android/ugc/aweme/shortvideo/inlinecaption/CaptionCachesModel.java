package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CaptionCachesModel implements Parcelable {
    public static final Parcelable.Creator<CaptionCachesModel> CREATOR = new Parcelable.Creator<CaptionCachesModel>() { // from class: X.5Rc
        @Override // android.os.Parcelable.Creator
        public final CaptionCachesModel createFromParcel(Parcel parcel) {
            CaptionQueryInfo createFromParcel;
            o.LJIIIZ(parcel, "parcel");
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = CaptionQueryInfo.CREATOR.createFromParcel(parcel);
            }
            CaptionQueryInfo captionQueryInfo = createFromParcel;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(CaptionUtterance.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new CaptionCachesModel(captionQueryInfo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionCachesModel[] newArray(int i) {
            return new CaptionCachesModel[i];
        }
    };
    public CaptionQueryInfo captionQueryInfo;
    public ArrayList<CaptionUtterance> captionsList;

    public CaptionCachesModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionCachesModel)) {
            return false;
        }
        CaptionCachesModel captionCachesModel = (CaptionCachesModel) obj;
        return o.LJ(this.captionQueryInfo, captionCachesModel.captionQueryInfo) && o.LJ(this.captionsList, captionCachesModel.captionsList);
    }

    public final int hashCode() {
        CaptionQueryInfo captionQueryInfo = this.captionQueryInfo;
        int hashCode = (captionQueryInfo == null ? 0 : captionQueryInfo.hashCode()) * 31;
        ArrayList<CaptionUtterance> arrayList = this.captionsList;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionCachesModel(captionQueryInfo=");
        LIZ.append(this.captionQueryInfo);
        LIZ.append(", captionsList=");
        LIZ.append(this.captionsList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        CaptionQueryInfo captionQueryInfo = this.captionQueryInfo;
        if (captionQueryInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            captionQueryInfo.writeToParcel(out, i);
        }
        ArrayList<CaptionUtterance> arrayList = this.captionsList;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator<CaptionUtterance> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public CaptionCachesModel(CaptionQueryInfo captionQueryInfo, ArrayList<CaptionUtterance> arrayList) {
        this.captionQueryInfo = captionQueryInfo;
        this.captionsList = arrayList;
    }
}
