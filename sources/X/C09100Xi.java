package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09100Xi {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(byte[] bArr) {
        String str = C09540Za.LIZ;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append(str.charAt((i >>> 4) & 15));
            sb.append(str.charAt((i >>> 0) & 15));
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
