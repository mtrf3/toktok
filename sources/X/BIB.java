package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.GameTagCategory;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BIB implements Parcelable.Creator<GameTagCategory> {
    @Override // android.os.Parcelable.Creator
    public final GameTagCategory createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new GameTagCategory(in.readInt(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final GameTagCategory[] newArray(int i) {
        return new GameTagCategory[i];
    }
}
