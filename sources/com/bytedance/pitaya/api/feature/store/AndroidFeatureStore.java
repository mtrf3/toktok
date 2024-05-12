package com.bytedance.pitaya.api.feature.store;

import X.C37692Eqm;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PitayaProxy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class AndroidFeatureStore implements IFeatureStore {
    public IFeatureStore innerFeatureStore;
    public final String TAG = "AndroidFeatureStore";
    public final ConcurrentHashMap<String, PTYFeatureProducer> producers = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, PTYModelInstance> dumpFeature = new ConcurrentHashMap<>();

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public List<String> getRegisteredProducer() {
        Enumeration<String> keys = this.producers.keys();
        o.LJFF(keys, "producers.keys()");
        ArrayList list = Collections.list(keys);
        o.LJFF(list, "java.util.Collections.list(this)");
        return list;
    }

    public final IFeatureStore getInnerFeatureStore() {
        return this.innerFeatureStore;
    }

    public final ConcurrentHashMap<String, PTYFeatureProducer> getProducers$pitayacore_release() {
        return this.producers;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final void setInnerFeatureStore(final IFeatureStore iFeatureStore) {
        if (iFeatureStore != null && this.innerFeatureStore == null) {
            synchronized (this) {
                if (this.innerFeatureStore == null) {
                    this.innerFeatureStore = iFeatureStore;
                    IFeatureStore featureStore = PTYFeatureStoreInstance.INSTANCE.getFeatureStore();
                    if (featureStore != null) {
                        Iterator<Map.Entry<String, PTYFeatureProducer>> it = ((AndroidFeatureStore) featureStore).producers.entrySet().iterator();
                        while (it.hasNext()) {
                            iFeatureStore.registerFeatureProducer(it.next().getValue(), new PTYNormalCallback() { // from class: com.bytedance.pitaya.api.feature.store.AndroidFeatureStore$innerFeatureStore$$inlined$synchronized$lambda$1
                                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                                public void onResult(boolean z, PTYError pTYError) {
                                }
                            });
                        }
                        PTYFeatureStoreInstance.INSTANCE.notifyAllListener$pitayacore_release(iFeatureStore);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pitaya.api.feature.store.AndroidFeatureStore");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureGroup(String groupName) {
        o.LJIIJ(groupName, "groupName");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.unregisterFeatureGroup(groupName);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean unregisterFeatureProducer(String groupName) {
        o.LJIIJ(groupName, "groupName");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.unregisterFeatureProducer(groupName);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean endSession(String featureName, String groupName) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.endSession(featureName, groupName);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getGroupFeature(List<PTYFeatureGroupQuery> query, boolean z) {
        IFeatureStore iFeatureStore;
        PTYModelInstance groupFeature;
        JSONObject features;
        o.LJIIJ(query, "query");
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        PTYModelInstance pTYModelInstance = new PTYModelInstance(uuid, "{}");
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        List<String> registeredProducer = getRegisteredProducer();
        for (PTYFeatureGroupQuery pTYFeatureGroupQuery : query) {
            if (!registeredProducer.contains(pTYFeatureGroupQuery.getGroupName())) {
                arrayList.add(pTYFeatureGroupQuery);
            } else {
                PTYFeatureProducer pTYFeatureProducer = this.producers.get(pTYFeatureGroupQuery.getGroupName());
                if (pTYFeatureProducer != null) {
                    for (PTYFeatureQuery pTYFeatureQuery : pTYFeatureGroupQuery.getQueries()) {
                        if (pTYFeatureQuery.getQueryType() == 200) {
                            JSONObject jSONObject2 = null;
                            if (pTYFeatureQuery.getExtParams() != null) {
                                try {
                                    jSONObject2 = new JSONObject(pTYFeatureQuery.getExtParams());
                                } catch (JSONException unused) {
                                }
                            }
                            switch (pTYFeatureQuery.getReturnType()) {
                                case 200:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), Float.valueOf(pTYFeatureProducer.getNumericFeature(pTYFeatureQuery.getFeatureName(), jSONObject2)));
                                    break;
                                case 201:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getStringFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                                case 202:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getDictFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                                case 203:
                                    jSONObject.put(pTYFeatureQuery.getReturnFeatureName(), pTYFeatureProducer.getSeqFeature(pTYFeatureQuery.getFeatureName(), jSONObject2));
                                    break;
                            }
                        }
                    }
                }
            }
        }
        if ((!arrayList.isEmpty()) && (iFeatureStore = this.innerFeatureStore) != null && (groupFeature = iFeatureStore.getGroupFeature(arrayList, false)) != null && (features = groupFeature.getFeatures()) != null) {
            Iterator<String> keys = features.keys();
            o.LJFF(keys, "it.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, features.get(next));
            }
        }
        pTYModelInstance.updateFeatures$pitayacore_release(jSONObject);
        if (z) {
            this.dumpFeature.put(pTYModelInstance.getInstanceID(), pTYModelInstance);
        }
        return pTYModelInstance;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public PTYModelInstance getModelInstance(String instanceId, boolean z) {
        o.LJIIJ(instanceId, "instanceId");
        if (z) {
            return this.dumpFeature.remove(instanceId);
        }
        return this.dumpFeature.get(instanceId);
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureGroup(PTYFeatureGroup featureGroup, PTYNormalCallback callback) {
        o.LJIIJ(featureGroup, "featureGroup");
        o.LJIIJ(callback, "callback");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null) {
            int code = PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode();
            callback.onResult(false, new PTYError("FeatureStore", code, code, "Pitaya SDK not init", null));
        } else {
            iFeatureStore.registerFeatureGroup(featureGroup, callback);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void registerFeatureProducer(PTYFeatureProducer featureProducer, PTYNormalCallback callback) {
        List<String> registeredProducer;
        o.LJIIJ(featureProducer, "featureProducer");
        o.LJIIJ(callback, "callback");
        String groupName = featureProducer.getGroupName();
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null && (registeredProducer = iFeatureStore.getRegisteredProducer()) != null && registeredProducer.contains(groupName)) {
            int code = PTYErrorCode.INVALID_DATA.getCode();
            callback.onResult(false, new PTYError("FeatureStore", code, code, i0.LJFF(groupName, " Producer has already been registered"), null));
            return;
        }
        synchronized (PTYFeatureStoreInstance.INSTANCE) {
            this.producers.put(groupName, featureProducer);
            IFeatureStore iFeatureStore2 = this.innerFeatureStore;
            if (iFeatureStore2 != null) {
                iFeatureStore2.registerFeatureProducer(featureProducer, callback);
            } else {
                callback.onResult(true, null);
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean startSession(String featureName, String groupName) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.startSession(featureName, groupName);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, JSONObject value, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(value, "value");
        o.LJIIJ(group, "group");
        if (this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) {
            String jSONObject = value.toString();
            o.LJFF(jSONObject, "value.toString()");
            return PTYFeatureStoreProxy.nativeAddFeatureJSON(group, name, jSONObject);
        }
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.addFeature(name, value, group);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerCppCallback(String groupName, String featureName, PTYFeatureChangeCallback callback) {
        String registerCppCallback;
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(callback, "callback");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null && (registerCppCallback = iFeatureStore.registerCppCallback(groupName, featureName, callback)) != null) {
            return registerCppCallback;
        }
        return "";
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public String registerPyCallback(String groupName, String featureName, String business) {
        String registerPyCallback;
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(business, "business");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null && (registerPyCallback = iFeatureStore.registerPyCallback(groupName, featureName, business)) != null) {
            return registerPyCallback;
        }
        return "";
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterCppCallback(String groupName, String featureName, String id) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(id, "id");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            iFeatureStore.unregisterCppCallback(groupName, featureName, id);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void unregisterPyCallback(String groupName, String featureName, String id) {
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(id, "id");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            iFeatureStore.unregisterPyCallback(groupName, featureName, id);
        }
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, String value, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(value, "value");
        o.LJIIJ(group, "group");
        if (this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) {
            return PTYFeatureStoreProxy.nativeAddFeatureString(group, name, value);
        }
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.addFeature(name, value, group);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean addFeature(String name, float f, String group) {
        o.LJIIJ(name, "name");
        o.LJIIJ(group, "group");
        if (this.innerFeatureStore == null && PitayaProxy.isFeatureStoreProxyEnabled()) {
            return PTYFeatureStoreProxy.nativeAddFeature(group, name, f);
        }
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.addFeature(name, f, group);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public boolean upload(PTYModelInstance modelInstance, float f, String business, int i, String tag) {
        o.LJIIJ(modelInstance, "modelInstance");
        o.LJIIJ(business, "business");
        o.LJIIJ(tag, "tag");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore != null) {
            return iFeatureStore.upload(modelInstance, f, business, i, tag);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.feature.store.IFeatureStore
    public void getFeature(String featureName, String groupName, int i, int i2, int i3, PTYFeatureCallback callback) {
        o.LJIIJ(featureName, "featureName");
        o.LJIIJ(groupName, "groupName");
        o.LJIIJ(callback, "callback");
        IFeatureStore iFeatureStore = this.innerFeatureStore;
        if (iFeatureStore == null) {
            int code = PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode();
            callback.onResult(false, new PTYError("FeatureStore", code, code, "Pitaya SDK not init", null), "");
        } else {
            iFeatureStore.getFeature(featureName, groupName, i, i2, i3, callback);
        }
    }
}
