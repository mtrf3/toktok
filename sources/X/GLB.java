package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GLB implements Parcelable.Creator<DefaultPostContentModel> {
    @Override // android.os.Parcelable.Creator
    public final DefaultPostContentModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C5YW.LIZ(DefaultPostContentModel.class, parcel, arrayList, i, 1);
        }
        return new DefaultPostContentModel(readString, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final DefaultPostContentModel[] newArray(int i) {
        return new DefaultPostContentModel[i];
    }
}
