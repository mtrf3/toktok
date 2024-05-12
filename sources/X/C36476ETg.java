package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.StickerConfigModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ETg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36476ETg implements Parcelable.Creator<StickerConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final StickerConfigModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(in.readParcelable(StickerConfigModel.class.getClassLoader()));
            readInt--;
        }
        return new StickerConfigModel(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final StickerConfigModel[] newArray(int i) {
        return new StickerConfigModel[i];
    }
}
