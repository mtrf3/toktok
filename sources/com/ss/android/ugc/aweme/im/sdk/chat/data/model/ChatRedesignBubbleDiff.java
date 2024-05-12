package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C78939UyV;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRedesignBubbleDiff {
    public static final ChatRedesignBubbleDiff INSTANCE = new ChatRedesignBubbleDiff();

    public final int processChatBubbleState(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        boolean LJJIJIL = C78939UyV.LJJIJIL(msg, c109544Rq2);
        boolean LJJIJIIJIL = C78939UyV.LJJIJIIJIL(msg, c109544Rq);
        if (!LJJIJIL) {
            if (!LJJIJIIJIL) {
                return 1;
            }
            return 0;
        }
        return 2;
    }
}
