package com.ss.android.ugc.tiktok.addyours.hub;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16950lX;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C219608jc;
import X.C219648jg;
import X.C219988kE;
import X.C219998kF;
import X.C220008kG;
import X.C220028kI;
import X.C220038kJ;
import X.C220048kK;
import X.C220058kL;
import X.C220068kM;
import X.C220078kN;
import X.C220088kO;
import X.C220098kP;
import X.C220108kQ;
import X.C220488l2;
import X.C226388uY;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C41189GEn;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55480Lq0;
import X.C5H3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6UU;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.HG3;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class AddYoursHubFragment extends BaseFragment implements JBS, AddYoursHubAbility {
    public final C214298b3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public User LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
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
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public AddYoursHubFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursHubTabViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1422);
        C220078kN c220078kN = C220078kN.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c220078kN, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c220078kN, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLILLLLZI = routeArgExtension.optionalArgNotNull(this, C220058kL.LJLIL, "uid", String.class);
        this.LJLJJI = routeArgExtension.optionalArgNotNull(this, C219998kF.LJLIL, "show_topic_detail", Integer.class);
        this.LJLJJL = routeArgExtension.optionalArgNotNull(this, C220008kG.LJLIL, "topic_id", Long.class);
        this.LJLJJLL = routeArgExtension.optionalArgNotNull(this, C220028kI.LJLIL, "enter_from", String.class);
        this.LJLJL = routeArgExtension.optionalArgNotNull(this, C220048kK.LJLIL, "nick_name", String.class);
        this.LJLJLJ = routeArgExtension.optionalArgNotNull(this, C220038kJ.LJLIL, "enter_method", String.class);
        this.LJLJLLL = routeArgExtension.optionalArgNotNull(this, C220068kM.LJLIL, "is_from_qa", Boolean.class);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final String Yg0() {
        String nickname;
        User user = this.LJLJI;
        if (user == null || (nickname = user.getNickname()) == null) {
            return (String) this.LJLJL.getValue();
        }
        return nickname;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final C219608jc mB() {
        return new C219608jc(this.LJLJI, (String) this.LJLILLLLZI.getValue(), (String) this.LJLJJLL.getValue(), (String) this.LJLJLJ.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C55480Lq0.LIZIZ.LIZLLL(1, 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41189GEn.LJLIL);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final void sD(User user) {
        o.LJIIIZ(user, "user");
        this.LJLJI = user;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        String str;
        int i3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55480Lq0.LIZIZ.LIZLLL(1, 2);
        View findViewById = view.findViewById(R.id.kej);
        if (findViewById != null) {
            layoutParams = findViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            Context context = getContext();
            if (context != null) {
                i = C63081OpJ.LJJJJLI(context);
            } else {
                i = 0;
            }
            layoutParams.height = i;
        }
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, AddYoursHubAbility.class, null);
        Context context2 = _$_findCachedViewById(R.id.gwg).getContext();
        int LIZLLL = C226388uY.LIZLLL();
        if (LIZLLL == C6UU.ADD_YOURS.getValue() || LIZLLL != C6UU.POST_YOURS.getValue()) {
            i2 = R.string.bct;
        } else {
            i2 = R.string.bem;
        }
        String string = context2.getString(i2);
        o.LJIIIIZZ(string, "nav_bar.context.getString(getHubNavBarTitle())");
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1538));
        C9KF LIZLLL2 = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL2.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL2;
        if (o.LJ(this.LJLJJLL.getValue(), "creator_tools")) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_ellipsis_vertical;
            LIZJ2.LIZIZ(new AqS153S0100000_3(this, 1537));
            c235119Kp.LIZIZ(LIZJ2);
        }
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).setNavActions(c235119Kp);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 755));
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) this.LJLIL.getValue();
        if (((RBX) HG3.LJIILL()).isMe((String) this.LJLILLLLZI.getValue())) {
            assemSingleListViewModel.setState(C220088kO.LJLIL);
            assemSingleListViewModel.listAddAll(C47261Igj.LJJIJIIJI(new C219988kE(1, C78598Ut0.LJIIJJI(1), true, new C220108kQ(0, 0)), new C219988kE(2, C78598Ut0.LJIIJJI(2), false, new C220108kQ(2, 0))));
        } else {
            assemSingleListViewModel.setState(C220098kP.LJLIL);
            assemSingleListViewModel.listAddAll(C47261Igj.LJJIJ(new C219988kE(1, C78598Ut0.LJIIJJI(1), true, new C220108kQ(1, 0))));
        }
        Context context3 = getContext();
        if (((Number) this.LJLJJI.getValue()).intValue() != 1 || ((Number) this.LJLJJL.getValue()).longValue() < 0 || context3 == null) {
            return;
        }
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        AddYoursTopic addYoursTopic = new AddYoursTopic(Long.valueOf(((Number) this.LJLJJL.getValue()).longValue()), null, null, null, null, null, null, Boolean.valueOf(((Boolean) this.LJLJLLL.getValue()).booleanValue()), 0, null, 894, null);
        boolean booleanValue = ((Boolean) this.LJLJLLL.getValue()).booleanValue();
        if (((Boolean) this.LJLJLLL.getValue()).booleanValue()) {
            str = "qa_share";
        } else if (((RBX) HG3.LJIILL()).isMe((String) this.LJLILLLLZI.getValue())) {
            str = "added";
        } else {
            str = "others_hub";
        }
        if (((RBX) HG3.LJIILL()).isMe((String) this.LJLILLLLZI.getValue())) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        C219648jg.LIZ(c220488l2, context3, addYoursTopic, null, null, null, booleanValue, "add_yours_topic_list_page", str, i3, null, 540);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZ = C16950lX.LIZ(getContext(), R.layout.gf, viewGroup, false, -1);
        C29S c29s = null;
        if (!(LIZ instanceof View)) {
            LIZ = null;
        }
        if (LIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZ, this);
                C10A.LIZIZ(LIZ, this);
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
        return LIZ;
    }
}
