package X;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.CAc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30882CAc {
    public static volatile C30882CAc LJ;
    public final List<COJ> LIZ = new CopyOnWriteArrayList();
    public final java.util.Set<InterfaceC252939wH> LIZIZ;
    public final C28637BLt<O5Z> LIZJ;
    public final List<WeakReference<WebView>> LIZLLL;

    public static C30882CAc LIZJ() {
        if (LJ == null) {
            synchronized (C30882CAc.class) {
                if (LJ == null) {
                    LJ = new C30882CAc();
                }
            }
        }
        return LJ;
    }

    public C30882CAc() {
        new CopyOnWriteArrayList();
        HashSet hashSet = new HashSet();
        this.LIZIZ = hashSet;
        this.LIZJ = new C28637BLt<>();
        this.LIZLLL = new ArrayList();
        hashSet.add(new InterfaceC252939wH() { // from class: X.9wG
            @Override // X.InterfaceC252939wH
            public final boolean LIZ(String str) {
                Context LIZLLL;
                boolean z = false;
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if ((!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) || TextUtils.isEmpty(str)) {
                    return false;
                }
                if (!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) {
                    return false;
                }
                try {
                    if (C16880lQ.LLLLLLZ(C15380j0.LIZLLL().getPackageManager(), "com.android.vending", 0) != null && (LIZLLL = C15380j0.LIZLLL()) != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(UriProtector.parse(str));
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
                            C16880lQ.LIZJ(LIZLLL, intent);
                            z = true;
                            return true;
                        } catch (Throwable unused) {
                            return z;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C16880lQ.LLLLIIL(e);
                    return false;
                }
                return false;
            }
        });
        CO3.LIZ();
    }

    public final HybridDialogFragment LIZ(C28870BUs c28870BUs) {
        C29261Be5.LIZ(c28870BUs.LIZ);
        if (TextUtils.equals(UriProtector.getQueryParameter(UriProtector.parse(c28870BUs.LIZ), "landscape"), "1")) {
            c28870BUs.LJIILIIL = true;
        }
        HybridDialogFragment hybridDialogFragment = new HybridDialogFragment();
        hybridDialogFragment.LLFII = c28870BUs.LIZ;
        hybridDialogFragment.LLFZ = c28870BUs.LIZIZ;
        hybridDialogFragment.LLI = c28870BUs.LIZJ;
        hybridDialogFragment.LLIFFJFJJ = c28870BUs.LJIIIZ;
        hybridDialogFragment.LLII = c28870BUs.LJ;
        hybridDialogFragment.LLIIIZ = c28870BUs.LIZLLL;
        hybridDialogFragment.LLIIII = c28870BUs.LJFF;
        hybridDialogFragment.LLIIIILZ = c28870BUs.LJI;
        hybridDialogFragment.LLIIIL = c28870BUs.LJII;
        hybridDialogFragment.LLIIIJ = c28870BUs.LJIIIIZZ;
        hybridDialogFragment.LLIILZL = c28870BUs.LJIIJJI;
        hybridDialogFragment.LLIIZ = c28870BUs.LJIIL;
        hybridDialogFragment.LLILII = c28870BUs.LJIILIIL;
        hybridDialogFragment.LLIL = c28870BUs.LJIILJJIL;
        hybridDialogFragment.LLILIL = c28870BUs.LJIILL;
        hybridDialogFragment.LLILLL = c28870BUs.LJJIIZ;
        hybridDialogFragment.LLILLJJLI = c28870BUs.LJJIIZI;
        hybridDialogFragment.LLILL = c28870BUs.LJIIJ;
        hybridDialogFragment.LLILLIZIL = "";
        hybridDialogFragment.LLILZ = c28870BUs.LJIJI;
        hybridDialogFragment.LJLZ = c28870BUs.LJIJJLI;
        hybridDialogFragment.LJZ = c28870BUs.LJIL;
        hybridDialogFragment.LJZI = c28870BUs.LJJ;
        hybridDialogFragment.LJZL = c28870BUs.LJJI;
        hybridDialogFragment.LLFFF = c28870BUs.LJJIFFI;
        hybridDialogFragment.LLFF = c28870BUs.LJIJJ;
        hybridDialogFragment.LL = c28870BUs.LJIILLIIL;
        hybridDialogFragment.LLD = c28870BUs.LJIIZILJ;
        hybridDialogFragment.LLF = c28870BUs.LJIJ;
        hybridDialogFragment.LLJI = c28870BUs.LJJII;
        hybridDialogFragment.LLILZLL = c28870BUs.LJJIII;
        hybridDialogFragment.LLJIJIL = c28870BUs.LJJIIJ;
        hybridDialogFragment.LLJILJIL = c28870BUs.LJJIIJZLJL;
        hybridDialogFragment.LLJ = true;
        return hybridDialogFragment;
    }

    public final O5Z LJ(Context context) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        O5Z o5z = new O5Z(context);
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = "other";
        }
        C78894Uxm.LJ(str, o5z, currentTimeMillis);
        C31949CgL.LIZ().getClass();
        C31949CgL.LIZIZ(o5z);
        ((ArrayList) this.LIZLLL).add(new WeakReference(o5z));
        return o5z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C30884CAe r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L51
            java.util.List<X.COJ> r0 = r6.LIZ
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r7)
            com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings r0 = com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings.INSTANCE
            boolean r0 = r0.enableRecycleWebview()
            if (r0 == 0) goto L52
            android.webkit.WebView r1 = r7.LJLIL
            boolean r0 = r1 instanceof X.O5Z
            if (r0 == 0) goto L52
            r1.stopLoading()
            android.webkit.WebView r0 = r7.LJLIL
            r1 = 0
            java.lang.String r2 = ""
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "utf-8"
            r5 = r1
            r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)
            android.webkit.WebView r0 = r7.LJLIL
            r0.clearHistory()
            android.webkit.WebView r1 = r7.LJLIL
            r0 = 0
            X.CO4.LIZ(r1, r0)
            X.BLt<X.O5Z> r1 = r6.LIZJ
            android.webkit.WebView r0 = r7.LJLIL
            X.O5Z r0 = (X.O5Z) r0
            r1.LIZIZ(r0)
        L3b:
            X.CAj r0 = r7.LJLILLLLZI
            if (r0 == 0) goto L42
            r0.release()
        L42:
            r1 = 0
            r7.LJLILLLLZI = r1
            r7.LJLIL = r1
            X.CAp r0 = r7.LJLJI
            if (r0 == 0) goto L51
            X.COO r0 = (X.COO) r0
            r0.LJLILLLLZI = r1
            r7.LJLJI = r1
        L51:
            return
        L52:
            android.webkit.WebView r1 = r7.LJLIL
            r0 = 1
            X.CO4.LIZ(r1, r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30882CAc.LJFF(X.CAe):void");
    }

    public static final void LIZLLL(C30884CAe c30884CAe, String str) {
        java.util.Map<String, String> hashMap;
        if (c30884CAe == null || c30884CAe.LJLIL == null) {
            return;
        }
        if (C31947CgJ.LJ(str)) {
            hashMap = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).Vg0(str);
        } else {
            hashMap = new HashMap<>();
        }
        C31947CgJ.LJI(c30884CAe.LJLIL, str, hashMap);
    }

    public static final void LJII(Context context, C28871BUt c28871BUt) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", c28871BUt.LIZJ);
        bundle.putBoolean("hide_status_bar", c28871BUt.LIZLLL);
        bundle.putString("title", c28871BUt.LIZIZ);
        bundle.putBoolean("show_progress", false);
        bundle.putBoolean("bundle_user_webview_title", c28871BUt.LJII);
        bundle.putString("status_bar_color", c28871BUt.LJ);
        bundle.putString("status_bar_bg_color", c28871BUt.LJFF);
        bundle.putInt("bundle_web_view_background_color", C15380j0.LIZIZ(R.color.zu));
        bundle.putString("original_scheme", c28871BUt.LJI);
        bundle.putString("soft_input_mode", c28871BUt.LJIIIIZZ);
        ((IHostAction) CN1.LIZ(IHostAction.class)).openLiveBrowser(c28871BUt.LIZ, bundle, context);
    }

    public final C30884CAe LIZIZ(ActivityC45651qj activityC45651qj, COV cov) {
        O5Z o5z;
        String str;
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        if (LiveBannerDegradeSettings.INSTANCE.enableRecycleWebview()) {
            C28636BLs LIZ = this.LIZJ.LIZ(O5Z.class);
            if (((ArrayList) LIZ.LIZ).size() >= 1) {
                List list = LIZ.LIZ;
                obj = ListProtector.remove(list, ((ArrayList) list).size() - 1);
            } else {
                obj = null;
            }
            o5z = (O5Z) obj;
            if (o5z == null) {
                o5z = new O5Z(activityC45651qj);
            }
            if (o5z.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) o5z.getContext()).setBaseContext(activityC45651qj);
            }
        } else {
            o5z = new O5Z(C16880lQ.LLLLJ(activityC45651qj));
        }
        if (activityC45651qj != null) {
            str = activityC45651qj.getClass().getName();
        } else {
            str = "other";
        }
        C78894Uxm.LJ(str, o5z, currentTimeMillis);
        o5z.setHorizontalScrollBarEnabled(false);
        o5z.setVerticalScrollBarEnabled(false);
        o5z.getSettings().setMixedContentMode(2);
        C31949CgL.LIZ().getClass();
        C31949CgL.LIZIZ(o5z);
        COO coo = new COO(cov);
        C30888CAi c30888CAi = new C30888CAi();
        C31886CfK LIZLLL = C31886CfK.LIZLLL(activityC45651qj, o5z, coo, c30888CAi);
        c30888CAi.LIZ = LIZLLL;
        coo.LJLIL = LIZLLL.LJLJI.LIZIZ;
        C60408NnI c60408NnI = new C60408NnI(activityC45651qj);
        c60408NnI.LIZIZ = true;
        c60408NnI.LIZ(o5z);
        C30884CAe c30884CAe = new C30884CAe(o5z, LIZLLL, coo);
        ((CopyOnWriteArrayList) this.LIZ).add(c30884CAe);
        ((ArrayList) this.LIZLLL).add(new WeakReference(o5z));
        return c30884CAe;
    }

    public final boolean LJI(WebView webView, String str) {
        java.util.Set<InterfaceC252939wH> set = this.LIZIZ;
        if (set != null && ((HashSet) set).size() > 0) {
            Iterator it = ((HashSet) this.LIZIZ).iterator();
            while (it.hasNext()) {
                if (((InterfaceC252939wH) it.next()).LIZ(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
