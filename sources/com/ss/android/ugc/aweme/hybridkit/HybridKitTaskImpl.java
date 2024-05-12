package com.ss.android.ugc.aweme.hybridkit;

import X.C16880lQ;
import X.C233889Fw;
import X.C35546DxG;
import X.C38557FBh;
import X.C40101FoX;
import X.C40169Fpd;
import X.C40342FsQ;
import X.C40343FsR;
import X.C45804HyK;
import X.C47261Igj;
import X.C58096Mr6;
import X.C60788NtQ;
import X.C78926UyI;
import X.C78939UyV;
import X.C96Q;
import X.EE1;
import X.InterfaceC60814Ntq;
import X.M2K;
import X.OKG;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitInitTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitInitWebKitTask;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.List;
import ujb.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class HybridKitTaskImpl implements IHybridKitService {
    public static IHybridKitService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IHybridKitService.class, false);
        if (LIZ != null) {
            return (IHybridKitService) LIZ;
        }
        if (C58096Mr6.e1 == null) {
            synchronized (IHybridKitService.class) {
                if (C58096Mr6.e1 == null) {
                    C58096Mr6.e1 = new HybridKitTaskImpl();
                }
            }
        }
        return C58096Mr6.e1;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final InterfaceC60814Ntq LJ() {
        return new C60788NtQ();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJFF() {
        return new HybridKitInitTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJIIIIZZ() {
        return new HybridKitInitWebKitTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJIIJ() {
        return new HybridKitConfigTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJII() {
        SpecActServiceImpl.LJJJIL().LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZ(String str) {
        boolean z;
        C233889Fw LIZIZ = C35546DxG.LIZIZ(str);
        if (LIZIZ.LIZ && C96Q.LIZ(LIZIZ.LIZIZ)) {
            IComplianceBusinessService LJFF = a.LJFF();
            String str2 = LIZIZ.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (LJFF.LIZ(str2)) {
                z = true;
                if (!LIZIZ.LIZ && z) {
                    return true;
                }
            }
        }
        z = false;
        return !LIZIZ.LIZ ? false : false;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZIZ(String str) {
        boolean z;
        C233889Fw LIZIZ = C35546DxG.LIZIZ(str);
        if (LIZIZ.LIZ && C96Q.LIZ(LIZIZ.LIZIZ)) {
            IComplianceBusinessService LJFF = a.LJFF();
            String str2 = LIZIZ.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (LJFF.LIZIZ(str2)) {
                z = true;
                if (!LIZIZ.LIZ && z) {
                    return true;
                }
            }
        }
        z = false;
        return !LIZIZ.LIZ ? false : false;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZJ(String str) {
        boolean z;
        C233889Fw LIZIZ = C35546DxG.LIZIZ(str);
        if (LIZIZ.LIZ && C96Q.LIZ(LIZIZ.LIZIZ)) {
            IComplianceBusinessService LJFF = a.LJFF();
            String str2 = LIZIZ.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (LJFF.LIZJ(str2)) {
                z = true;
                if (!LIZIZ.LIZ && z) {
                    return true;
                }
            }
        }
        z = false;
        return !LIZIZ.LIZ ? false : false;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIIIZ(Context context, String str) {
        String str2;
        Intent intent;
        String LLJJIJIIJIL;
        Intent intent2;
        SparkContext sparkContext = new SparkContext();
        if (o.LJJJLIIL(str, "http", false)) {
            str = new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", str).appendQueryParameter("use_spark", "1").build().toString();
            kotlin.jvm.internal.o.LJIIIIZZ(str, "Builder().scheme(FConsta…      .build().toString()");
        }
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("need_sec_link", "sec_link_scene");
        Uri LIZ = C35546DxG.LIZ(str);
        Uri LIZ2 = C35546DxG.LIZ(C78926UyI.LJJJJI(LIZ, "url"));
        for (String str3 : LJJIJIIJI) {
            C78939UyV.LJJJJIZL(LIZ, str3);
            C78939UyV.LJJJJIZL(LIZ2, str3);
        }
        String uri = C78939UyV.LJJJJIZL(LIZ, "url").buildUpon().appendQueryParameter("url", LIZ2.toString()).build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "uri.removeQueryParameter…ing()).build().toString()");
        Uri LIZ3 = C35546DxG.LIZ(uri);
        String builder = LIZ3.buildUpon().appendQueryParameter("target_handler", "crossPlatform").toString();
        kotlin.jvm.internal.o.LJIIIIZZ(builder, "uri.buildUpon().appendQu…ace,\n        ).toString()");
        String LJJJJI = C78926UyI.LJJJJI(LIZ3, "__spark_session_id");
        if (LJJJJI != null && LJJJJI.length() > 0) {
            C40101FoX.LIZ(LJJJJI, sparkContext.containerId);
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        sparkContext.LJJIJLIJ(builder);
        sparkContext.LJII(M2K.class, C40169Fpd.LJLIL);
        sparkContext.LJJIIJ("transition_animation", LiveGiftNewGifterBadgeSetting.DEFAULT);
        sparkContext.LJJIIJ("skip_sec_link_first_jump", "1");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        String str4 = "";
        if (LJIJJ == null || (intent2 = LJIJJ.getIntent()) == null || (str2 = C16880lQ.LLJJIJIIJIL(intent2, "need_sec_link")) == null) {
            str2 = "";
        }
        sparkContext.LJJIIJ("need_sec_link", str2);
        Activity LJIJJ2 = C45804HyK.LJIJJ(context);
        if (LJIJJ2 != null && (intent = LJIJJ2.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "sec_link_scene")) != null) {
            str4 = LLJJIJIIJIL;
        }
        sparkContext.LJJIIJ("sec_link_scene", str4);
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:23|24|(1:26)|27|(2:29|30)(1:56)|(5:46|47|(1:49)|50|(9:52|33|34|(4:36|(1:42)|38|(4:40|6|7|(1:16)(1:14)))|43|6|7|(1:9)|16))|32|33|34|(0)|43|6|7|(0)|16) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:2|3)|(3:20|21|(15:23|24|(1:26)|27|(2:29|30)(1:56)|(5:46|47|(1:49)|50|(9:52|33|34|(4:36|(1:42)|38|(4:40|6|7|(1:16)(1:14)))|43|6|7|(1:9)|16))|32|33|34|(0)|43|6|7|(0)|16))|5|6|7|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:34:0x0043, B:36:0x0047, B:38:0x004f), top: B:33:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007a  */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            r3 = 1
            r4 = 0
            X.9Fw r2 = X.C35546DxG.LIZIZ(r10)     // Catch: java.lang.Throwable -> L69
            X.9Fw r8 = X.C35546DxG.LIZIZ(r11)     // Catch: java.lang.Throwable -> L69
            boolean r5 = r2.LIZ     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L5e
            java.lang.String r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L5c
            boolean r0 = X.C96Q.LIZ(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r1 = yq4.a.LJFF()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = ""
            if (r0 != 0) goto L21
            r0 = r7
        L21:
            boolean r0 = r1.LIZLLL(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r3) goto L28
            goto L2a
        L28:
            r6 = 0
            goto L2b
        L2a:
            r6 = 1
        L2b:
            if (r12 != 0) goto L42
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r1 = yq4.a.LJFF()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L36
            r0 = r7
        L36:
            boolean r0 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r3) goto L42
            r2 = 1
            goto L43
        L3e:
            r0 = move-exception
            r2 = 0
            r1 = 0
            goto L71
        L42:
            r2 = 0
        L43:
            boolean r0 = r8.LIZ     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r1 = yq4.a.LJFF()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L54
        L4f:
            boolean r0 = r1.LIZ(r7)     // Catch: java.lang.Throwable -> L6f
            goto L56
        L54:
            r7 = r0
            goto L4f
        L56:
            if (r0 != r3) goto L5a
            r1 = 1
            goto L61
        L5a:
            r1 = 0
            goto L61
        L5c:
            r0 = move-exception
            goto L6b
        L5e:
            r2 = 0
            r1 = 0
            r6 = 0
        L61:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L67
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L67
            goto L78
        L67:
            r0 = move-exception
            goto L71
        L69:
            r0 = move-exception
            r5 = 0
        L6b:
            r2 = 0
            r1 = 0
            r6 = 0
            goto L71
        L6f:
            r0 = move-exception
            r1 = 0
        L71:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L78:
            if (r5 == 0) goto L89
            java.lang.String r0 = "spark_webview_third_isolation"
            boolean r0 = X.C19N.LJ(r0, r4)
            if (r0 == 0) goto L89
            if (r6 == 0) goto L89
            if (r1 != 0) goto L89
            if (r2 != 0) goto L89
        L88:
            return r3
        L89:
            r3 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LJI(java.lang.String, java.lang.String, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LIZLLL(Context context, String url, String str, Bundle bundle) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        C38557FBh.LIZ(context, url, str, bundle);
    }
}
