package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.AAR;
import X.AGJ;
import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188517aZ;
import X.C29S;
import X.C3C5;
import X.C58655N0h;
import X.C58704N2e;
import X.C76800UCe;
import X.C90903hW;
import X.O0X;
import Y.IDCSpanS1S1100000_4;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import ujb.o;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class StaticAdExplainDialog extends Fragment implements View.OnClickListener {
    public static TuxSheet LJLJJL;
    public AwemeRawAd LJLIL;
    public String LJLILLLLZI;
    public ActivityC45651qj LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        Long l;
        String str;
        String str2;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.hmu) {
            ASQ.LJ(this, ASX.LIZ);
            AwemeRawAd awemeRawAd = this.LJLIL;
            if (awemeRawAd != null) {
                l = awemeRawAd.getCreativeId();
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            AwemeRawAd awemeRawAd2 = this.LJLIL;
            if (awemeRawAd2 != null) {
                str = awemeRawAd2.getLogExtra();
            } else {
                str = null;
            }
            C58655N0h LJ = C58704N2e.LJ("pa_info_page", "otherclick", valueOf2, str, null);
            LJ.LIZJ("button", "refer");
            LJ.LJI();
            if (o.LJJJJIZL(this.LJLILLLLZI, "long_press", false)) {
                str2 = "ads_long_press";
            } else {
                str2 = "ads_share_panel";
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//privacy/setting/ad_personalization");
            buildRoute.withParam("enter_from", str2);
            buildRoute.open();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        ICompliancePolicyService LJII;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (a.LJIIJ().LJIIJJI() || GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.hmu).setVisibility(0);
        }
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.hmu), this);
        ActivityC45651qj activityC45651qj = this.LJLJI;
        if (activityC45651qj != null) {
            String string = C16880lQ.LLLLLILLIL(activityC45651qj).getString(R.string.gdc);
            kotlin.jvm.internal.o.LJIIIIZZ(string, "activty.applicationConte…_tiktok_ads_description6)");
            ActivityC45651qj activityC45651qj2 = this.LJLJI;
            if (activityC45651qj2 != null) {
                String string2 = C16880lQ.LLLLLILLIL(activityC45651qj2).getString(R.string.gdf);
                kotlin.jvm.internal.o.LJIIIIZZ(string2, "activty.applicationConte…ds_description_hyperlink)");
                TextView textView = (TextView) _$_findCachedViewById(R.id.rb);
                if (C188517aZ.LIZ()) {
                    int LJJLIIIJL = s.LJJLIIIJL(string, string2, 0, false, 6);
                    if (LJJLIIIJL == -1) {
                        new SpannableStringBuilder(string);
                    }
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    spannableStringBuilder.setSpan(new AAR(), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
                } else {
                    int LJJLIIIJL2 = s.LJJLIIIJL(string, string2, 0, false, 6);
                    if (LJJLIIIJL2 == -1) {
                        new SpannableStringBuilder(string);
                    }
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    spannableStringBuilder.setSpan(new IDCSpanS1S1100000_4(this, 0), LJJLIIIJL2, string2.length() + LJJLIIIJL2, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL2, string2.length() + LJJLIIIJL2, 33);
                }
                textView.setText(spannableStringBuilder);
                ((TextView) _$_findCachedViewById(R.id.rb)).setMovementMethod(LinkMovementMethod.getInstance());
                if (!C188517aZ.LIZ() || (LJII = a.LJII()) == null) {
                    return;
                }
                LJII.LIZ(new O0X(AGJ.AD_EXPLANATION.getValue(), "privacy-policy", false, false, 28));
                return;
            }
            kotlin.jvm.internal.o.LJIJI("activty");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.am2, viewGroup, false);
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
