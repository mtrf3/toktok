package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.models.RssArticle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVB implements Parcelable.Creator<RssArticle> {
    @Override // android.os.Parcelable.Creator
    public final RssArticle createFromParcel(Parcel parcel) {
        EnumC69898Rby valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = EnumC69898Rby.valueOf(parcel.readString());
        }
        String readString6 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new RssArticle(readString, readString2, readString3, readString4, createStringArrayList, readString5, valueOf, readString6, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final RssArticle[] newArray(int i) {
        return new RssArticle[i];
    }
}
