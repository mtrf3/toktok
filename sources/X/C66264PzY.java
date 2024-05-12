package X;

import android.os.Handler;
import com.bytedance.helios.api.consumer.ApmEvent;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.PzY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66264PzY implements InterfaceC66269Pzd {
    @Override // X.InterfaceC66269Pzd
    public final void LIZ(C66240PzA previousStoreRegionInfo, C66240PzA currentStoreRegionInfo) {
        String str;
        o.LJIIIZ(previousStoreRegionInfo, "previousStoreRegionInfo");
        o.LJIIIZ(currentStoreRegionInfo, "currentStoreRegionInfo");
        if (!o.LJ(previousStoreRegionInfo.LJLJJI.LJLJI, currentStoreRegionInfo.LJLJJI.LJLJI) || o.LJ(C66266Pza.LJII, "")) {
            String str2 = currentStoreRegionInfo.LJLILLLLZI;
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            C66266Pza.LJII = lowerCase;
            String str3 = C66266Pza.LJII;
            if (str3 == null) {
                str = null;
            } else {
                str = C66266Pza.LIZJ.get(str3);
                if (str == null) {
                    str = "row";
                }
            }
            C66266Pza.LJI = str;
            String str4 = (String) currentStoreRegionInfo.LJLJJI.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            String lowerCase2 = previousStoreRegionInfo.LJLILLLLZI.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            LIZ.append(lowerCase2);
            LIZ.append("_to_");
            LIZ.append(C66266Pza.LJII);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ApmEvent apmEvent = new ApmEvent("app_log_isolation");
            apmEvent.LIZ(LIZIZ, "region_update");
            C66059PwF.LIZIZ(apmEvent);
            C66266Pza.LJIIIZ = false;
            String str5 = C66266Pza.LJII;
            HandlerThreadC65936PuG.LIZ();
            Handler handler = HandlerThreadC65936PuG.LJLILLLLZI;
            RunnableC66265PzZ runnableC66265PzZ = C66266Pza.LJIIJ;
            handler.removeCallbacks(runnableC66265PzZ);
            runnableC66265PzZ.getClass();
            o.LJIIIZ(str4, "<set-?>");
            runnableC66265PzZ.LJLIL = str4;
            o.LJIIIZ(str5, "<set-?>");
            runnableC66265PzZ.LJLILLLLZI = str5;
            runnableC66265PzZ.LJLJI = 0L;
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(runnableC66265PzZ, 100L);
        }
    }
}
