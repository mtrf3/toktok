package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.IxV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48301IxV {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C48301IxV.class);
    }

    public C48301IxV() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    public static float LIZ(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return CastFloatProtector.valueOf(decimalFormat.format((((float) j) / 1024.0f) / 1024.0f).replaceAll(",", ".")).floatValue();
    }
}
