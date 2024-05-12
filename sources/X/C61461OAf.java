package X;

import Y.ARunnableS14S0101000_10;
import android.os.SystemClock;
import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OAf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61461OAf {
    public static List LIZIZ(File file, java.util.Map map) {
        CleanPolicyModel cleanPolicyModel;
        List<CleanPolicyModel.ChannelCleanPolicy> list;
        List<Long> LIZ;
        List<Long> LIZ2;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String accessKey = (String) entry.getKey();
            File file2 = new File(file, accessKey);
            if (file2.isDirectory() && (cleanPolicyModel = (CleanPolicyModel) entry.getValue()) != null && (list = cleanPolicyModel.specifiedClean) != null && !list.isEmpty()) {
                for (CleanPolicyModel.ChannelCleanPolicy channelCleanPolicy : cleanPolicyModel.specifiedClean) {
                    String channel = channelCleanPolicy.channel;
                    int i = channelCleanPolicy.cleanType;
                    List<Long> list2 = channelCleanPolicy.versions;
                    File file3 = new File(file2, channel);
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                continue;
                            } else {
                                File file4 = new File(file2, channel);
                                File file5 = new File(file2, i0.LJFF(channel, "--pending-delete"));
                                file4.renameTo(file5);
                                arrayList.add(new C61462OAg(accessKey, channel, 3, 0L, file5));
                                o.LJIIJ(accessKey, "accessKey");
                                o.LJIIJ(channel, "channel");
                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) C61511OCd.LIZ).get(accessKey);
                                if (concurrentHashMap != null) {
                                    concurrentHashMap.remove(channel);
                                    ((ConcurrentHashMap) C61511OCd.LIZJ).put(accessKey, Boolean.TRUE);
                                }
                                java.util.Map<String, java.util.Map<String, ChannelMetaDataItem>> map2 = C61510OCc.LIZIZ;
                                synchronized (map2) {
                                    java.util.Map map3 = (java.util.Map) ((LinkedHashMap) map2).get(accessKey);
                                    if (map3 != null) {
                                        synchronized (map3) {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("remove channel meta,accessKey:");
                                            LIZ3.append(accessKey);
                                            LIZ3.append(",channel:");
                                            LIZ3.append(channel);
                                            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
                                            map3.remove(channel);
                                            C61510OCc.LJ(accessKey);
                                        }
                                    }
                                }
                            }
                        } else {
                            int i2 = 0;
                            if (list2 != null && (LIZ = OAS.LIZ(file3)) != null) {
                                ArrayList arrayList2 = (ArrayList) LIZ;
                                if (!arrayList2.isEmpty()) {
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        Long l = (Long) it.next();
                                        if (((Long) ListProtector.get(list2, i2)).longValue() > l.longValue()) {
                                            StringBuilder LIZ4 = X1D.LIZ();
                                            LIZ4.append(l);
                                            LIZ4.append("--pending-delete");
                                            File file6 = new File(file3, X1D.LIZIZ(LIZ4));
                                            StringBuilder LIZ5 = X1D.LIZ();
                                            LIZ5.append(l);
                                            LIZ5.append("");
                                            new File(file3, X1D.LIZIZ(LIZ5)).renameTo(file6);
                                            arrayList.add(new C61462OAg(accessKey, channel, 2, l.longValue(), file6));
                                        }
                                        i2 = 0;
                                    }
                                }
                            }
                        }
                    } else if (list2 != null && (LIZ2 = OAS.LIZ(file3)) != null) {
                        ArrayList arrayList3 = (ArrayList) LIZ2;
                        if (!arrayList3.isEmpty()) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                Long l2 = (Long) it2.next();
                                if (list2.contains(l2)) {
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append(l2);
                                    LIZ6.append("--pending-delete");
                                    File file7 = new File(file3, X1D.LIZIZ(LIZ6));
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append(l2);
                                    LIZ7.append("");
                                    new File(file3, X1D.LIZIZ(LIZ7)).renameTo(file7);
                                    arrayList.add(new C61462OAg(accessKey, channel, 1, l2.longValue(), file7));
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(int i, List list) {
        int i2;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61462OAg c61462OAg = (C61462OAg) it.next();
            File file = c61462OAg.LJ;
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean LIZJ = C61467OAl.LIZJ(file);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (LIZJ) {
                i2 = 200;
            } else {
                i2 = 201;
            }
            OD6.LJFF(new O08(c61462OAg.LIZ, c61462OAg.LIZIZ, c61462OAg.LIZJ, i2, c61462OAg.LIZLLL, uptimeMillis2 - uptimeMillis, i));
        }
    }

    public static void LIZ(int i, java.util.Map<String, CleanPolicyModel> map, File file, AbstractC61537ODd abstractC61537ODd) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            List LIZIZ = LIZIZ(file, map);
            if (LIZIZ != null) {
                OAY.LIZ().execute(new ARunnableS14S0101000_10(i, LIZIZ, abstractC61537ODd, 4));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
