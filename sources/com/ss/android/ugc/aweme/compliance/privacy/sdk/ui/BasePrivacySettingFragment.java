package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.ActivityC45651qj;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C32151Nz;
import X.C62822Ol8;
import X.C71909SKb;
import X.C71934SLa;
import X.C71945SLl;
import X.C72041SPd;
import X.C7MY;
import X.C9KF;
import X.FMX;
import X.InterfaceC61213O0r;
import X.InterfaceC71918SKk;
import X.O6R;
import X.ORZ;
import X.SHP;
import X.SKI;
import X.SKJ;
import X.SKL;
import X.SKQ;
import X.SLJ;
import X.SLR;
import X.SNL;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.filterkeyword.FilterKeywordViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.nudefilter.NudgeFilterViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.safemode.SafeModeViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public class BasePrivacySettingFragment extends BaseFragment implements SKJ {
    public List<? extends SLJ> LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 166));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 173));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 167));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 171));

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final int getLayout() {
        return R.layout.ahj;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BasePrivacySettingFragment() {
        SNL.LIZ.LIZ();
    }

    @Override // X.SKJ
    public void Ra() {
        List<? extends SLJ> list = this.LJLJJLL;
        if (list == null) {
            return;
        }
        SKJ.LJJJJLL.getClass();
        String LIZ = SKI.LIZ(list);
        TextView textView = (TextView) _$_findCachedViewById(R.id.lgi);
        if (textView != null) {
            if (LIZ == null || LIZ.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(LIZ);
            }
        }
    }

    public final String getEnterFrom() {
        return (String) this.LJLJJI.getValue();
    }

    public final String wl() {
        return (String) this.LJLJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int i;
        Integer M;
        if (o.LJ(wl(), "downloads")) {
            C72041SPd.LIZ.getClass();
            PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
            int i2 = 0;
            if (LJI != null && (M = LJI.M("download")) != null) {
                i = M.intValue();
            } else {
                i = 0;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("user_id", C71945SLl.LIZIZ());
            c188727au.LJIIIZ("enter_from", "account_download_setting");
            if (i == 3) {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "enter_status");
            FMX.LJIIL("tns_video_download_use_leave", c188727au.LIZ);
        }
        super.onDestroy();
    }

    public List<SLJ> vl() {
        SKL skl;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            skl = new SKL(mo49getActivity);
        } else {
            skl = new SKL(this);
        }
        if (o.LJ(wl(), "chat")) {
            boolean equals = TextUtils.equals(getEnterFrom(), "system_notifications");
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 == null) {
                mo49getActivity2 = this;
            }
            ((SafeModeViewModel) new ViewModelProvider(mo49getActivity2).get(SafeModeViewModel.class)).LJLJL = equals;
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 == null) {
                mo49getActivity3 = this;
            }
            ((FilterKeywordViewModel) new ViewModelProvider(mo49getActivity3).get(FilterKeywordViewModel.class)).LJLIL = equals;
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 == null) {
                mo49getActivity4 = this;
            }
            NudgeFilterViewModel nudgeFilterViewModel = (NudgeFilterViewModel) new ViewModelProvider(mo49getActivity4).get(NudgeFilterViewModel.class);
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            nudgeFilterViewModel.getClass();
            nudgeFilterViewModel.LJLJL = enterFrom;
            ActivityC45651qj mo49getActivity5 = mo49getActivity();
            if (mo49getActivity5 == null) {
                mo49getActivity5 = this;
            }
            ChatViewModel chatViewModel = (ChatViewModel) new ViewModelProvider(mo49getActivity5).get(ChatViewModel.class);
            String enterFrom2 = getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "this@BasePrivacySettingFragment.enterFrom");
            chatViewModel.getClass();
            chatViewModel.LJLJL = enterFrom2;
            String str = (String) this.LJLJJL.getValue();
            o.LJIIIIZZ(str, "this@BasePrivacySettingFragment.enterMethod");
            chatViewModel.LJLJLJ = str;
        }
        if (o.LJ(wl(), "comment")) {
            ActivityC45651qj mo49getActivity6 = mo49getActivity();
            if (mo49getActivity6 == null) {
                mo49getActivity6 = this;
            }
            CommentViewModel commentViewModel = (CommentViewModel) new ViewModelProvider(mo49getActivity6).get(CommentViewModel.class);
            String str2 = (String) this.LJLJJL.getValue();
            o.LJIIIIZZ(str2, "this@BasePrivacySettingFragment.enterMethod");
            commentViewModel.getClass();
            commentViewModel.LJLJL = str2;
            ActivityC45651qj mo49getActivity7 = mo49getActivity();
            if (mo49getActivity7 == null) {
                mo49getActivity7 = this;
            }
            CommentFilterModel commentFilterModel = (CommentFilterModel) new ViewModelProvider(mo49getActivity7).get(CommentFilterModel.class);
            String str3 = (String) this.LJLJJL.getValue();
            o.LJIIIIZZ(str3, "this@BasePrivacySettingFragment.enterMethod");
            commentFilterModel.getClass();
            commentFilterModel.LJLIL = str3;
        }
        if (o.LJ(wl(), "music_collection")) {
            ActivityC45651qj mo49getActivity8 = mo49getActivity();
            if (mo49getActivity8 == null) {
                mo49getActivity8 = this;
            }
            ((MusicCollectionViewModel) new ViewModelProvider(mo49getActivity8).get(MusicCollectionViewModel.class)).LJLJL = getEnterFrom();
        }
        Object value = SNL.LIZLLL.getValue();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj mo49getActivity9 = mo49getActivity();
        if (mo49getActivity9 == null) {
            mo49getActivity9 = this;
        }
        TPSCPageBuildConfigs tPSCPageBuildConfigs = (TPSCPageBuildConfigs) this.LJLILLLLZI.getValue();
        value.getClass();
        List<? extends SLJ> LIZIZ = C71909SKb.LIZIZ(requireContext, mo49getActivity9, this, tPSCPageBuildConfigs, skl);
        this.LJLJJLL = LIZIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C71934SLa(this, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), this));
        Object obj = null;
        for (SLJ slj : LIZIZ) {
            List LLJI = ORZ.LLJI(slj.LJLILLLLZI);
            if ((obj instanceof InterfaceC71918SKk) && !(ORZ.LJLLLL(LLJI) instanceof InterfaceC71918SKk)) {
                arrayList.add(new C71934SLa(this, C7MY.LIZIZ(8), this));
            }
            Object LLFII = ORZ.LLFII(LLJI);
            if (LLFII != null) {
                obj = LLFII;
            }
            arrayList.add(slj);
        }
        arrayList.add(new SHP(new SKQ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), this));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        Integer M;
        super.onCreate(bundle);
        if (o.LJ(wl(), "downloads")) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            C72041SPd.LIZ.getClass();
            PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
            int i2 = 0;
            if (LJI != null && (M = LJI.M("download")) != null) {
                i = M.intValue();
            } else {
                i = 0;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("user_id", C71945SLl.LIZIZ());
            c188727au.LJIIIZ("enter_from", enterFrom);
            if (i == 3) {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "enter_status");
            FMX.LJIIL("tns_video_download_use_show", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 172));
        c252709vu.LIZJ(LIZJ);
        getContext();
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setAdapter(SLR.LIZ(vl()));
        ((C252709vu) _$_findCachedViewById(R.id.la4)).LJIILJJIL(false);
        ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavBackground(0);
        Integer num = ((TPSCPageBuildConfigs) this.LJLILLLLZI.getValue()).titleRes;
        String str = ((TPSCPageBuildConfigs) this.LJLILLLLZI.getValue()).title;
        if (num != null && num.intValue() != 0) {
            String string2 = getString(num.intValue());
            o.LJIIIIZZ(string2, "getString(titleRes)");
            C252709vu c252709vu2 = (C252709vu) _$_findCachedViewById(R.id.la4);
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string2;
            c252709vu2.LJIILLIIL(c9kf);
        } else if (str != null) {
            C252709vu c252709vu3 = (C252709vu) _$_findCachedViewById(R.id.la4);
            C9KF c9kf2 = new C9KF();
            c9kf2.LIZJ = str;
            c252709vu3.LJIILLIIL(c9kf2);
        }
        Ra();
    }
}
