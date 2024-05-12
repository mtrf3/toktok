package com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui;

import X.ActivityC45651qj;
import X.C01R;
import X.C0JT;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25600zU;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C72062SPy;
import X.C76800UCe;
import X.C8G2;
import X.C90903hW;
import X.FMX;
import X.GCG;
import X.GH4;
import X.SHI;
import X.SKL;
import X.SLR;
import X.SNL;
import X.SPO;
import X.SPP;
import X.SY4;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.duet.DuetViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch.StitchViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaPromptPrivacySettingsFragment extends BaseFragment implements GH4 {
    public static final /* synthetic */ int LJLJJLL = 0;
    public long LJLILLLLZI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 165));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 92));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 91));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.GH4
    public final boolean onBackPressed() {
        int i;
        int i2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        c188727au.LJIIIZ("click_type", "go_back");
        c188727au.LJ(System.currentTimeMillis() - this.LJLILLLLZI, "stay_time");
        if (((Number) this.LJLJI.getValue()).intValue() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_later_show");
        c188727au.LJIIIZ("private_type", vl());
        c188727au.LJIIIZ("enter_position", (String) this.LJLJJI.getValue());
        FMX.LJIIL("account_privacy_setting_page", c188727au.LIZ);
        Bundle arguments = getArguments();
        if (arguments == null || ((i2 = arguments.getInt("private_account_prompt")) != 2 && i2 != 4)) {
            ((PaPromptViewModel) this.LJLIL.getValue()).LJLIL.postValue(SPP.NONE);
        }
        return false;
    }

    public final String vl() {
        SPP value = ((PaPromptViewModel) this.LJLIL.getValue()).LJLIL.getValue();
        if (value != null) {
            int i = SPO.LIZ[value.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    return "remind_me_later";
                }
            } else {
                return "public";
            }
        }
        return "private";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLILLLLZI = System.currentTimeMillis();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GCG.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence spannableStringBuilder;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l9j);
        C235119Kp c235119Kp = new C235119Kp();
        int i = 1;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 499));
        c235119Kp.LIZLLL(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        ((TuxTextView) _$_findCachedViewById(R.id.title)).LJJJ(36.0f);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h0y), new ACListenerS32S0100000_12(this, 135));
        TextView textView = (TextView) _$_findCachedViewById(R.id.e5i);
        Context context = getContext();
        if (context != null) {
            SPP value = ((PaPromptViewModel) this.LJLIL.getValue()).LJLIL.getValue();
            if (value != null) {
                int i2 = SPO.LIZ[value.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            String string = getString(R.string.pah);
                            o.LJIIIIZZ(string, "getString(R.string.priva…mindMeLater_description2)");
                            C72062SPy c72062SPy = new C72062SPy();
                            String string2 = getString(R.string.pag);
                            o.LJIIIIZZ(string2, "getString(R.string.priva…mindMeLater_description1)");
                            c72062SPy.LIZIZ = string2;
                            c72062SPy.LJ(2);
                            c72062SPy.LIZIZ(62);
                            c72062SPy.LIZ = false;
                            spannableStringBuilder = C8G2.LIZ(string, c72062SPy.LIZ(context));
                        }
                    } else {
                        String string3 = getString(R.string.paf);
                        o.LJIIIIZZ(string3, "getString(R.string.priva…blicAccount_description2)");
                        C72062SPy c72062SPy2 = new C72062SPy();
                        String string4 = getString(R.string.pae);
                        o.LJIIIIZZ(string4, "getString(R.string.priva…blicAccount_description1)");
                        c72062SPy2.LIZIZ = string4;
                        c72062SPy2.LJ(2);
                        c72062SPy2.LIZIZ(62);
                        c72062SPy2.LIZ = false;
                        spannableStringBuilder = C8G2.LIZ(string3, c72062SPy2.LIZ(context));
                    }
                } else {
                    String string5 = getString(R.string.pad);
                    o.LJIIIIZZ(string5, "getString(R.string.priva…vateAccount_description2)");
                    C72062SPy c72062SPy3 = new C72062SPy();
                    String string6 = getString(R.string.pac);
                    o.LJIIIIZZ(string6, "getString(R.string.priva…vateAccount_description1)");
                    c72062SPy3.LIZIZ = string6;
                    c72062SPy3.LJ(2);
                    c72062SPy3.LIZIZ(62);
                    c72062SPy3.LIZ = false;
                    spannableStringBuilder = C8G2.LIZ(string5, c72062SPy3.LIZ(context));
                }
            }
            spannableStringBuilder = new SpannableStringBuilder();
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        textView.setText(spannableStringBuilder);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.i4k);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        recyclerView.setItemAnimator(null);
        Object value2 = SNL.LIZLLL.getValue();
        C25600zU c25600zU = new C25600zU(requireContext(), R.style.a6d);
        Bundle LIZ = C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", false);
        LIZ.putBoolean("enableStitch", AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableStitch());
        List contentConfigs = C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("comment_item", C0JT.LIZ("show_icon", true, "contain_comment_filter", false)), new PrivacySettingsAdapterConfigs("chat_item", C01R.LIZ("show_icon", true)), new PrivacySettingsAdapterConfigs("duet_item", C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", false)), new PrivacySettingsAdapterConfigs("stitch_item", LIZ));
        SKL skl = new SKL(this);
        value2.getClass();
        o.LJIIIZ(contentConfigs, "contentConfigs");
        recyclerView.setAdapter(SLR.LIZ(SHI.LIZ(c25600zU, this, this, contentConfigs, skl)));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            mo49getActivity = this;
        }
        ChatViewModel chatViewModel = (ChatViewModel) new ViewModelProvider(mo49getActivity).get(ChatViewModel.class);
        chatViewModel.getClass();
        chatViewModel.LJLJL = "account_privacy_page";
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null) {
            mo49getActivity2 = this;
        }
        ((DuetViewModel) new ViewModelProvider(mo49getActivity2).get(DuetViewModel.class)).LJLJL = "account_privacy_page";
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 == null) {
            mo49getActivity3 = this;
        }
        ((StitchViewModel) new ViewModelProvider(mo49getActivity3).get(StitchViewModel.class)).LJLJL = "account_privacy_page";
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 == null) {
            mo49getActivity4 = this;
        }
        ((CommentViewModel) new ViewModelProvider(mo49getActivity4).get(CommentViewModel.class)).LJLJLJ = "account_privacy_page";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJIIIZ("private_type", vl());
        if (((Number) this.LJLJI.getValue()).intValue() <= 0) {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_later_show");
        c188727au.LJIIIZ("enter_position", (String) this.LJLJJI.getValue());
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        FMX.LJIIL("account_privacy_setting_page", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ah7, viewGroup, false);
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
