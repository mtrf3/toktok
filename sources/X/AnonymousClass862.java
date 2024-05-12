package X;

import java.util.LinkedHashMap;

/* renamed from: X.862, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass862 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    public static OSZ LIZ(int i, CharSequence charSequence) {
        int i2;
        if (i >= charSequence.length()) {
            return new OSZ(AnonymousClass867.END_MARKUP, new C2056285e((CharSequence) null, 0, 7));
        }
        String str = "";
        if (charSequence.charAt(i) != AnonymousClass863.CHARACTER_LOWER_THAN.getText()) {
            int i3 = i;
            while (i3 < charSequence.length() && charSequence.charAt(i3) != AnonymousClass864.CHARACTER_START.getValue()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(charSequence.charAt(i3));
                str = X1D.LIZIZ(LIZ2);
                i3++;
            }
            if (str.length() > 0) {
                C2056285e c2056285e = new C2056285e(str, 1, 4);
                c2056285e.LIZLLL = i;
                c2056285e.LJ = i3;
                return new OSZ(AnonymousClass867.PLAIN_TEXT, c2056285e);
            }
        } else {
            Character LLI = C40689Fy1.LLI(i, charSequence);
            char value = AnonymousClass864.CHARACTER_START.getValue();
            if (LLI != null && LLI.charValue() == value) {
                int i4 = i + 1;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AnonymousClass865 anonymousClass865 = AnonymousClass865.TAG_INIT;
                boolean z = true;
                String str2 = "";
                String str3 = "";
                String str4 = "";
                while (i4 < charSequence.length()) {
                    char charAt = charSequence.charAt(i4);
                    switch (AnonymousClass866.LIZ[anonymousClass865.ordinal()]) {
                        case 1:
                            if (charAt == AnonymousClass864.CHARACTER_LINE_SLANT.getValue()) {
                                i4++;
                                z = false;
                            }
                            anonymousClass865 = AnonymousClass865.TAG_NAME_START;
                        case 2:
                            if (AnonymousClass861.LIZIZ(charAt)) {
                                str2 = C42398GkU.LIZIZ(str2, charAt);
                            } else if (charAt == AnonymousClass864.CHARACTER_END.getValue()) {
                                anonymousClass865 = AnonymousClass865.TAG_FINISH;
                            } else if (charAt == AnonymousClass864.CHARACTER_SPACE.getValue()) {
                                anonymousClass865 = AnonymousClass865.TAG_NAME_END;
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(str2);
                                LIZ3.append(" name contains ");
                                LIZ3.append(charAt);
                                LIZ3.append(" is invalid");
                                C85R.LIZIZ(X1D.LIZIZ(LIZ3));
                            }
                            i4++;
                        case 3:
                            if (charAt == AnonymousClass864.CHARACTER_END.getValue()) {
                                anonymousClass865 = AnonymousClass865.TAG_FINISH;
                            } else if (AnonymousClass861.LIZIZ(charAt)) {
                                anonymousClass865 = AnonymousClass865.TAG_ATTRIBUTE_NAME;
                                str3 = "";
                            } else {
                                if (charAt != AnonymousClass864.CHARACTER_SPACE.getValue()) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(str2);
                                    LIZ4.append(" name end contains ");
                                    LIZ4.append(charAt);
                                    LIZ4.append(" is invalid");
                                    C85R.LIZIZ(X1D.LIZIZ(LIZ4));
                                }
                                i4++;
                            }
                        case 4:
                            if (AnonymousClass861.LIZIZ(charAt)) {
                                str3 = C42398GkU.LIZIZ(str3, charAt);
                            } else if (charAt == AnonymousClass864.CHARACTER_ATTR_EQUAL.getValue()) {
                                anonymousClass865 = AnonymousClass865.TAG_ATTRIBUTE_VALUE;
                                i4++;
                                if (charSequence.charAt(i4) == AnonymousClass864.CHARACTER_ATTR_VALUE_QUOTES.getValue()) {
                                    i4++;
                                }
                                str4 = "";
                            } else {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(str3);
                                LIZ5.append(" name of ");
                                LIZ5.append(str2);
                                LIZ5.append(" contains ");
                                LIZ5.append(charAt);
                                LIZ5.append(" is invalid");
                                C85R.LIZIZ(X1D.LIZIZ(LIZ5));
                            }
                            i4++;
                        case 5:
                            if (AnonymousClass861.LIZIZ(charAt) || Character.isDigit(charAt) || charAt == '#') {
                                str4 = C42398GkU.LIZIZ(str4, charAt);
                                i4++;
                            } else if (str4.length() > 0 && (charAt == AnonymousClass864.CHARACTER_ATTR_VALUE_QUOTES.getValue() || charAt == AnonymousClass864.CHARACTER_SPACE.getValue())) {
                                i4++;
                                if (str3.length() > 0 && str4.length() > 0) {
                                    linkedHashMap.put(str3, str4);
                                    str3 = "";
                                    str4 = "";
                                }
                                anonymousClass865 = AnonymousClass865.TAG_ATTRIBUTE_END;
                            } else if (charAt == AnonymousClass864.CHARACTER_END.getValue()) {
                                if (str3.length() > 0 || str4.length() > 0) {
                                    linkedHashMap.put(str3, str4);
                                    str3 = "";
                                    str4 = "";
                                }
                                anonymousClass865 = AnonymousClass865.TAG_ATTRIBUTE_END;
                            } else {
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append(str3);
                                LIZ6.append(" value of ");
                                LIZ6.append(str2);
                                LIZ6.append(" contains ");
                                LIZ6.append(charAt);
                                LIZ6.append(" is invalid");
                                C85R.LIZIZ(X1D.LIZIZ(LIZ6));
                                i4++;
                            }
                            break;
                        case 6:
                            if (charAt == AnonymousClass864.CHARACTER_END.getValue()) {
                                anonymousClass865 = AnonymousClass865.TAG_FINISH;
                            } else {
                                if (charAt != AnonymousClass864.CHARACTER_SPACE.getValue() && AnonymousClass861.LIZIZ(charAt)) {
                                    anonymousClass865 = AnonymousClass865.TAG_ATTRIBUTE_NAME;
                                    str3 = "";
                                }
                                i4++;
                            }
                            break;
                        case 7:
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 2;
                            }
                            C2056285e c2056285e2 = new C2056285e(str2, i2, linkedHashMap);
                            c2056285e2.LIZLLL = i;
                            c2056285e2.LJ = i4 + 1;
                            if (c2056285e2.LIZIZ == 0) {
                                return new OSZ(AnonymousClass867.START_TAG, c2056285e2);
                            }
                            return new OSZ(AnonymousClass867.END_TAG, c2056285e2);
                    }
                }
            }
        }
        return new OSZ(AnonymousClass867.END_MARKUP, new C2056285e((CharSequence) null, 0, 7));
    }
}
