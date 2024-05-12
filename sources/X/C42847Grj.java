package X;

import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokGroupSceneFragment;
import com.ss.android.ugc.gamora.editor.sticker.donation.DonationUtils;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Grj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42847Grj extends G93 implements InterfaceC42865Gs1, InterfaceC42874GsA {
    public static final /* synthetic */ int LL = 0;
    public OrganizationListViewModel LJLJJL;
    public InterfaceC42864Gs0 LJLJL;
    public C6J6 LJLJLJ;
    public C73305Spp LJLJLLL;
    public LinearLayout LJLL;
    public TuxTextView LJLLI;
    public LinearLayout LJLLILLLL;
    public TuxTextView LJLLJ;
    public C164106cI LJLLL;
    public TuxTextView LJLLLL;
    public ViewOnClickListenerC42873Gs9 LJLLLLLL;
    public RecyclerView LJLZ;
    public TuxIconView LJZ;
    public int LJZI;
    public int LJZL;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 814));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 569));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 572));

    @Override // X.InterfaceC42874GsA
    public final void LJJIL() {
    }

    @Override // X.InterfaceC42874GsA
    public final void LLIZLLLIL(View view) {
    }

    public final void LLJILJIL() {
        WMH wmh;
        InterfaceC42864Gs0 interfaceC42864Gs0 = this.LJLJL;
        if (interfaceC42864Gs0 != null) {
            interfaceC42864Gs0.onDismiss();
        }
        WM7 wm7 = this.mParentScene;
        if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null) {
            wmh.remove(this, R.anim.fy);
            LLJJIJIIJIL();
        }
    }

    public final C42857Grt LLJILJILJ() {
        return (C42857Grt) this.LJLJJI.getValue();
    }

    public final C42848Grk LLJJIII() {
        return (C42848Grk) this.LJLJI.getValue();
    }

    public final void LLJJIJI() {
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            Activity activity = this.mActivity;
            if (activity != null) {
                if (C47918IrK.LIZ(activity)) {
                    OrganizationListViewModel organizationListViewModel = this.LJLJJL;
                    if (organizationListViewModel != null) {
                        organizationListViewModel.iv0();
                        organizationListViewModel.gv0(false);
                        return;
                    } else {
                        o.LJIJI("organizationListViewModel");
                        throw null;
                    }
                }
                C73305Spp c73305Spp = this.LJLJLLL;
                if (c73305Spp != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new AqS157S0100000_7(this, 571));
                    c73305Spp.setStatus(c73306Spq);
                    C73305Spp c73305Spp2 = this.LJLJLLL;
                    if (c73305Spp2 != null) {
                        c73305Spp2.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("dsvOrgList");
                        throw null;
                    }
                }
                o.LJIJI("dsvOrgList");
                throw null;
            }
            return;
        }
        o.LJIJI("llNoResult");
        throw null;
    }

    public final void LLJJIJIIJIL() {
        OrganizationListViewModel organizationListViewModel = this.LJLJJL;
        if (organizationListViewModel != null) {
            organizationListViewModel.LJLIL.setValue(new C42843Grf(null, false, null, null, null, null, false, true, false, false, 56));
            organizationListViewModel.iv0();
            C42857Grt LLJILJILJ = LLJILJILJ();
            List<T> list = LLJILJILJ.LJLJLJ;
            if (list != 0) {
                list.clear();
                LLJILJILJ.notifyDataSetChanged();
            }
            ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = this.LJLLLLLL;
            if (viewOnClickListenerC42873Gs9 != null) {
                viewOnClickListenerC42873Gs9.LJLIL = null;
                ((TextView) viewOnClickListenerC42873Gs9.LIZ(R.id.czx)).setText("");
                viewOnClickListenerC42873Gs9.LIZ(R.id.czx).clearFocus();
                viewOnClickListenerC42873Gs9.LIZIZ();
                LinearLayout linearLayout = this.LJLL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("llNoResult");
                    throw null;
                }
            }
            o.LJIJI("searchView");
            throw null;
        }
        o.LJIJI("organizationListViewModel");
        throw null;
    }

    @Override // X.InterfaceC42874GsA
    public final void LJZ() {
        String LLJJ = LLJJ();
        String LLJJI = LLJJI();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LLJJ);
        c145995oB.LJI("search_type", "ngo_list");
        c145995oB.LJI("user_id", C42855Grr.LIZ());
        c145995oB.LJI("enter_method", LLJJI);
        FMX.LJIIL("cancel_search_bar", c145995oB.LIZ);
        LLJJIJI();
    }

    @Override // X.InterfaceC42874GsA
    public final void LLILLL() {
        String LLJJ = LLJJ();
        String LLJJI = LLJJI();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LLJJ);
        c145995oB.LJI("search_type", "ngo_list");
        c145995oB.LJI("user_id", C42855Grr.LIZ());
        c145995oB.LJI("enter_method", LLJJI);
        FMX.LJIIL("clear_search_bar", c145995oB.LIZ);
    }

    public final String LLJJ() {
        if (LLJJIII() == null) {
            return "personal_homepage";
        }
        return "video_edit_page";
    }

    public final String LLJJI() {
        if (LLJJIII() == null) {
            return "click_profile_nonprofit";
        }
        return "click_sticker";
    }

    @Override // X.G93, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        if (window != null) {
            window.setStatusBarColor(this.LJZI);
            window.setNavigationBarColor(this.LJZL);
        }
    }

    @Override // X.InterfaceC42865Gs1
    public final void LJJIIJZLJL(C6J6 selectedOrg) {
        o.LJIIIZ(selectedOrg, "selectedOrg");
        if (selectedOrg instanceof OrganizationSearchResultModel) {
            String LLJJ = LLJJ();
            String LLJJI = LLJJI();
            String donateLink = selectedOrg.getDonateLink();
            if (donateLink != null) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", LLJJ);
                c145995oB.LJI("search_type", "ngo_list");
                c145995oB.LJI("user_id", C42855Grr.LIZ());
                c145995oB.LJI("enter_method", LLJJI);
                c145995oB.LJI("link", donateLink);
                c145995oB.LJI("link_type", "nonprofit");
                FMX.LJIIL("click_search_bar_result", c145995oB.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC42864Gs0 interfaceC42864Gs0 = this.LJLJL;
        if (interfaceC42864Gs0 != null) {
            interfaceC42864Gs0.LIZ(selectedOrg);
        }
        ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = this.LJLLLLLL;
        if (viewOnClickListenerC42873Gs9 != null) {
            viewOnClickListenerC42873Gs9.LIZIZ();
            LLJILJIL();
        } else {
            o.LJIJI("searchView");
            throw null;
        }
    }

    @Override // X.InterfaceC42865Gs1
    public final void LJJLL(C6J6 selectedOrg) {
        o.LJIIIZ(selectedOrg, "selectedOrg");
        this.LJLJLJ = selectedOrg;
        Bundle bundle = new Bundle();
        bundle.putString("url", selectedOrg.getDetailUrl());
        bundle.putString("title", getString(R.string.eww));
        bundle.putString("enter_from", "org_detail_page");
        SmartRoute buildRoute = SmartRouter.buildRoute(requireActivity(), "aweme://donation/web/page");
        buildRoute.withParam(bundle);
        Intent buildIntent = buildRoute.buildIntent();
        TikTokGroupSceneFragment tikTokGroupSceneFragment = this.LJLILLLLZI;
        if (tikTokGroupSceneFragment == null) {
            tikTokGroupSceneFragment = new TikTokGroupSceneFragment();
            tikTokGroupSceneFragment.LJLIL = new WeakReference<>(this);
            FragmentManager supportFragmentManager = SceneExtensionsKt.LIZLLL(this).getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIIIZZ(0, 1, tikTokGroupSceneFragment, this.LJLIL);
            c1b3.LJII();
            this.LJLILLLLZI = tikTokGroupSceneFragment;
        }
        C16880lQ.LJII(tikTokGroupSceneFragment, buildIntent, 12580);
    }

    @Override // X.InterfaceC42874GsA
    public final void LJLJLLL(String str) {
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            if (str == null || str.length() == 0) {
                ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = this.LJLLLLLL;
                if (viewOnClickListenerC42873Gs9 != null) {
                    if (viewOnClickListenerC42873Gs9.LIZ(R.id.czx).hasFocus()) {
                        LLJJIJI();
                        return;
                    }
                    return;
                }
                o.LJIJI("searchView");
                throw null;
            }
            Activity activity = this.mActivity;
            if (activity == null) {
                return;
            }
            if (C47918IrK.LIZ(activity)) {
                OrganizationListViewModel organizationListViewModel = this.LJLJJL;
                if (organizationListViewModel != null) {
                    if (str.equals(organizationListViewModel.LJLJJLL)) {
                        if (organizationListViewModel.LJLJJI != 1) {
                            return;
                        }
                        organizationListViewModel.hv0(true);
                        return;
                    } else {
                        organizationListViewModel.iv0();
                        organizationListViewModel.LJLJJLL = str;
                        organizationListViewModel.hv0(false);
                        return;
                    }
                }
                o.LJIJI("organizationListViewModel");
                throw null;
            }
            C73305Spp c73305Spp = this.LJLJLLL;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS157S0100000_7(this, 570));
                c73305Spp.setStatus(c73306Spq);
                C73305Spp c73305Spp2 = this.LJLJLLL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("dsvOrgList");
                    throw null;
                }
            }
            o.LJIJI("dsvOrgList");
            throw null;
        }
        o.LJIJI("llNoResult");
        throw null;
    }

    @Override // X.G93, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        String string;
        ViewGroup.LayoutParams layoutParams;
        super.onActivityCreated(bundle);
        ActivityC45651qj LIZLLL = SceneExtensionsKt.LIZLLL(this);
        this.LJZL = LIZLLL.getWindow().getNavigationBarColor();
        this.LJZI = LIZLLL.getWindow().getStatusBarColor();
        C61713OJx LIZJ = C61712OJw.LIZJ(SceneExtensionsKt.LIZLLL(this));
        LIZJ.LJ(R.attr.cl);
        LIZJ.LJII(R.attr.d4);
        LIZJ.LIZJ();
        this.LJLJJL = (OrganizationListViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(OrganizationListViewModel.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && !bundle2.getBoolean("from_fragment")) {
            View findViewById = findViewById(R.id.btt);
            if (findViewById != null) {
                layoutParams = findViewById.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C63081OpJ.LJJJJLI(LIZLLL);
        }
        View requireViewById = requireViewById(R.id.chq);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.dsv_org_list)");
        this.LJLJLLL = (C73305Spp) requireViewById;
        View requireViewById2 = requireViewById(R.id.g4s);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.ll_no_result)");
        this.LJLL = (LinearLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.men);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tv_powered_by)");
        this.LJLLI = (TuxTextView) requireViewById3;
        View requireViewById4 = requireViewById(R.id.g4f);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.ll_match_donate_info)");
        this.LJLLILLLL = (LinearLayout) requireViewById4;
        View requireViewById5 = requireViewById(R.id.mb5);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.tv_match_donate_text)");
        this.LJLLJ = (TuxTextView) requireViewById5;
        View requireViewById6 = requireViewById(R.id.fbc);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.iv_tiktok_logo)");
        this.LJLLL = (C164106cI) requireViewById6;
        View requireViewById7 = requireViewById(R.id.mo6);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.tv_title)");
        this.LJLLLL = (TuxTextView) requireViewById7;
        View requireViewById8 = requireViewById(R.id.jih);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.search_view)");
        this.LJLLLLLL = (ViewOnClickListenerC42873Gs9) requireViewById8;
        View requireViewById9 = requireViewById(R.id.isn);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.recycler_view)");
        this.LJLZ = (RecyclerView) requireViewById9;
        View requireViewById10 = requireViewById(R.id.f0h);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.iv_close)");
        this.LJZ = (TuxIconView) requireViewById10;
        OrganizationListViewModel organizationListViewModel = this.LJLJJL;
        if (organizationListViewModel != null) {
            organizationListViewModel.LJLILLLLZI.observe(this, new AObserverS75S0100000_7(this, 96));
            TuxTextView tuxTextView = this.LJLLLL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(33);
                RecyclerView recyclerView = this.LJLZ;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    C42857Grt LLJILJILJ = LLJILJILJ();
                    if (true != LLJILJILJ.LJLIL) {
                        LLJILJILJ.LJLIL = true;
                        LLJILJILJ.onShowFooterChanged(true);
                    }
                    RecyclerView recyclerView2 = this.LJLZ;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(LLJILJILJ());
                        ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = this.LJLLLLLL;
                        if (viewOnClickListenerC42873Gs9 != null) {
                            viewOnClickListenerC42873Gs9.setVisibility(0);
                            ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs92 = this.LJLLLLLL;
                            if (viewOnClickListenerC42873Gs92 != null) {
                                viewOnClickListenerC42873Gs92.setSearchBarEventHandler(this);
                                IDonationVendorService LIZ = DonationUtils.LIZ();
                                if (LIZ != null && LIZ.enableDonationPercentService()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    string = getString(R.string.ewx);
                                } else {
                                    string = getString(R.string.ex8);
                                }
                                o.LJIIIIZZ(string, "if (IDonationVendorServi…ribution2_link)\n        }");
                                if (TextUtils.equals(string, getString(R.string.ewx))) {
                                    TuxTextView tuxTextView2 = this.LJLLI;
                                    if (tuxTextView2 != null) {
                                        tuxTextView2.setVisibility(4);
                                    } else {
                                        o.LJIJI("tvPowerBy");
                                        throw null;
                                    }
                                } else {
                                    String string2 = getString(R.string.ex7, string);
                                    o.LJIIIIZZ(string2, "getString(R.string.donat…ify_attribution1, vendor)");
                                    SpannableString spannableString = new SpannableString(string2);
                                    if (s.LJJLIIIJL(string2, string, 0, false, 6) != -1) {
                                        spannableString.setSpan(this.LJLJJLL.getValue(), s.LJJLIIIJL(string2, string, 0, false, 6), string2.length(), 18);
                                    }
                                    TuxTextView tuxTextView3 = this.LJLLI;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                                        TuxTextView tuxTextView4 = this.LJLLI;
                                        if (tuxTextView4 != null) {
                                            tuxTextView4.setText(spannableString);
                                            TuxTextView tuxTextView5 = this.LJLLI;
                                            if (tuxTextView5 != null) {
                                                tuxTextView5.setHighlightColor(0);
                                                TuxTextView tuxTextView6 = this.LJLLI;
                                                if (tuxTextView6 != null) {
                                                    tuxTextView6.setVisibility(8);
                                                } else {
                                                    o.LJIJI("tvPowerBy");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("tvPowerBy");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("tvPowerBy");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("tvPowerBy");
                                        throw null;
                                    }
                                }
                                TuxIconView tuxIconView = this.LJZ;
                                if (tuxIconView != null) {
                                    C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(this, 126));
                                    LLJILJILJ().LJLJL = new C42846Gri(this);
                                    LLJJIJI();
                                    C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new C42856Grs(this));
                                    return;
                                }
                                o.LJIJI("ivClose");
                                throw null;
                            }
                            o.LJIJI("searchView");
                            throw null;
                        }
                        o.LJIJI("searchView");
                        throw null;
                    }
                    o.LJIJI("recyclerView");
                    throw null;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("tvTitle");
            throw null;
        }
        o.LJIJI("organizationListViewModel");
        throw null;
    }

    @Override // X.InterfaceC42874GsA
    public final void LJIIIZ(String str, boolean z) {
        if (z && str.length() == 0) {
            String LLJJ = LLJJ();
            String LLJJI = LLJJI();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", LLJJ);
            c145995oB.LJI("search_type", "ngo_list");
            c145995oB.LJI("user_id", C42855Grr.LIZ());
            c145995oB.LJI("enter_method", LLJJI);
            FMX.LJIIL("enter_search_bar", c145995oB.LIZ);
            C42857Grt LLJILJILJ = LLJILJILJ();
            List<T> list = LLJILJILJ.LJLJLJ;
            if (list != 0) {
                list.clear();
                LLJILJILJ.notifyDataSetChanged();
            }
        }
    }

    @Override // X.G93
    public final void onActivityResult(int i, int i2, Intent intent) {
        C6J6 c6j6;
        String str;
        String str2;
        String str3;
        if (i2 == -1 && i == 12580 && (c6j6 = this.LJLJLJ) != null) {
            LLJILJIL();
            InterfaceC42864Gs0 interfaceC42864Gs0 = this.LJLJL;
            if (interfaceC42864Gs0 != null) {
                interfaceC42864Gs0.LIZ(c6j6);
            }
            C42848Grk LLJJIII = LLJJIII();
            String str4 = null;
            if (LLJJIII != null) {
                str = LLJJIII.getShootWay();
            } else {
                str = null;
            }
            C42848Grk LLJJIII2 = LLJJIII();
            if (LLJJIII2 != null) {
                str2 = LLJJIII2.getCreationId();
            } else {
                str2 = null;
            }
            String name = c6j6.getName();
            C42848Grk LLJJIII3 = LLJJIII();
            if (LLJJIII3 != null) {
                str3 = LLJJIII3.getContentSource();
            } else {
                str3 = null;
            }
            C42848Grk LLJJIII4 = LLJJIII();
            if (LLJJIII4 != null) {
                str4 = LLJJIII4.getContentType();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                new C42852Gro(str, str2, name, str3, str4).invoke(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            GXR.LIZIZ("add_donation_sticker", jSONObject);
        }
    }

    @Override // X.G93, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.aro, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
