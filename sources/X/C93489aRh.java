package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import kotlin.jvm.internal.o;

/* renamed from: X.aRh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93489aRh implements Parcelable.Creator<PrefabData> {
    @Override // android.os.Parcelable.Creator
    public final PrefabData createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new PrefabData(in.readString(), in.readString(), in.readString(), in.readString(), in.readString(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PrefabData[] newArray(int i) {
        return new PrefabData[i];
    }
}
