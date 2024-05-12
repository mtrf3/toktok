package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichTextElem;
import kotlin.jvm.internal.o;

/* renamed from: X.AqQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27478AqQ implements Parcelable.Creator<ContentRichTextElem> {
    @Override // android.os.Parcelable.Creator
    public final ContentRichTextElem createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ContentPopup contentPopup = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            contentPopup = ContentPopup.CREATOR.createFromParcel(parcel);
        }
        return new ContentRichTextElem(valueOf, readString, contentPopup);
    }

    @Override // android.os.Parcelable.Creator
    public final ContentRichTextElem[] newArray(int i) {
        return new ContentRichTextElem[i];
    }
}
