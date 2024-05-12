package X;

import android.os.Parcel;
import kotlin.jvm.internal.o;

/* renamed from: X.0MT, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0MT {
    public static String LIZIZ(I38 i38, ActivityC45651qj activityC45651qj, String str) {
        String string = activityC45651qj.getString(i38.getNameResId());
        o.LJIIIIZZ(string, str);
        return string;
    }

    public static void LIZJ(Parcel parcel, int i, Float f) {
        parcel.writeInt(i);
        parcel.writeFloat(f.floatValue());
    }

    public static void LIZLLL(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void LJ(StringBuilder sb, String str, String str2, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        X1D.LIZIZ(sb2);
    }

    public static String LIZ(StringBuilder sb, String str, char c, String str2, StringBuilder sb2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
        return X1D.LIZIZ(sb2);
    }
}
