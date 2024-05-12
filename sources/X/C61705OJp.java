package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.OJp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61705OJp implements Serializable {
    public static final TimeZone LJLJJI = TimeZone.getTimeZone("GMT");
    public static final Pattern LJLJJL = PatternProtector.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    public static final long serialVersionUID = 1;
    public final long LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    public int hashCode() {
        long j;
        long[] jArr = new long[3];
        jArr[0] = this.LJLIL;
        if (this.LJLILLLLZI) {
            j = 1;
        } else {
            j = 0;
        }
        jArr[1] = j;
        jArr[2] = this.LJLJI;
        return Arrays.hashCode(jArr);
    }

    public String toStringRfc3339() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(LJLJJI);
        gregorianCalendar.setTimeInMillis((this.LJLJI * 60000) + this.LJLIL);
        LIZ(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        LIZ(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        LIZ(sb, gregorianCalendar.get(5), 2);
        if (!this.LJLILLLLZI) {
            sb.append('T');
            LIZ(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            LIZ(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            LIZ(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                LIZ(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.LJLJI;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                LIZ(sb, i / 60, 2);
                sb.append(':');
                LIZ(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public String toString() {
        return toStringRfc3339();
    }

    public int getTimeZoneShift() {
        return this.LJLJI;
    }

    public long getValue() {
        return this.LJLIL;
    }

    public boolean isDateOnly() {
        return this.LJLILLLLZI;
    }

    public C61705OJp(String str) {
        C61705OJp parseRfc3339 = parseRfc3339(str);
        this.LJLILLLLZI = parseRfc3339.LJLILLLLZI;
        this.LJLIL = parseRfc3339.LJLIL;
        this.LJLJI = parseRfc3339.LJLJI;
    }

    public static C61705OJp parseRfc3339(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        int parseInt;
        String str2;
        String str3;
        Matcher matcher = LJLJJL.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Invalid date/time format: ".concat(valueOf);
            } else {
                str3 = new String("Invalid date/time format: ");
            }
            throw new NumberFormatException(str3);
        }
        int parseInt2 = CastIntegerProtector.parseInt(matcher.group(1));
        int parseInt3 = CastIntegerProtector.parseInt(matcher.group(2)) - 1;
        int parseInt4 = CastIntegerProtector.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            z = true;
        } else {
            z = false;
        }
        String group = matcher.group(9);
        if (group != null) {
            z2 = true;
            if (!z) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2 = "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(valueOf2);
                } else {
                    str2 = new String("Invalid date/time format, cannot specify time zone shift without specifying time: ");
                }
                throw new NumberFormatException(str2);
            }
        } else {
            z2 = false;
            if (!z) {
                z3 = false;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                GregorianCalendar gregorianCalendar = new GregorianCalendar(LJLJJI);
                gregorianCalendar.set(parseInt2, parseInt3, parseInt4, i2, i3, i4);
                gregorianCalendar.set(14, i);
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                if (!z3 && z2) {
                    if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                        parseInt = 0;
                    } else {
                        parseInt = CastIntegerProtector.parseInt(matcher.group(12)) + (CastIntegerProtector.parseInt(matcher.group(11)) * 60);
                        if (matcher.group(10).charAt(0) == '-') {
                            parseInt = -parseInt;
                        }
                        timeInMillis -= parseInt * 60000;
                    }
                    num = Integer.valueOf(parseInt);
                } else {
                    num = null;
                }
                return new C61705OJp(true ^ z3, timeInMillis, num);
            }
        }
        i2 = CastIntegerProtector.parseInt(matcher.group(5));
        i3 = CastIntegerProtector.parseInt(matcher.group(6));
        i4 = CastIntegerProtector.parseInt(matcher.group(7));
        if (matcher.group(8) != null) {
            z3 = true;
            i = (int) (CastIntegerProtector.parseInt(matcher.group(8).substring(1)) / Math.pow(10.0d, matcher.group(8).substring(1).length() - 3));
        } else {
            z3 = true;
            i = 0;
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(LJLJJI);
        gregorianCalendar2.set(parseInt2, parseInt3, parseInt4, i2, i3, i4);
        gregorianCalendar2.set(14, i);
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
        if (!z3) {
        }
        num = null;
        return new C61705OJp(true ^ z3, timeInMillis2, num);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C61705OJp)) {
            return false;
        }
        C61705OJp c61705OJp = (C61705OJp) obj;
        if (this.LJLILLLLZI == c61705OJp.LJLILLLLZI && this.LJLIL == c61705OJp.LJLIL && this.LJLJI == c61705OJp.LJLJI) {
            return true;
        }
        return false;
    }

    public C61705OJp(Date date) {
        this(date.getTime());
    }

    public C61705OJp(long j) {
        this(false, j, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61705OJp(java.util.Date r5, java.util.TimeZone r6) {
        /*
            r4 = this;
            long r2 = r5.getTime()
            if (r6 != 0) goto Lc
            r1 = 0
        L7:
            r0 = 0
            r4.<init>(r0, r2, r1)
            return
        Lc:
            long r0 = r5.getTime()
            int r1 = r6.getOffset(r0)
            r0 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 / r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61705OJp.<init>(java.util.Date, java.util.TimeZone):void");
    }

    public C61705OJp(long j, int i) {
        this(false, j, Integer.valueOf(i));
    }

    public C61705OJp(boolean z, long j, Integer num) {
        int intValue;
        this.LJLILLLLZI = z;
        this.LJLIL = j;
        if (z) {
            intValue = 0;
        } else if (num == null) {
            intValue = TimeZone.getDefault().getOffset(j) / 60000;
        } else {
            intValue = num.intValue();
        }
        this.LJLJI = intValue;
    }

    public static void LIZ(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
