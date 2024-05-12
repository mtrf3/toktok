package com.ss.android.ugc.localnotify.work;

import X.C06540Nm;
import X.C0CS;
import X.C16880lQ;
import X.C29261Cw;
import X.C34445DfV;
import X.C34518Dgg;
import X.C46715IVb;
import X.C47629Imf;
import X.C52204KeG;
import X.C67249QaL;
import X.C67257QaT;
import X.C68467Qtz;
import X.C73969T1h;
import X.C84763XOl;
import X.E7Z;
import X.QRH;
import X.QRJ;
import X.T16;
import X.X1D;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.localnotify.api.LocalNotifyInfoApi;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class DoNotifyWork extends Worker {
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
        C68467Qtz.LIZ(2, currentTimeMillis, LIZIZ, LIZJ, false);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("DoNotifyWork.doWork(", LIZJ, ": ", str, " - offset: ");
        LIZLLL.append(LIZIZ);
        LIZLLL.append(") - START, ");
        LIZLLL.append(C16880lQ.LLLLIIIILLL());
        LIZLLL.append(" is main? ");
        LIZLLL.append(o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()));
        C47629Imf.LIZ("DoNotifyWork", X1D.LIZIZ(LIZLLL));
        if (!C34445DfV.LIZ) {
            C67249QaL.LIZ().LJFF();
            return new C29261Cw();
        }
        if (QRH.LIZJ() && !C52204KeG.LIZ) {
            return new C29261Cw();
        }
        if (!C84763XOl.LJIIJJI) {
            return new C29261Cw();
        }
        Integer[] numArr = C67257QaT.LIZ;
        long LIZ = C67257QaT.LIZ(numArr[0].intValue(), numArr[1].intValue());
        long LIZ2 = C67257QaT.LIZ(numArr[2].intValue(), numArr[3].intValue());
        if (LIZ > LIZ2) {
            LIZ2 += 86400000;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (((LIZ <= currentTimeMillis2 && currentTimeMillis2 <= LIZ2) || a.LJIILL().LJIIL(currentTimeMillis2)) && !C34518Dgg.LIZ) {
            return new C29261Cw();
        }
        IPushApi createIPushApibyMonsterPlugin = PushService.createIPushApibyMonsterPlugin(false);
        Context applicationContext = this.LJLIL;
        o.LJIIIIZZ(applicationContext, "applicationContext");
        if (!createIPushApibyMonsterPlugin.isNotifyEnabled(applicationContext)) {
            return new C29261Cw();
        }
        LocalNotifyInfoApi.LIZ.getClass();
        E7Z.LIZIZ.getLocalNotifyInfo().LJJL(T16.LIZ()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(QRJ.LJLIL, C46715IVb.LJLIL);
        return new C29261Cw();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoNotifyWork(Context context, WorkerParameters params) {
        super(context, params);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
    }
}
