package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4U6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U6 {
    public static final TextContent LIZ = new TextContent(LIZ(true), null, true, 2, null);
    public static final TextContent LIZIZ = new TextContent(LIZ(false), null, true, 2, null);

    public static final String LIZ(boolean z) {
        String string;
        if (z) {
            string = EF7.LIZIZ().getString(R.string.h7j);
        } else if (!z) {
            string = EF7.LIZIZ().getString(R.string.h7i);
        } else {
            throw new C162476Zf();
        }
        o.LJIIIIZZ(string, "when (isSend) {\n        …rsion_receive_tips)\n    }");
        String string2 = EF7.LIZIZ().getString(R.string.h5h);
        o.LJIIIIZZ(string2, "AppContextManager.getApp…R.string.im_download_apk)");
        return C00F.LIZIZ(string, ' ', string2);
    }
}
