package androidx.emoji2.text;

import X.AnonymousClass087;
import X.AnonymousClass089;
import X.C08A;
import X.C08B;
import X.C0M4;
import X.C16880lQ;
import X.C28671Ap;
import X.C28681Aq;
import X.C28691Ar;
import X.TMC;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class f {
    public static final Object LJIIIIZZ = new Object();
    public static volatile f LJIIIZ;
    public final ReadWriteLock LIZ;
    public final C0M4 LIZIZ;
    public volatile int LIZJ;
    public final Handler LIZLLL;
    public final C28691Ar LJ;
    public final C08B LJFF;
    public final int LJI;
    public final C28671Ap LJII;

    public static f LIZ() {
        f fVar;
        boolean z;
        synchronized (LJIIIIZZ) {
            fVar = LJIIIZ;
            if (fVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public static boolean LIZJ() {
        if (LJIIIZ != null) {
            return true;
        }
        return false;
    }

    public final int LIZIZ() {
        this.LIZ.readLock().lock();
        try {
            return this.LIZJ;
        } finally {
            this.LIZ.readLock().unlock();
        }
    }

    public final void LIZLLL() {
        if (this.LJI == 1) {
            if (LIZIZ() == 1) {
                return;
            }
            ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
            try {
                if (this.LIZJ == 0) {
                    return;
                }
                this.LIZJ = 0;
                ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
                C28691Ar c28691Ar = this.LJ;
                c28691Ar.getClass();
                try {
                    c28691Ar.LIZ.LJFF.LIZ(new C28681Aq(c28691Ar));
                    return;
                } catch (Throwable th) {
                    c28691Ar.LIZ.LJ(th);
                    return;
                }
            } finally {
                ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void LJFF() {
        ArrayList arrayList = new ArrayList();
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            this.LIZJ = 1;
            arrayList.addAll(this.LIZIZ);
            this.LIZIZ.clear();
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            this.LIZLLL.post(new C08A(arrayList, this.LIZJ, null));
        } catch (Throwable th) {
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th;
        }
    }

    public f(AnonymousClass087 anonymousClass087) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZ = reentrantReadWriteLock;
        this.LIZJ = 3;
        C08B c08b = anonymousClass087.LIZ;
        this.LJFF = c08b;
        int i = anonymousClass087.LIZIZ;
        this.LJI = i;
        this.LJII = anonymousClass087.LIZJ;
        this.LIZLLL = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = new C0M4();
        C28691Ar c28691Ar = new C28691Ar(this);
        this.LJ = c28691Ar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.LIZJ = 0;
            } catch (Throwable th) {
                ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (LIZIZ() == 0) {
            try {
                c08b.LIZ(new C28681Aq(c28691Ar));
            } catch (Throwable th2) {
                c28691Ar.LIZ.LJ(th2);
            }
        }
    }

    public final void LJ(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            this.LIZJ = 2;
            arrayList.addAll(this.LIZIZ);
            this.LIZIZ.clear();
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            this.LIZLLL.post(new C08A(arrayList, this.LIZJ, th));
        } catch (Throwable th2) {
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th2;
        }
    }

    public final void LJII(AnonymousClass089 anonymousClass089) {
        TMC.LJIIIZ(anonymousClass089, "initCallback cannot be null");
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            if (this.LIZJ == 1 || this.LIZJ == 2) {
                this.LIZLLL.post(new C08A(Arrays.asList(anonymousClass089), this.LIZJ, null));
            } else {
                this.LIZIZ.add(anonymousClass089);
            }
        } finally {
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015d A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:119:0x0057, B:121:0x0064, B:123:0x0068, B:125:0x0077, B:28:0x0080, B:30:0x008a, B:32:0x008d, B:34:0x0091, B:36:0x009d, B:38:0x00a0, B:42:0x00ad, B:45:0x00b5, B:50:0x00ce, B:67:0x00da, B:71:0x00e6, B:72:0x00f0, B:54:0x0104, B:57:0x010b, B:77:0x0110, B:80:0x011b, B:84:0x0120, B:86:0x0124, B:88:0x012a, B:90:0x012e, B:95:0x0139, B:98:0x0145, B:99:0x014a, B:101:0x015d, B:26:0x005b), top: B:118:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:119:0x0057, B:121:0x0064, B:123:0x0068, B:125:0x0077, B:28:0x0080, B:30:0x008a, B:32:0x008d, B:34:0x0091, B:36:0x009d, B:38:0x00a0, B:42:0x00ad, B:45:0x00b5, B:50:0x00ce, B:67:0x00da, B:71:0x00e6, B:72:0x00f0, B:54:0x0104, B:57:0x010b, B:77:0x0110, B:80:0x011b, B:84:0x0120, B:86:0x0124, B:88:0x012a, B:90:0x012e, B:95:0x0139, B:98:0x0145, B:99:0x014a, B:101:0x015d, B:26:0x005b), top: B:118:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145 A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:119:0x0057, B:121:0x0064, B:123:0x0068, B:125:0x0077, B:28:0x0080, B:30:0x008a, B:32:0x008d, B:34:0x0091, B:36:0x009d, B:38:0x00a0, B:42:0x00ad, B:45:0x00b5, B:50:0x00ce, B:67:0x00da, B:71:0x00e6, B:72:0x00f0, B:54:0x0104, B:57:0x010b, B:77:0x0110, B:80:0x011b, B:84:0x0120, B:86:0x0124, B:88:0x012a, B:90:0x012e, B:95:0x0139, B:98:0x0145, B:99:0x014a, B:101:0x015d, B:26:0x005b), top: B:118:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJI(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.LJI(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }
}
