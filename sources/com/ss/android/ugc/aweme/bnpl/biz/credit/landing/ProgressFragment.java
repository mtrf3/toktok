package com.ss.android.ugc.aweme.bnpl.biz.credit.landing;

import X.APL;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C26227ARb;
import X.C29S;
import X.C2U8;
import X.C39647FhD;
import X.C3C5;
import X.C58310MuY;
import X.C5H3;
import X.C60827Nu3;
import X.C65777Prh;
import X.C76800UCe;
import X.C90903hW;
import X.C91657Zy9;
import X.C91726ZzG;
import X.C91795a0N;
import X.C91824a0q;
import X.C91924a2S;
import X.C91930a2Y;
import X.C92006a3m;
import X.C92033a4D;
import X.C92173a6T;
import X.C92214a78;
import X.C92215a79;
import X.C92216a7A;
import X.C92217a7B;
import X.C92584aD6;
import X.C92585aD7;
import X.C92586aD8;
import X.C92587aD9;
import X.C92588aDA;
import X.C92589aDB;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.SY4;
import X.UC0;
import X.W5F;
import X.W5U;
import Y.IDCListenerS138S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.Institution;
import com.ss.android.ugc.aweme.bnpl.network.model.InstitutionIcon;
import com.ss.android.ugc.aweme.bnpl.network.model.StepItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class ProgressFragment extends BaseFragment implements JBS {
    public static String LJLLI = "";
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public long LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public ProgressFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C92584aD6.LJLIL, "kyc_status", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C92587aD9.LJLIL, "pa_status", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C92585aD7.LJLIL, "no_animation", Boolean.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, C92588aDA.LJLIL, "previous_page_id", String.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, C92589aDB.LJLIL, "report_landing_cost_time", Boolean.class);
        this.LJLJJLL = "success";
        this.LJLJL = "";
        this.LJLJLJ = "";
    }

    public final void Dl() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C26227ARb c26227ARb = new C26227ARb(requireContext);
        c26227ARb.LJ(R.string.jpx);
        UC0.LIZJ(c26227ARb, new IDqS418S0100000_31(this, 25));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    public final BNPLEntryData vl() {
        BNPLEntryData bNPLEntryData = C92006a3m.LIZ;
        if (bNPLEntryData == null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C26045AKb c26045AKb = new C26045AKb(requireActivity);
            c26045AKb.LJIIIIZZ(R.string.jpo);
            c26045AKb.LJIIJ();
            requireActivity().finish();
            return null;
        }
        return bNPLEntryData;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        StepItem nextStepItem;
        super.onResume();
        BNPLEntryData vl = vl();
        if (vl != null && (nextStepItem = vl.getNextStepItem()) != null) {
            String stepCode = nextStepItem.getStepCode();
            if (o.LJ(stepCode, "KYC_INFO_COLLECT")) {
                String schema = C91657Zy9.LIZ(wl(nextStepItem), true, false);
                o.LJIIIZ(schema, "schema");
                C60827Nu3.LJIIJ(C58310MuY.LIZIZ, schema, "pipo_spark_biz", null, null, false, 60);
            } else {
                if (!o.LJ(stepCode, "PERSONAL_INFO_COLLECT")) {
                    return;
                }
                String schema2 = C91657Zy9.LIZ(wl(nextStepItem), true, false);
                o.LJIIIZ(schema2, "schema");
                C60827Nu3.LJIIJ(C58310MuY.LIZIZ, schema2, "pipo_spark_biz", null, null, false, 60);
            }
        }
    }

    public final void xl() {
        StepItem nextStepItem;
        BNPLEntryData vl = vl();
        if (vl != null && (nextStepItem = vl.getNextStepItem()) != null) {
            String wl = wl(nextStepItem);
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C91657Zy9.LIZJ(requireActivity, wl, true, true, false);
        }
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        Dl();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C92586aD8.LJLIL);
        Boolean bool = (Boolean) this.LJLJI.getValue();
        if (bool != null) {
            activityConfiguration(new IDqS2S0010000_31(bool.booleanValue(), 3));
        }
        EventBus.LIZJ().LJIILJJIL(this);
        super.onCreate(bundle);
        C91924a2S.LIZ.LIZIZ("bnpl_activate_step_progress", (String) this.LJLJJI.getValue());
    }

    @QD3
    public final void onEvent(C92215a79 event) {
        int i;
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(event, "event");
        String str = LJLLI;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            i = mo49getActivity2.hashCode();
        } else {
            i = 0;
        }
        if (!TextUtils.equals(str, String.valueOf(i)) && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }

    public final void onEventClick(String str) {
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_step_progress_click", "bnpl_activate_step_progress", (String) this.LJLJJI.getValue(), C113554cx.LJJL(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJLJLLL)), new OSZ("status_create_account", this.LJLJJLL), new OSZ("status_upload_id", this.LJLJL), new OSZ("status_provide_info", this.LJLJLJ)), 8);
    }

    public final String wl(StepItem stepItem) {
        String str;
        List<StepItem> failedStepItems;
        Uri.Builder appendQueryParameter = UriProtector.parse(stepItem.getUrl()).buildUpon().appendQueryParameter("source", C91824a0q.LJFF).appendQueryParameter("previous_page_id", "bnpl_activate_step_progress");
        BNPLEntryData vl = vl();
        if (vl != null) {
            str = vl.getOrderId();
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("order_id", str).appendQueryParameter("use_forest", "1").appendQueryParameter("access_key", C91726ZzG.LIZ()).appendQueryParameter("priority_region", C91824a0q.LIZIZ);
        BNPLEntryData vl2 = vl();
        if (vl2 != null && (failedStepItems = vl2.getFailedStepItems()) != null && failedStepItems.size() == 1) {
            appendQueryParameter2.appendQueryParameter("submit_ca_after_kyc", "1");
        }
        String uri = appendQueryParameter2.build().toString();
        o.LJIIIIZZ(uri, "uriBuilder.build().toString()");
        return uri;
    }

    @QD3
    public final void onEvent(C92214a78 event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public final void Al(String str, String str2) {
        BNPLEntryData bNPLEntryData;
        if (o.LJ(str, "PASS")) {
            BNPLEntryData bNPLEntryData2 = C92006a3m.LIZ;
            if (bNPLEntryData2 != null && bNPLEntryData2.getVerifyInfo() != null && (bNPLEntryData = C92006a3m.LIZ) != null) {
                bNPLEntryData.setVerifyInfo("");
            }
            if (TextUtils.isEmpty(str2)) {
                xl();
                return;
            }
            BNPLEntryData bNPLEntryData3 = C92006a3m.LIZ;
            if (bNPLEntryData3 != null) {
                bNPLEntryData3.setVerifyInfo(str2);
            }
            if (str2 == null) {
                return;
            }
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C92033a4D.LIZJ(requireActivity, APL.FULL_PAGE, str2, "bnpl_activate_step_progress", new IDqS441S0100000_31(this, 1));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        String str;
        Institution institutionInfo;
        InstitutionIcon icon;
        String light;
        Institution institutionInfo2;
        Institution institutionInfo3;
        InstitutionIcon icon2;
        StepItem stepItem;
        StepItem stepItem2;
        String str2;
        StepItem stepItem3;
        StepItem stepItem4;
        BNPLEntryData bNPLEntryData;
        List<StepItem> list;
        ArrayList arrayList;
        ArrayList<StepItem> stepCodeConfigs;
        BNPLEntryData bNPLEntryData2;
        List<StepItem> failedStepItems;
        List<StepItem> failedStepItems2;
        BNPLEntryData bNPLEntryData3;
        List<StepItem> failedStepItems3;
        StepItem stepItem5;
        BNPLEntryData bNPLEntryData4;
        List<StepItem> failedStepItems4;
        List<StepItem> list2;
        List<StepItem> completedStepItems;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.equals((String) this.LJLILLLLZI.getValue(), "1")) {
            C2U8.LIZ(new C92216a7A());
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            i = mo49getActivity.hashCode();
        } else {
            i = 0;
        }
        LJLLI = String.valueOf(i);
        String str3 = null;
        if (TextUtils.equals((String) this.LJLIL.getValue(), "1")) {
            BNPLEntryData bNPLEntryData5 = C92006a3m.LIZ;
            if (bNPLEntryData5 != null) {
                StepItem nextStepItem = bNPLEntryData5.getNextStepItem();
                BNPLEntryData bNPLEntryData6 = C92006a3m.LIZ;
                if ((bNPLEntryData6 == null || bNPLEntryData6.getCompletedStepItems() == null) && (bNPLEntryData = C92006a3m.LIZ) != null) {
                    bNPLEntryData.setCompletedStepItems(new ArrayList());
                }
                BNPLEntryData bNPLEntryData7 = C92006a3m.LIZ;
                if ((bNPLEntryData7 == null || (completedStepItems = bNPLEntryData7.getCompletedStepItems()) == null || !ORZ.LJLJJI(nextStepItem, completedStepItems)) && nextStepItem != null) {
                    BNPLEntryData bNPLEntryData8 = C92006a3m.LIZ;
                    if (bNPLEntryData8 != null) {
                        list = bNPLEntryData8.getCompletedStepItems();
                    } else {
                        list = null;
                    }
                    if ((list instanceof ArrayList) && (arrayList = (ArrayList) list) != null) {
                        arrayList.add(nextStepItem);
                    }
                }
                BNPLEntryData bNPLEntryData9 = C92006a3m.LIZ;
                if (bNPLEntryData9 == null || (failedStepItems = bNPLEntryData9.getFailedStepItems()) == null || failedStepItems.isEmpty()) {
                    BNPLEntryData bNPLEntryData10 = C92006a3m.LIZ;
                    if (bNPLEntryData10 != null && (stepCodeConfigs = bNPLEntryData10.getStepCodeConfigs()) != null) {
                        Iterator<StepItem> it = stepCodeConfigs.iterator();
                        while (it.hasNext()) {
                            StepItem next = it.next();
                            if (TextUtils.equals(next.getStepCode(), "PERSONAL_INFO_COLLECT") && (bNPLEntryData2 = C92006a3m.LIZ) != null) {
                                bNPLEntryData2.setNextStepItem(next);
                            }
                        }
                    }
                } else {
                    BNPLEntryData bNPLEntryData11 = C92006a3m.LIZ;
                    if (bNPLEntryData11 != null && (failedStepItems4 = bNPLEntryData11.getFailedStepItems()) != null && ORZ.LJLJJI(nextStepItem, failedStepItems4)) {
                        BNPLEntryData bNPLEntryData12 = C92006a3m.LIZ;
                        if (bNPLEntryData12 != null) {
                            list2 = bNPLEntryData12.getFailedStepItems();
                        } else {
                            list2 = null;
                        }
                        if ((list2 instanceof ArrayList) && list2 != null) {
                            C65777Prh.LIZ(list2).remove(nextStepItem);
                        }
                    }
                    BNPLEntryData bNPLEntryData13 = C92006a3m.LIZ;
                    if (bNPLEntryData13 != null && (failedStepItems2 = bNPLEntryData13.getFailedStepItems()) != null && (!failedStepItems2.isEmpty()) && (bNPLEntryData3 = C92006a3m.LIZ) != null && (failedStepItems3 = bNPLEntryData3.getFailedStepItems()) != null && (stepItem5 = (StepItem) ListProtector.get(failedStepItems3, 0)) != null && (bNPLEntryData4 = C92006a3m.LIZ) != null) {
                        bNPLEntryData4.setNextStepItem(stepItem5);
                    }
                }
            }
            C2U8.LIZ(new C92215a79());
        }
        BNPLEntryData vl = vl();
        if (vl != null) {
            List<StepItem> completedStepItems2 = vl.getCompletedStepItems();
            List<StepItem> failedStepItems5 = vl.getFailedStepItems();
            Iterator<StepItem> it2 = completedStepItems2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    stepItem = it2.next();
                    if (o.LJ(stepItem.getStepCode(), "KYC_INFO_COLLECT")) {
                        break;
                    }
                } else {
                    stepItem = null;
                    break;
                }
            }
            Iterator<StepItem> it3 = failedStepItems5.iterator();
            while (true) {
                if (it3.hasNext()) {
                    stepItem2 = it3.next();
                    if (o.LJ(stepItem2.getStepCode(), "KYC_INFO_COLLECT")) {
                        break;
                    }
                } else {
                    stepItem2 = null;
                    break;
                }
            }
            String str4 = "fail";
            if (stepItem != null) {
                str2 = "success";
            } else if (stepItem2 != null) {
                str2 = "fail";
            } else {
                str2 = "unstart";
            }
            this.LJLJL = str2;
            Iterator<StepItem> it4 = completedStepItems2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    stepItem3 = it4.next();
                    if (o.LJ(stepItem3.getStepCode(), "PERSONAL_INFO_COLLECT")) {
                        break;
                    }
                } else {
                    stepItem3 = null;
                    break;
                }
            }
            Iterator<StepItem> it5 = failedStepItems5.iterator();
            while (true) {
                if (it5.hasNext()) {
                    stepItem4 = it5.next();
                    if (o.LJ(stepItem4.getStepCode(), "PERSONAL_INFO_COLLECT")) {
                        break;
                    }
                } else {
                    stepItem4 = null;
                    break;
                }
            }
            if (stepItem3 != null) {
                str4 = "success";
            } else if (stepItem4 == null) {
                str4 = "unstart";
            }
            this.LJLJLJ = str4;
        }
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 104));
        C234529Ii c234529Ii2 = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_headset;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c234529Ii2.LIZ(c2068389v);
        c234529Ii2.LIZIZ = "ProgressStepHelpTag";
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.h5);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZIZ(c234529Ii2);
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        C252709vu bnpl_progress_nav_bar = (C252709vu) _$_findCachedViewById(R.id.h5);
        o.LJIIIIZZ(bnpl_progress_nav_bar, "bnpl_progress_nav_bar");
        C91930a2Y.LIZ(bnpl_progress_nav_bar, getContext(), true);
        ((TuxTextView) _$_findCachedViewById(R.id.hl)).LJJJ(38.0f);
        if (o.LJ(this.LJLJL, "success")) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (o.LJ(this.LJLJLJ, "success")) {
            i2--;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.hl);
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.jqq, String.valueOf(i2));
        } else {
            str = null;
        }
        textView.setText(str);
        BNPLEntryData vl2 = vl();
        if (vl2 != null) {
            ((C92173a6T) _$_findCachedViewById(R.id.hh)).setStepData(vl2);
        }
        C91795a0N c91795a0N = (C91795a0N) _$_findCachedViewById(R.id.gs);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gq, requireActivity);
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        c91795a0N.LIZIZ(LJIIIIZZ, AnonymousClass636.LJIIIIZZ(R.attr.gr, requireActivity2));
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        if (AnonymousClass636.LJIILJJIL(requireActivity3)) {
            BNPLEntryData vl3 = vl();
            if (vl3 != null && (institutionInfo3 = vl3.getInstitutionInfo()) != null && (icon2 = institutionInfo3.getIcon()) != null) {
                light = icon2.getDark();
            }
            light = null;
        } else {
            BNPLEntryData vl4 = vl();
            if (vl4 != null && (institutionInfo = vl4.getInstitutionInfo()) != null && (icon = institutionInfo.getIcon()) != null) {
                light = icon.getLight();
            }
            light = null;
        }
        BNPLEntryData vl5 = vl();
        if (vl5 != null && (institutionInfo2 = vl5.getInstitutionInfo()) != null) {
            str3 = institutionInfo2.getDescription();
        }
        W5F LJ = W5U.LJ(R.drawable.i7);
        LJ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.gv);
        C16880lQ.LLJJJ(LJ);
        if (light != null) {
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(light);
            LJIIIIZZ2.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.gv);
            C16880lQ.LLJJJ(LJIIIIZZ2);
        }
        if (str3 != null) {
            ((TextView) _$_findCachedViewById(R.id.gw)).setText(str3);
        }
        _$_findCachedViewById(R.id.gx).getClass();
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.gx), new IDCListenerS138S0100000_31(this, 9));
        View LJI = ((C252709vu) _$_findCachedViewById(R.id.h5)).LJI("ProgressStepHelpTag");
        if (LJI != null) {
            C16880lQ.LJIIJ(new IDCListenerS138S0100000_31(this, 10), LJI);
        }
        this.LJLJLLL = System.currentTimeMillis();
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("interface_return_cost", CardStruct.IStatusCode.DEFAULT), new OSZ("status_create_account", this.LJLJJLL), new OSZ("status_upload_id", this.LJLJL), new OSZ("status_provide_info", this.LJLJLJ));
        if (o.LJ(this.LJLJJL.getValue(), Boolean.TRUE)) {
            LJJLIIIIJ.put("landing_page_cost", String.valueOf(System.currentTimeMillis() - C91824a0q.LJIIIIZZ));
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_step_progress_show", "bnpl_activate_step_progress", (String) this.LJLJJI.getValue(), LJJLIIIIJ, 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ac, viewGroup, false);
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
