package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.AbstractC91523iW;
import X.C113554cx;
import X.C47261Igj;
import X.C4MW;
import X.C88903eI;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendTextRoute extends AbstractC91523iW {
    @Override // X.AbstractC91523iW
    public List<String> getParamsList() {
        return C47261Igj.LJJIJIIJI("conversation_id", "text");
    }

    @Override // X.AbstractC91523iW
    public boolean doAction(Context context, String str, Bundle bundle) {
        HashMap linkedHashMap;
        o.LJIIIZ(bundle, "bundle");
        String param = getParam("conversation_id");
        String param2 = getParam("text");
        TextContent obtain$default = TextContent.Companion.obtain$default(TextContent.Companion, param2, null, null, 6, null);
        Serializable paramSerializable = getParamSerializable("send_params");
        if (!(paramSerializable instanceof HashMap) || (linkedHashMap = (HashMap) paramSerializable) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String param3 = getParam("sug_type");
        if (param3 != null) {
            linkedHashMap.put("content_type", param3);
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = param;
        c4mw.LIZLLL(obtain$default);
        c4mw.LIZ.LJFF = linkedHashMap;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("interaction_type", "quick_reaction");
        if (param2 == null) {
            param2 = "";
        }
        oszArr[1] = new OSZ("interaction_name", param2);
        c4mw.LIZ.LJII = C113554cx.LJJLIIIIJ(oszArr);
        c4mw.LJI();
        return true;
    }
}
