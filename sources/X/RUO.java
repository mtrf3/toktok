package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RUO implements Parcelable.Creator<PromotionView> {
    @Override // android.os.Parcelable.Creator
    public final PromotionView createFromParcel(Parcel in) {
        ArrayList arrayList;
        o.LJIIIZ(in, "in");
        if (in.readInt() != 0) {
            int readInt = in.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(PromotionItem.CREATOR.createFromParcel(in));
                readInt--;
            }
        } else {
            arrayList = null;
        }
        return new PromotionView(arrayList, in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionView[] newArray(int i) {
        return new PromotionView[i];
    }
}
