package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0EH, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0EH {
    public static int LIZ(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    public static String LIZJ(StringBuilder sb, String str, String str2) {
        sb.append(str);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, str2);
        return sb2;
    }

    public static int LIZIZ(StringBuilder sb, String str, String str2, int i, int i2) {
        sb.append(str);
        sb.append(str2);
        return i + i2;
    }

    public static void LIZLLL(StringBuilder sb, String str, String str2, int i, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }
}
