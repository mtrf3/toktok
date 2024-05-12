package com.bytedance.pns.pns_ttmachine_adapter;

import X.C16880lQ;
import X.C58336Muy;
import X.InterfaceC58337Muz;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TTMAdapter {
    public static Map<Integer, TTMParamData> listMap;

    public static native TTMachineExecuteResult attribution(String str, TTMParamData[] tTMParamDataArr);

    public static native TTMStatePreprocessTimeStatistics init(String str);

    public static native TTMachineExecuteResult validate3(String str, TTMParamData tTMParamData);

    static {
        C16880lQ.LLJJJIL("pns_ttmachine_adapter");
        listMap = new HashMap();
    }

    public static boolean isNotConsent() {
        Object LIZ = C58336Muy.LIZ("is_not_consent", Collections.emptyList());
        if (LIZ == null) {
            return false;
        }
        return ((Boolean) LIZ).booleanValue();
    }

    public static TTMParamData pnsListCreate() {
        TTMParamData newEmptyListData = TTMParamData.newEmptyListData();
        listMap.put(Integer.valueOf(System.identityHashCode(newEmptyListData)), newEmptyListData);
        return newEmptyListData;
    }

    public static boolean isBackground(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        Object LIZ = C58336Muy.LIZ("is_background", arrayList);
        if (LIZ == null) {
            return false;
        }
        return ((Boolean) LIZ).booleanValue();
    }

    public static TTMParamData pnsListCopy(TTMParamData tTMParamData) {
        TTMParamData newEmptyListData = TTMParamData.newEmptyListData();
        for (int i = 0; i < tTMParamData.GetArraySize(); i++) {
            newEmptyListData.AddArrayItem(tTMParamData.GetArrayItem(i));
        }
        listMap.put(Integer.valueOf(System.identityHashCode(newEmptyListData)), newEmptyListData);
        return newEmptyListData;
    }

    public static void pnsListDestroy(TTMParamData tTMParamData) {
        listMap.remove(Integer.valueOf(System.identityHashCode(tTMParamData)));
    }

    public static String usrdfCommonHandler(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "fun_name");
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "params");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.get(i));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("rt_v", C58336Muy.LIZ(string, arrayList));
        return jSONObject2.toString();
    }

    public static void addFunction(String str, InterfaceC58337Muz interfaceC58337Muz) {
        ((ConcurrentHashMap) C58336Muy.LIZ).put(str, interfaceC58337Muz);
    }

    public static void pnsListStore(TTMParamData tTMParamData, TTMParamData tTMParamData2) {
        tTMParamData.AddArrayItem(tTMParamData2);
    }

    public static void pnsRemoveFromData(TTMParamData tTMParamData, String str) {
        tTMParamData.removeData(str);
    }

    public static void pnsMergeData(TTMParamData tTMParamData, TTMParamData tTMParamData2, String str) {
        tTMParamData.mergeDataAsSubData(str, tTMParamData2);
    }
}
