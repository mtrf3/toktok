package com.ss.android.ugc.aweme.profile.viewer.viewmodel;

import X.AbstractC226768vA;
import X.AbstractC55363Lo7;
import X.ActivityC45651qj;
import X.C176616wT;
import X.C188727au;
import X.C221108m2;
import X.C226708v4;
import X.C226728v6;
import X.C226748v8;
import X.C226788vC;
import X.C226798vD;
import X.C226808vE;
import X.C226818vF;
import X.C226848vI;
import X.C226868vK;
import X.C38333F2r;
import X.C62822Ol8;
import X.C64698PaI;
import X.C64799Pbv;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78920UyC;
import X.C78983UzD;
import X.C78999UzT;
import X.C86V;
import X.EnumC226878vL;
import X.EnumC226888vM;
import X.EnumC226898vN;
import X.FMX;
import X.InterfaceC101453yX;
import X.T16;
import Y.AfS35S0101000_3;
import Y.AfS55S0100000_3;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileViewerViewModel extends ViewModel {
    public static final /* synthetic */ int LJLLLL = 0;
    public final MutableLiveData<C226868vK> LJLIL = new MutableLiveData<>();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C226798vD.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C226808vE.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C226818vF.LJLIL);
    public final Keva LJLJJLL;
    public final boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public final C176616wT LJLLJ;
    public final C62822Ol8 LJLLL;

    public final MutableLiveData<AbstractC226768vA> hv0() {
        return (MutableLiveData) this.LJLJJL.getValue();
    }

    public ProfileViewerViewModel() {
        Keva repo = Keva.getRepo("keva_repo_profile_viewer");
        this.LJLJJLL = repo;
        this.LJLJL = repo.getBoolean(C226788vC.LIZ("viewer_page_float_notice_has_show"), false);
        this.LJLLI = "";
        this.LJLLILLLL = -1;
        this.LJLLJ = new C176616wT();
        this.LJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 837));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.dispose();
    }

    public static void jv0(boolean z) {
        FMX.LJIIL("profile_visitor_list_num", C78920UyC.LIZJ(z ? 1 : 0, "profile_visitor_empty").LIZ);
    }

    public final void gv0(String str) {
        String str2;
        int i;
        boolean z = this.LJLJLLL;
        boolean z2 = this.LJLL;
        if (z != z2) {
            if (z2) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            String str3 = this.LJLLI;
            if (str3 == null) {
                str3 = "";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "profile_visitor_list");
            c188727au.LJIIIZ("previous_page", str3);
            c188727au.LJIIIZ("to_status", str2);
            c188727au.LJIIIZ("position", str);
            FMX.LJIIL("change_profile_visitor_status", c188727au.LIZ);
            hv0().postValue(new C226728v6(0));
            boolean z3 = this.LJLL;
            this.LJLJLLL = z3;
            this.LJLL = z3;
            InterfaceC101453yX LJFF = PrivacyServiceImpl.LJIIIIZZ().LJFF();
            if (this.LJLJLLL) {
                i = 1;
            } else {
                i = 2;
            }
            if (LJFF != null) {
                C78999UzT.LJFF(LJFF.LIZLLL(i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS35S0101000_3(i, this, 1), new AfS55S0100000_3(this, 35)), this.LJLILLLLZI);
            }
        }
    }

    public final void iv0(Throwable th) {
        String str;
        if (th instanceof C38333F2r) {
            str = ((C38333F2r) th).getErrorMsg();
            o.LJIIIIZZ(str, "it.errorMsg");
        } else {
            if ((th instanceof C64698PaI) || (th instanceof C64799Pbv)) {
                hv0().postValue(new C226748v8(0));
                this.LJLIL.postValue(new C226848vI());
                return;
            }
            str = "";
        }
        if (!C78983UzD.LJJJJ(str)) {
            str = C86V.LJFF(R.string.pgn);
            o.LJIIIIZZ(str, "getString(R.string.profi…er_5000_empty_state_desc)");
        }
        hv0().postValue(new C226708v4(str, 1));
    }

    public final void kv0(final ActivityC45651qj activityC45651qj) {
        final EnumC226898vN enumC226898vN;
        final EnumC226878vL enumC226878vL;
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            if (o.LJ(this.LJLLI, "notification_page")) {
                enumC226898vN = EnumC226898vN.NOTIFICATION_PAGE;
            } else {
                enumC226898vN = EnumC226898vN.PERSONAL_HOMEPAGE;
            }
            if (o.LJ(this.LJLLI, "notification_page")) {
                enumC226878vL = EnumC226878vL.NEW_ACTIVITIES;
            } else {
                enumC226878vL = null;
            }
            if (activityC45651qj != null) {
                final EnumC226888vM enumC226888vM = EnumC226888vM.PROFILE_VIEWER_LIST;
                PopupManager.LJIIL(new AbstractC55363Lo7(activityC45651qj, enumC226898vN, enumC226878vL, enumC226888vM) { // from class: X.8Eg
                    public final Activity LJLIL;
                    public final EnumC226898vN LJLILLLLZI;
                    public final EnumC226878vL LJLJI;
                    public final EnumC226888vM LJLJJI;
                    public final int LJLJJL;

                    @Override // X.InterfaceC55641Lsb
                    public final C54082LKk getPopupContext() {
                        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
                        if (LJJIFFI != null) {
                            return C54081LKj.LIZ(this.LJLIL, LJJIFFI);
                        }
                        return null;
                    }

                    @Override // X.InterfaceC56321M8n
                    public final int getPriority() {
                        return this.LJLJJL;
                    }

                    @Override // X.M72
                    public final void LIZLLL(C54082LKk context, M78 wrapper) {
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(wrapper, "wrapper");
                        if (!AvatarAndNicknamePopupController.LIZJ().LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI)) {
                            wrapper.LIZ();
                        }
                    }

                    {
                        o.LJIIIZ(activityC45651qj, "activity");
                        o.LJIIIZ(enumC226898vN, "enterFrom");
                        o.LJIIIZ(enumC226888vM, "showReason");
                        this.LJLIL = activityC45651qj;
                        this.LJLILLLLZI = enumC226898vN;
                        this.LJLJI = enumC226878vL;
                        this.LJLJJI = enumC226888vM;
                        this.LJLJJL = 10;
                    }
                });
            }
        }
    }

    public final void lv0(BaseResponse baseResponse, boolean z) {
        String str;
        this.LJLLJ.LIZ();
        C176616wT c176616wT = this.LJLLJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c176616wT.LIZJ(str, "is_empty");
        this.LJLLJ.LIZLLL(baseResponse);
        this.LJLLJ.LJFF();
    }

    public final void mv0(int i, boolean z) {
        String str;
        this.LJLLJ.LJ();
        C176616wT c176616wT = this.LJLLJ;
        c176616wT.getClass();
        c176616wT.LIZLLL = "ttk_user_profile_view_record_get_api_monitor";
        this.LJLLJ.LIZJ(Integer.valueOf(i), "source");
        C176616wT c176616wT2 = this.LJLLJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c176616wT2.LIZIZ(str, "is_first_page");
    }
}
