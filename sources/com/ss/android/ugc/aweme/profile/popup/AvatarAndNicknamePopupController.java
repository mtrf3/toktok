package com.ss.android.ugc.aweme.profile.popup;

import X.ASL;
import X.ActivityC45651qj;
import X.C188727au;
import X.C207938Eb;
import X.C207968Ee;
import X.C226998vX;
import X.C255199zv;
import X.C34K;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C78580Usi;
import X.C78915Uy7;
import X.C78975Uz5;
import X.C8EN;
import X.C8EO;
import X.C8EP;
import X.C8EQ;
import X.EnumC207888Dw;
import X.EnumC226878vL;
import X.EnumC226888vM;
import X.EnumC226898vN;
import X.FMX;
import X.HG3;
import X.OJD;
import X.OSZ;
import X.RBX;
import X.X1D;
import Y.IDDListenerS143S0100000_3;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS20S0500000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class AvatarAndNicknamePopupController implements UpdateProfilePopupLauncher {
    public static final OJD LIZIZ = new OJD("[uU]ser\\d*");
    public WeakReference<C226998vX> LIZ;

    public static void LJ() {
        String str;
        User LIZLLL = LIZLLL();
        String str2 = null;
        if (LIZLLL != null) {
            str = LIZLLL.getUid();
        } else {
            str = null;
        }
        Keva keva = C207938Eb.LIZ;
        keva.storeInt(i0.LJFF(str, "/_popup_show_cnt"), C207938Eb.LIZ(str) + 1);
        User LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            str2 = LIZLLL2.getUid();
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append("/_last_popup_timestamp");
        keva.storeLong(X1D.LIZIZ(LIZ), seconds);
    }

    public static UpdateProfilePopupLauncher LIZJ() {
        Object LIZ = C58096Mr6.LIZ(UpdateProfilePopupLauncher.class, false);
        if (LIZ != null) {
            return (UpdateProfilePopupLauncher) LIZ;
        }
        if (C58096Mr6.d4 == null) {
            synchronized (UpdateProfilePopupLauncher.class) {
                if (C58096Mr6.d4 == null) {
                    C58096Mr6.d4 = new AvatarAndNicknamePopupController();
                }
            }
        }
        return C58096Mr6.d4;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher
    public final void LIZIZ() {
        C226998vX c226998vX;
        WeakReference<C226998vX> weakReference = this.LIZ;
        if (weakReference != null && (c226998vX = weakReference.get()) != null) {
            c226998vX.dismiss();
        }
    }

    public static User LIZLLL() {
        return ((RBX) HG3.LJIILL()).getCurUser();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher
    public final boolean LIZ(Activity activity, EnumC226898vN enterFrom, EnumC226878vL enumC226878vL, EnumC226888vM showReason) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        OSZ osz;
        C8EP c8ep;
        C8EO c8eo;
        User LIZLLL;
        SpecialAccount specialAccount;
        TTSeller seller;
        int i;
        EnumC207888Dw enumC207888Dw;
        C226998vX c226998vX;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(showReason, "showReason");
        C62822Ol8 c62822Ol8 = C207968Ee.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 0) {
            return false;
        }
        WeakReference<C226998vX> weakReference = this.LIZ;
        if (weakReference != null && (c226998vX = weakReference.get()) != null && c226998vX.isShowing()) {
            return false;
        }
        User LIZLLL2 = LIZLLL();
        String str3 = null;
        if (LIZLLL2 != null) {
            str = LIZLLL2.getUid();
        } else {
            str = null;
        }
        if (C207938Eb.LIZ(str) >= 3) {
            osz = new OSZ(null, null);
        } else {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            User LIZLLL3 = LIZLLL();
            if (LIZLLL3 != null) {
                str2 = LIZLLL3.getUid();
            } else {
                str2 = null;
            }
            long LIZIZ2 = C78580Usi.LIZIZ(str2, "/_last_popup_timestamp", C207938Eb.LIZ, 0L);
            long seconds2 = TimeUnit.DAYS.toSeconds(1L) + LIZIZ2;
            if (LIZIZ2 != 0 && seconds < seconds2) {
                osz = new OSZ(null, null);
            } else {
                User LIZLLL4 = LIZLLL();
                if (LIZLLL4 == null) {
                    osz = new OSZ(null, null);
                } else {
                    if (!o.LJ(LIZLLL4.getCustomVerify(), "") || !o.LJ(LIZLLL4.getEnterpriseVerifyReason(), "")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = !C255199zv.LJIIJ(LIZLLL4, "photo");
                    if (C255199zv.LJIIJ(LIZLLL4, "nickname")) {
                        OJD ojd = LIZIZ;
                        String nickname = LIZLLL4.getNickname();
                        o.LJIIIIZZ(nickname, "user.nickname");
                        if (!ojd.matches(nickname)) {
                            z2 = false;
                            if (!z || (!z3 && !z2)) {
                                osz = new OSZ(null, null);
                            } else {
                                boolean LJ = a.LJ().LJ(4);
                                if (!z3) {
                                    if (!LJ && ((LIZLLL = LIZLLL()) == null || (specialAccount = LIZLLL.specialAccount) == null || (seller = specialAccount.getSeller()) == null || seller.getType() != 1 || !seller.isAllowListSeller())) {
                                        C78975Uz5 c78975Uz5 = new C78975Uz5();
                                        final C34K c34k = new C34K();
                                        c34k.element = true;
                                        User LIZLLL5 = LIZLLL();
                                        if (LIZLLL5 != null) {
                                            c78975Uz5.LIZIZ(LIZLLL5, new C78915Uy7() { // from class: X.8aK
                                                @Override // X.C78915Uy7
                                                public final void LJJIII(VerificationResponse verificationResponse) {
                                                    o.LJIIIZ(verificationResponse, "verificationResponse");
                                                    if (verificationResponse.isEmpty()) {
                                                        C34K.this.element = false;
                                                    }
                                                }
                                            });
                                        }
                                        if (!c34k.element) {
                                            c8eo = C8EO.NICKNAME_ONLY_FLOW;
                                            c8ep = null;
                                        }
                                    }
                                    osz = new OSZ(null, null);
                                } else if (z2) {
                                    c8ep = C8EP.AVATAR_AND_NICKNAME_FLOW;
                                    c8eo = C8EO.AVATAR_AND_NICKNAME_FLOW;
                                } else {
                                    c8ep = C8EP.AVATAR_ONLY_FLOW;
                                    c8eo = null;
                                }
                                osz = new OSZ(c8ep, c8eo);
                            }
                        }
                    }
                    z2 = true;
                    if (!z) {
                    }
                    osz = new OSZ(null, null);
                }
            }
        }
        C8EP c8ep2 = (C8EP) osz.getFirst();
        C8EO c8eo2 = (C8EO) osz.getSecond();
        if (c8ep2 == null && c8eo2 == null) {
            return false;
        }
        User LIZLLL6 = LIZLLL();
        if (LIZLLL6 != null) {
            str3 = LIZLLL6.getUid();
        }
        C8EN c8en = new C8EN(c8ep2, c8eo2, enterFrom, enumC226878vL, showReason, C207938Eb.LIZ(str3));
        C8EP c8ep3 = c8en.LIZ;
        if (c8ep3 == null || (i = C8EQ.LIZ[c8ep3.ordinal()]) == -1) {
            enumC207888Dw = EnumC207888Dw.ONLY_NICKNAME;
        } else if (i != 1) {
            enumC207888Dw = EnumC207888Dw.ONLY_AVATAR;
        } else {
            enumC207888Dw = EnumC207888Dw.BOTH_AVATAR_AND_NICKNAME;
        }
        if (((Number) c62822Ol8.getValue()).intValue() == 2 && enumC207888Dw != EnumC207888Dw.ONLY_NICKNAME) {
            LJFF(activity, c8en, enumC207888Dw, null, true);
            return true;
        }
        C226998vX c226998vX2 = new C226998vX(activity, enumC207888Dw);
        if (c8ep2 != null) {
            c226998vX2.LIZJ = new AqS20S0500000_3(c8en, this, activity, enumC207888Dw, c226998vX2, 2);
            c226998vX2.LIZLLL = new AqS153S0100000_3(c8en, 806);
            c226998vX2.LJ = new AqS153S0100000_3(this, 807);
            c226998vX2.LIZLLL();
            C188727au c188727au = new C188727au();
            c8en.LIZ(c188727au);
            FMX.LJIIL("show_update_avatar_toast", c188727au.LIZ);
        } else {
            c226998vX2.LIZJ = new AqS20S0500000_3(c8en, this, activity, enumC207888Dw, c226998vX2, 3);
            c226998vX2.LIZLLL = new AqS153S0100000_3(c8en, 808);
            c226998vX2.LJ = new AqS153S0100000_3(this, 809);
            c226998vX2.LIZLLL();
            C188727au c188727au2 = new C188727au();
            c8en.LIZ(c188727au2);
            FMX.LJIIL("show_update_nickname_toast", c188727au2.LIZ);
        }
        this.LIZ = new WeakReference<>(c226998vX2);
        return true;
    }

    public final void LJFF(Activity activity, C8EN c8en, final EnumC207888Dw enumC207888Dw, C226998vX c226998vX, boolean z) {
        if (!(activity instanceof ActivityC45651qj)) {
            return;
        }
        AvatarAndNicknamePopup avatarAndNicknamePopup = new AvatarAndNicknamePopup();
        avatarAndNicknamePopup.Gl(c8en, enumC207888Dw);
        final C34K c34k = new C34K();
        c34k.element = !z;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = avatarAndNicknamePopup;
        tuxSheet.LJLILLLLZI = new IDDListenerS143S0100000_3(c226998vX, 1);
        asl.LJFF(16);
        TuxSheet tuxSheet2 = asl.LIZ;
        FragmentManager it = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(it, "it");
        tuxSheet2.show(it, "AvatarAndNicknamePopup");
        tuxSheet2.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController$showSheet$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                C34K c34k2 = C34K.this;
                if (!c34k2.element) {
                    c34k2.element = true;
                    if (((Number) C207968Ee.LIZ.getValue()).intValue() == 2 && enumC207888Dw != EnumC207888Dw.ONLY_NICKNAME) {
                        this.getClass();
                        AvatarAndNicknamePopupController.LJ();
                    }
                }
            }
        });
    }
}
