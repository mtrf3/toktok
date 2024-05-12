package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.HCf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43677HCf implements Parcelable.Creator<CapCutTemplateMusic> {
    @Override // android.os.Parcelable.Creator
    public final CapCutTemplateMusic createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CapCutTemplateMusic(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CapCutTemplateMusic[] newArray(int i) {
        return new CapCutTemplateMusic[i];
    }
}
