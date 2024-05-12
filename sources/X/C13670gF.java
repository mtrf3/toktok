package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;

/* renamed from: X.0gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13670gF {
    public static final C42891mH LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final C13670gF LJI;
    public static final C13670gF LJII;
    public final boolean LIZ;
    public final int LIZIZ;
    public final InterfaceC13740gM LIZJ;

    static {
        C42891mH c42891mH = C13760gO.LIZJ;
        LIZLLL = c42891mH;
        LJ = Character.toString((char) 8206);
        LJFF = Character.toString((char) 8207);
        LJI = new C13670gF(false, 2, c42891mH);
        LJII = new C13670gF(true, 2, c42891mH);
    }

    public static C13670gF LIZJ() {
        return new C13650gD().LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        if (r8 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0078, code lost:
    
        if (r4.LIZJ <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        switch(r4.LIZ()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L63;
            case 17: goto L63;
            case 18: goto L62;
            default: goto L68;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0085, code lost:
    
        if (r3 != r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008d, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r3 != r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.CharSequence r8) {
        /*
            X.0gE r4 = new X.0gE
            r4.<init>(r8)
            r5 = 0
            r4.LIZJ = r5
            r3 = 0
            r8 = 0
            r2 = 0
        Lb:
            int r1 = r4.LIZJ
            int r0 = r4.LIZIZ
            r7 = 1
            if (r1 >= r0) goto L6f
            if (r3 != 0) goto L72
            java.lang.CharSequence r0 = r4.LIZ
            char r0 = r0.charAt(r1)
            r4.LIZLLL = r0
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L59
            java.lang.CharSequence r1 = r4.LIZ
            int r0 = r4.LIZJ
            int r6 = java.lang.Character.codePointAt(r1, r0)
            int r1 = r4.LIZJ
            int r0 = java.lang.Character.charCount(r6)
            int r0 = r0 + r1
            r4.LIZJ = r0
            byte r1 = java.lang.Character.getDirectionality(r6)
        L37:
            if (r1 == 0) goto L56
            if (r1 == r7) goto L53
            r0 = 2
            if (r1 == r0) goto L53
            r0 = 9
            if (r1 == r0) goto Lb
            switch(r1) {
                case 14: goto L4f;
                case 15: goto L4f;
                case 16: goto L4b;
                case 17: goto L4b;
                case 18: goto L47;
                default: goto L45;
            }
        L45:
            r3 = r2
            goto Lb
        L47:
            int r2 = r2 + (-1)
            r8 = 0
            goto Lb
        L4b:
            int r2 = r2 + 1
            r8 = 1
            goto Lb
        L4f:
            int r2 = r2 + 1
            r8 = -1
            goto Lb
        L53:
            if (r2 != 0) goto L45
            goto L87
        L56:
            if (r2 != 0) goto L45
            goto L8b
        L59:
            int r0 = r4.LIZJ
            int r0 = r0 + 1
            r4.LIZJ = r0
            char r1 = r4.LIZLLL
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L6a
            byte[] r0 = X.C13660gE.LJ
            r1 = r0[r1]
            goto L37
        L6a:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L37
        L6f:
            if (r3 != 0) goto L72
        L71:
            return r5
        L72:
            if (r8 == 0) goto L76
            r5 = r8
            goto L71
        L76:
            int r0 = r4.LIZJ
            if (r0 <= 0) goto L71
            byte r0 = r4.LIZ()
            switch(r0) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L85;
                case 17: goto L85;
                case 18: goto L82;
                default: goto L81;
            }
        L81:
            goto L76
        L82:
            int r2 = r2 + 1
            goto L76
        L85:
            if (r3 != r2) goto L8d
        L87:
            r5 = 1
            goto L71
        L89:
            if (r3 != r2) goto L8d
        L8b:
            r5 = -1
            goto L71
        L8d:
            int r2 = r2 + (-1)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13670gF.LIZ(java.lang.CharSequence):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    public static int LIZIZ(CharSequence charSequence) {
        C13660gE c13660gE = new C13660gE(charSequence);
        c13660gE.LIZJ = c13660gE.LIZIZ;
        int i = 0;
        int i2 = 0;
        while (c13660gE.LIZJ > 0) {
            byte LIZ = c13660gE.LIZ();
            if (LIZ != 0) {
                if (LIZ != 1 && LIZ != 2) {
                    if (LIZ != 9) {
                        switch (LIZ) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    public final boolean LIZLLL(String str) {
        return this.LIZJ.LIZ(str.length(), str);
    }

    public final String LJFF(String str) {
        InterfaceC13740gM interfaceC13740gM = this.LIZJ;
        if (str == null) {
            return null;
        }
        return ((SpannableStringBuilder) LJ(str, interfaceC13740gM)).toString();
    }

    public final CharSequence LJ(CharSequence charSequence, InterfaceC13740gM interfaceC13740gM) {
        boolean z;
        C42891mH c42891mH;
        char c;
        C42891mH c42891mH2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean LIZ = interfaceC13740gM.LIZ(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.LIZIZ & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            if (LIZ) {
                c42891mH2 = C13760gO.LIZIZ;
            } else {
                c42891mH2 = C13760gO.LIZ;
            }
            boolean LIZ2 = c42891mH2.LIZ(charSequence.length(), charSequence);
            if (!this.LIZ && (LIZ2 || LIZ(charSequence) == 1)) {
                str = LJ;
            } else if (!this.LIZ || (LIZ2 && LIZ(charSequence) != -1)) {
                str = "";
            } else {
                str = LJFF;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (LIZ != this.LIZ) {
            if (LIZ) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (LIZ) {
            c42891mH = C13760gO.LIZIZ;
        } else {
            c42891mH = C13760gO.LIZ;
        }
        boolean LIZ3 = c42891mH.LIZ(charSequence.length(), charSequence);
        if (!this.LIZ && (LIZ3 || LIZIZ(charSequence) == 1)) {
            str2 = LJ;
        } else if (this.LIZ && (!LIZ3 || LIZIZ(charSequence) == -1)) {
            str2 = LJFF;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public C13670gF(boolean z, int i, C42891mH c42891mH) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = c42891mH;
    }
}
