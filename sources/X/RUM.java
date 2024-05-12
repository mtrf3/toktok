package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RUM implements Parcelable.Creator<PromotionProperty> {
    @Override // android.os.Parcelable.Creator
    public final PromotionProperty createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new PromotionProperty(in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionProperty[] newArray(int i) {
        return new PromotionProperty[i];
    }
}
