package X;

import Y.ARunnableS10S0301000_10;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.sync.model.SyncCheckUpdateModel;
import com.bytedance.geckox.sync.model.SyncMsgModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ODY implements InterfaceC61581OEv {
    @Override // X.InterfaceC61581OEv
    public final void LIZ(SyncMsgModel syncMsgModel) {
        SyncCheckUpdateModel checkUpdateInfo = syncMsgModel.getData().getCheckUpdateInfo();
        OC6.LIZ("gecko-debug-tag", "sync check update msg", checkUpdateInfo);
        java.util.Map<String, SyncCheckUpdateModel.SyncChannelModel> config = checkUpdateInfo.getConfig();
        if (config == null || config.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        java.util.Map<String, java.util.Map<String, OptionCheckUpdateParams.CustomValue>> map = EBC.LIZ.LIZIZ;
        for (String str : config.keySet()) {
            SyncCheckUpdateModel.SyncChannelModel syncChannelModel = config.get(str);
            CheckRequestParamModel checkRequestParamModel = new CheckRequestParamModel(syncChannelModel.getGroup());
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = syncChannelModel.getTargetChannel().iterator();
            while (it.hasNext()) {
                arrayList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
            }
            checkRequestParamModel.setTargetChannels(arrayList);
            hashMap.put(str, checkRequestParamModel);
            if (map != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                if (!concurrentHashMap.isEmpty() && concurrentHashMap.containsKey(str)) {
                    HashMap hashMap3 = new HashMap();
                    java.util.Map map2 = (java.util.Map) concurrentHashMap.get(str);
                    if (map2 != null && !map2.isEmpty()) {
                        for (Map.Entry entry : map2.entrySet()) {
                            if (syncChannelModel.getCustomKeys().contains(entry.getKey())) {
                                hashMap3.put(entry.getKey(), ((OptionCheckUpdateParams.CustomValue) entry.getValue()).getValue());
                            }
                        }
                        hashMap2.put(str, hashMap3);
                    }
                }
            }
        }
        C61555ODv c61555ODv = C61573OEn.LIZ;
        int syncTaskId = syncMsgModel.getSyncTaskId();
        if (c61555ODv.LIZ(syncTaskId, syncMsgModel.getMsgType(), syncMsgModel.getTimestamp()) || hashMap.isEmpty()) {
            return;
        }
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setCustomParam(hashMap2);
        optionCheckUpdateParams.setEnableRetry(true);
        optionCheckUpdateParams.setEnableThrottle(false);
        OC6.LIZ("gecko-debug-tag", "sync check update start");
        OAR.LIZ.LIZ().execute(new ARunnableS10S0301000_10(syncTaskId, hashMap, optionCheckUpdateParams, c61555ODv, 2));
    }
}
