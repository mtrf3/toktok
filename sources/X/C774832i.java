package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* renamed from: X.32i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C774832i {
    public static volatile C774832i LIZIZ;
    public final java.util.Map<String, Boolean> LIZ = new HashMap();

    public static C774832i LIZ() {
        if (LIZIZ == null) {
            synchronized (C774832i.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C774832i();
                }
            }
        }
        return LIZIZ;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().contains("link-sg.byteoversea.com") && !TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "target"))) {
                return UriProtector.parse(UriProtector.getQueryParameter(parse, "target")).getHost();
            }
            return parse.getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    public final void LIZJ(String str) {
        String LIZIZ2 = LIZIZ(str);
        if (LIZIZ2 == null) {
            return;
        }
        ((HashMap) this.LIZ).put(LIZIZ2, Boolean.FALSE);
    }
}
