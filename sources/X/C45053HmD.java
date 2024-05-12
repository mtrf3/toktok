package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import kotlin.jvm.internal.o;

/* renamed from: X.HmD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45053HmD implements Parcelable.Creator<AutoCutTitle> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutTitle createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AutoCutTitle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutTitle[] newArray(int i) {
        return new AutoCutTitle[i];
    }
}
