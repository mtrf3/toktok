package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.GameTagCategory;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BIC implements Parcelable.Creator<GameTag> {
    @Override // android.os.Parcelable.Creator
    public final GameTag createFromParcel(Parcel in) {
        Long l;
        o.LJIIIZ(in, "in");
        if (in.readInt() != 0) {
            l = Long.valueOf(in.readLong());
        } else {
            l = null;
        }
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        int readInt = in.readInt();
        String readString4 = in.readString();
        String readString5 = in.readString();
        int readInt2 = in.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        while (readInt2 != 0) {
            arrayList.add(Hashtag.CREATOR.createFromParcel(in));
            readInt2--;
        }
        int readInt3 = in.readInt();
        ArrayList arrayList2 = new ArrayList(readInt3);
        while (readInt3 != 0) {
            arrayList2.add(GameTagCategory.CREATOR.createFromParcel(in));
            readInt3--;
        }
        return new GameTag(l, readString, readString2, readString3, readInt, readString4, readString5, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final GameTag[] newArray(int i) {
        return new GameTag[i];
    }
}
