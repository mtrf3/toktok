package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.data.HybridABApi;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FH4 implements InterfaceC35627DyZ, C0WP {
    public static volatile boolean LJLIL;

    @Override // X.C0WP
    public List LJIIZILJ(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        C0TX.LIZ.LIZJ("Sticker");
        C0TX.LIZLLL("perform sticker's process.");
        Iterator it = effectPanelList.iterator();
        while (it.hasNext()) {
            int i = 0;
            for (Object obj : ((C1QC) it.next()).LJLILLLLZI) {
                int i2 = i + 1;
                List<String> list = null;
                if (i >= 0) {
                    LiveEffect liveEffect = (LiveEffect) obj;
                    boolean LIZ = C1KJ.LIZ.LIZ(liveEffect);
                    liveEffect.isDownloaded = LIZ;
                    if (LIZ) {
                        BQO LIZ2 = C15650jR.LIZ();
                        UrlModel urlModel = liveEffect.icon;
                        if (urlModel != null) {
                            list = urlModel.urlList;
                        }
                        LIZ2.LIZ(list).LJIILL();
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return effectPanelList;
    }

    @Override // X.InterfaceC35627DyZ
    public void LIZ(java.util.Map map, java.util.Map map2) {
        String LJI;
        m mVar;
        ConfigItem configItem;
        j LJJIJ;
        j LJJIJ2;
        j LJJIJ3;
        j LJJIJ4;
        j LJJIJ5;
        p LJJIJL;
        int i;
        j LJJIJ6;
        p LJJIJL2;
        boolean z;
        j LJJIJ7;
        if ((map == null || map.isEmpty()) && (map2 == null || map2.isEmpty())) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                java.util.Map map3 = (java.util.Map) entry.getValue();
                String msg = a1.LJ("parse and save ", str, " value");
                o.LJIIIZ(msg, "msg");
                j jsonTree = GsonProtectorUtils.toJsonTree(C75792yF.LIZIZ(), entry.getValue());
                if (jsonTree instanceof m) {
                    mVar = (m) jsonTree;
                } else {
                    mVar = null;
                }
                if (str != null) {
                    str.isEmpty();
                }
                for (Map.Entry entry2 : ((HashMap) KUZ.LIZ).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    ConfigItem configItem2 = (ConfigItem) entry2.getValue();
                    if (configItem2.isHybrid) {
                        FHC LIZIZ = FHC.LIZIZ();
                        if (str2 != null) {
                            ((ConcurrentHashMap) LIZIZ.LIZIZ).remove(str2);
                        } else {
                            LIZIZ.getClass();
                        }
                        try {
                            m LJJIJIL = mVar.LJJIJIL(str2);
                            if (LJJIJIL != null && (LJJIJ7 = LJJIJIL.LJJIJ("vid")) != null && !(LJJIJ7 instanceof l)) {
                                String LJJIFFI = LJJIJ7.LJJIFFI();
                                if (str2 != null) {
                                    String LIZJ = C38705FGz.LIZJ(str2);
                                    FHK fhk = FHK.LIZJ;
                                    fhk.getClass();
                                    fhk.LIZ.LIZIZ(LIZJ, LJJIFFI);
                                }
                            } else if (mVar.LJJIJLIJ(str2) && str2 != null) {
                                String LIZJ2 = C38705FGz.LIZJ(str2);
                                FHK fhk2 = FHK.LIZJ;
                                fhk2.getClass();
                                fhk2.LIZ.LIZIZ(LIZJ2, null);
                            }
                        } catch (Throwable th) {
                            FII.LIZJ(th, "  , key: ", str2);
                        }
                        switch (FHZ.LIZ[configItem2.type.ordinal()]) {
                            case 1:
                                try {
                                    m LJJIJIL2 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL2 != null && (LJJIJL2 = LJJIJIL2.LJJIJL("val")) != null) {
                                        if (LJJIJL2.LJLIL instanceof Number) {
                                            FHK fhk3 = FHK.LIZJ;
                                            fhk3.getClass();
                                            if (LJJIJL2.LJIILJJIL() != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            fhk3.LIZ.LJI(str2, z);
                                            break;
                                        } else {
                                            FHK fhk4 = FHK.LIZJ;
                                            fhk4.getClass();
                                            fhk4.LIZ.LJI(str2, LJJIJL2.LJFF());
                                            break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    FII.LIZJ(th2, "  , key: ", str2);
                                    break;
                                }
                                break;
                            case 2:
                                try {
                                    m LJJIJIL3 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL3 != null && (LJJIJL = LJJIJIL3.LJJIJL("val")) != null) {
                                        if (LJJIJL.LJLIL instanceof Boolean) {
                                            FHK fhk5 = FHK.LIZJ;
                                            fhk5.getClass();
                                            if (LJJIJL.LJFF()) {
                                                i = 1;
                                            } else {
                                                i = 0;
                                            }
                                            fhk5.LIZ.LIZLLL(str2, i);
                                            break;
                                        } else {
                                            FHK fhk6 = FHK.LIZJ;
                                            fhk6.getClass();
                                            fhk6.LIZ.LIZLLL(str2, LJJIJL.LJIILJJIL());
                                            break;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    FII.LIZJ(th3, "  , key: ", str2);
                                    break;
                                }
                                break;
                            case 3:
                                try {
                                    m LJJIJIL4 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL4 != null && (LJJIJ4 = LJJIJIL4.LJJIJ("val")) != null && !(LJJIJ4 instanceof l)) {
                                        FHK fhk7 = FHK.LIZJ;
                                        fhk7.getClass();
                                        fhk7.LIZ.LIZJ(str2, LJJIJ4.LJIJJLI());
                                        break;
                                    }
                                } catch (Throwable th4) {
                                    FII.LIZJ(th4, "  , key: ", str2);
                                    break;
                                }
                                break;
                            case 4:
                                try {
                                    m LJJIJIL5 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL5 != null && (LJJIJ6 = LJJIJIL5.LJJIJ("val")) != null && !(LJJIJ6 instanceof l)) {
                                        FHK fhk8 = FHK.LIZJ;
                                        fhk8.getClass();
                                        fhk8.LIZ.LJ(str2, LJJIJ6.LJIIIZ());
                                        break;
                                    }
                                } catch (Throwable th5) {
                                    FII.LIZJ(th5, "  , key: ", str2);
                                    break;
                                }
                                break;
                            case 5:
                                try {
                                    m LJJIJIL6 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL6 != null && (LJJIJ2 = LJJIJIL6.LJJIJ("val")) != null && !(LJJIJ2 instanceof l)) {
                                        FHK fhk9 = FHK.LIZJ;
                                        fhk9.getClass();
                                        fhk9.LIZ.LJII(str2, LJJIJ2.LJIIJ());
                                        break;
                                    }
                                } catch (Throwable th6) {
                                    FII.LIZJ(th6, "  , key: ", str2);
                                    break;
                                }
                                break;
                            case 6:
                                try {
                                    m LJJIJIL7 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL7 != null && (LJJIJ5 = LJJIJIL7.LJJIJ("val")) != null && !(LJJIJ5 instanceof l)) {
                                        FHK fhk10 = FHK.LIZJ;
                                        fhk10.getClass();
                                        fhk10.LIZ.LIZIZ(str2, LJJIJ5.LJJIFFI());
                                        break;
                                    } else if (mVar.LJJIJLIJ(str2)) {
                                        FHK fhk11 = FHK.LIZJ;
                                        fhk11.getClass();
                                        fhk11.LIZ.LIZIZ(str2, null);
                                        break;
                                    } else {
                                        break;
                                    }
                                } catch (Throwable th7) {
                                    FII.LIZJ(th7, "  , key: ", str2);
                                    break;
                                }
                            case 7:
                                try {
                                    m LJJIJIL8 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL8 != null && (LJJIJ = LJJIJIL8.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                                        FHK fhk12 = FHK.LIZJ;
                                        if (fhk12.LIZIZ == null) {
                                            fhk12.LIZIZ = new Gson();
                                        }
                                        fhk12.LIZ.LJIIIZ(str2, (String[]) fhk12.LIZIZ.LIZJ(LJJIJ, String[].class));
                                        break;
                                    } else if (mVar.LJJIJLIJ(str2)) {
                                        FHK fhk13 = FHK.LIZJ;
                                        fhk13.getClass();
                                        fhk13.LIZ.LJIIIZ(str2, null);
                                        break;
                                    } else {
                                        break;
                                    }
                                } catch (Throwable th8) {
                                    FII.LIZJ(th8, "  , key: ", str2);
                                    break;
                                }
                                break;
                            default:
                                try {
                                    m LJJIJIL9 = mVar.LJJIJIL(str2);
                                    if (LJJIJIL9 != null && (LJJIJ3 = LJJIJIL9.LJJIJ("val")) != null && !(LJJIJ3 instanceof l)) {
                                        FHK fhk14 = FHK.LIZJ;
                                        fhk14.getClass();
                                        fhk14.LIZ.LIZIZ(str2, LJJIJ3.toString());
                                        break;
                                    } else if (mVar.LJJIJLIJ(str2)) {
                                        FHK fhk15 = FHK.LIZJ;
                                        fhk15.getClass();
                                        fhk15.LIZ.LIZIZ(str2, null);
                                        break;
                                    } else {
                                        break;
                                    }
                                } catch (Throwable th9) {
                                    FII.LIZJ(th9, "  , key: ", str2);
                                    break;
                                }
                        }
                    }
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    HybridABApi.HybridABConfig hybridABConfig = (HybridABApi.HybridABConfig) hashMap.get(entry3.getKey());
                    if (hybridABConfig != null && o.LJ(hybridABConfig.vid, ((HybridABApi.HybridABConfig) entry3.getValue()).vid)) {
                        hashMap.remove(entry3.getKey());
                    }
                }
                java.util.Map<String, ConfigItem> preciseConfigMap = KUZ.LIZIZ;
                java.util.Map<String, ConfigItem> map4 = KUZ.LIZ;
                for (Map.Entry entry4 : map3.entrySet()) {
                    String str3 = (String) entry4.getKey();
                    HybridABApi.HybridABConfig hybridABConfig2 = (HybridABApi.HybridABConfig) entry4.getValue();
                    java.util.Set<String> set = E6T.LIZJ;
                    String str4 = hybridABConfig2.vid;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    set.add(str4);
                    o.LJIIIIZZ(preciseConfigMap, "preciseConfigMap");
                    HashMap hashMap2 = (HashMap) preciseConfigMap;
                    if (!hashMap2.containsKey(str3)) {
                        java.util.Set<String> set2 = E6T.LIZLLL;
                        String str6 = hybridABConfig2.vid;
                        if (str6 == null) {
                            str6 = "";
                        }
                        set2.add(str6);
                    }
                    if (!hashMap2.containsKey(str3) && (configItem = (ConfigItem) ((HashMap) map4).get(str3)) != null && configItem.isHybrid && !FH0.LIZ(str3)) {
                        C38682FGc.LIZ.LIZ(hybridABConfig2.vid, false);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("full expose ");
                        LIZ.append(str3);
                        LIZ.append(" vid:");
                        LIZ.append(hybridABConfig2.vid);
                        String msg2 = X1D.LIZIZ(LIZ);
                        o.LJIIIZ(msg2, "msg");
                        java.util.Set<String> set3 = E6T.LJ;
                        String str7 = hybridABConfig2.vid;
                        if (str7 != null) {
                            str5 = str7;
                        }
                        set3.add(str5);
                    } else if (!hashMap2.containsKey(str3)) {
                        java.util.Set<String> set4 = E6T.LJFF;
                        String str8 = hybridABConfig2.vid;
                        if (str8 != null) {
                            str5 = str8;
                        }
                        set4.add(str5);
                    }
                }
            }
        }
        for (Map.Entry entry5 : hashMap.entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("close experiment ");
            LIZ2.append(((HybridABApi.HybridABConfig) C1FJ.LIZJ(LIZ2, (String) entry5.getKey(), " : ", entry5)).vid);
            String msg3 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg3, "msg");
            String str9 = (String) entry5.getKey();
            String str10 = ((HybridABApi.HybridABConfig) entry5.getValue()).vid;
            if (str10 != null) {
                if (str9 == null) {
                    LJI = null;
                } else {
                    LJI = FHK.LIZJ.LJI(C38705FGz.LIZJ(str9), null);
                }
                if (str10.equals(LJI)) {
                    C38705FGz.LIZ(str9);
                    if (str9 != null) {
                        C38705FGz.LIZ(C38705FGz.LIZJ(str9));
                    }
                    FHC.LIZIZ().LIZLLL(str9);
                }
            }
            String str11 = ((HybridABApi.HybridABConfig) entry5.getValue()).vid;
            C38701FGv c38701FGv = C38682FGc.LIZ;
            c38701FGv.getClass();
            List<String> LIZJ3 = C38701FGv.LIZJ(str11);
            if (LIZJ3 != null) {
                ((EAB) c38701FGv.LIZJ.getValue()).LJ(LIZJ3);
                EAB LIZIZ2 = c38701FGv.LIZIZ();
                if (LIZIZ2 != null) {
                    LIZIZ2.LJ(LIZJ3);
                }
                FH1.LJI.getClass();
                FH1.LIZLLL();
            }
        }
    }
}
