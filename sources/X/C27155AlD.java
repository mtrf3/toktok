package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AlD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27155AlD implements Parcelable.Creator<LinkRichText> {
    @Override // android.os.Parcelable.Creator
    public final LinkRichText createFromParcel(Parcel parcel) {
        HashMap hashMap;
        LinkText createFromParcel;
        Icon createFromParcel2;
        Icon createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        RichTextExtraInfo richTextExtraInfo = null;
        if (parcel.readInt() == 0) {
            hashMap = null;
        } else {
            int readInt = parcel.readInt();
            hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = LinkText.CREATOR.createFromParcel(parcel);
                }
                hashMap.put(readString2, createFromParcel);
            }
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel3;
        if (parcel.readInt() != 0) {
            richTextExtraInfo = RichTextExtraInfo.CREATOR.createFromParcel(parcel);
        }
        return new LinkRichText(readString, hashMap, readString3, readString4, readString5, icon, icon2, richTextExtraInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final LinkRichText[] newArray(int i) {
        return new LinkRichText[i];
    }
}
