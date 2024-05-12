package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJX implements Parcelable.Creator<AutoCutAsyncRenderModel> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutAsyncRenderModel createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            linkedHashSet = null;
        } else {
            int readInt3 = parcel.readInt();
            linkedHashSet = new LinkedHashSet(readInt3);
            for (int i = 0; i != readInt3; i++) {
                linkedHashSet.add(parcel.readString());
            }
        }
        return new AutoCutAsyncRenderModel(readLong, readInt, readInt2, linkedHashSet, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutAsyncRenderModel[] newArray(int i) {
        return new AutoCutAsyncRenderModel[i];
    }
}
