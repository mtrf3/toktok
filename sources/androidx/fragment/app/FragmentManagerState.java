package androidx.fragment.app;

import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new IDCreatorS45S0000000(27);
    public ArrayList<FragmentState> LJLIL;
    public ArrayList<String> LJLILLLLZI;
    public BackStackState[] LJLJI;
    public int LJLJJI;
    public String LJLJJL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.LJLIL = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.LJLILLLLZI = parcel.createStringArrayList();
        this.LJLJI = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.LJLJJI = parcel.readInt();
        this.LJLJJL = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.LJLIL);
        parcel.writeStringList(this.LJLILLLLZI);
        parcel.writeTypedArray(this.LJLJI, i);
        parcel.writeInt(this.LJLJJI);
        parcel.writeString(this.LJLJJL);
    }
}
