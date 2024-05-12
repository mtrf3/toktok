package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.cutsame.CutSameParams;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ETe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36474ETe implements Parcelable.Creator<CutSameParams> {
    @Override // android.os.Parcelable.Creator
    public final CutSameParams createFromParcel(Parcel in) {
        ArrayList arrayList;
        boolean z;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        int readInt = in.readInt();
        if (in.readInt() != 0) {
            int readInt2 = in.readInt();
            arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add(in.readString());
                readInt2--;
            }
        } else {
            arrayList = null;
        }
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CutSameParams(readString, readString2, readInt, arrayList, z, in.readBundle());
    }

    @Override // android.os.Parcelable.Creator
    public final CutSameParams[] newArray(int i) {
        return new CutSameParams[i];
    }
}
