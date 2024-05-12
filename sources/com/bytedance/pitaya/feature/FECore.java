package com.bytedance.pitaya.feature;

import X.C93276aOG;
import X.InterfaceC55385LoT;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class FECore implements IFeatureCore {
    public final String aid;

    @Override // com.bytedance.pitaya.api.feature.IFeatureCore
    public String getAid() {
        return this.aid;
    }

    public FECore(String aid) {
        o.LJIIJ(aid, "aid");
        this.aid = aid;
    }

    @Override // com.bytedance.pitaya.api.feature.IFeatureCore
    public void ResetRunEventCache(String businessName) {
        o.LJIIJ(businessName, "businessName");
        PTYRunEventCache.INSTANCE.reset(getAid(), businessName);
    }

    @Override // com.bytedance.pitaya.api.feature.IFeatureCore
    public InterfaceC55385LoT createFeatureSchema(String businessName) {
        o.LJIIJ(businessName, "businessName");
        String aid = getAid();
        o.LJIIJ(aid, "aid");
        return new PTYFeatureSchema();
    }

    @Override // com.bytedance.pitaya.api.feature.IFeatureCore
    public IKVStore createInMemoryKVStore(String businessName) {
        o.LJIIJ(businessName, "businessName");
        C93276aOG c93276aOG = PTYKVStore.Companion;
        String aid = getAid();
        c93276aOG.getClass();
        o.LJIIJ(aid, "aid");
        return new PTYKVStore(aid, businessName, true);
    }

    @Override // com.bytedance.pitaya.api.feature.IFeatureCore
    public IKVStore createKVStore(String businessName) {
        o.LJIIJ(businessName, "businessName");
        C93276aOG c93276aOG = PTYKVStore.Companion;
        String aid = getAid();
        c93276aOG.getClass();
        o.LJIIJ(aid, "aid");
        return new PTYKVStore(aid, businessName, false);
    }
}
