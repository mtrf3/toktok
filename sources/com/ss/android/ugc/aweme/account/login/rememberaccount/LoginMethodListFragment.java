package com.ss.android.ugc.aweme.account.login.rememberaccount;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass806;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1C8;
import X.C221108m2;
import X.C26338AVi;
import X.C29S;
import X.C30869C9p;
import X.C3C5;
import X.C53262KvK;
import X.C5S1;
import X.C62822Ol8;
import X.C63026OoQ;
import X.C68517Qun;
import X.C68938R3u;
import X.C68971R5b;
import X.C68972R5c;
import X.C76800UCe;
import X.C78685UuP;
import X.C85531XhX;
import X.C90903hW;
import X.DialogC61824OOe;
import X.InterfaceC61825OOf;
import X.ORZ;
import X.R41;
import X.R47;
import X.R5B;
import X.R5C;
import X.R5D;
import X.R5G;
import X.R5H;
import X.R5J;
import X.T5S;
import X.V1B;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS2S0311000_11;
import kotlin.jvm.internal.AqS66S0110000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class LoginMethodListFragment extends BaseAccountFlowFragment implements InterfaceC61825OOf {
    public static int LL;
    public static int LLD;
    public static C68938R3u LLF;
    public DialogC61824OOe LJLLLLLL;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 14));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 12));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 13));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "LoginMethodListFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
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

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    public final void LJIJ() {
        DialogC61824OOe dialogC61824OOe = this.LJLLLLLL;
        if (dialogC61824OOe != null) {
            V1B.LJLJI(dialogC61824OOe);
        }
        C68938R3u c68938R3u = LLF;
        if (c68938R3u != null) {
            C68517Qun.LIZLLL.removeObserver(c68938R3u);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DialogC61824OOe dialogC61824OOe = this.LJLLLLLL;
        if (dialogC61824OOe != null) {
            V1B.LJLILLLLZI(dialogC61824OOe);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Map<String, Object> q9() {
        return (Map) this.LJZ.getValue();
    }

    @Override // X.InterfaceC61825OOf
    public final void X() {
        vl();
    }

    public final void Il(boolean z) {
        LoginMethodListActivity loginMethodListActivity;
        String str;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if ((mo49getActivity instanceof LoginMethodListActivity) && (loginMethodListActivity = (LoginMethodListActivity) mo49getActivity) != null) {
            Bundle bundle = new Bundle();
            if (z) {
                str = "login";
            } else {
                str = "sign_up";
            }
            bundle.putString("dismiss_action", str);
            int intExtra = loginMethodListActivity.getIntent().getIntExtra("action_type", -1);
            if (intExtra != -1) {
                SparseArray<R47> sparseArray = CommonFlowActivity.LJLLI;
                R47 r47 = sparseArray.get(intExtra);
                if (r47 != null) {
                    r47.onResult(intExtra, 2, bundle);
                }
                sparseArray.remove(intExtra);
            }
            loginMethodListActivity.finish();
        }
    }

    public final void Jl(BaseLoginMethod baseLoginMethod) {
        Intent intent;
        Bundle LLJJIJI;
        String string;
        Bundle bundle = new Bundle((Bundle) this.LJLZ.getValue());
        bundle.putBoolean("disable_auto_gms", true);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("auth_from_app")) != null) {
            bundle.putString("channel", string);
        }
        LoginService LJ = R41.LJ();
        o.LJII(LJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.LoginService");
        if (LJ.loginByMethod(requireActivity(), bundle, baseLoginMethod) || C53262KvK.LIZIZ()) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && !LLJJIJI.getBoolean("is_skippable_dialog")) {
            mo49getActivity.finish();
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C68971R5b.LIZJ(requireActivity, bundle, true, false, false);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        Context context = getContext();
        if (context != null) {
            if (i < 0) {
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(getString(R.string.img));
                c5s1.LJ();
            } else {
                if (TextUtils.isEmpty(message)) {
                    return;
                }
                C30869C9p.LIZIZ(context, message);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        List LLJILJILJ = ORZ.LLJILJILJ(C68517Qun.LIZ.LJ(R41.LIZIZ.LJFF().allUidList()));
        if (C53262KvK.LIZIZ()) {
            LLJILJILJ = R5G.LIZ(LLJILJILJ);
            View onViewCreated$lambda$4 = view.findViewById(R.id.gif);
            int dimension = (int) getResources().getDimension(R.dimen.gc);
            int dimension2 = (int) getResources().getDimension(R.dimen.gb);
            o.LJIIIIZZ(onViewCreated$lambda$4, "onViewCreated$lambda$4");
            C26338AVi.LJI(onViewCreated$lambda$4, Integer.valueOf(dimension), 0, Integer.valueOf(dimension), Integer.valueOf(dimension2), false, 16);
        }
        Map<String, Object> q9 = q9();
        if (q9 != null) {
            q9.put("acct_shown", Integer.valueOf(LLD + LL));
        }
        Map<String, Object> q92 = q9();
        if (q92 != null) {
            q92.put("acct_shown_hist", Integer.valueOf(LL));
        }
        Map<String, Object> q93 = q9();
        if (q93 != null) {
            q93.put("acct_shown_ocl", Integer.valueOf(LLD));
        }
        C68972R5c.LJI((Bundle) this.LJLZ.getValue(), q9(), LLJILJILJ);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.gif);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.gif)).setAdapter(new C85531XhX(LLJILJILJ, new R5B(this, view), getEnterFrom(), getEnterMethod(), (OneClickLoginViewModel) this.LJZI.getValue()));
        if (C53262KvK.LIZIZ() && (context = getContext()) != null) {
            new C1C8(new R5H(context, this)).LJII((RecyclerView) _$_findCachedViewById(R.id.gif));
        }
        _$_findCachedViewById(R.id.g4d).setOnTouchListener(new AnonymousClass806(0.5f));
        String string = getString(R.string.u2);
        o.LJIIIIZZ(string, "getString(R.string.Save_panel_entry_2)");
        String string2 = getString(R.string.u1, string);
        o.LJIIIIZZ(string2, "getString(R.string.Save_…nel_entry_1, rightString)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
        Context context2 = _$_findCachedViewById(R.id.g4d).getContext();
        o.LJIIIIZZ(context2, "ll_login_group.context");
        final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context2);
        if (LJJLIIIJL >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIIIZZ) { // from class: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment$onViewCreated$4
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    o.LJIIIZ(textPaint, "textPaint");
                    super.updateDrawState(textPaint);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    textPaint.setTypeface(t5s.getTypeface());
                }
            }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
        }
        ((TextView) _$_findCachedViewById(R.id.g4d)).setText(spannableStringBuilder);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.g4d), new R5C(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.mq, viewGroup, false);
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

    public final void Hl(BaseLoginMethod baseLoginMethod, int i, View view, boolean z) {
        Map<String, ? extends Object> map;
        ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        String oneClickLoginToken = baseLoginMethod.getOneClickLoginToken();
        String uid = baseLoginMethod.getUid();
        R5J r5j = R5J.ONE_CLICK_LOGIN;
        Map<String, Object> q9 = q9();
        if (q9 != null) {
            map = C113554cx.LJJLIL(q9);
            map.put("account_type", R5D.LIZ(baseLoginMethod));
            map.put("platform", "oneclick");
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String loginPanelType = wl();
            o.LJIIIIZZ(loginPanelType, "loginPanelType");
            String channel = (String) this.LJLJLLL.getValue();
            o.LJIIIIZZ(channel, "channel");
            map.put("MOB_PARAMS_PROVIDER", new C63026OoQ(enterFrom, enterMethod, "oneclick_login", loginPanelType, channel, getArguments()));
        } else {
            map = null;
        }
        createICloudTokenLoginServicebyMonsterPlugin.oneClickLogin(mo49getActivity, oneClickLoginToken, uid, true, r5j, map, new AqS66S0110000_11(this, z, 0), new AqS2S0311000_11(i, view, baseLoginMethod, this, z, 0));
    }

    public final void Kl(BaseLoginMethod baseLoginMethod, int i, View view, boolean z) {
        if (this.LJLLLLLL == null) {
            Context context = getContext();
            o.LJI(context);
            DialogC61824OOe dialogC61824OOe = new DialogC61824OOe(context);
            this.LJLLLLLL = dialogC61824OOe;
            dialogC61824OOe.LJLIL = this;
        }
        DialogC61824OOe dialogC61824OOe2 = this.LJLLLLLL;
        if (dialogC61824OOe2 != null) {
            V1B.LJLJJL(dialogC61824OOe2);
        }
        Boolean bool = Boolean.FALSE;
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String loginPanelType = wl();
        o.LJIIIIZZ(loginPanelType, "loginPanelType");
        String channel = (String) this.LJLJLLL.getValue();
        o.LJIIIIZZ(channel, "channel");
        C68972R5c.LJII(bool, "oneclick", new C63026OoQ(enterFrom, enterMethod, "oneclick_login", loginPanelType, channel, getArguments()), false, q9());
        if (C78685UuP.LJJJZ(baseLoginMethod.getOneClickLoginToken())) {
            Hl(baseLoginMethod, i, view, z);
            return;
        }
        C68938R3u c68938R3u = LLF;
        if (c68938R3u != null) {
            C68517Qun.LIZLLL.removeObserver(c68938R3u);
        }
        C68938R3u c68938R3u2 = new C68938R3u(i, view, baseLoginMethod, this, z);
        C68517Qun.LIZLLL.observe(getViewLifecycleOwner(), c68938R3u2);
        LLF = c68938R3u2;
    }
}
