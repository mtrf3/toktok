package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ESe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36448ESe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIJ(in, "in");
        return new ResourceListModel.ResourceListBean(in.readString(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ResourceListModel.ResourceListBean[i];
    }
}
