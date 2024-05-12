package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ml.common.HistorySaveContent;
import com.ss.android.ugc.aweme.ml.common.HistorySaveListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FR6<T> {
    public final String LIZ;
    public final int LIZIZ;
    public final ConcurrentHashMap<String, T> LIZJ = new ConcurrentHashMap<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();

    public final T LIZ(String str) {
        if (str == null) {
            return null;
        }
        return this.LIZJ.get(str);
    }

    public FR6(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    public final void LIZJ(Gson gson, Class<T> cls) {
        List<HistorySaveListItem> list;
        o.LJIIIZ(gson, "gson");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("_history");
        String LIZIZ = FR7.LIZIZ(X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(LIZIZ)) {
            return;
        }
        try {
            HistorySaveContent historySaveContent = (HistorySaveContent) gson.LJI(LIZIZ, HistorySaveContent.class);
            if (historySaveContent != null && (list = historySaveContent.list) != null) {
                this.LJ.writeLock().lock();
                try {
                    for (HistorySaveListItem historySaveListItem : list) {
                        String str = historySaveListItem.key;
                        String str2 = historySaveListItem.value;
                        if (str != null && str2 != null) {
                            if (!this.LIZLLL.contains(str)) {
                                this.LIZLLL.add(0, str);
                            }
                            if (!this.LIZJ.containsKey(str)) {
                                this.LIZJ.put(str, gson.LJI(str2, cls));
                            }
                        }
                    }
                    this.LJ.writeLock().unlock();
                } catch (Throwable th) {
                    this.LJ.writeLock().unlock();
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(String str, T t) {
        if (str != null) {
            if (!this.LIZJ.containsKey(str)) {
                this.LIZJ.put(str, t);
            }
            this.LJ.writeLock().lock();
            try {
                if (!this.LIZLLL.contains(str)) {
                    this.LIZLLL.add(str);
                }
                if (this.LIZLLL.size() > this.LIZIZ && this.LIZLLL.size() > 0) {
                    String str2 = this.LIZLLL.get(0);
                    o.LJIIIIZZ(str2, "historyIdList[0]");
                    this.LIZLLL.remove(0);
                    this.LIZJ.remove(str2);
                }
            } finally {
                this.LJ.writeLock().unlock();
            }
        }
    }

    public final ArrayList<T> LIZIZ(int i, String str, boolean z) {
        T t;
        this.LJ.readLock().lock();
        try {
            int size = this.LIZLLL.size();
            int i2 = size - 1;
            if (!TextUtils.isEmpty(str) && ORZ.LJLJJI(str, this.LIZLLL)) {
                i2 = ORZ.LJZ(str, this.LIZLLL);
                if (z) {
                    i2--;
                }
            }
            if (i2 < 0 || i2 >= size) {
                return null;
            }
            ArrayList<T> arrayList = new ArrayList<>();
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (i2 >= 0) {
                    String str2 = this.LIZLLL.get(i2);
                    if (str2 != null) {
                        t = this.LIZJ.get(str2);
                        i2--;
                        arrayList.add(t);
                    }
                }
                t = null;
                i2--;
                arrayList.add(t);
            }
            return arrayList;
        } finally {
            this.LJ.readLock().unlock();
        }
    }

    public final void LJ(int i, Gson gson, boolean z) {
        int max;
        int max2;
        T t;
        o.LJIIIZ(gson, "gson");
        ArrayList arrayList = new ArrayList();
        this.LJ.readLock().lock();
        try {
            int size = this.LIZLLL.size();
            if (z) {
                size--;
            }
            if (size > 0 && (max2 = Math.max(size - i, 0)) <= (max = Math.max(size - 1, 0))) {
                while (true) {
                    String str = this.LIZLLL.get(max);
                    if (str != null && (t = this.LIZJ.get(str)) != null) {
                        HistorySaveListItem historySaveListItem = new HistorySaveListItem();
                        historySaveListItem.key = str;
                        historySaveListItem.value = gson.LJIILL(t);
                        arrayList.add(historySaveListItem);
                    }
                    if (max == max2) {
                        break;
                    } else {
                        max--;
                    }
                }
            }
            this.LJ.readLock().unlock();
            if (arrayList.isEmpty()) {
                return;
            }
            HistorySaveContent historySaveContent = new HistorySaveContent();
            historySaveContent.list = arrayList;
            String gsonString = GsonProtectorUtils.toJson(gson, historySaveContent);
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZ);
                LIZ.append("_history");
                String LIZIZ = X1D.LIZIZ(LIZ);
                o.LJIIIIZZ(gsonString, "gsonString");
                FR7.LIZJ(LIZIZ, gsonString);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            this.LJ.readLock().unlock();
            throw th;
        }
    }
}
