package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RUL implements Parcelable.Creator<PromotionItem> {
    @Override // android.os.Parcelable.Creator
    public final PromotionItem createFromParcel(Parcel in) {
        GImage gImage;
        GImage gImage2;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        GImage gImage3;
        Integer num3;
        GImage gImage4;
        GImage gImage5;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        ArrayList<String> createStringArrayList = in.createStringArrayList();
        if (in.readInt() != 0) {
            gImage = GImage.CREATOR.createFromParcel(in);
        } else {
            gImage = null;
        }
        if (in.readInt() != 0) {
            gImage2 = GImage.CREATOR.createFromParcel(in);
        } else {
            gImage2 = null;
        }
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        String readString3 = in.readString();
        if (in.readInt() != 0) {
            num2 = Integer.valueOf(in.readInt());
        } else {
            num2 = null;
        }
        String readString4 = in.readString();
        String readString5 = in.readString();
        String readString6 = in.readString();
        String readString7 = in.readString();
        if (in.readInt() != 0) {
            int readInt = in.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(PromotionProperty.CREATOR.createFromParcel(in));
                readInt--;
            }
        } else {
            arrayList = null;
        }
        if (in.readInt() != 0) {
            gImage3 = GImage.CREATOR.createFromParcel(in);
        } else {
            gImage3 = null;
        }
        if (in.readInt() != 0) {
            num3 = Integer.valueOf(in.readInt());
        } else {
            num3 = null;
        }
        String readString8 = in.readString();
        if (in.readInt() != 0) {
            gImage4 = GImage.CREATOR.createFromParcel(in);
        } else {
            gImage4 = null;
        }
        if (in.readInt() != 0) {
            gImage5 = GImage.CREATOR.createFromParcel(in);
        } else {
            gImage5 = null;
        }
        return new PromotionItem(readString, readString2, createStringArrayList, gImage, gImage2, num, readString3, num2, readString4, readString5, readString6, readString7, arrayList, gImage3, num3, readString8, gImage4, gImage5, in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionItem[] newArray(int i) {
        return new PromotionItem[i];
    }
}
