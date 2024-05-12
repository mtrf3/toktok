package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.08r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C026908r {
    public static void LIZ(Bundle bundle, String str, Class cls) {
        ArrayList<FragmentState> arrayList;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            FragmentManagerState createFromParcel = FragmentManagerState.CREATOR.createFromParcel(obtain);
            if (createFromParcel == null || (arrayList = createFromParcel.LJLIL) == null || arrayList.size() == 0) {
                return;
            }
            try {
                Iterator<FragmentState> it = createFromParcel.LJLIL.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null && !cls.isAssignableFrom(Class.forName(next.LJLIL))) {
                        bundle.putParcelable(str, null);
                        return;
                    }
                }
            } catch (ClassNotFoundException unused) {
                bundle.putParcelable(str, null);
            }
        } catch (IllegalStateException unused2) {
        } finally {
            obtain.recycle();
        }
    }
}
