package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.74f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1798974f {
    public static final C1799074g LIZ = new C1799074g();
    public static final C1798874e LIZIZ = new InterfaceC1798974f() { // from class: X.74e
        @Override // X.InterfaceC1798974f
        public final String LIZ(String str) {
            if (TextUtils.isEmpty(str) || "null".equals(str) || CardStruct.IStatusCode.DEFAULT.equals(str)) {
                return "";
            }
            return str;
        }
    };

    String LIZ(String str);
}
