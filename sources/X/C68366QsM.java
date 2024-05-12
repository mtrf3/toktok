package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68366QsM implements InterfaceC68379QsZ {
    public final Double LJLIL;

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        boolean z = false;
        if (!Double.isNaN(this.LJLIL.doubleValue()) && this.LJLIL.doubleValue() != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return new C68366QsM(this.LJLIL);
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        int scale;
        if (Double.isNaN(this.LJLIL.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.LJLIL.doubleValue())) {
            if (this.LJLIL.doubleValue() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.LJLIL.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = CastIntegerProtector.parseInt(format.substring(indexOf + 1));
            if (parseInt >= 0 ? parseInt >= 21 : parseInt <= -7) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return stripTrailingZeros.toPlainString();
        }
        return format;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        return LJII();
    }

    public C68366QsM(Double d) {
        if (d == null) {
            this.LJLIL = Double.valueOf(Double.NaN);
        } else {
            this.LJLIL = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C68366QsM)) {
            return false;
        }
        return this.LJLIL.equals(((C68366QsM) obj).LJLIL);
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        if ("toString".equals(str)) {
            return new C68376QsW(LJII());
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%s.%s is not a function.", new Object[]{LJII(), str}));
    }
}
