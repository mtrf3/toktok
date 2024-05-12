package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs;
import kotlin.jvm.internal.o;

/* renamed from: X.GLt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41377GLt implements Parcelable.Creator<UpdateTipsArgs> {
    @Override // android.os.Parcelable.Creator
    public final UpdateTipsArgs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UpdateTipsArgs(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UpdateTipsArgs[] newArray(int i) {
        return new UpdateTipsArgs[i];
    }
}
