package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.ClipsModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48258Iwo implements Parcelable.Creator<ClipsModel> {
    @Override // android.os.Parcelable.Creator
    public final ClipsModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        double readDouble = in.readDouble();
        double readDouble2 = in.readDouble();
        float readFloat = in.readFloat();
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(Float.valueOf(in.readFloat()));
            readInt--;
        }
        int readInt2 = in.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        while (readInt2 != 0) {
            arrayList2.add(Float.valueOf(in.readFloat()));
            readInt2--;
        }
        return new ClipsModel(readDouble, readDouble2, readFloat, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final ClipsModel[] newArray(int i) {
        return new ClipsModel[i];
    }
}
