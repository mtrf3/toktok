package Y;

import X.ActivityC45651qj;
import X.C109544Rq;
import X.C115284fk;
import X.C31268COy;
import X.C31626Cb8;
import X.C39930Flm;
import X.C45804HyK;
import X.C58655N0h;
import X.C58704N2e;
import X.C61311O4l;
import X.C61740OKy;
import X.C62011OVj;
import X.C63120Opw;
import X.C63250Os2;
import X.C63269OsL;
import X.C63309Osz;
import X.C75792yF;
import X.C78598Ut0;
import X.C78983UzD;
import X.C79971Va3;
import X.NK5;
import X.O4B;
import X.O4I;
import X.O4W;
import X.OCP;
import X.OCQ;
import X.OCR;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OWC;
import X.OWE;
import X.ProgressDialogC43241Gy5;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.hox.Hox;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public class ARunnableS11S1100000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        String str2;
        String tag = ((JSONObject) this.l1).optString("tag");
        String creativeId = ((JSONObject) this.l1).optString("value");
        Map map = null;
        if (((JSONObject) this.l1).has("log_extra")) {
            str = ((JSONObject) this.l1).optString("log_extra");
        } else {
            str = null;
        }
        if (((JSONObject) this.l1).has("group_id")) {
            str2 = ((JSONObject) this.l1).optString("group_id");
        } else {
            str2 = null;
        }
        try {
            map = (Map) C75792yF.LIZIZ().LJII(((JSONObject) this.l1).optString("ad_extra_data"), new NK5().getType());
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        o.LJIIIIZZ(tag, "tag");
        String event = this.s0;
        o.LJIIIIZZ(event, "event");
        o.LJIIIIZZ(creativeId, "creativeId");
        C58655N0h LJ = C58704N2e.LJ(tag, event, creativeId, str, str2);
        JSONObject params = (JSONObject) this.l1;
        o.LJIIIIZZ(params, "params");
        LJ.LIZLLL(JsonExtKt.toMap(params));
        LJ.LIZ(map);
        LJ.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r6 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r0 = r6.l1
            com.lynx.react.bridge.ReadableMap r0 = (com.lynx.react.bridge.ReadableMap) r0
            if (r0 == 0) goto Lf
            java.util.HashMap r2 = r0.asHashMap()
        Lf:
            X.NlV r1 = X.C60297NlV.LIZLLL
            java.lang.String r5 = r6.s0
            r1.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L48
            X.Nok r4 = r1.LIZ()
            if (r4 == 0) goto L48
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.LIZLLL
            if (r0 == 0) goto L49
            java.lang.Object r1 = r0.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L49
            java.lang.String r1 = (java.lang.String) r1
        L30:
            X.Nlq r3 = new X.Nlq
            r3.<init>(r1, r2)
            X.1FP r2 = new X.1FP
            r2.<init>(r4, r3, r5)
            X.Nof r1 = r4.LIZ()
            if (r1 == 0) goto L48
            X.Nog r0 = new X.Nog
            r0.<init>(r4, r3, r2)
            r1.LIZLLL(r3, r0)
        L48:
            return
        L49:
            r1 = r5
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1100000_10.LIZ$1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r6 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r0 = r6.l1
            com.lynx.react.bridge.ReadableMap r0 = (com.lynx.react.bridge.ReadableMap) r0
            if (r0 == 0) goto Lf
            java.util.HashMap r2 = r0.asHashMap()
        Lf:
            X.NlV r1 = X.C60297NlV.LIZLLL
            java.lang.String r5 = r6.s0
            r1.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L48
            X.Nok r4 = r1.LIZ()
            if (r4 == 0) goto L48
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.LIZLLL
            if (r0 == 0) goto L49
            java.lang.Object r1 = r0.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L49
            java.lang.String r1 = (java.lang.String) r1
        L30:
            X.Nlq r3 = new X.Nlq
            r3.<init>(r1, r2)
            X.Ol0 r2 = new X.Ol0
            r2.<init>(r4, r3, r5)
            X.Nof r1 = r4.LIZ()
            if (r1 == 0) goto L48
            X.Nog r0 = new X.Nog
            r0.<init>(r4, r3, r2)
            r1.LIZLLL(r3, r0)
        L48:
            return
        L49:
            r1 = r5
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1100000_10.LIZ$2():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            r4 = this;
            java.lang.String r3 = ""
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZLLL()     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L4d
            X.NH3 r0 = X.C58909NAb.LIZ     // Catch: java.lang.Exception -> L47
            r0.getClass()     // Catch: java.lang.Exception -> L47
            X.NUm r0 = X.NH3.LIZ()     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L1b
            X.NTF r0 = (X.NTF) r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = X.NTF.LJI()     // Catch: java.lang.Exception -> L47
            if (r0 != 0) goto L1c
        L1b:
            r0 = r3
        L1c:
            X.PgZ r0 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4d
            X.PgU r0 = r0.LJFF()     // Catch: java.lang.Exception -> L47
            java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r1 = com.ss.android.ugc.aweme.ad.network.CommonApi.class
            X.PfT r0 = r0.LIZ     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L47
            com.ss.android.ugc.aweme.ad.network.CommonApi r1 = (com.ss.android.ugc.aweme.ad.network.CommonApi) r1     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L4d
            java.lang.String r0 = r4.s0     // Catch: java.lang.Exception -> L47
            X.Ek4 r0 = r1.doGet(r0)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4d
            X.Pbt r0 = r0.execute()     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4d
            T r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4d
            goto L4c
        L47:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            goto L4d
        L4c:
            r3 = r0
        L4d:
            boolean r0 = X.C2060386t.LIZ(r3)
            if (r0 != 0) goto L6d
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = (com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl) r0
            com.bytedance.keva.Keva r2 = r0.LJIIZILJ
            java.lang.String r1 = r0.LJIILJJIL
            java.lang.String r0 = r4.s0
            r2.storeString(r1, r0)
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = (com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl) r0
            r0.LJIILL = r3
            com.bytedance.keva.Keva r1 = r0.LJIIZILJ
            java.lang.String r0 = r0.LJIILIIL
            r1.storeString(r0, r3)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1100000_10.LIZ$3():void");
    }

    public final void LIZ$4() {
        if (((OWC) this.l1).LIZ.isFinishing()) {
            return;
        }
        OWC owc = (OWC) this.l1;
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = owc.LIZIZ;
        if (progressDialogC43241Gy5 != null) {
            progressDialogC43241Gy5.dismiss();
        }
        owc.LIZIZ = null;
        OWE owe = ((OWC) this.l1).LJ;
        if (owe != null) {
            owe.LIZ.setVideoPath(this.s0);
            C31268COy.LJI.LJ();
            LocalLiveWallPaperActivity localLiveWallPaperActivity = owe.LIZIZ;
            LiveWallPaperBean liveWallPaperBean = owe.LIZ;
            localLiveWallPaperActivity.getClass();
            Intent intent = new Intent(localLiveWallPaperActivity, (Class<?>) LiveWallPaperPreviewActivity.class);
            intent.putExtra("live_wall_paper", liveWallPaperBean);
            intent.putExtra("from", localLiveWallPaperActivity.LJLJL);
            C78598Ut0.LJIJJ(intent, localLiveWallPaperActivity);
            localLiveWallPaperActivity.startActivity(intent);
            C62011OVj.LJIIJJI(owe.LIZIZ.LJLJL, owe.LIZ.getId(), true);
        }
    }

    public final void LIZ$5() {
        if (!((O4I) this.l1).LIZ) {
            return;
        }
        O4I cacheList = (O4I) this.l1;
        o.LJIIJ(cacheList, "cacheList");
        C61311O4l c61311O4l = cacheList.LIZIZ.LIZ.get();
        if (!(c61311O4l instanceof C61311O4l)) {
            c61311O4l = null;
        }
        O4B o4b = (O4B) c61311O4l;
        StringBuilder sb = new StringBuilder();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        O4B o4b2 = o4b;
        boolean z = true;
        while (o4b != null) {
            String LIZIZ = o4b.LIZIZ();
            String LJLLJ = s.LJLLJ(s.LJLLLLLL('-', LIZIZ, LIZIZ), "forest_");
            if ((o4b.LJ() && linkedHashSet.contains(LJLLJ)) || ujb.o.LJJJJJL(o4b.LIZIZ())) {
                o4b.LIZLLL();
            }
            if (o4b.LIZ()) {
                if (o4b2 != o4b) {
                    if (o4b2 != null) {
                        o4b2.LIZ.set(o4b);
                    }
                    o4b2 = o4b;
                }
                linkedHashSet.add(LJLLJ);
                if (!z) {
                    sb.append(',');
                }
                sb.append(o4b.LIZIZ());
                z = false;
            }
            o4b = o4b.LIZJ();
        }
        if (o4b2 != null) {
            o4b2.LIZ.set(null);
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("write back ");
        LIZ.append(sb2);
        C39930Flm.LJI("ResponseCacheManager", X1D.LIZIZ(LIZ), false, 4);
        o.LJFF(sb2, "stringBuilder.toString()…rite back $it\")\n        }");
        if (ujb.o.LJJJJJL(sb2)) {
            O4W.LIZ(this.s0);
        } else {
            O4W.LIZIZ(this.s0, sb2);
        }
        ((O4I) this.l1).LIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[LOOP:0: B:16:0x0038->B:31:0x006f, LOOP_START, PHI: r1
      0x0038: PHI (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:15:0x0036, B:31:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            r7 = this;
            java.lang.String r0 = r7.s0
            if (r0 == 0) goto La
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L77
        La:
            r0 = 1
        Lb:
            r5 = 0
            if (r0 != 0) goto L75
            java.lang.String r1 = r7.s0
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.ORZ.LLFII(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.getRequestId()
        L20:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L75
            r6 = 1
        L27:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L68
        L38:
            int r3 = r1 + (-1)
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = X.ORZ.LJLLLLLL(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r6 == 0) goto L54
            if (r2 == 0) goto L71
            java.lang.String r1 = r2.getRequestId()
        L4c:
            java.lang.String r0 = r7.s0
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L68
        L54:
            if (r2 == 0) goto L66
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r2.getCardInsertInfo()
            if (r0 == 0) goto L66
            int r1 = r0.getCardType()
            r0 = 4
            if (r1 != r0) goto L66
            r4.add(r2)
        L66:
            if (r3 >= 0) goto L6f
        L68:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L9f
            goto L79
        L6f:
            r1 = r3
            goto L38
        L71:
            r1 = r5
            goto L4c
        L73:
            r0 = r5
            goto L20
        L75:
            r6 = 0
            goto L27
        L77:
            r0 = 0
            goto Lb
        L79:
            com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo r5 = X.C39468FeK.LIZJ()     // Catch: java.lang.Throwable -> L7d
        L7d:
            java.util.Iterator r4 = r4.iterator()
        L81:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData r2 = X.C71073Ruv.LIZ(r3)
            if (r2 != 0) goto L94
            goto L81
        L94:
            kotlin.jvm.internal.AqS143S0200000_12 r1 = new kotlin.jvm.internal.AqS143S0200000_12
            r0 = 153(0x99, float:2.14E-43)
            r1.<init>(r3, r2, r0)
            X.C71079Rv1.LIZ(r3, r2, r5, r1)
            goto L81
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1100000_10.LIZ$6():void");
    }

    public final void LIZ$7() {
        WebView webView = (WebView) this.l1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("javascript:window.Native2JSBridge._handleMessageFromApp(");
        LIZ.append(this.s0);
        LIZ.append(")");
        webView.evaluateJavascript(X1D.LIZIZ(LIZ), null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("callJsCode ====== ");
        LIZ2.append(this.s0);
        X1D.LIZIZ(LIZ2);
    }

    public final void LIZ$8() {
        String str = this.s0;
        if (!TextUtils.isEmpty(str) && ((CopyOnWriteArraySet) C63269OsL.LJIILIIL).remove(str)) {
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            C109544Rq c109544Rq = (C109544Rq) this.l1;
            LIZLLL.getClass();
            if (c109544Rq != null && !TextUtils.isEmpty(c109544Rq.getConversationId())) {
                LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63250Os2(c109544Rq, true));
            }
        }
        C63309Osz LIZLLL2 = C63309Osz.LIZLLL();
        C109544Rq c109544Rq2 = (C109544Rq) this.l1;
        LIZLLL2.getClass();
        LIZLLL2.LJIIJJI(Collections.singletonList(c109544Rq2));
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(((C109544Rq) this.l1).getConversationId());
        if (LJIIIZ != null && LJIIIZ.getLastShowMessage() != null && TextUtils.equals(LJIIIZ.getLastShowMessage().getUuid(), ((C109544Rq) this.l1).getUuid())) {
            LJIIIZ.setLastShowMessage((C109544Rq) this.l1);
            C115284fk.LJIILIIL().LJIJI(2, LJIIIZ);
        }
    }

    public static final void run$0(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            ((C79971Va3) aRunnableS11S1100000_10.l1).LIZJ(aRunnableS11S1100000_10.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            ((C79971Va3) aRunnableS11S1100000_10.l1).LIZJ(aRunnableS11S1100000_10.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            ((OCQ) aRunnableS11S1100000_10.l1).LIZ.LIZ(new OCR(((OCQ) aRunnableS11S1100000_10.l1).LIZIZ, aRunnableS11S1100000_10.s0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS11S1100000_10.l1;
            String str = aRunnableS11S1100000_10.s0;
            if (str == null) {
                str = "body is null";
            }
            C31626Cb8.LIZ(completionBlock, 0, str, 4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            if (OL3.LIZJ(aRunnableS11S1100000_10.s0)) {
                OL3.LIZIZ = false;
                Context context = (Context) aRunnableS11S1100000_10.l1;
                OL2.LIZIZ(context, OL1.LIZIZ, false, false);
                C61740OKy c61740OKy = OL3.LJFF;
                if (c61740OKy != null && context != null) {
                    ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                    if (LJJIFFI != null) {
                        try {
                            Hox.LJLLI.LIZ(LJJIFFI).zv0("page_profile", c61740OKy);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS11S1100000_10 aRunnableS11S1100000_10) {
        boolean LIZ;
        try {
            aRunnableS11S1100000_10.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S1100000_10(OCP ocp, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = ocp.LIZ;
    }

    public ARunnableS11S1100000_10(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
