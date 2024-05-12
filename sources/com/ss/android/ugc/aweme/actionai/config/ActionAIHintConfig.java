package com.ss.android.ugc.aweme.actionai.config;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ActionAIHintConfig {
    public static final ActionAIHint LIZ = new ActionAIHint(null);

    public static List LIZ() {
        HashMap<String, String> hashMap;
        ActionAIHint actionAIHint = (ActionAIHint) SettingsManager.LIZLLL().LJIIIIZZ("action_ai_bot_guidance_hints", ActionAIHint.class, LIZ);
        if (actionAIHint == null || (hashMap = actionAIHint.hintList) == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* loaded from: classes7.dex */
    public static final class ActionAIHint {

        @InterfaceC65349Pkn("default_hints")
        public final HashMap<String, String> hintList;

        public ActionAIHint(HashMap<String, String> hashMap) {
            this.hintList = hashMap;
        }
    }
}
