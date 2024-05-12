package com.ss.android.ugc.aweme.common.net;

import X.C10K;
import X.C16880lQ;
import X.C35532Dx2;
import X.C36842Ed4;
import X.C38413F5t;
import X.C38523F9z;
import X.C38995FSd;
import X.C84763XOl;
import X.EF7;
import X.EnumC48190Ivi;
import Y.ACallableS78S0101000_6;
import Y.AgS123S0100000_6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {
    public static boolean LIZJ;
    public EnumC48190Ivi LIZ = EnumC48190Ivi.UNKNOWN;
    public final boolean LIZIZ;

    public NetWorkStateReceiver() {
        if (C36842Ed4.LIZLLL(EF7.LIZIZ())) {
            this.LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        }
    }

    public final void LIZ(Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                C10K.LIZIZ(new ACallableS78S0101000_6(0, this, 7), C38995FSd.LIZLLL(), null).LJ(new AgS123S0100000_6(this, 16), C10K.LJIIIIZZ, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
