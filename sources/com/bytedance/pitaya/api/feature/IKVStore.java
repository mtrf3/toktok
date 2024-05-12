package com.bytedance.pitaya.api.feature;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface IKVStore extends ReflectionCall {
    boolean append(JSONObject jSONObject);

    boolean contain(String str);

    String getAid();

    String getBusinessName();

    boolean getInMemory();

    JSONObject getKVData();

    Object getValueForKey(String str);

    JSONObject getValueForKeys(List<String> list);

    boolean removeKeys(List<String> list);

    boolean setKVData(JSONObject jSONObject);

    boolean setValueForKey(String str, Object obj);

    String tryGetValuesForRequest(List<String> list);
}
