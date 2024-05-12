package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJW implements Parcelable.Creator<AutoCutThemeData> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutThemeData createFromParcel(Parcel parcel) {
        MusicBuzModel createFromParcel;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        LinkedHashSet linkedHashSet = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = MusicBuzModel.CREATOR.createFromParcel(parcel);
        }
        MusicBuzModel musicBuzModel = createFromParcel;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString8 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            linkedHashSet = new LinkedHashSet(readInt4);
            for (int i = 0; i != readInt4; i++) {
                linkedHashSet.add(parcel.readString());
            }
        }
        return new AutoCutThemeData(readInt, readInt2, readString, readInt3, readString2, readString3, readString4, readString5, readString6, readString7, musicBuzModel, z, readString8, linkedHashSet);
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutThemeData[] newArray(int i) {
        return new AutoCutThemeData[i];
    }
}
