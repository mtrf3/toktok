package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button;

import X.C16880lQ;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomInputMentionButtonAssem extends UIContentAssem {
    public ChatRoomInputMentionButtonAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        view.setVisibility(0);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 71), view);
    }
}
