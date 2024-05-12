package X;

import com.byted.cast.common.config.Config;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.ZeK, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90428ZeK extends HashMap<String, String> {
    public C90428ZeK(Config config) {
        String str;
        put("state", "start");
        if (config.isInitialModeBind()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        put("init_mode", str);
    }
}
