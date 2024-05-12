package X;

import Y.AUListenerS52S1100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57465Mgv {
    public final View LIZ;
    public final View LIZIZ;
    public final ProfileCTAAbility LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJLI;
    public final java.util.Map<Integer, Integer> LJFF = new LinkedHashMap();
    public final C57480MhA LJI = new C57480MhA();
    public final C57497MhR LJII = new C57497MhR();
    public final C57496MhQ LJIIIIZZ = new C57496MhQ();
    public final C57482MhC LJIIIZ = new C57482MhC();
    public final C57495MhP LJIIJ = new C57495MhP();
    public final C57494MhO LJIIJJI = new C57494MhO();
    public final C57481MhB LJIIL = new C57481MhB();
    public final C57493MhN LJIILIIL = new C57493MhN();
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public boolean LJIJJ = true;

    public final void LJ() {
        if (o.LJ(String.valueOf(this.LJIIJJI.LIZJ), C86V.LJ().getString(R.string.i3_))) {
            if (C57469Mgz.LJFF()) {
                this.LJIIJJI.LIZ = Integer.valueOf(R.raw.icon_paperplane_fill);
                return;
            } else if (((Boolean) C57469Mgz.LJ.getValue()).booleanValue()) {
                this.LJIIJJI.LIZ = Integer.valueOf(R.raw.icon_paperplane);
                return;
            }
        }
        this.LJIIJJI.LIZ = null;
    }

    public final void LIZJ(int i) {
        int LIZIZ;
        Integer TE;
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        if (!this.LJIJJ) {
            return;
        }
        this.LJI.getClass();
        int i2 = 164;
        if (i == 0) {
            if (this.LIZ != null) {
                if (C2318698c.LIZJ()) {
                    ProfileCTAAbility profileCTAAbility = this.LIZJ;
                    if (profileCTAAbility != null) {
                        profileCTAAbility.tX();
                    }
                    if (this.LJIJI) {
                        String str = this.LJI.LIZLLL;
                        if (C2318698c.LIZJ() && this.LJIILLIIL != 1 && this.LJIJI && this.LJIJJ) {
                            this.LJIILLIIL = 1;
                            ProfileCTAAbility profileCTAAbility2 = this.LIZJ;
                            if (profileCTAAbility2 != null) {
                                profileCTAAbility2.EY(C9IF.FOLLOW, str);
                            }
                            if (this.LJIJ == 2) {
                                i2 = 116;
                            }
                            int LIZIZ2 = C7MY.LIZIZ(i2);
                            int[] iArr = new int[2];
                            iArr[0] = LIZIZ2;
                            ProfileCTAAbility profileCTAAbility3 = this.LIZJ;
                            if (profileCTAAbility3 != null && (TE = profileCTAAbility3.TE(str)) != null) {
                                LIZIZ2 = TE.intValue();
                            }
                            iArr[1] = LIZIZ2;
                            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                            ofInt.addUpdateListener(new AUListenerS52S1100000_9(this, str, 0));
                            ofInt.addListener(new IDAListenerS77S0100000_9(this, 20));
                            ofInt.addListener(new IDAListenerS77S0100000_9(this, 19));
                            ofInt.setInterpolator(new LinearInterpolator());
                            ofInt.setDuration(150L);
                            ofInt.start();
                        }
                    } else {
                        ProfileCTAAbility profileCTAAbility4 = this.LIZJ;
                        if (profileCTAAbility4 != null) {
                            C9IF c9if = C9IF.FOLLOW;
                            Integer TE2 = profileCTAAbility4.TE(this.LJI.LIZLLL);
                            if (TE2 != null) {
                                LIZIZ = TE2.intValue();
                            } else {
                                LIZIZ = C7MY.LIZIZ(116);
                            }
                            profileCTAAbility4.LT(c9if, LIZIZ);
                        }
                        ProfileCTAAbility profileCTAAbility5 = this.LIZJ;
                        if (profileCTAAbility5 != null) {
                            profileCTAAbility5.J00(C9IF.FOLLOW, C9HL.TEXT);
                        }
                        ProfileCTAAbility profileCTAAbility6 = this.LIZJ;
                        if (profileCTAAbility6 != null) {
                            profileCTAAbility6.EY(C9IF.FOLLOW, this.LJI.LIZLLL);
                        }
                    }
                } else {
                    ProfileCTAAbility profileCTAAbility7 = this.LIZJ;
                    if (profileCTAAbility7 != null) {
                        profileCTAAbility7.J00(C9IF.FOLLOW, C9HL.ICON);
                    }
                    ProfileCTAAbility profileCTAAbility8 = this.LIZJ;
                    if (profileCTAAbility8 != null) {
                        profileCTAAbility8.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)));
                    }
                    ProfileCTAAbility profileCTAAbility9 = this.LIZJ;
                    if (profileCTAAbility9 != null) {
                        profileCTAAbility9.vI(C9IF.FOLLOW, this.LJI.LIZJ);
                    }
                }
            }
        } else {
            this.LJII.getClass();
            if (i == 1) {
                if (!C2318698c.LIZJ()) {
                    ProfileCTAAbility profileCTAAbility10 = this.LIZJ;
                    if (profileCTAAbility10 != null) {
                        C9IF c9if2 = C9IF.FOLLOW;
                        Integer num = (Integer) new LinkedHashMap().get(c9if2);
                        if (num != null) {
                            num.intValue();
                        }
                        profileCTAAbility10.sl0(c9if2);
                    }
                    new LinkedHashMap().put(C9IF.FOLLOW, 0);
                    new LinkedHashMap().put(C9IF.MESSAGE, 1);
                }
                ProfileCTAAbility profileCTAAbility11 = this.LIZJ;
                if (profileCTAAbility11 != null) {
                    profileCTAAbility11.J00(C9IF.FOLLOW, C9HL.TEXT);
                }
                if (this.LIZ != null) {
                    ProfileCTAAbility profileCTAAbility12 = this.LIZJ;
                    if (profileCTAAbility12 != null) {
                        profileCTAAbility12.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                    }
                    ProfileCTAAbility profileCTAAbility13 = this.LIZJ;
                    if (profileCTAAbility13 != null) {
                        profileCTAAbility13.EY(C9IF.FOLLOW, this.LJII.LIZJ);
                    }
                    ProfileCTAAbility profileCTAAbility14 = this.LIZJ;
                    if (profileCTAAbility14 != null) {
                        profileCTAAbility14.JU(C9IF.FOLLOW, C9I4.VARIANT_PRIMARY);
                    }
                }
                View view2 = this.LIZ;
                if (view2 != null && view2.isEnabled()) {
                    ProfileCTAAbility profileCTAAbility15 = this.LIZJ;
                    if (profileCTAAbility15 != null) {
                        profileCTAAbility15.JU(C9IF.FOLLOW, C9I4.VARIANT_PRIMARY);
                    }
                } else {
                    ProfileCTAAbility profileCTAAbility16 = this.LIZJ;
                    if (profileCTAAbility16 != null) {
                        profileCTAAbility16.JU(C9IF.FOLLOW, C9I4.VARIANT_UNABLE);
                    }
                }
                this.LIZLLL = i;
                return;
            }
            this.LJIIJ.getClass();
            if (i == 2) {
                if (this.LIZ != null) {
                    ProfileCTAAbility profileCTAAbility17 = this.LIZJ;
                    if (profileCTAAbility17 != null) {
                        profileCTAAbility17.J00(C9IF.FOLLOW, C9HL.TEXT);
                    }
                    ProfileCTAAbility profileCTAAbility18 = this.LIZJ;
                    if (profileCTAAbility18 != null) {
                        profileCTAAbility18.EY(C9IF.FOLLOW, this.LJIIJ.LIZJ);
                    }
                    ProfileCTAAbility profileCTAAbility19 = this.LIZJ;
                    if (profileCTAAbility19 != null) {
                        profileCTAAbility19.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                    }
                }
            } else {
                this.LJIIIIZZ.getClass();
                if (i == 3) {
                    if (this.LIZ != null) {
                        ProfileCTAAbility profileCTAAbility20 = this.LIZJ;
                        if (profileCTAAbility20 != null) {
                            profileCTAAbility20.J00(C9IF.FOLLOW, C9HL.TEXT);
                        }
                        ProfileCTAAbility profileCTAAbility21 = this.LIZJ;
                        if (profileCTAAbility21 != null) {
                            profileCTAAbility21.EY(C9IF.FOLLOW, this.LJIIIIZZ.LIZJ);
                        }
                        ProfileCTAAbility profileCTAAbility22 = this.LIZJ;
                        if (profileCTAAbility22 != null) {
                            profileCTAAbility22.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                        }
                    }
                } else {
                    this.LJIIIZ.getClass();
                    if (i == 4) {
                        if (this.LIZ != null) {
                            ProfileCTAAbility profileCTAAbility23 = this.LIZJ;
                            if (profileCTAAbility23 != null) {
                                profileCTAAbility23.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                            }
                            ProfileCTAAbility profileCTAAbility24 = this.LIZJ;
                            if (profileCTAAbility24 != null) {
                                profileCTAAbility24.J00(C9IF.FOLLOW, C9HL.ICON_TEXT);
                            }
                            ProfileCTAAbility profileCTAAbility25 = this.LIZJ;
                            if (profileCTAAbility25 != null) {
                                C9IF c9if3 = C9IF.FOLLOW;
                                C57482MhC c57482MhC = this.LJIIIZ;
                                profileCTAAbility25.m00(c9if3, c57482MhC.LIZJ, c57482MhC.LIZLLL, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                            }
                        }
                    } else {
                        this.LJIILIIL.getClass();
                        if (i == 100) {
                            if (this.LIZ != null) {
                                ProfileCTAAbility profileCTAAbility26 = this.LIZJ;
                                if (profileCTAAbility26 != null) {
                                    profileCTAAbility26.JU(C9IF.FOLLOW, C9I4.VARIANT_PRIMARY);
                                }
                                ProfileCTAAbility profileCTAAbility27 = this.LIZJ;
                                if (profileCTAAbility27 != null) {
                                    profileCTAAbility27.J00(C9IF.FOLLOW, C9HL.TEXT);
                                }
                                ProfileCTAAbility profileCTAAbility28 = this.LIZJ;
                                if (profileCTAAbility28 != null) {
                                    profileCTAAbility28.EY(C9IF.FOLLOW, this.LJIILIIL.LIZJ);
                                }
                                ProfileCTAAbility profileCTAAbility29 = this.LIZJ;
                                if (profileCTAAbility29 != null) {
                                    profileCTAAbility29.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                                }
                            }
                            this.LIZLLL = i;
                            return;
                        }
                    }
                }
            }
        }
        ProfileCTAAbility profileCTAAbility30 = this.LIZJ;
        if (profileCTAAbility30 != null) {
            profileCTAAbility30.JU(C9IF.FOLLOW, C9I4.VARIANT_SECONDARY);
        }
        this.LIZLLL = i;
    }

    public final void LIZ(String str, String str2) {
        View view;
        Context context;
        if (str2 == null || (view = this.LIZ) == null || (context = view.getContext()) == null) {
            return;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (!C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), str2, 6)) {
            return;
        }
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "others_homepage"), new OSZ("enter_method", "button"));
        if (o.LJ(str, "show")) {
            createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZ(str2, LJJLIIIIJ, C57434MgQ.LIZIZ(context), true);
        } else {
            if (!o.LJ(str, "click")) {
                return;
            }
            createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZIZ(str2, LJJLIIIIJ);
        }
    }

    public final void LIZLLL(int i, int i2) {
        ProfileCTAAbility profileCTAAbility;
        View view;
        this.LJFF.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (!((LinkedHashMap) this.LJFF).containsValue(0)) {
            if ((C2318698c.LIZJ() && this.LJIJI) || (view = this.LIZIZ) == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (((Number) entry.getValue()).intValue() == 0) {
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                this.LJIIJJI.getClass();
                if (intValue == 5) {
                    if (!C2318698c.LIZJ()) {
                        ProfileCTAAbility profileCTAAbility2 = this.LIZJ;
                        if (profileCTAAbility2 != null) {
                            C9IF c9if = C9IF.MESSAGE;
                            Integer num = (Integer) new LinkedHashMap().get(c9if);
                            if (num != null) {
                                num.intValue();
                            }
                            profileCTAAbility2.sl0(c9if);
                        }
                        new LinkedHashMap().put(C9IF.MESSAGE, 0);
                        new LinkedHashMap().put(C9IF.FOLLOW, 1);
                    }
                    View view3 = this.LIZIZ;
                    if (view3 != null) {
                        ProfileCTAAbility profileCTAAbility3 = this.LIZJ;
                        if (profileCTAAbility3 != null) {
                            profileCTAAbility3.EY(C9IF.MESSAGE, this.LJIIJJI.LIZJ);
                        }
                        if (!C2318698c.LIZJ()) {
                            ProfileCTAAbility profileCTAAbility4 = this.LIZJ;
                            if (profileCTAAbility4 != null) {
                                profileCTAAbility4.LT(C9IF.MESSAGE, O6R.LJJIIZ(C32151Nz.LJIIZILJ(116)));
                            }
                            C26338AVi.LJI(view3, AnonymousClass391.LIZJ(4), 0, 0, 0, false, 16);
                        }
                    }
                    if (!C57469Mgz.LIZJ()) {
                        ProfileCTAAbility profileCTAAbility5 = this.LIZJ;
                        if (profileCTAAbility5 != null) {
                            profileCTAAbility5.J00(C9IF.MESSAGE, C9HL.TEXT);
                        }
                        this.LJ = intValue;
                        return;
                    }
                    if (!C2318698c.LIZJ() && (profileCTAAbility = this.LIZJ) != null) {
                        profileCTAAbility.LT(C9IF.MESSAGE, O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)));
                    }
                    if (C57469Mgz.LJ()) {
                        this.LJIIJJI.LIZ = Integer.valueOf(R.raw.icon_paperplane);
                        this.LJIIJJI.LIZJ = C44384HbQ.LJJZ(R.string.i3_);
                    } else if (C57469Mgz.LJFF()) {
                        this.LJIIJJI.LIZJ = C44384HbQ.LJJZ(R.string.i3_);
                        this.LJIIJJI.LIZ = Integer.valueOf(R.raw.icon_paperplane_fill);
                    }
                    ProfileCTAAbility profileCTAAbility6 = this.LIZJ;
                    if (profileCTAAbility6 != null) {
                        profileCTAAbility6.J00(C9IF.MESSAGE, C9HL.ICON_TEXT);
                    }
                    ProfileCTAAbility profileCTAAbility7 = this.LIZJ;
                    if (profileCTAAbility7 != null) {
                        C9IF c9if2 = C9IF.MESSAGE;
                        C57494MhO c57494MhO = this.LJIIJJI;
                        profileCTAAbility7.m00(c9if2, c57494MhO.LIZJ, c57494MhO.LIZ, C7MY.LIZIZ(2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                    }
                } else {
                    this.LJIIL.getClass();
                    if (intValue == 6 && this.LIZIZ != null && !this.LJIJJLI) {
                        if (C57469Mgz.LJ()) {
                            this.LJIIL.LIZJ = null;
                            O6R.LJJIIZ(C32151Nz.LJIIZILJ(116));
                            this.LJIIL.LIZLLL = C44384HbQ.LJJZ(R.string.i3_);
                            ProfileCTAAbility profileCTAAbility8 = this.LIZJ;
                            if (profileCTAAbility8 != null) {
                                profileCTAAbility8.J00(C9IF.MESSAGE, C9HL.TEXT);
                            }
                            ProfileCTAAbility profileCTAAbility9 = this.LIZJ;
                            if (profileCTAAbility9 != null) {
                                profileCTAAbility9.LT(C9IF.MESSAGE, O6R.LJJIIZ(C32151Nz.LJIIZILJ(116)));
                            }
                            ProfileCTAAbility profileCTAAbility10 = this.LIZJ;
                            if (profileCTAAbility10 != null) {
                                profileCTAAbility10.EY(C9IF.MESSAGE, this.LJIIL.LIZLLL);
                            }
                            ProfileCTAAbility profileCTAAbility11 = this.LIZJ;
                            if (profileCTAAbility11 != null) {
                                profileCTAAbility11.LT(C9IF.FOLLOW, O6R.LJJIIZ(C32151Nz.LJIIZILJ(116)));
                            }
                            this.LJIJ = 2;
                        } else {
                            if (C57469Mgz.LJFF()) {
                                this.LJIIL.LIZJ = Integer.valueOf(R.raw.icon_paperplane_fill);
                            }
                            if (!C2318698c.LIZJ() || !this.LJIJI) {
                                ProfileCTAAbility profileCTAAbility12 = this.LIZJ;
                                if (profileCTAAbility12 != null) {
                                    profileCTAAbility12.J00(C9IF.MESSAGE, C9HL.ICON);
                                }
                                ProfileCTAAbility profileCTAAbility13 = this.LIZJ;
                                if (profileCTAAbility13 != null) {
                                    profileCTAAbility13.LT(C9IF.MESSAGE, O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)));
                                }
                            }
                            ProfileCTAAbility profileCTAAbility14 = this.LIZJ;
                            if (profileCTAAbility14 != null) {
                                profileCTAAbility14.vI(C9IF.MESSAGE, this.LJIIL.LIZJ);
                            }
                            this.LJIJ = 1;
                        }
                    }
                }
                this.LJ = intValue;
            }
        }
    }

    public C57465Mgv(View view, View view2, ProfileCTAAbility profileCTAAbility) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = profileCTAAbility;
    }

    public final void LJFF(int i, User user, boolean z) {
        if (user == null) {
            return;
        }
        this.LJIILL = C57469Mgz.LJI(user);
        if (i == 0) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        if (!C57469Mgz.LJI(user)) {
            return;
        }
        this.LJIILL = true;
        C245999l5.LIZJ(i, user.getUid(), user.getAccurateRecType(), C227768wm.LJIL(user));
    }

    public static void LIZIZ(int i, User user, String str, boolean z) {
        if (user == null || TextUtils.equals(user.getUid(), ((RBX) HG3.LJIILL()).getCurUserId()) || C78966Uyw.LJJIJ().LIZIZ()) {
            return;
        }
        boolean z2 = false;
        if (((i != 1 && i != 2) || z) && (i != 0 || !z)) {
            return;
        }
        String uid = user.getUid();
        if (user.getAccountType() == 3) {
            z2 = true;
        }
        C245999l5.LIZLLL(i, uid, z2, str, C227768wm.LJIL(user));
    }
}
