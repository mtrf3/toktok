package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66267Pzb implements InterfaceC66755QHv {
    public static final C66267Pzb LIZ = new C66267Pzb();

    @Override // X.InterfaceC66755QHv
    public final boolean LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            String LIZJ = Q7L.LIZJ("empty_user_id-", o.LJ(C66266Pza.LJIIIIZZ, CardStruct.IStatusCode.DEFAULT));
            ApmEvent apmEvent = new ApmEvent("app_log_isolation");
            apmEvent.LIZ(LIZJ, "isolation_result");
            C66059PwF.LIZIZ(apmEvent);
            return true;
        }
        if (o.LJ(str, C66266Pza.LJIIIIZZ) && C66266Pza.LJIIIZ) {
            return true;
        }
        String str2 = null;
        String orDefault = C66266Pza.LIZLLL.getOrDefault(str, null);
        if (orDefault != null && (str2 = C66266Pza.LIZJ.get(orDefault)) == null) {
            str2 = "row";
        }
        StringBuilder LIZJ2 = b1.LIZJ(str2, "_to_");
        LIZJ2.append(C66266Pza.LJI);
        String LIZIZ = X1D.LIZIZ(LIZJ2);
        ApmEvent apmEvent2 = new ApmEvent("app_log_isolation");
        apmEvent2.LIZ(LIZIZ, "isolation_result");
        C66059PwF.LIZIZ(apmEvent2);
        return o.LJ(str2, C66266Pza.LJI);
    }
}
