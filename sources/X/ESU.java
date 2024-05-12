package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ESU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIJ(in, "in");
        return new UrlModel(in.createStringArrayList(), in.createStringArrayList(), in.readString(), in.readString(), in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UrlModel[i];
    }
}
