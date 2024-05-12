package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H67 implements Parcelable.Creator<AutoCutAnchorModel> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutAnchorModel createFromParcel(Parcel parcel) {
        MusicBuzModel createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = MusicBuzModel.CREATOR.createFromParcel(parcel);
        }
        MusicBuzModel musicBuzModel = createFromParcel;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(AutoCutMediaModel.CREATOR, parcel, arrayList, i, 1);
        }
        return new AutoCutAnchorModel(readString, readString2, musicBuzModel, readString3, readString4, readString5, readString6, readString7, readString8, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutAnchorModel[] newArray(int i) {
        return new AutoCutAnchorModel[i];
    }
}
