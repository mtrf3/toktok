package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.base.data.CoverUrl;
import com.ss.ugc.android.editor.base.data.MusicItem;
import kotlin.jvm.internal.o;

/* renamed from: X.ESb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36445ESb implements Parcelable.Creator<MusicItem> {
    @Override // android.os.Parcelable.Creator
    public final MusicItem createFromParcel(Parcel parcel) {
        CoverUrl createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CoverUrl.CREATOR.createFromParcel(parcel);
        }
        return new MusicItem(readLong, readString, readString2, readString3, readInt, readString4, createFromParcel, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicItem[] newArray(int i) {
        return new MusicItem[i];
    }
}
