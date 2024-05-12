package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation;
import kotlin.jvm.internal.o;

/* renamed from: X.H8b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43569H8b implements Parcelable.Creator<InlineCaptionExperimentInformation> {
    @Override // android.os.Parcelable.Creator
    public final InlineCaptionExperimentInformation createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new InlineCaptionExperimentInformation(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final InlineCaptionExperimentInformation[] newArray(int i) {
        return new InlineCaptionExperimentInformation[i];
    }
}
