package com.ss.android.ugc.aweme.video;

import X.C16880lQ;
import X.C48537J3d;
import X.C48599J5n;
import X.C48609J5x;
import X.J60;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SmartPortraitService implements IPortraitService {
    public JSONObject getPortraits() {
        ConcurrentHashMap<String, String> LJFF = C48537J3d.LIZ().LJFF();
        if (LJFF == null || LJFF.isEmpty()) {
            return null;
        }
        return new JSONObject(LJFF);
    }

    public JSONObject getServerPortraits() {
        C48537J3d.LIZ().getClass();
        ConcurrentHashMap<String, String> LJFF = J60.LIZ().LJFF();
        if (LJFF == null || LJFF.isEmpty()) {
            return null;
        }
        return new JSONObject(LJFF);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public Map<String, String> getGroupPortraits(String str) {
        C48599J5n LIZ = C48537J3d.LIZ();
        ConcurrentHashMap concurrentHashMap = null;
        if (str != null) {
            List<String> list = LIZ.LJII.get(str);
            if (list != null) {
                for (String str2 : list) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    String LIZJ = LIZ.LIZJ(str2);
                    if (LIZJ != null) {
                        concurrentHashMap.put(str2, LIZJ);
                    }
                }
            }
        } else {
            LIZ.getClass();
        }
        return concurrentHashMap;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public String getPortrait(String str) {
        return C48537J3d.LIZ().LIZJ(str);
    }

    public void updatePortraits(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                concurrentHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C48537J3d.LIZ().getClass();
        C48609J5x.LIZ().LJIIIIZZ(concurrentHashMap);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public void addGroupConfig(String str, List<String> list) {
        C48599J5n LIZ = C48537J3d.LIZ();
        LIZ.getClass();
        if (str != null) {
            if (list != null) {
                LIZ.LJII.put(str, list);
            } else {
                LIZ.LJII.remove(str);
            }
        }
    }

    public void updatePortrait(String str, String str2) {
        C48537J3d.LIZ().getClass();
        C48609J5x.LIZ().LJII(str, str2);
    }
}
