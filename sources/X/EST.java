package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class EST implements Parcelable.Creator<SavePhotoStickerInfo> {
    @Override // android.os.Parcelable.Creator
    public final SavePhotoStickerInfo createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
        ArrayList<String> createStringArrayList = in.createStringArrayList();
        String readString = in.readString();
        String readString2 = in.readString();
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return new SavePhotoStickerInfo(createStringArrayList, readString, readString2, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final SavePhotoStickerInfo[] newArray(int i) {
        return new SavePhotoStickerInfo[i];
    }
}
