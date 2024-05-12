package X;

import Y.ACallableS104S0100000_1;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71052qb {
    public C90459Zep LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public InterfaceC71012qX LJ;
    public C34J LJFF;
    public InterfaceC70982qU LJI;
    public C34Z LJII;
    public Aweme LJIIIIZZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C71062qc.LJLIL);
    public final XLM LJIIIZ = V8H.LIZ(Boolean.FALSE);

    public final XLM LJII() {
        synchronized (this) {
            C70922qO.LIZ("CastingManager", "start initSDK");
            if (this.LIZLLL) {
                return this.LJIIIZ;
            }
            this.LIZLLL = true;
            XKX.LIZLLL(LJFF(), null, null, new C70942qQ(this, null), 3);
            return this.LJIIIZ;
        }
    }

    public final InterfaceC70422pa LJFF() {
        return (InterfaceC70422pa) this.LIZ.getValue();
    }

    public final void LIZ() {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addVolume isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LIZJ();
        }
    }

    public final void LJIIIIZZ() {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJIIZILJ();
        }
    }

    public final void LJIIJJI() {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resume isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJIJJ();
        }
    }

    public final void LJIILJJIL() {
        C90459Zep c90459Zep;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopBrowseService isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null) {
            c90459Zep.LJIILL();
        }
    }

    public final void LJIILL() {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subVolume isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJJ();
        }
    }

    public static void LJIIL(InterfaceC65784Pro interfaceC65784Pro) {
        C10K.LIZIZ(new ACallableS104S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0), C10K.LJIIIIZZ, null);
    }

    public final void LIZLLL(ServiceInfo serviceInfo) {
        C90459Zep c90459Zep;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null) {
            c90459Zep.LIZ(serviceInfo);
        }
    }

    public final void LJ(ServiceInfo device) {
        C90459Zep c90459Zep;
        o.LJIIIZ(device, "device");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disconnect isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null) {
            c90459Zep.LIZJ(device);
        }
    }

    public final void LJI(ServiceInfo serviceInfo) {
        C90459Zep c90459Zep;
        o.LJIIIZ(serviceInfo, "serviceInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSinkDeviceInfo isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null) {
            c90459Zep.LJFF(serviceInfo);
        }
    }

    public final void LJIIIZ(PlayerInfo playerInfo) {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJIJ(playerInfo);
        }
    }

    public final void LJIIJ(String aid) {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        o.LJIIIZ(aid, "aid");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playById isInitialized: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", aid: ");
        LIZ.append(aid);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJIJI(aid);
        }
    }

    public final void LJIILIIL(long j) {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seekTo isInitialized: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", position: ");
        LIZ.append(j);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LJIJJLI(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r4, java.util.List r5) {
        /*
            r3 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r2 = "CastingManager"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "append isInitialized: "
            r1.append(r0)
            boolean r0 = r3.LIZJ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C70922qO.LIZ(r2, r0)
            boolean r0 = r3.LIZJ
            if (r0 != 0) goto L21
            return
        L21:
            X.34Z r0 = r3.LJII
            if (r0 != 0) goto L2c
            X.34Z r0 = new X.34Z
            r0.<init>()
            r3.LJII = r0
        L2c:
            X.34Z r2 = r3.LJII
            if (r2 == 0) goto L51
            monitor-enter(r2)
            r0 = 0
            X.OSZ r0 = X.C34Z.LIZLLL(r0, r5)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Throwable -> L4d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4d
            r2.LIZ(r4, r0)     // Catch: java.lang.Throwable -> L4d
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L50
        L45:
            java.lang.String r1 = r2.LJLJJI     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "distilled playlist has no castable items. Returning"
            X.C70922qO.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L50:
            monitor-exit(r2)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71052qb.LIZIZ(java.lang.String, java.util.List):void");
    }

    public final void LIZJ(DramaBean[] dramaBeanArr, String insertBeforeDramaId, IResultListener resultListener) {
        C90459Zep c90459Zep;
        C90442ZeY LJ;
        o.LJIIIZ(insertBeforeDramaId, "insertBeforeDramaId");
        o.LJIIIZ(resultListener, "resultListener");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("append isInitialized: ");
        LIZ.append(this.LIZJ);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ && (c90459Zep = this.LIZIZ) != null && (LJ = c90459Zep.LJ()) != null) {
            LJ.LIZ(dramaBeanArr, insertBeforeDramaId, resultListener);
        }
    }
}
