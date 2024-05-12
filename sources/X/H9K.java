package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9K implements Parcelable.Creator<StreamVoiceConversionModel> {
    @Override // android.os.Parcelable.Creator
    public final StreamVoiceConversionModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new StreamVoiceConversionModel(readString, readString2, readString3, hashMap, readString4, readString5, z, readString6, readString7, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final StreamVoiceConversionModel[] newArray(int i) {
        return new StreamVoiceConversionModel[i];
    }
}
