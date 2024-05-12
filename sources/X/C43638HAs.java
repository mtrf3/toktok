package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HAs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43638HAs implements Parcelable.Creator<DuetContext> {
    @Override // android.os.Parcelable.Creator
    public final DuetContext createFromParcel(Parcel in) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        String readString4 = in.readString();
        float readFloat = in.readFloat();
        float readFloat2 = in.readFloat();
        if (in.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt = in.readInt();
        int readInt2 = in.readInt();
        String readString5 = in.readString();
        String readString6 = in.readString();
        int readInt3 = in.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        while (readInt3 != 0) {
            arrayList.add(in.readParcelable(DuetContext.class.getClassLoader()));
            readInt3--;
        }
        if (in.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int readInt4 = in.readInt();
        String readString7 = in.readString();
        int readInt5 = in.readInt();
        Effect effect = (Effect) in.readParcelable(DuetContext.class.getClassLoader());
        String readString8 = in.readString();
        if (in.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (in.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int readInt6 = in.readInt();
        String readString9 = in.readString();
        if (in.readInt() != 0) {
            num = Integer.valueOf(in.readInt());
        } else {
            num = null;
        }
        return new DuetContext(readString, readString2, readString3, readString4, readFloat, readFloat2, z, readInt, readInt2, readString5, readString6, arrayList, z2, readInt4, readString7, readInt5, effect, readString8, z3, z4, readInt6, readString9, num);
    }

    @Override // android.os.Parcelable.Creator
    public final DuetContext[] newArray(int i) {
        return new DuetContext[i];
    }
}
