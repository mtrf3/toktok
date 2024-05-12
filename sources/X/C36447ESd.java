package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ESd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36447ESd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIJ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(in.readParcelable(ResourceListModel.class.getClassLoader()));
            readInt--;
        }
        return new ResourceListModel(arrayList, in.createStringArrayList(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ResourceListModel[i];
    }
}
