package com.ss.android.ugc.effectmanager.algorithm;

import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.common.Multimap;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class ServerConfig {
    public Multimap<String, ModelInfo> data;
    public LoadedModelList loadedModelList;

    private void checkContent() {
        HashMap hashMap = new HashMap();
        for (ModelInfo modelInfo : this.data.values()) {
            String name = modelInfo.getName();
            if (hashMap.containsKey(name)) {
                if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                    throw new RuntimeException(a1.LJ("model ", name, " has different versions in ServerTable,Please modify the file to the correct format "));
                }
            } else {
                hashMap.put(name, modelInfo.getVersion());
            }
        }
    }

    public LoadedModelList getLoadedModelList() {
        if (this.loadedModelList == null) {
            checkContent();
            this.loadedModelList = new LoadedModelList();
            Multimap<String, LoadedModelList.ModelInfoState> multimap = new Multimap<>();
            for (String str : this.data.keySet()) {
                Iterator<ModelInfo> it = this.data.get(str).iterator();
                while (it.hasNext()) {
                    multimap.put(str, new LoadedModelList.ModelInfoState(it.next()));
                }
            }
            this.loadedModelList.setRequirementModelInfoStateMap(multimap);
        }
        return this.loadedModelList;
    }

    public ServerConfig(Multimap<String, ModelInfo> multimap) {
        Preconditions.checkNotNull(multimap);
        this.data = multimap;
    }
}
