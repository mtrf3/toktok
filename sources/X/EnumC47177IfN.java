package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.IfN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47177IfN {
    Undefine("", 0),
    Standard("360p", 360),
    High("480p", 480),
    SuperHigh("720p", 720),
    ExtremelyHigh("1080p", 1080),
    FourK("4k", 2160),
    HDR("hdr", 4096),
    Auto("auto", 0),
    L_Standard("240p", 240),
    H_High("540p", 540),
    TwoK("2k", 1080),
    ExtremelyHigh_50F("1080p 50fps", 1080),
    TwoK_50F("2k 50fps", 1080),
    FourK_50F("4k 50fps", 2160),
    ExtremelyHigh_60F("1080p 60fps", 1080),
    TwoK_60F("2k 60fps", 1080),
    FourK_60F("4k 60fps", 2160),
    ExtremelyHigh_120F("1080p 120fps", 1080),
    TwoK_120F("2k 120fps", 1080),
    FourK_120F("4k 120fps", 2160);

    public final String LJLIL;
    public final int LJLILLLLZI;
    public List<Integer> allBitrates;
    public int bitrate;
    public int bitrateQuality;
    public double curveFirstParam;
    public double curveFourthParam;
    public double curveMinBitrate;
    public double curveSecondParam;
    public double curveThirdParam;
    public int nativeBrSelectDiff;
    public String nativeChangedReason;
    public String originChangedReason;
    public int speed;

    public int getResolutionInt() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static EnumC47177IfN fromStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        EnumC47177IfN enumC47177IfN = Standard;
        if (str.equals(enumC47177IfN.toString())) {
            return enumC47177IfN;
        }
        EnumC47177IfN enumC47177IfN2 = High;
        if (str.equals(enumC47177IfN2.toString())) {
            return enumC47177IfN2;
        }
        EnumC47177IfN enumC47177IfN3 = SuperHigh;
        if (str.equals(enumC47177IfN3.toString())) {
            return enumC47177IfN3;
        }
        EnumC47177IfN enumC47177IfN4 = ExtremelyHigh;
        if (str.equals(enumC47177IfN4.toString())) {
            return enumC47177IfN4;
        }
        EnumC47177IfN enumC47177IfN5 = FourK;
        if (str.equals(enumC47177IfN5.toString())) {
            return enumC47177IfN5;
        }
        EnumC47177IfN enumC47177IfN6 = HDR;
        if (str.equals(enumC47177IfN6.toString())) {
            return enumC47177IfN6;
        }
        EnumC47177IfN enumC47177IfN7 = Auto;
        if (str.equals(enumC47177IfN7.toString())) {
            return enumC47177IfN7;
        }
        EnumC47177IfN enumC47177IfN8 = L_Standard;
        if (str.equals(enumC47177IfN8.toString())) {
            return enumC47177IfN8;
        }
        EnumC47177IfN enumC47177IfN9 = H_High;
        if (str.equals(enumC47177IfN9.toString())) {
            return enumC47177IfN9;
        }
        EnumC47177IfN enumC47177IfN10 = TwoK;
        if (str.equals(enumC47177IfN10.toString())) {
            return enumC47177IfN10;
        }
        EnumC47177IfN enumC47177IfN11 = ExtremelyHigh_50F;
        if (str.equals(enumC47177IfN11.toString())) {
            return enumC47177IfN11;
        }
        EnumC47177IfN enumC47177IfN12 = TwoK_50F;
        if (str.equals(enumC47177IfN12.toString())) {
            return enumC47177IfN12;
        }
        EnumC47177IfN enumC47177IfN13 = FourK_50F;
        if (str.equals(enumC47177IfN13.toString())) {
            return enumC47177IfN13;
        }
        EnumC47177IfN enumC47177IfN14 = ExtremelyHigh_60F;
        if (str.equals(enumC47177IfN14.toString())) {
            return enumC47177IfN14;
        }
        EnumC47177IfN enumC47177IfN15 = TwoK_60F;
        if (str.equals(enumC47177IfN15.toString())) {
            return enumC47177IfN15;
        }
        EnumC47177IfN enumC47177IfN16 = FourK_60F;
        if (str.equals(enumC47177IfN16.toString())) {
            return enumC47177IfN16;
        }
        EnumC47177IfN enumC47177IfN17 = ExtremelyHigh_120F;
        if (str.equals(enumC47177IfN17.toString())) {
            return enumC47177IfN17;
        }
        EnumC47177IfN enumC47177IfN18 = TwoK_120F;
        if (str.equals(enumC47177IfN18.toString())) {
            return enumC47177IfN18;
        }
        EnumC47177IfN enumC47177IfN19 = FourK_120F;
        if (str.equals(enumC47177IfN19.toString())) {
            return enumC47177IfN19;
        }
        return Undefine;
    }

    public static EnumC47177IfN valueOf(String str) {
        return (EnumC47177IfN) V0N.LJJJ(EnumC47177IfN.class, str);
    }

    EnumC47177IfN(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
