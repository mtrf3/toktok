package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.5hR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141815hR {
    public static void LIZ(C152135y5 c152135y5, String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z2) {
                sb.append(charAt);
                if (sb.length() == 4) {
                    try {
                        c152135y5.write((char) CastIntegerProtector.parseInt(sb.toString(), 16));
                        sb.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unable to parse unicode value: ");
                        LIZ.append((Object) sb);
                        throw new RuntimeException(X1D.LIZIZ(LIZ), e);
                    }
                } else {
                    continue;
                }
            } else if (z) {
                if (charAt != '\"') {
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            if (charAt != 'b') {
                                if (charAt != 'f') {
                                    if (charAt != 'n') {
                                        if (charAt != 'r') {
                                            if (charAt != 't') {
                                                if (charAt != 'u') {
                                                    c152135y5.write(charAt);
                                                } else {
                                                    z = false;
                                                    z2 = true;
                                                }
                                            } else {
                                                c152135y5.write(9);
                                            }
                                        } else {
                                            c152135y5.write(13);
                                        }
                                    } else {
                                        c152135y5.write(10);
                                    }
                                } else {
                                    c152135y5.write(12);
                                }
                            } else {
                                c152135y5.write(8);
                            }
                        } else {
                            c152135y5.write(92);
                        }
                    } else {
                        c152135y5.write(39);
                    }
                } else {
                    c152135y5.write(34);
                }
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                c152135y5.write(charAt);
            }
        }
        if (z) {
            c152135y5.write(92);
        }
    }
}
