package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.ZgJ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90551ZgJ extends HashMap<String, String> {
    public C90551ZgJ(C90855ZlD c90855ZlD, int i, String str, Exception exc) {
        String str2;
        put("state", "failure");
        if (c90855ZlD.LIZ.isInitialModeBind()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        put("init_mode", str2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(i);
        put("err_code", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" ,");
        LIZ2.append(exc != null ? exc.getMessage() : "");
        put("err_msg", X1D.LIZIZ(LIZ2));
    }
}
