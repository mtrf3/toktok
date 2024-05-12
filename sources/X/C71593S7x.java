package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.S7x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71593S7x implements Parcelable.Creator<MultiTextTemplateItem> {
    @Override // android.os.Parcelable.Creator
    public final MultiTextTemplateItem createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        TemplateDecoration createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        int i = 0;
        while (i != readInt2) {
            i = C279117r.LIZIZ(TemplateField.CREATOR, parcel, arrayList, i, 1);
        }
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = null;
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = TemplateDecoration.CREATOR.createFromParcel(parcel);
                }
                arrayList3.add(createFromParcel);
            }
            arrayList2 = arrayList3;
        }
        return new MultiTextTemplateItem(readString, readInt, arrayList, readString2, readString3, z, readString4, readString5, z2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final MultiTextTemplateItem[] newArray(int i) {
        return new MultiTextTemplateItem[i];
    }
}
