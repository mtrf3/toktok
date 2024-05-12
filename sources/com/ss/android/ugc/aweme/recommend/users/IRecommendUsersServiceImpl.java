package com.ss.android.ugc.aweme.recommend.users;

import X.ASL;
import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C188537ab;
import X.C221018lt;
import X.C25600zU;
import X.C25778A9u;
import X.C53815LAd;
import X.C58096Mr6;
import X.C76800UCe;
import X.C79045V0n;
import X.HG3;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.M41;
import X.RBX;
import X.X1D;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerShowIntervalTimeSetting;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class IRecommendUsersServiceImpl implements IRecommendUsersService {
    public static IRecommendUsersService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IRecommendUsersService.class, false);
        if (LIZ != null) {
            return (IRecommendUsersService) LIZ;
        }
        return new IRecommendUsersServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final String LJ() {
        return C25778A9u.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZIZ() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (((X.C77202URq) r0).LIZ() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        if (r1.LJLILLLLZI == false) goto L38;
     */
    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.LKD r8) {
        /*
            r7 = this;
            X.Ol8 r4 = X.C34034DXi.LIZIZ
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            java.lang.ref.WeakReference<? extends android.app.Activity> r0 = r8.LIZ
            java.lang.Object r2 = r0.get()
            boolean r0 = r2 instanceof X.ActivityC45651qj
            r1 = 0
            if (r0 == 0) goto L1d
            X.1qj r2 = (X.ActivityC45651qj) r2
            if (r2 != 0) goto L1e
        L1d:
            return
        L1e:
            X.M43 r0 = X.M43.INBOX_PROFILE
            com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController r0 = X.M42.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel r3 = r0.LJLJJI
            r3.getClass()
            boolean r0 = X.C1E4.LJIJJLI()
            r6 = 0
            if (r0 == 0) goto L32
        L31:
            return
        L32:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L3f
            goto L31
        L3f:
            java.lang.Class<X.3YA> r1 = X.C3YA.class
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Object r0 = r0.getService(r1)
            X.3YA r0 = (X.C3YA) r0
            r5 = 1
            if (r0 == 0) goto L64
            boolean r0 = r0.LIZ()
            if (r0 != r5) goto L64
        L54:
            java.lang.String r0 = r8.LIZIZ
            if (r0 != 0) goto L5a
            java.lang.String r0 = ""
        L5a:
            r3.LJLJLJ = r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r3.LJLJL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            goto L31
        L64:
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            java.lang.String r2 = "ClientAIDebug"
            if (r0 == 0) goto L7a
            java.lang.String r0 = "disable exp"
            X.C221018lt.LJFF(r2, r0)
            goto L31
        L7a:
            boolean r0 = X.C59522Vg.LIZ()
            r4 = 2
            if (r0 == 0) goto L99
            X.M3s r1 = X.EnumC56196M3s.INBOX_AND_ME_TAB
            X.M3z r0 = X.C56203M3z.LJLIL
            X.2pm r0 = X.C78609UtB.LJJIIJ(r1, r0)
            if (r0 == 0) goto La8
            X.URq r0 = (X.C77202URq) r0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto La8
        L93:
            java.lang.String r0 = "avoid higher popup"
            X.C221018lt.LJFF(r2, r0)
            goto L31
        L99:
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.UQF r1 = r0.LJJIJIIJIL(r4, r6)
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L93
            boolean r0 = r1.LJLILLLLZI
            if (r0 == 0) goto La8
            goto L93
        La8:
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.M4C r0 = r0.getRelationService()
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto Lb6
            goto L31
        Lb6:
            boolean r0 = com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel.iv0()
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "not satisfy freq check"
            X.C221018lt.LJFF(r2, r0)
            goto L31
        Lc3:
            boolean r0 = com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel.hv0(r5)
            if (r0 != 0) goto Lcf
            boolean r0 = com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel.hv0(r4)
            if (r0 == 0) goto Ld6
        Lcf:
            java.lang.String r0 = "has go through rec user popup"
            X.C221018lt.LJFF(r2, r0)
            goto L31
        Ld6:
            boolean r0 = r3.LJLJI
            if (r0 != 0) goto L54
            java.lang.String r0 = "has data in inbox and profile"
            X.C221018lt.LJFF(r2, r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl.LIZ(X.LKD):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r4 - r6.longValue()) > java.util.concurrent.TimeUnit.DAYS.toMillis(30)) goto L24;
     */
    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl.LIZLLL(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIIIZZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enterFrom = ");
        LIZ.append(str);
        C221018lt.LJFF("NewUserProtection", X1D.LIZIZ(LIZ));
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C221018lt.LJFF("NewUserProtection", "un login");
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current user nickname = ");
        LIZ2.append(curUser.getNickname());
        C221018lt.LJFF("NewUserProtection", X1D.LIZIZ(LIZ2));
        if (!C53815LAd.LIZIZ()) {
            if ((System.currentTimeMillis() / 1000) - curUser.getRegisterTime() >= LiveInsertStickerShowIntervalTimeSetting.DEFAULT) {
                return;
            }
            C53815LAd.LIZ.storeBoolean(C53815LAd.LIZ("rcmd_new_user_protection_flag"), true);
            C53815LAd.LIZJ();
            return;
        }
        C53815LAd.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LJI(String str, String str2) {
        if (AV1.LJIIJJI() || !HG3.LJIILL().isLogin() || !TextUtils.equals("HOME", str) || (!TextUtils.equals("NOTIFICATION", str2) && !TextUtils.equals("USER", str2))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJII(String str, String str2) {
        new M41().LIZ(new DislikeRecommendParams(str, str2)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9CG
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9CF
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C36922EeM.LJFF((Throwable) obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJFF(ActivityC45651qj activityC45651qj, String enterFrom, String str) {
        String str2 = str;
        o.LJIIIZ(enterFrom, "enterFrom");
        C25600zU c25600zU = new C25600zU(activityC45651qj, R.style.ul);
        C25600zU c25600zU2 = new C25600zU(activityC45651qj, R.style.ux);
        if (!AnonymousClass636.LJIILJJIL(activityC45651qj)) {
            c25600zU2 = c25600zU;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.tz, C16880lQ.LLZIL(c25600zU2), null);
        o.LJIIIIZZ(LLLZIIL, "from(currContext).inflat…suggest_tab_dialog, null)");
        View findViewById = LLLZIIL.findViewById(R.id.mm1);
        o.LJIIIIZZ(findViewById, "dialogView.findViewById(R.id.tv_suggest)");
        TextView textView = (TextView) findViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Integer LJI = C79045V0n.LJI(R.attr.gu, c25600zU2);
        if (LJI != null) {
            textView.setHighlightColor(LJI.intValue());
        }
        ASL asl = new ASL();
        asl.LIZ.LJLLI = LLLZIIL;
        asl.LJI(4);
        TuxSheet tuxSheet = asl.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(C188537ab.LIZ(c25600zU2, R.string.h17, R.string.hsk, R.string.ghb, 42, enterFrom, str2, 1, new AqS159S0100000_9(tuxSheet, 1064)));
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "SUGGEST_ACCOUNT_INFO_ICON");
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final Spanned LIZJ(Context context, Integer num, Integer num2, Integer num3, int i, String enterFrom, String str, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = R.string.h17;
        }
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = R.string.hsk;
        }
        if (num3 != null) {
            i5 = num3.intValue();
        } else {
            i5 = R.string.ghb;
        }
        return C188537ab.LIZ(context, i3, i4, i5, i, enterFrom, str, i2, interfaceC65784Pro);
    }
}
