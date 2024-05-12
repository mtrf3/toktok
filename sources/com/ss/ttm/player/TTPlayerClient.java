package com.ss.ttm.player;

import X.AbstractC47755Ioh;
import X.AbstractC48434Ize;
import X.C16880lQ;
import X.C1FJ;
import X.C46886Iag;
import X.C47791IpH;
import X.C47811Ipb;
import X.C47821Ipl;
import X.C48425IzV;
import X.C56662Kg;
import X.C61447O9r;
import X.C79062V1e;
import X.InterfaceC47775Ip1;
import X.InterfaceC47888Iqq;
import X.InterfaceC47889Iqr;
import X.InterfaceC47890Iqs;
import X.InterfaceC47891Iqt;
import X.InterfaceC48414IzK;
import X.InterfaceC48415IzL;
import X.InterfaceC48416IzM;
import X.InterfaceC48417IzN;
import X.InterfaceC48418IzO;
import X.InterfaceC48430Iza;
import X.O5Y;
import X.QZV;
import X.SurfaceHolderCallbackC48426IzW;
import X.VAL;
import X.X1D;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttm.net.AVResolver;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public class TTPlayerClient extends AbstractC48434Ize implements Handler.Callback, InterfaceC48430Iza {
    public static final String LLIIZ = C16880lQ.LJLLJ(TTPlayerClient.class);
    public InterfaceC47775Ip1 LJLIL;
    public SurfaceHolder LJLILLLLZI;
    public Surface LJLJI;
    public Context LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public final SurfaceHolderCallbackC48426IzW LJLJLLL;
    public boolean LJLL;
    public volatile boolean LJLLI;
    public final ReentrantReadWriteLock.ReadLock LJLLLLLL;
    public final ReentrantReadWriteLock.WriteLock LJLZ;
    public int LJZ;
    public int LJZI;
    public C48425IzV LJZL;
    public String LL;
    public String LLD;
    public final StringBuilder LLF;
    public int LLFF;
    public int LLFFF;
    public Handler LLFII;
    public InterfaceC48416IzM LLFZ;
    public InterfaceC48415IzL LLI;
    public InterfaceC48417IzN LLIFFJFJJ;
    public InterfaceC48414IzK LLII;
    public InterfaceC47889Iqr LLIIII;
    public InterfaceC47890Iqs LLIIIILZ;
    public InterfaceC47888Iqq LLIIIJ;
    public InterfaceC48418IzO LLIIIL;
    public InterfaceC47891Iqt LLIIIZ;
    public final HashMap<Integer, Integer> LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public boolean LLIILZL;
    public boolean LJLJL = true;
    public final LinkedList<String> LJLJLJ = new LinkedList<>();
    public int LJLLILLLL = -1;
    public final Object LJLLJ = new Object();
    public final ReentrantLock LJLLL = new ReentrantLock();
    public final ReentrantLock LJLLLL = new ReentrantLock();

    @Override // X.AbstractC48434Ize
    public final void LJIILJJIL() {
        this.LJLLI = true;
        SurfaceHolder surfaceHolder = this.LJLILLLLZI;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.LJLJLLL);
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIIJ();
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILL() {
        LJJJLZIJ(false);
        LJJL();
        this.LJLZ.lock();
        try {
            C48425IzV c48425IzV = this.LJZL;
            this.LJZL = null;
            this.LJLLILLLL = -1;
            if (c48425IzV != null) {
                TTPlayer tTPlayer = c48425IzV.LIZIZ;
                c48425IzV.LIZIZ = null;
                tTPlayer.LJIIJJI();
            }
            SurfaceHolder surfaceHolder = this.LJLILLLLZI;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.LJLJLLL);
                this.LJLILLLLZI = null;
                this.LJLLI = true;
            }
            synchronized (this.LJLLJ) {
                Handler handler = this.LLFII;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.LLFII = null;
                }
            }
            this.LJLJJI = null;
        } finally {
            this.LJLZ.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILLIIL() {
        this.LJLLI = true;
        SurfaceHolder surfaceHolder = this.LJLILLLLZI;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.LJLJLLL);
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIIJ();
            }
            this.LJLLLLLL.unlock();
            new PthreadThread(new ARunnableS44S0100000_8(this, 68), "TPlayerClient").start();
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    static {
        TTVersion.LIZ();
    }

    @Override // X.AbstractC48434Ize
    public final int LIZ() {
        this.LJLLLLLL.lock();
        try {
            int i = 0;
            if (LJJJJLI()) {
                i = this.LJZL.LJIJJ(2, 0);
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LIZIZ() {
        this.LJLLLLLL.lock();
        try {
            int i = 0;
            if (LJJJJLI()) {
                i = this.LJZL.LJIJJ(1, 0);
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LJI() {
        int i;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.getClass();
                i = 1;
            } else {
                i = 0;
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LJII() {
        this.LJLLLLLL.lock();
        try {
            int i = 0;
            if (LJJJJLI()) {
                i = this.LJZL.LJIJJ(4, 0);
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LJIIIIZZ() {
        this.LJLLLLLL.lock();
        try {
            int i = 0;
            if (LJJJJLI()) {
                i = this.LJZL.LJIJJ(11, 0);
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LJIIIZ() {
        this.LJLLLLLL.lock();
        try {
            int i = 0;
            if (LJJJJLI()) {
                i = this.LJZL.LJIJJ(3, 0);
            }
            return i;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final boolean LJIIJ() {
        this.LJLLLLLL.lock();
        try {
            boolean z = false;
            if (LJJJJLI()) {
                if (this.LJZL.LJIJJ(12, 0) == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final boolean LJIIJJI() {
        this.LJLLLLLL.lock();
        try {
            boolean z = false;
            if (LJJJJLI()) {
                if (this.LJZL.LJIJJ(6, 0) == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIIL() {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIIIIZZ();
            }
            this.LJLLLLLL.unlock();
            LJJJLZIJ(false);
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILIIL() {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZ = 0;
                this.LJLJLJ.clear();
                if (this.LJLLI) {
                    this.LJZL.LJJI(this.LJLILLLLZI.getSurface());
                    this.LJLLI = false;
                }
                this.LJZL.LIZIZ.LJIIIZ();
                LJJJZ();
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIIZILJ() {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIIL();
                SurfaceHolder surfaceHolder = this.LJLILLLLZI;
                if (surfaceHolder != null && this.LLIIL == 0) {
                    this.LJZL.LJJI(surfaceHolder.getSurface());
                }
                this.LLFII.removeCallbacksAndMessages(null);
                this.LJZ = 0;
                this.LJLJLJ.clear();
                LJJJZ();
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJI() {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.getClass();
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJI() {
        if (!this.LJLJJLL) {
            if (this.LJLILLLLZI == null) {
                O5Y.LJII(LLIIZ, this, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.LJLJJLL = true;
            LJJL();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJIZL() {
        if (C47821Ipl.LJFF) {
            C56662Kg.LIZ().LJFF("player_prerender_real_duration", false);
            C56662Kg.LIZ().LJFF("player_prerender_to_onprepared", false);
            C56662Kg.LIZ().LIZJ("player_prerender_onprepared_to_first_frame", false);
            C56662Kg.LIZ().LIZJ("player_prerender_onprepared_to_setsurface", false);
            C47821Ipl.LJFF = false;
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIJIL();
                LJJJZ();
                this.LJZI = this.LJZL.LJIJJ(800, 0);
            }
            this.LJLLLLLL.unlock();
            LJJJLZIJ(true);
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJJ() {
        SurfaceHolder surfaceHolder;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                if (this.LLIILZL && this.LLIIL == 1 && (surfaceHolder = this.LJLILLLLZI) != null) {
                    surfaceHolder.removeCallback(this.LJLJLLL);
                    this.LJLILLLLZI = null;
                    this.LJZL.LJJI(null);
                    this.LLIILZL = false;
                    String str = LLIIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("testlog: mConnected Cpu ");
                    LIZ.append(this.LLIILZL);
                    O5Y.LJII(str, this, X1D.LIZIZ(LIZ));
                }
                this.LJZL.LIZIZ.LJJIJL();
            }
            this.LJLLLLLL.unlock();
            LJJJLZIJ(false);
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    public final boolean LJJJJLI() {
        C48425IzV c48425IzV = this.LJZL;
        if (c48425IzV == null || c48425IzV.LIZIZ == null) {
            return false;
        }
        return true;
    }

    public final void LJJJZ() {
        try {
            this.LJLLL.lock();
            this.LJLLILLLL = this.LJZL.LIZIZ.LIZLLL(35, -1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reset.mPlayLifeId");
            LIZ.append(this.LJLLILLLL);
            X1D.LIZIZ(LIZ);
        } finally {
            if (this.LJLLL.isLocked()) {
                this.LJLLL.unlock();
            }
        }
    }

    public final void LJJL() {
        boolean z;
        SurfaceHolder surfaceHolder = this.LJLILLLLZI;
        if (surfaceHolder != null && this.LLFFF == 0) {
            if (this.LJLJJLL && this.LJLL) {
                z = true;
            } else {
                z = false;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    public void setupMediaCodec() {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIJIIJIL();
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    public static long getDemuxerFactory(int i) {
        return TTPlayer._getDemuxerFactory(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (X.C1B6.LIZIZ(r12) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        if (X.C1B6.LIZIZ(r12) != false) goto L29;
     */
    @Override // X.AbstractC48434Ize
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(int r15) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJFF(int):java.lang.String");
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJ(int i) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJLJL = false;
                this.LJZL.LIZIZ.LJIILIIL(i);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIL(IMediaDataSource iMediaDataSource) {
        if (iMediaDataSource != null) {
            this.LJLLLLLL.lock();
            try {
                if (LJJJJLI()) {
                    this.LJZL.LIZIZ.LJIJ(iMediaDataSource);
                }
                return;
            } finally {
                this.LJLLLLLL.unlock();
            }
        }
        throw new IllegalArgumentException("null mediadatasource pointer.");
    }

    @Override // X.AbstractC48434Ize
    public final void LJJI(SurfaceHolder surfaceHolder) {
        Surface surface;
        SurfaceHolder surfaceHolder2;
        if (this.LLIIL != 0 && (surfaceHolder2 = this.LJLILLLLZI) == surfaceHolder && surfaceHolder2 != null) {
            return;
        }
        SurfaceHolder surfaceHolder3 = this.LJLILLLLZI;
        if (surfaceHolder3 != null) {
            surfaceHolder3.removeCallback(this.LJLJLLL);
        }
        this.LJLILLLLZI = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.LJLJLLL);
            surface = this.LJLILLLLZI.getSurface();
        } else {
            surface = null;
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJI(surface);
            }
            this.LJLLLLLL.unlock();
            LJJL();
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJII(C47791IpH c47791IpH) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LIZJ = c47791IpH;
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIIJ(boolean z) {
        int i;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                C48425IzV c48425IzV = this.LJZL;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                c48425IzV.getClass();
                try {
                    c48425IzV.LIZIZ.LJJ(12, i);
                } catch (RemoteException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIIZ(boolean z) {
        int i;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                C48425IzV c48425IzV = this.LJZL;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                c48425IzV.LIZIZ.LJJII(i);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIIZI(C47811Ipb c47811Ipb) {
        this.LLIIIJ = c47811Ipb;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(3L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJ(InterfaceC48414IzK interfaceC48414IzK) {
        this.LLII = interfaceC48414IzK;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(13L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIIJI(InterfaceC48415IzL interfaceC48415IzL) {
        this.LLI = interfaceC48415IzL;
        long[] jArr = {0, 45};
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                int i = 0;
                do {
                    this.LJZL.LJJ(jArr[i]);
                    i++;
                } while (i < 2);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIIJIL(VAL val) {
        this.LLIIII = val;
        long[] jArr = {63, 59, 19, 33, 40, 43, 44, 68};
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                int i = 0;
                do {
                    this.LJZL.LJJ(jArr[i]);
                    i++;
                } while (i < 8);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIL(InterfaceC48416IzM interfaceC48416IzM) {
        this.LLFZ = interfaceC48416IzM;
        long[] jArr = {1, 4, 5, 7, 8, 9, 10, 21, 22, 20, 24, 25, 26, 28, 27, 29, 32, 34, 35, 36, 37, 38, 39, 41, 42, 50, 49, 47, 51, 52, 53, 54, 30, 57, 58, 61, 62, 65, 66, 67, 70, 71, 72, 73, 82, 84, 85, 86, 87, 88};
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                int i = 0;
                do {
                    this.LJZL.LJJ(jArr[i]);
                    i++;
                } while (i < 50);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJL(InterfaceC48417IzN interfaceC48417IzN) {
        this.LLIFFJFJJ = interfaceC48417IzN;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(2L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJLIJ(C47811Ipb c47811Ipb) {
        this.LLIIIZ = c47811Ipb;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(23L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIL(C47811Ipb c47811Ipb) {
        this.LLIIIILZ = c47811Ipb;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(12L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIZ(InterfaceC48418IzO interfaceC48418IzO) {
        this.LLIIIL = interfaceC48418IzO;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LJJ(6L);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJ(C46886Iag c46886Iag) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI() && c46886Iag != null) {
                float f = c46886Iag.LIZLLL;
                if (f != -1.0f) {
                    this.LJZL.LIZIZ.LJIJJLI(f, 60);
                }
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJ(Surface surface) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJLJI = surface;
                this.LJZL.LJJI(surface);
            }
            this.LJLLLLLL.unlock();
            if (C56662Kg.LIZ().LJII(" player_setsurface_duration") && !C56662Kg.LIZ().LJIIIIZZ(" player_setsurface_duration")) {
                C56662Kg.LIZ().LJFF(" player_setsurface_duration", false);
                C56662Kg.LIZ().LIZJ("player_setsurface_to_first_frame", false);
            }
        } catch (Throwable th) {
            this.LJLLLLLL.unlock();
            throw th;
        }
    }

    public final void LJJJJZ(int i) {
        try {
            this.LJLLL.lock();
            InterfaceC48414IzK interfaceC48414IzK = this.LLII;
            if (interfaceC48414IzK != null && i >= this.LJLLILLLL) {
                interfaceC48414IzK.LIZ(this.LJLIL);
            }
        } finally {
            if (this.LJLLL.isLocked()) {
                this.LJLLL.unlock();
            }
        }
    }

    public final void LJJJLIIL(int i) {
        InterfaceC47890Iqs interfaceC47890Iqs;
        AbstractC47755Ioh abstractC47755Ioh;
        if (!this.LJLJL && (interfaceC47890Iqs = this.LLIIIILZ) != null) {
            this.LJLJL = true;
            if (i < this.LJLLILLLL || (abstractC47755Ioh = ((C47811Ipb) interfaceC47890Iqs).LIZ.get()) == null) {
                return;
            }
            abstractC47755Ioh.LJIILLIIL();
        }
    }

    public final void LJJJLL(FileDescriptor fileDescriptor) {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            C48425IzV c48425IzV = this.LJZL;
            if (c48425IzV != null) {
                c48425IzV.LIZIZ.LJIJJ(dup.getFd());
            }
        } finally {
            if (dup != null) {
                dup.close();
            }
        }
    }

    public final void LJJJLZIJ(boolean z) {
        this.LJLL = z;
        LJJL();
    }

    @Override // X.AbstractC48434Ize
    public Object getObjectOption(int i) {
        Object obj;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                obj = this.LJZL.LIZIZ.LJFF(i);
            } else {
                obj = null;
            }
            return obj;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public String getSubtitleContent(int i) {
        String str;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                str = this.LJZL.LIZIZ.LJII(i);
            } else {
                str = null;
            }
            return str;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        if (message.what != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleMessage send message prev.thread id:");
            LIZ.append(C16880lQ.LLLLIIIILLL().getId());
            X1D.LIZIZ(LIZ);
        }
        int i = message.arg2;
        int i2 = message.what;
        int i3 = message.arg1;
        Object obj = message.obj;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        LJJJJL(i, i2, i3, str);
        if (message.what != 3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("handleMessage send message after.thread id:");
            LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
            X1D.LIZIZ(LIZ2);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC48434Ize
    public void setABRStrategy(ABRStrategy aBRStrategy) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIILL(aBRStrategy);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    public void setAIBarrageInfo(MaskInfo maskInfo) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIILLIIL(maskInfo);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJIIZILJ(audioProcessor);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public void setLoadControl(LoadControl loadControl) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJI(loadControl);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public void setMaskInfo(MaskInfo maskInfo) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIII(maskInfo);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public void setSubInfo(SubInfo subInfo) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIIZ(subInfo);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    public TTPlayerClient(Context context, HashMap<Integer, Integer> hashMap) {
        this.LJLLI = false;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LJLLLLLL = reentrantReadWriteLock.readLock();
        this.LJLZ = reentrantReadWriteLock.writeLock();
        this.LJZ = 0;
        this.LJZI = 0;
        this.LLF = new StringBuilder(1024);
        this.LLFF = -1;
        this.LLFFF = 0;
        this.LLIIJI = null;
        this.LLIIJLIL = -1;
        this.LLIIL = 0;
        this.LLIILII = 0;
        this.LLIILZL = false;
        this.LLIIJI = hashMap;
        this.LJLLI = false;
        this.LJLJLLL = new SurfaceHolderCallbackC48426IzW(this);
        this.LJLJJI = context;
        if (Looper.myLooper() != null) {
            this.LLFII = new Handler(this);
        } else {
            this.LLFII = new Handler(C16880lQ.LLJJJJ(), this);
        }
    }

    public static synchronized TTPlayerClient create(InterfaceC47775Ip1 interfaceC47775Ip1, Context context) {
        TTPlayerClient create;
        synchronized (TTPlayerClient.class) {
            create = create(interfaceC47775Ip1, context, null);
        }
        return create;
    }

    public static void setGlobalIntOptionForKey(int i, int i2) {
        if (i != 1015) {
            if (i == 1016) {
                u.LJFF(32, i2);
            }
        } else {
            u.LJFF(31, i2);
        }
        if (C48425IzV.LJI) {
            TTPlayer._setGlobalIntForKey(i, i2);
        }
    }

    @Override // X.AbstractC48434Ize
    public final float LIZJ(int i, float f) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                f = this.LJZL.LIZIZ.LIZJ(i, f);
            }
            return f;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LIZLLL(int i, int i2) {
        if (i == 5000) {
            return this.LJZ;
        }
        if (i == 26) {
            return this.LLFF;
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                i2 = this.LJZL.LJIJJ(i, i2);
            }
            return i2;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final long LJ(int i, long j) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                j = this.LJZL.LIZIZ.LJ(i, j);
            }
            return j;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r2 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r2.toLowerCase(java.util.Locale.US).indexOf("://") > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r3.LJLJJL = defpackage.i0.LJFF("file://", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r3.LJLLLLLL.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (LJJJJLI() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r3.LJZL.LIZIZ.LJIJI(r3.LJLJJL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r3.LJLLLLLL.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        r3.LJLJJL = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        if (r2 != null) goto L24;
     */
    @Override // X.AbstractC48434Ize
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(android.content.Context r4, android.net.Uri r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r5.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            java.lang.String r1 = "settings"
            java.lang.String r0 = r5.getAuthority()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
            int r0 = android.media.RingtoneManager.getDefaultType(r5)
            android.net.Uri r5 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r0)
            if (r5 == 0) goto L8c
        L25:
            r2 = 0
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L45 java.io.IOException -> L48
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = r1.openAssetFileDescriptor(r5, r0)     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L45 java.io.IOException -> L48
            if (r2 != 0) goto L33
            return
        L33:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L45 java.io.IOException -> L48
            r3.LJJJLL(r0)     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L45 java.io.IOException -> L48
            r2.close()
            return
        L3e:
            r0 = move-exception
            if (r2 == 0) goto L44
            r2.close()
        L44:
            throw r0
        L45:
            if (r2 == 0) goto L4d
            goto L4a
        L48:
            if (r2 == 0) goto L4d
        L4a:
            r2.close()
        L4d:
            java.lang.String r2 = r5.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r2.toLowerCase(r0)
            java.lang.String r0 = "://"
            int r0 = r1.indexOf(r0)
            if (r0 > 0) goto L6d
            java.lang.String r0 = "file://"
            java.lang.String r0 = defpackage.i0.LJFF(r0, r2)
            r3.LJLJJL = r0
        L67:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LJLLLLLL
            r0.lock()
            goto L70
        L6d:
            r3.LJLJJL = r2
            goto L67
        L70:
            boolean r0 = r3.LJJJJLI()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L7f
            X.IzV r0 = r3.LJZL     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r3.LJLJJL     // Catch: java.lang.Throwable -> L85
            com.ss.ttm.player.TTPlayer r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L85
            r0.LJIJI(r1)     // Catch: java.lang.Throwable -> L85
        L7f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LJLLLLLL
            r0.unlock()
            return
        L85:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LJLLLLLL
            r0.unlock()
            throw r1
        L8c:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "Can't resolve default ringtone"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJIJJ(android.content.Context, android.net.Uri):void");
    }

    @Override // X.AbstractC48434Ize
    public final int LJJIFFI(float f, int i) {
        int i2;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                i2 = this.LJZL.LIZIZ.LJIJJLI(f, i);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIII(int i, int i2) {
        if (i == 1301) {
            if (Looper.myLooper() != null) {
                this.LLFII = new Handler(this);
                return;
            } else {
                this.LLFII = new Handler(C16880lQ.LLJJJJ(), this);
                return;
            }
        }
        if (i == 41) {
            AVResolver.LJFF = i2;
            return;
        }
        if (i == 5003) {
            this.LLFFF = i2;
            return;
        }
        if (i == 952) {
            this.LLIIJLIL = i2;
            return;
        }
        if (i == 1007) {
            this.LLIIL = i2;
        } else if (i == 1036) {
            this.LLIILII = i2;
        } else if (i == 984) {
            if (i2 == 0) {
                i2 = 0;
            } else if (i2 == 1) {
                i2 = 16777216;
            } else if (i2 == 2) {
                i2 = 33554432;
            } else if (i2 == 3 || i2 == 4) {
                i2 = 34603008;
            } else if (i2 == 5) {
                i2 = 50331648;
            } else if (i2 == 6) {
                i2 = 67108864;
            }
            O5Y.LJIIIZ = i2;
        } else if (i == 1501) {
            O5Y.LJIIIZ = i2;
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                C48425IzV c48425IzV = this.LJZL;
                c48425IzV.getClass();
                try {
                    c48425IzV.LIZIZ.LJJ(i, i2);
                } catch (RemoteException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final int LJJIIJZLJL(int i, long j) {
        int i2;
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                i2 = this.LJZL.LIZIZ.LJJIFFI(i, j);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJIL(int i, String str) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIIJZLJL(i, str);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJI(float f, float f2) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIJIIJI(f, f2);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJJL(int i, int i2) {
        if (this.LJZL != null) {
            this.LJLLLLLL.lock();
            try {
                if (LJJJJLI()) {
                    this.LJZL.LIZIZ.LJJIJLIJ(i, i2);
                }
            } finally {
                this.LJLLLLLL.unlock();
            }
        }
    }

    public final void LJJJJLL(int i, int i2) {
        int i3;
        if (this.LLFZ == null) {
            return;
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 41) {
                    if (i != 42) {
                        if (i != 57) {
                            if (i != 58) {
                                if (i != 61) {
                                    if (i != 62) {
                                        switch (i) {
                                            case 7:
                                                C79062V1e.LJI("handleNotify --------------->>>>>>info rendering start:what:", i, "");
                                                i3 = 3;
                                                break;
                                            case 8:
                                                i3 = 801;
                                                break;
                                            case 9:
                                                i3 = 802;
                                                break;
                                            case 10:
                                                i3 = 901;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 20:
                                                        i3 = 251658243;
                                                        break;
                                                    case 21:
                                                        i3 = 251658244;
                                                        break;
                                                    case 22:
                                                        i3 = 251658245;
                                                        break;
                                                    case 23:
                                                        i3 = 251658246;
                                                        break;
                                                    case 24:
                                                        i3 = 251658247;
                                                        break;
                                                    case 25:
                                                        i3 = 251658248;
                                                        break;
                                                    case 26:
                                                        i3 = 251658249;
                                                        break;
                                                    case 27:
                                                        C79062V1e.LJI("handleNotify --------------->>>>>>info video render stall:what:", i, "");
                                                        i3 = 251658250;
                                                        break;
                                                    case 28:
                                                        C79062V1e.LJI("handleNotify --------------->>>>>>info audio render stall:what:", i, "");
                                                        i3 = 251658251;
                                                        break;
                                                    case 29:
                                                        C79062V1e.LJI("handleNotify --------------->>>>>>info audio rendering start:what:", i, "");
                                                        i3 = 251658252;
                                                        break;
                                                    case 30:
                                                        C79062V1e.LJI("handleNotify --------------->>>>>>info ready for display:what:", i, "");
                                                        i3 = -268435390;
                                                        break;
                                                    case 32:
                                                        i3 = 251658253;
                                                        break;
                                                    case 47:
                                                        C79062V1e.LJI("handleNotify --------------->>>>>>info preBuffering  start:what:", i, "");
                                                        i3 = -268435408;
                                                        break;
                                                    case 82:
                                                        i3 = -268435384;
                                                        break;
                                                    case 84:
                                                        i3 = -268435383;
                                                        break;
                                                    case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                                                        i3 = -268435376;
                                                        break;
                                                    case 86:
                                                        i3 = -268435375;
                                                        break;
                                                    case 87:
                                                        i3 = -268435374;
                                                        break;
                                                    case 88:
                                                        i3 = -268435373;
                                                        break;
                                                    case 1000:
                                                        i3 = 16777217;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 34:
                                                                C79062V1e.LJI("handleNotify --------------->>>>>>info video demuxer stall:what:", i, "");
                                                                i3 = -268435442;
                                                                break;
                                                            case 35:
                                                                C79062V1e.LJI("handleNotify --------------->>>>>>info audio demuxer stall:what:", i, "");
                                                                i3 = -268435441;
                                                                break;
                                                            case 36:
                                                                C79062V1e.LJI("handleNotify --------------->>>>>>info video decode stall:what:", i, "");
                                                                i3 = -268435440;
                                                                break;
                                                            case 37:
                                                                C79062V1e.LJI("handleNotify --------------->>>>>>info audio decode stall:what:", i, "");
                                                                i3 = -268435439;
                                                                break;
                                                            case 38:
                                                                i3 = -268435438;
                                                                break;
                                                            case 39:
                                                                C79062V1e.LJI("handleNotify --------------->>>>>>info audio pts back:what:", i, "");
                                                                i3 = -268435437;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case C61447O9r.LJIIJ:
                                                                        i3 = -268435392;
                                                                        break;
                                                                    case 50:
                                                                        i3 = -268435391;
                                                                        break;
                                                                    case 51:
                                                                        i3 = -268435407;
                                                                        break;
                                                                    case 52:
                                                                        i3 = -268435406;
                                                                        break;
                                                                    case 53:
                                                                        C79062V1e.LJI("handleNotify --------------->>>>>>formater start:what:", i, "");
                                                                        i3 = -268435405;
                                                                        break;
                                                                    case 54:
                                                                        C79062V1e.LJI("handleNotify --------------->>>>>>decoder start:what:", i, "");
                                                                        i3 = -268435404;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 65:
                                                                                i3 = -268435435;
                                                                                break;
                                                                            case 66:
                                                                                i3 = -268435434;
                                                                                break;
                                                                            case 67:
                                                                                i3 = -268435389;
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 70:
                                                                                        i3 = -268435388;
                                                                                        break;
                                                                                    case 71:
                                                                                        i3 = -268435387;
                                                                                        break;
                                                                                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                                                                                        i3 = -268435386;
                                                                                        break;
                                                                                    case 73:
                                                                                        i3 = -268435385;
                                                                                        break;
                                                                                    default:
                                                                                        i3 = -1;
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    } else {
                                        i3 = -268435436;
                                    }
                                } else {
                                    i3 = -268435401;
                                }
                            } else {
                                i3 = -268435402;
                            }
                        } else {
                            i3 = -268435403;
                        }
                    } else {
                        C79062V1e.LJI("handleNotify --------------->>>>>>info rtc audio decode stall:what:", i, "");
                        i3 = -268435423;
                    }
                } else {
                    C79062V1e.LJI("handleNotify --------------->>>>>>info rtc video decode stall:what:", i, "");
                    i3 = -268435424;
                }
            } else {
                C79062V1e.LJI("handleNotify --------------->>>>>>info buffering  end:what:", i, "");
                i3 = 702;
            }
        } else {
            C79062V1e.LJI("handleNotify --------------->>>>>>info buffering  start:what:", i, "");
            i3 = 701;
        }
        this.LLFZ.LJ(this.LJLIL, i3, i2);
    }

    public final void LJJJJZI(int i, int i2) {
        try {
            this.LJLLL.lock();
            InterfaceC48415IzL interfaceC48415IzL = this.LLI;
            if (interfaceC48415IzL != null && i2 >= this.LJLLILLLL) {
                int i3 = this.LJZ;
                if (i3 == 0) {
                    if (i == 0) {
                        i = -1048575;
                    }
                } else {
                    i = i3;
                }
                interfaceC48415IzL.LIZJ(this.LJLIL, i, 0);
            }
        } finally {
            if (this.LJLLL.isLocked()) {
                this.LJLLL.unlock();
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public void seekTo(int i, int i2) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJLJL = false;
                this.LJZL.LIZIZ.LJIILJJIL(i, i2);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public void setTraitObject(int i, TraitObject traitObject) {
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIIZI(i, traitObject);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    public static synchronized TTPlayerClient create(InterfaceC47775Ip1 interfaceC47775Ip1, Context context, HashMap<Integer, Integer> hashMap) {
        TTPlayerClient tTPlayerClient;
        synchronized (TTPlayerClient.class) {
            TTVersion.LIZ();
            tTPlayerClient = new TTPlayerClient(context, hashMap);
            tTPlayerClient.LJZL = QZV.LJIIIZ(context, tTPlayerClient, hashMap);
            tTPlayerClient.LJLIL = interfaceC47775Ip1;
        }
        return tTPlayerClient;
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJJLI(Context context, Uri uri, Map<String, String> map) {
        if (uri == null) {
            return;
        }
        LJIJJ(context, uri);
        if (map == null || map.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), ": ", entry));
            sb.append("\r\n");
        }
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                C48425IzV c48425IzV = this.LJZL;
                c48425IzV.LIZIZ.LJJIIJZLJL(20, sb.toString());
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJ(FileDescriptor fileDescriptor, long j, long j2) {
        LJJJLL(fileDescriptor);
        this.LJLLLLLL.lock();
        try {
            if (LJJJJLI()) {
                this.LJZL.LIZIZ.LJJIFFI(135, j);
                this.LJZL.LIZIZ.LJJIFFI(136, j2);
            }
        } finally {
            this.LJLLLLLL.unlock();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x003b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(int r11, int r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJJJJL(int, int, int, java.lang.String):void");
    }
}
