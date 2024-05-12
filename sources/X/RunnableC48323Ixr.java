package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ujb.o;
import ujb.s;

/* renamed from: X.Ixr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48323Ixr implements Runnable {
    public final /* synthetic */ C48317Ixl LJLIL;

    public RunnableC48323Ixr(C48317Ixl c48317Ixl) {
        this.LJLIL = c48317Ixl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        Long putIfAbsent;
        C48317Ixl c48317Ixl = this.LJLIL;
        c48317Ixl.LJII.lock();
        c48317Ixl.LJFF.clear();
        try {
            try {
                File file = new File((File) c48317Ixl.LIZ, "journal");
                long j = 0;
                if (file.exists()) {
                    Iterator it = ((ArrayList) C38485F8n.LLLFF(file)).iterator();
                    while (it.hasNext()) {
                        List LJLJJL = s.LJLJJL((String) it.next(), new String[]{" "}, 0, 6);
                        if (LJLJJL.size() == 2 && (!o.LJJJJJL((CharSequence) LJLJJL.get(0))) && Long.parseLong((String) LJLJJL.get(1)) >= 0) {
                            if (c48317Ixl.LJFF.contains(LJLJJL.get(0))) {
                                Long l = c48317Ixl.LJFF.get(LJLJJL.get(0));
                                if (l != null) {
                                    if (Long.parseLong((String) LJLJJL.get(1)) > l.longValue()) {
                                        c48317Ixl.LJFF.put(LJLJJL.get(0), Long.valueOf(Long.parseLong((String) LJLJJL.get(1))));
                                    }
                                } else {
                                    "accessedMap[strings[0]] should not be null".toString();
                                    throw new IllegalArgumentException("accessedMap[strings[0]] should not be null");
                                }
                            } else {
                                c48317Ixl.LJFF.put(LJLJJL.get(0), Long.valueOf(Long.parseLong((String) LJLJJL.get(1))));
                            }
                        }
                    }
                }
                File[] listFiles = ((File) c48317Ixl.LIZ).listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2.isFile() && !kotlin.jvm.internal.o.LJ(file2.getName(), "journal")) {
                            ConcurrentHashMap<String, Long> concurrentHashMap = c48317Ixl.LJFF;
                            String name = file2.getName();
                            Long l2 = concurrentHashMap.get(name);
                            if (l2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(name, (l2 = Long.valueOf(file2.lastModified())))) != null) {
                                l2 = putIfAbsent;
                            }
                            Long accessTime = l2;
                            kotlin.jvm.internal.o.LJIIIIZZ(accessTime, "accessTime");
                            arrayList.add(new C48321Ixp(file2, accessTime.longValue()));
                            j += file2.length();
                        }
                    }
                    if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LIZIZ(j, "music_size");
                        FMX.LJIIL("tool_performance_effect_storage_space", c145995oB.LIZ);
                    }
                    C40675Fxn.LJJLIIIJ(arrayList, C48322Ixq.LJLIL);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C48321Ixp c48321Ixp = (C48321Ixp) it2.next();
                        LinkedHashMap<String, C48321Ixp> linkedHashMap = c48317Ixl.LJ;
                        String name2 = c48321Ixp.LIZ.getName();
                        kotlin.jvm.internal.o.LJIIIIZZ(name2, "f.file.name");
                        linkedHashMap.put(name2, c48321Ixp);
                    }
                    File file3 = new File((File) c48317Ixl.LIZ, "journal_temp");
                    ArrayList arrayList2 = new ArrayList();
                    java.util.Set<Map.Entry<String, C48321Ixp>> entrySet = c48317Ixl.LJ.entrySet();
                    kotlin.jvm.internal.o.LJIIIIZZ(entrySet, "cache.entries");
                    for (Map.Entry<String, C48321Ixp> entry : entrySet) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(entry.getKey());
                        LIZ.append(' ');
                        LIZ.append(entry.getValue().LIZIZ);
                        arrayList2.add(X1D.LIZIZ(LIZ));
                    }
                    C38485F8n.LLLII(file3, ORZ.LLD(arrayList2, "\n", null, "\n", null, 58));
                    file3.renameTo(new File((File) c48317Ixl.LIZ, "journal"));
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("MusicDiskLruCache  ");
                LIZ2.append(e.getLocalizedMessage());
                H7B.LIZ(X1D.LIZIZ(LIZ2));
            }
            c48317Ixl.LJII.unlock();
            c48317Ixl.LJIIJ.removeCallbacks(c48317Ixl.LJIIIZ);
            c48317Ixl.LJIIJ.postDelayed(c48317Ixl.LJIIIZ, 10000L);
        } catch (Throwable th) {
            c48317Ixl.LJII.unlock();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
