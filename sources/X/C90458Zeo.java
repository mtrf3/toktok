package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Zeo, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90458Zeo extends HashMap<String, String> {
    public C90458Zeo(C90817Zkb c90817Zkb, int i, String str, Exception exc) {
        String str2;
        if (c90817Zkb.LIZ.isInitialModeBind()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        put("init_mode", str2);
        put("state", "failure");
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
