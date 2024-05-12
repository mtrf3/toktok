package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aju, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27074Aju implements Parcelable.Creator<UserRight> {
    @Override // android.os.Parcelable.Creator
    public final UserRight createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ContactDetail createFromParcel;
        ExposeUserRightPanel createFromParcel2;
        ArrayList arrayList2;
        BottomTip createFromParcel3;
        Icon createFromParcel4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int i = 0;
        LinkText linkText = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(UserRightDetail.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ContactDetail.CREATOR.createFromParcel(parcel);
        }
        ContactDetail contactDetail = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ExposeUserRightPanel.CREATOR.createFromParcel(parcel);
        }
        ExposeUserRightPanel exposeUserRightPanel = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(PrivacyPolicy.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = BottomTip.CREATOR.createFromParcel(parcel);
        }
        BottomTip bottomTip = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel4;
        if (parcel.readInt() != 0) {
            linkText = LinkText.CREATOR.createFromParcel(parcel);
        }
        return new UserRight(readString, arrayList, contactDetail, exposeUserRightPanel, arrayList2, bottomTip, icon, linkText);
    }

    @Override // android.os.Parcelable.Creator
    public final UserRight[] newArray(int i) {
        return new UserRight[i];
    }
}
