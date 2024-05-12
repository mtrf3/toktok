package X;

import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class BXZ {
    public static CharSequence LIZ(Text text, CXK cxk) {
        String LIZ;
        if (text == null) {
            return null;
        }
        String str = text.defaultPattern;
        String str2 = text.key;
        if (str2 != null && str2.length() != 0 && (LIZ = C86881Y7x.LIZIZ().LIZ(text.key)) != null && LIZ.length() != 0) {
            str = LIZ;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return CXJ.LJI(str, text, cxk);
    }
}
