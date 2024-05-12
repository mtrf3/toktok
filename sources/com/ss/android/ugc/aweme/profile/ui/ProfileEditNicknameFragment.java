package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1FJ;
import X.C221018lt;
import X.C233989Gg;
import X.C234019Gj;
import X.C234029Gk;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C237939Vl;
import X.C238209Wm;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C252709vu;
import X.C26045AKb;
import X.C26227ARb;
import X.C29S;
import X.C38333F2r;
import X.C3C5;
import X.C44384HbQ;
import X.C5S1;
import X.C62822Ol8;
import X.C64799Pbv;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C8IC;
import X.C90903hW;
import X.C9KF;
import X.C9VI;
import X.C9VL;
import X.C9WB;
import X.C9Y4;
import X.EF7;
import X.HG3;
import X.InterfaceC252739vx;
import X.InterfaceC26189APp;
import X.InterfaceC64592gB;
import X.JF3;
import X.RBX;
import X.T16;
import X.UC0;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.AfS53S0100000_1;
import Y.IDObjectS177S0100000_4;
import Y.IDhS97S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProfileEditNicknameFragment extends ProfileEditInputFragment implements InterfaceC26189APp {
    public static final /* synthetic */ int LLIILII = 0;
    public boolean LJLLLLLL;
    public C9VL LJLZ;
    public final User LJZ;
    public final int LJZI;
    public final int LJZL;
    public final int LL;
    public final long LLD;
    public final boolean LLF;
    public boolean LLFF;
    public final UserPresenter LLFFF;
    public final C62822Ol8 LLFII;
    public TuxTextView LLFZ;
    public EditText LLI;
    public TuxIconView LLIFFJFJJ;
    public TuxTextView LLII;
    public C73305Spp LLIIII;
    public TuxTextView LLIIIILZ;
    public C8IC LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C73318Sq2 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public C237939Vl LLIIJLIL;
    public final Map<Integer, View> LLIIL = new LinkedHashMap();
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public String LJLLJ = "";
    public final C73849Syb<Object> LJLLL = new C73849Syb<>();
    public final C73318Sq2 LJLLLL = new C73318Sq2();

    public final void Wl() {
        int i;
        int i2;
        EditText editText = this.LLI;
        if (editText != null) {
            boolean Hl = Hl(editText, 30);
            this.LJLLLLLL = Hl;
            if (Hl) {
                this.LJLLL.onNext("");
            }
            if (Rl()) {
                TextView Il = Il();
                if (this.LJLLLLLL) {
                    i = 0;
                } else {
                    i = 8;
                }
                Il.setVisibility(i);
                if (this.LJLLLLLL) {
                    i2 = R.drawable.bx2;
                } else {
                    i2 = R.drawable.bx3;
                }
                editText.setBackgroundResource(i2);
                return;
            }
            ProfileEditInputFragment.Gl(this, this.LJLLLLLL, editText.length(), 30, false, 8, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIL;
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

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0 != null ? r0.getEnterpriseVerifyReason() : null, "") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileEditNicknameFragment() {
        /*
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7.LLIIL = r0
            r7.<init>()
            java.lang.String r6 = ""
            r7.LJLL = r6
            r7.LJLLI = r6
            r7.LJLLILLLL = r6
            r7.LJLLJ = r6
            X.Syb r0 = new X.Syb
            r0.<init>()
            r7.LJLLL = r0
            X.Sq2 r0 = new X.Sq2
            r0.<init>()
            r7.LJLLLL = r0
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            r5 = 0
            if (r0 == 0) goto L3e
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
        L2f:
            r7.LJZ = r0
            r4 = 0
            if (r0 == 0) goto L3c
            int r0 = r0.getNickNameModifyTs()
        L38:
            r7.LJZI = r0
            r2 = 7
            goto L40
        L3c:
            r0 = 0
            goto L38
        L3e:
            r0 = r5
            goto L2f
        L40:
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "nickname_frequency_interval_days"
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            int r2 = com.bytedance.ies.abmock.SettingsManager.LJ(r0, r2)     // Catch: java.lang.Throwable -> L4d
        L4d:
            r7.LJZL = r2
            int r1 = r7.LJZI
            r0 = 86400(0x15180, float:1.21072E-40)
            int r2 = r2 * r0
            int r2 = r2 + r1
            r7.LL = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            r7.LLD = r2
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.LJZ
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r0.getCustomVerify()
        L6a:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r6)
            r1 = 1
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.LJZ
            if (r0 == 0) goto L79
            java.lang.String r5 = r0.getEnterpriseVerifyReason()
        L79:
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r6)
            if (r0 != 0) goto L80
        L7f:
            r4 = 1
        L80:
            r7.LLF = r4
            r7.LLFF = r1
            com.ss.android.ugc.aweme.profile.presenter.UserPresenter r1 = new com.ss.android.ugc.aweme.profile.presenter.UserPresenter
            X.AOq r0 = X.EnumC26164AOq.PROFILE
            int r0 = r0.getValue()
            r1.<init>(r0)
            r7.LLFFF = r1
            X.9VH r0 = X.C9VH.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r7.LLFII = r0
            X.9VS r0 = X.C9VS.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r7.LLIIIL = r0
            X.Sq2 r0 = new X.Sq2
            r0.<init>()
            r7.LLIIIZ = r0
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 696(0x2b8, float:9.75E-43)
            r1.<init>(r7, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r7.LLIIJI = r0
            return
        Lb6:
            r0 = r5
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final void Ml() {
        C9VL c9vl = this.LJLZ;
        if (c9vl != null) {
            c9vl.LIZ(Ql(), this.LLIIJLIL);
        }
    }

    public final void Ol() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.LJLLILLLL)) {
            str = this.LJLLILLLL;
        } else {
            str = "click_save";
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("enter_from");
        }
        C244329iO c244329iO = new C244329iO(str, C9WB.NICKNAME);
        c244329iO.LIZLLL = this.LJLLJ;
        c244329iO.LIZJ = "edit_profile_page";
        if (this.LJZI == 0) {
            z = true;
        } else {
            z = false;
        }
        c244329iO.LJFF = Boolean.valueOf(z);
        C244309iM.LJ(new C244319iN(c244329iO));
        this.LLFFF.updateNickName(Ql());
        C73305Spp c73305Spp = this.LLIIII;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LLIIII;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        LJJJI();
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            c252709vu.LJIJ("cancel", C234019Gj.LJLIL);
        }
        EditText editText = this.LLI;
        if (editText != null) {
            editText.setTextColor(C44384HbQ.LJJJJZ(R.color.cn));
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        }
        TuxIconView tuxIconView = this.LLIFFJFJJ;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setEnabled(false);
    }

    public final String Ql() {
        Editable editable;
        EditText editText = this.LLI;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        return String.valueOf(editable);
    }

    public final boolean Rl() {
        return ((Boolean) this.LLFII.getValue()).booleanValue();
    }

    public final boolean Sl() {
        if (this.LJZI == 0 || this.LLD >= this.LL) {
            return true;
        }
        return false;
    }

    public final AbstractC234519Ih Tl() {
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "save";
        String string = getString(R.string.fkl);
        o.LJIIIIZZ(string, "getString(R.string.edit_profile_save)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9VR
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                ViewParent viewParent;
                ViewGroup viewGroup;
                ProfileEditNicknameFragment profileEditNicknameFragment = ProfileEditNicknameFragment.this;
                if (s.LJZI(profileEditNicknameFragment.Ql()).toString().length() > 0) {
                    KeyboardUtils.LIZIZ(profileEditNicknameFragment.LLI);
                    if (((Boolean) profileEditNicknameFragment.LLIIJI.getValue()).booleanValue()) {
                        profileEditNicknameFragment.Vl();
                        return;
                    }
                    if (!((ProfileNameSyncService) profileEditNicknameFragment.LLIIIL.getValue()).LIZIZ()) {
                        profileEditNicknameFragment.Vl();
                        return;
                    }
                    C8IC c8ic = profileEditNicknameFragment.LLIIIJ;
                    if (c8ic == null) {
                        View view = profileEditNicknameFragment.getView();
                        if (view != null) {
                            viewParent = view.getParent();
                        } else {
                            viewParent = null;
                        }
                        if (viewParent instanceof ViewGroup) {
                            viewGroup = (ViewGroup) viewParent;
                        } else {
                            viewGroup = null;
                        }
                        Context context = profileEditNicknameFragment.getContext();
                        if (context != null && viewGroup != null) {
                            C8IC c8ic2 = new C8IC(context, null, 6);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 17;
                            c8ic2.setLayoutParams(layoutParams);
                            c8ic2.setMessage(c8ic2.getResources().getString(R.string.pcr));
                            profileEditNicknameFragment.LLIIIJ = c8ic2;
                            viewGroup.addView(c8ic2);
                        }
                    } else {
                        c8ic.setVisibility(0);
                    }
                    C78999UzT.LJFF(C73542Ste.LJII(((ProfileNameSyncService) profileEditNicknameFragment.LLIIIL.getValue()).LIZJ(profileEditNicknameFragment.Ql()).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIJI(new IDhS97S0100000_4(profileEditNicknameFragment, 1)), new AqS170S0100000_4(profileEditNicknameFragment, 624), null, 2), profileEditNicknameFragment.LLIIIZ);
                }
            }
        };
        return c234509Ig;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        KeyboardUtils.LIZIZ(this.LLI);
        Pl();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LJLLLL.LIZLLL();
        this.LLIIIZ.LIZLLL();
        super.onDestroy();
    }

    public final void Pl() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                String LJLLJ = C16880lQ.LJLLJ(ProfileEditNicknameFragment.class);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onExitPressed e:");
                LIZ.append(e);
                C221018lt.LIZIZ(LJLLJ, X1D.LIZIZ(LIZ));
            }
        }
    }

    public final void Vl() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.iq2);
        c26227ARb.LIZIZ(getString(R.string.iq1, Integer.valueOf(this.LJZL)));
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 556));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
        C238209Wm.LIZLLL(false);
    }

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
        if (!C9Y4.LIZ() || !z) {
            return;
        }
        if (!this.LLFF) {
            String string = EF7.LIZIZ().getString(R.string.cba, 48);
            o.LJIIIIZZ(string, "getApplicationContext().…ODIFY_TIME,\n            )");
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(string);
            c5s1.LJ();
            return;
        }
        if (this.LLIIJLIL != null) {
            return;
        }
        C5S1 c5s12 = new C5S1(EF7.LIZIZ());
        c5s12.LIZLLL(EF7.LIZIZ().getString(R.string.cbb));
        c5s12.LJ();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("current_nickname", "");
            o.LJIIIIZZ(string, "it.getString(CURRENT_NICKNAME, \"\")");
            this.LJLL = string;
            String string2 = arguments.getString("enter_method", "");
            o.LJIIIIZZ(string2, "args.getString(ENTER_METHOD, \"\")");
            this.LJLLILLLL = string2;
            String string3 = arguments.getString("btn_name", "");
            o.LJIIIIZZ(string3, "args.getString(GuideUser…gUtil.PARAM_BTN_NAME, \"\")");
            this.LJLLJ = string3;
        }
        this.LLFFF.bindView(this);
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
        ((RBX) HG3.LJIILL()).getCurUser().setNickNameModifyTs((int) this.LLD);
        Ml();
        Pl();
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        Integer num;
        C73305Spp c73305Spp = this.LLIIII;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        LJJIIJZLJL();
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            c252709vu.LJIJ("cancel", C234029Gk.LJLIL);
        }
        EditText editText = this.LLI;
        if (editText != null) {
            editText.setTextColor(C44384HbQ.LJJJJZ(R.color.ck));
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
        }
        TuxIconView tuxIconView = this.LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
        if (exc instanceof C64799Pbv) {
            num = Integer.valueOf(((C64799Pbv) exc).getStatusCode());
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        } else if (exc instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) exc;
            num = Integer.valueOf(c38333F2r.getErrorCode());
            C1FJ.LJI(c38333F2r, new C26045AKb(this));
        } else {
            C26045AKb c26045AKb2 = new C26045AKb(this);
            c26045AKb2.LJIIIIZZ(R.string.g5t);
            c26045AKb2.LJIIJ();
            num = null;
        }
        this.LLIIJLIL = null;
        C244309iM.LJIIIZ(0, "edit_nickname_page", num, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Window window;
        String str;
        boolean z;
        boolean z2;
        String str2;
        C252709vu c252709vu;
        o.LJIIIZ(inflater, "inflater");
        if (Rl()) {
            i = R.layout.c4p;
        } else {
            i = R.layout.c4o;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Dialog dialog = getDialog();
        C29S c29s = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        JF3.LIZIZ(mo49getActivity, window, true);
        this.LLFZ = (TuxTextView) LLLLIILL.findViewById(R.id.m2w);
        this.LLI = (EditText) LLLLIILL.findViewById(R.id.czq);
        this.LLIFFJFJJ = (TuxIconView) LLLLIILL.findViewById(R.id.f0e);
        LLLLIILL.findViewById(R.id.m61);
        this.LLII = (TuxTextView) LLLLIILL.findViewById(R.id.m60);
        this.LLIIIILZ = (TuxTextView) LLLLIILL.findViewById(R.id.h1g);
        this.LJLJJI = (C252709vu) LLLLIILL.findViewById(R.id.gwg);
        this.LLIIII = (C73305Spp) LLLLIILL.findViewById(R.id.kf_);
        View findViewById = LLLLIILL.findViewById(R.id.m61);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_edit_length_hint)");
        Nl((TextView) findViewById);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            str = mo49getActivity2.getString(R.string.fkg);
        } else {
            str = null;
        }
        if (str == null) {
            str = "Name";
        }
        this.LJLLI = str;
        TuxTextView tuxTextView = this.LLFZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (Rl()) {
            C233989Gg c233989Gg = ProfileEditInputFragment.LJLJLLL;
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 704);
            c233989Gg.getClass();
            C234529Ii LIZ = C233989Gg.LIZ(aqS154S0100000_4);
            AbstractC234519Ih Tl = Tl();
            C252709vu c252709vu2 = this.LJLJJI;
            if (c252709vu2 != null) {
                C235119Kp c235119Kp = new C235119Kp();
                c235119Kp.LIZLLL(LIZ);
                c235119Kp.LIZIZ(Tl);
                c235119Kp.LIZLLL = false;
                c252709vu2.setNavActions(c235119Kp);
            }
        } else {
            AbstractC234519Ih Ll = Ll();
            C9KF Kl = Kl(this.LJLLI);
            AbstractC234519Ih Tl2 = Tl();
            C252709vu c252709vu3 = this.LJLJJI;
            if (c252709vu3 != null) {
                C235119Kp c235119Kp2 = new C235119Kp();
                c235119Kp2.LIZLLL(Ll);
                c235119Kp2.LIZ(Kl);
                c235119Kp2.LIZIZ(Tl2);
                c235119Kp2.LIZLLL = true;
                c252709vu3.setNavActions(c235119Kp2);
            }
        }
        if (!Sl()) {
            EditText editText = this.LLI;
            if (editText != null) {
                editText.setText(this.LJLL);
                editText.setTextColor(C44384HbQ.LJJJJZ(R.color.cn));
                editText.setFocusable(false);
                editText.setFocusableInTouchMode(false);
                editText.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 135)));
            }
        } else {
            EditText editText2 = this.LLI;
            if (editText2 != null) {
                if (Rl()) {
                    if (this.LJZI == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        editText2.setHint(this.LJLL);
                    } else {
                        editText2.setText(this.LJLL);
                    }
                } else {
                    editText2.setText(this.LJLL);
                }
                editText2.setSelection(editText2.getText().length());
                editText2.setFocusable(true);
                editText2.setFocusableInTouchMode(true);
                editText2.setSingleLine(true);
                editText2.requestFocus();
                editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9VK
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                            return true;
                        }
                        return false;
                    }
                });
                editText2.addTextChangedListener(new IDObjectS177S0100000_4(this, 11));
            }
        }
        if (!Sl()) {
            TuxIconView tuxIconView = this.LLIFFJFJJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
        } else {
            TuxIconView tuxIconView2 = this.LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_x_mark_circle_fill);
                C16880lQ.LJJJ(tuxIconView2, new ACListenerS24S0100000_4(this, 134));
                if (Ql().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TuxIconView tuxIconView3 = this.LLIFFJFJJ;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setVisibility(0);
                    }
                } else {
                    TuxIconView tuxIconView4 = this.LLIFFJFJJ;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setVisibility(8);
                    }
                }
            }
        }
        Il().setVisibility(0);
        Wl();
        C78999UzT.LJFF(this.LJLLL.LJJLIIIJILLIZJL(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(LLLLIILL, 37), new InterfaceC64592gB() { // from class: X.9FJ
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), this.LJLLLL);
        if (!Rl()) {
            try {
                if (Sl()) {
                    str2 = getString(R.string.ipv, Integer.valueOf(this.LJZL));
                } else {
                    Locale locale = Locale.getDefault();
                    o.LJIIIIZZ(locale, "getDefault()");
                    str2 = getString(R.string.ipw, Integer.valueOf(this.LJZL), new BDDateFormat("LL").LIZIZ(this.LL * 1000, locale));
                }
            } catch (Exception e) {
                String LJLLJ = C16880lQ.LJLLJ(ProfileEditNicknameFragment.class);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initHintText e:");
                LIZ2.append(e);
                C221018lt.LIZIZ(LJLLJ, X1D.LIZIZ(LIZ2));
                str2 = "";
            }
            o.LJIIIIZZ(str2, "try {\n            if (is…\n            \"\"\n        }");
            TuxTextView tuxTextView2 = this.LLII;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
                tuxTextView2.setText(str2);
            }
        }
        LJJJI();
        if (!Sl() && (c252709vu = this.LJLJJI) != null) {
            c252709vu.LJIJ("save", C9VI.LJLIL);
        }
        int i2 = this.LJZI;
        if (i2 != 0 && this.LLD - i2 <= 172800 && this.LLF && C9Y4.LIZ()) {
            TuxTextView tuxTextView3 = this.LLIIIILZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(getString(R.string.cb8, Ql(), 48));
            }
            TuxTextView tuxTextView4 = this.LLIIIILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLIIIILZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setVisibility(8);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 instanceof C29S) {
                c29s = (C29S) mo49getActivity3;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
