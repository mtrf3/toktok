package X;

import Y.IDComparatorS334S0100000_1;
import android.content.SharedPreferences;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NJk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class EnumC59152NJk {
    public static final EnumC59152NJk FIFO;
    public static final /* synthetic */ EnumC59152NJk[] LJLIL;
    public static final EnumC59152NJk SPECIFIC_TIME;

    static {
        EnumC59152NJk enumC59152NJk = new EnumC59152NJk() { // from class: X.NJm
            @Override // X.EnumC59152NJk
            public final void onUpdateFinished(java.util.Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, C59125NIj config, File rootDir) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                File[] listFiles;
                java.util.Map<String, ?> all;
                java.util.Set<Map.Entry<String, ?>> entrySet;
                o.LJIIJ(config, "config");
                o.LJIIJ(rootDir, "rootDir");
                if (!C59155NJn.LIZ.LIZ()) {
                    return;
                }
                SharedPreferences LIZ = C59165NJx.LIZ();
                if (LIZ != null && (all = LIZ.getAll()) != null && (entrySet = all.entrySet()) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry<String, ?> entry : entrySet) {
                        String key = entry.getKey();
                        o.LJFF(key, "it.key");
                        if (s.LJLJJL(key, new String[]{"-"}, 0, 6).size() == 2) {
                            arrayList4.add(entry);
                        }
                    }
                    arrayList = new ArrayList(C32I.LJJL(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        Object key2 = ((Map.Entry) it.next()).getKey();
                        o.LJFF(key2, "it.key");
                        List LJLJJL = s.LJLJJL((CharSequence) key2, new String[]{"-"}, 0, 6);
                        arrayList.add(new OSZ(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1)));
                    }
                } else {
                    arrayList = null;
                }
                for (String str : config.LIZJ) {
                    File file = new File(rootDir, str);
                    if (arrayList != null) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (o.LJ(((OSZ) next).getFirst(), str)) {
                                arrayList5.add(next);
                            }
                        }
                        arrayList2 = new ArrayList(C32I.LJJL(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((OSZ) it3.next()).getSecond());
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
                        arrayList3 = null;
                    } else {
                        arrayList3 = new ArrayList();
                        for (File file2 : listFiles) {
                            if (OAS.LIZJ(file2) != null && (arrayList2 == null || arrayList2.isEmpty() || !arrayList2.contains(file2.getName()))) {
                                arrayList3.add(file2);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            File file3 = (File) it4.next();
                            hashMap.put(file3, Long.valueOf(file3.lastModified()));
                        }
                        Collections.sort(arrayList3, new IDComparatorS334S0100000_1(hashMap, 5));
                    }
                    int i = config.LIZ;
                    if (arrayList3 != null && arrayList3.size() > i) {
                        for (File file4 : arrayList3.subList(0, arrayList3.size() - i)) {
                            OD6.LJFF(new O08(OAH.LIZJ(file4.getAbsolutePath()) ? 1 : 0, str, file4.getName(), 0, 0L, (String) null, 8));
                        }
                    }
                }
            }
        };
        FIFO = enumC59152NJk;
        EnumC59152NJk enumC59152NJk2 = new EnumC59152NJk() { // from class: X.NJl
            @Override // X.EnumC59152NJk
            public final void onUpdateFinished(java.util.Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, C59125NIj config, File rootDir) {
                SharedPreferences.Editor edit;
                SharedPreferences.Editor putLong;
                o.LJIIJ(config, "config");
                o.LJIIJ(rootDir, "rootDir");
                if (map != null) {
                    for (Map.Entry<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Iterator<T> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            String str = ((CheckRequestBodyModel.TargetChannel) it.next()).channelName;
                            if (C70657RoD.LJ(key, str)) {
                                Long l = config.LIZLLL;
                                if (l != null) {
                                    SharedPreferences LIZ = C59165NJx.LIZ();
                                    if (LIZ != null && (edit = LIZ.edit()) != null && (putLong = edit.putLong(C00F.LIZIZ(key, '-', str), l.longValue())) != null) {
                                        putLong.apply();
                                    }
                                } else {
                                    OC6.LIZLLL("SpecificTimeClean", "Used SpecificTimeClean strategy, but no expire time specified");
                                }
                            }
                        }
                    }
                }
            }
        };
        SPECIFIC_TIME = enumC59152NJk2;
        LJLIL = new EnumC59152NJk[]{enumC59152NJk, enumC59152NJk2};
    }

    public EnumC59152NJk() {
        throw null;
    }

    public static EnumC59152NJk valueOf(String str) {
        return (EnumC59152NJk) V0N.LJJJ(EnumC59152NJk.class, str);
    }

    public static EnumC59152NJk[] values() {
        return (EnumC59152NJk[]) LJLIL.clone();
    }

    public abstract void onUpdateFinished(java.util.Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, C59125NIj c59125NIj, File file);

    public EnumC59152NJk(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.NJk] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.geckox.model.CheckRequestBodyModel$TargetChannel>>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.LinkedHashMap, java.util.HashMap] */
    public final void postUpdate(java.util.Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, java.util.Map<String, ? extends CheckRequestParamModel> map2, C59125NIj config, File rootDir) {
        o.LJIIJ(config, "config");
        o.LJIIJ(rootDir, "rootDir");
        if (this == FIFO) {
            onUpdateFinished(map, config, rootDir);
            return;
        }
        if (map == 0) {
            if (map2 == null) {
                return;
            }
            map = new LinkedHashMap<>(C51029K0z.LJJIIZ(map2.size()));
            for (Map.Entry<String, ? extends CheckRequestParamModel> entry : map2.entrySet()) {
                map.put(entry.getKey(), entry.getValue().getTargetChannels());
            }
        }
        onUpdateFinished(map, config, rootDir);
    }
}
