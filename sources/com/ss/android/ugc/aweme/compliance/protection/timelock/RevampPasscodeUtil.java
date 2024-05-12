package com.ss.android.ugc.aweme.compliance.protection.timelock;

import X.C1FO;
import X.C56642Ke;
import X.C78488UrE;
import X.C78489UrF;
import X.C86306Xu2;
import X.InterfaceC78491UrH;
import X.QD3;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class RevampPasscodeUtil {
    public static final RevampPasscodeUtil LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    static {
        RevampPasscodeUtil revampPasscodeUtil = new RevampPasscodeUtil();
        LIZ = revampPasscodeUtil;
        EventBus.LIZJ().LJIILJJIL(revampPasscodeUtil);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke broadCastEvent) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        Integer valueOf;
        DigitalWellbeingSetting digitalWellbeingSetting;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        JSONObject jSONObject2 = broadCastEvent.LJLIL;
        String str = null;
        if (jSONObject2 != null) {
            str = jSONObject2.optString("eventName");
        }
        if ((!o.LJ("check_passcode_success", str) && !o.LJ("reset_passcode_success", str)) || (jSONObject = broadCastEvent.LJLIL) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null || (valueOf = Integer.valueOf(optJSONObject.optInt("biz_scene"))) == null) {
            return;
        }
        if (2 != valueOf.intValue()) {
            if (valueOf == null) {
                return;
            }
            if (1 != valueOf.intValue()) {
                if (3 != valueOf.intValue()) {
                    return;
                }
                SharePrefCache.inst().getLastUnlockTime().LIZLLL(Long.valueOf(System.currentTimeMillis()));
                LIZIZ = false;
                DigitalWellbeingSetting digitalWellbeingSetting2 = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting2 == null || digitalWellbeingSetting2.getTimelockEligible() != 1 || (digitalWellbeingSetting = C86306Xu2.LIZIZ) == null) {
                    return;
                }
                digitalWellbeingSetting.setTimelockEligible(2);
                return;
            }
        }
        C78488UrE LJII = C1FO.LJII();
        if (LJII == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        Iterator it = LJII.LIZ.iterator();
        while (it.hasNext()) {
            ((InterfaceC78491UrH) it.next()).onSuccess(bool);
        }
        LJII.LIZ.clear();
        C78489UrF LIZ2 = C78489UrF.LIZ();
        synchronized (LIZ2) {
            LIZ2.LIZ.values().remove(LJII);
        }
    }
}
