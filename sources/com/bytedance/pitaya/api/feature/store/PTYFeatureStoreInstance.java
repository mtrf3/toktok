package com.bytedance.pitaya.api.feature.store;

import X.C37692Eqm;
import X.VF3;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PTYFeatureStoreInstance implements ReflectionCall {
    public static final PTYFeatureStoreInstance INSTANCE = new PTYFeatureStoreInstance();
    public static final IFeatureStore featureStore = new AndroidFeatureStore();
    public static final Set<VF3> listeners = new LinkedHashSet();

    public final IFeatureStore getFeatureStore() {
        return featureStore;
    }

    public final void notifyAllListener$pitayacore_release(IFeatureStore featureStore2) {
        o.LJIIJ(featureStore2, "featureStore");
        synchronized (this) {
            Iterator<VF3> it = listeners.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public final void registerReadyListener(VF3 listener) {
        o.LJIIJ(listener, "listener");
        synchronized (this) {
            IFeatureStore iFeatureStore = featureStore;
            if (iFeatureStore != null) {
                if (((AndroidFeatureStore) iFeatureStore).getInnerFeatureStore() != null) {
                    listener.LIZ();
                } else {
                    listeners.add(listener);
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pitaya.api.feature.store.AndroidFeatureStore");
            }
        }
    }
}
