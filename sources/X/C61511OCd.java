package X;

import Y.ARunnableS46S0100000_10;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.MetaDataItem;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.OCd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61511OCd {
    public static final String[] LJI;
    public static final C61511OCd LJII = new C61511OCd();
    public static final java.util.Map<String, ConcurrentHashMap<String, MetaDataItemNew>> LIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, File> LIZIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, Boolean> LIZJ = new ConcurrentHashMap();
    public static final OE6 LIZLLL = new OE6("meta-timer-task");
    public static final java.util.Map<String, UpdatePackage> LJ = new ConcurrentHashMap();
    public static final List<String> LJFF = new ArrayList();

    public final synchronized void LJIIJJI() {
        ObjectOutputStream objectOutputStream;
        for (Map.Entry entry : ((ConcurrentHashMap) LIZJ).entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                java.util.Map<String, ConcurrentHashMap<String, MetaDataItemNew>> map = LIZ;
                if (((ConcurrentHashMap) map).get(str) != null) {
                    ((ConcurrentHashMap) LIZJ).put(str, Boolean.FALSE);
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            if (!LIZ(str)) {
                                LIZLLL(str);
                            }
                            objectOutputStream = new ObjectOutputStream(new FileOutputStream((File) ((ConcurrentHashMap) LIZIZ).get(str)));
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = null;
                    }
                    try {
                        objectOutputStream.writeObject(((ConcurrentHashMap) map).get(str));
                        StringBuilder LIZ2 = X1D.LIZ();
                        C61532OCy c61532OCy = EBC.LIZ;
                        o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                        c61532OCy.LIZIZ();
                        GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
                        o.LJFF(geckoGlobalConfig, "GeckoGlobalManager.inst().globalConfig");
                        LIZ2.append(geckoGlobalConfig.getRootDirectoryPath());
                        String str2 = File.separator;
                        LIZ2.append(str2);
                        LIZ2.append(str);
                        LIZ2.append(str2);
                        LIZ2.append("metaData.json");
                        C61467OAl.LIZJ(new File(X1D.LIZIZ(LIZ2)));
                        C78609UtB.LJJIIZI(objectOutputStream);
                    } catch (Exception e2) {
                        e = e2;
                        objectOutputStream2 = objectOutputStream;
                        OC6.LIZ("gecko-debug-tag", "MetaDataManager: writeToMetaData occurs exception", e);
                        C78609UtB.LJJIIZI(objectOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        C78609UtB.LJJIIZI(objectOutputStream);
                        throw th;
                    }
                }
            }
        }
    }

    static {
        new AtomicBoolean(false);
        LJI = new String[]{"lv_1", "lv_2", "lv_3"};
    }

    public static void LJII() {
        java.util.Set<String> set;
        AppSettingsManager appSettingsManager = C61571OEl.LIZ;
        java.util.Map<String, String> map = appSettingsManager.LIZJ;
        java.util.Set<String> set2 = null;
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        java.util.Map<String, List<String>> map2 = appSettingsManager.LJ;
        if (map2 != null) {
            set2 = map2.keySet();
        }
        if (set == null || set.isEmpty()) {
            set = set2;
        } else if (set2 != null && !set2.isEmpty()) {
            set = F5P.LJIIJJI(set2, set);
        }
        if (set != null) {
            LIZLLL.LIZIZ(new C61512OCe(set), 0L, 0L);
        }
        C61513OCf c61513OCf = new C61513OCf();
        long j = appSettingsManager.LJIIIIZZ;
        if (j <= 0) {
            j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        }
        LIZLLL.LIZIZ(c61513OCf, 2000L, j);
    }

    public static boolean LIZ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (concurrentHashMap.get(str) != null) {
            return true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        C61532OCy c61532OCy = EBC.LIZ;
        o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
        c61532OCy.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
        o.LJFF(geckoGlobalConfig, "GeckoGlobalManager.inst().globalConfig");
        LIZ2.append(geckoGlobalConfig.getRootDirectoryPath());
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, str, str2, "metaDataNew.json");
        File file = new File(X1D.LIZIZ(LIZ2));
        if (file.exists()) {
            concurrentHashMap.put(str, file);
            return true;
        }
        return false;
    }

    public static void LIZLLL(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        C61532OCy c61532OCy = EBC.LIZ;
        o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
        c61532OCy.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
        o.LJFF(geckoGlobalConfig, "GeckoGlobalManager.inst().globalConfig");
        LIZ2.append(geckoGlobalConfig.getRootDirectoryPath());
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, str, str2, "metaDataNew.json");
        File file = new File(X1D.LIZIZ(LIZ2));
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        ((ConcurrentHashMap) LIZIZ).put(str, file);
    }

    public static String LJ(String str) {
        boolean z;
        ConcurrentHashMap LJI2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (LJI2 = LJI(str)) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : LJI2.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!((MetaDataItemNew) entry.getValue()).getAllowUpdate()) {
                sb.append(",");
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "sb.toString()");
        return sb2;
    }

    public static int LJFF(String str) {
        ConcurrentHashMap LJI2;
        if (str == null || str.length() == 0 || (LJI2 = LJI(str)) == null) {
            return 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LJI2.entrySet()) {
            if (!((MetaDataItemNew) entry.getValue()).getAllowUpdate()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777499), block:B:53:0x011b */
    public static ConcurrentHashMap LJI(String accessKey) {
        java.util.Set<String> keySet;
        ConcurrentHashMap LJIIIIZZ;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        java.util.Set<String> keySet2;
        o.LJIIJ(accessKey, "accessKey");
        AppSettingsManager appSettingsManager = C61571OEl.LIZ;
        java.util.Map<String, String> map = appSettingsManager.LIZJ;
        java.util.Map<String, List<String>> map2 = appSettingsManager.LJ;
        ObjectInputStream objectInputStream3 = null;
        Object obj = null;
        Object obj2 = null;
        objectInputStream3 = null;
        if ((map == null || (keySet2 = map.keySet()) == null || !keySet2.contains(accessKey)) && (map2 == null || (keySet = map2.keySet()) == null || !keySet.contains(accessKey))) {
            return null;
        }
        java.util.Map<String, ConcurrentHashMap<String, MetaDataItemNew>> map3 = LIZ;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) map3).get(accessKey);
        if (concurrentHashMap != null) {
            return concurrentHashMap;
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
        } catch (Exception e2) {
            e = e2;
            objectInputStream3 = objectInputStream;
            OD6.LJI(4, e.getMessage(), 49, "");
            LJIIIIZZ = LJIIIIZZ(accessKey);
            C78609UtB.LJJIIZI(objectInputStream3);
            return LJIIIIZZ;
        } catch (Throwable th2) {
            th = th2;
            C78609UtB.LJJIIZI(null);
            throw th;
        }
        if (LIZ(accessKey)) {
            Object obj3 = ((ConcurrentHashMap) LIZIZ).get(accessKey);
            if (obj3 != null) {
                objectInputStream2 = new ObjectInputStream(new FileInputStream((File) obj3));
                Object readObject = objectInputStream2.readObject();
                if (readObject instanceof ConcurrentHashMap) {
                    obj = readObject;
                }
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) obj;
                if (concurrentHashMap2 != null) {
                    ((ConcurrentHashMap) map3).put(accessKey, concurrentHashMap2);
                    LJIIIIZZ = concurrentHashMap2;
                } else {
                    ConcurrentHashMap LJIIIIZZ2 = LJIIIIZZ(accessKey);
                    C78609UtB.LJJIIZI(objectInputStream2);
                    return LJIIIIZZ2;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            o.LJFF(geckoGlobalConfig, "GeckoGlobalManager.inst().globalConfig");
            LIZ2.append(geckoGlobalConfig.getRootDirectoryPath());
            String str = File.separator;
            LIZ2.append(str);
            LIZ2.append(accessKey);
            LIZ2.append(str);
            LIZ2.append("metaData.json");
            File file = new File(X1D.LIZIZ(LIZ2));
            if (file.exists()) {
                OD6.LJI(4, accessKey, 51, "");
                objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
                LJIIIIZZ = new ConcurrentHashMap();
                Object readObject2 = objectInputStream2.readObject();
                if (readObject2 instanceof ConcurrentHashMap) {
                    obj2 = readObject2;
                }
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) obj2;
                if (concurrentHashMap3 != null) {
                    for (Map.Entry entry : concurrentHashMap3.entrySet()) {
                        String str2 = (String) entry.getKey();
                        MetaDataItem metaDataItem = (MetaDataItem) entry.getValue();
                        LJIIIIZZ.put(str2, new MetaDataItemNew(metaDataItem.getLastReadTimeStamp(), metaDataItem.getAllowUpdate()));
                    }
                    ((ConcurrentHashMap) LIZJ).put(accessKey, Boolean.TRUE);
                } else {
                    ConcurrentHashMap LJIIIIZZ3 = LJIIIIZZ(accessKey);
                    C78609UtB.LJJIIZI(objectInputStream2);
                    return LJIIIIZZ3;
                }
            } else {
                LJIIIIZZ = LJIIIIZZ(accessKey);
                C78609UtB.LJJIIZI(objectInputStream3);
                return LJIIIIZZ;
            }
        }
        objectInputStream3 = objectInputStream2;
        C78609UtB.LJJIIZI(objectInputStream3);
        return LJIIIIZZ;
    }

    public static ConcurrentHashMap LJIIIIZZ(String str) {
        C61467OAl.LIZJ((File) ((ConcurrentHashMap) LIZIZ).get(str));
        StringBuilder LIZ2 = X1D.LIZ();
        C61532OCy c61532OCy = EBC.LIZ;
        o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
        c61532OCy.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
        o.LJFF(geckoGlobalConfig, "GeckoGlobalManager.inst().globalConfig");
        LIZ2.append(geckoGlobalConfig.getRootDirectoryPath());
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, str, str2, "metaData.json");
        C61467OAl.LIZJ(new File(X1D.LIZIZ(LIZ2)));
        java.util.Map<String, ArrayList<String>> map = C61571OEl.LIZ.LIZLLL;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ((ConcurrentHashMap) LIZ).put(str, concurrentHashMap);
        if (map != null && map.get(str) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<String> arrayList = map.get(str);
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String channel = it.next();
                    MetaDataItemNew metaDataItemNew = new MetaDataItemNew(currentTimeMillis, false, 2, null);
                    o.LJFF(channel, "channel");
                    concurrentHashMap.put(channel, metaDataItemNew);
                }
                ((ConcurrentHashMap) LIZJ).put(str, Boolean.TRUE);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return concurrentHashMap;
    }

    public static boolean LJIIIZ(String str, String str2) {
        ConcurrentHashMap LJI2;
        MetaDataItemNew metaDataItemNew;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && (LJI2 = LJI(str)) != null && (metaDataItemNew = (MetaDataItemNew) LJI2.get(str2)) != null && !metaDataItemNew.getAllowUpdate()) {
            return true;
        }
        return false;
    }

    public static long LIZIZ(boolean z, long j, int i, int i2, boolean z2, int i3) {
        C61511OCd c61511OCd = LJII;
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        long j2 = 0;
        for (Map.Entry entry : ((ConcurrentHashMap) LIZ).entrySet()) {
            j2 += LIZJ((String) entry.getKey(), (ConcurrentHashMap) entry.getValue(), j, z, i, i2);
        }
        if (z2) {
            c61511OCd.LJIIJJI();
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r0.contains(r14) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZJ(java.lang.String r18, java.util.Map r19, long r20, boolean r22, int r23, int r24) {
        /*
            java.io.File r2 = new java.io.File
            X.OCy r1 = X.EBC.LIZ
            java.lang.String r0 = "GeckoGlobalManager.inst()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            r1.LIZIZ()
            com.bytedance.geckox.GeckoGlobalConfig r1 = r1.LJ
            java.lang.String r0 = "GeckoGlobalManager.inst().globalConfig"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.io.File r0 = r1.getRootDirectory()
            r13 = r18
            r2.<init>(r0, r13)
            java.util.Set r0 = r19.entrySet()
            java.util.Iterator r10 = r0.iterator()
            r8 = 0
        L26:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r14 = r0.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r0.getValue()
            com.bytedance.geckox.policy.meta.MetaDataItemNew r6 = (com.bytedance.geckox.policy.meta.MetaDataItemNew) r6
            long r3 = r6.getLastReadTimeStamp()
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 < 0) goto L26
            java.io.File r7 = new java.io.File
            r7.<init>(r2, r14)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L52
            goto L26
        L52:
            com.bytedance.geckox.AppSettingsManager r4 = X.C61571OEl.LIZ
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.LJ
            r3 = 0
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r0.get(r13)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Laf
            boolean r0 = r0.contains(r14)
            r5 = 1
            if (r0 != r5) goto Laf
        L68:
            if (r22 == 0) goto L26
            if (r5 != 0) goto L26
            r6.setAllowUpdate(r3)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = X.C61511OCd.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r13, r0)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r7.getAbsolutePath()
            boolean r0 = X.OAH.LIZJ(r0)
            long r16 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto Lac
            r12 = 202(0xca, float:2.83E-43)
        L8c:
            X.O08 r11 = new X.O08
            long r16 = r16 - r5
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZJ
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r15 = r23
            r19 = r24
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r11.LJIIJ = r0
            X.OD6.LJFF(r11)
            goto L26
        Lac:
            r12 = 203(0xcb, float:2.84E-43)
            goto L8c
        Laf:
            r5 = 0
            long r0 = X.C61467OAl.LJI(r7)
            long r8 = r8 + r0
            goto L68
        Lb6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61511OCd.LIZJ(java.lang.String, java.util.Map, long, boolean, int, int):long");
    }

    public static void LJIIJ(long j, String accessKey, String channel, String version, String str, String str2) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        o.LJIIJ(version, "version");
        UpdatePackage updatePackage = (UpdatePackage) ((ConcurrentHashMap) LJ).get(C00F.LIZIZ(accessKey, '-', channel));
        if (updatePackage != null) {
            OAR.LIZ.LIZ().execute(new ARunnableS46S0100000_10(updatePackage, 207));
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) LIZ).get(accessKey);
        if (concurrentHashMap == null || concurrentHashMap.get(channel) == null) {
            OD6.LJIIIIZZ(accessKey, channel, version, str, str2, "false");
            return;
        }
        Object obj = concurrentHashMap.get(channel);
        if (obj != null) {
            MetaDataItemNew metaDataItemNew = (MetaDataItemNew) obj;
            OD6.LJIIIIZZ(accessKey, channel, version, str, str2, String.valueOf(!metaDataItemNew.getAllowUpdate()));
            if (!metaDataItemNew.getAllowUpdate()) {
                metaDataItemNew.setAllowUpdate(true);
            }
            metaDataItemNew.setLastReadTimeStamp(j);
            ((ConcurrentHashMap) LIZJ).put(accessKey, Boolean.TRUE);
            return;
        }
        o.LJIIZILJ();
        throw null;
    }
}
