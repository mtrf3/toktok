package com.ss.android.ugc.cut_ui;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutResultData;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutResultData implements Parcelable {
    public static final Parcelable.Creator<CutResultData> CREATOR = new Parcelable.Creator<CutResultData>() { // from class: X.6pD
        @Override // android.os.Parcelable.Creator
        public final CutResultData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(MediaItem.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new CutResultData(readString, readString2, createStringArrayList, createStringArrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CutResultData[] newArray(int i) {
            return new CutResultData[i];
        }
    };
    public final String conactFilePath;
    public final String conactWorksapceId;
    public final ArrayList<MediaItem> editMediaItemList;
    public final List<String> lastTextList;
    public final List<String> originTextList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutResultData)) {
            return false;
        }
        CutResultData cutResultData = (CutResultData) obj;
        return o.LJ(this.conactFilePath, cutResultData.conactFilePath) && o.LJ(this.conactWorksapceId, cutResultData.conactWorksapceId) && o.LJ(this.originTextList, cutResultData.originTextList) && o.LJ(this.lastTextList, cutResultData.lastTextList) && o.LJ(this.editMediaItemList, cutResultData.editMediaItemList);
    }

    public final int hashCode() {
        String str = this.conactFilePath;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conactWorksapceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.originTextList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lastTextList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<MediaItem> arrayList = this.editMediaItemList;
        return hashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutResultData(conactFilePath=");
        LIZ.append((Object) this.conactFilePath);
        LIZ.append(", conactWorksapceId=");
        LIZ.append((Object) this.conactWorksapceId);
        LIZ.append(", originTextList=");
        LIZ.append(this.originTextList);
        LIZ.append(", lastTextList=");
        LIZ.append(this.lastTextList);
        LIZ.append(", editMediaItemList=");
        LIZ.append(this.editMediaItemList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.conactFilePath);
        out.writeString(this.conactWorksapceId);
        out.writeStringList(this.originTextList);
        out.writeStringList(this.lastTextList);
        ArrayList<MediaItem> arrayList = this.editMediaItemList;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator<MediaItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public static CutResultData LIZ(CutResultData cutResultData, ArrayList arrayList, int i) {
        String str;
        String str2;
        List<String> list;
        ArrayList arrayList2 = arrayList;
        List<String> list2 = null;
        if ((i & 1) != 0) {
            str = cutResultData.conactFilePath;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = cutResultData.conactWorksapceId;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            list = cutResultData.originTextList;
        } else {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = cutResultData.lastTextList;
        }
        if ((i & 16) != 0) {
            arrayList2 = cutResultData.editMediaItemList;
        }
        return new CutResultData(str, str2, list, list2, arrayList2);
    }

    public CutResultData(String str, String str2, List<String> list, List<String> list2, ArrayList<MediaItem> arrayList) {
        this.conactFilePath = str;
        this.conactWorksapceId = str2;
        this.originTextList = list;
        this.lastTextList = list2;
        this.editMediaItemList = arrayList;
    }
}
