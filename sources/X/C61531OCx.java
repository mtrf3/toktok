package X;

import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OCx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61531OCx extends AbstractC61574OEo {
    public final /* synthetic */ C61532OCy LIZ;

    @Override // X.AbstractC61574OEo
    public final void LIZ() {
    }

    public C61531OCx(C61532OCy c61532OCy) {
        this.LIZ = c61532OCy;
    }

    @Override // X.AbstractC61574OEo
    public final void LIZIZ(GlobalConfigSettings globalConfigSettings) {
        LIZLLL(globalConfigSettings);
    }

    @Override // X.AbstractC61574OEo
    public final void LIZJ(int i) {
        if (i == 2103) {
            C61528OCu.LIZ.LIZ();
            return;
        }
        C61532OCy c61532OCy = this.LIZ;
        if (c61532OCy.LJIIIZ) {
            return;
        }
        c61532OCy.LJIIIZ = true;
        LIZLLL(c61532OCy.LJFF());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.util.ArrayList] */
    public final void LIZLLL(GlobalConfigSettings globalConfigSettings) {
        boolean z;
        java.util.Map<String, java.util.Map<String, UpdateModel>> map;
        int i;
        if (this.LIZ.LJ == null || globalConfigSettings == null || globalConfigSettings.getReqMeta() == null) {
            return;
        }
        C61532OCy c61532OCy = this.LIZ;
        if (c61532OCy.LJI == null) {
            c61532OCy.LJI = new OD0();
        }
        C61532OCy c61532OCy2 = this.LIZ;
        OD0 od0 = c61532OCy2.LJI;
        long j = c61532OCy2.LJIIIIZZ;
        GlobalConfigSettings.ReqMeta reqMeta = globalConfigSettings.getReqMeta();
        if (od0.LIZIZ != null) {
            Object[] objArr = new Object[2];
            objArr[0] = "sync queue enable";
            if (reqMeta.getEnable() == 1) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            OC6.LIZ("gecko-debug-tag", objArr);
            if (EBC.LIZ.LJII() && reqMeta.getQueue() != null && !reqMeta.getQueue().isEmpty() && !od0.LIZ.get()) {
                List<GlobalConfigSettings.RequestConfig> queue = reqMeta.getQueue();
                od0.LIZ.set(true);
                if (queue != null && !queue.isEmpty() && (map = OD0.LJFF) != null) {
                    for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                        HashMap hashMap = new HashMap();
                        java.util.Map map2 = (java.util.Map) entry.getValue();
                        for (int size = queue.size() - 1; size >= 0; size--) {
                            List<GlobalConfigSettings.SyncItem> sync = ((GlobalConfigSettings.RequestConfig) ListProtector.get(queue, size)).getSync();
                            for (int size2 = sync.size() - 1; size2 >= 0; size2--) {
                                GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) ListProtector.get(sync, size2);
                                String accessKey = syncItem.getAccessKey();
                                UpdateModel updateModel = (UpdateModel) map2.get(accessKey);
                                if (updateModel != null) {
                                    if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
                                        GlobalConfigSettings.SyncItem syncItem2 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                        if (syncItem2 == null) {
                                            hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, new ArrayList(syncItem.getGroup()), new ArrayList(syncItem.getTarget())));
                                        } else {
                                            syncItem2.getTarget().addAll(syncItem.getTarget());
                                            syncItem2.getGroup().addAll(syncItem.getGroup());
                                        }
                                        ListProtector.remove(sync, size2);
                                    } else {
                                        List<String> group = syncItem.getGroup();
                                        List<String> target = syncItem.getTarget();
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        if (updateModel.getGroups() != null && !updateModel.getGroups().isEmpty()) {
                                            for (String str : updateModel.getGroups()) {
                                                if (group.contains(str)) {
                                                    arrayList.add(str);
                                                    group.remove(str);
                                                }
                                            }
                                        }
                                        if (updateModel.getChannels() != null && !updateModel.getChannels().isEmpty()) {
                                            for (String str2 : updateModel.getChannels()) {
                                                if (target.contains(str2)) {
                                                    arrayList2.add(str2);
                                                    target.remove(str2);
                                                }
                                            }
                                        }
                                        if ((group == null || group.isEmpty()) && (target == null || target.isEmpty())) {
                                            ListProtector.remove(sync, size2);
                                        }
                                        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                                            GlobalConfigSettings.SyncItem syncItem3 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                            if (syncItem3 == null) {
                                                hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, arrayList, arrayList2));
                                            } else {
                                                syncItem3.getTarget().addAll(arrayList2);
                                                syncItem3.getGroup().addAll(arrayList);
                                            }
                                        }
                                    }
                                }
                            }
                            if (sync.isEmpty()) {
                                ListProtector.remove(queue, size);
                            }
                        }
                        if (!hashMap.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = hashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((Map.Entry) it.next()).getValue());
                            }
                            if (od0.LIZJ == null) {
                                od0.LIZJ = new HashMap();
                            }
                            List list = (List) ((HashMap) od0.LIZJ).get(entry.getKey());
                            if (list != 0) {
                                list.addAll(arrayList3);
                                arrayList3 = list;
                            }
                            ((HashMap) od0.LIZJ).put(entry.getKey(), arrayList3);
                        }
                    }
                }
                OC6.LIZ("gecko-debug-tag", "sync queue filter registered occasion", od0.LIZJ);
                ?? arrayList4 = new ArrayList();
                long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                int i2 = -1;
                for (int i3 = 0; i3 < queue.size(); i3++) {
                    GlobalConfigSettings.RequestConfig requestConfig = (GlobalConfigSettings.RequestConfig) ListProtector.get(queue, i3);
                    long delay = requestConfig.getDelay();
                    if (delay <= currentTimeMillis) {
                        arrayList4.addAll(requestConfig.getSync());
                        i2 = i3;
                    } else {
                        ?? sync2 = requestConfig.getSync();
                        OEC oec = new OEC(od0);
                        oec.LIZIZ = sync2;
                        C61572OEm.LIZ.LIZIZ(oec, (delay - currentTimeMillis) * 1000);
                    }
                }
                od0.LIZLLL.set(queue.size());
                if (!arrayList4.isEmpty()) {
                    ((GlobalConfigSettings.RequestConfig) ListProtector.get(queue, i2)).getDelay();
                    OEC oec2 = new OEC(od0);
                    oec2.LIZIZ = arrayList4;
                    C61572OEm.LIZ.LIZIZ(oec2, 0L);
                }
            }
        }
        C61521OCn c61521OCn = C61528OCu.LIZ;
        C61532OCy c61532OCy3 = this.LIZ;
        boolean LJII = c61532OCy3.LJII();
        GlobalConfigSettings LJFF = c61532OCy3.LJFF();
        if (LJFF != null && LJFF.getReqMeta() != null) {
            if (LJII && LJFF.getReqMeta().getPollEnable() == 1) {
                i = 2;
                LJII = true;
            } else {
                i = 2;
                LJII = false;
            }
        } else {
            i = 2;
        }
        Object[] objArr2 = new Object[i];
        objArr2[0] = "gecko update combine enable:";
        objArr2[1] = Boolean.valueOf(LJII);
        OC6.LIZ("gecko-debug-tag", objArr2);
        c61521OCn.getClass();
        Object[] objArr3 = new Object[i];
        objArr3[0] = "loop enable update";
        objArr3[1] = Boolean.valueOf(LJII);
        OC6.LIZ("gecko-debug-tag", objArr3);
        c61521OCn.LIZLLL.set(LJII);
        if (!LJII) {
            c61521OCn.LIZ();
        }
        java.util.Map<String, GlobalConfigSettings.GeckoPollingConfig> checkUpdate = globalConfigSettings.getReqMeta().getCheckUpdate();
        if (checkUpdate == null || checkUpdate.isEmpty()) {
            return;
        }
        for (Map.Entry<String, GlobalConfigSettings.GeckoPollingConfig> entry2 : checkUpdate.entrySet()) {
            String key = entry2.getKey();
            int interval = entry2.getValue().getInterval();
            C61522OCo c61522OCo = (C61522OCo) ((ConcurrentHashMap) c61521OCn.LIZIZ).get(key);
            if (c61522OCo == null) {
                c61522OCo = new C61522OCo(key, ((Integer) ((ConcurrentHashMap) c61521OCn.LIZJ).get(key)).intValue());
                c61522OCo.LJFF = new C61527OCt(c61521OCn.LIZ, EnumC61516OCi.valueOf(key));
                ((ConcurrentHashMap) c61521OCn.LIZIZ).put(key, c61522OCo);
            }
            ((ConcurrentHashMap) c61521OCn.LIZJ).put(key, Integer.valueOf(interval));
            List<GlobalConfigSettings.SyncItem> combine = entry2.getValue().getCombine();
            if (combine != null && !combine.isEmpty()) {
                for (GlobalConfigSettings.SyncItem syncItem4 : combine) {
                    String accessKey2 = syncItem4.getAccessKey();
                    List<String> group2 = syncItem4.getGroup();
                    List<String> target2 = syncItem4.getTarget();
                    C61526OCs LIZ = c61522OCo.LIZ(accessKey2);
                    if (group2 != null) {
                        for (String str3 : group2) {
                            if (!TextUtils.isEmpty(str3) && !LIZ.LIZIZ.getGroupName().contains(str3)) {
                                LIZ.LIZIZ.addToGroupName(str3);
                            }
                        }
                    }
                    if (target2 != null) {
                        for (String str4 : target2) {
                            Iterator<CheckRequestBodyModel.TargetChannel> it2 = LIZ.LIZIZ.getTargetChannels().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (it2.next().channelName.equals(str4)) {
                                        break;
                                    }
                                } else {
                                    LIZ.LIZIZ.getTargetChannels().add(new CheckRequestBodyModel.TargetChannel(str4));
                                    break;
                                }
                            }
                        }
                    }
                    ((ConcurrentHashMap) c61522OCo.LJ).put(accessKey2, LIZ);
                }
            }
            if (c61521OCn.LIZLLL.get()) {
                c61522OCo.LIZIZ(interval);
                c61522OCo.LIZJ();
            }
        }
    }
}
