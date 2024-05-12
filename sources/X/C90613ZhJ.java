package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.Feature;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZhJ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90613ZhJ extends ZYQ {
    public static final C90469Zez LJIIL = new C90469Zez("CastSession");
    public final Context LIZJ;
    public final java.util.Set<C90218Zaw> LIZLLL;
    public final InterfaceC90112ZYe LJ;
    public final CastOptions LJFF;
    public final C90788Zk8 LJI;
    public C90880Zlc LJII;
    public C90639Zhj LJIIIIZZ;
    public CastDevice LJIIIZ;
    public InterfaceC90654Zhy LJIIJ;
    public C90319ZcZ LJIIJJI;

    @Override // X.ZYQ
    public final long LIZIZ() {
        QH7.LJ("Must be called from the main thread.");
        C90639Zhj c90639Zhj = this.LJIIIIZZ;
        if (c90639Zhj == null) {
            return 0L;
        }
        return c90639Zhj.LJIIIIZZ() - this.LJIIIIZZ.LIZJ();
    }

    public final C90639Zhj LJIIIIZZ() {
        QH7.LJ("Must be called from the main thread.");
        return this.LJIIIIZZ;
    }

    public final double LJIIIZ() {
        QH7.LJ("Must be called from the main thread.");
        C90880Zlc c90880Zlc = this.LJII;
        if (c90880Zlc != null) {
            c90880Zlc.LJII();
            return c90880Zlc.LJIJJLI;
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // X.ZYQ
    public final void LIZ(boolean z) {
        C90613ZhJ LIZJ;
        InterfaceC90112ZYe interfaceC90112ZYe = this.LJ;
        if (interfaceC90112ZYe != null) {
            try {
                interfaceC90112ZYe.LJJLJLI(z);
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LJIIL;
                C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
                c90469Zez.getClass();
            }
            InterfaceC90109ZYb interfaceC90109ZYb = this.LIZ;
            if (interfaceC90109ZYb != null) {
                try {
                    interfaceC90109ZYb.LJLLILLLL(0);
                } catch (RemoteException unused2) {
                    C90469Zez c90469Zez2 = ZYQ.LIZIZ;
                    C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                    c90469Zez2.getClass();
                }
            }
            C90319ZcZ c90319ZcZ = this.LJIIJJI;
            if (c90319ZcZ == null || c90319ZcZ.LIZIZ == 0 || c90319ZcZ.LJ == null) {
                return;
            }
            C90319ZcZ.LJFF.getClass();
            Iterator it = new HashSet(c90319ZcZ.LIZ).iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            c90319ZcZ.LIZIZ = 0;
            c90319ZcZ.LJ = null;
            ZYS zys = c90319ZcZ.LIZJ;
            if (zys == null || (LIZJ = zys.LIZJ()) == null) {
                return;
            }
            LIZJ.LJIIJJI = null;
        }
    }

    @Override // X.ZYQ
    public final void LIZLLL(Bundle bundle) {
        this.LJIIIZ = CastDevice.LJJJJL(bundle);
    }

    @Override // X.ZYQ
    public final void LJ(Bundle bundle) {
        this.LJIIIZ = CastDevice.LJJJJL(bundle);
    }

    @Override // X.ZYQ
    public final void LJFF(Bundle bundle) {
        LJIILJJIL(bundle);
    }

    @Override // X.ZYQ
    public final void LJI(Bundle bundle) {
        LJIILJJIL(bundle);
    }

    @Override // X.ZYQ
    public final void LJII(Bundle bundle) {
        this.LJIIIZ = CastDevice.LJJJJL(bundle);
    }

    public final void LJIIJ(final boolean z) {
        QH7.LJ("Must be called from the main thread.");
        final C90880Zlc c90880Zlc = this.LJII;
        if (c90880Zlc != null) {
            C67887Qkd c67887Qkd = new C67887Qkd();
            c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC67935QlP
                public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                    C90880Zlc c90880Zlc2 = C90880Zlc.this;
                    boolean z2 = z;
                    c90880Zlc2.getClass();
                    C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                    double d = c90880Zlc2.LJIJJLI;
                    boolean z3 = c90880Zlc2.LJIL;
                    Parcel LJLJI = c90232ZbA.LJLJI();
                    LJLJI.writeInt(z2 ? 1 : 0);
                    LJLJI.writeDouble(d);
                    LJLJI.writeInt(z3 ? 1 : 0);
                    c90232ZbA.LLZZJLIL(LJLJI, 8);
                    ((C67649Qgn) obj).LIZIZ(null);
                }
            };
            c67887Qkd.LIZLLL = 8412;
            c90880Zlc.LIZLLL(1, c67887Qkd.LIZ());
        }
    }

    public final void LJIIJJI(final double d) {
        QH7.LJ("Must be called from the main thread.");
        final C90880Zlc c90880Zlc = this.LJII;
        if (c90880Zlc != null) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                C67887Qkd c67887Qkd = new C67887Qkd();
                c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgV
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC67935QlP
                    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                        C90880Zlc c90880Zlc2 = C90880Zlc.this;
                        double d2 = d;
                        c90880Zlc2.getClass();
                        C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                        double d3 = c90880Zlc2.LJIJJLI;
                        boolean z = c90880Zlc2.LJIL;
                        Parcel LJLJI = c90232ZbA.LJLJI();
                        LJLJI.writeDouble(d2);
                        LJLJI.writeDouble(d3);
                        LJLJI.writeInt(z ? 1 : 0);
                        c90232ZbA.LLZZJLIL(LJLJI, 7);
                        ((C67649Qgn) obj).LIZIZ(null);
                    }
                };
                c67887Qkd.LIZLLL = 8411;
                c90880Zlc.LIZLLL(1, c67887Qkd.LIZ());
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Volume cannot be ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void LJIILJJIL(Bundle bundle) {
        CastMediaOptions castMediaOptions;
        boolean z;
        boolean z2;
        CastDevice LJJJJL = CastDevice.LJJJJL(bundle);
        this.LJIIIZ = LJJJJL;
        if (LJJJJL == null) {
            QH7.LJ("Must be called from the main thread.");
            InterfaceC90109ZYb interfaceC90109ZYb = this.LIZ;
            if (interfaceC90109ZYb != null) {
                try {
                    if (interfaceC90109ZYb.LJJIJIIJIL()) {
                        InterfaceC90109ZYb interfaceC90109ZYb2 = this.LIZ;
                        if (interfaceC90109ZYb2 != null) {
                            try {
                                interfaceC90109ZYb2.LJJ(2153);
                                return;
                            } catch (RemoteException unused) {
                                C90469Zez c90469Zez = ZYQ.LIZIZ;
                                C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                                c90469Zez.getClass();
                                return;
                            }
                        }
                        return;
                    }
                } catch (RemoteException unused2) {
                    C90469Zez c90469Zez2 = ZYQ.LIZIZ;
                    C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                    c90469Zez2.getClass();
                }
            }
            InterfaceC90109ZYb interfaceC90109ZYb3 = this.LIZ;
            if (interfaceC90109ZYb3 != null) {
                try {
                    interfaceC90109ZYb3.LJJIIJ(2151);
                    return;
                } catch (RemoteException unused3) {
                    C90469Zez c90469Zez3 = ZYQ.LIZIZ;
                    C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                    c90469Zez3.getClass();
                    return;
                }
            }
            return;
        }
        C90880Zlc c90880Zlc = this.LJII;
        NotificationOptions notificationOptions = null;
        if (c90880Zlc != null) {
            c90880Zlc.LJIIJ();
            this.LJII = null;
        }
        LJIIL.getClass();
        CastDevice castDevice = this.LJIIIZ;
        QH7.LJIIIIZZ(castDevice);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.LJFF;
        if (castOptions == null) {
            castMediaOptions = null;
        } else {
            castMediaOptions = castOptions.zzf;
            if (castMediaOptions != null) {
                notificationOptions = castMediaOptions.zze;
            }
        }
        if (castMediaOptions != null && castMediaOptions.zzf) {
            z = true;
        } else {
            z = false;
        }
        Intent intent = new Intent(this.LIZJ, (Class<?>) C90511Zff.class);
        intent.setPackage(this.LIZJ.getPackageName());
        boolean z3 = !this.LIZJ.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        if (notificationOptions != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z2);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z3);
        C90217Zav c90217Zav = new C90217Zav(castDevice, new C90621ZhR(this));
        c90217Zav.LIZJ = bundle2;
        final C90880Zlc c90880Zlc2 = new C90880Zlc(this.LIZJ, new C90655Zhz(c90217Zav));
        c90880Zlc2.LJJIIZ.add(new C90622ZhS(this));
        this.LJII = c90880Zlc2;
        BinderC90879Zlb binderC90879Zlb = c90880Zlc2.LJIIJ;
        Looper looper = c90880Zlc2.LJFF;
        QH7.LJIIIZ(binderC90879Zlb, "Listener must not be null");
        QH7.LJIIIZ(looper, "Looper must not be null");
        C67890Qkg<L> c67890Qkg = new C67890Qkg<>(looper, binderC90879Zlb);
        C67888Qke c67888Qke = new C67888Qke();
        InterfaceC67935QlP<A, C67649Qgn<Void>> interfaceC67935QlP = new InterfaceC67935QlP() { // from class: X.ZgU
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC67935QlP
            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                C90880Zlc c90880Zlc3 = C90880Zlc.this;
                AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) interfaceC67836Qjo;
                C90232ZbA c90232ZbA = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                BinderC90879Zlb binderC90879Zlb2 = c90880Zlc3.LJIIJ;
                Parcel LJLJI = c90232ZbA.LJLJI();
                C90257ZbZ.LIZJ(LJLJI, binderC90879Zlb2);
                c90232ZbA.LLZZJLIL(LJLJI, 18);
                C90232ZbA c90232ZbA2 = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                c90232ZbA2.LLZZJLIL(c90232ZbA2.LJLJI(), 17);
                ((C67649Qgn) obj).LIZIZ(null);
            }
        };
        C90560ZgS c90560ZgS = new InterfaceC67935QlP() { // from class: X.ZgS
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC67935QlP
            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                c90232ZbA.LLZZJLIL(c90232ZbA.LJLJI(), 19);
                ((C67649Qgn) obj).LIZIZ(Boolean.TRUE);
            }
        };
        c67888Qke.LIZLLL = c67890Qkg;
        c67888Qke.LIZ = interfaceC67935QlP;
        c67888Qke.LIZIZ = c90560ZgS;
        c67888Qke.LJ = new Feature[]{C90069ZWn.LIZ};
        c67888Qke.LJI = 8428;
        C67891Qkh<L> c67891Qkh = c67888Qke.LIZLLL.LIZIZ;
        QH7.LJIIIZ(c67891Qkh, "Key must not be null");
        C67890Qkg<L> c67890Qkg2 = c67888Qke.LIZLLL;
        Feature[] featureArr = c67888Qke.LJ;
        boolean z4 = c67888Qke.LJFF;
        int i = c67888Qke.LJI;
        C67922QlC c67922QlC = new C67922QlC(c67888Qke, c67890Qkg2, featureArr, z4, i);
        C67928QlI c67928QlI = new C67928QlI(c67888Qke, c67891Qkh);
        RunnableC67982QmA runnableC67982QmA = c67888Qke.LIZJ;
        QH7.LJIIIZ(c67890Qkg2.LIZIZ, "Listener has already been released.");
        C67824Qjc c67824Qjc = c90880Zlc2.LJIIIZ;
        c67824Qjc.getClass();
        C67649Qgn c67649Qgn = new C67649Qgn();
        c67824Qjc.LJFF(c67649Qgn, i, c90880Zlc2);
        C67833Qjl c67833Qjl = new C67833Qjl(new C67902Qks(c67922QlC, c67928QlI, runnableC67982QmA), c67649Qgn);
        HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(8, new C67894Qkk(c67833Qjl, c67824Qjc.LJLJLLL.get(), c90880Zlc2)));
    }

    public static void LJIIL(C90613ZhJ c90613ZhJ, int i) {
        C90788Zk8 c90788Zk8 = c90613ZhJ.LJI;
        if (c90788Zk8.LJIIJJI) {
            c90788Zk8.LJIIJJI = false;
            C90639Zhj c90639Zhj = c90788Zk8.LJIIIIZZ;
            if (c90639Zhj != null) {
                QH7.LJ("Must be called from the main thread.");
                ((CopyOnWriteArrayList) c90639Zhj.LJI).remove(c90788Zk8);
            }
            c90788Zk8.LIZJ.LLJI(null);
            C90423ZeF c90423ZeF = c90788Zk8.LJ;
            c90423ZeF.LIZIZ();
            c90423ZeF.LJ = null;
            C90423ZeF c90423ZeF2 = c90788Zk8.LJFF;
            if (c90423ZeF2 != null) {
                c90423ZeF2.LIZIZ();
                c90423ZeF2.LJ = null;
            }
            MediaSessionCompat mediaSessionCompat = c90788Zk8.LJIIJ;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.LIZ.LIZ.setSessionActivity(null);
                c90788Zk8.LJIIJ.LJFF(null, null);
                c90788Zk8.LJIIJ.LJI(new C01P().LIZ());
                c90788Zk8.LJIILJJIL(0, null);
                c90788Zk8.LJIIJ.LJ(false);
                c90788Zk8.LJIIJ.LIZLLL();
                c90788Zk8.LJIIJ = null;
            }
            c90788Zk8.LJIIIIZZ = null;
            c90788Zk8.LJIIIZ = null;
            c90788Zk8.LJIIL();
            if (i == 0) {
                c90788Zk8.LJIILIIL();
            }
        }
        C90880Zlc c90880Zlc = c90613ZhJ.LJII;
        if (c90880Zlc != null) {
            c90880Zlc.LJIIJ();
            c90613ZhJ.LJII = null;
        }
        c90613ZhJ.LJIIIZ = null;
        C90639Zhj c90639Zhj2 = c90613ZhJ.LJIIIIZZ;
        if (c90639Zhj2 != null) {
            c90639Zhj2.LJJ(null);
            c90613ZhJ.LJIIIIZZ = null;
        }
    }

    public static void LJIILIIL(C90613ZhJ c90613ZhJ, AbstractC67638Qgc abstractC67638Qgc) {
        if (c90613ZhJ.LJ == null) {
            return;
        }
        try {
            if (abstractC67638Qgc.LJIILIIL()) {
                InterfaceC90654Zhy interfaceC90654Zhy = (InterfaceC90654Zhy) abstractC67638Qgc.LJIIIZ();
                c90613ZhJ.LJIIJ = interfaceC90654Zhy;
                if (interfaceC90654Zhy.getStatus() != null && interfaceC90654Zhy.getStatus().LJJJJL()) {
                    LJIIL.getClass();
                    C90639Zhj c90639Zhj = new C90639Zhj(new C90827Zkl());
                    c90613ZhJ.LJIIIIZZ = c90639Zhj;
                    c90639Zhj.LJJ(c90613ZhJ.LJII);
                    c90613ZhJ.LJIIIIZZ.LJIL();
                    C90788Zk8 c90788Zk8 = c90613ZhJ.LJI;
                    C90639Zhj c90639Zhj2 = c90613ZhJ.LJIIIIZZ;
                    QH7.LJ("Must be called from the main thread.");
                    c90788Zk8.LIZ(c90639Zhj2, c90613ZhJ.LJIIIZ);
                    InterfaceC90112ZYe interfaceC90112ZYe = c90613ZhJ.LJ;
                    ApplicationMetadata LJJIIJ = interfaceC90654Zhy.LJJIIJ();
                    QH7.LJIIIIZZ(LJJIIJ);
                    String LJIJ = interfaceC90654Zhy.LJIJ();
                    String sessionId = interfaceC90654Zhy.getSessionId();
                    QH7.LJIIIIZZ(sessionId);
                    interfaceC90112ZYe.v0(LJJIIJ, LJIJ, sessionId, interfaceC90654Zhy.LJJIZ());
                    return;
                }
                if (interfaceC90654Zhy.getStatus() != null) {
                    LJIIL.getClass();
                    c90613ZhJ.LJ.LJIILL(interfaceC90654Zhy.getStatus().zzc);
                    return;
                }
            } else {
                Exception LJIIIIZZ = abstractC67638Qgc.LJIIIIZZ();
                if (LJIIIIZZ instanceof ETK) {
                    c90613ZhJ.LJ.LJIILL(((ETK) LJIIIIZZ).getStatusCode());
                    return;
                }
            }
            c90613ZhJ.LJ.LJIILL(2476);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LJIIL;
            C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
            c90469Zez.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C90613ZhJ(android.content.Context r5, java.lang.String r6, java.lang.String r7, com.google.android.gms.cast.framework.CastOptions r8, X.C90788Zk8 r9) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.LIZLLL = r0
            android.content.Context r0 = X.C16880lQ.LLLLL(r5)
            r4.LIZJ = r0
            r4.LJFF = r8
            r4.LJI = r9
            X.ZYb r0 = r4.LIZ
            r3 = 0
            if (r0 == 0) goto L28
            X.Qp5 r2 = r0.LIZJ()     // Catch: android.os.RemoteException -> L1e
            goto L29
        L1e:
            X.Zez r1 = X.ZYQ.LIZIZ
            java.lang.Class<X.ZYb> r0 = X.InterfaceC90109ZYb.class
            X.C16880lQ.LJLLJ(r0)
            r1.getClass()
        L28:
            r2 = r3
        L29:
            X.ZlS r1 = new X.ZlS
            r1.<init>(r4)
            if (r2 != 0) goto L33
        L30:
            r4.LJ = r3
            return
        L33:
            X.ZcA r0 = X.C90282Zby.LIZ(r5)     // Catch: java.lang.Throwable -> L3c
            X.ZYe r3 = r0.LLF(r8, r2, r1)     // Catch: java.lang.Throwable -> L3c
            goto L30
        L3c:
            X.Zez r1 = X.C90282Zby.LIZ
            java.lang.Class<X.ZcA> r0 = X.InterfaceC90294ZcA.class
            X.C16880lQ.LJLLJ(r0)
            r1.getClass()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90613ZhJ.<init>(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.cast.framework.CastOptions, X.Zk8):void");
    }
}
