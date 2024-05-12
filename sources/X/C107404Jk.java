package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS202S0100000_1;
import Y.IDCSpanS28S0100000_1;
import Y.IDDListenerS141S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4Jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107404Jk {
    public final Context LIZ;
    public TuxSheet LIZIZ;
    public final View LIZJ;
    public final ARV LIZLLL;
    public final LinearLayout LJ;
    public final View LJFF;
    public final C119354mJ LJI;
    public final SY4 LJII;
    public final TuxTextView LJIIIIZZ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final TuxSheet LIZ() {
        ASL asl = new ASL();
        View view = this.LIZJ;
        if (view != null) {
            asl.LIZ(view);
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJLILLLLZI = new IDDListenerS141S0100000_1(this, 0);
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS151S0100000_1(this, 14));
            c235119Kp.LIZIZ(LIZJ);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLLL = c235119Kp;
            return tuxSheet2;
        }
        o.LJIJI("layoutSheet");
        throw null;
    }

    public static void LIZIZ(boolean z) {
        C107384Ji settings = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings();
        settings.LJIIIZ(z);
        settings.LJIIIIZZ();
    }

    public final void LIZJ(boolean z) {
        C119354mJ c119354mJ = this.LJI;
        if (c119354mJ != null) {
            c119354mJ.setActive(z);
        } else {
            o.LJIJI("activityStatusView");
            throw null;
        }
    }

    public C107404Jk(ActivityC45651qj activityC45651qj, FragmentManager fragmentManager) {
        this.LIZ = activityC45651qj;
        if (activityC45651qj != null) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b0i, C16880lQ.LLZIL(activityC45651qj), null);
            o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.View");
            this.LIZJ = LLLZIIL;
            View findViewById = LLLZIIL.findViewById(R.id.pl);
            o.LJIIIIZZ(findViewById, "layoutSheet.findViewById….id.activity_status_save)");
            SY4 sy4 = (SY4) findViewById;
            this.LJII = sy4;
            View findViewById2 = LLLZIIL.findViewById(R.id.ph);
            o.LJIIIIZZ(findViewById2, "layoutSheet.findViewById…vity_status_button_title)");
            this.LJIIIIZZ = (TuxTextView) findViewById2;
            View findViewById3 = LLLZIIL.findViewById(R.id.kf6);
            o.LJIIIIZZ(findViewById3, "layoutSheet.findViewById(R.id.status_switch)");
            ARV arv = (ARV) findViewById3;
            this.LIZLLL = arv;
            View findViewById4 = LLLZIIL.findViewById(R.id.cd9);
            o.LJIIIIZZ(findViewById4, "layoutSheet.findViewById(R.id.divider)");
            this.LJFF = findViewById4;
            View findViewById5 = LLLZIIL.findViewById(R.id.mr_);
            o.LJIIIIZZ(findViewById5, "layoutSheet.findViewById…id.two_buttons_container)");
            this.LJ = (LinearLayout) findViewById5;
            View findViewById6 = LLLZIIL.findViewById(R.id.pk);
            o.LJIIIIZZ(findViewById6, "layoutSheet.findViewById….activity_status_not_now)");
            View findViewById7 = LLLZIIL.findViewById(R.id.pp);
            o.LJIIIIZZ(findViewById7, "layoutSheet.findViewById….activity_status_turn_on)");
            View findViewById8 = LLLZIIL.findViewById(R.id.kf_);
            o.LJIIIIZZ(findViewById8, "layoutSheet.findViewById(R.id.status_view)");
            this.LJI = (C119354mJ) findViewById8;
            o.LJIIIIZZ(LLLZIIL.findViewById(R.id.po), "layoutSheet.findViewById…id.activity_status_title)");
            View findViewById9 = LLLZIIL.findViewById(R.id.my4);
            o.LJIIIIZZ(findViewById9, "layoutSheet.findViewById…r_avatar_activity_status)");
            C71799SFv c71799SFv = (C71799SFv) findViewById9;
            o.LJIIIIZZ(LLLZIIL.findViewById(R.id.pi), "layoutSheet.findViewById…ty_status_first_sentence)");
            o.LJIIIIZZ(LLLZIIL.findViewById(R.id.pm), "layoutSheet.findViewById…y_status_second_sentence)");
            View findViewById10 = LLLZIIL.findViewById(R.id.pn);
            o.LJIIIIZZ(findViewById10, "layoutSheet.findViewById…ty_status_third_sentence)");
            TextView textView = (TextView) findViewById10;
            View findViewById11 = LLLZIIL.findViewById(R.id.dak);
            o.LJIIIIZZ(findViewById11, "layoutSheet.findViewById(R.id.first_line_prefix)");
            View findViewById12 = LLLZIIL.findViewById(R.id.jj8);
            o.LJIIIIZZ(findViewById12, "layoutSheet.findViewById(R.id.second_line_prefix)");
            View findViewById13 = LLLZIIL.findViewById(R.id.l6l);
            o.LJIIIIZZ(findViewById13, "layoutSheet.findViewById(R.id.third_line_prefix)");
            ((TextView) findViewById11).setText("•");
            ((TextView) findViewById12).setText("•");
            ((TextView) findViewById13).setText("•");
            arv.setOnCheckedChangeListener(new IDCListenerS202S0100000_1(this, 1));
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 9));
            C16880lQ.LJJIZ((SY4) findViewById7, new ACListenerS21S0100000_1(this, 10));
            C16880lQ.LJJIZ((SY4) findViewById6, new ACListenerS21S0100000_1(this, 11));
            IMUser fromUser = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
            o.LJIIIIZZ(fromUser, "fromUser(userService.currentUser)");
            UrlModel avatarMedium = fromUser.getAvatarMedium();
            C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(avatarMedium == null ? fromUser.getAvatarThumb() : avatarMedium), null, false, new C81929WDl("ActivityStatusPopup", false, null, null, null, 62), 62);
            String string = activityC45651qj.getResources().getString(R.string.eno);
            o.LJIIIIZZ(string, "context.resources.getStr…ty_status_popup_desc_btn)");
            SpannableString spannableString = new SpannableString(activityC45651qj.getResources().getString(R.string.enn, string));
            spannableString.setSpan(new IDCSpanS28S0100000_1(this, 0), s.LJJLIIIJL(spannableString, string, 0, false, 6), spannableString.length(), 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(spannableString);
        }
    }
}
