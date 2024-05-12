package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C31207CMp;
import X.C5H3;
import X.C78996UzQ;
import X.CN1;
import X.X9U;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.repo.MockSettingsRepo;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ttmock.TTMock;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMockTask extends AbstractC31208CMq {
    public final C5H3 liveSettingsModelMap$delegate = C78996UzQ.LJJIJIIJI(C31207CMp.LJLIL);

    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "LiveMockTask";
    }

    private final Map<String, LiveSettingModel> getLiveSettingsModelMap() {
        return (Map) this.liveSettingsModelMap$delegate.getValue();
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        m mVar;
        j LJJIJ;
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
        X9U x9u = (X9U) TTMock.INSTANCE.getMockDelegate(X9U.class);
        if (x9u == null || (mVar = (m) x9u.get()) == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Set<String> LJJIZ = mVar.LJJIZ();
        if (LJJIZ != null) {
            for (String str : LJJIZ) {
                if (str != null && (LJJIJ = mVar.LJJIJ(str)) != null) {
                    concurrentHashMap.put(str, LJJIJ);
                }
            }
        }
        setSettings(concurrentHashMap);
    }

    public final void setSettings(Map<String, ? extends j> settingsMap) {
        String fieldTypeName;
        o.LJIIIZ(settingsMap, "settingsMap");
        for (Map.Entry<String, ? extends j> entry : settingsMap.entrySet()) {
            LiveSettingModel liveSettingModel = getLiveSettingsModelMap().get(entry.getKey());
            if (liveSettingModel != null && (fieldTypeName = liveSettingModel.getFieldTypeName()) != null) {
                switch (fieldTypeName.hashCode()) {
                    case -1325958191:
                        if (fieldTypeName.equals("double")) {
                            MockSettingsRepo.INSTANCE.storeDoubleValue(entry.getKey(), entry.getValue().LJIIIZ());
                            break;
                        } else {
                            break;
                        }
                    case 104431:
                        if (fieldTypeName.equals("int")) {
                            MockSettingsRepo.INSTANCE.storeIntValue(entry.getKey(), entry.getValue().LJIILJJIL());
                            break;
                        } else {
                            break;
                        }
                    case 3327612:
                        if (fieldTypeName.equals("long")) {
                            MockSettingsRepo.INSTANCE.storeLongValue(entry.getKey(), entry.getValue().LJIJJLI());
                            break;
                        } else {
                            break;
                        }
                    case 64711720:
                        if (fieldTypeName.equals("boolean")) {
                            MockSettingsRepo.INSTANCE.storeBooleanValue(entry.getKey(), entry.getValue().LJFF());
                            break;
                        } else {
                            break;
                        }
                    case 97526364:
                        if (fieldTypeName.equals("float")) {
                            MockSettingsRepo.INSTANCE.storeFloatValue(entry.getKey(), entry.getValue().LJIIJ());
                            break;
                        } else {
                            break;
                        }
                    case 1195259493:
                        if (fieldTypeName.equals("java.lang.String")) {
                            MockSettingsRepo.INSTANCE.storeStringValue(entry.getKey(), entry.getValue().LJJIFFI());
                            break;
                        } else {
                            break;
                        }
                }
            }
            MockSettingsRepo.INSTANCE.storeStringValue(entry.getKey(), entry.getValue().LJJIFFI());
        }
    }
}
