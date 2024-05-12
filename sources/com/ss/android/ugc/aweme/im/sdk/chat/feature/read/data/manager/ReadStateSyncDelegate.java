package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import X.C102033zT;
import X.C102073zX;
import X.C102093zZ;
import X.C109544Rq;
import X.C115074fP;
import X.C34B;
import X.C3OG;
import X.C3UD;
import X.C63120Opw;
import X.C96423qQ;
import X.C99033ud;
import X.InterfaceC99713vj;
import X.X1D;
import android.os.Message;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReadStateSyncDelegate extends AbsReadStateDelegate implements C3UD {
    public static final Integer[] LJLJJL = {1};
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public final void LIZIZ() {
        C34B.LIZIZ("ReadStateSyncDelegate", "applySyncStrategyB");
        C102093zZ value = this.LJLIL.LIZJ().getValue();
        if (value != null && value.LIZ()) {
            sendEmptyMessageDelayed(1, 200L);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, X.C3PY
    public final void onResume() {
        C34B.LIZIZ("ReadStateSyncDelegate", "onResume");
        this.LJLILLLLZI = true;
        LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, X.C3PY
    public final void onStop() {
        C34B.LIZIZ("ReadStateSyncDelegate", "onStop");
        this.LJLILLLLZI = false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, X.C3PY
    public final void onDestroy() {
        super.onDestroy();
        C96423qQ.LIZ().LJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadStateSyncDelegate(C102073zX dataCenter) {
        super(dataCenter);
        o.LJIIIZ(dataCenter, "dataCenter");
        C96423qQ.LIZ().LJIIIIZZ(this);
    }

    public final void LIZ(long j) {
        C34B.LIZIZ("ReadStateSyncDelegate", "applySyncStrategyA");
        C102093zZ value = this.LJLIL.LIZJ().getValue();
        if (value != null && value.LIZ()) {
            sendEmptyMessageDelayed(0, j);
        }
    }

    public final void LIZJ(boolean z) {
        C63120Opw LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startSyncReadReal: ");
        LIZ2.append(this.LJLILLLLZI);
        LIZ2.append(", ");
        LIZ2.append(z);
        C34B.LIZIZ("ReadStateSyncDelegate", X1D.LIZIZ(LIZ2));
        this.LJLIL.getClass();
        if (!ReadStateViewModel.LJLJL) {
            return;
        }
        C99033ud c99033ud = this.LJLIL.LIZIZ;
        boolean z2 = false;
        if (c99033ud != null && c99033ud.isReportPage()) {
            return;
        }
        if (this.LJLIL.LIZ() == null || ((LIZ = this.LJLIL.LIZ()) != null && !LIZ.isMember())) {
            C34B.LIZIZ("ReadStateSyncDelegate", "startSyncReadReal: has leave group chat");
            return;
        }
        C102093zZ value = this.LJLIL.LIZJ().getValue();
        if (value != null && this.LJLILLLLZI && value.LIZ()) {
            if (o.LJ("1", value.LIZ.getExt().get("visible_code"))) {
                C102073zX.LJ(this.LJLIL, 3);
                return;
            }
            if (C115074fP.LIZJ() && z) {
                z2 = true;
            }
            this.LJLJJI = z2;
            InterfaceC99713vj interfaceC99713vj = this.LJLIL.LIZ;
            if (interfaceC99713vj == null) {
                return;
            }
            C109544Rq c109544Rq = value.LIZ;
            interfaceC99713vj.LIZJ(c109544Rq, z, new C102033zT(this, c109544Rq));
        }
    }

    @Override // X.C3UD
    public final void Lr0(List<C3OG> list) {
        Object obj;
        if (list != null) {
            Iterator<C3OG> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                C3OG next = it.next();
                String str = next.LIZJ;
                C63120Opw LIZ = this.LJLIL.LIZ();
                if (LIZ != null) {
                    obj = LIZ.getConversationId();
                }
                if (o.LJ(str, obj)) {
                    obj = next;
                    break;
                }
            }
            C3OG c3og = (C3OG) obj;
            if (c3og != null && c3og.LJ == c3og.LJFF) {
                C102073zX.LJ(this.LJLIL, 2);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            removeMessages(1);
            LIZJ(false);
            return;
        }
        removeMessages(0);
        LIZJ(true);
    }

    @Override // X.C3UD
    public final void gA(Long l, Long l2, String str) {
        String str2;
        C102093zZ value;
        C109544Rq c109544Rq;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        if (str != null) {
            C63120Opw LIZ = this.LJLIL.LIZ();
            if (LIZ != null) {
                str2 = LIZ.getConversationId();
            } else {
                str2 = null;
            }
            if (!o.LJ(str, str2) || (value = this.LJLIL.LIZJ().getValue()) == null || (c109544Rq = value.LIZ) == null || o.LJ("1", c109544Rq.getLocalExt().get("s:message_index_is_local")) || longValue2 < c109544Rq.getIndex() || longValue == c109544Rq.getSender()) {
                return;
            }
            C102073zX.LJ(this.LJLIL, 2);
        }
    }
}
