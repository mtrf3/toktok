package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AqO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27476AqO implements Parcelable.Creator<ContentPopup> {
    @Override // android.os.Parcelable.Creator
    public final ContentPopup createFromParcel(Parcel parcel) {
        ContentPopupButton createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ContentPopupButton.CREATOR.createFromParcel(parcel);
        }
        return new ContentPopup(readString, createStringArrayList, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ContentPopup[] newArray(int i) {
        return new ContentPopup[i];
    }
}
