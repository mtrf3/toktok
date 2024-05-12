package X;

import defpackage.i0;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: X.OJf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61695OJf {
    public final Hashtable LIZ = new Hashtable();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r5 >= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        r1 = r7.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r1 == '\\') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r1 != '\"') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r4.append(r1);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r4.append('\\');
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r4.append('\"');
        r7 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r4 = new java.lang.StringBuffer();
        r4.ensureCapacity((int) (r6 * 1.5d));
        r4.append('\"');
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.util.Hashtable r0 = r10.LIZ
            int r0 = r0.size()
            int r0 = r0 * 16
            r8.ensureCapacity(r0)
            java.util.Hashtable r0 = r10.LIZ
            java.util.Enumeration r9 = r0.keys()
        L16:
            boolean r0 = r9.hasMoreElements()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r9.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "; "
            r8.append(r0)
            r8.append(r1)
            r0 = 61
            r8.append(r0)
            java.util.Hashtable r0 = r10.LIZ
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r7.length()
            r5 = 0
            r1 = 0
            r0 = 0
        L3e:
            if (r1 >= r6) goto L4f
            if (r0 != 0) goto L51
            char r0 = r7.charAt(r1)
            boolean r0 = LIZ(r0)
            r0 = r0 ^ 1
            int r1 = r1 + 1
            goto L3e
        L4f:
            if (r0 == 0) goto L7f
        L51:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            double r2 = (double) r6
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.ensureCapacity(r0)
            r2 = 34
            r4.append(r2)
        L63:
            if (r5 >= r6) goto L78
            char r1 = r7.charAt(r5)
            r0 = 92
            if (r1 == r0) goto L6f
            if (r1 != r2) goto L72
        L6f:
            r4.append(r0)
        L72:
            r4.append(r1)
            int r5 = r5 + 1
            goto L63
        L78:
            r4.append(r2)
            java.lang.String r7 = r4.toString()
        L7f:
            r8.append(r7)
            goto L16
        L83:
            java.lang.String r0 = r8.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61695OJf.toString():java.lang.String");
    }

    public C61695OJf() {
    }

    public C61695OJf(String str) {
        int length;
        int i;
        String substring;
        if (str == null || (length = str.length()) <= 0) {
            return;
        }
        int LIZIZ = LIZIZ(0, str);
        while (LIZIZ < length && str.charAt(LIZIZ) == ';') {
            int LIZIZ2 = LIZIZ(LIZIZ + 1, str);
            if (LIZIZ2 >= length) {
                return;
            }
            int i2 = LIZIZ2;
            while (i2 < length && LIZ(str.charAt(i2))) {
                i2++;
            }
            String lowerCase = str.substring(LIZIZ2, i2).toLowerCase(Locale.ENGLISH);
            int LIZIZ3 = LIZIZ(i2, str);
            if (LIZIZ3 < length && str.charAt(LIZIZ3) == '=') {
                int LIZIZ4 = LIZIZ(LIZIZ3 + 1, str);
                if (LIZIZ4 < length) {
                    char charAt = str.charAt(LIZIZ4);
                    if (charAt == '\"') {
                        int i3 = LIZIZ4 + 1;
                        if (i3 < length) {
                            int i4 = i3;
                            while (true) {
                                if (i4 < length) {
                                    charAt = str.charAt(i4);
                                    if (charAt == '\"') {
                                        break;
                                    }
                                    if (charAt == '\\') {
                                        i4++;
                                    }
                                    i4++;
                                } else if (charAt != '\"') {
                                    throw new C61697OJh("Encountered unterminated quoted parameter value.");
                                }
                            }
                            String substring2 = str.substring(i3, i4);
                            int length2 = substring2.length();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.ensureCapacity(length2);
                            boolean z = false;
                            for (int i5 = 0; i5 < length2; i5++) {
                                char charAt2 = substring2.charAt(i5);
                                if (!z) {
                                    if (charAt2 != '\\') {
                                        stringBuffer.append(charAt2);
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    stringBuffer.append(charAt2);
                                    z = false;
                                }
                            }
                            substring = stringBuffer.toString();
                            i = i4 + 1;
                        } else {
                            throw new C61697OJh("Encountered unterminated quoted parameter value.");
                        }
                    } else if (LIZ(charAt)) {
                        i = LIZIZ4;
                        while (i < length && LIZ(str.charAt(i))) {
                            i++;
                        }
                        substring = str.substring(LIZIZ4, i);
                    } else {
                        throw new C61697OJh(KMP.LJ("Unexpected character encountered at index ", LIZIZ4));
                    }
                    this.LIZ.put(lowerCase, substring);
                    LIZIZ = LIZIZ(i, str);
                } else {
                    throw new C61697OJh(i0.LJFF("Couldn't find a value for parameter named ", lowerCase));
                }
            } else {
                throw new C61697OJh("Couldn't find the '=' that separates a parameter name from its value.");
            }
        }
        if (LIZIZ < length) {
            throw new C61697OJh("More characters encountered in input than expected.");
        }
    }

    public static boolean LIZ(char c) {
        if (c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0) {
            return true;
        }
        return false;
    }

    public static int LIZIZ(int i, String str) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
