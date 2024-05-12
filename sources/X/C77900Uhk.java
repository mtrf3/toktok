package X;

import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import Y.IDDListenerS152S0100000_13;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.reminder.AdNoticeCalendar;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77900Uhk {
    public final ActivityC45651qj LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final AdNoticeCalendar LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final OCX LJIILIIL;
    public final View LJIILJJIL;
    public final TextView LJIILL;
    public final TextView LJIILLIIL;
    public final TextView LJIIZILJ;
    public final SY4 LJIJ;
    public final SY4 LJIJI;
    public final LinearLayout LJIJJ;
    public final C223338pd LJIJJLI;
    public final View LJIL;
    public final C62822Ol8 LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public boolean LJJII;
    public NewLiveRoomStruct LJJIII;
    public boolean LJJIIJ;

    public final void LIZIZ() {
        ASQ.LIZLLL(this.LJIILJJIL, ASX.LIZ);
    }

    public final void LJFF() {
        String LIZ;
        AqS179S0100000_13 aqS179S0100000_13;
        String str;
        boolean z;
        if (o.LJ(this.LIZJ, "countdown_reminder")) {
            if (LIZLLL()) {
                LJIIJ(this, this.LIZ.getResources().getString(R.string.b8g), new ACListenerS33S0100000_13(this, 207), null, null, false, 48);
                return;
            }
        } else if (o.LJ(this.LIZJ, "countdown_reminder_live")) {
            if (LIZLLL()) {
                if (this.LJJII) {
                    LIZ = C03660Ck.LIZ(this.LIZ, R.string.b8n, "activity.resources.getSt….ad_countdown_watch_live)");
                } else {
                    LIZ = C03660Ck.LIZ(this.LIZ, R.string.b8h, "activity.resources.getSt…ng.ad_countdown_live_end)");
                }
                LJIIJ(this, LIZ, new ACListenerS33S0100000_13(this, 208), null, null, this.LJJII, 32);
                return;
            }
        } else if (o.LJ(this.LIZJ, "countdown_reminder_game") && LIZLLL()) {
            LJIIJ(this, this.LIZ.getResources().getString(R.string.b8b), new ACListenerS33S0100000_13(this, 209), null, null, false, 48);
            return;
        }
        if (this.LJJI == 0) {
            LJIIJ(this, this.LIZ.getResources().getString(R.string.b8j), new ACListenerS33S0100000_13(this, 210), null, null, false, 48);
            return;
        }
        ACListenerS33S0100000_13 aCListenerS33S0100000_13 = null;
        if (this.LJFF != null) {
            aqS179S0100000_13 = new AqS179S0100000_13(this, 666);
            str = this.LIZ.getResources().getString(R.string.b89);
            z = true;
        } else {
            aqS179S0100000_13 = null;
            str = null;
            z = false;
        }
        AqS179S0100000_13 aqS179S0100000_132 = new AqS179S0100000_13(this, 667);
        if (aqS179S0100000_13 != null) {
            aCListenerS33S0100000_13 = new ACListenerS33S0100000_13((Object) aqS179S0100000_13, 211);
        }
        LJIIJ(this, str, aCListenerS33S0100000_13, this.LIZ.getResources().getString(R.string.b8i), new ACListenerS33S0100000_13((Object) aqS179S0100000_132, 211), z, 32);
    }

    public final void LJI() {
        if (o.LJ(this.LIZJ, "countdown_reminder")) {
            this.LJIILL.setText(this.LIZ.getResources().getString(R.string.b8z, this.LIZLLL));
            this.LJIILLIIL.setText((String) this.LJJ.getValue());
            if (this.LJJI == 1) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8p));
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8s, this.LIZLLL));
            }
            if (LIZLLL()) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8v));
                return;
            }
            return;
        }
        if (o.LJ(this.LIZJ, "countdown_reminder_live")) {
            this.LJIILL.setText(this.LIZ.getResources().getString(R.string.b8m, this.LIZLLL));
            this.LJIILLIIL.setText((String) this.LJJ.getValue());
            if (this.LJJI == 1) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8r));
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8u, this.LIZLLL));
            }
            if (!LIZLLL()) {
                return;
            }
            if (this.LJJII) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8y, this.LIZLLL));
                return;
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8w));
                return;
            }
        }
        if (!o.LJ(this.LIZJ, "countdown_reminder_game")) {
            return;
        }
        if (LIZLLL()) {
            this.LJIILL.setText(this.LIZ.getResources().getString(R.string.b8l, this.LIZLLL));
        } else {
            this.LJIILL.setText(this.LIZ.getResources().getString(R.string.b8k, this.LIZLLL));
        }
        this.LJIILLIIL.setText((String) this.LJJ.getValue());
        if (this.LJJI == 1) {
            this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8q, this.LIZLLL));
        } else {
            this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8t, this.LIZLLL));
        }
        if (!LIZLLL()) {
            return;
        }
        String str = this.LJIIL;
        if (str == null) {
            str = "Google Play";
        }
        this.LJIIZILJ.setText(this.LIZ.getResources().getString(R.string.b8x, str));
    }

    public final void LJIIIIZZ() {
        if (this.LJJIIJ) {
            return;
        }
        ASL asl = new ASL();
        asl.LIZ(this.LJIILJJIL);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS152S0100000_13(this, 26);
        tuxSheet.showNow(this.LIZ.getSupportFragmentManager(), null);
        this.LJJIIJ = true;
    }

    public final void LJIIIZ() {
        if (o.LJ(this.LIZJ, "countdown_reminder") || o.LJ(this.LIZJ, "countdown_reminder_game")) {
            LJII(false);
            LIZJ();
        } else {
            if (o.LJ(this.LIZJ, "countdown_reminder_live")) {
                String str = this.LJII;
                if (str == null) {
                    return;
                }
                this.LJIILIIL.LIZ(str, this.LJIIIIZZ, new AfS65S0100000_13(this, 237), new AfS65S0100000_13(this, 238));
                return;
            }
            LIZIZ();
        }
    }

    public final void LIZJ() {
        String str;
        Object obj;
        LJI();
        LJFF();
        LJIIIIZZ();
        String enterFrom = this.LIZIZ;
        String stickerType = this.LIZJ;
        String cId = this.LJIIIZ;
        String str2 = this.LJIIJJI;
        boolean LIZLLL = LIZLLL();
        boolean z = this.LJJII;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(cId, "cId");
        C58655N0h LJ = C58704N2e.LJ("draw_ad", "othershow", cId, str2, null);
        if (LIZLLL) {
            str = "expired_reminder_window";
        } else {
            str = "reminder_window";
        }
        LJ.LIZJ(str, "refer");
        String str3 = "1";
        if (TextUtils.equals(enterFrom, "draw_ad")) {
            obj = "1";
        } else {
            obj = "2";
        }
        LJ.LIZIZ(obj, "window_type");
        if (LIZLLL && o.LJ(stickerType, "countdown_reminder_live")) {
            if (!z) {
                str3 = "2";
            }
            LJ.LIZIZ(str3, "live_status");
        }
        LJ.LJI();
    }

    public final boolean LIZLLL() {
        if (System.currentTimeMillis() > this.LJ) {
            return true;
        }
        return false;
    }

    public static int LJ(SY4 sy4) {
        String charSequence = sy4.getText().toString();
        Rect rect = new Rect();
        sy4.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
        return rect.width();
    }

    public final float LIZ(float f) {
        return KL2.LIZJ(this.LIZ, f);
    }

    public final void LJII(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
        }
        this.LJIL.setVisibility(i);
        if (i == 0) {
            this.LJIJJLI.LIZIZ();
        } else {
            this.LJIJJLI.LIZJ();
        }
        this.LJIILL.setVisibility(i2);
        this.LJIILLIIL.setVisibility(i2);
        this.LJIIZILJ.setVisibility(i2);
        this.LJIJJ.setVisibility(i2);
    }

    public static void LJIIJ(C77900Uhk c77900Uhk, String str, View.OnClickListener onClickListener, String str2, ACListenerS33S0100000_13 aCListenerS33S0100000_13, boolean z, int i) {
        boolean z2;
        int width;
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c77900Uhk.LJIJ.setEnabled(z);
        c77900Uhk.LJIJI.setEnabled(z2);
        if (str == null) {
            c77900Uhk.LJIJ.setVisibility(8);
        } else {
            c77900Uhk.LJIJ.setVisibility(0);
        }
        if (str2 == null) {
            c77900Uhk.LJIJI.setVisibility(8);
        } else {
            c77900Uhk.LJIJI.setVisibility(0);
        }
        C16880lQ.LJJIZ(c77900Uhk.LJIJ, onClickListener);
        C16880lQ.LJJIZ(c77900Uhk.LJIJI, aCListenerS33S0100000_13);
        SY4 sy4 = c77900Uhk.LJIJ;
        if (str == null) {
            str = "";
        }
        sy4.setText(str);
        SY4 sy42 = c77900Uhk.LJIJI;
        if (str2 == null) {
            str2 = "";
        }
        sy42.setText(str2);
        int LJ = LJ(c77900Uhk.LJIJ);
        int LJ2 = LJ(c77900Uhk.LJIJI);
        if (LJ <= LJ2) {
            LJ = LJ2;
        }
        if (c77900Uhk.LJIJJ.getWidth() <= 0) {
            c77900Uhk.LJIJJ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            width = c77900Uhk.LJIJJ.getMeasuredWidth();
        } else {
            width = c77900Uhk.LJIJJ.getWidth();
        }
        if (LJ > (width - c77900Uhk.LIZ(45.0f)) / 2) {
            c77900Uhk.LJIJJ.removeAllViews();
            c77900Uhk.LJIJJ.addView(c77900Uhk.LJIJ);
            c77900Uhk.LJIJJ.addView(c77900Uhk.LJIJI);
            LinearLayout linearLayout = c77900Uhk.LJIJJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) c77900Uhk.LIZ(44.0f);
            layoutParams.bottomMargin = (int) c77900Uhk.LIZ(20.0f);
            layoutParams.setMarginStart((int) c77900Uhk.LIZ(32.0f));
            layoutParams.setMarginEnd((int) c77900Uhk.LIZ(32.0f));
            linearLayout.setLayoutParams(layoutParams);
            c77900Uhk.LJIJJ.setOrientation(1);
            if (c77900Uhk.LJIJ.getVisibility() == 0) {
                c77900Uhk.LJIJ.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
            if (c77900Uhk.LJIJI.getVisibility() == 0) {
                SY4 sy43 = c77900Uhk.LJIJI;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = (int) c77900Uhk.LIZ(8.0f);
                sy43.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        c77900Uhk.LJIJJ.removeAllViews();
        c77900Uhk.LJIJJ.addView(c77900Uhk.LJIJI);
        c77900Uhk.LJIJJ.addView(c77900Uhk.LJIJ);
        LinearLayout linearLayout2 = c77900Uhk.LJIJJ;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = (int) c77900Uhk.LIZ(44.0f);
        layoutParams3.bottomMargin = (int) c77900Uhk.LIZ(20.0f);
        layoutParams3.setMarginStart((int) c77900Uhk.LIZ(32.0f));
        layoutParams3.setMarginEnd((int) c77900Uhk.LIZ(32.0f));
        linearLayout2.setLayoutParams(layoutParams3);
        c77900Uhk.LJIJJ.setOrientation(0);
        if (c77900Uhk.LJIJI.getVisibility() == 0) {
            SY4 sy44 = c77900Uhk.LJIJI;
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.weight = 1.0f;
            sy44.setLayoutParams(layoutParams4);
        }
        if (c77900Uhk.LJIJ.getVisibility() != 0) {
            return;
        }
        SY4 sy45 = c77900Uhk.LJIJ;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.leftMargin = (int) c77900Uhk.LIZ(8.0f);
        sy45.setLayoutParams(layoutParams5);
    }

    public C77900Uhk(ActivityC45651qj activityC45651qj, String str, String str2, String str3, String str4, long j, AdNoticeCalendar adNoticeCalendar, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = adNoticeCalendar;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
        this.LJIILIIL = new OCX(activityC45651qj);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj), R.layout.cnw, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(activity)\n        .…alog_layout, null, false)");
        this.LJIILJJIL = LLLLIILL;
        this.LJJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 735));
        this.LJJIFFI = 5;
        View findViewById = LLLLIILL.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "reminderDialogView.findViewById(R.id.title)");
        this.LJIILL = (TextView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById2, "reminderDialogView.findViewById(R.id.loading)");
        this.LJIJJLI = (C223338pd) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.g8a);
        o.LJIIIIZZ(findViewById3, "reminderDialogView.findV…d(R.id.loading_container)");
        this.LJIL = findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.krt);
        o.LJIIIIZZ(findViewById4, "reminderDialogView.findViewById(R.id.subtitle)");
        this.LJIILLIIL = (TextView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ghd);
        o.LJIIIIZZ(findViewById5, "reminderDialogView.findViewById(R.id.message)");
        this.LJIIZILJ = (TextView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.ay5);
        o.LJIIIIZZ(findViewById6, "reminderDialogView.findViewById(R.id.btn_primary)");
        this.LJIJ = (SY4) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.ayx);
        o.LJIIIIZZ(findViewById7, "reminderDialogView.findV…wById(R.id.btn_secondary)");
        this.LJIJI = (SY4) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.b0f);
        o.LJIIIIZZ(findViewById8, "reminderDialogView.findV…ById(R.id.btns_container)");
        this.LJIJJ = (LinearLayout) findViewById8;
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 206), LLLLIILL.findViewById(R.id.ea3));
        if (o.LJ(str2, "countdown_reminder_live")) {
            this.LJJIFFI = 6;
        } else {
            if (!o.LJ(str2, "countdown_reminder_game")) {
                return;
            }
            this.LJJIFFI = 7;
        }
    }
}
