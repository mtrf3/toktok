package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateListData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S7Y implements Parcelable.Creator<TemplateListData> {
    @Override // android.os.Parcelable.Creator
    public final TemplateListData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(RespTemplateItem.CREATOR, parcel, arrayList, i, 1);
        }
        return new TemplateListData(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateListData[] newArray(int i) {
        return new TemplateListData[i];
    }
}
