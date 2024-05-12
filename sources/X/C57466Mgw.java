package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.zhiliaoapp.musically.R;
import defpackage.a0;
import defpackage.t;
import defpackage.u;
import defpackage.v;
import defpackage.w;
import defpackage.x;
import defpackage.y;
import defpackage.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57466Mgw {
    public final View LIZ;
    public final View LIZIZ;
    public final IHeaderCTAAbility LIZJ;
    public final InterfaceC88471Ynr<String, String, C76800UCe> LIZLLL;
    public final InterfaceC88471Ynr<String, Integer, C76800UCe> LJ;
    public final java.util.Map<String, Integer> LJFF;
    public int LJI;
    public int LJII;
    public final java.util.Map<Integer, Integer> LJIIIIZZ;
    public final t LJIIIZ;
    public final a0 LJIIJ;
    public final y LJIIJJI;
    public final z LJIIL;
    public final x LJIILIIL;
    public final v LJIILJJIL;
    public final w LJIILL;
    public final u LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    public final void LJFF() {
        if (o.LJ(String.valueOf(this.LJIILJJIL.LIZJ), C86V.LJ().getString(R.string.i3_))) {
            if (C57469Mgz.LJFF()) {
                this.LJIILJJIL.getClass();
                return;
            } else if (((Boolean) C57469Mgz.LJ.getValue()).booleanValue()) {
                this.LJIILJJIL.getClass();
                return;
            }
        }
        this.LJIILJJIL.getClass();
    }

    public final void LIZLLL(int i) {
        int i2;
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LJIIIZ.getClass();
        if (i == 0) {
            IHeaderCTAAbility iHeaderCTAAbility = this.LIZJ;
            if (iHeaderCTAAbility != null) {
                iHeaderCTAAbility.pn0("cta_social_interaction_follow", C9HK.ICON);
            }
            if (this.LIZ != null) {
                IHeaderCTAAbility iHeaderCTAAbility2 = this.LIZJ;
                if (iHeaderCTAAbility2 != null) {
                    iHeaderCTAAbility2.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)), "cta_social_interaction_follow");
                }
                this.LJ.invoke("cta_social_interaction_follow", this.LJIIIZ.LIZJ);
            }
        } else {
            this.LJIIJ.getClass();
            if (i == 1) {
                IHeaderCTAAbility iHeaderCTAAbility3 = this.LIZJ;
                if (iHeaderCTAAbility3 != null) {
                    Integer num = this.LJFF.get("cta_social_interaction_follow");
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 1;
                    }
                    iHeaderCTAAbility3.Fz(i2, "cta_social_interaction_follow");
                }
                this.LJFF.put("cta_social_interaction_follow", 0);
                this.LJFF.put("cta_social_interaction_message", 1);
                IHeaderCTAAbility iHeaderCTAAbility4 = this.LIZJ;
                if (iHeaderCTAAbility4 != null) {
                    iHeaderCTAAbility4.pn0("cta_social_interaction_follow", C9HK.TEXT);
                }
                if (this.LIZ != null) {
                    IHeaderCTAAbility iHeaderCTAAbility5 = this.LIZJ;
                    if (iHeaderCTAAbility5 != null) {
                        iHeaderCTAAbility5.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_follow");
                    }
                    this.LIZLLL.invoke("cta_social_interaction_follow", this.LJIIJ.LIZJ);
                }
                View view2 = this.LIZ;
                if (view2 != null && view2.isEnabled()) {
                    IHeaderCTAAbility iHeaderCTAAbility6 = this.LIZJ;
                    if (iHeaderCTAAbility6 != null) {
                        iHeaderCTAAbility6.fe();
                    }
                } else {
                    IHeaderCTAAbility iHeaderCTAAbility7 = this.LIZJ;
                    if (iHeaderCTAAbility7 != null) {
                        iHeaderCTAAbility7.TG();
                    }
                }
                this.LJI = i;
                return;
            }
            this.LJIILIIL.getClass();
            if (i == 2) {
                if (this.LIZ != null) {
                    IHeaderCTAAbility iHeaderCTAAbility8 = this.LIZJ;
                    if (iHeaderCTAAbility8 != null) {
                        iHeaderCTAAbility8.pn0("cta_social_interaction_follow", C9HK.TEXT);
                    }
                    this.LIZLLL.invoke("cta_social_interaction_follow", this.LJIILIIL.LIZJ);
                    IHeaderCTAAbility iHeaderCTAAbility9 = this.LIZJ;
                    if (iHeaderCTAAbility9 != null) {
                        iHeaderCTAAbility9.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_follow");
                    }
                }
            } else {
                this.LJIIJJI.getClass();
                if (i == 3) {
                    if (this.LIZ != null) {
                        IHeaderCTAAbility iHeaderCTAAbility10 = this.LIZJ;
                        if (iHeaderCTAAbility10 != null) {
                            iHeaderCTAAbility10.pn0("cta_social_interaction_follow", C9HK.TEXT);
                        }
                        this.LIZLLL.invoke("cta_social_interaction_follow", this.LJIIJJI.LIZJ);
                        IHeaderCTAAbility iHeaderCTAAbility11 = this.LIZJ;
                        if (iHeaderCTAAbility11 != null) {
                            iHeaderCTAAbility11.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_follow");
                        }
                    }
                } else {
                    this.LJIIL.getClass();
                    if (i == 4) {
                        if (this.LIZ != null) {
                            IHeaderCTAAbility iHeaderCTAAbility12 = this.LIZJ;
                            if (iHeaderCTAAbility12 != null) {
                                iHeaderCTAAbility12.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_follow");
                            }
                            IHeaderCTAAbility iHeaderCTAAbility13 = this.LIZJ;
                            if (iHeaderCTAAbility13 != null) {
                                iHeaderCTAAbility13.pn0("cta_social_interaction_follow", C9HK.ICON_TEXT);
                            }
                            IHeaderCTAAbility iHeaderCTAAbility14 = this.LIZJ;
                            if (iHeaderCTAAbility14 != null) {
                                z zVar = this.LJIIL;
                                iHeaderCTAAbility14.Ld0(0, "cta_social_interaction_follow", zVar.LIZLLL, zVar.LIZJ);
                            }
                        }
                    } else {
                        this.LJIILLIIL.getClass();
                        if (i == 100) {
                            if (this.LIZ != null) {
                                IHeaderCTAAbility iHeaderCTAAbility15 = this.LIZJ;
                                if (iHeaderCTAAbility15 != null) {
                                    iHeaderCTAAbility15.fe();
                                }
                                IHeaderCTAAbility iHeaderCTAAbility16 = this.LIZJ;
                                if (iHeaderCTAAbility16 != null) {
                                    iHeaderCTAAbility16.pn0("cta_social_interaction_follow", C9HK.TEXT);
                                }
                                this.LIZLLL.invoke("cta_social_interaction_follow", this.LJIILLIIL.LIZJ);
                                IHeaderCTAAbility iHeaderCTAAbility17 = this.LIZJ;
                                if (iHeaderCTAAbility17 != null) {
                                    iHeaderCTAAbility17.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_follow");
                                }
                            }
                            this.LJI = i;
                            return;
                        }
                    }
                }
            }
        }
        IHeaderCTAAbility iHeaderCTAAbility18 = this.LIZJ;
        if (iHeaderCTAAbility18 != null) {
            iHeaderCTAAbility18.OI();
        }
        this.LJI = i;
    }

    public final void LIZIZ(String str, String str2) {
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

    public final void LJ(int i, int i2) {
        int i3;
        this.LJIIIIZZ.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (!((LinkedHashMap) this.LJIIIIZZ).containsValue(0)) {
            View view = this.LIZIZ;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIIIZZ).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (((Number) entry.getValue()).intValue() == 0) {
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                this.LJIILJJIL.getClass();
                if (intValue == 5) {
                    IHeaderCTAAbility iHeaderCTAAbility = this.LIZJ;
                    if (iHeaderCTAAbility != null) {
                        Integer num = this.LJFF.get("cta_social_interaction_message");
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            i3 = 1;
                        }
                        iHeaderCTAAbility.Fz(i3, "cta_social_interaction_message");
                    }
                    this.LJFF.put("cta_social_interaction_message", 0);
                    this.LJFF.put("cta_social_interaction_follow", 1);
                    View view3 = this.LIZIZ;
                    if (view3 != null) {
                        IHeaderCTAAbility iHeaderCTAAbility2 = this.LIZJ;
                        if (iHeaderCTAAbility2 != null) {
                            iHeaderCTAAbility2.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(116)), "cta_social_interaction_message");
                        }
                        IHeaderCTAAbility iHeaderCTAAbility3 = this.LIZJ;
                        if (iHeaderCTAAbility3 != null) {
                            iHeaderCTAAbility3.pn0("cta_social_interaction_message", C9HK.TEXT);
                        }
                        C26338AVi.LJI(view3, AnonymousClass391.LIZJ(4), 0, 0, 0, false, 16);
                        this.LIZLLL.invoke("cta_social_interaction_message", this.LJIILJJIL.LIZJ);
                    }
                    if (!C57469Mgz.LIZJ()) {
                        this.LJII = intValue;
                        return;
                    }
                    IHeaderCTAAbility iHeaderCTAAbility4 = this.LIZJ;
                    if (iHeaderCTAAbility4 != null) {
                        iHeaderCTAAbility4.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(164)), "cta_social_interaction_message");
                    }
                    if (C57469Mgz.LJ()) {
                        this.LJIILL.LIZJ = Integer.valueOf(R.raw.icon_paperplane);
                        this.LJIILL.LIZ = C44384HbQ.LJJZ(R.string.i3_);
                    } else if (C57469Mgz.LJFF()) {
                        this.LJIILL.LIZ = C44384HbQ.LJJZ(R.string.i3_);
                        this.LJIILL.LIZJ = Integer.valueOf(R.raw.icon_paperplane_fill);
                    }
                    IHeaderCTAAbility iHeaderCTAAbility5 = this.LIZJ;
                    if (iHeaderCTAAbility5 != null) {
                        iHeaderCTAAbility5.pn0("cta_social_interaction_message", C9HK.ICON_TEXT);
                    }
                    IHeaderCTAAbility iHeaderCTAAbility6 = this.LIZJ;
                    if (iHeaderCTAAbility6 != null) {
                        w wVar = this.LJIILL;
                        String str = wVar.LIZ;
                        iHeaderCTAAbility6.Ld0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), "cta_social_interaction_message", wVar.LIZJ, str);
                    }
                } else {
                    this.LJIILL.getClass();
                    if (intValue == 6 && this.LIZIZ != null) {
                        IHeaderCTAAbility iHeaderCTAAbility7 = this.LIZJ;
                        if (iHeaderCTAAbility7 != null) {
                            iHeaderCTAAbility7.oh(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)), "cta_social_interaction_message");
                        }
                        if (C57469Mgz.LJ()) {
                            this.LJIILL.LIZJ = null;
                            O6R.LJJIIZ(C32151Nz.LJIIZILJ(116));
                            this.LJIILL.LIZ = C44384HbQ.LJJZ(R.string.i3_);
                        } else if (C57469Mgz.LJFF()) {
                            this.LJIILL.LIZJ = Integer.valueOf(R.raw.icon_paperplane_fill);
                        }
                        this.LJ.invoke("cta_social_interaction_message", this.LJIILL.LIZJ);
                        IHeaderCTAAbility iHeaderCTAAbility8 = this.LIZJ;
                        if (iHeaderCTAAbility8 != null) {
                            iHeaderCTAAbility8.pn0("cta_social_interaction_message", C9HK.ICON);
                        }
                        this.LIZLLL.invoke("cta_social_interaction_message", this.LJIILL.LIZ);
                    }
                }
                this.LJII = intValue;
            }
        }
    }

    public final void LIZ(Boolean bool, Integer num, Integer num2) {
        if (o.LJ(bool, Boolean.TRUE)) {
            this.LJIIJ.LIZJ = C44384HbQ.LJJZ(R.string.tci);
            this.LJIILL.getClass();
            LJ(6, 8);
            this.LJIIJ.getClass();
            LIZLLL(1);
            return;
        }
        if (num == null || num.intValue() != 0 || num2 == null || num2.intValue() != 1) {
            return;
        }
        this.LJIIJ.LIZJ = C44384HbQ.LJJZ(R.string.gix);
    }

    public final void LJI(int i, User user, boolean z) {
        if (user == null) {
            return;
        }
        this.LJIJ = C57469Mgz.LJI(user);
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
        this.LJIJ = true;
        C245999l5.LIZJ(i, user.getUid(), user.getAccurateRecType(), C227768wm.LJIL(user));
    }

    public static void LIZJ(int i, User user, String str, boolean z) {
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

    public C57466Mgw(View view, View view2, IHeaderCTAAbility iHeaderCTAAbility, C53736L7c c53736L7c, C53735L7b c53735L7b, java.util.Map socialInteractionIndexMap) {
        o.LJIIIZ(socialInteractionIndexMap, "socialInteractionIndexMap");
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = iHeaderCTAAbility;
        this.LIZLLL = c53736L7c;
        this.LJ = c53735L7b;
        this.LJFF = socialInteractionIndexMap;
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new t();
        this.LJIIJ = new a0();
        this.LJIIJJI = new y();
        this.LJIIL = new z();
        this.LJIILIIL = new x();
        this.LJIILJJIL = new v();
        this.LJIILL = new w();
        this.LJIILLIIL = new u();
    }
}
