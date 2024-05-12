package X;

import java.text.BreakIterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CHo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31076CHo {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, String content) {
        o.LJIIIZ(content, "content");
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        if (content.length() == 0 || s.LJZI(content).toString().length() == 0) {
            if (i == 1) {
                return 0;
            }
            return 4;
        }
        int length = content.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int codePointAt = Character.codePointAt(content, i4);
            if (8304 <= codePointAt && (codePointAt < 11264 || (12288 <= codePointAt && (codePointAt < 12544 || (12800 <= codePointAt && (codePointAt < 13056 || (126976 <= codePointAt && codePointAt < 129648))))))) {
                i3++;
            }
        }
        if (i3 <= 0) {
            return 1;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        o.LJIIIIZZ(characterInstance, "getCharacterInstance()");
        characterInstance.setText(content);
        for (int next = characterInstance.next(); next != -1; next = characterInstance.next()) {
            i2++;
        }
        if (i3 == i2) {
            return 3;
        }
        return 2;
    }
}
