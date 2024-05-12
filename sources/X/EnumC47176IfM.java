package X;

import android.text.TextUtils;

/* renamed from: X.IfM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47176IfM {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", "lossless"),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", ""),
    L_Standard_HDR("240p HDR", ""),
    Standard_HDR("360p HDR", ""),
    High_HDR("480p HDR", ""),
    H_High_HDR("540p HDR", ""),
    SuperHigh_HDR("720p HDR", ""),
    ExtremelyHigh_HDR("1080p HDR", ""),
    TwoK_HDR("2k HDR", ""),
    FourK_HDR("4k HDR", ""),
    EightK("8k", ""),
    ExtremelyHighPlus("1080p+", "");

    public final String LJLIL;
    public final String LJLILLLLZI;

    public static EnumC47176IfM[] getAllResolutions() {
        try {
            return new EnumC47176IfM[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHighPlus, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F, L_Standard_HDR, Standard_HDR, High_HDR, H_High_HDR, SuperHigh_HDR, ExtremelyHigh_HDR, TwoK_HDR, FourK_HDR, EightK};
        } catch (Exception unused) {
            return new EnumC47176IfM[0];
        }
    }

    public int getIndex() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static EnumC47176IfM forString(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        if (str.equals("Undefine")) {
            return Undefine;
        }
        if (str.equals("Standard")) {
            return Standard;
        }
        if (str.equals("High")) {
            return High;
        }
        if (str.equals("SuperHigh")) {
            return SuperHigh;
        }
        if (str.equals("FourK")) {
            return FourK;
        }
        if (str.equals("HDR")) {
            return HDR;
        }
        if (str.equals("Auto")) {
            return Auto;
        }
        if (str.equals("L_Standard")) {
            return L_Standard;
        }
        if (str.equals("H_High")) {
            return H_High;
        }
        if (str.equals("TwoK")) {
            return TwoK;
        }
        if (str.equals("ExtremelyHigh_50F")) {
            return ExtremelyHigh_50F;
        }
        if (str.equals("TwoK_50F")) {
            return TwoK_50F;
        }
        if (str.equals("FourK_50F")) {
            return FourK_50F;
        }
        if (str.equals("ExtremelyHigh_60F")) {
            return ExtremelyHigh_60F;
        }
        if (str.equals("TwoK_60F")) {
            return TwoK_60F;
        }
        if (str.equals("FourK_60F")) {
            return FourK_60F;
        }
        if (str.equals("ExtremelyHigh_120F")) {
            return ExtremelyHigh_120F;
        }
        if (str.equals("TwoK_120F")) {
            return TwoK_120F;
        }
        if (str.equals("FourK_120F")) {
            return FourK_120F;
        }
        if (str.equals("L_Standard_HDR")) {
            return L_Standard_HDR;
        }
        if (str.equals("Standard_HDR")) {
            return Standard_HDR;
        }
        if (str.equals("High_HDR")) {
            return High_HDR;
        }
        if (str.equals("H_High_HDR")) {
            return H_High_HDR;
        }
        if (str.equals("SuperHigh_HDR")) {
            return SuperHigh_HDR;
        }
        if (str.equals("ExtremelyHigh_HDR")) {
            return ExtremelyHigh_HDR;
        }
        if (str.equals("TwoK_HDR")) {
            return TwoK_HDR;
        }
        if (str.equals("FourK_HDR")) {
            return FourK_HDR;
        }
        if (str.equals("EightK")) {
            return EightK;
        }
        if (str.equals("1080p+")) {
            return ExtremelyHighPlus;
        }
        return Undefine;
    }

    public static String toString(EnumC47176IfM enumC47176IfM) {
        if (enumC47176IfM == null || enumC47176IfM == Undefine) {
            return "Undefine";
        }
        if (enumC47176IfM == Standard) {
            return "Standard";
        }
        if (enumC47176IfM == High) {
            return "High";
        }
        if (enumC47176IfM == SuperHigh) {
            return "SuperHigh";
        }
        if (enumC47176IfM == FourK) {
            return "FourK";
        }
        if (enumC47176IfM == HDR) {
            return "HDR";
        }
        if (enumC47176IfM == Auto) {
            return "Auto";
        }
        if (enumC47176IfM == L_Standard) {
            return "L_Standard";
        }
        if (enumC47176IfM == H_High) {
            return "H_High";
        }
        if (enumC47176IfM == TwoK) {
            return "TwoK";
        }
        if (enumC47176IfM == ExtremelyHigh_50F) {
            return "ExtremelyHigh_50F";
        }
        if (enumC47176IfM == TwoK_50F) {
            return "TwoK_50F";
        }
        if (enumC47176IfM == FourK_50F) {
            return "FourK_50F";
        }
        if (enumC47176IfM == ExtremelyHigh_60F) {
            return "ExtremelyHigh_60F";
        }
        if (enumC47176IfM == TwoK_60F) {
            return "TwoK_60F";
        }
        if (enumC47176IfM == FourK_60F) {
            return "FourK_60F";
        }
        if (enumC47176IfM == ExtremelyHigh_120F) {
            return "ExtremelyHigh_120F";
        }
        if (enumC47176IfM == TwoK_120F) {
            return "TwoK_120F";
        }
        if (enumC47176IfM == FourK_120F) {
            return "FourK_120F";
        }
        if (enumC47176IfM == L_Standard_HDR) {
            return "L_Standard_HDR";
        }
        if (enumC47176IfM == Standard_HDR) {
            return "Standard_HDR";
        }
        if (enumC47176IfM == High_HDR) {
            return "High_HDR";
        }
        if (enumC47176IfM == H_High_HDR) {
            return "H_High_HDR";
        }
        if (enumC47176IfM == SuperHigh_HDR) {
            return "SuperHigh_HDR";
        }
        if (enumC47176IfM == ExtremelyHigh_HDR) {
            return "ExtremelyHigh_HDR";
        }
        if (enumC47176IfM == TwoK_HDR) {
            return "TwoK_HDR";
        }
        if (enumC47176IfM == FourK_HDR) {
            return "FourK_HDR";
        }
        if (enumC47176IfM == EightK) {
            return "EightK";
        }
        if (enumC47176IfM != ExtremelyHighPlus) {
            return "Undefine";
        }
        return "1080p+";
    }

    public static EnumC47176IfM valueOf(int i) {
        EnumC47176IfM enumC47176IfM = Undefine;
        if (i >= enumC47176IfM.ordinal() && i <= FourK_HDR.ordinal()) {
            return values()[i];
        }
        return enumC47176IfM;
    }

    public static EnumC47176IfM valueOf(String str) {
        return (EnumC47176IfM) V0N.LJJJ(EnumC47176IfM.class, str);
    }

    public String toString(int i) {
        if (i == 1) {
            return this.LJLILLLLZI;
        }
        if (i == 0) {
            return this.LJLIL;
        }
        return "";
    }

    EnumC47176IfM(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
