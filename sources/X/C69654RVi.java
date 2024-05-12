package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RVi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69654RVi implements Parcelable.Creator<SizeGuide> {
    @Override // android.os.Parcelable.Creator
    public final SizeGuide createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(SizeGuide.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(SizeGuide.class.getClassLoader());
        Integer num = null;
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
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new SizeGuide(image, image2, valueOf, readString, readString2, readString3, icon, num, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SizeGuide[] newArray(int i) {
        return new SizeGuide[i];
    }
}
