package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.InputBoxHintContent;
import kotlin.jvm.internal.o;

/* renamed from: X.Aet, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26763Aet implements Parcelable.Creator<InputBoxHintContent> {
    @Override // android.os.Parcelable.Creator
    public final InputBoxHintContent createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new InputBoxHintContent(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final InputBoxHintContent[] newArray(int i) {
        return new InputBoxHintContent[i];
    }
}
