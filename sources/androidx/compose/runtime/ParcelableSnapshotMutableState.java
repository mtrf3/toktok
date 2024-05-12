package androidx.compose.runtime;

import X.AnonymousClass046;
import X.C35791ap;
import X.C35831at;
import X.C36041bE;
import X.C530926n;
import X.InterfaceC24600xs;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends C530926n<T> implements Parcelable {
    public static final AnonymousClass046 Companion = new Object() { // from class: X.046
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: X.045
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return LIZ(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        public static ParcelableSnapshotMutableState LIZ(Parcel parcel, ClassLoader classLoader) {
            InterfaceC24600xs interfaceC24600xs;
            o.LJIIIZ(parcel, "parcel");
            if (classLoader == null) {
                classLoader = AnonymousClass045.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        interfaceC24600xs = C35791ap.LIZ;
                    } else {
                        throw new IllegalStateException(C0NY.LIZIZ("Unsupported MutableState policy ", readInt, " was restored"));
                    }
                } else {
                    interfaceC24600xs = C36041bE.LIZ;
                }
            } else {
                interfaceC24600xs = C35831at.LIZ;
            }
            return new ParcelableSnapshotMutableState(readValue, interfaceC24600xs);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return LIZ(parcel, classLoader);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, InterfaceC24600xs<T> policy) {
        super(t, policy);
        o.LJIIIZ(policy, "policy");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeValue(getValue());
        InterfaceC24600xs<T> LIZ = LIZ();
        if (o.LJ(LIZ, C35831at.LIZ)) {
            i2 = 0;
        } else if (o.LJ(LIZ, C36041bE.LIZ)) {
            i2 = 1;
        } else if (o.LJ(LIZ, C35791ap.LIZ)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
