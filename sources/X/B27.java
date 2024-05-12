package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.InputBoxHintContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B27 implements Parcelable.Creator<ExceptionUX> {
    @Override // android.os.Parcelable.Creator
    public final ExceptionUX createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        Boolean valueOf2;
        DialogContent createFromParcel;
        ToastContent createFromParcel2;
        RedirectContent createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
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
            createFromParcel = null;
        } else {
            createFromParcel = DialogContent.CREATOR.createFromParcel(parcel);
        }
        DialogContent dialogContent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ToastContent.CREATOR.createFromParcel(parcel);
        }
        ToastContent toastContent = createFromParcel2;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = RedirectContent.CREATOR.createFromParcel(parcel);
        }
        RedirectContent redirectContent = createFromParcel3;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = C279117r.LIZIZ(InputBoxHintContent.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ExceptionUX(valueOf, valueOf2, dialogContent, toastContent, readString, redirectContent, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ExceptionUX[] newArray(int i) {
        return new ExceptionUX[i];
    }
}
