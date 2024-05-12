package X;

import com.bytedance.crash.Npth;
import defpackage.b0;

/* renamed from: X.Fgg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39614Fgg {
    public static String LIZ() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitmapWarning:");
        LIZ.append((String) null);
        LIZ.append("\n");
        stringBuffer.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CreateThread:");
        b0.LJ(LIZ2, null, " CreateTime:", 0L);
        C1EU.LIZJ(LIZ2, " width:", 0, " height", 0);
        LIZ2.append("\n");
        stringBuffer.append(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append((String) null);
        LIZ3.append("\n");
        stringBuffer.append(X1D.LIZIZ(LIZ3));
        return stringBuffer.toString();
    }

    public static void LIZIZ() {
        if (!Npth.isInit()) {
            return;
        }
        C64246PJi LJJIFFI = C64246PJi.LJJIFFI(new StackTraceElement(C39614Fgg.class.getName(), "report", "BitmapEvent", 0), null, null, C16880lQ.LLLLIIIILLL().getName(), false, "EnsureNotNull", "BitmapWarning");
        LJJIFFI.LIZIZ("CreateThread", null);
        LJJIFFI.LIZIZ("CreateTime", String.valueOf(0L));
        LJJIFFI.LIZIZ("BitmapWidth", String.valueOf(0));
        LJJIFFI.LIZIZ("BitmapHeigth", String.valueOf(0));
        if ("BitmapOverViewEvent".equals(null)) {
            LJJIFFI.LIZIZ("ImageViewHeigth", String.valueOf(0));
            LJJIFFI.LIZIZ("ImageViewWidth", String.valueOf(0));
        }
        C64241PJd.LIZIZ(LJJIFFI);
    }
}
