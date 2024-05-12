package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Ixl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48317Ixl extends C48326Ixu {
    public final long LIZIZ;
    public final List<String> LIZJ;
    public final PThreadPoolExecutor LIZLLL;
    public final LinkedHashMap<String, C48321Ixp> LJ;
    public final ConcurrentHashMap<String, Long> LJFF;
    public final ReentrantReadWriteLock.ReadLock LJI;
    public final ReentrantReadWriteLock.WriteLock LJII;
    public volatile float LJIIIIZZ;
    public final ARunnableS44S0100000_8 LJIIIZ;
    public final Handler LJIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48317Ixl(File file, long j, List<String> whiteMusicFilePathList) {
        super(file);
        o.LJIIIZ(whiteMusicFilePathList, "whiteMusicFilePathList");
        this.LIZIZ = j;
        this.LIZJ = whiteMusicFilePathList;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactoryC38888FOa("MusicDiskLruCache-cleanup", false), RejectedExecutionHandlerC48318Ixm.LIZ);
        this.LIZLLL = pThreadPoolExecutor;
        this.LJ = new LinkedHashMap<>(0, 0.75f, true);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = reentrantReadWriteLock.readLock();
        this.LJII = reentrantReadWriteLock.writeLock();
        this.LJIIIIZZ = 0.5f;
        this.LJIIIZ = new ARunnableS44S0100000_8(this, 147);
        this.LJIIJ = new Handler(C16880lQ.LLJJJJ());
        if (file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            pThreadPoolExecutor.execute(new RunnableC48323Ixr(this));
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
}
