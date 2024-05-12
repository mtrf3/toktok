package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.83l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051783l {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String str, List<? extends TextExtraStruct> list) {
        boolean z;
        int i;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || list == null || list.isEmpty()) {
            return "";
        }
        boolean[] zArr = new boolean[str.length()];
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                int start = textExtraStruct.getStart();
                if (start < 0) {
                    start = 0;
                }
                int end = textExtraStruct.getEnd();
                int length = str.length();
                if (end > length) {
                    end = length;
                }
                if (textExtraStruct.getStart() > textExtraStruct.getEnd()) {
                    start = textExtraStruct.getEnd();
                    if (start < 0) {
                        start = 0;
                    }
                    int start2 = textExtraStruct.getStart();
                    end = str.length();
                    if (start2 <= end) {
                        end = start2;
                    }
                }
                while (start < end) {
                    zArr[start] = true;
                    start++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (zArr[i2]) {
                sb.append(str.charAt(i2));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "content.toString()");
        int length3 = sb2.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length3) {
            if (!z3) {
                i = i3;
            } else {
                i = length3;
            }
            if (o.LJIIJJI(sb2.charAt(i), 32) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z3) {
                if (!z2) {
                    z3 = true;
                } else {
                    i3++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length3--;
            }
        }
        return sb2.subSequence(i3, length3 + 1).toString();
    }

    public static final String LIZIZ(String str, List<? extends TextExtraStruct> list) {
        int i;
        boolean z;
        if (str.length() == 0) {
            return "";
        }
        if (list == null || list.isEmpty()) {
            return str;
        }
        boolean[] zArr = new boolean[str.length()];
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct != null && textExtraStruct.getType() == 1) {
                int start = textExtraStruct.getStart();
                if (start < 0) {
                    start = 0;
                }
                int end = textExtraStruct.getEnd();
                int length = str.length();
                if (end > length) {
                    end = length;
                }
                if (textExtraStruct.getStart() > textExtraStruct.getEnd()) {
                    start = textExtraStruct.getEnd();
                    if (start < 0) {
                        start = 0;
                    }
                    end = textExtraStruct.getStart();
                    int length2 = str.length();
                    if (end > length2) {
                        end = length2;
                    }
                }
                while (start < end) {
                    zArr[start] = true;
                    start++;
                }
                int i2 = end + 1;
                Character LLI = C40689Fy1.LLI(i2, str);
                if (LLI != null && LLI.charValue() == ' ') {
                    zArr[i2] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int length3 = str.length();
        for (int i3 = 0; i3 < length3; i3++) {
            if (!zArr[i3]) {
                sb.append(str.charAt(i3));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "content.toString()");
        int length4 = sb2.length() - 1;
        int i4 = 0;
        boolean z2 = false;
        while (i4 <= length4) {
            if (!z2) {
                i = i4;
            } else {
                i = length4;
            }
            if (o.LJIIJJI(sb2.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i4++;
                }
            } else {
                if (!z) {
                    break;
                }
                length4--;
            }
        }
        return C132805Jc.LIZJ(length4, 1, sb2, i4);
    }
}
