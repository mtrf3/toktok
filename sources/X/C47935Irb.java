package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS2S1110000_8;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS44S0100000_8;
import Y.ARunnableS9S1100000_8;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Irb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47935Irb extends AbstractC47939Irf {
    public final File LIZ;
    public final LinkedHashMap<String, File> LIZIZ = new LinkedHashMap<>(0, 0.75f, true);
    public final ReentrantReadWriteLock.ReadLock LIZJ;
    public final ReentrantReadWriteLock.WriteLock LIZLLL;
    public final java.util.Set<InterfaceC47937Ird> LJ;
    public volatile long LJFF;
    public volatile float LJI;
    public final C47936Irc LJII;
    public final PThreadPoolExecutor LJIIIIZZ;
    public final ARunnableS44S0100000_8 LJIIIZ;
    public final Handler LJIIJ;

    public final void LJFF() {
        this.LJIIJ.removeCallbacks(this.LJIIIZ);
        this.LJIIJ.postDelayed(this.LJIIIZ, 10000L);
    }

    public final void LJI() {
        C48059Itb LIZIZ = C48059Itb.LIZIZ();
        LIZIZ.getClass();
        C48100IuG.LJII(new ARunnableS44S0100000_8(LIZIZ, 124));
        Context context = C47455Ijr.LIZJ;
        if (context != null) {
            if (C47961Is1.LJ == null) {
                synchronized (C47961Is1.class) {
                    if (C47961Is1.LJ == null) {
                        C47961Is1.LJ = new C47961Is1(context);
                    }
                }
            }
            C47961Is1 c47961Is1 = C47961Is1.LJ;
            java.util.Map<String, C48111IuR> map = c47961Is1.LIZ.get(0);
            if (map != null) {
                map.clear();
            }
            c47961Is1.LIZJ.execute(new ARunnableS12S0101000_8(c47961Is1, 34));
        }
        this.LJIIJ.removeCallbacks(this.LJIIIZ);
        this.LJIIIIZZ.execute(new ARunnableS44S0100000_8(this, 132));
    }

    public C47935Irb(File file) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZJ = reentrantReadWriteLock.readLock();
        this.LIZLLL = reentrantReadWriteLock.writeLock();
        this.LJ = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJFF = 104857600L;
        this.LJI = 0.5f;
        this.LJII = new C47936Irc(this);
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new EWJ(), new RejectedExecutionHandlerC47938Ire());
        this.LJIIIIZZ = pThreadPoolExecutor;
        this.LJIIIZ = new ARunnableS44S0100000_8(this, 130);
        this.LJIIJ = new Handler(C16880lQ.LLJJJJ());
        if (file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.LIZ = file;
            pThreadPoolExecutor.execute(new ARunnableS44S0100000_8(this, 131));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exists: ");
        LIZ.append(file.exists());
        LIZ.append(", isDirectory: ");
        LIZ.append(file.isDirectory());
        LIZ.append(", canRead: ");
        LIZ.append(file.canRead());
        LIZ.append(", canWrite: ");
        LIZ.append(file.canWrite());
        throw new IOException(i0.LJFF("dir error!  ", X1D.LIZIZ(LIZ)));
    }

    @Override // X.AbstractC47939Irf
    public final void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C47936Irc c47936Irc = this.LJII;
            String LIZ = C48082Ity.LIZ(str);
            synchronized (c47936Irc) {
                if (!TextUtils.isEmpty(LIZ)) {
                    File file = new File(LIZ);
                    if (((HashMap) c47936Irc.LIZ).containsKey(LIZ) && file.exists()) {
                        ((HashMap) c47936Irc.LIZIZ).put(LIZ, str);
                    } else {
                        c47936Irc.LIZJ.LJII(str);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC47939Irf
    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C47936Irc c47936Irc = this.LJII;
            synchronized (c47936Irc) {
                if (!TextUtils.isEmpty(str)) {
                    if (!((HashMap) c47936Irc.LIZIZ).containsKey(str)) {
                        Integer num = (Integer) ((HashMap) c47936Irc.LIZ).get(str);
                        if (num == null) {
                            ((HashMap) c47936Irc.LIZ).put(str, 1);
                        } else {
                            ((HashMap) c47936Irc.LIZ).put(str, Integer.valueOf(num.intValue() + 1));
                        }
                    } else {
                        throw new C47940Irg();
                    }
                }
            }
        }
    }

    @Override // X.AbstractC47939Irf
    public final File LIZJ(String str) {
        this.LIZJ.lock();
        File file = this.LIZIZ.get(str);
        this.LIZJ.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.LIZ, str);
        this.LIZLLL.lock();
        this.LIZIZ.put(str, file2);
        this.LIZLLL.unlock();
        Iterator<InterfaceC47937Ird> it = this.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(str);
        }
        LJFF();
        return file2;
    }

    @Override // X.AbstractC47939Irf
    public final void LIZLLL(String str) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            C47936Irc c47936Irc = this.LJII;
            synchronized (c47936Irc) {
                if (!TextUtils.isEmpty(str) && (num = (Integer) ((HashMap) c47936Irc.LIZ).get(str)) != null) {
                    if (num.intValue() == 1) {
                        ((HashMap) c47936Irc.LIZ).remove(str);
                        String str2 = (String) ((HashMap) c47936Irc.LIZIZ).get(str);
                        if (str2 != null) {
                            c47936Irc.LIZJ.LJII(str2);
                        }
                    } else {
                        ((HashMap) c47936Irc.LIZ).put(str, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC47939Irf
    public final File LJ(String str) {
        if (this.LIZJ.tryLock()) {
            File file = this.LIZIZ.get(str);
            this.LIZJ.unlock();
            return file;
        }
        return null;
    }

    public final void LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C48059Itb LIZIZ = C48059Itb.LIZIZ();
        LIZIZ.getClass();
        if (!TextUtils.isEmpty(str)) {
            C48100IuG.LJII(new ARunnableS2S1110000_8(LIZIZ, str, 2));
        }
        this.LJIIJ.removeCallbacks(this.LJIIIZ);
        this.LJIIIIZZ.execute(new ARunnableS9S1100000_8(this, str, 13));
    }

    public final void LJIIIIZZ(long j) {
        HashSet hashSet;
        long j2;
        HashSet hashSet2 = new HashSet();
        this.LIZLLL.lock();
        try {
            Iterator<Map.Entry<String, File>> it = this.LIZIZ.entrySet().iterator();
            j2 = 0;
            while (it.hasNext()) {
                j2 += it.next().getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (j2 <= j) {
            this.LIZLLL.unlock();
            return;
        }
        long j3 = ((float) j) * this.LJI;
        hashSet = new HashSet();
        try {
            for (Map.Entry<String, File> entry : this.LIZIZ.entrySet()) {
                File value = entry.getValue();
                if (value != null && value.exists()) {
                    if (!this.LJII.LIZ(value.getName())) {
                        long length = value.length();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(value.getAbsolutePath());
                        LIZ.append("-tmp");
                        File file = new File(X1D.LIZIZ(LIZ));
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j2 -= length;
                            hashSet.add(entry.getKey());
                        }
                    }
                } else {
                    hashSet.add(entry.getKey());
                }
                if (j2 <= j3) {
                    break;
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.LIZIZ.remove((String) it2.next());
            }
        } catch (Throwable unused2) {
        }
        this.LIZLLL.unlock();
        Iterator<InterfaceC47937Ird> it3 = this.LJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(hashSet);
        }
        this.LJIIIIZZ.execute(new ARunnableS42S0100000_6(hashSet2, 118));
    }
}
