package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.AbstractC91523iW;
import X.C101543yg;
import X.C47261Igj;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendEmojiRoute extends AbstractC91523iW {
    @Override // X.AbstractC91523iW
    public List<String> getParamsList() {
        return C47261Igj.LJJIJIIJI("conversation_id", "emoji_name", "is_animate");
    }

    @Override // X.AbstractC91523iW
    public boolean doAction(Context context, String str, Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        C101543yg c101543yg = C101543yg.LIZ;
        String param = getParam("conversation_id");
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 58);
        c101543yg.getClass();
        C101543yg.LIZ(context, param, aqS167S0100000_1);
        return true;
    }
}
