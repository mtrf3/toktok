package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;
import defpackage.s0;

/* loaded from: classes9.dex */
public class CastIntegerProtector extends C65858Pt0<Integer> {
    public static int parseInt(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Integer.parseInt(str);
    }

    public static int parseUnsignedInt(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                if (str.length() > 1 && str.charAt(0) == '+') {
                    str = str.substring(1);
                }
                long parseLong = Long.parseLong(str, 10);
                if ((4294967295L & parseLong) == parseLong) {
                    return (int) parseLong;
                }
                throw new NumberFormatException("Input " + str + " in base 10 is not in the range of an unsigned integer");
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong2 = Long.parseLong(str, 10);
        if ((4294967295L & parseLong2) == parseLong2) {
            return (int) parseLong2;
        }
        throw new NumberFormatException("Input " + str + " in base 10 is not in the range of an unsigned integer");
    }

    public static Integer valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Integer.valueOf(str);
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num;
                }
                throw th;
            }
        }
        return Integer.valueOf(str);
    }

    public static int parseInt(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Integer.parseInt(str, i);
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Integer.parseInt(str, i);
    }

    public static int parseUnsignedInt(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return s0.LIZ(i, str);
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    public static Integer valueOf(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Integer.valueOf(str, i);
            } catch (Throwable th) {
                Integer num = (Integer) C65858Pt0.tryProtect(th, Integer.class);
                if (num != null) {
                    return num;
                }
                throw th;
            }
        }
        return Integer.valueOf(str, i);
    }
}
