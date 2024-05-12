package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.ExtraSession;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ESf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36449ESf implements Parcelable.Creator<ExtraSession> {
    @Override // android.os.Parcelable.Creator
    public final ExtraSession createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readParcelable(ExtraSession.class.getClassLoader()));
        }
        return new ExtraSession(linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final ExtraSession[] newArray(int i) {
        return new ExtraSession[i];
    }
}
