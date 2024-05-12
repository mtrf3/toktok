package com.ss.android.ugc.aweme.profile.widgets.enterprise;

import X.AV1;
import X.C16880lQ;
import X.C17J;
import X.C188727au;
import X.C212428Vi;
import X.C234999Kd;
import X.C237259Sv;
import X.C237559Tz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C58704N2e;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C73340SqO;
import X.C76W;
import X.C79045V0n;
import X.C86V;
import X.C8VC;
import X.C9ID;
import X.C9IL;
import X.C9KV;
import X.C9L9;
import X.C9PL;
import X.C9PN;
import X.C9TO;
import X.FMX;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC65784Pro;
import X.NN1;
import X.OJY;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.OfflineInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS59S1200000_4;
import kotlin.jvm.internal.AqS72S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEnterpriseBAAssem extends UIContentAssem implements BAProfileTransformLayoutAbility {
    public final C55749LuL LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final Set<Integer> LJLJJL;
    public LinearLayout LJLJJLL;

    public ProfileEnterpriseBAAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        this.LJLJJI = true;
        this.LJLJJL = new LinkedHashSet();
    }

    public final boolean L7() {
        C9ID c9id = (C9ID) this.LJLIL.getValue();
        if (c9id != null) {
            return c9id.LJLJI;
        }
        return false;
    }

    public final User getUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final void F3() {
        String str;
        User user = getUser();
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        if (!AV1.LJIJI(str) && this.LJLJI && !this.LJLILLLLZI && this.LJLJJL.contains(Integer.valueOf(R.id.ae9))) {
            new C237559Tz().LJJIII(getUser(), getEnterFrom());
            this.LJLILLLLZI = true;
        }
    }

    public final Aweme getAweme() {
        if (L7()) {
            C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
            if (c9pl != null) {
                return c9pl.LJII;
            }
        } else {
            C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn != null) {
                return c9pn.LJI;
            }
        }
        return null;
    }

    public final String getEnterFrom() {
        String str;
        String uid = AV1.LIZIZ().getUid();
        User user = getUser();
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        if (TextUtils.equals(uid, str)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), BAProfileTransformLayoutAbility.class, null);
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLILLLLZI = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        F3();
    }

    public static String v3(User user) {
        C237559Tz c237559Tz = new C237559Tz();
        c237559Tz.LJIIIZ(user);
        return String.valueOf(c237559Tz.LIZLLL("enter_from"));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.enterprise.BAProfileTransformLayoutAbility
    public final boolean fH(User user) {
        if (AV1.LJIJ(user)) {
            if (user.getAccountType() != 3 || !C9TO.LIZ()) {
                return false;
            }
        } else if (user.getAccountType() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJJLL = (LinearLayout) view;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, BAProfileTransformLayoutAbility.class, null);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9L7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 694));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9L4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 695));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9L5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 696));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9L6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PN) obj).LJIIIZ);
            }
        }, new AqS170S0100000_4(this, 697));
    }

    public final void A3(User user, OfflineInfo offlineInfo) {
        String action;
        Integer num;
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        String str = null;
        if (((bizAccountInfo == null || (action = bizAccountInfo.getAndroidDownloadAppLink()) == null) && (offlineInfo == null || (action = offlineInfo.getAction()) == null)) || TextUtils.isEmpty(action)) {
            return;
        }
        LinearLayout linearLayout = this.LJLJJLL;
        if (linearLayout != null) {
            BizAccountInfo bizAccountInfo2 = user.getBizAccountInfo();
            if (bizAccountInfo2 != null && bizAccountInfo2.getAndroidDownloadAppLink() != null) {
                num = Integer.valueOf(R.string.c31);
            } else {
                num = null;
            }
            LinearLayout linearLayout2 = this.LJLJJLL;
            boolean z = false;
            if (linearLayout2 != null && linearLayout2.getChildCount() > 0) {
                z = true;
            }
            AqS59S1200000_4 aqS59S1200000_4 = new AqS59S1200000_4(user, this, action, 1);
            if (offlineInfo != null) {
                str = offlineInfo.getText();
            }
            linearLayout.addView(x3(this, R.id.ae9, num, R.raw.icon_arrow_down_to_line, z, aqS59S1200000_4, null, str, 32));
        }
        this.LJLJJL.add(Integer.valueOf(R.id.ae9));
        E3(user, "download_link");
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_DOWNLOAD_APP".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, true);
    }

    public final void C3(User user, String str) {
        boolean z;
        AwemeRawAd awemeRawAd;
        Aweme aweme = getAweme();
        if (aweme != null && C63081OpJ.LJLIL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            OJY LJIL = C73340SqO.LJIL();
            Context context = getContext();
            Aweme aweme2 = getAweme();
            LJIL.getClass();
            NN1.LJJJJJ(context, "homepagelink_click", aweme2, NN1.LJIIIZ(context, aweme2));
            Aweme aweme3 = getAweme();
            if (aweme3 != null) {
                awemeRawAd = aweme3.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58704N2e.LIZLLL("homepage_ad", "homepagelink_click", awemeRawAd).LJII();
        }
        getContext();
        String v3 = v3(user);
        String uid = user.getUid();
        if (uid == null) {
            uid = "";
        }
        C76W c76w = new C76W();
        c76w.LIZ("link_type", str);
        FMX.LJIIJ("click_link", v3, uid, CardStruct.IStatusCode.DEFAULT, c76w.LIZIZ());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", user.getUid());
        c188727au.LJIIIZ("enter_from", v3(user));
        c188727au.LJIIIZ("link_type", str);
        Aweme aweme4 = getAweme();
        if (aweme4 != null) {
            str2 = aweme4.getAid();
        }
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJ(0L, "cid");
        c188727au.LJIIIZ("log_extra", "");
        FMX.LJIIL("click_link", c188727au.LIZ);
        Aweme aweme5 = getAweme();
        if (aweme5 != null && aweme5.isAd()) {
            if (o.LJ(str, "download_link")) {
                OJY LJIL2 = C73340SqO.LJIL();
                Context context2 = getContext();
                Aweme aweme6 = getAweme();
                LJIL2.getClass();
                OJY.LJFF(context2, aweme6);
                return;
            }
            if (!o.LJ(str, "web_link")) {
                return;
            }
            OJY LJIL3 = C73340SqO.LJIL();
            Context context3 = getContext();
            Aweme aweme7 = getAweme();
            LJIL3.getClass();
            OJY.LJIIJ(context3, aweme7);
        }
    }

    public final void E3(User user, String str) {
        String v3 = v3(user);
        getContext();
        String uid = user.getUid();
        C76W c76w = new C76W();
        c76w.LIZ("link_type", str);
        FMX.LJIIJ("show_link", v3, uid, CardStruct.IStatusCode.DEFAULT, c76w.LIZIZ());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", user.getUid());
        c188727au.LJIIIZ("enter_from", v3);
        c188727au.LJIIIZ("link_type", str);
        FMX.LJIIL("show_link", c188727au.LIZ);
    }

    public static View x3(ProfileEnterpriseBAAssem profileEnterpriseBAAssem, int i, Integer num, int i2, boolean z, InterfaceC65784Pro interfaceC65784Pro, AqS72S1100000_4 aqS72S1100000_4, String str, int i3) {
        String str2;
        final float f;
        Float LJIIIZ;
        int i4 = 0;
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 32) != 0) {
            aqS72S1100000_4 = null;
        }
        if ((i3 & 64) != 0) {
            str = null;
        }
        profileEnterpriseBAAssem.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c43, C16880lQ.LLZIL(profileEnterpriseBAAssem.getContext()), null);
        View findViewById = LLLZIIL.findViewById(R.id.cxb);
        final TuxIconView tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.cxc);
        final TuxTextView tuxTextView = (TuxTextView) LLLZIIL.findViewById(R.id.cxf);
        if (!z) {
            i4 = 8;
        }
        findViewById.setVisibility(i4);
        tuxIconView.setIconRes(i2);
        tuxIconView.setTintColorRes(R.attr.eb);
        if (num != null) {
            str = C86V.LJFF(num.intValue());
        }
        tuxTextView.setText(str);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(interfaceC65784Pro, 304), LLLZIIL);
        b.LJIL(aqS72S1100000_4, C9L9.LJLIL, new AqS170S0100000_4(LLLZIIL, 1464));
        LLLZIIL.setId(i);
        if (i == R.id.ae6) {
            str2 = "ba_call";
        } else if (i == R.id.ae_) {
            str2 = "ba_email";
        } else if (i == R.id.ae5) {
            str2 = "ba_address";
        } else if (i == R.id.ae9) {
            str2 = "ba_download_link";
        } else {
            str2 = "";
        }
        C237259Sv.LJIIL(System.currentTimeMillis() - currentTimeMillis, str2);
        Context context = profileEnterpriseBAAssem.getContext();
        if (context != null && (LJIIIZ = C79045V0n.LJIIIZ(context)) != null) {
            f = LJIIIZ.floatValue();
        } else {
            f = 0.2f;
        }
        LLLZIIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.2RV
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ViewPropertyAnimator alpha;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator alpha2;
                ViewPropertyAnimator duration2;
                ViewPropertyAnimator alpha3;
                ViewPropertyAnimator duration3;
                ViewPropertyAnimator alpha4;
                ViewPropertyAnimator duration4;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    ViewPropertyAnimator animate = tuxIconView.animate();
                    if (animate != null && (alpha4 = animate.alpha(1.0f)) != null && (duration4 = alpha4.setDuration(0L)) != null) {
                        duration4.start();
                    }
                    ViewPropertyAnimator animate2 = tuxTextView.animate();
                    if (animate2 == null || (alpha3 = animate2.alpha(1.0f)) == null || (duration3 = alpha3.setDuration(0L)) == null) {
                        return false;
                    }
                    duration3.start();
                    return false;
                }
                ViewPropertyAnimator animate3 = tuxIconView.animate();
                if (animate3 != null && (alpha2 = animate3.alpha(f)) != null && (duration2 = alpha2.setDuration(0L)) != null) {
                    duration2.start();
                }
                ViewPropertyAnimator animate4 = tuxTextView.animate();
                if (animate4 == null || (alpha = animate4.alpha(f)) == null || (duration = alpha.setDuration(0L)) == null) {
                    return false;
                }
                duration.start();
                return false;
            }
        });
        return LLLZIIL;
    }
}
