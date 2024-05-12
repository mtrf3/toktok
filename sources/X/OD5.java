package X;

import Y.ARunnableS5S0101000_1;
import Y.IDComparatorS38S0000000_10;
import android.accounts.NetworkErrorException;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CombineComponentModel;
import com.bytedance.geckox.model.DeploymentModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OD5 extends AbstractC61551ODr<java.util.Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {
    public boolean LJI;
    public C61276O3c LJII;
    public java.util.Map<String, C61526OCs> LJIIIIZZ;
    public AbstractC61537ODd LJIIIZ;
    public InterfaceC61530OCw LJIIJ;
    public OptionCheckUpdateParams LJIIJJI;
    public EnumC61516OCi LJIIL;
    public File LJIILJJIL;
    public ODE LJIILL;
    public int LJIILLIIL;
    public final C61543ODj LJIILIIL = new C61543ODj();
    public int LJIIZILJ = -1;

    public final boolean LIZLLL() {
        if (!this.LJI && this.LJIIJJI.getInnerRequestByUser()) {
            return true;
        }
        return false;
    }

    public final void LJ() {
        java.util.Map<String, C61526OCs> map;
        if (this.LJI || (map = this.LJIIIIZZ) == null || this.LJIIIZ == null) {
            return;
        }
        for (Map.Entry<String, C61526OCs> entry : map.entrySet()) {
            String key = entry.getKey();
            DeploymentModel deploymentModel = entry.getValue().LIZIZ;
            if (deploymentModel != null) {
                Iterator<CheckRequestBodyModel.TargetChannel> it = deploymentModel.getTargetChannels().iterator();
                while (it.hasNext()) {
                    String str = it.next().channelName;
                    Long LJIILLIIL = C70657RoD.LJIILLIIL(key, str);
                    if (LJIILLIIL == null) {
                        return;
                    }
                    String LJIIIIZZ = C70657RoD.LJIIIIZZ(LJIILLIIL.longValue(), key, str);
                    LocalPackageModel localPackageModel = new LocalPackageModel(key, str);
                    localPackageModel.setChannelPath(LJIIIIZZ);
                    localPackageModel.setLatestVersion(LJIILLIIL.longValue());
                    this.LJIIIZ.LJIIIZ(localPackageModel);
                }
            }
        }
    }

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        boolean z;
        boolean z2 = false;
        boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
        this.LJI = booleanValue;
        this.LJII = (C61276O3c) objArr[1];
        this.LJIIIIZZ = (java.util.Map) objArr[2];
        this.LJIIIZ = (AbstractC61537ODd) objArr[3];
        this.LJIIJ = (InterfaceC61530OCw) objArr[4];
        if (booleanValue) {
            this.LJIIL = (EnumC61516OCi) objArr[5];
            this.LJIIJJI = new OptionCheckUpdateParams();
        } else {
            this.LJIIJJI = (OptionCheckUpdateParams) objArr[5];
        }
        this.LJIILLIIL = ((Integer) this.LJ.LIZJ("req_type")).intValue();
        Object LIZJ = this.LJ.LIZJ("original_req_type");
        if (LIZJ instanceof Integer) {
            this.LJIIZILJ = ((Integer) LIZJ).intValue();
        }
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        this.LJIILJJIL = c61532OCy.LJ.getRootDirectory();
        TreeMap treeMap = new TreeMap(new IDComparatorS38S0000000_10(0));
        for (Map.Entry<String, C61526OCs> entry : this.LJIIIIZZ.entrySet()) {
            String key = entry.getKey();
            C61526OCs value = entry.getValue();
            if (key != null && value != null) {
                treeMap.put(key, value.LIZIZ.getSortString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            if (str != null && str2 != null) {
                C1DI.LIZIZ(sb, str, "-", str2);
            }
        }
        String sb2 = sb.toString();
        ODE ode = new ODE();
        this.LJIILL = ode;
        ode.LIZIZ = new OEN(this.LJIILLIIL, this.LJIILIIL);
        if (this.LJIILLIIL == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJI || this.LJIIJJI.isEnableRetry()) {
            z2 = true;
        }
        ode.LIZJ = new ODK(z, z2, sb2, new OEP(this.LJII.LIZ(), this.LJ));
        if (LIZLLL()) {
            this.LJIILL.LIZ = new OED(this.LJIIJJI.isEnableThrottle(), sb2, this.LJIILIIL);
        }
    }

    public final String LIZJ(java.util.Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        C61532OCy c61532OCy = EBC.LIZ;
        checkRequestBodyModel.setCommon(c61532OCy.LIZLLL());
        java.util.Map<String, java.util.Map<String, OptionCheckUpdateParams.CustomValue>> map2 = c61532OCy.LIZIZ;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.LJIIIIZZ.keySet()) {
            hashMap3.put(str, this.LJIIIIZZ.get(str).LIZIZ);
            HashMap hashMap5 = new HashMap();
            if (map2 != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
                if (concurrentHashMap.get(str) != null) {
                    for (Map.Entry entry2 : ((java.util.Map) concurrentHashMap.get(str)).entrySet()) {
                        hashMap5.put(entry2.getKey(), ((OptionCheckUpdateParams.CustomValue) entry2.getValue()).getValue());
                    }
                }
            }
            if (hashMap5.get("business_version") == null) {
                C61532OCy c61532OCy2 = EBC.LIZ;
                c61532OCy2.LIZIZ();
                if (c61532OCy2.LJ != null) {
                    c61532OCy2.LIZIZ();
                    hashMap5.put("business_version", c61532OCy2.LJ.getAppVersion());
                } else {
                    hashMap5.put("business_version", this.LJII.LJIIIIZZ);
                }
            }
            if (this.LJIIIIZZ.get(str).LIZ != null) {
                hashMap5.putAll(this.LJIIIIZZ.get(str).LIZ);
            }
            hashMap4.put(str, hashMap5);
        }
        checkRequestBodyModel.setCustom(hashMap4);
        checkRequestBodyModel.setDeployments(hashMap3);
        CheckRequestBodyModel.RequestMeta requestMeta = new CheckRequestBodyModel.RequestMeta(this.LJIILLIIL);
        EnumC61516OCi enumC61516OCi = this.LJIIL;
        if (enumC61516OCi != null) {
            requestMeta.setCombineLevel(enumC61516OCi.name());
        }
        checkRequestBodyModel.setRequestMeta(requestMeta);
        return GsonProtectorUtils.toJson(OXZ.LIZIZ.LIZ, checkRequestBodyModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        OEI LIZ;
        List<UpdatePackage> arrayList;
        boolean z;
        String str;
        long j;
        java.util.Map<String, List<String>> map;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        GlobalConfigSettings LJFF;
        java.util.Map<String, UpdatePackage> map2;
        boolean z4;
        java.util.Map<String, ChannelMetaDataItem> map3;
        java.util.Map<? extends String, ? extends ChannelMetaDataItem> LIZJ;
        boolean z5;
        long longValue;
        CombineComponentModel combineComponentModel;
        boolean z6;
        java.util.Map<String, List<Pair<String, Long>>> map4 = (java.util.Map) obj;
        String str2 = "/gecko/server/v5/package";
        if (this.LJI) {
            str2 = "/gecko/server/v2/combine/check";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        String LJFF2 = JBR.LJFF(LIZ2, this.LJII.LJIIJ, str2, LIZ2);
        try {
            C61543ODj c61543ODj = this.LJIILIIL;
            c61543ODj.LIZLLL = this.LJIILLIIL;
            c61543ODj.LJI = "update_v5";
            if (this.LJI) {
                c61543ODj.LJI = "combine_v2";
            }
            String LIZJ2 = LIZJ(map4);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("start get server channel version: ");
            LIZ3.append(this.LJIILIIL.LJI);
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
            this.LJIILL.LIZ();
            InterfaceC61566OEg interfaceC61566OEg = this.LJII.LIZLLL;
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            if (geckoGlobalConfig != null) {
                InterfaceC61566OEg netWork = geckoGlobalConfig.getNetWork();
                if (netWork instanceof OEB) {
                    OEB oeb = (OEB) netWork;
                    GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = geckoGlobalConfig.getRequestTagHeaderProvider();
                    HashMap hashMap = new HashMap();
                    if (requestTagHeaderProvider != null) {
                        if (!LIZLLL()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Pair<String, String> requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(z6);
                        if (requestTagHeader != null) {
                            hashMap.put(requestTagHeader.first, requestTagHeader.second);
                        }
                    }
                    LIZ = oeb.doPost(LJFF2, LIZJ2, hashMap);
                } else {
                    LIZ = netWork.LIZ(LJFF2, LIZJ2);
                }
            } else {
                LIZ = interfaceC61566OEg.LIZ(LJFF2, LIZJ2);
            }
            C61543ODj c61543ODj2 = this.LJIILIIL;
            c61543ODj2.LIZJ = LIZ.LIZJ;
            c61543ODj2.LIZ = LIZ.LIZLLL;
            c61543ODj2.LIZIZ = C61543ODj.LIZ(LIZ.LIZ);
            OAH.LJI(this.LJII.LIZ, LIZ);
            if (!TextUtils.isEmpty(this.LJIILIIL.LIZIZ)) {
                OD6.LIZ = this.LJIILIIL.LIZIZ;
            }
            if (LIZ.LIZJ == 200) {
                this.LJIILL.LIZJ();
                String str3 = LIZ.LIZIZ;
                OC6.LIZ("gecko-debug-tag", "response,logId:", this.LJIILIIL.LIZIZ);
                try {
                    Response response = (Response) OXZ.LIZIZ.LIZ.LJII(str3, new OEY().getType());
                    InterfaceC61530OCw interfaceC61530OCw = this.LJIIJ;
                    if (interfaceC61530OCw != null && (combineComponentModel = (CombineComponentModel) response.data) != null) {
                        interfaceC61530OCw.LIZ(combineComponentModel.getGlobalConfig().getCheckUpdate());
                    }
                    int i3 = response.status;
                    if (i3 == 0) {
                        T t = response.data;
                        if (t != 0) {
                            C61461OAf.LIZ(this.LJIILLIIL, ((CombineComponentModel) t).getUniversalStrategies(), this.LJIILJJIL, this.LJIIIZ);
                            arrayList = ((CombineComponentModel) response.data).getPackages();
                            if (arrayList == null || arrayList.isEmpty()) {
                                LJ();
                                arrayList = new ArrayList<>();
                            } else {
                                HashMap hashMap2 = new HashMap();
                                for (UpdatePackage updatePackage : arrayList) {
                                    String accessKey = updatePackage.getAccessKey();
                                    List<Pair<String, Long>> list = map4.get(accessKey);
                                    String channel = updatePackage.getChannel();
                                    if (list != null) {
                                        for (Pair<String, Long> pair : list) {
                                            if (((String) pair.first).equals(channel)) {
                                                longValue = ((Long) pair.second).longValue();
                                                break;
                                            }
                                        }
                                    }
                                    longValue = 0;
                                    updatePackage.setLocalVersion(longValue);
                                    updatePackage.setLogId(this.LJIILIIL.LIZIZ);
                                    updatePackage.setApiVersion(this.LJIILIIL.LJI);
                                    updatePackage.setInitTime(SystemClock.uptimeMillis());
                                    List list2 = (List) hashMap2.get(accessKey);
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(updatePackage);
                                    hashMap2.put(accessKey, list2);
                                }
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    String str4 = (String) entry.getKey();
                                    List<UpdatePackage> list3 = (List) entry.getValue();
                                    if (list3 == null || list3.isEmpty()) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        HashMap hashMap3 = new HashMap();
                                        for (UpdatePackage updatePackage2 : list3) {
                                            java.util.Map<String, String> bizExtra = updatePackage2.getBizExtra();
                                            if (bizExtra == null || bizExtra.isEmpty()) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                String channel2 = updatePackage2.getChannel();
                                                o.LJFF(channel2, "updatePackage.channel");
                                                hashMap3.put(channel2, null);
                                            } else {
                                                String channel3 = updatePackage2.getChannel();
                                                o.LJFF(channel3, "updatePackage.channel");
                                                java.util.Map<String, String> bizExtra2 = updatePackage2.getBizExtra();
                                                o.LJFF(bizExtra2, "updatePackage.bizExtra");
                                                hashMap3.put(channel3, new ChannelMetaDataItem(bizExtra2));
                                            }
                                        }
                                        if (hashMap3.isEmpty()) {
                                            continue;
                                        } else {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            java.util.Map<String, java.util.Map<String, ChannelMetaDataItem>> map5 = C61510OCc.LIZIZ;
                                            synchronized (map5) {
                                                map3 = (java.util.Map) ((LinkedHashMap) map5).get(str4);
                                                if (map3 == null) {
                                                    map3 = new LinkedHashMap<>();
                                                    map5.put(str4, map3);
                                                }
                                            }
                                            synchronized (map3) {
                                                if (map3.isEmpty() && (LIZJ = C61510OCc.LIZJ(str4)) != null) {
                                                    map3.putAll(LIZJ);
                                                }
                                                C34K c34k = new C34K();
                                                c34k.element = false;
                                                for (Map.Entry entry2 : hashMap3.entrySet()) {
                                                    String str5 = (String) entry2.getKey();
                                                    ChannelMetaDataItem channelMetaDataItem = (ChannelMetaDataItem) entry2.getValue();
                                                    if (channelMetaDataItem == null) {
                                                        if (map3.remove(str5) != null) {
                                                            c34k.element = true;
                                                        }
                                                    } else {
                                                        map3.put(str5, channelMetaDataItem);
                                                        c34k.element = true;
                                                    }
                                                }
                                                if (c34k.element) {
                                                    C61510OCc.LIZIZ.put(str4, map3);
                                                    C61510OCc.LJ(str4);
                                                    OC6.LIZ("gecko-debug-tag", "update meta data cost:" + (System.currentTimeMillis() - currentTimeMillis), str4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            C61543ODj c61543ODj3 = this.LJIILIIL;
                            c61543ODj3.LIZ = "check update error：response.data==null";
                            OD6.LJ(c61543ODj3);
                            throw new C61578OEs("check update error：response.data==null");
                        }
                    } else if (i3 == 2000) {
                        LJ();
                        arrayList = new ArrayList<>();
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("check update error，unknown status code，response.status：");
                        LIZ4.append(response.status);
                        String LIZIZ = X1D.LIZIZ(LIZ4);
                        C61543ODj c61543ODj4 = this.LJIILIIL;
                        c61543ODj4.LIZ = LIZIZ;
                        OD6.LJ(c61543ODj4);
                        throw new C61578OEs(LIZIZ);
                    }
                    if (!LIZLLL() && arrayList.size() != 0 && (LJFF = EBC.LIZ.LJFF()) != null && LJFF.getReqMeta() != null && LJFF.getReqMeta().getLazy() != null) {
                        java.util.Map<String, GlobalConfigSettings.LazyItem> lazy = LJFF.getReqMeta().getLazy();
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            UpdatePackage updatePackage3 = (UpdatePackage) ListProtector.get(arrayList, size);
                            String accessKey2 = updatePackage3.getAccessKey();
                            if (lazy.containsKey(accessKey2)) {
                                GlobalConfigSettings.LazyItem lazyItem = lazy.get(accessKey2);
                                String groupName = updatePackage3.getGroupName();
                                String channel4 = updatePackage3.getChannel();
                                if ((!TextUtils.isEmpty(groupName) && lazyItem.getGroups() != null && lazyItem.getGroups().contains(groupName)) || ((map2 = C61466OAk.LIZIZ) != null && ((ConcurrentHashMap) map2).containsKey(a1.LJ(accessKey2, "-", channel4)))) {
                                    String LJ = a1.LJ(accessKey2, "-", groupName);
                                    if (C61466OAk.LIZJ == null) {
                                        C61466OAk.LIZJ = new ConcurrentHashMap();
                                    }
                                    ((ConcurrentHashMap) C61466OAk.LIZJ).put(LJ, updatePackage3);
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append(accessKey2);
                                    LIZ5.append("-");
                                    LIZ5.append(channel4);
                                    String LIZIZ2 = X1D.LIZIZ(LIZ5);
                                    if (C61466OAk.LIZIZ == null) {
                                        C61466OAk.LIZIZ = new ConcurrentHashMap();
                                    }
                                    ((ConcurrentHashMap) C61466OAk.LIZIZ).put(LIZIZ2, updatePackage3);
                                    ListProtector.remove(arrayList, size);
                                } else if (lazyItem.getChannels() != null && lazyItem.getChannels().contains(channel4)) {
                                    String LJ2 = a1.LJ(accessKey2, "-", channel4);
                                    if (C61466OAk.LIZIZ == null) {
                                        C61466OAk.LIZIZ = new ConcurrentHashMap();
                                    }
                                    ((ConcurrentHashMap) C61466OAk.LIZIZ).put(LJ2, updatePackage3);
                                    ListProtector.remove(arrayList, size);
                                }
                            }
                        }
                    }
                    boolean LIZLLL = LIZLLL();
                    if (arrayList.size() != 0) {
                        boolean isExpireCleanGroup = this.LJIIJJI.isExpireCleanGroup();
                        java.util.Map<String, List<String>> map6 = C61571OEl.LIZ.LJ;
                        if (map6 == null || map6.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            ListIterator<UpdatePackage> listIterator = arrayList.listIterator();
                            while (listIterator.hasNext()) {
                                UpdatePackage next = listIterator.next();
                                String accessKey3 = next.getAccessKey();
                                java.util.Map<String, List<String>> map7 = C61571OEl.LIZ.LJ;
                                if (map7.keySet().contains(accessKey3)) {
                                    List<String> list4 = map7.get(accessKey3);
                                    o.LJFF(accessKey3, "accessKey");
                                    ConcurrentHashMap LJI = C61511OCd.LJI(accessKey3);
                                    if (LJI != null) {
                                        String channel5 = next.getChannel();
                                        if (LJI.get(channel5) == null) {
                                            j = currentTimeMillis2;
                                            MetaDataItemNew metaDataItemNew = new MetaDataItemNew(currentTimeMillis2, false, 2, null);
                                            o.LJFF(channel5, "channel");
                                            LJI.put(channel5, metaDataItemNew);
                                            ((ArrayList) C61511OCd.LJFF).add(C00F.LIZIZ(accessKey3, '-', channel5));
                                            ((ConcurrentHashMap) C61511OCd.LIZJ).put(accessKey3, Boolean.TRUE);
                                        } else {
                                            j = currentTimeMillis2;
                                            MetaDataItemNew metaDataItemNew2 = (MetaDataItemNew) LJI.get(channel5);
                                            if (metaDataItemNew2 != null && metaDataItemNew2.getAllowUpdate()) {
                                                ((ArrayList) C61511OCd.LJFF).add(C00F.LIZIZ(accessKey3, '-', channel5));
                                            } else if (list4 == null || !list4.contains(channel5)) {
                                                if (LIZLLL) {
                                                    OD6.LJI(4, accessKey3, 48, channel5);
                                                }
                                                ((ConcurrentHashMap) C61511OCd.LJ).put(C00F.LIZIZ(accessKey3, '-', channel5), next);
                                                listIterator.remove();
                                            }
                                        }
                                        currentTimeMillis2 = j;
                                    }
                                }
                                j = currentTimeMillis2;
                                currentTimeMillis2 = j;
                            }
                        } else {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            ListIterator<UpdatePackage> listIterator2 = arrayList.listIterator();
                            while (listIterator2.hasNext()) {
                                UpdatePackage next2 = listIterator2.next();
                                String accessKey4 = next2.getAccessKey();
                                java.util.Map<String, String> map8 = C61571OEl.LIZ.LIZJ;
                                if (map8 != null) {
                                    str = map8.get(accessKey4);
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    o.LJFF(accessKey4, "accessKey");
                                    ConcurrentHashMap LJI2 = C61511OCd.LJI(accessKey4);
                                    if (LJI2 != null) {
                                        String channel6 = next2.getChannel();
                                        if (o.LJ(str, next2.getGroupName()) || isExpireCleanGroup) {
                                            if (LJI2.get(channel6) == null) {
                                                MetaDataItemNew metaDataItemNew3 = new MetaDataItemNew(currentTimeMillis3, false, 2, null);
                                                o.LJFF(channel6, "channel");
                                                LJI2.put(channel6, metaDataItemNew3);
                                                ((ArrayList) C61511OCd.LJFF).add(C00F.LIZIZ(accessKey4, '-', channel6));
                                                ((ConcurrentHashMap) C61511OCd.LIZJ).put(accessKey4, Boolean.TRUE);
                                            } else {
                                                MetaDataItemNew metaDataItemNew4 = (MetaDataItemNew) LJI2.get(channel6);
                                                if (metaDataItemNew4 != null && metaDataItemNew4.getAllowUpdate()) {
                                                    ((ArrayList) C61511OCd.LJFF).add(C00F.LIZIZ(accessKey4, '-', channel6));
                                                } else {
                                                    if (LIZLLL) {
                                                        OD6.LJI(4, accessKey4, 48, channel6);
                                                    }
                                                    ((ConcurrentHashMap) C61511OCd.LJ).put(C00F.LIZIZ(accessKey4, '-', channel6), next2);
                                                    listIterator2.remove();
                                                }
                                            }
                                        } else if (LJI2.get(channel6) == null) {
                                            continue;
                                        } else {
                                            if (ORY.LJJIJIIJIL(next2.getGroupName(), C61511OCd.LJI)) {
                                                Object obj2 = LJI2.get(channel6);
                                                if (obj2 != null) {
                                                    if (!((MetaDataItemNew) obj2).getAllowUpdate()) {
                                                        ((ConcurrentHashMap) C61511OCd.LJ).put(C00F.LIZIZ(accessKey4, '-', channel6), next2);
                                                        listIterator2.remove();
                                                    }
                                                } else {
                                                    o.LJIIZILJ();
                                                    throw null;
                                                }
                                            }
                                            if (!((ArrayList) C61511OCd.LJFF).contains(C00F.LIZIZ(accessKey4, '-', channel6))) {
                                                LJI2.remove(channel6);
                                                ((ConcurrentHashMap) C61511OCd.LIZJ).put(accessKey4, Boolean.TRUE);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    int i4 = this.LJIILLIIL;
                    if (i4 == 6 || (i2 = this.LJIIZILJ) == 6 || i4 == 7 || i2 == 7 || i4 == 3 || i2 == 3) {
                        if (i4 != 3) {
                            if (i4 != 6 && i4 != 7) {
                                map = null;
                            } else {
                                C61532OCy c61532OCy2 = EBC.LIZ;
                                o.LJFF(c61532OCy2, "GeckoGlobalManager.inst()");
                                map = c61532OCy2.LJIILIIL;
                            }
                        } else {
                            C61532OCy c61532OCy3 = EBC.LIZ;
                            o.LJFF(c61532OCy3, "GeckoGlobalManager.inst()");
                            map = c61532OCy3.LJIILJJIL;
                        }
                        if (map == null || map.isEmpty()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ArrayList arrayList2 = new ArrayList();
                            for (UpdatePackage updatePackage4 : arrayList) {
                                UpdatePackage updatePackage5 = updatePackage4;
                                List<String> list5 = map.get(updatePackage5.getAccessKey());
                                if (list5 != null && list5.contains(updatePackage5.getChannel())) {
                                    if (linkedHashMap.get(updatePackage5.getAccessKey()) == null) {
                                        String accessKey5 = updatePackage5.getAccessKey();
                                        o.LJFF(accessKey5, "updatePackage.accessKey");
                                        linkedHashMap.put(accessKey5, new ArrayList());
                                    }
                                    List list6 = (List) linkedHashMap.get(updatePackage5.getAccessKey());
                                    if (list6 != null) {
                                        String channel7 = updatePackage5.getChannel();
                                        o.LJFF(channel7, "updatePackage.channel");
                                        list6.add(channel7);
                                    }
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    arrayList2.add(updatePackage4);
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                if (i4 == 3 || (i4 != 6 && i4 != 7)) {
                                    i = 24;
                                } else {
                                    i = 22;
                                }
                                AsyncTask.THREAD_POOL_EXECUTOR.execute(new ARunnableS5S0101000_1(linkedHashMap, i, 18));
                            }
                            arrayList = arrayList2;
                        }
                    }
                    return c61548ODo.LJ(arrayList);
                } catch (Exception e) {
                    C61543ODj c61543ODj5 = this.LJIILIIL;
                    StringBuilder LIZ6 = X1D.LIZ();
                    c61543ODj5.LIZ = KMP.LJFF(LIZ6, "json parse failed：", e, LIZ6);
                    OD6.LJ(this.LJIILIIL);
                    StringBuilder LIZIZ3 = C25620zW.LIZIZ("json parse failed：", str3, " caused by:");
                    LIZIZ3.append(e.getMessage());
                    throw new C61567OEh(X1D.LIZIZ(LIZIZ3), e);
                }
            }
            this.LJIILL.LIZIZ();
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("net work get failed, code: ");
            LIZ7.append(LIZ.LIZJ);
            LIZ7.append(", url:");
            LIZ7.append(LJFF2);
            throw new NetworkErrorException(X1D.LIZIZ(LIZ7));
        } catch (C36356EOq e2) {
            OD6.LJ(this.LJIILIIL);
            throw e2;
        } catch (IOException e3) {
            this.LJIILL.LIZIZ();
            this.LJIILIIL.LIZ = e3.getMessage();
            OD6.LJ(this.LJIILIIL);
            throw e3;
        } catch (Exception e4) {
            OD6.LJ(this.LJIILIIL);
            StringBuilder LIZIZ4 = C25620zW.LIZIZ("request failed：url:", LJFF2, ", caused by:");
            LIZIZ4.append(e4.getMessage());
            throw new C61568OEi(X1D.LIZIZ(LIZIZ4), e4);
        }
    }
}
