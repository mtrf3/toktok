package X;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FUp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39059FUp implements Runnable {
    public static final RunnableC39059FUp LJLIL = new RunnableC39059FUp();

    public static void LIZ() {
        synchronized (HandlerC39055FUl.LJI) {
            HashMap hashMap = new HashMap();
            int size = HandlerC39055FUl.LIZLLL.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = HandlerC39055FUl.LIZIZ;
                    ArrayList<String> arrayList = HandlerC39055FUl.LIZLLL;
                    if (concurrentHashMap.get(arrayList.get(i)) != null) {
                        hashMap.put(arrayList.get(i), concurrentHashMap.get(arrayList.get(i)));
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("put remain ");
                    LIZ.append(arrayList.get(i));
                    X1D.LIZIZ(LIZ);
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("clear all ");
            ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap2 = HandlerC39055FUl.LIZIZ;
            LIZ2.append(concurrentHashMap2.size());
            X1D.LIZIZ(LIZ2);
            concurrentHashMap2.clear();
            concurrentHashMap2.putAll(hashMap);
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
