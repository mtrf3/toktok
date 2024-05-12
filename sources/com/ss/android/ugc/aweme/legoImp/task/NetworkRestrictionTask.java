package com.ss.android.ugc.aweme.legoImp.task;

import X.AY8;
import X.C09900aA;
import X.C0RN;
import X.C141335gf;
import X.C16880lQ;
import X.C3C5;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class NetworkRestrictionTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NetworkRestrictionTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.IDLE;
    }

    @Override // X.EEY
    public final void run(Context context) {
        int intValue;
        Object LIZ;
        Object LLILL;
        ConnectivityManager connectivityManager;
        if (context == null || (intValue = ((Number) AY8.LIZ.getValue()).intValue()) == 0) {
            return;
        }
        try {
            LLILL = C16880lQ.LLILL(context, "connectivity");
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if ((LLILL instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) LLILL) != null && connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            int i = 2;
            if (restrictBackgroundStatus != 2) {
                if (restrictBackgroundStatus != 3) {
                    return;
                } else {
                    i = 1;
                }
            }
            LIZ = Integer.valueOf(i);
            C3C5.m7constructorimpl(LIZ);
            if (C3C5.m13isSuccessimpl(LIZ)) {
                int intValue2 = ((Number) LIZ).intValue();
                if ((intValue & intValue2) == intValue2) {
                    JSONObject put = new JSONObject().put("restrict_status", intValue2);
                    o.LJIIIIZZ(put, "JSONObject()\n           …ut(\"restrict_status\", it)");
                    C09900aA.LJI("restrict_background_status", put, null, null);
                }
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null && (intValue & 4) == 4) {
                JSONObject put2 = new JSONObject().put("e", m10exceptionOrNullimpl.getMessage());
                o.LJIIIIZZ(put2, "JSONObject()\n           …    .put(\"e\", it.message)");
                JSONObject put3 = new JSONObject().put("restrict_status", 4);
                o.LJIIIIZZ(put3, "JSONObject()\n           …restrict_status\", status)");
                C09900aA.LJI("restrict_background_status", put3, null, put2);
            }
        }
    }
}
