package X;

import com.ss.android.ugc.aweme.emoji.sysemoji.SystemEmojiVersionId;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110154Tz {
    public static C110154Tz LIZ;

    public static boolean LIZ(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        StringBuilder LIZ2 = X1D.LIZ();
        C5H3 c5h3 = C4VA.LIZIZ;
        boolean z4 = true;
        if (((SystemEmojiVersionId) c5h3.getValue()).bussinessCode == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append(' ');
        int i3 = ((SystemEmojiVersionId) c5h3.getValue()).bussinessCode & i;
        if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 7) {
            z2 = false;
        } else {
            z2 = true;
        }
        LIZ2.append(z2);
        LIZ2.append(' ');
        if (((SystemEmojiVersionId) c5h3.getValue()).bussinessCode == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZ2.append(z3);
        C34B.LIZIZ("enableSysEmojiWithType", X1D.LIZIZ(LIZ2));
        java.util.Map<Integer, Boolean> map = C4ZV.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(Integer.valueOf(i)) == null) {
            if (((SystemEmojiVersionId) c5h3.getValue()).bussinessCode != -1 && (((SystemEmojiVersionId) c5h3.getValue()).bussinessCode == 0 || ((i2 = ((SystemEmojiVersionId) c5h3.getValue()).bussinessCode & i) != 1 && i2 != 2 && i2 != 4 && i2 != 7))) {
                z4 = false;
            }
            map.put(Integer.valueOf(i), Boolean.valueOf(z4));
            return z4;
        }
        Boolean bool = (Boolean) linkedHashMap.get(Integer.valueOf(i));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static List LIZIZ(int i) {
        if (!LIZ(i)) {
            return null;
        }
        return C4ZV.LIZ.LIZIZ(i);
    }
}
