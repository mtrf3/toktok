package X;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.i0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ioa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47748Ioa {
    public static C47748Ioa LIZIZ = null;
    public static int LIZJ = -1;
    public static int LIZLLL = 100;
    public final ConcurrentHashMap<String, C47749Iob> LIZ = new ConcurrentHashMap<>();

    public static C47748Ioa LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C47748Ioa.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C47748Ioa();
                }
            }
        }
        return LIZIZ;
    }

    public static void LJI(int i) {
        LIZLLL = i;
    }

    public static void LJII(int i) {
        LIZJ = i;
    }

    public static String LIZJ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        char c;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str10 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split("[?]");
        if (split.length >= 2) {
            String[] split2 = split[1].split("&");
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            for (String str11 : split2) {
                if (str11.indexOf("codec_type") == 0) {
                    str10 = str11.substring(11);
                } else if (str11.indexOf("CodecType") == 0) {
                    str10 = str11.substring(10);
                } else if (str11.indexOf("Codec") == 0) {
                    str10 = str11.substring(6);
                } else if (str11.indexOf("format_type") == 0) {
                    str3 = str11.substring(12);
                } else if (str11.indexOf("FormatType") == 0) {
                    str3 = str11.substring(11);
                } else if (str11.indexOf("Format") == 0) {
                    str3 = str11.substring(7);
                } else if (str11.indexOf("ptoken") == 0) {
                    str4 = str11.substring(7);
                } else if (str11.indexOf("PToken") == 0) {
                    str4 = str11.substring(7);
                } else if (str11.indexOf("ssl") == 0) {
                    str5 = str11.substring(4);
                } else if (str11.indexOf("Ssl") == 0) {
                    str5 = str11.substring(4);
                } else if (str11.indexOf("HDRDefinition") == 0) {
                    str6 = str11.substring(14);
                } else if (str11.indexOf("FileType") == 0) {
                    str7 = str11.substring(9);
                } else if (str11.indexOf("UnionInfo") == 0) {
                    str8 = str11.substring(10);
                } else if (str11.indexOf("DrmExpireTimestamp") == 0) {
                    str9 = str11.substring(19);
                }
            }
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(str10)) {
            c = 0;
            sb.append(C16880lQ.LLLZ("/%s", new Object[]{str10}));
        } else {
            c = 0;
        }
        if (!TextUtils.isEmpty(str3)) {
            Object[] objArr = new Object[1];
            objArr[c] = str3;
            sb.append(C16880lQ.LLLZ("/%s", objArr));
        }
        if (!TextUtils.isEmpty(str4)) {
            Object[] objArr2 = new Object[1];
            objArr2[c] = str4;
            sb.append(C16880lQ.LLLZ("/%s", objArr2));
        }
        if (!TextUtils.isEmpty(str5)) {
            Object[] objArr3 = new Object[1];
            objArr3[c] = str5;
            sb.append(C16880lQ.LLLZ("/%s", objArr3));
        }
        if (!TextUtils.isEmpty(str6)) {
            Object[] objArr4 = new Object[1];
            objArr4[c] = i0.LJFF("hdr_", str6);
            sb.append(C16880lQ.LLLZ("/%s", objArr4));
        }
        if (!TextUtils.isEmpty(str7)) {
            Object[] objArr5 = new Object[1];
            objArr5[c] = str7;
            sb.append(C16880lQ.LLLZ("/%s", objArr5));
        }
        if (!TextUtils.isEmpty(str8)) {
            Object[] objArr6 = new Object[1];
            objArr6[c] = str8;
            sb.append(C16880lQ.LLLZ("/%s", objArr6));
        }
        if (!TextUtils.isEmpty(str9)) {
            Object[] objArr7 = new Object[1];
            objArr7[c] = str9;
            sb.append(C16880lQ.LLLZ("/%s", objArr7));
        }
        return sb.toString();
    }

    public final synchronized C47749Iob LIZ(String str, String str2) {
        if (this.LIZ != null) {
            String LIZJ2 = LIZJ(str, str2);
            if (TextUtils.isEmpty(LIZJ2)) {
                return null;
            }
            C47749Iob c47749Iob = this.LIZ.get(LIZJ2);
            if (c47749Iob != null) {
                int i = LIZJ;
                if (i <= 0) {
                    C47164IfA c47164IfA = c47749Iob.LIZ;
                    if (c47164IfA != null) {
                        i = (c47164IfA.LJII(3) + 3600) - 300;
                    } else {
                        i = 3600;
                    }
                }
                if (SystemClock.elapsedRealtime() - c47749Iob.LIZIZ > i * 1000) {
                    c47749Iob.LIZJ = true;
                } else {
                    c47749Iob.LIZJ = false;
                }
                return c47749Iob;
            }
        }
        return null;
    }

    public final synchronized void LJFF(String str, String str2) {
        if (this.LIZ != null) {
            String LIZJ2 = LIZJ(str, str2);
            if (TextUtils.isEmpty(LIZJ2)) {
            } else {
                this.LIZ.remove(LIZJ2);
            }
        }
    }

    public final synchronized void LIZLLL(String str, String str2, C47749Iob c47749Iob) {
        String LIZJ2 = LIZJ(str, str2);
        if (TextUtils.isEmpty(LIZJ2)) {
            return;
        }
        this.LIZ.put(LIZJ2, c47749Iob);
        if (this.LIZ.size() > LIZLLL) {
            long j = Long.MAX_VALUE;
            String str3 = null;
            for (Map.Entry<String, C47749Iob> entry : this.LIZ.entrySet()) {
                long j2 = entry.getValue().LIZIZ;
                if (j2 < j) {
                    str3 = entry.getKey();
                    j = j2;
                }
            }
            if (str3 != null) {
                this.LIZ.remove(str3);
            }
        }
    }

    public final synchronized void LJ(String str, String str2, C47164IfA c47164IfA) {
        if (this.LIZ == null || str == null || str2 == null) {
            return;
        }
        C47749Iob c47749Iob = new C47749Iob();
        c47749Iob.LIZ = c47164IfA;
        c47749Iob.LIZIZ = SystemClock.elapsedRealtime();
        LIZLLL(str, str2, c47749Iob);
    }
}
