package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonColor;
import kotlin.jvm.internal.o;

/* renamed from: X.AgQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26858AgQ implements Parcelable.Creator<LinkText> {
    @Override // android.os.Parcelable.Creator
    public final LinkText createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        boolean z3;
        Boolean valueOf3;
        Integer valueOf4;
        boolean z4;
        Boolean valueOf5;
        CommonColor createFromParcel;
        Boolean valueOf6;
        Integer valueOf7;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z5 = false;
        Icon icon = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf3 = Boolean.valueOf(z3);
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf5 = Boolean.valueOf(z4);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
        }
        CommonColor commonColor = createFromParcel;
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            if (parcel.readInt() != 0) {
                z5 = true;
            }
            valueOf6 = Boolean.valueOf(z5);
        }
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            valueOf7 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new LinkText(readString, readString2, valueOf, readString3, valueOf2, valueOf3, readString4, valueOf4, valueOf5, commonColor, valueOf6, valueOf7, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final LinkText[] newArray(int i) {
        return new LinkText[i];
    }
}
