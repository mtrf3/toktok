package com.ss.android.ugc.localnotify.work;

import X.C06540Nm;
import X.C0CS;
import X.C16880lQ;
import X.C29261Cw;
import X.C34445DfV;
import X.C47629Imf;
import X.C52204KeG;
import X.C67249QaL;
import X.C68467Qtz;
import X.QRH;
import X.X1D;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PreWakeWork extends Worker {
    @Override // androidx.work.Worker
    public final C0CS LJII() {
        long currentTimeMillis = System.currentTimeMillis();
        long LIZIZ = currentTimeMillis - this.LJLILLLLZI.LIZIZ.LIZIZ();
        String LIZJ = this.LJLILLLLZI.LIZIZ.LIZJ("notification_id");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (LIZJ == null) {
            LIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        String LIZJ2 = this.LJLILLLLZI.LIZIZ.LIZJ("scheduled_time_string");
        if (LIZJ2 != null) {
            str = LIZJ2;
        }
        C68467Qtz.LIZ(1, currentTimeMillis, LIZIZ, LIZJ, false);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("PreWakeWork.doWork(", LIZJ, ": ", str, " - offset: ");
        LIZLLL.append(LIZIZ);
        LIZLLL.append(") START, ");
        LIZLLL.append(C16880lQ.LLLLIIIILLL());
        LIZLLL.append(" is main? ");
        LIZLLL.append(o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()));
        C47629Imf.LIZ("PreWakeWork", X1D.LIZIZ(LIZLLL));
        if (!C34445DfV.LIZ) {
            C67249QaL.LIZ().LJFF();
            return new C29261Cw();
        }
        if (QRH.LIZJ() && !C52204KeG.LIZ) {
            C67249QaL.LIZ().LIZLLL();
            return new C29261Cw();
        }
        C67249QaL.LIZ().LIZIZ(LIZJ);
        return new C29261Cw();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreWakeWork(Context context, WorkerParameters params) {
        super(context, params);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
    }
}
