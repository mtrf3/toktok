package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Zen, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90457Zen extends HashMap<String, String> {
    public C90457Zen(C90817Zkb c90817Zkb) {
        String str;
        if (c90817Zkb.LIZ.isInitialModeBind()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        put("init_mode", str);
        put("state", "success");
    }
}
