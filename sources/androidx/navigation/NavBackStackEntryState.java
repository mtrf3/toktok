package androidx.navigation;

import X.C91677ZyT;
import X.C91678ZyU;
import X.C91679ZyV;
import X.C91720ZzA;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class NavBackStackEntryState implements Parcelable {
    public final Bundle args;
    public final int destinationId;
    public final String id;
    public final Bundle savedState;
    public static final C91679ZyV Companion = new C91679ZyV();
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C91678ZyU();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NavBackStackEntryState(Parcel inParcel) {
        o.LJIIIZ(inParcel, "inParcel");
        String readString = inParcel.readString();
        o.LJI(readString);
        this.id = readString;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        o.LJI(readBundle);
        this.savedState = readBundle;
    }

    public NavBackStackEntryState(NavBackStackEntry entry) {
        o.LJIIIZ(entry, "entry");
        this.id = entry.LJLJJLL;
        this.destinationId = entry.LJLILLLLZI.LJLJJLL;
        this.args = entry.LJLJI;
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.LJLJLLL.LIZJ(bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public final NavBackStackEntry LIZ(Context context, C91720ZzA c91720ZzA, Lifecycle.State hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle == null) {
            bundle = null;
        } else {
            bundle.setClassLoader(context.getClassLoader());
        }
        return C91677ZyT.LIZ(context, c91720ZzA, bundle, hostLifecycleState, navControllerViewModel, this.id, this.savedState);
    }
}
