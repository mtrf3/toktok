package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONObject;

/* renamed from: X.Psi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65840Psi {
    public static final java.util.Map<EnumC88128YiK, String[]> LIZ = new HashMap();

    public static boolean LIZIZ(EnumC88128YiK enumC88128YiK) {
        boolean z;
        ConcurrentHashMap concurrentHashMap;
        HashMap hashMap;
        Boolean bool;
        switch (C88130YiM.LIZ[enumC88128YiK.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        String name = enumC88128YiK.toKey();
        String LIZLLL = u.LIZLLL();
        o.LJIIIZ(name, "name");
        C65817PsL.LIZ.getClass();
        C65817PsL.LIZIZ(null);
        if (!((ConcurrentHashMap) C65817PsL.LIZLLL).containsKey(LIZLLL)) {
            hashMap = new HashMap();
        } else {
            QM9 qm9 = C65817PsL.LJFF;
            if (qm9 == null || (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) qm9.LJLIL).get(LIZLLL)) == null) {
                hashMap = new HashMap();
                JSONObject jSONObject = (JSONObject) ((ConcurrentHashMap) C65817PsL.LIZLLL).get(LIZLLL);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    o.LJIIIIZZ(key, "key");
                    hashMap.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                QM9 qm92 = C65817PsL.LJFF;
                if (qm92 == null) {
                    qm92 = new QM9(2);
                }
                ArrayList arrayList = new ArrayList(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    arrayList.add(new C65841Psj((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C65841Psj c65841Psj = (C65841Psj) it.next();
                    concurrentHashMap2.put(c65841Psj.LJLIL, c65841Psj);
                }
                ((ConcurrentHashMap) qm92.LJLIL).put(LIZLLL, concurrentHashMap2);
                C65817PsL.LJFF = qm92;
            } else {
                ArrayList arrayList2 = new ArrayList(concurrentHashMap.size());
                Iterator it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Map.Entry) it2.next()).getValue());
                }
                hashMap = new HashMap();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C65841Psj c65841Psj2 = (C65841Psj) it3.next();
                    hashMap.put(c65841Psj2.LJLIL, Boolean.valueOf(c65841Psj2.LJLILLLLZI));
                }
            }
        }
        if (!hashMap.containsKey(name) || (bool = (Boolean) hashMap.get(name)) == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static final boolean LIZJ(EnumC88128YiK feature) {
        o.LJIIIZ(feature, "feature");
        if (EnumC88128YiK.Unknown == feature) {
            return false;
        }
        if (EnumC88128YiK.Core == feature) {
            return true;
        }
        String string = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.internal.FEATURE_MANAGER").getString(feature.toKey(), null);
        if (string != null) {
            C16880lQ.LLILII();
            if (o.LJ(string, "13.1.0")) {
                return false;
            }
        }
        EnumC88128YiK parent = feature.getParent();
        if (parent == feature) {
            return LIZIZ(feature);
        }
        if (!LIZJ(parent) || !LIZIZ(feature)) {
            return false;
        }
        return true;
    }

    public static final void LIZ(InterfaceC65843Psl interfaceC65843Psl, EnumC88128YiK feature) {
        o.LJIIIZ(feature, "feature");
        C65817PsL.LIZIZ(new C65842Psk(interfaceC65843Psl, feature));
    }
}
