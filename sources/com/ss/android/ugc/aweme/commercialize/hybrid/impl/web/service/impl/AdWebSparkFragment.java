package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.ActivityC45651qj;
import X.C109464Ri;
import X.C10A;
import X.C117144ik;
import X.C12460eI;
import X.C141335gf;
import X.C29S;
import X.C38262Ezy;
import X.C39836FkG;
import X.C39916FlY;
import X.C3C5;
import X.C59222NMc;
import X.C59485NWf;
import X.C60601NqP;
import X.C60723NsN;
import X.C61712OJw;
import X.C61713OJx;
import X.C63081OpJ;
import X.C76800UCe;
import X.C90903hW;
import X.FFL;
import X.InterfaceC59494NWo;
import X.InterfaceC59499NWt;
import X.InterfaceC60761Nsz;
import X.InterfaceC60770Nt8;
import X.NMS;
import X.NZ2;
import X.OM1;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VMI;
import X.X1D;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebSparkFragment extends SparkFragment implements NMS {
    public boolean LLD;
    public NZ2 LLF;
    public SparkContext LLFF;
    public long LLFFF;
    public C61713OJx LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public AdWebSparkFragment() {
        super(0);
        this.LLD = true;
    }

    public final NZ2 Al() {
        NZ2 nz2 = this.LLF;
        if (nz2 == null) {
            SparkContext xl = xl();
            if (xl != null && (nz2 = (NZ2) xl.LIZIZ(NZ2.class)) != null) {
                nz2.LJ();
            } else {
                nz2 = null;
            }
        }
        this.LLF = nz2;
        return nz2;
    }

    @Override // X.NMS
    public final void onHide() {
        Object obj;
        OM1 om1;
        OM1 om12;
        InterfaceC60770Nt8 interfaceC60770Nt8;
        Object obj2;
        WebBackForwardList webBackForwardList;
        View view;
        WebView webView;
        InterfaceC60761Nsz kitView;
        WebView webView2;
        InterfaceC60761Nsz kitView2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView2.onHide();
        }
        SparkContext xl = xl();
        Object obj3 = null;
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                obj2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView();
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof WebKitView) && (webView2 = (WebView) obj2) != null) {
                webBackForwardList = webView2.copyBackForwardList();
            } else {
                webBackForwardList = null;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getKitView()) != null) {
                view = kitView.LIZJ();
            } else {
                view = null;
            }
            if (view instanceof WebView) {
                webView = (WebView) view;
            } else {
                webView = null;
            }
            interfaceC60770Nt8.LJIILJJIL(webBackForwardList, webView, null);
        }
        NZ2 Al = Al();
        if (Al != null) {
            Al.onHide();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
            obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getKitView();
        } else {
            obj = null;
        }
        if ((obj instanceof WebKitView) && (om12 = (OM1) obj) != null) {
            om12.onPause();
        }
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "fix_fragment_pv", true, false)) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 = this.LJLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 != null) {
                    obj3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5.getKitView();
                }
                if ((obj3 instanceof WebKitView) && (om1 = (OM1) obj3) != null) {
                    om1.stopLoading();
                }
            }
        } catch (Exception unused) {
        }
        C61713OJx c61713OJx = this.LLFII;
        if (c61713OJx != null) {
            c61713OJx.LIZIZ.LJIIL();
            c61713OJx.LIZIZ.LJIIJ(false);
            c61713OJx.LIZJ();
        }
    }

    @Override // X.NMS
    public final void onShow() {
        OM1 om1;
        InterfaceC60770Nt8 interfaceC60770Nt8;
        C59222NMc c59222NMc;
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
        NZ2 Al = Al();
        if (Al != null) {
            Al.onShow();
        }
        SparkContext xl = xl();
        Object obj = null;
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            SparkContext xl2 = xl();
            if (xl2 != null) {
                c59222NMc = (C59222NMc) xl2.LIZIZ(C59222NMc.class);
            } else {
                c59222NMc = null;
            }
            interfaceC60770Nt8.LJI(c59222NMc);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView();
        }
        if ((obj instanceof WebKitView) && (om1 = (OM1) obj) != null) {
            om1.onResume();
        }
        C61713OJx c61713OJx = this.LLFII;
        if (c61713OJx != null) {
            c61713OJx.LIZIZ.LJIIL();
            c61713OJx.LIZIZ.LJIIJ(true);
            c61713OJx.LIZ(false);
            c61713OJx.LIZJ();
        }
    }

    public final SparkContext xl() {
        String str;
        SparkContext sparkContext = this.LLFF;
        if (sparkContext == null) {
            C109464Ri.LIZ.getClass();
            C117144ik c117144ik = C117144ik.LIZIZ;
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("SparkContextContainerId");
            } else {
                str = null;
            }
            c117144ik.getClass();
            sparkContext = C117144ik.LIZ(str);
        }
        this.LLFF = sparkContext;
        return sparkContext;
    }

    @Override // X.NMS
    public final boolean LJIIJ() {
        SparkContext xl;
        InterfaceC59499NWt interfaceC59499NWt;
        InterfaceC59494NWo LIZIZ;
        InterfaceC60770Nt8 interfaceC60770Nt8;
        SparkContext xl2 = xl();
        if (xl2 != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl2.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.LJIIIZ("full_screen_system_click");
        }
        SparkContext xl3 = xl();
        if ((xl3 != null && (LIZIZ = (InterfaceC59494NWo) xl3.LIZIZ(InterfaceC59494NWo.class)) != null) || ((xl = xl()) != null && (interfaceC59499NWt = (InterfaceC59499NWt) xl.LIZIZ(InterfaceC59499NWt.class)) != null && (LIZIZ = interfaceC59499NWt.LIZIZ()) != null)) {
            LIZIZ.LJ();
            return true;
        }
        return false;
    }

    @Override // X.NMS
    public final void LJJLI() {
        NZ2 Al = Al();
        if (Al != null) {
            Al.LJJLI();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        finish();
        super.onDestroy();
        NZ2 Al = Al();
        if (Al != null) {
            Al.onDestroy();
        }
        SparkContext xl = xl();
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.onDestroy();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        KeyEvent.Callback callback;
        InterfaceC60761Nsz kitView;
        super.onPause();
        SparkContext xl = xl();
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
            WebView webView = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                callback = kitView.LIZJ();
            } else {
                callback = null;
            }
            if (callback instanceof WebView) {
                webView = (WebView) callback;
            }
            interfaceC60770Nt8.LJII(webView);
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        super.onResume();
        SparkContext xl = xl();
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.onResume();
        }
    }

    @Override // X.NMS
    public final void I1(String str) {
        C59222NMc c59222NMc;
        SparkContext xl = xl();
        if (xl == null || (c59222NMc = (C59222NMc) xl.LIZIZ(C59222NMc.class)) == null) {
            return;
        }
        c59222NMc.LJ = str;
    }

    @Override // X.NMS
    public final void LLLJIL(Runnable runnable) {
        NZ2 Al = Al();
        if (Al != null) {
            Al.LLLJIL(runnable);
        }
    }

    @Override // X.NMS
    public final void loadUrl(String schema) {
        String str;
        C59222NMc c59222NMc;
        o.LJIIIZ(schema, "schema");
        if (!this.LLD) {
            return;
        }
        SparkContext xl = xl();
        if (xl != null && (c59222NMc = (C59222NMc) xl.LIZIZ(C59222NMc.class)) != null) {
            c59222NMc.LJIJJ = true;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://webview?url=");
            LIZ.append(Uri.encode(schema));
            String LIZ2 = C39916FlY.LIZ(X1D.LIZIZ(LIZ));
            SparkContext xl2 = xl();
            String str2 = null;
            if (xl2 != null) {
                str = xl2.url;
            } else {
                str = null;
            }
            boolean LJ = o.LJ(LIZ2, str);
            SparkContext xl3 = xl();
            if (xl3 != null) {
                str2 = xl3.url;
            }
            if (o.LJ(str2, "") || !LJ) {
                SparkContext xl4 = xl();
                if (xl4 != null) {
                    xl4.LJJIJLIJ(LIZ2);
                    InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                    if (kitView != null) {
                        kitView.load(schema);
                        return;
                    }
                    return;
                }
                return;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        o.LJIIIZ(view, "view");
        if (!(mo49getActivity() instanceof AdWebSparkActivity)) {
            C39836FkG.LJII.getClass();
            int LJJJJLI = C63081OpJ.LJJJJLI(C38262Ezy.LIZ().LIZIZ());
            C60723NsN c60723NsN = this.LJLJJI;
            if (c60723NsN != null && (findViewById = c60723NsN.findViewById(R.id.k98)) != null) {
                findViewById.setPadding(0, LJJJJLI, 0, 0);
                findViewById.setBackgroundColor(-1);
            }
        }
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        this.LLFII = LIZIZ;
        LIZIZ.LIZIZ.LJIIL();
        LIZIZ.LIZIZ.LJIIJ(true);
        LIZIZ.LIZ(false);
        LIZIZ.LIZJ();
        NZ2 Al = Al();
        if (Al != null) {
            Al.LLLL();
        }
        view.setClickable(true);
        if (this.LLD) {
            return;
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC60761Nsz kitView;
        View LIZJ;
        InterfaceC60761Nsz kitView2;
        View LIZJ2;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null && (LIZJ2 = kitView2.LIZJ()) != null) {
            VMI vmi = VMI.LJ;
            vmi.getClass();
            C60601NqP c60601NqP = new C60601NqP();
            c60601NqP.LJFF = "tt_ad_web";
            c60601NqP.LIZIZ = new String[]{String.valueOf(LIZJ2.hashCode())};
            c60601NqP.LJII = new C59485NWf(LIZJ2, this);
            vmi.LJIILJJIL(c60601NqP);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null && (LIZJ = kitView.LIZJ()) != null) {
            C12460eI.LJ(LIZJ, new AqS176S0100000_10(this, 126));
        }
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
