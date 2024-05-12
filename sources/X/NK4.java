package X;

import Y.ARunnableS11S1100000_10;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NK4 implements InterfaceC23970wr {
    public static final NK4 LIZ = new NK4();

    @Override // X.InterfaceC23970wr
    public final void onEventV3(String str, JSONObject jSONObject) {
        if (jSONObject.optInt("is_ad_event") == 1) {
            ARunnableS11S1100000_10 aRunnableS11S1100000_10 = new ARunnableS11S1100000_10(jSONObject, str, 2);
            if (((Boolean) C52325KgD.LIZ.getValue()).booleanValue()) {
                C38995FSd.LIZLLL().submit(aRunnableS11S1100000_10);
                return;
            } else {
                aRunnableS11S1100000_10.run();
                return;
            }
        }
        FMX.LJIILJJIL(str, jSONObject);
    }
}
