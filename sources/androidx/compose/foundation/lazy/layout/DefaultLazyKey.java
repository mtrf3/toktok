package androidx.compose.foundation.lazy.layout;

import X.AnonymousClass044;
import X.F9E;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class DefaultLazyKey extends F9E implements Parcelable {
    public final int index;
    public static final AnonymousClass044 Companion = new Object() { // from class: X.044
    };
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new IDCreatorS45S0000000(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.index)};
    }

    public DefaultLazyKey(int i) {
        this.index = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.index);
    }
}
