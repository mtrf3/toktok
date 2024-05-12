package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentAction;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPlaceholderRichText;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichTextElem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AqS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27480AqS implements Parcelable.Creator<ContentPlaceholderRichText> {
    @Override // android.os.Parcelable.Creator
    public final ContentPlaceholderRichText createFromParcel(Parcel parcel) {
        HashMap hashMap;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        ContentAction contentAction = null;
        if (parcel.readInt() == 0) {
            hashMap = null;
        } else {
            int readInt = parcel.readInt();
            hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), ContentRichTextElem.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() != 0) {
            contentAction = ContentAction.CREATOR.createFromParcel(parcel);
        }
        return new ContentPlaceholderRichText(readString, hashMap, contentAction);
    }

    @Override // android.os.Parcelable.Creator
    public final ContentPlaceholderRichText[] newArray(int i) {
        return new ContentPlaceholderRichText[i];
    }
}
