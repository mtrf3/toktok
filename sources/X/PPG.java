package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.i0;
import java.net.ProtocolException;

/* loaded from: classes12.dex */
public final class PPG {
    public final EnumC64572PVw LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.LIZ == EnumC64572PVw.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.LIZIZ);
        if (this.LIZJ != null) {
            sb.append(' ');
            sb.append(this.LIZJ);
        }
        return sb.toString();
    }

    public static PPG LIZ(String str) {
        EnumC64572PVw enumC64572PVw;
        int i;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC64572PVw = EnumC64572PVw.HTTP_1_0;
                } else if (charAt == 1) {
                    enumC64572PVw = EnumC64572PVw.HTTP_1_1;
                } else {
                    throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            enumC64572PVw = EnumC64572PVw.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = CastIntegerProtector.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
                    }
                } else {
                    str2 = "";
                }
                return new PPG(enumC64572PVw, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(i0.LJFF("Unexpected status line: ", str));
    }

    public PPG(EnumC64572PVw enumC64572PVw, int i, String str) {
        this.LIZ = enumC64572PVw;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
