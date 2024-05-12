package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.ZgI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90550ZgI extends HashMap<String, String> {
    public C90550ZgI(C90855ZlD c90855ZlD) {
        String str;
        put("state", "success");
        if (c90855ZlD.LIZ.isInitialModeBind()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        put("init_mode", str);
    }
}
