package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57467Mgx {
    public final View LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public final SY4 LIZ() {
        Object value = this.LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-dmEntry>(...)");
        return (SY4) value;
    }

    public final TextView LIZIZ() {
        Object value = this.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-followBn>(...)");
        return (TextView) value;
    }

    public final View LIZLLL() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-followIv>(...)");
        return (View) value;
    }

    public final View LJ() {
        Object value = this.LIZLLL.getValue();
        o.LJIIIIZZ(value, "<get-followIv16>(...)");
        return (View) value;
    }

    public final SY4 LJFF() {
        Object value = this.LJIIJJI.getValue();
        o.LJIIIIZZ(value, "<get-following>(...)");
        return (SY4) value;
    }

    public final TextView LJI() {
        Object value = this.LJI.getValue();
        o.LJIIIIZZ(value, "<get-requestedBtn>(...)");
        return (TextView) value;
    }

    public final SY4 LJII() {
        Object value = this.LJ.getValue();
        o.LJIIIIZZ(value, "<get-sendMsgBtn>(...)");
        return (SY4) value;
    }

    public final void LJIIJ() {
        if (o.LJ(LJII().getText().toString(), C86V.LJ().getString(R.string.i3_))) {
            if (C57469Mgz.LJFF()) {
                LJII().setButtonStartIcon(Integer.valueOf(R.raw.icon_paperplane_fill));
                return;
            } else if (((Boolean) C57469Mgz.LJ.getValue()).booleanValue()) {
                LJII().setButtonStartIcon(Integer.valueOf(R.raw.icon_paperplane));
                return;
            }
        }
        LJII().setButtonStartIcon(null);
    }

    public C57467Mgx(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 503));
        this.LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 506));
        this.LIZLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 507));
        this.LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 513));
        this.LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 505));
        this.LJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 512));
        this.LJII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 509));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 511));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 510));
        this.LJIIJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 504));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 508));
    }

    public static int LIZJ(int i) {
        if (!C57469Mgz.LJFF()) {
            return i;
        }
        if (i == R.raw.icon_person_tick) {
            return R.raw.icon_person_tick_fill;
        }
        if (i != R.raw.icon_person_arrow_left_right) {
            return i;
        }
        return R.raw.icon_person_arrow_left_right_fill;
    }

    public final void LJIIIIZZ(String str, String str2) {
        if (str2 == null) {
            return;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (!C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), str2, 6)) {
            return;
        }
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "others_homepage"), new OSZ("enter_method", "button"));
        if (o.LJ(str, "show")) {
            InterfaceC221688my imSayhiAnalytics = createIIMServicebyMonsterPlugin.getImSayhiAnalytics();
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "view.context");
            imSayhiAnalytics.LIZ(str2, LJJLIIIIJ, C57434MgQ.LIZIZ(context), true);
            return;
        }
        if (!o.LJ(str, "click")) {
            return;
        }
        createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZIZ(str2, LJJLIIIIJ);
    }

    public final void LJIIJJI(int i, User user, boolean z) {
        if (user == null) {
            return;
        }
        this.LJIILIIL = C57469Mgz.LJI(user);
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
        this.LJIILIIL = true;
        C245999l5.LIZJ(i, user.getUid(), user.getAccurateRecType(), C227768wm.LJIL(user));
    }

    public static void LJIIIZ(int i, User user, String str, boolean z) {
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
