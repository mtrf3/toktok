package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Glj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42475Glj implements Parcelable.Creator<IBEContext> {
    @Override // android.os.Parcelable.Creator
    public final IBEContext createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new IBEContext();
    }

    @Override // android.os.Parcelable.Creator
    public final IBEContext[] newArray(int i) {
        return new IBEContext[i];
    }
}
