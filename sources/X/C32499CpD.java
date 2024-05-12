package X;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.o;

/* renamed from: X.CpD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32499CpD {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(Text text) {
        String str;
        if (text == null) {
            return "";
        }
        if (text.key != null && !TextUtils.isEmpty(C86881Y7x.LIZIZ().LIZ(text.key))) {
            str = C86881Y7x.LIZIZ().LIZ(text.key);
            o.LJIIIIZZ(str, "{\n            I18nCenter…nst()[text.key]\n        }");
        } else {
            str = text.defaultPattern;
            if (str == null) {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str) || CXJ.LJI(str, text, null) == CXJ.LIZ) {
            return "";
        }
        Spannable LJI = CXJ.LJI(str, text, null);
        o.LJIIIIZZ(LJI, "{\n            TextPieceH…(pattern, text)\n        }");
        return LJI;
    }
}
