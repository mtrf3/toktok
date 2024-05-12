package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.MusicShareModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Oef, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62421Oef implements Parcelable.Creator<MusicShareModel> {
    @Override // android.os.Parcelable.Creator
    public final MusicShareModel createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        Music music = (Music) parcel.readSerializable();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
        }
        return new MusicShareModel(music, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicShareModel[] newArray(int i) {
        return new MusicShareModel[i];
    }
}
