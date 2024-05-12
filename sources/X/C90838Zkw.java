package X;

import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.Dispatcher;
import com.google.android.gms.cast.MediaStatus;

/* renamed from: X.Zkw, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90838Zkw extends AbstractC90122ZYo {
    public final /* synthetic */ C90506Zfa LIZ;

    @Override // X.AbstractC90122ZYo
    public final void LIZIZ() {
    }

    @Override // X.AbstractC90122ZYo
    public final void LIZ() {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onAdBreakStatusUpdated");
    }

    @Override // X.AbstractC90122ZYo
    public final void LIZJ() {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onMetadataUpdated");
    }

    @Override // X.AbstractC90122ZYo
    public final void LIZLLL() {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onPreloadStatusUpdated");
    }

    @Override // X.AbstractC90122ZYo
    public final void LJ() {
        C90506Zfa c90506Zfa = this.LIZ;
        c90506Zfa.getClass();
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 29));
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onQueueStatusUpdated");
    }

    @Override // X.AbstractC90122ZYo
    public final void LJFF() {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onSendingRemoteMediaRequest");
    }

    @Override // X.AbstractC90122ZYo
    public final void LJI() {
        int i;
        InterfaceC90503ZfX interfaceC90503ZfX;
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onStatusUpdated");
        C90506Zfa c90506Zfa = this.LIZ;
        c90506Zfa.getClass();
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 29));
        C90639Zhj LJ = this.LIZ.LJ(null);
        if (LJ == null) {
            return;
        }
        C90506Zfa c90506Zfa2 = this.LIZ;
        int i2 = c90506Zfa2.LJIILL;
        int i3 = c90506Zfa2.LJIILLIIL;
        c90506Zfa2.LJIILL = LJ.LJII();
        C90506Zfa c90506Zfa3 = this.LIZ;
        synchronized (LJ.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            MediaStatus LJI = LJ.LJI();
            if (LJI != null) {
                i = LJI.zzf;
            } else {
                i = 0;
            }
        }
        c90506Zfa3.LJIILLIIL = i;
        C90506Zfa c90506Zfa4 = this.LIZ;
        int i4 = c90506Zfa4.LJIILL;
        if (i4 == i2 && (i4 != 1 || c90506Zfa4.LJIILLIIL == i3)) {
            return;
        }
        CastLogger castLogger = c90506Zfa4.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lastPlayState: ");
        LIZ.append(i2);
        LIZ.append(", lastIdleReason: ");
        LIZ.append(i3);
        LIZ.append(", mPlayState: ");
        LIZ.append(this.LIZ.LJIILL);
        LIZ.append(", mIdleReason: ");
        LIZ.append(this.LIZ.LJIILLIIL);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        C90506Zfa c90506Zfa5 = this.LIZ;
        int i5 = c90506Zfa5.LJIILL;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4 || (interfaceC90503ZfX = c90506Zfa5.LJI) == null) {
                        return;
                    }
                    C90780Zk0 c90780Zk0 = (C90780Zk0) interfaceC90503ZfX;
                    c90780Zk0.LIZIZ.LJII.d("ChromeCastSourceWrapper", "onLoading");
                    if (c90780Zk0.LIZ == null) {
                        return;
                    }
                    c90780Zk0.LIZIZ.LIZIZ.execute(new IDRunnableS86S0100000_24(c90780Zk0, 10));
                    return;
                }
                InterfaceC90503ZfX interfaceC90503ZfX2 = c90506Zfa5.LJI;
                if (interfaceC90503ZfX2 == null) {
                    return;
                }
                C90780Zk0 c90780Zk02 = (C90780Zk0) interfaceC90503ZfX2;
                c90780Zk02.LIZIZ.LJII.d("ChromeCastSourceWrapper", "onPause");
                if (c90780Zk02.LIZ == null) {
                    return;
                }
                c90780Zk02.LIZIZ.LIZIZ.execute(new IDRunnableS86S0100000_24(c90780Zk02, 12));
                return;
            }
            if (c90506Zfa5.LJI == null || c90506Zfa5.LJIILLIIL != 0) {
                return;
            }
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa5, 29));
            C90780Zk0 c90780Zk03 = (C90780Zk0) this.LIZ.LJI;
            c90780Zk03.LIZIZ.LJII.d("ChromeCastSourceWrapper", "onStart");
            if (c90780Zk03.LIZ == null) {
                return;
            }
            c90780Zk03.LIZIZ.LIZIZ.execute(new IDRunnableS86S0100000_24(c90780Zk03, 11));
            return;
        }
        int i6 = c90506Zfa5.LJIILLIIL;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    return;
                }
                InterfaceC90503ZfX interfaceC90503ZfX3 = c90506Zfa5.LJI;
                if (interfaceC90503ZfX3 != null) {
                    C90780Zk0 c90780Zk04 = (C90780Zk0) interfaceC90503ZfX3;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onError what:");
                    LIZ2.append(210010);
                    LIZ2.append(", extra:");
                    LIZ2.append(4);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    c90780Zk04.LIZIZ.LJII.d("ChromeCastSourceWrapper", LIZIZ);
                    if (c90780Zk04.LIZ != null) {
                        c90780Zk04.LIZIZ.LIZIZ.execute(new RunnableC90420ZeC(c90780Zk04, LIZIZ));
                    }
                }
                this.LIZ.LJIL.getSourceMonitor().trackByteCastPlayFailureProtocol("ChromeCast", 210010, String.valueOf(4), this.LIZ.LJJIIJZLJL);
                this.LIZ.LJJ.getSourceMonitorUtils().trackByteCastPlayFailureProtocol("ChromeCast", 210010, String.valueOf(4), this.LIZ.LJJIIJZLJL);
                return;
            }
            InterfaceC90503ZfX interfaceC90503ZfX4 = c90506Zfa5.LJI;
            if (interfaceC90503ZfX4 == null) {
                return;
            }
            C90780Zk0 c90780Zk05 = (C90780Zk0) interfaceC90503ZfX4;
            c90780Zk05.LIZIZ.LJII.d("ChromeCastSourceWrapper", "onStop");
            if (c90780Zk05.LIZ == null) {
                return;
            }
            c90780Zk05.LIZIZ.LIZIZ.execute(new IDRunnableS86S0100000_24(c90780Zk05, 14));
            return;
        }
        InterfaceC90503ZfX interfaceC90503ZfX5 = c90506Zfa5.LJI;
        if (interfaceC90503ZfX5 == null || i2 != 2) {
            return;
        }
        C90780Zk0 c90780Zk06 = (C90780Zk0) interfaceC90503ZfX5;
        c90780Zk06.LIZIZ.LJII.d("ChromeCastSourceWrapper", "onCompletion");
        if (c90780Zk06.LIZ == null) {
            return;
        }
        c90780Zk06.LIZIZ.LIZIZ.execute(new IDRunnableS86S0100000_24(c90780Zk06, 13));
    }

    public C90838Zkw(C90506Zfa c90506Zfa) {
        this.LIZ = c90506Zfa;
    }
}
