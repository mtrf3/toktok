package com.ss.android.ugc.aweme.commercialize.preview.ui;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C223338pd;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C48189Ivh;
import X.C61175Nzf;
import X.C61712OJw;
import X.C61713OJx;
import X.C73305Spp;
import X.C73306Spq;
import X.C73426Srm;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78983UzD;
import X.C78999UzT;
import X.C81244Vua;
import X.C90903hW;
import X.FMX;
import X.InterfaceC61213O0r;
import X.InterfaceC64592gB;
import X.O60;
import X.O61;
import X.O64;
import X.O65;
import X.O67;
import X.O68;
import X.T16;
import Y.AfS62S0100000_10;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.preview.experiment.PreviewConfiguration;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes11.dex */
public final class AdsPreviewFragment extends Hilt_AdsPreviewFragment implements O61 {
    public AdsPreviewStateManager LJLJJI;
    public String LJLJJL;
    public C73305Spp LJLJJLL;
    public C223338pd LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // X.O61
    public final void Lh() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
    }

    @Override // X.O61
    public final void Qh() {
        C81244Vua c81244Vua = this.LJLIL;
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c81244Vua != null && c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            String string = c81244Vua.getResources().getString(R.string.bha);
            o.LJIIIIZZ(string, "resources.getString(R.st…_preview_scan_fail_title)");
            c73306Spq.LJFF = string;
            String string2 = c81244Vua.getResources().getString(R.string.bh_);
            o.LJIIIIZZ(string2, "resources.getString(R.st…s_preview_scan_fail_desc)");
            c73306Spq.LJI = string2;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_error_robot;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
            c73306Spq.LJII = new AqS114S0300000_10(c81244Vua, c81244Vua, this, 4);
            c73305Spp.setStatus(c73306Spq);
        }
    }

    @Override // X.O61
    public final void jf() {
        boolean LJFF = C48189Ivh.LJFF(this.LJLIL);
        Integer valueOf = Integer.valueOf(R.attr.gp);
        if (!LJFF) {
            C81244Vua c81244Vua = this.LJLIL;
            C73305Spp c73305Spp = this.LJLJJLL;
            if (c81244Vua != null && c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                String string = c81244Vua.getResources().getString(R.string.bh7);
                o.LJIIIIZZ(string, "resources.getString(R.st…preview_no_network_title)");
                c73306Spq.LJFF = string;
                String string2 = c81244Vua.getResources().getString(R.string.bh6);
                o.LJIIIIZZ(string2, "resources.getString(R.st…_preview_no_network_desc)");
                c73306Spq.LJI = string2;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_wifi_slash;
                c2068389v.LJ = valueOf;
                c73306Spq.LIZ(c2068389v);
                c73306Spq.LJII = new AqS141S0200000_10(c81244Vua, this, 31);
                c73305Spp.setStatus(c73306Spq);
                return;
            }
            return;
        }
        C81244Vua c81244Vua2 = this.LJLIL;
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c81244Vua2 != null && c73305Spp2 != null) {
            C73306Spq c73306Spq2 = new C73306Spq();
            String string3 = c81244Vua2.getResources().getString(R.string.bha);
            o.LJIIIIZZ(string3, "resources.getString(R.st…_preview_scan_fail_title)");
            c73306Spq2.LJFF = string3;
            String string4 = c81244Vua2.getResources().getString(R.string.bh_);
            o.LJIIIIZZ(string4, "resources.getString(R.st…s_preview_scan_fail_desc)");
            c73306Spq2.LJI = string4;
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_large_error_robot;
            c2068389v2.LJ = valueOf;
            c73306Spq2.LIZ(c2068389v2);
            c73306Spq2.LJII = new AqS114S0300000_10(c81244Vua2, c81244Vua2, this, 3);
            c73305Spp2.setStatus(c73306Spq2);
        }
    }

    @Override // X.O61
    public final void n3() {
        C81244Vua c81244Vua = this.LJLIL;
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c81244Vua != null && c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            String string = c81244Vua.getResources().getString(R.string.bhd);
            o.LJIIIIZZ(string, "resources.getString(R.st…eview_scan_success_title)");
            c73306Spq.LJFF = string;
            String string2 = c81244Vua.getResources().getString(R.string.bhc);
            o.LJIIIIZZ(string2, "resources.getString(R.st…review_scan_success_desc)");
            c73306Spq.LJI = string2;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_video;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
            c73306Spq.LJII = new AqS141S0200000_10(c81244Vua, this, 8);
            c73305Spp.setStatus(c73306Spq);
        }
    }

    public final AdsPreviewStateManager vl() {
        AdsPreviewStateManager adsPreviewStateManager = this.LJLJJI;
        if (adsPreviewStateManager != null) {
            return adsPreviewStateManager;
        }
        o.LJIJI("adsPreviewStateManager");
        throw null;
    }

    @Override // X.O61
    public final void kj() {
        PreviewConfiguration previewConfiguration;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            previewConfiguration = C61175Nzf.LIZ;
            PreviewConfiguration previewConfiguration2 = (PreviewConfiguration) LIZLLL.LJIIIIZZ("ads_preview_configuration", PreviewConfiguration.class, previewConfiguration);
            if (previewConfiguration2 != null) {
                previewConfiguration = previewConfiguration2;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            previewConfiguration = C61175Nzf.LIZ;
        }
        C78999UzT.LJFF(AbstractC73672Svk.LJJLIIIJLJLI(previewConfiguration.getDelayTimeInMillisecond(), TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(this, 11), O67.LJLIL), vl().LJLILLLLZI);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        Window window;
        View decorView;
        super.onCreate(bundle);
        getLifecycle().addObserver(vl());
        AdsPreviewStateManager vl = vl();
        String str = this.LJLJJL;
        vl.LJLJI = this;
        C73849Syb<O60> c73849Syb = vl.LJLIL;
        c73849Syb.getClass();
        C78999UzT.LJFF(new C73426Srm(c73849Syb).LJIILIIL().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(vl, 32), new InterfaceC64592gB() { // from class: X.9E6
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), vl.LJLILLLLZI);
        if (str != null) {
            Uri parse = UriProtector.parse(str);
            String path = parse.getPath();
            String str2 = "";
            if (path == null) {
                path = "";
            }
            vl.LJLJJI = path;
            String queryParameter = UriProtector.getQueryParameter(parse, "token");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
            vl.LJLJJL = str2;
            if (vl.LJLJJI.length() == 0 || vl.LJLJJL.length() == 0) {
                vl.LIZJ(O64.LIZ);
            } else {
                vl.LIZJ(O65.LIZ);
            }
        } else {
            vl.LIZJ(O64.LIZ);
        }
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJII(R.attr.cl);
        LIZIZ.LIZJ();
        if (Build.VERSION.SDK_INT >= 23 && (mo49getActivity = mo49getActivity()) != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(FileUtils.BUFFER_SIZE);
        }
        FMX.onEventV3("ads_interface_qrcode_preview_scan");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.l9j);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.bh8);
        o.LJIIIIZZ(string, "getString(R.string.ads_preview_page_title)");
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C78840Uwu.LJJIL(c235119Kp, string, requireActivity);
        c252709vu.setNavActions(c235119Kp);
        this.LJLJL = (C223338pd) view.findViewById(R.id.g85);
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.keh);
        c73305Spp.LIZIZ(new O68(this));
        this.LJLJJLL = c73305Spp;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw3, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
