package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.PlDataBean;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RUR implements Parcelable.Creator<PlDataBean> {
    @Override // android.os.Parcelable.Creator
    public final PlDataBean createFromParcel(Parcel in) {
        String readString;
        boolean z;
        o.LJIIIZ(in, "in");
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (true) {
            readString = in.readString();
            if (readInt == 0) {
                break;
            }
            arrayList.add(readString);
            readInt--;
        }
        String readString2 = in.readString();
        boolean z2 = false;
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (in.readInt() != 0) {
            z2 = true;
        }
        return new PlDataBean(arrayList, readString, readString2, z, z2, in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final PlDataBean[] newArray(int i) {
        return new PlDataBean[i];
    }
}
