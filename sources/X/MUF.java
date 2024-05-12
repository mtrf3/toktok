package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MUF implements Parcelable.Creator<ImagePreloadConfig> {
    @Override // android.os.Parcelable.Creator
    public final ImagePreloadConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        return new ImagePreloadConfig(arrayList, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ImagePreloadConfig[] newArray(int i) {
        return new ImagePreloadConfig[i];
    }
}
