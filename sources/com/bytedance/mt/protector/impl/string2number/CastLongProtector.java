package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;
import X.JF1;
import X.OUR;

/* loaded from: classes9.dex */
public class CastLongProtector extends C65858Pt0<Long> {
    public static long parseLong(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Long.parseLong(str);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        return Long.parseLong(str);
    }

    public static long parseUnsignedLong(String str) {
        int i;
        long j;
        long j2;
        long j3;
        if (C65415Plr.LIZIZ()) {
            try {
                return OUR.LIZIZ(str);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        int length = str.length();
        if (length != 0) {
            int i2 = 10;
            long j4 = 10;
            long j5 = Long.MIN_VALUE;
            int i3 = 0;
            if (j4 < 0) {
                if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                    j = 0;
                } else {
                    j = 1;
                }
            } else {
                long j6 = (Long.MAX_VALUE / j4) << 1;
                if ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                    i = 1;
                } else {
                    i = 0;
                }
                j = j6 + i;
            }
            if (str.charAt(0) == '+' && length > 1) {
                i3 = 1;
            }
            long j7 = 0;
            while (i3 < length) {
                int digit = Character.digit(str.charAt(i3), i2);
                if (digit != -1) {
                    if (j7 >= 0 && j7 <= j) {
                        if (j7 == j) {
                            if (j4 < 0) {
                                if (Long.MAX_VALUE < (j4 ^ j5)) {
                                    j3 = -1;
                                } else {
                                    j3 = (-1) - j4;
                                }
                            } else {
                                long j8 = (-1) - (((Long.MAX_VALUE / j4) << 1) * j4);
                                if ((j8 ^ j5) >= (j4 ^ j5)) {
                                    j2 = j4;
                                } else {
                                    j2 = 0;
                                }
                                j3 = j8 - j2;
                            }
                            if (digit <= ((int) j3)) {
                            }
                        }
                        j7 = (j7 * j4) + digit;
                        i3++;
                        i2 = 10;
                        j5 = Long.MIN_VALUE;
                    }
                    throw new NumberFormatException("Too large for unsigned long: ".concat(str));
                }
                throw new NumberFormatException(str);
            }
            return j7;
        }
        throw new NumberFormatException("empty string");
    }

    public static Long valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Long.valueOf(str);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l;
                }
                throw th;
            }
        }
        return Long.valueOf(str);
    }

    public static long parseLong(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Long.parseLong(str, i);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        return Long.parseLong(str, i);
    }

    public static long parseUnsignedLong(String str, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        if (C65415Plr.LIZIZ()) {
            try {
                return JF1.LIZ(i, str);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        int length = str.length();
        if (length != 0) {
            if (i >= 2 && i <= 36) {
                long j4 = i;
                long j5 = Long.MIN_VALUE;
                int i3 = 0;
                if (j4 < 0) {
                    if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                } else {
                    long j6 = (Long.MAX_VALUE / j4) << 1;
                    if ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    j = j6 + i2;
                }
                if (str.charAt(0) == '+' && length > 1) {
                    i3 = 1;
                }
                long j7 = 0;
                while (i3 < length) {
                    int digit = Character.digit(str.charAt(i3), i);
                    if (digit != -1) {
                        if (j7 >= 0 && j7 <= j) {
                            if (j7 == j) {
                                if (j4 < 0) {
                                    if (Long.MAX_VALUE < (j4 ^ j5)) {
                                        j3 = -1;
                                    } else {
                                        j3 = (-1) - j4;
                                    }
                                } else {
                                    long j8 = (-1) - (((Long.MAX_VALUE / j4) << 1) * j4);
                                    if ((j8 ^ j5) >= (j4 ^ j5)) {
                                        j2 = j4;
                                    } else {
                                        j2 = 0;
                                    }
                                    j3 = j8 - j2;
                                }
                                if (digit <= ((int) j3)) {
                                }
                            }
                            j7 = (j7 * j4) + digit;
                            i3++;
                            j5 = Long.MIN_VALUE;
                        }
                        throw new NumberFormatException("Too large for unsigned long: ".concat(str));
                    }
                    throw new NumberFormatException(str);
                }
                return j7;
            }
            throw new NumberFormatException("illegal radix: ".concat(String.valueOf(i)));
        }
        throw new NumberFormatException("empty string");
    }

    public static Long valueOf(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Long.valueOf(str, i);
            } catch (Throwable th) {
                Long l = (Long) C65858Pt0.tryProtect(th, Long.class);
                if (l != null) {
                    return l;
                }
                throw th;
            }
        }
        return Long.valueOf(str, i);
    }
}
