package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AEB;
import X.AEG;
import X.AET;
import X.AG5;
import X.AV9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C235119Kp;
import X.C252709vu;
import X.C25620zW;
import X.C25848ACm;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C26037AJt;
import X.C26039AJv;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C40322Fs6;
import X.C52242Kes;
import X.C52293Kfh;
import X.C53040Krk;
import X.C53097Ksf;
import X.C53138KtK;
import X.C73893SzJ;
import X.C73969T1h;
import X.C75792yF;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78997UzR;
import X.C7F0;
import X.C7HV;
import X.C7HZ;
import X.C81330Vvy;
import X.C85895XnP;
import X.C85897XnR;
import X.C85926Xnu;
import X.C85938Xo6;
import X.C85940Xo8;
import X.C85946XoE;
import X.C85948XoG;
import X.C85962XoU;
import X.C86V;
import X.C90903hW;
import X.DialogC81627W1v;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC26038AJu;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import X.KL2;
import X.RBX;
import X.SYL;
import X.X1D;
import X.Z8A;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS31S0101000_14;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS40S0300000_15;
import Y.AObjectS49S0101000_4;
import Y.AObjectS52S0101000_7;
import Y.AObserverS64S0101000_14;
import Y.AfS36S0101000_5;
import Y.IDCListenerS10S0101000;
import Y.IDRunnableS6S0101000;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class PushSettingManagerFragmentSecondVersion extends AmeBaseFragment implements InterfaceC85901XnV, InterfaceC85903XnX, InterfaceC26038AJu {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C252709vu LJLIL;
    public C85938Xo6 LJLILLLLZI;
    public C25860ACy LJLJI;
    public C25860ACy LJLJJI;
    public C25860ACy LJLJJL;
    public C85938Xo6 LJLJJLL;
    public C85938Xo6 LJLJL;
    public SYL LJLJLJ;
    public C25851ACp LJLJLLL;
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
    public C85938Xo6 LJZL;
    public C85938Xo6 LL;
    public C85938Xo6 LLD;
    public C85938Xo6 LLF;
    public C85938Xo6 LLFF;
    public C85938Xo6 LLFFF;
    public C85938Xo6 LLFII;
    public AEG LLFZ;
    public AEG LLI;
    public AEG LLIFFJFJJ;
    public AEG LLII;
    public AEG LLIIII;
    public AEG LLIIIILZ;
    public AEG LLIIIJ;
    public AEG LLIIIL;
    public AEG LLIIIZ;
    public C85938Xo6 LLIIJI;
    public C25860ACy LLIIJLIL;
    public C25860ACy LLIIL;
    public C85895XnP LLIILII;
    public C81330Vvy LLIILZL;
    public C73893SzJ<C85938Xo6> LLIL;
    public DialogC81627W1v LLILL;
    public List<String> LLILLIZIL;
    public C85897XnR LLILLJJLI;
    public String LLILLL;
    public C26039AJv LLILZ;
    public PackageManager LLILZLL;
    public NotificationManager LLIZ;
    public JSONObject LLJI;
    public final List<C85938Xo6> LLIIZ = new ArrayList();
    public boolean LLILII = false;
    public boolean LLILIL = false;
    public final C85948XoG LLILZIL = new C85948XoG();
    public Keva LLIZLLLIL = null;
    public String LLJ = "";

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    @Override // X.InterfaceC26038AJu
    public final void CX() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    public final void Gl() {
        boolean z;
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = Keva.getRepo("need_sync");
        }
        String string = this.LLIZLLLIL.getString("need_sync_channel_name", "");
        StringBuilder LIZIZ = C25620zW.LIZIZ("1: ", string, " v ");
        if (this.LLJI != null) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ.append(z);
        X1D.LIZIZ(LIZIZ);
        if (this.LLJI != null && !TextUtils.isEmpty(string) && vl(string)) {
            Iterator it = ((ArrayList) this.LLIIZ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C85938Xo6 c85938Xo6 = (C85938Xo6) it.next();
                C85946XoE c85946XoE = (C85946XoE) ((C25848ACm) c85938Xo6.LJLIL).LLFF;
                if (c85946XoE != null && TextUtils.equals(string, c85946XoE.LIZ)) {
                    C85946XoE c85946XoE2 = (C85946XoE) ((C25848ACm) c85938Xo6.LJLIL).LLFF;
                    if (c85946XoE2 != null && !c85946XoE2.LIZIZ) {
                        c85938Xo6.LJIILIIL(true);
                        C85940Xo8.LIZIZ.LIZ(1, c85946XoE2.LIZ);
                        c85946XoE2.LIZIZ = true;
                        try {
                            this.LLJI.put(c85946XoE2.LIZ, 1);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        if (this.LLIL == null) {
                            C73893SzJ<C85938Xo6> c73893SzJ = new C73893SzJ<>();
                            this.LLIL = c73893SzJ;
                            c73893SzJ.LJIIJJI(400L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(5, this, 37));
                        }
                        this.LLIL.onNext(c85938Xo6);
                    }
                }
            }
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = Keva.getRepo("need_sync");
            }
            this.LLIZLLLIL.storeString("need_sync_channel_name", "");
        }
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    public final void Hl() {
        String str;
        try {
            C40322Fs6.LJ(getContext());
        } catch (Exception unused) {
            C16880lQ.LIZJ(getContext(), new Intent("android.settings.SETTINGS"));
        }
        C188727au c188727au = new C188727au();
        if (C40322Fs6.LIZJ(getContext())) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("notifications_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIILII.LIZIZ();
        this.LLILZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLIILZL.LIZ(C40322Fs6.LIZJ(getContext()));
        boolean LIZJ = C40322Fs6.LIZJ(getContext());
        this.LJLL.LJIILJJIL(LIZJ);
        this.LJLJJLL.LJIILJJIL(LIZJ);
        this.LJLLI.LJIILJJIL(LIZJ);
        this.LJLLILLLL.LJIILJJIL(LIZJ);
        this.LJLLJ.LJIILJJIL(LIZJ);
        this.LJLLL.LJIILJJIL(LIZJ);
        this.LJLJL.LJIILJJIL(LIZJ);
        this.LJLLLL.LJIILJJIL(LIZJ);
        this.LJLLLLLL.LJIILJJIL(LIZJ);
        this.LJLZ.LJIILJJIL(LIZJ);
        this.LJZ.LJIILJJIL(LIZJ);
        this.LJZI.LJIILJJIL(LIZJ);
        this.LJZL.LJIILJJIL(LIZJ);
        this.LLF.LJIILJJIL(LIZJ);
        this.LLIIJLIL.LJIIL(LIZJ);
        this.LLIIJI.LJIILJJIL(LIZJ);
        this.LLD.LJIILJJIL(LIZJ);
        this.LLFII.LJIILJJIL(LIZJ);
        this.LJLJJL.LJIIL(LIZJ);
        this.LLFF.LJIILJJIL(LIZJ);
        if (this.LLJI != null) {
            Iterator it = ((ArrayList) this.LLIIZ).iterator();
            while (it.hasNext()) {
                C85938Xo6 c85938Xo6 = (C85938Xo6) it.next();
                try {
                    Il(JSONObjectProtectorUtils.getInt(this.LLJI, ((C85946XoE) ((C25848ACm) c85938Xo6.LJLIL).LLFF).LIZ), c85938Xo6);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        Gl();
        if (this.LLILIL) {
            this.LLILIL = false;
            if (!TextUtils.isEmpty(((RBX) HG3.LJIILL()).getCurUser().getEmail())) {
                xl();
            }
        }
    }

    public final void xl() {
        if (getContext() != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://webview");
            buildRoute.withParam(UriProtector.parse(C78997UzR.LIZ()));
            buildRoute.open();
        }
    }

    public static boolean wl(Context context) {
        if (C40322Fs6.LIZJ(context)) {
            return true;
        }
        C85962XoU.LJII(context, true, null, true);
        return false;
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        try {
            this.LLJI = new JSONObject(C75792yF.LIZJ(pushSettings));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        Jl(pushSettings);
        C85940Xo8.LIZIZ.LIZJ(pushSettings);
        if (GuideOutPushExperiment.LIZIZ()) {
            boolean z = true;
            if (pushSettings.friendsOnlyPush != 1) {
                z = false;
            }
            Dl(z);
        }
        Gl();
    }

    public final void Dl(boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(getString(R.string.t6l));
            String LIZIZ = X1D.LIZIZ(LIZ);
            AEG aeg = this.LLFZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getString(R.string.r0u));
            LIZ2.append(LIZIZ);
            aeg.LJIIL(X1D.LIZIZ(LIZ2));
            AEG aeg2 = this.LLI;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(getString(R.string.r0u));
            LIZ3.append(LIZIZ);
            aeg2.LJIIL(X1D.LIZIZ(LIZ3));
            AEG aeg3 = this.LLIFFJFJJ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(getString(R.string.r0z));
            LIZ4.append(LIZIZ);
            aeg3.LJIIL(X1D.LIZIZ(LIZ4));
            AEG aeg4 = this.LLII;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(getString(R.string.r1_));
            LIZ5.append(LIZIZ);
            aeg4.LJIIL(X1D.LIZIZ(LIZ5));
            AEG aeg5 = this.LLIIIILZ;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(getString(R.string.r0w));
            LIZ6.append(LIZIZ);
            aeg5.LJIIL(X1D.LIZIZ(LIZ6));
            AEG aeg6 = this.LLIIIJ;
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(getString(R.string.r10));
            LIZ7.append(LIZIZ);
            aeg6.LJIIL(X1D.LIZIZ(LIZ7));
            AEG aeg7 = this.LLIIIL;
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(getString(R.string.ta5));
            LIZ8.append(LIZIZ);
            aeg7.LJIIL(X1D.LIZIZ(LIZ8));
            AEG aeg8 = this.LLIIIZ;
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append(getString(R.string.qaz));
            LIZ9.append(LIZIZ);
            aeg8.LJIIL(X1D.LIZIZ(LIZ9));
            return;
        }
        this.LLFZ.LJIIL(getString(R.string.r0u));
        this.LLI.LJIIL(getString(R.string.r0u));
        this.LLIFFJFJJ.LJIIL(getString(R.string.r0z));
        this.LLII.LJIIL(getString(R.string.r1_));
        this.LLIIIILZ.LJIIL(getString(R.string.r0w));
        this.LLIIIJ.LJIIL(getString(R.string.r10));
        this.LLIIIL.LJIIL(getString(R.string.ta5));
        this.LLIIIZ.LJIIL(getString(R.string.qaz));
    }

    public final void Jl(PushSettings pushSettings) {
        if (this.LLILII) {
            pushSettings.recommendVideoPush = 0;
            pushSettings.liveInnerPush = 0;
            pushSettings.otherChannel = 0;
        }
        Il(pushSettings.diggPush, this.LJLL);
        Il(pushSettings.friendsOnlyPush, this.LJLJJLL);
        Il(pushSettings.commentPush, this.LJLLI);
        Il(pushSettings.followPush, this.LJLLILLLL);
        Il(pushSettings.mentionPush, this.LJLLJ);
        Il(pushSettings.profileViewerPush, this.LJLLL);
        Il(pushSettings.friendUpvotePush, this.LJLJL);
        Il(pushSettings.followNewVideoPush, this.LJLLLL);
        Il(pushSettings.acqVideoPush, this.LJLLLLLL);
        Il(pushSettings.upvoteVideoPush, this.LJLZ);
        Il(pushSettings.recommendVideoPush, this.LJZ);
        Il(pushSettings.livePush, this.LJZI);
        Il(pushSettings.imPush, this.LJZL);
        Il(pushSettings.screenTimePush, this.LLFII);
        Il(pushSettings.otherChannel, this.LLF);
        Il(pushSettings.friendSuggestion, this.LLFF);
        Il(pushSettings.liveInnerPush, this.LLIIJI);
        Il(pushSettings.pushMessagePreviewText, this.LLD);
        Il(pushSettings.naturalDisasterForecastsPush, this.LLFFF);
        NotificationManagerServiceImpl.LJIIIZ().LJ(Integer.valueOf(pushSettings.liveInnerPush));
        Gl();
    }

    @Override // X.InterfaceC26038AJu
    public final void fD(boolean z) {
        if (z) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getString(R.string.iv8));
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LJIIIIZZ(R.string.im9);
        c26045AKb2.LJIIJ();
    }

    @Override // X.InterfaceC26038AJu
    public final void uj0(FetchPushOffReasonsResp fetchPushOffReasonsResp) {
        if (fetchPushOffReasonsResp.data != null) {
            this.LLILZIL.LIZ.storeLong("key_next_push_off_dialog_showtime", System.currentTimeMillis() + (r0.interval * 1000));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "push_setting_page");
            c188727au.LJIIIZ("label", this.LLILLL);
            FMX.LJIIL("push_feedback_pop_up_show", c188727au.LIZ);
            C26037AJt.LIZ(mo49getActivity(), new AV9("settings_page", "manual", null, "", ""), this.LLILLL, fetchPushOffReasonsResp.data).LJLJJI = new WeakReference<>(this);
        }
    }

    public final boolean vl(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.LLIZ.getNotificationChannel(C85926Xnu.LIZJ(str));
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void Al(C85938Xo6 c85938Xo6, String str) {
        C85946XoE c85946XoE = new C85946XoE(str);
        c85938Xo6.getClass();
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, c85946XoE, 46));
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, (View.OnClickListener) new ACListenerS40S0300000_15(this, c85938Xo6, c85946XoE, 5), 45));
        ((ArrayList) this.LLIIZ).add(c85938Xo6);
    }

    public final void Il(int i, C85938Xo6 c85938Xo6) {
        boolean z;
        C85946XoE c85946XoE = (C85946XoE) ((C25848ACm) c85938Xo6.LJLIL).LLFF;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        c85946XoE.LIZIZ = z;
        boolean vl = vl(c85946XoE.LIZ);
        c85946XoE.LIZJ = vl;
        if (c85946XoE.LIZIZ && vl) {
            z2 = true;
        }
        c85938Xo6.LJIILIIL(z2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int i;
        this.LJLIL = (C252709vu) view.findViewById(R.id.la4);
        this.LJLJLJ = (SYL) view.findViewById(R.id.igb);
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        this.LJLJLJ.setPadding(0, LIZJ, 0, LIZJ);
        this.LJLJI = new C25860ACy(new C25859ACx(getString(R.string.hbe), new ACListenerS32S0101000_15(2, this, 10)));
        this.LJLJJI = new C25860ACy(new C25859ACx(getString(R.string.hbd), new ACListenerS24S0101000_5(3, this, 10), true));
        this.LJLILLLLZI = new C85938Xo6(new C25848ACm(false, getString(R.string.pjt), new ACListenerS24S0101000_5(3, this, 2)));
        this.LJLJJLL = new C85938Xo6(new C25848ACm(getString(R.string.t6l), 0));
        this.LJLL = new C85938Xo6(new C25848ACm(getString(R.string.pjq), 0));
        this.LJLLI = new C85938Xo6(new C25848ACm(getString(R.string.pjp), "item_push_comment"));
        this.LJLLILLLL = new C85938Xo6(new C25848ACm(getString(R.string.pjr), "item_push_follow"));
        this.LJLLJ = new C85938Xo6(new C25848ACm(getString(R.string.pjo), 0));
        this.LJLLL = new C85938Xo6(new C25848ACm(getString(R.string.pgu)));
        this.LJLJL = new C85938Xo6(new C25848ACm(getString(R.string.pue)));
        this.LJLLLL = new C85938Xo6(new C25848ACm(getString(R.string.pjs), 0));
        this.LJLLLLLL = new C85938Xo6(new C25848ACm(getString(R.string.r0p), 0));
        this.LJLZ = new C85938Xo6(new C25848ACm(getString(R.string.q2k), 0));
        this.LJZ = new C85938Xo6(new C25848ACm(getString(R.string.pjx), 0));
        this.LJZI = new C85938Xo6(new C25848ACm(getString(R.string.pk3), 0));
        this.LLFII = new C85938Xo6(new C25848ACm(getString(R.string.qay), 0));
        this.LJZL = new C85938Xo6(new C25848ACm(getString(R.string.pjw), 0));
        this.LL = new C85938Xo6(new C25848ACm(getString(R.string.cp3)));
        this.LLD = new C85938Xo6(new C25848ACm(getString(R.string.er5)));
        this.LLF = new C85938Xo6(new C25848ACm(getString(R.string.r15), 0));
        this.LLFF = new C85938Xo6(new C25848ACm(getString(R.string.ptg), 0));
        this.LLFFF = new C85938Xo6(new C25848ACm(getString(R.string.r11), 0));
        this.LLFZ = new AEG(new AEB(getString(R.string.pjz)));
        this.LLI = new AEG(new AEB((CharSequence) getString(R.string.pjz), false));
        this.LLIFFJFJJ = new AEG(new AEB(getString(R.string.pk0)));
        this.LLII = new AEG(new AEB(getString(R.string.pk1)));
        this.LLIIII = new AEG(new AEB(getString(R.string.p_7), new IDCListenerS10S0101000(6, this, 7)));
        this.LLIIIILZ = new AEG(new AEB(getString(R.string.pjy)));
        this.LLIIIZ = new AEG(new AEB(getString(R.string.qaz)));
        this.LLIIIL = new AEG(new AEB(getString(R.string.ta5)));
        this.LLIIIJ = new AEG(new AEB(getString(R.string.r10)));
        this.LLIIJI = new C85938Xo6(new C25848ACm(getString(R.string.cp5), 0));
        this.LLIIJLIL = new C25860ACy(new C25859ACx(getString(R.string.n6b), new IDCListenerS10S0101000(4, this, 8), false));
        this.LLIIL = new C25860ACy(new C25859ACx(getString(R.string.mp), new ACListenerS31S0101000_14(1, this, 4), false));
        this.LJLJJL = new C25860ACy(new C25859ACx(getString(R.string.ijm), new ACListenerS21S0101000_2(2, this, 9), e1.LIZ(31744, "mute_push_notification", true, false), AET.NORMAL, getString(R.string.ijl)));
        C25851ACp c25851ACp = new C25851ACp(this.LJLJLJ);
        this.LJLJLLL = c25851ACp;
        c25851ACp.LIZ(this.LJLILLLLZI);
        this.LJLJLLL.LIZ(this.LJLJI);
        this.LJLJLLL.LIZ(this.LJLJJI);
        this.LJLJLLL.LIZ(this.LJLJJLL);
        this.LJLJLLL.LIZ(this.LJLJJL);
        this.LJLJLLL.LIZ(this.LLFZ);
        this.LJLJLLL.LIZ(this.LLI);
        this.LJLJLLL.LIZ(this.LJLL);
        this.LJLJLLL.LIZ(this.LJLLI);
        this.LJLJLLL.LIZ(this.LJLLILLLL);
        this.LJLJLLL.LIZ(this.LJLLJ);
        this.LJLJLLL.LIZ(this.LJLLL);
        this.LJLJLLL.LIZ(this.LJLJL);
        this.LJLJLLL.LIZ(this.LLIFFJFJJ);
        this.LJLJLLL.LIZ(this.LJZL);
        this.LJLJLLL.LIZ(this.LL);
        this.LJLJLLL.LIZ(this.LLD);
        this.LJLJLLL.LIZ(this.LLII);
        this.LJLJLLL.LIZ(this.LJLLLL);
        if (C52242Kes.LIZ()) {
            this.LJLJLLL.LIZ(this.LLIIII);
        }
        this.LJLJLLL.LIZ(this.LJLLLLLL);
        this.LJLJLLL.LIZ(this.LJLZ);
        this.LJLJLLL.LIZ(this.LJZ);
        this.LJLJLLL.LIZ(this.LLIIIILZ);
        this.LJLJLLL.LIZ(this.LJZI);
        this.LJLJLLL.LIZ(this.LLIIJI);
        this.LJLJLLL.LIZ(this.LLIIJLIL);
        this.LJLJLLL.LIZ(this.LLIIIJ);
        this.LJLJLLL.LIZ(this.LLFFF);
        this.LJLJLLL.LIZ(this.LLIIIZ);
        this.LJLJLLL.LIZ(this.LLFII);
        this.LJLJLLL.LIZ(this.LLIIIL);
        this.LJLJLLL.LIZ(this.LLFF);
        this.LJLJLLL.LIZ(this.LLF);
        this.LJLJLLL.LIZ(this.LLIIL);
        C85938Xo6 c85938Xo6 = this.LLFF;
        if (C52242Kes.LIZ()) {
            string = getString(R.string.p_6);
        } else {
            string = getString(R.string.pth);
        }
        c85938Xo6.getClass();
        c85938Xo6.LJIIJ(new AqS68S1100000_15(c85938Xo6, string, 9));
        super.onViewCreated(view, bundle);
        this.LLIZ = (NotificationManager) C16880lQ.LLILL(EF7.LIZIZ(), "notification");
        this.LLILII = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.LLIILZL = new C81330Vvy();
        C252709vu c252709vu = this.LJLIL;
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, getString(R.string.qv1), new AObjectS49S0101000_4(3, this, 1));
        c252709vu.setNavActions(c235119Kp);
        C25860ACy c25860ACy = this.LJLJI;
        c25860ACy.getClass();
        c25860ACy.LJIIJ(new AqS47S0110000_4(c25860ACy, true, 11));
        C25860ACy c25860ACy2 = this.LJLJJI;
        c25860ACy2.getClass();
        c25860ACy2.LJIIJ(new AqS47S0110000_4(c25860ACy2, true, 11));
        this.LLIILZL.LIZIZ.observe(this, new AObserverS64S0101000_14(2, this, 11));
        this.LJZI.LJIIIZ(false);
        this.LLIIJLIL.LJIIIZ(true);
        C25860ACy c25860ACy3 = this.LLIIJLIL;
        c25860ACy3.getClass();
        c25860ACy3.LJIIJ(new AqS47S0110000_4(c25860ACy3, true, 11));
        Al(this.LJLL, "digg_push");
        Al(this.LJLJJLL, "friends_only_push");
        Al(this.LJLLI, "comment_push");
        Al(this.LJLLILLLL, "follow_push");
        Al(this.LJLLJ, "mention_push");
        Al(this.LJLLL, "profile_viewer_push");
        Al(this.LJLJL, "friend_upvote_push");
        Al(this.LJLLLL, "follow_new_video_push");
        Al(this.LJLLLLLL, "acq_video_push");
        Al(this.LJLZ, "general_upvote_push");
        Al(this.LJZ, "recommend_video_push");
        Al(this.LJZI, "live_push");
        Al(this.LJZL, "im_push");
        Al(this.LLF, "other_channel");
        Al(this.LLIIJI, "live_inner_push");
        Al(this.LLFF, "friend_suggestions");
        Al(this.LLD, "im_push_preview_v2");
        Al(this.LLFFF, "natural_disaster_forecasts_push");
        Al(this.LLFII, "screen_time_push");
        this.LJZL.LJIILL(EF7.LIZIZ().getResources().getString(R.string.pjw));
        this.LJZI.LJIILL(EF7.LIZIZ().getResources().getString(R.string.pk3));
        this.LL.LJIIIZ(false);
        if (!((Boolean) C53040Krk.LIZ.getValue()).booleanValue()) {
            this.LJLLLLLL.LJIIIZ(false);
        }
        if (!((Boolean) C53138KtK.LIZ.getValue()).booleanValue()) {
            this.LJLZ.LJIIIZ(false);
        }
        if (C52293Kfh.LIZ()) {
            this.LLIIJI.LJIIIZ(true);
        } else {
            this.LLIIJI.LJIIIZ(false);
        }
        this.LLD.LJIIIZ(true);
        if (!GuideOutPushExperiment.LIZIZ()) {
            this.LJLJJLL.LJIIIZ(false);
        }
        if (e1.LIZ(31744, "enable_email_notification", true, false)) {
            this.LLIIL.LJIIIZ(true);
            C25860ACy c25860ACy4 = this.LLIIL;
            c25860ACy4.getClass();
            c25860ACy4.LJIIJ(new AqS47S0110000_4(c25860ACy4, true, 11));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("page_name", "notification_setting_page");
            c188727au.LJIIIZ("exp_name", "email_notification_phase2");
            FMX.LJIIL("show_email_notification_setting", c188727au.LIZ);
        } else {
            this.LLIIL.LJIIIZ(false);
        }
        if (this.LLILLIZIL == null) {
            this.LLILLIZIL = C53097Ksf.LIZIZ.LIZIZ();
        }
        List<String> list = this.LLILLIZIL;
        if (list != null) {
            AG5.LIZ(this.LJLJLLL, list);
            this.LLIFFJFJJ.LJIIIZ(false);
            this.LLII.LJIIIZ(false);
            this.LLIIIILZ.LJIIIZ(false);
        }
        PushSettings LJ = C85940Xo8.LIZIZ.LJ();
        if (LJ != null) {
            Jl(LJ);
        }
        C85895XnP c85895XnP = new C85895XnP();
        this.LLIILII = c85895XnP;
        c85895XnP.LJLILLLLZI = this;
        c85895XnP.LJIILL(new Object[0]);
        C85897XnR c85897XnR = new C85897XnR();
        this.LLILLJJLI = c85897XnR;
        c85897XnR.LJLILLLLZI = this;
        c85897XnR.LJLJI = false;
        C26039AJv c26039AJv = new C26039AJv();
        this.LLILZ = c26039AJv;
        c26039AJv.LJLILLLLZI = this;
        C252709vu c252709vu2 = this.LJLIL;
        C235119Kp c235119Kp2 = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp2, getString(R.string.hbf), new AObjectS52S0101000_7(0, this, 16));
        c252709vu2.setNavActions(c235119Kp2);
        this.LJLILLLLZI.LJIILL(getContext().getString(R.string.r0q));
        this.LLFZ.LJIIIZ(false);
        this.LLI.LJIIIZ(true);
        this.LJLL.LJIILL(getContext().getString(R.string.r0v));
        this.LJLLI.LJIILL(getContext().getString(R.string.r0r));
        this.LJLLILLLL.LJIILL(getContext().getString(R.string.r0t));
        C85938Xo6 c85938Xo62 = this.LJLLJ;
        Context context = getContext();
        int LIZIZ = C7F0.LIZIZ();
        if (1 <= LIZIZ && LIZIZ < 5) {
            i = R.string.i2n;
        } else {
            i = R.string.r0y;
        }
        c85938Xo62.LJIILL(context.getString(i));
        if (Z8A.LIZIZ.shouldShowProfileViewerPushItem()) {
            this.LJLLL.LJIIIZ(true);
        } else {
            this.LJLLL.LJIIIZ(false);
        }
        if (C7HZ.LIZ()) {
            this.LJLJL.LJIIIZ(true);
            C85938Xo6 c85938Xo63 = this.LJLJL;
            String LJFF = C86V.LJFF(C7HV.LIZIZ.LJIIJ(R.string.pue, R.string.q3j));
            o.LJIIIIZZ(LJFF, "getString(strId)");
            c85938Xo63.LJIILL(LJFF);
        } else {
            this.LJLJL.LJIIIZ(false);
        }
        this.LJZL.LJIILL(getContext().getString(R.string.r0s));
        this.LJLILLLLZI.LJIIIZ(false);
        this.LJLJI.LJIIIZ(true);
        this.LLFZ.LJIIIZ(true);
        this.LLI.LJIIIZ(false);
        this.LLIIJI.LJIIIZ(false);
        this.LJLLLL.LJIILL(getContext().getString(R.string.r1a));
        this.LJZ.LJIILL(getContext().getString(R.string.r1b));
        this.LJZI.LJIILL(getContext().getString(R.string.r0x));
        this.LLIIJI.LJIILL(getContext().getString(R.string.brf));
        this.LLFII.LJIILL(getContext().getString(R.string.qay));
        this.LLIIIZ.LJIIL(getContext().getString(R.string.qaz));
        Dl(false);
        C85938Xo6 c85938Xo64 = this.LLFF;
        SettingsManager.LIZLLL().getClass();
        c85938Xo64.LJIIIZ(SettingsManager.LIZ("show_friend_suggestions", false));
        if (!C19N.LJ("show_natural_disaster_forecasts_push", false)) {
            this.LLIIIJ.LJIIIZ(false);
            this.LLFFF.LJIIIZ(false);
        } else {
            this.LLIIIJ.LJIIIZ(true);
            this.LJLLLL.LJIIIZ(true);
        }
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.c9, typedValue, true);
        view.setBackgroundColor(typedValue.data);
        this.LJLIL.setNavBackground(typedValue.data);
        this.LJLIL.LJIILJJIL(false);
        this.LJLJLLL.LIZLLL();
        view.post(new IDRunnableS6S0101000(7, this, 0));
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
