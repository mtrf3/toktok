package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Adh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26689Adh implements Parcelable.Creator<ExposeUserRightPanel> {
    @Override // android.os.Parcelable.Creator
    public final ExposeUserRightPanel createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Icon createFromParcel2;
        ArrayList arrayList;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ExposeUserRight.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ExposeUserRightPanel(readString, icon, icon2, arrayList, readString2, valueOf, num, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ExposeUserRightPanel[] newArray(int i) {
        return new ExposeUserRightPanel[i];
    }
}
