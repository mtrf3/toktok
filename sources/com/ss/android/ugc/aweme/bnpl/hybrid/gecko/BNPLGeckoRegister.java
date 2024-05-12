package com.ss.android.ugc.aweme.bnpl.hybrid.gecko;

import X.C16880lQ;
import X.C92176a6W;
import X.O10;
import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.IGeckoRegister;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@O10(boeAccessKey = "b01ad12d05598203a34287a4d1802c19", prodAccessKey = "6769d15c1fc4ebff20d79aebbe0f0cfa", testAccessKey = "225dff975bc950bac45a0effa960e8b8")
/* loaded from: classes20.dex */
public final class BNPLGeckoRegister implements IGeckoRegister {
    public static final int $stable = 0;

    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("business_version", C92176a6W.LIZ);
        return hashMap;
    }

    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public String registerRootDir(Context context) {
        o.LJIIIZ(context, "context");
        String absolutePath = new File(C16880lQ.LLIIJLIL(context), "offlineX").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(context.filesDir, \"offlineX\").absolutePath");
        return absolutePath;
    }
}
