package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HIN implements Parcelable.Creator<MusicModel> {
    @Override // android.os.Parcelable.Creator
    public final MusicModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new MusicModel(in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicModel[] newArray(int i) {
        return new MusicModel[i];
    }
}
