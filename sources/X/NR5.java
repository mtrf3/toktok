package X;

import Y.ARunnableS21S0300000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NR5 implements NSR {
    public final java.util.Map<String, String> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final java.util.Map<String, NQR> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final java.util.Map<String, C59753Ncj> LIZJ = Collections.synchronizedMap(new LinkedHashMap());
    public final NRH LIZLLL;
    public NRE LJ;
    public final Handler LJFF;
    public int LJI;
    public long LJII;
    public int LJIIIIZZ;
    public NRF LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC59118NIc LJIIL;
    public final C62822Ol8 LJIILIIL;

    public final long LJIILJJIL() {
        InterfaceC65784Pro<Long> duration;
        InterfaceC59118NIc interfaceC59118NIc = this.LJIIL;
        if (interfaceC59118NIc != null && (duration = interfaceC59118NIc.getDuration()) != null) {
            return duration.invoke().longValue();
        }
        return 0L;
    }

    public final String LJIILL() {
        InterfaceC65784Pro<C59079NGp> tracker;
        C59079NGp invoke;
        String str;
        InterfaceC59118NIc interfaceC59118NIc = this.LJIIL;
        if (interfaceC59118NIc == null || (tracker = interfaceC59118NIc.getTracker()) == null || (invoke = tracker.invoke()) == null || (str = invoke.LIZ) == null) {
            return "unknown";
        }
        return str;
    }

    public final InterfaceC88471Ynr<String, String, C76800UCe> LJIILLIIL() {
        InterfaceC88471Ynr<String, String, C76800UCe> LJIILL;
        InterfaceC59118NIc interfaceC59118NIc = this.LJIIL;
        if (interfaceC59118NIc == null || (LJIILL = interfaceC59118NIc.LJIILL()) == null) {
            return NRN.LJLIL;
        }
        return LJIILL;
    }

    public final Runnable LJIJI() {
        return (Runnable) this.LJIILIIL.getValue();
    }

    public NR5() {
        Context LIZIZ = EF7.LIZIZ();
        NRH nrh = new NRH(LIZIZ);
        this.LIZLLL = nrh;
        this.LJFF = new Handler(C16880lQ.LLJJJJ());
        this.LJII = -1L;
        nrh.LIZJ = new C59435NUh(nrh);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        C16880lQ.LJJLIIIJJI(LIZIZ, nrh.LIZJ, intentFilter, null);
        this.LJIILIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 475));
    }

    @Override // X.NRC
    public final InterfaceC59118NIc LIZ() {
        return this.LJIIL;
    }

    @Override // X.NRC
    public final void LIZIZ(InterfaceC59118NIc listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIL = listener;
    }

    @Override // X.NSR
    public final String LJ(NRF data) {
        o.LJIIIZ(data, "data");
        NRM nrm = (NRM) ListProtector.get(data.LIZIZ, 0);
        String str = nrm.LJLIL;
        String str2 = nrm.LJLILLLLZI;
        String str3 = nrm.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        String LJIIIIZZ = h.LJIIIIZZ(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(javascriptReso… + verificationParameter)");
        return LJIIIIZZ;
    }

    public final void LJIL(String str) {
        this.LIZ.remove(str);
        this.LIZIZ.remove(str);
        this.LIZJ.remove(str);
        NQR nqr = this.LIZIZ.get(str);
        if (nqr != null) {
            this.LJFF.postDelayed(new ARunnableS46S0100000_10(new NQR[]{nqr}, 144), 2000L);
        }
    }

    @Override // X.NRC
    public final void LIZLLL(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        if (this.LJIIJ) {
            return;
        }
        ARunnableS21S0300000_10 aRunnableS21S0300000_10 = new ARunnableS21S0300000_10(this, nrf, context, 22);
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            aRunnableS21S0300000_10.run();
        } else {
            this.LJFF.post(aRunnableS21S0300000_10);
        }
    }

    @Override // X.NRC
    public final void LJIIIIZZ(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        this.LJIIIIZZ = 0;
        InterfaceC59118NIc interfaceC59118NIc = this.LJIIL;
        if (interfaceC59118NIc != null && interfaceC59118NIc.LJIJJ()) {
            this.LJFF.removeCallbacks(LJIJI());
        }
        this.LIZLLL.LIZIZ = null;
        this.LJ = null;
        String LJ = LJ(nrf);
        LJIJJ(context, nrf);
        LJIL(LJ);
        this.LJI = 0;
        this.LJIIJJI = false;
        this.LJIIJ = false;
    }

    @Override // X.NRC
    public final void LJIIL(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        InterfaceC59118NIc interfaceC59118NIc = this.LJIIL;
        if (interfaceC59118NIc != null && interfaceC59118NIc.LJIJJ()) {
            this.LJ = new NRE(this, nrf, context);
        }
        this.LIZLLL.LIZIZ = new NSP(this, nrf);
    }

    public final void LJIILIIL(long j, long j2) {
        NRE nre;
        NRE nre2;
        NRE nre3;
        long j3 = this.LJII;
        if (j == j3 || j2 == 0) {
            return;
        }
        float f = (float) j2;
        float f2 = ((float) j) / f;
        float f3 = ((float) j3) / f;
        if (f2 >= 0.25f && f3 < 0.25f && f3 >= 0.0f && (nre3 = this.LJ) != null) {
            nre3.LIZ();
        }
        if (f2 >= 0.5f && f3 < 0.5f && f3 >= 0.0f && (nre2 = this.LJ) != null) {
            nre2.LIZIZ();
        }
        if (f2 >= 0.75f && f3 < 0.75f && f3 >= 0.0f && (nre = this.LJ) != null) {
            nre.LIZLLL();
        }
        NRE nre4 = this.LJ;
        if (nre4 != null) {
            nre4.LIZJ();
        }
        this.LJII = j;
    }

    public final void LJIJJ(Context context, NRF nrf) {
        String LJ = LJ(nrf);
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("omsdk_session_delay_second", 0);
        } catch (Throwable unused) {
        }
        NQR nqr = this.LIZIZ.get(LJ);
        if (i > 0 && nqr != null) {
            if (!this.LJIIJ) {
                o.LJIIIZ(context, "context");
                if (!this.LJIIJJI) {
                    LJ(nrf);
                    C59753Ncj LJIIZILJ = LJIIZILJ(nrf, context, null, C61878OQg.INSTANCE);
                    if (LJIIZILJ != null) {
                        C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
                        LJIIZILJ.LIZ.LJ.LIZIZ("skipped");
                    }
                    this.LJIIJJI = true;
                }
            }
            this.LJFF.postDelayed(new ARunnableS46S0100000_10(nqr, 145), i * 1000);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|9|10|(9:12|13|14|15|(1:17)|19|(1:23)|24|25)|29|13|14|15|(0)|19|(2:21|23)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:15:0x0072, B:17:0x0076), top: B:14:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r10, X.NRF r11) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r11.LJIIIIZZ
            if (r2 == 0) goto L33
            r8 = 0
            java.lang.String r3 = "playervol"
            java.lang.String r4 = "play_order"
            if (r10 == 0) goto L34
            java.lang.String r1 = r9.LJIILL()
            java.lang.String r0 = "mute"
            X.N0h r1 = X.C58704N2e.LIZLLL(r1, r0, r2)
            int r0 = r9.LJIIIIZZ
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ(r0, r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r1.LIZIZ(r0, r3)
            X.Ynr r0 = r9.LJIILLIIL()
            X.C77125UOr.LJIILL(r1, r0, r11)
        L33:
            return
        L34:
            java.lang.String r1 = r9.LJIILL()
            java.lang.String r0 = "unmute"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r2)
            int r0 = r9.LJIIIIZZ
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZIZ(r0, r4)
            X.NRH r0 = r9.LIZLLL
            int r0 = r0.LIZ()
            float r5 = (float) r0
            X.NRH r0 = r9.LIZLLL
            r0.getClass()
            r7 = 3
            r6 = -1
            android.media.AudioManager r0 = r0.LIZ     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L64
            int r0 = X.C16880lQ.LLLLLLZZ(r0, r7)     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L64:
            r0 = -1
        L65:
            float r4 = (float) r0
            X.NRH r0 = r9.LIZLLL
            int r0 = r0.LIZ()
            float r1 = (float) r0
            X.NRH r0 = r9.LIZLLL
            r0.getClass()
            android.media.AudioManager r0 = r0.LIZ     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L7f
            int r6 = X.C16880lQ.LLLLLLZZ(r0, r7)     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L7f:
            float r0 = (float) r6
            float r1 = r1 / r0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L8b
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L8b
            float r1 = r5 / r4
        L8b:
            r0 = 100
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            float r1 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.LIZIZ(r0, r3)
            X.Ynr r0 = r9.LJIILLIIL()
            X.C77125UOr.LJIILL(r2, r0, r11)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR5.LJIJJLI(boolean, X.NRF):void");
    }

    @Override // X.NRC
    public final void LIZJ(NRF nrf, Context context, int i) {
        C59753Ncj LJIIZILJ;
        o.LJIIIZ(context, "context");
        if (i == 0 && (LJIIZILJ = LJIIZILJ(nrf, context, null, C61878OQg.INSTANCE)) != null) {
            C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
            LJIIZILJ.LIZ.LJ.LIZIZ("resume");
        }
    }

    @Override // X.NRC
    public final void LJFF(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        if (i == 1) {
            String LJ = LJ(nrf);
            C59753Ncj LJIIZILJ = LJIIZILJ(nrf, context, null, C61878OQg.INSTANCE);
            if (LJIIZILJ != null) {
                C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
                LJIIZILJ.LIZ.LJ.LIZIZ("complete");
            }
            this.LJIIJ = true;
            LJIJJ(context, nrf);
            LJIL(LJ);
            long LJIILJJIL = LJIILJJIL();
            LJIILIIL(LJIILJJIL, LJIILJJIL);
        }
        this.LJIIIIZZ++;
        this.LJI = 0;
    }

    @Override // X.NRC
    public final void LJI(NRF nrf, Context context, int i) {
        C59753Ncj LJIIZILJ;
        o.LJIIIZ(context, "context");
        if (i == 0 && (LJIIZILJ = LJIIZILJ(nrf, context, null, C61878OQg.INSTANCE)) != null) {
            C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
            LJIIZILJ.LIZ.LJ.LIZIZ("pause");
        }
    }

    @Override // X.NRC
    public final void LJII(Context context, List adVerifications, NRF nrf) {
        o.LJIIIZ(adVerifications, "adVerifications");
        this.LJIIIZ = nrf;
        String LJ = LJ(nrf);
        ArrayList arrayList = new ArrayList();
        Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            NRM nrm = (NRM) it.next();
            arrayList.add(NSD.LIZ(nrm.LJLILLLLZI, new java.net.URL(nrm.LJLIL), nrm.LJLJI));
        }
        if (nrf.LJFF) {
            java.util.Map<String, String> contentUrls = this.LIZ;
            o.LJIIIIZZ(contentUrls, "contentUrls");
            contentUrls.put(LJ, "");
        }
        LJIJ(arrayList, context, nrf);
    }

    @Override // X.NRC
    public final void LJIIIZ(NRF nrf, View view, List friendlyObstructions) {
        Integer LIZ;
        o.LJIIIZ(friendlyObstructions, "friendlyObstructions");
        String LJ = LJ(nrf);
        if (nrf.LJFF && nrf.LJI) {
            java.util.Map<String, String> contentUrls = this.LIZ;
            o.LJIIIIZZ(contentUrls, "contentUrls");
            contentUrls.put(LJ, "");
        }
        if (C35386Dug.LIZ() || (LIZ = SharePrefCache.inst().getEnableBindItemCallOMSDK().LIZ()) == null || LIZ.intValue() != 0) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "adView.context");
            LJIIZILJ(nrf, context, view, friendlyObstructions);
        }
        this.LJIIIZ = nrf;
    }

    public final NQR LJIJ(List<NSD> list, Context context, NRF nrf) {
        if (!nrf.LJI) {
            return null;
        }
        String LJ = LJ(nrf);
        NQR nqr = this.LIZIZ.get(LJ);
        if (nqr != null) {
            return nqr;
        }
        o.LJIIIZ(context, "context");
        C59390NSo c59390NSo = C59997Ngf.LIZ;
        if (!c59390NSo.LIZ) {
            C59997Ngf.LIZ(context);
        }
        if (!c59390NSo.LIZ) {
            return null;
        }
        try {
            String LIZ = C36967Ef5.LIZ(context);
            String LJII = EF7.LJII();
            C38891fp.LJI("Bytedance", "Name is null or empty");
            C38891fp.LJI(LJII, "Version is null or empty");
            NR8 LIZ2 = NR8.LIZ(new C67996QmO("Bytedance", LJII), LIZ, list, this.LIZ.get(LJ));
            NQQ nqq = nrf.LIZLLL;
            NRB nrb = nrf.LJ;
            NRK nrk = NRK.NATIVE;
            nqr = NQR.LIZIZ(NRJ.LIZ(nqq, nrb, nrk, nrk), LIZ2);
            java.util.Map<String, NQR> adSessionMap = this.LIZIZ;
            o.LJIIIIZZ(adSessionMap, "adSessionMap");
            adSessionMap.put(LJ, nqr);
            C09900aA.LJIIJJI("OmAdSessionMonitor", 1, null);
            return nqr;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("create ad session failed ");
            LIZ3.append(th);
            C36922EeM.LJ(X1D.LIZIZ(LIZ3));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_message", th.getMessage());
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("exception_stack", stringWriter.toString());
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            C09900aA.LJIIJJI("OmAdSessionMonitor", 0, jSONObject);
            return nqr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // X.NRC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.NRF r9, android.content.Context r10, int r11, android.view.View r12) {
        /*
            r8 = this;
            if (r11 == 0) goto L3
            return
        L3:
            X.OQg r0 = X.C61878OQg.INSTANCE
            X.Ncj r4 = r8.LJIIZILJ(r9, r10, r12, r0)
            X.NRH r0 = r8.LIZLLL
            int r0 = r0.LIZ()
            float r6 = (float) r0
            X.NRH r0 = r8.LIZLLL
            r0.getClass()
            android.media.AudioManager r1 = r0.LIZ     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L23
            r0 = 3
            int r0 = X.C16880lQ.LLLLLLZZ(r1, r0)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L23:
            r0 = -1
        L24:
            float r0 = (float) r0
            float r6 = r6 / r0
            long r2 = r8.LJIILJJIL()
            if (r4 == 0) goto L32
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.LIZJ(r1, r0)
        L32:
            r8.LJIIIZ = r9
            X.NIc r0 = r8.LJIIL
            r5 = 0
            if (r0 == 0) goto L53
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto L53
            android.os.Handler r1 = r8.LJFF
            java.lang.Runnable r0 = r8.LJIJI()
            r1.removeCallbacks(r0)
            android.os.Handler r7 = r8.LJFF
            java.lang.Runnable r4 = r8.LJIJI()
            r0 = 200(0xc8, double:9.9E-322)
            r7.postDelayed(r4, r0)
        L53:
            X.NIc r0 = r8.LJIIL
            if (r0 == 0) goto L66
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto L66
            r0 = -1
            r8.LJII = r0
            r0 = 0
            r8.LJIILIIL(r0, r2)
        L66:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L6c
            r5 = 1
        L6c:
            r8.LJIJJLI(r5, r9)
            boolean r0 = r9.LJII
            if (r0 == 0) goto L86
            java.lang.String r2 = r8.LJIILL()
            java.lang.String r1 = "auto_full_screen"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.LJIIIIZZ
            X.N0h r1 = X.C58704N2e.LIZLLL(r2, r1, r0)
            X.Ynr r0 = r8.LJIILLIIL()
            X.C77125UOr.LJIILL(r1, r0, r9)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR5.LJIIJ(X.NRF, android.content.Context, int, android.view.View):void");
    }

    @Override // X.NRC
    public final void LJIIJJI(NRF nrf, Context context, View adView, List<? extends View> friendlyView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(friendlyView, "friendlyView");
        NQR nqr = this.LIZIZ.get(LJ(nrf));
        if (nqr != null) {
            nqr.LIZLLL(adView);
            nqr.LJ();
            Iterator<? extends View> it = friendlyView.iterator();
            while (it.hasNext()) {
                nqr.LIZ(it.next());
            }
            C59753Ncj LJIIZILJ = LJIIZILJ(nrf, context, adView, friendlyView);
            if (LJIIZILJ != null) {
                C38891fp.LJIIIIZZ(LJIIZILJ.LIZ);
                LJIIZILJ.LIZ.LJ.LIZIZ("resume");
            }
        }
    }

    public final C59753Ncj LJIIZILJ(NRF nrf, Context context, View view, List<? extends View> list) {
        String LJ = LJ(nrf);
        C59753Ncj c59753Ncj = this.LIZJ.get(LJ);
        if (c59753Ncj == null) {
            NQR LJIJ = LJIJ(C61878OQg.INSTANCE, context, nrf);
            if (LJIJ == null || view == null) {
                c59753Ncj = null;
            } else {
                c59753Ncj = C59753Ncj.LIZIZ(LJIJ);
                LJIJ.LIZLLL(view);
                Iterator<? extends View> it = list.iterator();
                while (it.hasNext()) {
                    LJIJ.LIZ(it.next());
                }
                LJIJ.LJI();
                C60016Ngy LIZIZ = C60016Ngy.LIZIZ(LJIJ);
                EnumC62222cM enumC62222cM = EnumC62222cM.STANDALONE;
                C38891fp.LJFF(enumC62222cM, "Position is null");
                LIZIZ.LIZLLL(new NSV(enumC62222cM));
                LIZIZ.LIZJ();
            }
            java.util.Map<String, C59753Ncj> mediaEventMap = this.LIZJ;
            o.LJIIIIZZ(mediaEventMap, "mediaEventMap");
            mediaEventMap.put(LJ, c59753Ncj);
        }
        return c59753Ncj;
    }
}
