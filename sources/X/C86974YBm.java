package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.YBm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86974YBm {
    public final String LIZ;
    public final String LIZIZ;
    public final char[] LIZJ;
    public final int LIZLLL;
    public int LJ;

    public C86974YBm(String orig, String str) {
        o.LJIIIZ(orig, "orig");
        this.LIZ = orig;
        this.LIZIZ = str;
        char[] charArray = orig.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        this.LIZJ = charArray;
        this.LIZLLL = orig.length();
    }

    public final float LIZ(int i, Context context, StringBuilder sb) {
        String str;
        if (i != -1) {
            String substring = sb.substring(1, i);
            String substring2 = sb.substring(i + 1);
            if (o.LJ(substring, "dimen")) {
                str = context.getPackageName();
            } else if (o.LJ(substring, "android:dimen")) {
                str = "android";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unknown identifier ");
                LIZ.append((Object) sb);
                LIZ.append(", ");
                LIZ.append(this.LIZIZ);
                LIZ.append('=');
                LIZ.append(this.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            int identifier = context.getResources().getIdentifier(substring2, "dimen", str);
            if (identifier == 0) {
                if (C86982YBu.LJLJJLL != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append((Object) sb);
                    LIZ2.append(" is not supported in AndroidStudio Preview, ");
                    LIZ2.append(this.LIZIZ);
                    LIZ2.append('=');
                    LIZ2.append(this.LIZ);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("unknown identifier ");
                LIZ3.append((Object) sb);
                LIZ3.append(", ");
                LIZ3.append(this.LIZIZ);
                LIZ3.append('=');
                LIZ3.append(this.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            }
            return context.getResources().getDimension(identifier);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("unknown token ");
        LIZ4.append((Object) sb);
        LIZ4.append(", ");
        LIZ4.append(this.LIZIZ);
        LIZ4.append('=');
        LIZ4.append(this.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r6.equals("left") != false) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0059. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0090. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r11, android.content.Context r12, java.lang.StringBuilder r13) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86974YBm.LIZIZ(int, android.content.Context, java.lang.StringBuilder):java.lang.Object");
    }
}
