package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91740ZzU {
    public static C91741ZzV LIZ(String str) {
        String str2;
        o.LJIIIZ(str, "str");
        try {
            if (str.length() == 0) {
                return new C91741ZzV("", "");
            }
            if (str.length() == 1 && new OJD("[2-9]").matches(str)) {
                return new C91741ZzV(o.LJIILLIIL(str, CardStruct.IStatusCode.DEFAULT), "");
            }
            if (str.length() == 2 && CastIntegerProtector.parseInt(str) > 12) {
                return new C91741ZzV(o.LJIILLIIL(Character.valueOf(str.charAt(0)), CardStruct.IStatusCode.DEFAULT), String.valueOf(str.charAt(1)));
            }
            int length = str.length();
            if (2 <= length) {
                length = 2;
            }
            String substring = str.substring(0, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (str.length() <= 2) {
                str2 = "";
            } else {
                int length2 = str.length();
                if (4 <= length2) {
                    length2 = 4;
                }
                str2 = str.substring(2, length2);
                o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return new C91741ZzV(substring, str2);
        } catch (Throwable unused) {
            return new C91741ZzV("", "");
        }
    }
}
