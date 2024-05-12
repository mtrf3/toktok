package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27078Ajy implements Parcelable.Creator<SelfOperatedPolicy> {
    @Override // android.os.Parcelable.Creator
    public final SelfOperatedPolicy createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        Image image = (Image) parcel.readParcelable(SelfOperatedPolicy.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(SelfOperatedPolicy.class.getClassLoader());
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(UserRightDetail.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SelfOperatedPolicy(valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, image, image2, readString8, readString9, readString10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final SelfOperatedPolicy[] newArray(int i) {
        return new SelfOperatedPolicy[i];
    }
}
