package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AmW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27236AmW implements Parcelable.Creator<InputItemDTO> {
    @Override // android.os.Parcelable.Creator
    public final InputItemDTO createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        ArrayList arrayList;
        LinkText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Rule.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString5 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = LinkText.CREATOR.createFromParcel(parcel);
                }
                linkedHashMap2.put(readString6, createFromParcel);
            }
            linkedHashMap = linkedHashMap2;
        }
        return new InputItemDTO(readString, readString2, readString3, valueOf, valueOf2, readString4, valueOf3, arrayList, readString5, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final InputItemDTO[] newArray(int i) {
        return new InputItemDTO[i];
    }
}
