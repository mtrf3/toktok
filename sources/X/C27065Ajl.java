package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27065Ajl implements Parcelable.Creator<Announcement> {
    @Override // android.os.Parcelable.Creator
    public final Announcement createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        boolean z;
        Boolean valueOf3;
        Long valueOf4;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Long valueOf5;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(Announcement.class.getClassLoader());
        String readString3 = parcel.readString();
        Image image2 = (Image) parcel.readParcelable(Announcement.class.getClassLoader());
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
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf3 = Boolean.valueOf(z);
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        if (parcel.readInt() == 0) {
            linkedHashMap2 = null;
        } else {
            int readInt2 = parcel.readInt();
            linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap2.put(parcel.readString(), LinkText.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Long.valueOf(parcel.readLong());
        }
        return new Announcement(readString, readString2, image, readString3, image2, valueOf, valueOf2, valueOf3, readString4, readString5, readString6, readString7, valueOf4, linkedHashMap, linkedHashMap2, valueOf5);
    }

    @Override // android.os.Parcelable.Creator
    public final Announcement[] newArray(int i) {
        return new Announcement[i];
    }
}
