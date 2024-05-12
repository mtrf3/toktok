package androidx.fragment.app;

import Y.IDCreatorS45S0000000;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new IDCreatorS45S0000000(28);
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final Bundle LJLL;
    public final boolean LJLLI;
    public final int LJLLILLLL;
    public Bundle LJLLJ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.LJLIL);
        sb.append(" (");
        sb.append(this.LJLILLLLZI);
        sb.append(")}:");
        if (this.LJLJI) {
            sb.append(" fromLayout");
        }
        if (this.LJLJJL != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.LJLJJL));
        }
        String str = this.LJLJJLL;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.LJLJJLL);
        }
        if (this.LJLJL) {
            sb.append(" retainInstance");
        }
        if (this.LJLJLJ) {
            sb.append(" removing");
        }
        if (this.LJLJLLL) {
            sb.append(" detached");
        }
        if (this.LJLLI) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.LJLIL = parcel.readString();
        this.LJLILLLLZI = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJI = z;
        this.LJLJJI = parcel.readInt();
        this.LJLJJL = parcel.readInt();
        this.LJLJJLL = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJL = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJLJLJ = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LJLJLLL = z4;
        this.LJLL = parcel.readBundle();
        this.LJLLI = parcel.readInt() != 0;
        this.LJLLJ = parcel.readBundle();
        this.LJLLILLLL = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.LJLIL = fragment.getClass().getName();
        this.LJLILLLLZI = fragment.mWho;
        this.LJLJI = fragment.mFromLayout;
        this.LJLJJI = fragment.mFragmentId;
        this.LJLJJL = fragment.mContainerId;
        this.LJLJJLL = fragment.mTag;
        this.LJLJL = fragment.mRetainInstance;
        this.LJLJLJ = fragment.mRemoving;
        this.LJLJLLL = fragment.mDetached;
        this.LJLL = fragment.mArguments;
        this.LJLLI = fragment.mHidden;
        this.LJLLILLLL = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.LJLIL);
        parcel.writeString(this.LJLILLLLZI);
        parcel.writeInt(this.LJLJI ? 1 : 0);
        parcel.writeInt(this.LJLJJI);
        parcel.writeInt(this.LJLJJL);
        parcel.writeString(this.LJLJJLL);
        parcel.writeInt(this.LJLJL ? 1 : 0);
        parcel.writeInt(this.LJLJLJ ? 1 : 0);
        parcel.writeInt(this.LJLJLLL ? 1 : 0);
        parcel.writeBundle(this.LJLL);
        parcel.writeInt(this.LJLLI ? 1 : 0);
        parcel.writeBundle(this.LJLLJ);
        parcel.writeInt(this.LJLLILLLL);
    }
}
