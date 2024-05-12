package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B2V implements Parcelable.Creator<DialogContent> {
    @Override // android.os.Parcelable.Creator
    public final DialogContent createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        Boolean valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = C279117r.LIZIZ(DialogButton.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new DialogContent(readString, readString2, valueOf, valueOf2, valueOf3, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DialogContent[] newArray(int i) {
        return new DialogContent[i];
    }
}
