package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS46S0100000_10;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS70S0000000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NQL implements InterfaceC46264IDs {
    public static volatile NQL LJJI;
    public final NQP LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public C59335NQl LJIJI;
    public final java.util.Map<String, C59753Ncj> LIZ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, C59348NQy> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, NQR> LIZJ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, NR2> LIZLLL = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, String> LJ = Collections.synchronizedMap(new HashMap());
    public int LJIIIZ = 0;
    public final Handler LJIIJ = new Handler(C16880lQ.LLJJJJ());
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public boolean LJIILL = true;
    public long LJIILLIIL = -1;
    public WeakReference<View> LJIIZILJ = null;
    public Aweme LJIJ = null;
    public final Handler LJIJJ = new Handler(C16880lQ.LLJJJJ());
    public long LJIJJLI = -1;
    public long LJIL = -1;
    public final ARunnableS46S0100000_10 LJJ = new ARunnableS46S0100000_10(this, 161);

    static {
        C16880lQ.LJLLJ(NQL.class);
    }

    public static NQL LJIILL() {
        if (LJJI == null) {
            synchronized (NQL.class) {
                if (LJJI == null) {
                    LJJI = new NQL();
                }
            }
        }
        return LJJI;
    }

    public final View LJFF() {
        WeakReference<View> weakReference = this.LJIIZILJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public NQL() {
        Context LIZIZ = EF7.LIZIZ();
        NQP nqp = new NQP(LIZIZ);
        this.LJFF = nqp;
        nqp.LIZJ = new C59436NUi(nqp);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        C16880lQ.LJJLIIIJILLIZJL(nqp.LIZJ, LIZIZ, intentFilter);
    }

    public static Long LJIIIZ() {
        long j;
        if (NSX.LIZ() > 0) {
            j = NSX.LIZ();
        } else {
            j = 200;
        }
        return Long.valueOf(j);
    }

    public final long LJI() {
        NQH LIZ = C201697vp.LIZ();
        IEZ LIZ2 = C46251IDf.LIZ();
        if (this.LJIIL && LIZ != null) {
            return LIZ.getCurrentPosition();
        }
        if (this.LJIIJJI && LIZ2 != null) {
            return LIZ2.getCurrentPosition();
        }
        return IWF.LJJLIIIIJ().getCurrentPosition();
    }

    public final long LJIIIIZZ() {
        NQH LIZ = C201697vp.LIZ();
        IEZ LIZ2 = C46251IDf.LIZ();
        if (this.LJIIL && LIZ != null) {
            return LIZ.getDuration();
        }
        if (this.LJIIJJI && LIZ2 != null) {
            return LIZ2.getDuration();
        }
        return IWF.LJJLIIIIJ().getDuration();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LJIILIIL(android.content.Context r3) {
        /*
            android.content.Context r1 = X.C16880lQ.LLLLL(r3)
            java.lang.String r0 = "audio"
            java.lang.Object r3 = X.C16880lQ.LLILL(r1, r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r1 = 3
            r2 = -1
            if (r3 == 0) goto L28
            int r0 = r3.getStreamVolume(r1)     // Catch: java.lang.Exception -> L15
            goto L1c
        L15:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            r0 = -1
            if (r3 == 0) goto L20
        L1c:
            int r2 = X.C16880lQ.LLLLLLZZ(r3, r1)
        L20:
            if (r0 <= 0) goto L28
            if (r2 <= 0) goto L28
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            goto L29
        L28:
            r1 = 0
        L29:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            float r1 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQL.LJIILIIL(android.content.Context):float");
    }

    public static List LJIILJJIL(Aweme aweme) {
        String str;
        String str2;
        List<AdVerification> list;
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        if (!C62819Ol5.LJII(aweme)) {
            str = "";
        } else {
            str = C59252NNg.LIZIZ(aweme).javascriptResource;
        }
        if (!C62819Ol5.LJII(aweme)) {
            str2 = "";
        } else {
            str2 = C59252NNg.LIZIZ(aweme).vender;
        }
        if (C62819Ol5.LJII(aweme)) {
            str3 = C59252NNg.LIZIZ(aweme).verificationParameters;
        }
        NSD LJ = LJ(str, str2, str3);
        if (LJ != null) {
            arrayList.add(LJ);
        }
        if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getOmVast() != null && (list = aweme.getAwemeRawAd().getOmVast().extraAdVerificationList) != null) {
            for (AdVerification adVerification : list) {
                NSD LJ2 = LJ(adVerification.javascriptResource, adVerification.vender, adVerification.verificationParameters);
                if (LJ2 != null) {
                    arrayList.add(LJ2);
                }
            }
        }
        return arrayList;
    }

    public static void LJIJI(Aweme aweme) {
        if (C59252NNg.LJI(aweme) && C59251NNf.LIZIZ(3, aweme)) {
            C59252NNg.LJIILIIL("start", aweme, "play");
        }
        if (aweme.getAwemeRawAdIdStr() != null) {
            NQK.LJ(aweme.getAwemeRawAdIdStr());
        }
    }

    public final void LJIIZILJ(Aweme aweme) {
        if (JHI.LIZ().LJIIJJI && C63081OpJ.LJIL(aweme)) {
            JHI.LIZ().LJIIJJI = false;
        } else {
            LJJII(aweme);
        }
    }

    public final void LJIJ(Aweme aweme) {
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            LJJII(aweme);
        }
    }

    public final void LJJII(Aweme aweme) {
        this.LJIIIZ = 0;
        this.LJIJI = null;
        this.LJFF.LIZLLL = null;
        NQO.LIZ("sessionFinish");
        String LJIILL = C62819Ol5.LJIILL(aweme);
        NQR nqr = this.LIZJ.get(LJIILL);
        LJIILLIIL(aweme, LJIILL);
        NR2 nr2 = this.LIZLLL.get(LJIILL);
        if (nr2 != null) {
            nr2.LIZIZ();
        }
        LJJI(C62819Ol5.LJIILL(aweme), nqr);
        this.LJIJJ.removeCallbacks(this.LJJ);
        aweme.getAwemeRawAdIdStr();
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
    }

    public final void LJJIIZI(Aweme aweme) {
        this.LJIIL = C63081OpJ.LJLJI(aweme);
        this.LJIIJJI = C63081OpJ.LJLLLL(aweme);
        NQO.LIZ = aweme;
        this.LJIJJ.removeCallbacks(this.LJJ);
        this.LJIJJ.postDelayed(this.LJJ, LJIIIZ().longValue());
    }

    public final void LIZLLL(long j, long j2) {
        long j3;
        InterfaceC1039145z interfaceC1039145z;
        boolean z;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        boolean z2;
        AwemeRawAd awemeRawAd2;
        OmVast omVast2;
        C59255NNj c59255NNj2;
        java.util.Set<String> set;
        C59753Ncj LJIIJ;
        C59753Ncj LJIIJ2;
        C59753Ncj LJIIJ3;
        long j4 = this.LJIJJLI;
        if (j == j4 || j2 == 0) {
            return;
        }
        C59335NQl c59335NQl = this.LJIJI;
        if (c59335NQl != null) {
            float f = (float) j2;
            float f2 = ((float) j) / f;
            float f3 = ((float) j4) / f;
            if (f2 >= 0.25f && f3 < 0.25f && f3 > 0.0f) {
                NQL nql = c59335NQl.LIZLLL;
                if (!nql.LJI) {
                    Aweme aweme = c59335NQl.LIZ;
                    Context context = c59335NQl.LIZIZ;
                    View view = c59335NQl.LIZJ;
                    if (nql.LJIIIZ == 0 && (LJIIJ3 = nql.LJIIJ(context, view, aweme)) != null) {
                        C38891fp.LJIIIIZZ(LJIIJ3.LIZ);
                        LJIIJ3.LIZ.LJ.LIZIZ("firstQuartile");
                    }
                    nql.LJIJJLI(j, context, aweme);
                }
                c59335NQl.LIZLLL.LJJIIJ(NQX.PROGRESS_25P, c59335NQl.LIZ.getAwemeRawAdIdStr());
            }
            if (f2 >= 0.5f && f3 < 0.5f && f3 > 0.0f) {
                C59335NQl c59335NQl2 = this.LJIJI;
                NQL nql2 = c59335NQl2.LIZLLL;
                if (!nql2.LJII) {
                    Aweme aweme2 = c59335NQl2.LIZ;
                    Context context2 = c59335NQl2.LIZIZ;
                    View view2 = c59335NQl2.LIZJ;
                    C36922EeM.LJ("trackSecondQuartile");
                    if (nql2.LJIIIZ == 0 && (LJIIJ2 = nql2.LJIIJ(context2, view2, aweme2)) != null) {
                        C38891fp.LJIIIIZZ(LJIIJ2.LIZ);
                        LJIIJ2.LIZ.LJ.LIZIZ("midpoint");
                    }
                    nql2.LJIL(j, context2, aweme2);
                }
                c59335NQl2.LIZLLL.LJJIIJ(NQX.PROGRESS_50P, c59335NQl2.LIZ.getAwemeRawAdIdStr());
            }
            if (f2 >= 0.75f && f3 < 0.75f && f3 > 0.0f) {
                C59335NQl c59335NQl3 = this.LJIJI;
                NQL nql3 = c59335NQl3.LIZLLL;
                if (!nql3.LJIIIIZZ) {
                    Aweme aweme3 = c59335NQl3.LIZ;
                    Context context3 = c59335NQl3.LIZIZ;
                    View view3 = c59335NQl3.LIZJ;
                    if (nql3.LJIIIZ == 0 && (LJIIJ = nql3.LJIIJ(context3, view3, aweme3)) != null) {
                        C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                        LJIIJ.LIZ.LJ.LIZIZ("thirdQuartile");
                    }
                    nql3.LJJ(j, context3, aweme3);
                }
                c59335NQl3.LIZLLL.LJJIIJ(NQX.PROGRESS_75P, c59335NQl3.LIZ.getAwemeRawAdIdStr());
            }
            C59335NQl c59335NQl4 = this.LJIJI;
            long j5 = this.LJIJJLI;
            Aweme aweme4 = c59335NQl4.LIZ;
            if (!C59251NNf.LIZIZ(3, aweme4) || j5 == j) {
                z = true;
            } else {
                if (j5 < j) {
                    j3 = j5;
                } else {
                    j3 = -1;
                }
                if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
                    interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(4));
                } else {
                    interfaceC1039145z = OJA.LIZ;
                }
                z = true;
                C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(interfaceC1039145z, new C59260NNo(j2, j3, j)));
                while (c115524g8.hasNext()) {
                    C59261NNp c59261NNp = (C59261NNp) c115524g8.next();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    String str = c59261NNp.offset;
                    o.LJIIIIZZ(str, "it.offset");
                    long seconds = timeUnit.toSeconds(C59252NNg.LJIIJJI(j2, str));
                    InterfaceC1039145z LJJJ = OJ6.LJJJ(c59261NNp.url);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cpv_");
                    LIZ.append(seconds);
                    LIZ.append('s');
                    C59252NNg.LJIIL(LJJJ, new C35V(X1D.LIZIZ(LIZ), aweme4));
                }
            }
            NQL nql4 = c59335NQl4.LIZLLL;
            if (nql4.LJIIIZ == 0 && j5 < 2000 && j >= 2000) {
                Aweme aweme5 = c59335NQl4.LIZ;
                Context context4 = c59335NQl4.LIZIZ;
                if (C59252NNg.LJI(aweme5)) {
                    if (aweme5 != null && aweme5.isAd() == z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && C59251NNf.LIZIZ(3, aweme5) && (awemeRawAd2 = aweme5.getAwemeRawAd()) != null && (omVast2 = awemeRawAd2.getOmVast()) != null && (c59255NNj2 = omVast2.vast) != null && (set = c59255NNj2.viewableSet) != null) {
                        C59252NNg.LJIIL(ORZ.LJLIIIL(set), new C35V("viewable", aweme5));
                    }
                    NN1.LJJJJI(context4, "viewable", aweme5, NN1.LJIIL(context4, aweme5, false, NN1.LJ(nql4.LJIIIZ + 1)));
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "viewable", aweme5.getAwemeRawAd());
                    LIZLLL.LIZIZ(Integer.valueOf(nql4.LJIIIZ + 1), "play_order");
                    LIZLLL.LJII();
                }
            }
            String awemeRawAdIdStr = c59335NQl4.LIZ.getAwemeRawAdIdStr();
            if (j < j2 && awemeRawAdIdStr != null && !ujb.o.LJJJJJL(awemeRawAdIdStr)) {
                java.util.Map<String, Long> map = NQK.LIZLLL;
                Object obj = ((LinkedHashMap) map).get(awemeRawAdIdStr);
                if (obj == null) {
                    obj = -111L;
                }
                long longValue = ((Number) obj).longValue();
                if (longValue < j) {
                    longValue = j;
                }
                map.put(awemeRawAdIdStr, Long.valueOf(longValue));
                if (NSJ.LIZ().enableReuseLoopForPlaySeconds) {
                    NQK.LIZIZ(awemeRawAdIdStr, j, j2, EnumC53653L3x.VIDEO_LOOP);
                }
            }
        }
        this.LJIJJLI = j;
    }

    public final NQR LJIIJJI(Context context, Aweme aweme) {
        NQQ nqq;
        if (C59252NNg.LJ(aweme) && !O5Y.LJJJIL(aweme)) {
            String LJIILL = C62819Ol5.LJIILL(aweme);
            if (this.LIZJ.get(LJIILL) != null) {
                return this.LIZJ.get(LJIILL);
            }
            C36922EeM.LJ("ensureOmidActivition");
            C59390NSo c59390NSo = C59997Ngf.LIZ;
            if (!c59390NSo.LIZ) {
                C59997Ngf.LIZ(context);
            }
            if (C79004UzY.LJJJZ(aweme)) {
                C59376NSa c59376NSa = NSZ.LIZ;
                if (!c59376NSa.LIZ) {
                    Context LLLLL = C16880lQ.LLLLL(context);
                    if (LLLLL != null) {
                        if (!c59376NSa.LIZ) {
                            c59376NSa.LIZ = true;
                            NR0 nr0 = NR0.LIZLLL;
                            nr0.getClass();
                            nr0.LIZJ = new WeakReference<>(LLLLL);
                            C59327NQd.LJ.LIZ = new WeakReference<>(LLLLL);
                        }
                    } else {
                        throw new IllegalArgumentException("application context cannot be null");
                    }
                }
            }
            if (!c59390NSo.LIZ) {
                return null;
            }
            try {
                String LJII = EF7.LJII();
                C38891fp.LJI("Bytedance", "Name is null or empty");
                C38891fp.LJI(LJII, "Version is null or empty");
                NR8 LIZ = NR8.LIZ(new C67996QmO("Bytedance", LJII), C62814Ol0.LJIILLIIL(EF7.LIZIZ()), LJIILJJIL(aweme), this.LJ.get(LJIILL));
                AwemeRawAd ad = aweme.getAwemeRawAd();
                o.LJIIIZ(ad, "ad");
                if (ad.getOmVast() == null) {
                    nqq = NQQ.VIDEO;
                } else {
                    int i = ad.getOmVast().creative_type;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        nqq = NQQ.VIDEO;
                                    } else {
                                        nqq = NQQ.AUDIO;
                                    }
                                } else {
                                    nqq = NQQ.VIDEO;
                                }
                            } else {
                                nqq = NQQ.NATIVE_DISPLAY;
                            }
                        } else {
                            nqq = NQQ.HTML_DISPLAY;
                        }
                    } else {
                        nqq = NQQ.DEFINED_BY_JAVASCRIPT;
                    }
                }
                NRB LIZ2 = NRI.LIZ(aweme.getAwemeRawAd());
                NRK nrk = NRK.NATIVE;
                C60014Ngw LIZIZ = NQR.LIZIZ(NRJ.LIZ(nqq, LIZ2, nrk, nrk), LIZ);
                C09900aA.LJIIJJI("OmAdSessionMonitor", 1, null);
                this.LIZJ.put(LJIILL, LIZIZ);
                return LIZIZ;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("create ad session failed");
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
            }
        }
        return null;
    }

    public final int LJIIL(C58655N0h c58655N0h, Aweme aweme) {
        int i;
        int LIZ;
        if (aweme == null) {
            i = this.LJIIIZ;
        } else {
            if (SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIILL()) {
                LIZ = JHI.LIZ().LJ;
            } else if (IEW.LIZIZ(aweme)) {
                c58655N0h.LIZIZ(Integer.valueOf(IEW.LIZIZ), "story_video_type");
                LIZ = IEW.LIZ();
            } else {
                i = this.LJIIIZ;
            }
            return LIZ + 1;
        }
        return i + 1;
    }

    public final void LJIILLIIL(Aweme aweme, String str) {
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("omsdk_session_delay_second", 0);
        } catch (Throwable unused) {
        }
        NQR nqr = this.LIZJ.get(str);
        if (i > 0 && nqr != null) {
            if (!this.LJIILJJIL) {
                LJJIIJZLJL(null, null, aweme);
            }
            this.LJIIJ.postDelayed(new ARunnableS18S0101000_14(2, nqr, 16), i * 1000);
        }
    }

    public final void LJJI(String str, NQR nqr) {
        this.LIZJ.remove(str);
        this.LIZ.remove(str);
        this.LIZLLL.remove(str);
        this.LIZIZ.remove(str);
        this.LJ.remove(str);
        this.LJIIJ.postDelayed(new ARunnableS11S0101000_7(4, new NQR[]{nqr}, 11), 2000L);
    }

    public final void LJJIII(View view, Aweme aweme) {
        if (aweme != null && C59252NNg.LJ(aweme)) {
            this.LJIIZILJ = new WeakReference<>(view);
            this.LJIJ = aweme;
        } else {
            this.LJIIZILJ = null;
            this.LJIJ = null;
        }
    }

    public final void LJJIIJ(NQX nqx, String str) {
        int i = NQV.LIZ[nqx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJIIIIZZ = true;
                }
            } else {
                this.LJII = true;
            }
        } else {
            this.LJI = true;
        }
        NQK.LIZJ(nqx, str);
    }

    public static NSD LJ(String str, String str2, String str3) {
        try {
            java.net.URL url = new java.net.URL(str);
            if (TextUtils.isEmpty(str3)) {
                str3 = "placementId=1&placementName=test";
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            return NSD.LIZ(str2, url, LJJIFFI(LJJIFFI(LJJIFFI(str3, "{TS}", valueOf), "__TS__", valueOf), "__MRC_IMPRESSION_ID__", C55499LqJ.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId())));
        } catch (MalformedURLException e) {
            C78983UzD.LJIIZILJ(e);
            return null;
        }
    }

    public static String LJJIFFI(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || !str.contains(str2)) {
            return str;
        }
        return str.replace(str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C59348NQy LJII(android.content.Context r9, android.view.View r10, final com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r8 = this;
            boolean r0 = X.C79004UzY.LJJJZ(r11)
            r3 = 0
            if (r0 == 0) goto Lc8
            java.lang.String r2 = X.C62819Ol5.LJIILL(r11)
            java.util.Map<java.lang.String, X.NQy> r0 = r8.LIZIZ
            java.lang.Object r0 = r0.get(r2)
            X.NQy r0 = (X.C59348NQy) r0
            if (r0 != 0) goto L34
            boolean r0 = X.C79004UzY.LJJJZ(r11)
            if (r0 == 0) goto L33
            java.lang.String r5 = X.C62819Ol5.LJIILL(r11)
            java.util.Map<java.lang.String, X.NR2> r0 = r8.LIZLLL
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto La9
            java.util.Map<java.lang.String, X.NR2> r0 = r8.LIZLLL
            java.lang.Object r4 = r0.get(r5)
            X.NR2 r4 = (X.NR2) r4
            if (r4 == 0) goto L33
        L31:
            if (r10 != 0) goto L35
        L33:
            r0 = r3
        L34:
            return r0
        L35:
            X.NQy r3 = X.C59348NQy.LIZ(r4)
            r4.LIZJ(r10)
            android.app.Activity r7 = X.C45804HyK.LJIJJ(r9)
            if (r7 == 0) goto L9e
            android.view.View r0 = r10.getRootView()
            int r6 = X.KL2.LJIIIZ(r7)
            int r5 = X.KL2.LJIIJJI(r7)
            java.util.List r0 = X.C62819Ol5.LJIILJJIL(r6, r5, r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r10)
            java.util.Iterator r1 = r0.iterator()
        L5b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r4.LIZ(r0)
            goto L5b
        L6b:
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.detail.ui.DetailActivity
            r1 = 2131375019(0x7f0a33ab, float:1.8370174E38)
            if (r0 == 0) goto L99
            r0 = 2131367775(0x7f0a175f, float:1.8355481E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.View r0 = r0.findViewById(r1)
        L7d:
            if (r0 == 0) goto L9e
            java.util.List r0 = X.C62819Ol5.LJIILJJIL(r6, r5, r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L89:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r4.LJ(r0)
            goto L89
        L99:
            android.view.View r0 = r7.findViewById(r1)
            goto L7d
        L9e:
            r4.LJFF()
            if (r3 == 0) goto L33
            java.util.Map<java.lang.String, X.NQy> r0 = r8.LIZIZ
            r0.put(r2, r3)
            goto L33
        La9:
            X.N5A r1 = new X.N5A
            r1.<init>()
            X.NSa r0 = X.NSZ.LIZ
            boolean r0 = r0.LIZ
            if (r0 == 0) goto Lc0
            X.NQz r4 = new X.NQz
            r4.<init>(r1)
            java.util.Map<java.lang.String, X.NR2> r0 = r8.LIZLLL
            r0.put(r5, r4)
            goto L31
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewabilitySDKManager has to be active"
            r1.<init>(r0)
            throw r1
        Lc8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQL.LJII(android.content.Context, android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):X.NQy");
    }

    public final C59753Ncj LJIIJ(Context context, View view, Aweme aweme) {
        NQR LJIIJJI;
        View findViewById;
        String LJIILL = C62819Ol5.LJIILL(aweme);
        C59753Ncj c59753Ncj = this.LIZ.get(LJIILL);
        if (c59753Ncj == null) {
            if (!this.LJIILL || O5Y.LJJJIL(aweme) || (LJIIJJI = LJIIJJI(context, aweme)) == null || view == null) {
                return null;
            }
            C59753Ncj LIZIZ = C59753Ncj.LIZIZ(LJIIJJI);
            LJIIJJI.LIZLLL(view);
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                View findViewById2 = LJIJJ.getWindow().getDecorView().findViewById(R.id.content);
                int LJIIIZ = KL2.LJIIIZ(LJIJJ);
                int LJIIJJI2 = KL2.LJIIJJI(LJIJJ);
                ArrayList arrayList = (ArrayList) C62819Ol5.LJIILJJIL(LJIIIZ, LJIIJJI2, findViewById2);
                arrayList.remove(view);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LJIIJJI.LIZ((View) it.next());
                }
                if (LJIJJ instanceof DetailActivity) {
                    findViewById = LJIJJ.findViewById(com.zhiliaoapp.musically.R.id.dx4).findViewById(com.zhiliaoapp.musically.R.id.j7n);
                } else {
                    findViewById = LJIJJ.findViewById(com.zhiliaoapp.musically.R.id.j7n);
                }
                if (findViewById != null) {
                    Iterator it2 = ((ArrayList) C62819Ol5.LJIILJJIL(LJIIIZ, LJIIJJI2, findViewById)).iterator();
                    while (it2.hasNext()) {
                        LJIIJJI.LJFF((View) it2.next());
                    }
                }
            }
            LJIIJJI.LJI();
            C60016Ngy LIZIZ2 = C60016Ngy.LIZIZ(LJIIJJI);
            EnumC62222cM enumC62222cM = EnumC62222cM.STANDALONE;
            C38891fp.LJFF(enumC62222cM, "Position is null");
            LIZIZ2.LIZLLL(new NSV(enumC62222cM));
            LIZIZ2.LIZJ();
            if (LIZIZ == null) {
                return LIZIZ;
            }
            this.LIZ.put(LJIILL, LIZIZ);
            return LIZIZ;
        }
        return c59753Ncj;
    }

    public final void LJIJJLI(long j, Context context, Aweme aweme) {
        C59252NNg.LJIILIIL("firstQuartile", aweme, "play_25");
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZIZ("play_25", aweme.getRawAdPlayNodeTrackUrlList(25), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null);
            NN1.LJJJJI(context, "first_quartile", aweme, NN1.LJIIL(context, aweme, false, NN1.LJ(this.LJIIIZ + 1)));
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "first_quartile", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(LJIIL(LIZLLL, aweme)), "play_order");
            LIZLLL.LIZIZ(Long.valueOf(j), "duration");
            LIZLLL.LIZIZ(0, "is_backfilled");
            LIZLLL.LJII();
            if (O5Y.LJJJIL(aweme)) {
                SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJI(aweme, "first_quartile");
            }
            NQK.LIZJ(NQX.PROGRESS_25P, awemeRawAd.getCreativeIdStr());
        }
    }

    public final void LJIL(long j, Context context, Aweme aweme) {
        C59252NNg.LJIILIIL("midpoint", aweme, "play_50");
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZIZ("play_50", aweme.getRawAdPlayNodeTrackUrlList(50), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null);
            NN1.LJJJJI(context, "midpoint", aweme, NN1.LJIIL(context, aweme, false, NN1.LJ(this.LJIIIZ + 1)));
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "midpoint", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(LJIIL(LIZLLL, aweme)), "play_order");
            LIZLLL.LIZIZ(Long.valueOf(j), "duration");
            LIZLLL.LIZIZ(0, "is_backfilled");
            LIZLLL.LJII();
            if (O5Y.LJJJIL(aweme)) {
                SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJI(aweme, "midpoint");
            }
            NQK.LIZJ(NQX.PROGRESS_50P, awemeRawAd.getCreativeIdStr());
        }
    }

    public final void LJJ(long j, Context context, Aweme aweme) {
        C59252NNg.LJIILIIL("thirdQuartile", aweme, "play_75");
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZIZ("play_75", aweme.getRawAdPlayNodeTrackUrlList(75), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null);
            NN1.LJJJJI(context, "third_quartile", aweme, NN1.LJIIL(context, aweme, false, NN1.LJ(this.LJIIIZ + 1)));
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "third_quartile", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(LJIIL(LIZLLL, aweme)), "play_order");
            LIZLLL.LIZIZ(Long.valueOf(j), "duration");
            LIZLLL.LIZIZ(0, "is_backfilled");
            LIZLLL.LJII();
            if (O5Y.LJJJIL(aweme)) {
                SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJI(aweme, "third_quartile");
            }
            NQK.LIZJ(NQX.PROGRESS_75P, awemeRawAd.getCreativeIdStr());
        }
    }

    public final void LJJIIJZLJL(Context context, View view, Aweme aweme) {
        NQO.LIZ("skipped");
        if (!this.LJIILIIL) {
            C59753Ncj LJIIJ = LJIIJ(context, view, aweme);
            if (LJIIJ != null) {
                C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                LJIIJ.LIZ.LJ.LIZIZ("skipped");
                this.LJIILIIL = true;
            }
            C59348NQy LJII = LJII(context, view, aweme);
            if (LJII != null) {
                NR1.LIZIZ(LJII.LIZ);
                LJII.LIZ.LJI();
            }
        }
    }

    @Override // X.InterfaceC46264IDs
    public final void LIZ(Context context, View view, Aweme aweme, boolean z) {
        if (aweme == null) {
            return;
        }
        if (z) {
            if (!C63081OpJ.LJZL(aweme)) {
                this.LJIJI = new C59335NQl(context, view, this, aweme);
                NQK.LJ = new C59334NQk(context, view, this, aweme);
                this.LJFF.LIZLLL = new C59333NQj(context, view, this, aweme);
                return;
            }
            return;
        }
        LJJII(aweme);
    }

    @Override // X.InterfaceC46264IDs
    public final void LIZIZ(int i, Context context, View view, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        if (i == 0) {
            NQO.LIZ("bufferStart");
            C59753Ncj LJIIJ = LJIIJ(context, view, aweme);
            if (LJIIJ != null) {
                C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                LJIIJ.LIZ.LJ.LIZIZ("bufferStart");
            }
            C59348NQy LJII = LJII(context, view, aweme);
            if (LJII != null) {
                NR1.LIZIZ(LJII.LIZ);
                LJII.LIZ.LJI();
            }
        }
        C59252NNg.LJIILIIL("bufferStart", aweme, null);
        NN1.LJJJJI(context, "buffer_start", aweme, NN1.LJIIL(context, aweme, false, NN1.LJ(this.LJIIIZ + 1)));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "buffer_start", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(Integer.valueOf(this.LJIIIZ + 1), "play_order");
        LIZLLL.LJII();
    }

    @Override // X.InterfaceC46264IDs
    public final void LIZJ(int i, Context context, View view, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        if (i == 0) {
            NQO.LIZ("bufferFinish");
            C59753Ncj LJIIJ = LJIIJ(context, view, aweme);
            if (LJIIJ != null) {
                C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                LJIIJ.LIZ.LJ.LIZIZ("bufferFinish");
            }
            C59348NQy LJII = LJII(context, view, aweme);
            if (LJII != null) {
                NR1.LIZIZ(LJII.LIZ);
                C59349NQz c59349NQz = LJII.LIZ;
                c59349NQz.getClass();
                c59349NQz.LJII = System.nanoTime();
            }
        }
        C59252NNg.LJIILIIL("bufferEnd", aweme, null);
        NN1.LJJJJI(context, "buffer_end", aweme, NN1.LJIIL(context, aweme, false, NN1.LJ(this.LJIIIZ + 1)));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "buffer_end", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(Integer.valueOf(this.LJIIIZ + 1), "play_order");
        LIZLLL.LJII();
    }

    public final void LJIJJ(int i, Context context, View view, Aweme aweme) {
        C36922EeM.LJ("AdOM onPlayComplete ");
        if (C19N.LJ("align_play_order_quartile", false)) {
            this.LJIIIZ = i - 1;
        }
        if (i == 1) {
            NQO.LIZ("complete");
            String LJIILL = C62819Ol5.LJIILL(aweme);
            C59753Ncj c59753Ncj = this.LIZ.get(LJIILL);
            if (c59753Ncj != null) {
                C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
                c59753Ncj.LIZ.LJ.LIZIZ("complete");
            }
            C59348NQy LJII = LJII(context, view, aweme);
            if (LJII != null) {
                NR1.LIZIZ(LJII.LIZ);
                LJII.LIZ.LJI();
            }
            NQR nqr = this.LIZJ.get(LJIILL);
            this.LJIILJJIL = true;
            LJIILLIIL(aweme, LJIILL);
            NR2 nr2 = this.LIZLLL.get(LJIILL);
            if (nr2 != null) {
                nr2.LIZIZ();
            }
            LJJI(LJIILL, nqr);
            long LJIIIIZZ = LJIIIIZZ();
            if (!O5Y.LJJJIL(this.LJIJ)) {
                LIZLLL(LJIIIIZZ, LJIIIIZZ);
            }
        }
        C59252NNg.LJIILIIL("complete", aweme, "play_over");
        this.LJIIIZ++;
        aweme.getAwemeRawAdIdStr();
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
    }

    public final void LJJIIZ(Context context, View view, Aweme aweme, String str) {
        this.LJIIL = C63081OpJ.LJLJI(aweme);
        this.LJIIJJI = C63081OpJ.LJLLLL(aweme);
        if (aweme != null && C59252NNg.LJ(aweme) && aweme.getAwemeRawAd().getOmVast().isEnableContentUrl) {
            this.LJ.put(C62819Ol5.LJIILL(aweme), str);
        }
        NQO.LIZ = aweme;
        NQO.LIZ("sessionStart");
        if (C35386Dug.LIZ() || SharePrefCache.inst().getEnableBindItemCallOMSDK().LIZ().intValue() != 0) {
            LJIIJ(context, view, aweme);
            LJII(context, view, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(int r9, android.content.Context r10, android.view.View r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQL.LJJIJ(int, android.content.Context, android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
