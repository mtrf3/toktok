package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HDJ implements Parcelable.Creator<TrackModel> {
    @Override // android.os.Parcelable.Creator
    public final TrackModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        int readInt = in.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        while (readInt != 0) {
            linkedHashMap.put(in.readString(), in.readString());
            readInt--;
        }
        return new TrackModel(readString, readString2, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final TrackModel[] newArray(int i) {
        return new TrackModel[i];
    }
}
