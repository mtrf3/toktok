package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26964Ai8 implements Parcelable.Creator<DeliveryPanelStarter.EnterParamForOrderSubmitPage> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParamForOrderSubmitPage createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(LogisticDTO.CREATOR, parcel, arrayList, i, 1);
        }
        return new DeliveryPanelStarter.EnterParamForOrderSubmitPage(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParamForOrderSubmitPage[] newArray(int i) {
        return new DeliveryPanelStarter.EnterParamForOrderSubmitPage[i];
    }
}
