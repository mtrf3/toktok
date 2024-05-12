package X;

import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.O3j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61283O3j {
    public static final C61283O3j LIZLLL = new C61283O3j();
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C61312O4m.LJLIL);
    public static final ReentrantReadWriteLock LIZIZ = new ReentrantReadWriteLock();
    public static final ConcurrentHashMap<String, C61302O4c> LIZJ = new ConcurrentHashMap<>();

    public static Queue LIZJ() {
        return (Queue) LIZ.getValue();
    }

    public static O4U LIZIZ(String str) {
        Object obj;
        ReentrantReadWriteLock.ReadLock readLock = LIZIZ.readLock();
        readLock.lock();
        try {
            Iterator it = LIZJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((O4U) obj).LJLIL, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (O4U) obj;
        } finally {
            readLock.unlock();
        }
    }

    public static void LJFF(String url) {
        int i;
        o.LJIIJ(url, "url");
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
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
            if (TextUtils.isEmpty(url)) {
                C39930Flm.LJ("PreLoader", "prepare preload failed, url is empty!", 4);
            } else {
                O4U LIZIZ2 = LIZIZ(url);
                if (LIZIZ2 != null) {
                    LIZJ().remove(LIZIZ2);
                    LIZJ().offer(LIZIZ2);
                } else {
                    if (LIZJ().size() > 30) {
                        LIZJ().poll();
                    }
                    LIZJ().offer(new O4U(url, EnumC35448Dvg.Preparing));
                }
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static O4U LJI(String str) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
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
            O4U LIZIZ2 = LIZIZ(str);
            if (LIZIZ2 != null) {
                LIZJ().remove(LIZIZ2);
            } else {
                LIZIZ2 = null;
            }
            return LIZIZ2;
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static C61302O4c LIZ(String url, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIJ(url, "url");
        LJI(url);
        ConcurrentHashMap<String, C61302O4c> concurrentHashMap = LIZJ;
        C61302O4c c61302O4c = concurrentHashMap.get(url);
        if (c61302O4c != null) {
            C39930Flm.LJI("PreLoader", "request reused", false, 4);
            synchronized (c61302O4c) {
                if (c61302O4c.LJLIL != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("fetchCache:hit cache immediately, url:");
                    LIZ2.append(url);
                    C39930Flm.LJI("PreLoader", X1D.LIZIZ(LIZ2), false, 4);
                    c61302O4c.LJLILLLLZI = false;
                    concurrentHashMap.remove(url);
                    C61295O3v c61295O3v = c61302O4c.LJLIL;
                    if (c61295O3v != null) {
                        interfaceC88472Yns.invoke(c61295O3v);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("fetchCache:waiting for result, url:");
                    LIZ3.append(url);
                    C39930Flm.LJI("PreLoader", X1D.LIZIZ(LIZ3), false, 4);
                    c61302O4c.LJLILLLLZI = true;
                    ((ArrayList) c61302O4c.LJLJI).add(interfaceC88472Yns);
                }
            }
        }
        return c61302O4c;
    }

    /* JADX WARN: Finally extract failed */
    public final void LJ(Forest forest, String url, RequestParams params) {
        int i;
        o.LJIIJ(forest, "forest");
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        if (LIZJ.containsKey(url)) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < i; i2++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            O4U LIZIZ2 = LIZIZ(url);
            if (LIZIZ2 == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("produce preload failed, no prepare record exists for ");
                LIZ2.append(url);
                LIZ2.append('!');
                C39930Flm.LJ("PreLoader", X1D.LIZIZ(LIZ2), 4);
            } else {
                LIZJ().remove(LIZIZ2);
                LIZJ().offer(new O4U(url, EnumC35448Dvg.Producing));
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.lock();
            }
            writeLock.unlock();
            EnumC61028NxI resourceScene = params.getResourceScene();
            if ((resourceScene == EnumC61028NxI.WEB_CHILD_RESOURCE || resourceScene == EnumC61028NxI.WEB_MAIN_DOCUMENT) && C39821Fk1.LIZLLL) {
                params.setParallelLoading(true);
                params.setLoadToMemory(false);
            }
            params.setPreload$forest_release(true);
            C61302O4c c61302O4c = new C61302O4c(url, params.getResourceScene(), this);
            LIZJ.put(url, c61302O4c);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("start preload, url:");
            LIZ3.append(url);
            C39930Flm.LJI("PreLoader", X1D.LIZIZ(LIZ3), false, 4);
            forest.fetchResourceAsync(url, params, c61302O4c);
        } catch (Throwable th) {
            for (int i4 = 0; i4 < i; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void LIZLLL(Forest forest, C61027NxH c61027NxH, EnumC61028NxI enumC61028NxI, String str, String str2) {
        boolean z;
        String str3 = c61027NxH.LIZ;
        RequestParams requestParams = new RequestParams(enumC61028NxI);
        boolean z2 = true;
        if (c61027NxH.LIZIZ && enumC61028NxI != EnumC61028NxI.LYNX_IMAGE) {
            z = true;
        } else {
            z = false;
        }
        requestParams.setLoadToMemory(z);
        requestParams.setEnableMemoryCache(Boolean.valueOf(c61027NxH.LIZIZ));
        if (!c61027NxH.LIZJ && enumC61028NxI != EnumC61028NxI.LYNX_IMAGE) {
            z2 = false;
        }
        requestParams.setDisableCdn(z2);
        if (str != null) {
            requestParams.setGroupId(str);
        }
        requestParams.setSessionId(str2);
        LJ(forest, str3, requestParams);
    }
}
