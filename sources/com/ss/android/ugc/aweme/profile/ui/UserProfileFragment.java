package com.ss.android.ugc.aweme.profile.ui;

import X.AW2;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C27739Aud;
import X.C29S;
import X.C3C5;
import X.C41169GDt;
import X.C55408Loq;
import X.C5H3;
import X.C61410O8g;
import X.C65330PkU;
import X.C65352Pkq;
import X.C73305Spp;
import X.C76800UCe;
import X.C78939UyV;
import X.C78996UzQ;
import X.C80844Vo8;
import X.C85594XiY;
import X.C85913Xnh;
import X.C90903hW;
import X.G4M;
import X.G4N;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import X.InterfaceC40934G4s;
import X.InterfaceC59608NaO;
import X.InterfaceC61213O0r;
import X.InterfaceC85917Xnl;
import X.InterfaceC85969Xob;
import X.JBR;
import X.JBS;
import X.KL2;
import X.LK2;
import X.X6E;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.arg.UserProfileArg;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC61213O0r
/* loaded from: classes16.dex */
public final class UserProfileFragment extends BaseFragment implements InterfaceC85917Xnl, JBS, G4M, LK2, InterfaceC18010nF, InterfaceC40934G4s {
    public static final /* synthetic */ int LJLJLLL = 0;
    public Aweme LJLILLLLZI;
    public C85913Xnh LJLJI;
    public LinearLayout LJLJJI;
    public C80844Vo8 LJLJJL;
    public C73305Spp LJLJJLL;
    public G4N LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this, X6E.LJLIL);

    @Override // X.G4M
    public final boolean Ag() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b5836";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "others_homepage";
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.G4M
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC85917Xnl
    public final void F30() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(4);
            try {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.onBackPressed();
                    return;
                }
                return;
            } catch (Exception unused) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 == null) {
                    return;
                }
                mo49getActivity2.finish();
                C78939UyV.LJJJJ(mo49getActivity2);
                C78996UzQ.LJJJ(mo49getActivity2);
                return;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final Bundle wl() {
        String str;
        int[] iArr;
        boolean z;
        int[] intArray;
        boolean z2;
        JSONObject jSONObject;
        Bundle bundle = new Bundle();
        bundle.putString("uid", xl().getUserId());
        bundle.putString("sec_user_id", xl().getSecUid());
        bundle.putString("profile_from", xl().getLabel());
        bundle.putString("video_id", xl().getAid());
        bundle.putString("profile_from", "other_user");
        bundle.putString("type", xl().getType());
        bundle.putString("enter_method", xl().getEnterMethod());
        bundle.putString("enter_from", xl().getEnterFrom());
        bundle.putString("position", xl().getPosition());
        bundle.putString("profile_from_scene", xl().getProfileFromScene());
        bundle.putSerializable("inbox_log_extra", xl().getLogExtra());
        bundle.putString("notice_type", xl().getNoticeType());
        if (!TextUtils.isEmpty(xl().getPreviousPage())) {
            bundle.putString("extra_previous_page", xl().getPreviousPage());
        }
        bundle.putString("request_id", xl().getLiveRequestId());
        bundle.putString("room_id", xl().getLiveRoomId());
        bundle.putString("from_request_id", xl().getFromRequestId());
        bundle.putString("return_live", xl().getReturnLive());
        bundle.putString("room_owner_id", xl().getLiveRoomOwnerId());
        bundle.putString("user_type", xl().getLiveType());
        String trackParams = xl().getTrackParams();
        boolean z3 = true;
        String str2 = null;
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                JSONObject jSONObject2 = new JSONObject(trackParams);
                String optString = jSONObject2.optString("show_window_source");
                bundle.putString("source_content_id", jSONObject2.optString("source_content_id"));
                bundle.putString("show_window_source", optString);
                JSONArray optJSONArray = jSONObject2.optJSONArray("traffic_source_list");
                if (optJSONArray != null) {
                    str = optJSONArray.toString();
                } else {
                    str = null;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(int[].class)));
                    if (!(fromJson instanceof int[])) {
                        fromJson = null;
                    }
                    iArr = (int[]) fromJson;
                } catch (s unused) {
                    iArr = null;
                }
                if (iArr == null) {
                    iArr = new int[]{3};
                }
                bundle.putIntArray("traffic_source_list", iArr);
                bundle.putString("trackParams", trackParams);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        bundle.putBoolean("is_live_record", xl().isFromLiveRecord());
        bundle.putString("search_request_id", xl().getSearchRequestId());
        bundle.putBoolean("isFromFeed", false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str2 = arguments.getString("extra_previous_page_position");
        }
        bundle.putString("extra_previous_page_position", str2);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        bundle.putString("enter_from_request_id", arguments2.getString("enter_from_request_id"));
        bundle.putString("scene_id", xl().getSceneId());
        bundle.putInt("need_track_compare_recommend_reason", arguments2.getInt("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", arguments2.getString("previous_recommend_reason"));
        bundle.putString("recommend_from_type", arguments2.getString("recommend_from_type"));
        bundle.putInt("is_cold_launch", arguments2.getInt("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", arguments2.getInt("from_recommend_card", 0));
        bundle.putString("id", arguments2.getString("id"));
        bundle.putInt("general_search_card_type", arguments2.getInt("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", arguments2.getBoolean("is_notify_miniapp_follow_status", false));
        bundle.putSerializable("recommend_enter_profile_params", arguments2.getSerializable("recommend_enter_profile_params"));
        bundle.putSerializable("extra_mutual_relation", arguments2.getSerializable("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", arguments2.getBoolean("extra_from_mutual", false));
        bundle.putBoolean("sticky_content", o.LJ("1", arguments2.getString("sticky_content")));
        String string = arguments2.getString("event_keys");
        String str3 = "";
        if (string == null) {
            string = "";
        }
        String string2 = arguments2.getString("inbox_position");
        if (string2 == null) {
            string2 = "";
        }
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (string2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                try {
                    if (string.length() != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(string);
                    }
                    jSONObject.put("position", string2);
                    String jSONObject3 = jSONObject.toString();
                    o.LJIIIIZZ(jSONObject3, "{\n        val json = if …    json.toString()\n    }");
                    str3 = jSONObject3;
                } catch (Exception unused2) {
                }
                string = str3;
            }
        }
        bundle.putString("event_keys", string);
        bundle.putBoolean("is_response_home_feed_scroll", false);
        bundle.putString("source_page", arguments2.getString("source_page"));
        bundle.putString("now_card_type", arguments2.getString("now_card_type"));
        bundle.putString("is_now_clear", arguments2.getString("is_now_clear"));
        bundle.putInt("has_small_window", arguments2.getInt("has_small_window"));
        bundle.putString("now_type", arguments2.getString("now_type"));
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (intArray = arguments3.getIntArray("traffic_source_list")) != null) {
            bundle.putIntArray("traffic_source_list", intArray);
        }
        bundle.putBundle("bundle", xl().getBundle());
        return bundle;
    }

    public final UserProfileArg xl() {
        return (UserProfileArg) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        G4N g4n = this.LJLJL;
        if (g4n != null) {
            g4n.LJLIL.activityConfiguration(new AqS181S0100000_15(g4n, 47));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIIIZZ(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vl() {
        if (getContext() == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        Fragment LJJJIL = childFragmentManager.LJJJIL("userprofilefragment");
        if (LJJJIL == null) {
            LJJJIL = new I18nUserProfileFragmentV2();
            if (LJJJIL instanceof InterfaceC85969Xob) {
                InterfaceC85969Xob interfaceC85969Xob = (InterfaceC85969Xob) new I18nUserProfileFragmentV2();
                interfaceC85969Xob.LIZIZ();
                Aweme aweme = this.LJLILLLLZI;
                if (aweme != null && aweme.isAd() && TextUtils.equals("general_search", xl().getEnterFrom())) {
                    interfaceC85969Xob.LIZ();
                }
                LJJJIL = (Fragment) interfaceC85969Xob;
            }
            LJJJIL.setArguments(wl());
        }
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(LJJJIL, "userprofilefragment", R.id.nbb);
        c1b3.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        ActivityC86117Xqz activityC86117Xqz;
        if ((activity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) activity) != null) {
            activityC86117Xqz.activityConfiguration(new AqS137S0200000_6(activity, this, 16));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        int LIZJ;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            if (MSAdaptionService.LJIIL().LJI(getContext())) {
                LIZJ = C61410O8g.LIZLLL(getContext());
            } else {
                LIZJ = (int) KL2.LIZJ(linearLayout.getContext(), newConfig.screenWidthDp);
            }
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LIZJ, -1));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41169GDt.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r5 != null) goto L16;
     */
    @Override // X.LK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.put(r0, r7)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_inbox"
            r3.put(r1, r0)
            X.Yp3 r5 = X.C88545Yp3.LIZIZ
            java.lang.String r4 = ""
            if (r5 == 0) goto L22
            java.lang.String r1 = r5.LJ()
            if (r1 != 0) goto L23
        L22:
            r1 = r4
        L23:
            r2 = 0
            if (r5 == 0) goto L81
            boolean r0 = r5.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r1, r0)
            if (r5 == 0) goto L3d
            java.lang.String r1 = r5.LIZIZ()
            if (r1 != 0) goto L40
        L3d:
            r1 = r4
            if (r5 == 0) goto L46
        L40:
            java.lang.String r0 = r5.LJIILJJIL()
            if (r0 != 0) goto L7f
        L46:
            r3.put(r1, r4)
            android.os.Bundle r1 = r6.getArguments()
            if (r1 == 0) goto L55
            java.lang.String r0 = "recommend_enter_profile_params"
            java.io.Serializable r2 = r1.getSerializable(r0)
        L55:
            boolean r0 = r2 instanceof X.C57364MfI
            if (r0 == 0) goto L79
            X.MfI r2 = (X.C57364MfI) r2
            if (r2 == 0) goto L79
            java.lang.String r0 = r2.getToUserId()
            if (r0 == 0) goto L79
            boolean r0 = ujb.o.LJJJJJL(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L79
            java.lang.String r0 = r2.getToUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r3.put(r0, r1)
        L79:
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r3)
            return
        L7f:
            r4 = r0
            goto L46
        L81:
            r0 = r2
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.v0(java.lang.String):void");
    }

    @Override // X.InterfaceC85917Xnl
    public final void g90(String str, String str2) {
        xl().setUserId(str);
        xl().setSecUid(str2);
        vl();
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(4);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // X.G4M
    public final void onActivityReenter(int i, Intent intent) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C55408Loq.LIZ(mo49getActivity, i);
        if (-1 == i && intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "feed_share_element_aid");
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            if (childFragmentManager.LJJJIL("userprofilefragment") instanceof AW2) {
                InterfaceC36571c5 LJJJIL = childFragmentManager.LJJJIL("userprofilefragment");
                o.LJII(LJJJIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IUserProfile");
                ((AW2) LJJJIL).LJJIJ(LLJJIJIIJIL);
            } else {
                if (!(childFragmentManager.LJJJIL("myprofilefragment") instanceof InterfaceC59608NaO)) {
                    return;
                }
                InterfaceC36571c5 LJJJIL2 = childFragmentManager.LJJJIL("myprofilefragment");
                o.LJII(LJJJIL2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IMyProfile");
                ((InterfaceC59608NaO) LJJJIL2).LJJIJ(LLJJIJIIJIL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        if (android.text.TextUtils.equals(xl().getUserId(), ((X.RBX) X.HG3.LJIILL()).getCurUserId()) != false) goto L23;
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == 2) {
                C80844Vo8 c80844Vo8 = this.LJLJJL;
                if (c80844Vo8 != null) {
                    c80844Vo8.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i == 10086 && i2 == -1) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.setResult(-1, intent);
            }
            activityConfiguration(C85594XiY.LJLIL);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 == null) {
                return;
            }
            mo49getActivity2.finish();
            C78939UyV.LJJJJ(mo49getActivity2);
            C78996UzQ.LJJJ(mo49getActivity2);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c2w, viewGroup, false);
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
