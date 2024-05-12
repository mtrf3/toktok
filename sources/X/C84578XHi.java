package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.XHi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84578XHi {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final C84580XHk LIZIZ = new C84580XHk();
    public static final C84579XHj LIZJ = new C84579XHj();
    public static final CopyOnWriteArrayList<C84581XHl<?>> LIZLLL = new CopyOnWriteArrayList<>();

    public static IMotaCache LIZ(Class cls, String key) {
        o.LJIIIZ(key, "key");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(key);
        LIZ2.append(cls.getName());
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        ReentrantReadWriteLock.ReadLock readLock = LIZ.readLock();
        readLock.lock();
        try {
            return LIZIZ.get(LIZIZ2);
        } finally {
            readLock.unlock();
        }
    }

    public static void LIZIZ(String str, IMotaCache iMotaCache, EnumC84576XHg enumC84576XHg) {
        Field field;
        Field[] declaredFields = iMotaCache.getClass().getDeclaredFields();
        o.LJIIIIZZ(declaredFields, "value.javaClass.declaredFields");
        ArrayList arrayList = new ArrayList();
        for (Field field2 : declaredFields) {
            if (o.LJ(field2.getDeclaringClass(), iMotaCache.getClass())) {
                arrayList.add(field2);
            }
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((Field) next).getName(), next);
        }
        Iterator<C84581XHl<?>> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            C84581XHl<?> next2 = it2.next();
            if (next2.LIZ.LIZ(iMotaCache) && (field = (Field) linkedHashMap.get(next2.LIZIZ)) != null) {
                boolean isAccessible = field.isAccessible();
                try {
                    field.setAccessible(true);
                    next2.LIZJ.invoke(str, field.get(iMotaCache), enumC84576XHg);
                } finally {
                    field.setAccessible(isAccessible);
                }
            }
        }
    }

    public static void LIZJ(String key, IMotaCache iMotaCache, EnumC84576XHg type) {
        int i;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(key);
            LIZ2.append(iMotaCache.getClass().getName());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            LIZIZ.put(LIZIZ2, iMotaCache);
            LIZIZ(key, iMotaCache, type);
            if (type == EnumC84576XHg.Query || type == EnumC84576XHg.Mutation) {
                LIZJ.put(LIZIZ2, iMotaCache);
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
