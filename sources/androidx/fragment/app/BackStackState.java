package androidx.fragment.app;

import X.C025708f;
import X.C1B3;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new IDCreatorS45S0000000(26);
    public final int[] LJLIL;
    public final ArrayList<String> LJLILLLLZI;
    public final int[] LJLJI;
    public final int[] LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final CharSequence LJLJLLL;
    public final int LJLL;
    public final CharSequence LJLLI;
    public final ArrayList<String> LJLLILLLL;
    public final ArrayList<String> LJLLJ;
    public final boolean LJLLL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackState(C1B3 c1b3) {
        String str;
        int size = c1b3.LIZ.size();
        this.LJLIL = new int[size * 5];
        if (c1b3.LJI) {
            this.LJLILLLLZI = new ArrayList<>(size);
            this.LJLJI = new int[size];
            this.LJLJJI = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C025708f c025708f = (C025708f) ListProtector.get(c1b3.LIZ, i2);
                int i3 = i + 1;
                this.LJLIL[i] = c025708f.LIZ;
                ArrayList<String> arrayList = this.LJLILLLLZI;
                Fragment fragment = c025708f.LIZIZ;
                if (fragment != null) {
                    str = fragment.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.LJLIL;
                int i4 = i3 + 1;
                iArr[i3] = c025708f.LIZJ;
                int i5 = i4 + 1;
                iArr[i4] = c025708f.LIZLLL;
                int i6 = i5 + 1;
                iArr[i5] = c025708f.LJ;
                i = i6 + 1;
                iArr[i6] = c025708f.LJFF;
                this.LJLJI[i2] = c025708f.LJI.ordinal();
                this.LJLJJI[i2] = c025708f.LJII.ordinal();
            }
            this.LJLJJL = c1b3.LJFF;
            this.LJLJJLL = c1b3.LJIIIIZZ;
            this.LJLJL = c1b3.LJIJ;
            this.LJLJLJ = c1b3.LJIIIZ;
            this.LJLJLLL = c1b3.LJIIJ;
            this.LJLL = c1b3.LJIIJJI;
            this.LJLLI = c1b3.LJIIL;
            this.LJLLILLLL = c1b3.LJIILIIL;
            this.LJLLJ = c1b3.LJIILJJIL;
            this.LJLLL = c1b3.LJIILL;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.LJLIL = parcel.createIntArray();
        this.LJLILLLLZI = parcel.createStringArrayList();
        this.LJLJI = parcel.createIntArray();
        this.LJLJJI = parcel.createIntArray();
        this.LJLJJL = parcel.readInt();
        this.LJLJJLL = parcel.readString();
        this.LJLJL = parcel.readInt();
        this.LJLJLJ = parcel.readInt();
        this.LJLJLLL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLL = parcel.readInt();
        this.LJLLI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLLILLLL = parcel.createStringArrayList();
        this.LJLLJ = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLL = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.LJLIL);
        parcel.writeStringList(this.LJLILLLLZI);
        parcel.writeIntArray(this.LJLJI);
        parcel.writeIntArray(this.LJLJJI);
        parcel.writeInt(this.LJLJJL);
        parcel.writeString(this.LJLJJLL);
        parcel.writeInt(this.LJLJL);
        parcel.writeInt(this.LJLJLJ);
        TextUtils.writeToParcel(this.LJLJLLL, parcel, 0);
        parcel.writeInt(this.LJLL);
        TextUtils.writeToParcel(this.LJLLI, parcel, 0);
        parcel.writeStringList(this.LJLLILLLL);
        parcel.writeStringList(this.LJLLJ);
        parcel.writeInt(this.LJLLL ? 1 : 0);
    }
}
