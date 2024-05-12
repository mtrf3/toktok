package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class OXH {
    public static OXL LJII;
    public static AqS160S0100000_10 LJIIIIZZ;
    public final Activity LIZ;
    public final C38049EwX LIZIZ;
    public final InterfaceC60761Nsz LIZJ;
    public final C62394OeE LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJ;
    public boolean LJFF;
    public final OXI LJI = new OXI(this);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r12 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r1 = r3.extras;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r13 = r1.getString("page_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r13 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = r3.extras;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r14 = r1.getString("params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r14 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if ((r3 instanceof com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        ((com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage) r3).callback = new kotlin.jvm.internal.AqS157S0200000_10(r19, r3, 34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r1 = r19.LIZ;
        r2 = r19.LIZLLL.LJIIZILJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if ((r2 instanceof com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r2 = (com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r2 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r4 = r2.hybridContainerInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r0 = r4.url;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (X.C78685UuP.LJJJZ(r0) != true) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        r7 = new com.bytedance.hybrid.spark.SparkContext();
        r2 = r4.url;
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "hybridContainerInfo.url");
        r7.LJJIJLIJ(r2);
        r7.LJIL(r19.LJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (r4.urlContentType != 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r8 = r4.initData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r8 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r8.isEmpty() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        r6 = new X.C60606NqU(null, com.bytedance.mt.protector.impl.UriProtector.parse(r7.LJIILLIIL()), 31);
        r2 = new X.C60439Nnn();
        r8 = X.C75302xS.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        if ((r8 instanceof java.util.Map) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r2.LIZ = com.lynx.tasm.TemplateData.LJ((java.util.Map) r5);
        r6.LJJII = r2;
        r7.hybridParams = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        X.C40343FsR.LJIILJJIL.getClass();
        r0 = X.C40343FsR.LIZ(X.C40342FsQ.LIZ(r1, r7));
        r19.LJ = r0;
        r0.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        r2 = r19.LIZLLL;
        r2.LJJIJIIJIL = true;
        r2.LJJIJIL = new kotlin.jvm.internal.IDqS185S0200000_10(r19, r4, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
    
        X.OXH.LJII = new X.OXL(r19, r10, r11, r12, r13, r14);
        X.OXH.LJIIIIZZ = new kotlin.jvm.internal.AqS160S0100000_10(r19, 465);
        com.ss.android.ugc.aweme.share.ShareDependService.LIZ.getClass();
        r12 = X.C44498HdG.LIZ();
        r13 = r19.LIZ;
        r0 = r19.LIZLLL;
        r0.getClass();
        X.OQA.LIZLLL(r12, r13, new X.C62387Oe7(r0), r15, null, false, 24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r4.urlContentType != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        r2 = X.C42193GhB.LIZIZ("aweme://webview/?url=about%3Ablank");
        r2.LJIL(r19.LJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        X.C40343FsR.LJIILJJIL.getClass();
        r19.LJ = X.C40343FsR.LIZ(X.C40342FsQ.LIZ(r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        if (r4.urlContentType != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (X.C78685UuP.LJJJZ(r4.urlContent) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r0 = r19.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        r5 = r0.getKitView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        if ((r5 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        r1 = r4.urlContent;
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "hybridContainerInfo.urlContent");
        r2 = android.util.Base64.encodeToString(ujb.o.LJJJIL(r1), 1);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "encodeToString((hybridCo…ray(), Base64.NO_PADDING)");
        ((X.OM1) r5).loadData(r2, "text/html", "base64");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0132, code lost:
    
        r2 = X.C42193GhB.LIZIZ("");
        r2.LJIL(r19.LJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0059, code lost:
    
        r13 = "webview";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x004b, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x003c, code lost:
    
        if (r3 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXH.LIZ():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View] */
    public final Bitmap LIZIZ(WebShareInfo.HybridContainerInfo hybridContainerInfo) {
        boolean z;
        String str;
        View view;
        VNS vns;
        String str2;
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJ;
        if (hybridContainerInfo != null && hybridContainerInfo.urlContentType == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (hybridContainerInfo != null) {
                str = hybridContainerInfo.captureViewName;
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                    view = kitView.LIZJ();
                } else {
                    view = null;
                }
                if ((view instanceof C60726NsQ) && (vns = (VNS) view) != null) {
                    if (hybridContainerInfo != null) {
                        str2 = hybridContainerInfo.captureViewName;
                    } else {
                        str2 = null;
                    }
                    ?? findViewByName = vns.findViewByName(str2);
                    if (findViewByName != 0) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = findViewByName;
                        return C42599Gnj.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    }
                }
            }
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return null;
        }
        return C42599Gnj.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
    }

    public OXH(Activity activity, C38049EwX c38049EwX, InterfaceC60761Nsz interfaceC60761Nsz, C62394OeE c62394OeE) {
        this.LIZ = activity;
        this.LIZIZ = c38049EwX;
        this.LIZJ = interfaceC60761Nsz;
        this.LIZLLL = c62394OeE;
    }
}
