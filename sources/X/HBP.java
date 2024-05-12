package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.StitchContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBP implements Parcelable.Creator<StitchContext> {
    @Override // android.os.Parcelable.Creator
    public final StitchContext createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new StitchContext((StitchParams) parcel.readParcelable(StitchContext.class.getClassLoader()), (TimeSpeedModelExtension) parcel.readParcelable(StitchContext.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final StitchContext[] newArray(int i) {
        return new StitchContext[i];
    }
}
