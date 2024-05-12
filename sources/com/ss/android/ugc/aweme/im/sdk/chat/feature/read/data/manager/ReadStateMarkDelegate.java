package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import X.C00F;
import X.C102073zX;
import X.C102103za;
import X.C34B;
import X.C63120Opw;
import X.C81273Gx;
import X.C99033ud;
import X.X1D;
import android.os.Message;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReadStateMarkDelegate extends AbsReadStateDelegate {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final boolean LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;

    public final void LIZIZ() {
        Boolean bool;
        if (!this.LJLJI) {
            C34B.LIZIZ("ReadStateMarkDelegate", "startMarkReadReal activity not resumed");
            return;
        }
        C99033ud c99033ud = this.LJLIL.LIZIZ;
        if (c99033ud != null && c99033ud.getChatType() == 1) {
            C34B.LIZIZ("ReadStateMarkDelegate", "startMarkReadReal -1");
            this.LJLJJL = SystemClock.elapsedRealtime();
            C102103za.LIZ(this.LJLJJLL);
            C81273Gx.LIZ(c99033ud.getConversationId()).LJII();
            return;
        }
        C63120Opw LIZ = this.LJLIL.LIZ();
        if (LIZ == null || LIZ.isTemp() || LIZ.getConversationShortId() <= 0 || LIZ.getConversationId() == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startMarkReadReal conversation not prepared: ");
            Long l = null;
            if (LIZ != null) {
                bool = Boolean.valueOf(LIZ.isTemp());
            } else {
                bool = null;
            }
            LIZ2.append(bool);
            LIZ2.append(", ");
            if (LIZ != null) {
                l = Long.valueOf(LIZ.getConversationShortId());
            }
            LIZ2.append(l);
            C34B.LIZIZ("ReadStateMarkDelegate", X1D.LIZIZ(LIZ2));
            return;
        }
        C34B.LIZIZ("ReadStateMarkDelegate", "startMarkReadReal -2");
        this.LJLJJL = SystemClock.elapsedRealtime();
        C102103za.LIZ(this.LJLJJLL);
        String conversationId = LIZ.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        C81273Gx.LIZ(conversationId).LJII();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, X.C3PY
    public final void onResume() {
        C34B.LIZIZ("ReadStateMarkDelegate", "onResume");
        this.LJLJI = true;
        LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, X.C3PY
    public final void onStop() {
        C34B.LIZIZ("ReadStateMarkDelegate", "onStop");
        LIZIZ();
        this.LJLJI = false;
    }

    public final void LIZ() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
        long j = 0;
        if (elapsedRealtime <= 1000) {
            if (0 <= elapsedRealtime && elapsedRealtime < 1001) {
                j = 1000 - elapsedRealtime;
            } else {
                j = 1000;
            }
        }
        this.LJLJJLL = j;
        sendEmptyMessageDelayed(0, j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("newMarkRead delay time: ");
        LIZ.append(this.LJLJJLL);
        C34B.LIZIZ("ReadStateMarkDelegate", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadStateMarkDelegate(C102073zX dataCenter) {
        super(dataCenter);
        o.LJIIIZ(dataCenter, "dataCenter");
        this.LJLJI = true;
        this.LJLJJI = C00F.LIZ(31744, 0, "mark_read_v2", true) == 1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 0) {
            removeMessages(0);
            if (this.LJLILLLLZI) {
                LIZIZ();
            }
            this.LJLILLLLZI = false;
        }
    }
}
