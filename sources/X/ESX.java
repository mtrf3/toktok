package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ESX implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIJ(in, "in");
        return new DiffEffect((UrlModel) in.readParcelable(DiffEffect.class.getClassLoader()), (UrlModel) in.readParcelable(DiffEffect.class.getClassLoader()), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DiffEffect[i];
    }
}
