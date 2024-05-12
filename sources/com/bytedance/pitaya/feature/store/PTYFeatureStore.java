package com.bytedance.pitaya.feature.store;

import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.feature.store.IFeatureStore;
import com.bytedance.pitaya.api.feature.store.PTYFeatureCallback;
import com.bytedance.pitaya.api.feature.store.PTYFeatureChangeCallback;
import com.bytedance.pitaya.api.feature.store.PTYFeatureGroup;
import com.bytedance.pitaya.api.feature.store.PTYFeatureGroupQuery;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import com.bytedance.pitaya.api.feature.store.PTYModelInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class PTYFeatureStore implements IFeatureStore {
    public static final PTYFeatureStore INSTANCE = new PTYFeatureStore();

    public static final native void nativeAddFeature(String str, float f, String str2);

    public static final native void nativeAddFeatureJSON(String str, String str2, String str3);

    public static final native void nativeAddFeatureString(String str, String str2, String str3);

    public static final native void nativeEndSession(String str, String str2);

    public static final native void nativeGetFeature(String str, String str2, int i, int i2, int i3, PTYFeatureCallback pTYFeatureCallback);

    public static final native PTYModelInstance nativeGetGroupFeature(List<PTYFeatureGroupQuery> list);

    public static final native List<String> nativeGetRegisteredProducers();

    public static final native String nativeRegisterCppCallback(String str, String str2, PTYFeatureChangeCallback pTYFeatureChangeCallback);

    public static final native void nativeRegisterFeatureGroup(PTYFeatureGroup pTYFeatureGroup, PTYNormalCallback pTYNormalCallback);

    public static final native void nativeRegisterFeatureProducer(PTYFeatureProducer pTYFeatureProducer, PTYNormalCallback pTYNormalCallback);

    public static final native String nativeRegisterPyCallback(String str, String str2, String str3);

    public static final native void nativeStartSession(String str, String str2);

    public static final native boolean nativeUnRegisterFeatureGroup(String str);

    public static final native boolean nativeUnRegisterFeatureProducer(String str);

    public static final native void nativeUnregisterCppCallback(String str, String str2, String str3);

    public static final native void nativeUnregisterPyCallback(String str, String str2, String str3);

    public static final native void nativeUpload(PTYModelInstance pTYModelInstance, float f, String str, int i, String str2);

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getModelInstance(String instanceId, boolean z) {
        o.LJIIJ(instanceId, "instanceId");
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public List<String> getRegisteredProducer() {
        try {
            return nativeGetRegisteredProducers();
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return null;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureGroup(String groupName) {
        o.LJIIJ(groupName, "groupName");
        try {
            return nativeUnRegisterFeatureGroup(groupName);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return false;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureProducer(String groupName) {
        o.LJIIJ(groupName, "groupName");
        try {
            return nativeUnRegisterFeatureProducer(groupName);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return false;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean endSession(String featureName, String groupName) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        try {
            nativeEndSession(featureName, groupName);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getGroupFeature(List<PTYFeatureGroupQuery> query, boolean z) {
        o.LJIIJ(query, "query");
        try {
            return nativeGetGroupFeature(query);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return null;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureGroup(PTYFeatureGroup featureGroup, PTYNormalCallback callback) {
        o.LJIIJ(featureGroup, "featureGroup");
        o.LJIIJ(callback, "callback");
        try {
            nativeRegisterFeatureGroup(featureGroup, callback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureProducer(PTYFeatureProducer featureProducer, PTYNormalCallback callback) {
        o.LJIIJ(featureProducer, "featureProducer");
        o.LJIIJ(callback, "callback");
        try {
            nativeRegisterFeatureProducer(featureProducer, callback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean startSession(String featureName, String groupName) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        try {
            nativeStartSession(featureName, groupName);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, JSONObject value, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(value, "value");
        o.LJIIJ(group, "group");
        try {
            String jSONObject = value.toString();
            o.LJFF(jSONObject, "value.toString()");
            nativeAddFeatureJSON(name, jSONObject, group);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerCppCallback(String groupName, String featureName, PTYFeatureChangeCallback callback) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(callback, "callback");
        try {
            return nativeRegisterCppCallback(groupName, featureName, callback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return "";
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerPyCallback(String groupName, String featureName, String business) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(business, "business");
        try {
            return nativeRegisterPyCallback(groupName, featureName, business);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return "";
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterCppCallback(String groupName, String featureName, String id) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(id, "id");
        try {
            nativeUnregisterCppCallback(groupName, featureName, id);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterPyCallback(String groupName, String featureName, String id) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(id, "id");
        try {
            nativeUnregisterPyCallback(groupName, featureName, id);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, String value, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(value, "value");
        o.LJIIJ(group, "group");
        try {
            nativeAddFeatureString(name, value, group);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, float f, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(group, "group");
        try {
            nativeAddFeature(name, f, group);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean upload(PTYModelInstance modelInstance, float f, String business, int i, String tag) {
        o.LJIIJ(modelInstance, "modelInstance");
        o.LJIIJ(business, "business");
        o.LJIIJ(tag, "tag");
        try {
            nativeUpload(modelInstance, f, business, i, tag);
            return true;
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return true;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void getFeature(String featureName, String groupName, int i, int i2, int i3, PTYFeatureCallback callback) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(callback, "callback");
        try {
            nativeGetFeature(featureName, groupName, i, i2, i3, callback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public static /* synthetic */ void nativeUpload$default(PTYModelInstance pTYModelInstance, float f, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            str2 = "";
        }
        nativeUpload(pTYModelInstance, f, str, i, str2);
    }
}
