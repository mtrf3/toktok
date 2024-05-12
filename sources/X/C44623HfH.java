package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare.FeatureConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HfH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44623HfH implements Parcelable.Creator<FeatureConfig> {
    @Override // android.os.Parcelable.Creator
    public final FeatureConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FeatureConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final FeatureConfig[] newArray(int i) {
        return new FeatureConfig[i];
    }
}
