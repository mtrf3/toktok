package X;

import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.model.DeploymentModelV4;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ODN {
    public static List<OE0> LJI() {
        ArrayList arrayList = new ArrayList();
        OEE oee = new OEE();
        oee.LIZ = OEU.class;
        oee.LIZIZ = C61541ODh.LIZ(OEU.class);
        arrayList.add(new OE0(oee));
        return arrayList;
    }

    public static List<OE0> LIZJ(C61276O3c c61276O3c, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        AbstractC61537ODd listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        OEE oee = new OEE();
        oee.LIZ = C61547ODn.class;
        oee.LIZJ = new Object[]{c61276O3c.LIZIZ, optionCheckUpdateParams};
        arrayList.add(new OE0(oee));
        OEE oee2 = new OEE();
        oee2.LIZ = OD7.class;
        oee2.LIZJ = new Object[]{listener};
        arrayList.add(new OE0(oee2));
        ODW odw = new ODW();
        odw.LIZIZ = new C61542ODi(new ODO(listener), C61541ODh.LIZ(C61579OEt.class));
        OEA LIZIZ = odw.LIZIZ("branch_zip");
        LIZIZ.LIZ(LIZLLL(c61276O3c, optionCheckUpdateParams, 0));
        OEE oee3 = new OEE();
        oee3.LIZ = C61577OEr.class;
        LIZIZ.LIZ(new OE0(oee3));
        OEA LIZIZ2 = odw.LIZIZ("branch_single_file");
        LIZIZ2.LIZ(LIZLLL(c61276O3c, optionCheckUpdateParams, 1));
        OEE oee4 = new OEE();
        oee4.LIZ = C61577OEr.class;
        LIZIZ2.LIZ(new OE0(oee4));
        OEA LIZIZ3 = odw.LIZIZ("branch_zstd");
        ODW odw2 = new ODW();
        ((ArrayList) odw2.LIZIZ("patch").LIZ).addAll(LJFF(c61276O3c, optionCheckUpdateParams, true));
        ((ArrayList) odw2.LIZIZ("full").LIZ).addAll(LJFF(c61276O3c, optionCheckUpdateParams, false));
        LIZIZ3.LIZ(odw2.LIZ(C61540ODg.class));
        OEE oee5 = new OEE();
        oee5.LIZ = C61577OEr.class;
        LIZIZ3.LIZ(new OE0(oee5));
        arrayList.add(odw.LIZ(C61579OEt.class));
        OEE oee6 = new OEE();
        oee6.LIZ = ODH.class;
        oee6.LIZIZ = new C61542ODi(new C61554ODu(listener), C61541ODh.LIZ(ODH.class));
        arrayList.add(new OE0(oee6));
        return arrayList;
    }

    public static C61548ODo LJIIIIZZ(C61276O3c c61276O3c, OptionCheckUpdateParams optionCheckUpdateParams) {
        List<OE0> LJI = LJI();
        ((ArrayList) LJI).addAll(LIZJ(c61276O3c, optionCheckUpdateParams));
        return C61558ODy.LIZ(LJI);
    }

    public static void LIZIZ(OptionCheckUpdateParams optionCheckUpdateParams, java.util.Map map, java.util.Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        java.util.Map<String, java.util.Map<String, Object>> customParam = optionCheckUpdateParams.getCustomParam();
        if (customParam == null) {
            customParam = new HashMap<>();
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            CheckRequestParamModel checkRequestParamModel = (CheckRequestParamModel) entry.getValue();
            java.util.Map<String, Object> map3 = customParam.get(key);
            HashMap hashMap = new HashMap();
            C61526OCs c61526OCs = new C61526OCs(hashMap, new DeploymentModelV4());
            if (map3 != null) {
                hashMap.putAll(map3);
            }
            ((ConcurrentHashMap) map).put(key, c61526OCs);
            List<CheckRequestBodyModel.TargetChannel> targetChannels = checkRequestParamModel.getTargetChannels();
            List<CheckRequestBodyModel.TargetChannel> targetChannels2 = c61526OCs.LIZIZ.getTargetChannels();
            if (targetChannels != null && !targetChannels.isEmpty()) {
                for (CheckRequestBodyModel.TargetChannel targetChannel : targetChannels) {
                    Iterator<CheckRequestBodyModel.TargetChannel> it = targetChannels2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().channelName.equals(targetChannel.channelName)) {
                                break;
                            }
                        } else {
                            targetChannels2.add(targetChannel);
                            break;
                        }
                    }
                }
            }
            List<?> groupName = c61526OCs.LIZIZ.getGroupName();
            if (targetChannels2.isEmpty()) {
                String group = checkRequestParamModel.getGroup();
                if (!TextUtils.isEmpty(group) && !"default".equals(group)) {
                    Iterator<?> it2 = groupName.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((DeploymentModelV4.V4Group) it2.next()).name.equals(group)) {
                                break;
                            }
                        } else {
                            c61526OCs.LIZIZ.addToGroupName(new DeploymentModelV4.V4Group(group));
                            break;
                        }
                    }
                }
                if (groupName.isEmpty()) {
                    throw new RuntimeException("group can not be default or empty!");
                }
            }
        }
    }

    public static OE0 LIZLLL(C61276O3c c61276O3c, OptionCheckUpdateParams optionCheckUpdateParams, int i) {
        ODW odw = new ODW();
        OEA LIZIZ = odw.LIZIZ("patch");
        ((ArrayList) LIZIZ.LIZ).addAll(LJ(c61276O3c, i, optionCheckUpdateParams, true));
        OEA LIZIZ2 = odw.LIZIZ("full");
        ((ArrayList) LIZIZ2.LIZ).addAll(LJ(c61276O3c, i, optionCheckUpdateParams, false));
        return odw.LIZ(C61540ODg.class);
    }

    public static List<OE0> LJFF(C61276O3c c61276O3c, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        AbstractC61537ODd listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        LIZ(c61276O3c, optionCheckUpdateParams, arrayList, listener);
        OEE oee = new OEE();
        oee.LIZ = ODF.class;
        oee.LIZJ = new Object[]{c61276O3c};
        oee.LIZIZ = new C61542ODi(new OE8(listener), C61541ODh.LIZ(ODF.class));
        arrayList.add(new OE0(oee));
        if (z) {
            OEE oee2 = new OEE();
            oee2.LIZ = OD8.class;
            oee2.LIZJ = new Object[0];
            oee2.LIZIZ = new C61542ODi(new OE8(listener), C61541ODh.LIZ(OD8.class));
            arrayList.add(new OE0(oee2));
        } else {
            OEE oee3 = new OEE();
            oee3.LIZ = ODD.class;
            oee3.LIZIZ = new C61542ODi(new OE8(listener), C61541ODh.LIZ(ODD.class));
            arrayList.add(new OE0(oee3));
        }
        OEE oee4 = new OEE();
        oee4.LIZ = ODB.class;
        oee4.LIZIZ = new C61542ODi(new OE4(listener), C61541ODh.LIZ(ODB.class));
        arrayList.add(new OE0(oee4));
        return arrayList;
    }

    public static void LIZ(C61276O3c c61276O3c, OptionCheckUpdateParams optionCheckUpdateParams, List<OE0> list, AbstractC61537ODd abstractC61537ODd) {
        OEE oee = new OEE();
        oee.LIZ = C61545ODl.class;
        oee.LIZJ = new Object[]{Boolean.valueOf(optionCheckUpdateParams.isEnableDownloadAutoRetry())};
        oee.LIZIZ = new C61542ODi(new ODU(abstractC61537ODd), C61541ODh.LIZ(C61545ODl.class));
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new OE0(oee));
        OEE oee2 = new OEE();
        oee2.LIZ = ODA.class;
        oee2.LIZJ = new Object[]{c61276O3c, abstractC61537ODd, optionCheckUpdateParams};
        oee2.LIZIZ = new C61542ODi(new OE1(abstractC61537ODd), C61541ODh.LIZ(ODA.class));
        arrayList.add(new OE0(oee2));
    }

    public static List<OE0> LJ(C61276O3c c61276O3c, int i, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        AbstractC61537ODd listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        LIZ(c61276O3c, optionCheckUpdateParams, arrayList, listener);
        if (z) {
            OEE oee = new OEE();
            oee.LIZ = OD9.class;
            oee.LIZJ = new Object[]{c61276O3c};
            oee.LIZIZ = new C61542ODi(new OE8(listener), C61541ODh.LIZ(OD9.class));
            arrayList.add(new OE0(oee));
        }
        if (i == 0) {
            OEE oee2 = new OEE();
            oee2.LIZ = ODD.class;
            oee2.LIZIZ = new C61542ODi(new OE8(listener), C61541ODh.LIZ(ODD.class));
            arrayList.add(new OE0(oee2));
        }
        OEE oee3 = new OEE();
        oee3.LIZ = ODB.class;
        oee3.LIZIZ = new C61542ODi(new OE4(listener), C61541ODh.LIZ(ODB.class));
        arrayList.add(new OE0(oee3));
        return arrayList;
    }

    public static C61548ODo LJII(C61276O3c c61276O3c, java.util.Map map, EnumC61516OCi enumC61516OCi, C61523OCp c61523OCp) {
        List<OE0> LJI = LJI();
        OEE oee = new OEE();
        oee.LIZ = ODM.class;
        oee.LIZJ = new Object[]{Boolean.FALSE};
        ArrayList arrayList = (ArrayList) LJI;
        arrayList.add(new OE0(oee));
        OEE oee2 = new OEE();
        oee2.LIZ = OD5.class;
        oee2.LIZJ = new Object[]{Boolean.TRUE, c61276O3c, map, null, c61523OCp, enumC61516OCi};
        oee2.LIZIZ = new C61542ODi(C61541ODh.LIZ(OD5.class));
        arrayList.add(new OE0(oee2));
        OEE oee3 = new OEE();
        oee3.LIZ = ODG.class;
        arrayList.add(new OE0(oee3));
        arrayList.addAll(LIZJ(c61276O3c, null));
        return C61558ODy.LIZ(LJI);
    }

    public static C61548ODo LJIIJ(C61276O3c c61276O3c, List list, OptionCheckUpdateParams optionCheckUpdateParams, C61523OCp c61523OCp) {
        List<?> arrayList;
        List<CheckRequestBodyModel.TargetChannel> arrayList2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) it.next();
            String accessKey = syncItem.getAccessKey();
            if (concurrentHashMap.containsKey(accessKey)) {
                arrayList = ((C61526OCs) concurrentHashMap.get(accessKey)).LIZIZ.getGroupName();
                arrayList2 = ((C61526OCs) concurrentHashMap.get(accessKey)).LIZIZ.getTargetChannels();
            } else {
                arrayList = new ArrayList<>();
                arrayList2 = new ArrayList<>();
            }
            if (syncItem.getGroup() != null) {
                Iterator<String> it2 = syncItem.getGroup().iterator();
                while (it2.hasNext()) {
                    arrayList.add(new DeploymentModelV4.V4Group(it2.next()));
                }
            }
            if (syncItem.getTarget() != null) {
                Iterator<String> it3 = syncItem.getTarget().iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CheckRequestBodyModel.TargetChannel(it3.next()));
                }
            }
            concurrentHashMap.put(accessKey, new C61526OCs(new HashMap(), new DeploymentModelV4(arrayList, arrayList2)));
        }
        return LJIIJJI(c61276O3c, concurrentHashMap, optionCheckUpdateParams, c61523OCp);
    }

    public static C61548ODo LJIIJJI(C61276O3c c61276O3c, java.util.Map map, OptionCheckUpdateParams optionCheckUpdateParams, C61523OCp c61523OCp) {
        ODV odv;
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        AbstractC61537ODd listener = optionCheckUpdateParams.getListener();
        List<OE0> LJI = LJI();
        OEE oee = new OEE();
        oee.LIZ = ODM.class;
        oee.LIZJ = new Object[]{Boolean.valueOf(optionCheckUpdateParams.getInnerRequestByUser())};
        ArrayList arrayList = (ArrayList) LJI;
        arrayList.add(new OE0(oee));
        OEE oee2 = new OEE();
        oee2.LIZ = OD5.class;
        oee2.LIZJ = new Object[]{Boolean.FALSE, c61276O3c, map, listener, c61523OCp, optionCheckUpdateParams};
        OE9[] oe9Arr = new OE9[2];
        if (listener == null) {
            odv = null;
        } else {
            odv = new ODV(optionCheckUpdateParams, listener);
        }
        oe9Arr[0] = odv;
        oe9Arr[1] = C61541ODh.LIZ(OD5.class);
        oee2.LIZIZ = new C61542ODi(oe9Arr);
        arrayList.add(new OE0(oee2));
        OEE oee3 = new OEE();
        oee3.LIZ = ODG.class;
        arrayList.add(new OE0(oee3));
        arrayList.addAll(LIZJ(c61276O3c, optionCheckUpdateParams));
        return C61558ODy.LIZ(LJI);
    }

    public static C61548ODo LJIIIZ(C61276O3c c61276O3c, java.util.Map map, String str, OptionCheckUpdateParams optionCheckUpdateParams, C61523OCp c61523OCp) {
        HashMap hashMap = new HashMap();
        if (map == null || map.isEmpty()) {
            Iterator<String> it = c61276O3c.LJ.iterator();
            while (it.hasNext()) {
                hashMap.put(it.next(), new CheckRequestParamModel(str));
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new CheckRequestParamModel(str, (List) entry.getValue()));
            }
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZIZ(optionCheckUpdateParams, concurrentHashMap, hashMap);
        return LJIIJJI(c61276O3c, concurrentHashMap, optionCheckUpdateParams, c61523OCp);
    }
}
