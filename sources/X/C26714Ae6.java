package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ae6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26714Ae6 implements Parcelable.Creator<UserRightDescBlock> {
    @Override // android.os.Parcelable.Creator
    public final UserRightDescBlock createFromParcel(Parcel parcel) {
        Integer valueOf;
        ArrayList arrayList;
        LinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        LinkText linkText = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Icon.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel;
        if (parcel.readInt() != 0) {
            linkText = LinkText.CREATOR.createFromParcel(parcel);
        }
        return new UserRightDescBlock(valueOf, readString, arrayList, linkRichText, linkText);
    }

    @Override // android.os.Parcelable.Creator
    public final UserRightDescBlock[] newArray(int i) {
        return new UserRightDescBlock[i];
    }
}
