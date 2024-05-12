package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SearchCreateModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GgQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42146GgQ implements Parcelable.Creator<SearchCreateModel> {
    @Override // android.os.Parcelable.Creator
    public final SearchCreateModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return new SearchCreateModel(z, createStringArrayList, hashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final SearchCreateModel[] newArray(int i) {
        return new SearchCreateModel[i];
    }
}
