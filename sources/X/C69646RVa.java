package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RVa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69646RVa implements Parcelable.Creator<BaseResponseComponent> {
    @Override // android.os.Parcelable.Creator
    public final BaseResponseComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        TTLComponent createFromParcel = TTLComponent.CREATOR.createFromParcel(parcel);
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new BaseResponseComponent(createFromParcel, createStringArrayList, readLong, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final BaseResponseComponent[] newArray(int i) {
        return new BaseResponseComponent[i];
    }
}
