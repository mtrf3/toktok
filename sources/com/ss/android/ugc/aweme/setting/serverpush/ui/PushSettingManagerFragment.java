package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AEB;
import X.AEG;
import X.AET;
import X.AG5;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C235119Kp;
import X.C252709vu;
import X.C25848ACm;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C29S;
import X.C3C5;
import X.C40322Fs6;
import X.C52242Kes;
import X.C52293Kfh;
import X.C53097Ksf;
import X.C53138KtK;
import X.C53215KuZ;
import X.C5S1;
import X.C75792yF;
import X.C76800UCe;
import X.C78840Uwu;
import X.C7HV;
import X.C7HZ;
import X.C81330Vvy;
import X.C85895XnP;
import X.C85938Xo6;
import X.C85940Xo8;
import X.C86V;
import X.C90903hW;
import X.DialogC81627W1v;
import X.EF7;
import X.FMX;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import X.SYL;
import X.Z8A;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS40S0300000_15;
import Y.AObjectS52S0101000_7;
import Y.AObjectS54S0101000_9;
import Y.AObserverS64S0101000_14;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class PushSettingManagerFragment extends AmeBaseFragment implements InterfaceC85901XnV, InterfaceC85903XnX {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public C252709vu LJLIL;
    public SYL LJLILLLLZI;
    public C25851ACp LJLJI;
    public C85938Xo6 LJLJJI;
    public C85938Xo6 LJLJJL;
    public C85938Xo6 LJLJJLL;
    public C85938Xo6 LJLJL;
    public C85938Xo6 LJLJLJ;
    public C85938Xo6 LJLJLLL;
    public C85938Xo6 LJLL;
    public C85938Xo6 LJLLI;
    public C85938Xo6 LJLLILLLL;
    public C85938Xo6 LJLLJ;
    public C85938Xo6 LJLLL;
    public C85938Xo6 LJLLLL;
    public C85938Xo6 LJLLLLLL;
    public C85938Xo6 LJLZ;
    public C85938Xo6 LJZ;
    public C85938Xo6 LJZI;
    public C25860ACy LJZL;
    public C25860ACy LL;
    public C25860ACy LLD;
    public C25860ACy LLF;
    public AEG LLFF;
    public AEG LLFFF;
    public AEG LLFII;
    public AEG LLFZ;
    public AEG LLI;
    public AEG LLIFFJFJJ;
    public AEG LLII;
    public C85938Xo6 LLIIII;
    public boolean LLIIIILZ;
    public C85895XnP LLIIIJ;
    public C81330Vvy LLIIIL;
    public List<String> LLIIIZ;
    public DialogC81627W1v LLIIJI;

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIIIJ.LIZIZ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLIIIL.LIZ(C40322Fs6.LIZJ(getContext()));
        boolean LIZJ = C40322Fs6.LIZJ(getContext());
        this.LJLJJLL.LJIILJJIL(LIZJ);
        this.LJLJL.LJIILJJIL(LIZJ);
        this.LJLJLJ.LJIILJJIL(LIZJ);
        this.LJLJLLL.LJIILJJIL(LIZJ);
        this.LJLL.LJIILJJIL(LIZJ);
        this.LJLJJI.LJIILJJIL(LIZJ);
        this.LJLLI.LJIILJJIL(LIZJ);
        this.LJLLILLLL.LJIILJJIL(LIZJ);
        this.LJLLJ.LJIILJJIL(LIZJ);
        this.LJLLL.LJIILJJIL(LIZJ);
        this.LJLLLL.LJIILJJIL(LIZJ);
        this.LJZ.LJIILJJIL(LIZJ);
        this.LJZL.LJIIL(LIZJ);
        this.LJLZ.LJIILJJIL(LIZJ);
        this.LLD.LJIIL(LIZJ);
        this.LLF.LJIIL(LIZJ);
        this.LJZI.LJIILJJIL(LIZJ);
        C85895XnP c85895XnP = this.LLIIIJ;
        if (c85895XnP != null) {
            c85895XnP.LJIILL(new Object[0]);
        }
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        try {
            new JSONObject(C75792yF.LIZJ(pushSettings));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        xl(pushSettings);
        C85940Xo8.LIZIZ.LIZJ(pushSettings);
    }

    public final void xl(PushSettings pushSettings) {
        if (this.LLIIIILZ) {
            pushSettings.recommendVideoPush = 0;
            pushSettings.liveInnerPush = 0;
            pushSettings.otherChannel = 0;
        }
        wl(pushSettings.diggPush, this.LJLJJLL);
        wl(pushSettings.commentPush, this.LJLJL);
        wl(pushSettings.followPush, this.LJLJLJ);
        wl(pushSettings.mentionPush, this.LJLJLLL);
        wl(pushSettings.profileViewerPush, this.LJLL);
        wl(pushSettings.friendUpvotePush, this.LJLJJI);
        wl(pushSettings.followNewVideoPush, this.LJLLI);
        wl(pushSettings.upvoteVideoPush, this.LJLLILLLL);
        wl(pushSettings.recommendVideoPush, this.LJLLJ);
        wl(pushSettings.livePush, this.LJLLL);
        wl(pushSettings.imPush, this.LJLLLL);
        wl(pushSettings.liveInnerPush, this.LLIIII);
        wl(pushSettings.otherChannel, this.LJZ);
        wl(pushSettings.friendSuggestion, this.LJZ);
        wl(pushSettings.pushMessagePreviewText, this.LJLZ);
        NotificationManagerServiceImpl.LJIIIZ().LJ(Integer.valueOf(pushSettings.liveInnerPush));
    }

    public static void wl(int i, C85938Xo6 c85938Xo6) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c85938Xo6.LJIILIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        this.LJLIL = (C252709vu) view.findViewById(R.id.la4);
        this.LJLILLLLZI = (SYL) view.findViewById(R.id.igb);
        this.LJLJJL = new C85938Xo6(new C25848ACm(false, getString(R.string.pjt), new ACListenerS24S0101000_5(5, this, 0)));
        this.LLFF = new AEG(new AEB(getString(R.string.pjz)));
        this.LLFFF = new AEG(new AEB((CharSequence) getString(R.string.pjz), false));
        this.LJLJJLL = new C85938Xo6(new C25848ACm(getString(R.string.pjq), 0));
        this.LJLJL = new C85938Xo6(new C25848ACm(getString(R.string.pjp), "item_push_comment"));
        this.LJLJLJ = new C85938Xo6(new C25848ACm(getString(R.string.pjr), "item_push_follow"));
        this.LJLJLLL = new C85938Xo6(new C25848ACm(getString(R.string.pjo), 0));
        this.LJLL = new C85938Xo6(new C25848ACm(getString(R.string.pgu)));
        this.LJLJJI = new C85938Xo6(new C25848ACm(getString(R.string.pue)));
        this.LLFII = new AEG(new AEB(getString(R.string.pk0)));
        this.LJLLLL = new C85938Xo6(new C25848ACm(getString(R.string.pjw), 0));
        this.LJLLLLLL = new C85938Xo6(new C25848ACm(getString(R.string.cp3)));
        this.LJLZ = new C85938Xo6(new C25848ACm(getString(R.string.ply)));
        this.LLFZ = new AEG(new AEB(getString(R.string.pk1)));
        this.LLI = new AEG(new AEB(getString(R.string.p_7), new ACListenerS22S0101000_3(3, this, 0)));
        this.LJLLI = new C85938Xo6(new C25848ACm(getString(R.string.pjs), 0));
        this.LJLLILLLL = new C85938Xo6(new C25848ACm(getString(R.string.q2k), 0));
        this.LJLLJ = new C85938Xo6(new C25848ACm(getString(R.string.pjx), 0));
        this.LLIFFJFJJ = new AEG(new AEB(getString(R.string.pjy)));
        this.LJLLL = new C85938Xo6(new C25848ACm(getString(R.string.pk3), 0));
        this.LLIIII = new C85938Xo6(new C25848ACm(getString(R.string.cp5), 0));
        this.LJZL = new C25860ACy(new C25859ACx(getString(R.string.n6b), new ACListenerS24S0101000_5(2, this, 1), false));
        this.LLII = new AEG(new AEB(getString(R.string.r14)));
        this.LJZI = new C85938Xo6(new C25848ACm(getString(R.string.ptg), 0));
        this.LJZ = new C85938Xo6(new C25848ACm(getString(R.string.r15), 0));
        this.LL = new C25860ACy(new C25859ACx(getString(R.string.mp), new ACListenerS32S0101000_15(4, this, 3), false));
        this.LLD = new C25860ACy(new C25859ACx(getString(R.string.ijm), new ACListenerS32S0101000_15(3, this, 13), e1.LIZ(31744, "mute_push_notification", true, false), AET.NORMAL, getString(R.string.ijl)));
        this.LLF = new C25860ACy(new C25859ACx(getString(R.string.hbd), new ACListenerS32S0101000_15(4, this, 18), true));
        C25851ACp c25851ACp = new C25851ACp(this.LJLILLLLZI);
        this.LJLJI = c25851ACp;
        c25851ACp.LIZ(this.LJLJJL);
        this.LJLJI.LIZ(this.LLD);
        this.LJLJI.LIZ(this.LLF);
        this.LJLJI.LIZ(this.LLFF);
        this.LJLJI.LIZ(this.LLFFF);
        this.LJLJI.LIZ(this.LJLJJLL);
        this.LJLJI.LIZ(this.LJLJL);
        this.LJLJI.LIZ(this.LJLJLJ);
        this.LJLJI.LIZ(this.LJLJLLL);
        this.LJLJI.LIZ(this.LJLL);
        this.LJLJI.LIZ(this.LJLJJI);
        this.LJLJI.LIZ(this.LLFII);
        this.LJLJI.LIZ(this.LJLLLL);
        this.LJLJI.LIZ(this.LJLLLLLL);
        this.LJLJI.LIZ(this.LJLZ);
        this.LJLJI.LIZ(this.LLFZ);
        this.LJLJI.LIZ(this.LJLLI);
        if (C52242Kes.LIZ()) {
            this.LJLJI.LIZ(this.LLI);
        }
        this.LJLJI.LIZ(this.LJLLILLLL);
        this.LJLJI.LIZ(this.LJLLJ);
        this.LJLJI.LIZ(this.LLIFFJFJJ);
        this.LJLJI.LIZ(this.LJLLL);
        this.LJLJI.LIZ(this.LLIIII);
        this.LJLJI.LIZ(this.LJZL);
        this.LJLJI.LIZ(this.LLII);
        this.LJLJI.LIZ(this.LJZI);
        this.LJLJI.LIZ(this.LJZ);
        this.LJLJI.LIZ(this.LL);
        C85938Xo6 c85938Xo6 = this.LJZI;
        if (C52242Kes.LIZ()) {
            string = getString(R.string.p_6);
        } else {
            string = getString(R.string.pth);
        }
        c85938Xo6.getClass();
        c85938Xo6.LJIIJ(new AqS68S1100000_15(c85938Xo6, string, 9));
        super.onViewCreated(view, bundle);
        this.LLIIIILZ = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.LLIIIL = new C81330Vvy();
        C252709vu c252709vu = this.LJLIL;
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, getString(R.string.qv1), new AObjectS52S0101000_7(1, this, 0));
        c252709vu.setNavActions(c235119Kp);
        this.LLIIIL.LIZIZ.observe(this, new AObserverS64S0101000_14(2, this, 3));
        this.LJLLL.LJIIIZ(false);
        this.LJZL.LJIIIZ(true);
        this.LLIIIL.LIZ(C40322Fs6.LIZJ(getContext()));
        vl(this.LJLJJLL, "digg_push");
        vl(this.LJLJL, "comment_push");
        vl(this.LJLJLJ, "follow_push");
        vl(this.LJLJLLL, "mention_push");
        vl(this.LJLL, "profile_viewer_push");
        vl(this.LJLJJI, "friend_upvote_push");
        vl(this.LJLLI, "follow_new_video_push");
        vl(this.LJLLILLLL, "general_upvote_push");
        vl(this.LJLLJ, "recommend_video_push");
        vl(this.LJLLL, "live_push");
        vl(this.LJLLLL, "im_push");
        vl(this.LLIIII, "live_inner_push");
        vl(this.LJZ, "other_channel");
        vl(this.LJZI, "friend_suggestions");
        vl(this.LJLZ, "im_push_preview_v2");
        this.LJLLLL.LJIILL(EF7.LIZIZ().getResources().getString(R.string.pjw));
        this.LJLLL.LJIILL(EF7.LIZIZ().getResources().getString(R.string.pk3));
        this.LJLLLLLL.LJIIIZ(false);
        if (!((Boolean) C53138KtK.LIZ.getValue()).booleanValue()) {
            this.LJLLILLLL.LJIIIZ(false);
        }
        if (C52293Kfh.LIZ()) {
            this.LLIIII.LJIILL(getContext().getString(R.string.brf));
            this.LLIIII.LJIIIZ(true);
        } else {
            this.LLIIII.LJIIIZ(false);
        }
        this.LJLZ.LJIIIZ(true);
        if (e1.LIZ(31744, "enable_email_notification", true, false)) {
            this.LL.LJIIIZ(true);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("page_name", "notification_setting_page");
            c188727au.LJIIIZ("exp_name", "email_notification_phase2");
            FMX.LJIIL("show_email_notification_setting", c188727au.LIZ);
        } else {
            this.LL.LJIIIZ(false);
        }
        this.LLF.LJIIIZ(C53215KuZ.LIZ());
        if (this.LLIIIZ == null) {
            this.LLIIIZ = C53097Ksf.LIZIZ.LIZIZ();
        }
        List<String> list = this.LLIIIZ;
        if (list != null) {
            AG5.LIZ(this.LJLJI, list);
            this.LLFII.LJIIIZ(false);
            this.LLFZ.LJIIIZ(false);
            this.LLIFFJFJJ.LJIIIZ(false);
        }
        PushSettings LJ = C85940Xo8.LIZIZ.LJ();
        if (LJ != null) {
            xl(LJ);
        }
        C85895XnP c85895XnP = new C85895XnP();
        this.LLIIIJ = c85895XnP;
        c85895XnP.LJLILLLLZI = this;
        c85895XnP.LJIILL(new Object[0]);
        C252709vu c252709vu2 = this.LJLIL;
        C235119Kp c235119Kp2 = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp2, getString(R.string.r0q), new AObjectS54S0101000_9(3, this, 0));
        c252709vu2.setNavActions(c235119Kp2);
        C85938Xo6 c85938Xo62 = this.LJLJJL;
        Context context = getContext();
        Objects.requireNonNull(context);
        c85938Xo62.LJIILL(context.getString(R.string.r0q));
        this.LLFF.LJIIL(getString(R.string.r0u));
        this.LLFF.LJIIIZ(false);
        this.LLFFF.LJIIL(getString(R.string.r0u));
        this.LLFFF.LJIIIZ(true);
        this.LJLJJLL.LJIILL(getContext().getString(R.string.r0v));
        this.LJLJL.LJIILL(getContext().getString(R.string.r0r));
        this.LJLJLJ.LJIILL(getContext().getString(R.string.r0t));
        this.LJLJLLL.LJIILL(getContext().getString(R.string.r0y));
        this.LLFII.LJIIL(getContext().getString(R.string.r0z));
        if (Z8A.LIZIZ.shouldShowProfileViewerPushItem()) {
            this.LJLL.LJIIIZ(true);
        } else {
            this.LJLL.LJIIIZ(false);
        }
        if (C7HZ.LIZ()) {
            this.LJLJJI.LJIIIZ(true);
            C85938Xo6 c85938Xo63 = this.LJLJJI;
            String LJFF = C86V.LJFF(C7HV.LIZIZ.LJIIJ(R.string.pue, R.string.q3j));
            o.LJIIIIZZ(LJFF, "getString(strId)");
            c85938Xo63.LJIILL(LJFF);
        } else {
            this.LJLJJI.LJIIIZ(false);
        }
        this.LJLLLL.LJIILL(getContext().getString(R.string.r0s));
        this.LLFZ.LJIIL(getString(R.string.r1_));
        this.LJLLI.LJIILL(getContext().getString(R.string.r1a));
        this.LJLLJ.LJIILL(getContext().getString(R.string.r1b));
        this.LLIFFJFJJ.LJIIL(getString(R.string.r0w));
        this.LJLLL.LJIILL(getContext().getString(R.string.r0x));
        C85938Xo6 c85938Xo64 = this.LJZI;
        SettingsManager.LIZLLL().getClass();
        c85938Xo64.LJIIIZ(SettingsManager.LIZ("show_friend_suggestions", false));
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.c9, typedValue, true);
        view.setBackgroundColor(typedValue.data);
        this.LJLIL.setNavBackground(typedValue.data);
        this.LJLIL.LJIILJJIL(false);
        this.LJLJI.LIZLLL();
    }

    public final void vl(C85938Xo6 c85938Xo6, String str) {
        c85938Xo6.getClass();
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, str, 46));
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, (View.OnClickListener) new ACListenerS40S0300000_15(this, c85938Xo6, 1), 45));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cku, viewGroup, false);
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
