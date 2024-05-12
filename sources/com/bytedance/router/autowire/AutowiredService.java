package com.bytedance.router.autowire;

import X.X1D;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class AutowiredService {
    public LruCache<String, ISyringe> classCache;
    public List<String> denyList;

    /* loaded from: classes9.dex */
    public static final class Single {
        public static final AutowiredService single = new AutowiredService();
    }

    public AutowiredService() {
        this.classCache = new LruCache<>(66);
        this.denyList = new ArrayList();
    }

    public static AutowiredService inst() {
        return Single.single;
    }

    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (!this.denyList.contains(name)) {
                ISyringe iSyringe = this.classCache.get(name);
                if (iSyringe == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(obj.getClass().getName());
                    LIZ.append("$$SmartRouter$$Autowired");
                    iSyringe = (ISyringe) Class.forName(X1D.LIZIZ(LIZ)).getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                iSyringe.inject(obj);
                this.classCache.put(name, iSyringe);
            }
        } catch (Exception unused) {
            this.denyList.add(name);
        }
    }
}
