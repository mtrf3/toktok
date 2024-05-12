package com.ss.ugc.aweme.creation.base;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ImportModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ImportModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImportModel> CREATOR = new Parcelable.Creator<ImportModel>() { // from class: X.4e9
        @Override // android.os.Parcelable.Creator
        public final ImportModel createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            int readInt = in.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(in.readParcelable(ImportModel.class.getClassLoader()));
                readInt--;
            }
            return new ImportModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportModel[] newArray(int i) {
            return new ImportModel[i];
        }
    };

    @InterfaceC65349Pkn("items")
    public List<ImportItemModel> items;

    /* JADX WARN: Multi-variable type inference failed */
    public ImportModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<ImportItemModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<ImportItemModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public final List<ImportItemModel> getItems() {
        return this.items;
    }

    public ImportModel(List<ImportItemModel> items) {
        o.LJIIIZ(items, "items");
        this.items = items;
    }

    public final void setItems(List<ImportItemModel> list) {
        o.LJIIIZ(list, "<set-?>");
        this.items = list;
    }

    public /* synthetic */ ImportModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
