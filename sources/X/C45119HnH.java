package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HnH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45119HnH implements Parcelable.Creator<CutsameDataItem> {
    @Override // android.os.Parcelable.Creator
    public final CutsameDataItem createFromParcel(Parcel parcel) {
        CutSameVideo createFromParcel;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        AuthorInfo authorInfo = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CutSameVideo.CREATOR.createFromParcel(parcel);
        }
        CutSameVideo cutSameVideo = createFromParcel;
        int readInt2 = parcel.readInt();
        long readLong = parcel.readLong();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt3 = parcel.readInt();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        if (parcel.readInt() != 0) {
            authorInfo = AuthorInfo.CREATOR.createFromParcel(parcel);
        }
        return new CutsameDataItem(readString, readInt, readString2, readString3, readString4, readString5, cutSameVideo, readInt2, readLong, readString6, readString7, readString8, readString9, createStringArrayList, createStringArrayList2, z, readInt3, readString10, readString11, authorInfo, (Music) parcel.readSerializable(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final CutsameDataItem[] newArray(int i) {
        return new CutsameDataItem[i];
    }
}
