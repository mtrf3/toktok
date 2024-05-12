package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C09900aA;
import X.C16880lQ;
import X.C221108m2;
import X.C234509Ig;
import X.C237939Vl;
import X.C238039Vv;
import X.C238079Vz;
import X.C238209Wm;
import X.C252949wI;
import X.C26227ARb;
import X.C54081LKj;
import X.C54082LKk;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73807Sxv;
import X.C74090T5y;
import X.C88393dT;
import X.C9NG;
import X.C9W0;
import X.C9W3;
import X.C9W6;
import X.C9WD;
import X.C9WN;
import X.HG3;
import X.InterfaceC252739vx;
import X.InterfaceC56322M8o;
import X.RBX;
import X.UC0;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ProfileEditUsernameFragment extends ProfileEditInputFragment implements C9WN, InterfaceC56322M8o {
    public static final /* synthetic */ int LLIILZL = 0;
    public boolean LJLLILLLL;
    public C9W3 LJLLLL;
    public TextView LJLLLLLL;
    public TextView LJLZ;
    public LinearLayout LJZ;
    public RecyclerView LJZI;
    public C88393dT LJZL;
    public EditText LLD;
    public boolean LLFF;
    public AccountKeyBoardHelper LLFFF;
    public TextView LLFII;
    public String LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public final User LLII;
    public final long LLIIII;
    public final long LLIIIILZ;
    public final boolean LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public C237939Vl LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final String LLIIL;
    public final Map<Integer, View> LLIILII = new LinkedHashMap();
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLJ = "";
    public String LJLLL = "";
    public final C73807Sxv LL = new C73807Sxv();
    public final C238079Vz LLF = new C238079Vz();

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIILII).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIILII;
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

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public ProfileEditUsernameFragment() {
        User user;
        long j;
        String str;
        boolean z;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            user = ((RBX) LJIILL).getCurUser();
        } else {
            user = null;
        }
        this.LLII = user;
        if (user != null) {
            j = user.getHandleModified();
        } else {
            j = 0;
        }
        this.LLIIII = j;
        this.LLIIIILZ = System.currentTimeMillis() / 1000;
        if (user != null) {
            str = user.getCustomVerify();
        } else {
            str = null;
        }
        if (o.LJ(str, "")) {
            if (o.LJ(user != null ? user.getEnterpriseVerifyReason() : null, "")) {
                z = false;
                this.LLIIIJ = z;
                this.LLIIIL = C221108m2.LIZIZ(C238039Vv.LJLIL);
                this.LLIIIZ = C221108m2.LIZIZ(C9W0.LJLIL);
                this.LLIIJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 697));
                this.LLIIL = "edit_user_name";
            }
        }
        z = true;
        this.LLIIIJ = z;
        this.LLIIIL = C221108m2.LIZIZ(C238039Vv.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(C9W0.LJLIL);
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 697));
        this.LLIIL = "edit_user_name";
    }

    @Override // X.C9WN
    public final void LLFII() {
        RecyclerView recyclerView = this.LJZI;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        } else {
            o.LJIJI("setUsernameRv");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final void Ml() {
        C9W3 c9w3 = this.LJLLLL;
        if (c9w3 != null) {
            c9w3.LIZ(Ol().getText().toString(), this.LLIIJI);
        }
        if (!C9NG.LIZ(Ol().getText().toString())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", 1);
            C09900aA.LJI("check_user_name_status", jSONObject, null, null);
        }
        vl();
    }

    public final EditText Ol() {
        EditText editText = this.LLD;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("etUserName");
        throw null;
    }

    public final LinearLayout Pl() {
        LinearLayout linearLayout = this.LJZ;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("setUsernameInclude");
        throw null;
    }

    public final boolean Ql() {
        return ((Boolean) this.LLIIIL.getValue()).booleanValue();
    }

    @Override // X.C9WN
    public final void Rg() {
        RecyclerView recyclerView = this.LJZI;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        } else {
            o.LJIJI("setUsernameRv");
            throw null;
        }
    }

    public final AbstractC234519Ih Sl() {
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "save";
        String string = getString(R.string.fkl);
        o.LJIIIIZZ(string, "getString(R.string.edit_profile_save)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9Vn
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [X.9Vm] */
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                String str;
                Editable text = ProfileEditUsernameFragment.this.Ol().getText();
                String str2 = null;
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                boolean z = false;
                if (u.LIZJ(str, EF7.LIZIZ())) {
                    KeyboardUtils.LIZIZ(ProfileEditUsernameFragment.this.Ol());
                    C244329iO c244329iO = new C244329iO("click_save", C9WB.USERNAME);
                    c244329iO.LIZJ = "edit_profile_page";
                    if (ProfileEditUsernameFragment.this.LLIIII == 0) {
                        z = true;
                    }
                    c244329iO.LJFF = Boolean.valueOf(z);
                    C244309iM.LJ(new C244319iN(c244329iO));
                    if (((Boolean) ProfileEditUsernameFragment.this.LLIIJLIL.getValue()).booleanValue()) {
                        ProfileEditUsernameFragment.this.Vl();
                        return;
                    }
                    if (((ProfileNameSyncService) ProfileEditUsernameFragment.this.LLIIIZ.getValue()).LIZ()) {
                        Context context = ProfileEditUsernameFragment.this.getContext();
                        Editable text2 = ProfileEditUsernameFragment.this.Ol().getText();
                        if (text2 != null) {
                            str2 = text2.toString();
                        }
                        final ProfileEditUsernameFragment profileEditUsernameFragment = ProfileEditUsernameFragment.this;
                        if (context != null && str2 != null) {
                            ((ProfileNameSyncService) profileEditUsernameFragment.LLIIIZ.getValue()).LJ(context, str2, new InterfaceC238119Wd() { // from class: X.9Vm
                                @Override // X.InterfaceC238119Wd
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC238119Wd
                                public final void LIZIZ(String nameToSync, boolean z2) {
                                    o.LJIIIZ(nameToSync, "nameToSync");
                                    if (!z2) {
                                        ProfileEditUsernameFragment profileEditUsernameFragment2 = ProfileEditUsernameFragment.this;
                                        profileEditUsernameFragment2.LLIIJI = null;
                                        profileEditUsernameFragment2.Ml();
                                        ProfileEditUsernameFragment.this.dismiss();
                                        return;
                                    }
                                    ProfileEditUsernameFragment.this.LLIIJI = new C237939Vl(false, true, nameToSync);
                                    ProfileEditUsernameFragment profileEditUsernameFragment3 = ProfileEditUsernameFragment.this;
                                    User user = profileEditUsernameFragment3.LLII;
                                    if (user != null) {
                                        user.setNickNameModifyTs((int) profileEditUsernameFragment3.LLIIIILZ);
                                    }
                                    ProfileEditUsernameFragment.this.Ml();
                                    ProfileEditUsernameFragment.this.dismiss();
                                }
                            });
                            if (C76800UCe.LIZ != null) {
                                return;
                            }
                        }
                        ProfileEditUsernameFragment.this.Vl();
                        return;
                    }
                    ProfileEditUsernameFragment.this.Vl();
                    return;
                }
                C244309iM.LJIIJ(0, ProfileEditUsernameFragment.this.LJLLL, null, false);
            }
        };
        return c234509Ig;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LL.LIZIZ();
        C73411SrX c73411SrX = this.LLF.LIZIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Vl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
        c26227ARb.LJ(R.string.qtd);
        c26227ARb.LIZ(R.string.qtb);
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 558));
        c26227ARb.LIZJ(new AqS170S0100000_4(this, 559));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
        C238209Wm.LJ(false);
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return C54081LKj.LIZ(requireContext, this);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(Ol());
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLFFF;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LJLJLJ = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLFFF;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LJLJLJ = this;
        }
        if (C9W6.LIZ()) {
            C9WD.LIZIZ(Ol());
        } else {
            Ol().requestFocus();
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIIL;
    }

    public final boolean Rl(int i) {
        long j = this.LLIIII;
        if (j == 0 || this.LLIIIILZ >= j + (i * 86400)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("content_name");
            o.LJI(string);
            this.LJLL = string;
            String string2 = arguments.getString("content_value");
            o.LJI(string2);
            this.LJLLI = string2;
            this.LJLLILLLL = arguments.getBoolean("is_edit_enabled");
            String string3 = arguments.getString("edit_hint");
            o.LJI(string3);
            this.LJLLJ = string3;
            arguments.getInt("content_max_length");
            arguments.getBoolean("is_enable_null");
            String string4 = arguments.getString("enter_from");
            o.LJI(string4);
            this.LJLLL = string4;
            String string5 = arguments.getString("custom_verify");
            String str = "";
            if (string5 == null) {
                string5 = "";
            }
            this.LLFZ = string5;
            String string6 = arguments.getString("enterprise_verify_reason");
            if (string6 == null) {
                string6 = "";
            }
            this.LLI = string6;
            String string7 = arguments.getString("special_account");
            if (string7 != null) {
                str = string7;
            }
            this.LLIFFJFJJ = str;
        }
    }

    public final void Tl(int i, String str, boolean z) {
        if (z && this.LJLLILLLL) {
            LJJIIJZLJL();
        } else {
            LJJJI();
        }
        if (str == null) {
            ((C252949wI) Pl().findViewById(R.id.eoi)).LIZ();
            if (Ql()) {
                Pl().findViewById(R.id.eoh).setBackgroundResource(R.drawable.bx3);
            }
        } else {
            ((C252949wI) Pl().findViewById(R.id.eoi)).LIZIZ(str);
            if (Ql()) {
                Pl().findViewById(R.id.eoh).setBackgroundResource(R.drawable.bx2);
            }
        }
        ((C74090T5y) Pl().findViewById(R.id.eoh)).LIZLLL(i, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:55|(2:57|(1:80)(1:63))(2:81|(2:88|(1:90)(8:91|65|(3:67|(1:69)|70)|71|72|(1:74)|75|76))(1:87))|64|65|(0)|71|72|(0)|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0213, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4, "") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04af, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04a2 A[Catch: all -> 0x04ae, TryCatch #0 {all -> 0x04ae, blocks: (B:72:0x048d, B:74:0x04a2, B:75:0x04a5), top: B:71:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0426  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
