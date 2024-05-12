package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import kotlin.jvm.internal.o;

/* renamed from: X.Vcl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80139Vcl implements Parcelable.Creator<NinePatchDiv> {
    @Override // android.os.Parcelable.Creator
    public final NinePatchDiv createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new NinePatchDiv(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final NinePatchDiv[] newArray(int i) {
        return new NinePatchDiv[i];
    }
}
