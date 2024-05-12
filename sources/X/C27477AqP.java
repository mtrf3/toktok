package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import kotlin.jvm.internal.o;

/* renamed from: X.AqP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27477AqP implements Parcelable.Creator<ContentPopupButton> {
    @Override // android.os.Parcelable.Creator
    public final ContentPopupButton createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ContentPopupButton(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ContentPopupButton[] newArray(int i) {
        return new ContentPopupButton[i];
    }
}
