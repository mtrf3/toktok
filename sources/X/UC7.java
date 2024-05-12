package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final /* synthetic */ class UC7 {
    public static Iterator LIZJ(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void LIZLLL(String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
    }

    public static String LIZ(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    public static void LJ(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        U4R.LIZLLL(str3, X1D.LIZIZ(LIZ));
    }

    public static HashSet LIZIZ(HashMap hashMap, String str, C25090yf c25090yf, int i) {
        hashMap.put(str, c25090yf);
        return new HashSet(i);
    }
}
