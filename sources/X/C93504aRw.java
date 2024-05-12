package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import kotlin.jvm.internal.o;

/* renamed from: X.aRw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93504aRw implements Parcelable.Creator<AssetsLibData.AssetsItemData> {
    @Override // android.os.Parcelable.Creator
    public final AssetsLibData.AssetsItemData createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new AssetsLibData.AssetsItemData(in.readString(), in.readString(), in.readString(), in.readString(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AssetsLibData.AssetsItemData[] newArray(int i) {
        return new AssetsLibData.AssetsItemData[i];
    }
}
