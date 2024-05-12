package X;

import Y.IDaS217S0100000_6;
import Y.IDuS313S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import djb.IDaS20S0000000_1;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ujb.s;

/* renamed from: X.SOq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72028SOq {
    public static final String LIZIZ() {
        IMService.createIIMServicebyMonsterPlugin(false).getImFilterKeywordsService().LIZ();
        return "is_disabled";
    }

    public static final boolean LJII() {
        return IMService.createIIMServicebyMonsterPlugin(false).getImChatSettingsService().LIZ();
    }

    public static final boolean LJIIIZ() {
        return IMService.createIIMServicebyMonsterPlugin(false).getImIIMNudeFilterService().isEnabled();
    }

    public static final void LJIILIIL() {
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIIIZ();
    }

    public static final boolean LJIIIIZZ() {
        return C62623Ohv.LIZIZ.LJIILJJIL();
    }

    public static final void LJIIJ() {
        C235779Nd.LIZ.LJIIIZ().LIZLLL(Boolean.TRUE);
    }

    public static final boolean LJIIJJI() {
        LQA lqa = LQA.LIZIZ;
        if (lqa.LJIJI() && lqa.LJJ().LJLIL) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL() {
        C53578L1a.LIZ.getClass();
        return C53578L1a.LIZ();
    }

    public static final void LJIILL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        FMX.LJIIL("enter_comment_filter", c188727au.LIZ);
        boolean LIZIZ = C63024OoO.LIZIZ();
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "privacy_setting");
        c188727au2.LIZLLL(LIZIZ ? 1 : 0, "is_show_management");
        FMX.LJIIL("enter_filter_comment", c188727au2.LIZ);
    }

    public static final boolean LJIIZILJ() {
        return LHM.LIZIZ.LIZ().friendsTabStylePrivacyHint();
    }

    public final C73411SrX LIZ() {
        C64962gm LIZ = C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 12).plus(T2R.LJIIJJI()));
        return (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS313S0100000_1(LIZ, 1)).LJIJ(new IDaS217S0100000_6(LIZ, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EI
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9EJ
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static final OSZ<String, CharSequence> LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        C54039LIt LJJ = LQA.LIZIZ.LJJ();
        return new OSZ<>(LJJ.LJLILLLLZI, LJJ.LJLJI);
    }

    public static final void LJIILJJIL(boolean z) {
        LQA.LIZIZ.LIZLLL(z);
    }

    public static final void LJIILLIIL(int i) {
        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
        if (i != 1) {
            if (i != 2) {
                return;
            }
            activityStatusViewModel.LJ();
        } else {
            activityStatusViewModel.LIZLLL();
            activityStatusViewModel.LJIILIIL(false);
        }
    }

    public static final void LJIJ(int i) {
        if (i == 1) {
            C3B3.LIZJ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel(), "activity_status_setting_changed", 0L, 6);
        }
    }

    public static final void LJIJI(int i) {
        IMService.createIIMServicebyMonsterPlugin(false).getImChatSettingsService().LJ(i);
        if (i != 1) {
            if (i != 4) {
                return;
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LJFF();
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImChatSettingsService().LIZIZ();
    }

    public static final void LJIJJ(int i) {
        User LIZ = C71945SLl.LIZ();
        LIZ.setCommentSetting(i);
        C71945SLl.LJ().LJFF().updateCurUser(LIZ);
    }

    public static final void LJIJJLI(int i) {
        C235779Nd.LIZ.LJIIJJI().LIZLLL(Integer.valueOf(i));
        C2U8.LIZ(new MGO());
    }

    public static final CharSequence LIZLLL(final Context context, final boolean z) {
        int i;
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.rls);
        String LIZIZ = OKG.LIZIZ(string, "context.getString(R.stri…ettings_read_status_body)", context, R.string.rlt, "context.getString(R.stri…read_status_body_txt_btn)");
        int i2 = 0;
        String LIZIZ2 = Q8U.LIZIZ(new Object[]{LIZIZ}, 1, string, "format(format, *args)");
        SpannableString spannableString = new SpannableString(LIZIZ2);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ2, LIZIZ, 0, false, 6);
        int length = LIZIZ.length() + LJJLIIIJL;
        spannableString.setSpan(new ClickableSpan() { // from class: X.4hX
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                if (C2NU.LIZ.LIZIZ()) {
                    if (IMService.createIIMServicebyMonsterPlugin(false).getImChatSettingsService().LIZ() && z) {
                        return;
                    }
                    String lowerCase = SettingServiceImpl.LIZ().getAppLanguage().toLowerCase();
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                    SmartRoute LIZ = m0.LIZ(context, "aweme://webview", "url", new C38281F0r(Q8U.LIZIZ(new Object[]{lowerCase}, 1, "https://support.tiktok.com/%s/using-tiktok/messaging-and-notifications/direct-message-settings#7", "format(format, *args)")).LJ(), "title", "");
                    LIZ.withParam("show_separate_line", true);
                    LIZ.open();
                    return;
                }
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setUnderlineText(false);
            }
        }, LJJLIIIJL, length, 33);
        spannableString.setSpan(new T5U(72, false), LJJLIIIJL, length, 33);
        if (C53332KwS.LIZ() && z) {
            i = R.attr.gp;
        } else {
            i = R.attr.go;
        }
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            i2 = LJI.intValue();
        }
        spannableString.setSpan(new ForegroundColorSpan(i2), LJJLIIIJL, length, 33);
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence LJ(Context context, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(context, "context");
        boolean z = !TextUtils.isEmpty(C71945SLl.LIZ().getBindPhone());
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        if (!c77266UUc.LJI()) {
            CharSequence text = context.getText(R.string.jd_);
            o.LJIIIIZZ(text, "context.getText(R.string…on_contacts_description1)");
            if (z) {
                return text;
            }
            C72062SPy c72062SPy = new C72062SPy();
            String string = context.getString(R.string.jdb);
            o.LJIIIIZZ(string, "context.getString(R.stri…ntacts_description2_link)");
            c72062SPy.LIZIZ = string;
            c72062SPy.LJ(1);
            c72062SPy.LIZ = false;
            c72062SPy.LIZIZ(62);
            c72062SPy.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 73);
            Spanned LJIJ = C1A7.LJIJ(context, R.string.jda, c72062SPy.LIZ(context));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(text);
            spannableStringBuilder.append((CharSequence) LJIJ);
            return spannableStringBuilder;
        }
        if (!EP5.LIZ()) {
            boolean LIZJ = c77266UUc.LJIILLIIL().LIZJ();
            C72062SPy c72062SPy2 = new C72062SPy();
            String string2 = context.getString(R.string.r1t);
            o.LJIIIIZZ(string2, "context.getString(R.stri…ontacts_add_phone_number)");
            c72062SPy2.LIZIZ = string2;
            c72062SPy2.LIZ = false;
            c72062SPy2.LIZIZ(62);
            if (!z) {
                c72062SPy2.LJ(1);
                c72062SPy2.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 71);
            }
            C72062SPy c72062SPy3 = new C72062SPy();
            String string3 = context.getString(R.string.r1w);
            o.LJIIIIZZ(string3, "context.getString(R.stri…t_contacts_sync_contacts)");
            c72062SPy3.LIZIZ = string3;
            c72062SPy3.LIZ = false;
            c72062SPy3.LIZIZ(62);
            if (!LIZJ) {
                c72062SPy3.LJ(1);
                c72062SPy3.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 72);
            }
            if (z && LIZJ) {
                String string4 = context.getString(R.string.r1v);
                o.LJIIIIZZ(string4, "context.getString(R.stri…tacts_phone_added_synced)");
                return string4;
            }
            return C1A7.LJIJ(context, R.string.r1u, c72062SPy2.LIZ(context), c72062SPy3.LIZ(context));
        }
        boolean isHasEmail = C71945SLl.LIZ().isHasEmail();
        boolean LIZJ2 = c77266UUc.LJIILLIIL().LIZJ();
        C72062SPy c72062SPy4 = new C72062SPy();
        String string5 = context.getString(R.string.rzf);
        o.LJIIIIZZ(string5, "context.getString(R.stri…cription_1_placeholder_1)");
        c72062SPy4.LIZIZ = string5;
        c72062SPy4.LJ(1);
        c72062SPy4.LIZ = false;
        c72062SPy4.LIZIZ(62);
        c72062SPy4.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 69);
        CharSequence LIZ = c72062SPy4.LIZ(context);
        C72062SPy c72062SPy5 = new C72062SPy();
        String string6 = context.getString(R.string.rzg);
        o.LJIIIIZZ(string6, "context.getString(R.stri…cription_1_placeholder_2)");
        c72062SPy5.LIZIZ = string6;
        c72062SPy5.LJ(1);
        c72062SPy5.LIZ = false;
        c72062SPy5.LIZIZ(62);
        c72062SPy5.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 74);
        CharSequence LIZ2 = c72062SPy5.LIZ(context);
        C72062SPy c72062SPy6 = new C72062SPy();
        String string7 = context.getString(R.string.rzh);
        o.LJIIIIZZ(string7, "context.getString(R.stri…cription_1_placeholder_3)");
        c72062SPy6.LIZIZ = string7;
        c72062SPy6.LJ(1);
        c72062SPy6.LIZ = false;
        c72062SPy6.LIZIZ(62);
        c72062SPy6.LJFF = new AqS159S0200000_12(context, aqS162S0100000_12, 70);
        CharSequence LIZ3 = c72062SPy6.LIZ(context);
        if (!z) {
            if (!isHasEmail) {
                if (!LIZJ2) {
                    return C1A7.LJIJ(context, R.string.rze, LIZ, LIZ2, LIZ3);
                }
                return C1A7.LJIJ(context, R.string.rzi, LIZ, LIZ2);
            }
            if (!LIZJ2) {
                return C1A7.LJIJ(context, R.string.rzl, LIZ, LIZ3);
            }
            return C1A7.LJIJ(context, R.string.rzr, LIZ);
        }
        if (!isHasEmail) {
            if (!LIZJ2) {
                return C1A7.LJIJ(context, R.string.rzo, LIZ2, LIZ3);
            }
            return C1A7.LJIJ(context, R.string.rzt, LIZ2);
        }
        if (!LIZJ2) {
            return C1A7.LJIJ(context, R.string.rzv, LIZ3);
        }
        CharSequence text2 = context.getText(R.string.r1v);
        o.LJIIIIZZ(text2, "{\n                //111\n…ded_synced)\n            }");
        return text2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence LJI(Context context, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(context, "context");
        boolean LIZ = UTK.LIZIZ.LIZLLL(EnumC77147UPn.MLBB).LIZ();
        C72062SPy c72062SPy = new C72062SPy();
        c72062SPy.LIZJ(R.string.i6q);
        c72062SPy.LIZ = false;
        c72062SPy.LIZIZ(51);
        if (!LIZ) {
            c72062SPy.LJ(1);
            c72062SPy.LIZIZ(62);
            c72062SPy.LJFF = new AqS158S0200000_11(context, aqS162S0100000_12, 12);
        }
        return C1A7.LJIJ(context, R.string.i6p, c72062SPy.LIZ(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence LJFF(Context context, SKL toastHolder, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toastHolder, "toastHolder");
        R6M r6m = new R6M(C221108m2.LIZIZ(new AqS161S0100000_11(context, 81)), context, toastHolder, aqS162S0100000_12);
        boolean isPlatformBound = C71945SLl.LJ().LIZJ().isPlatformBound("facebook");
        CharSequence text = context.getText(R.string.jd6);
        o.LJIIIIZZ(text, "context.getText(R.string.option_FB_description1)");
        if (isPlatformBound) {
            return text;
        }
        C72062SPy c72062SPy = new C72062SPy();
        String string = context.getString(R.string.jd8);
        o.LJIIIIZZ(string, "context.getString(R.stri…ion_FB_description2_link)");
        c72062SPy.LIZIZ = string;
        c72062SPy.LJ(1);
        c72062SPy.LIZ = false;
        c72062SPy.LIZIZ(62);
        c72062SPy.LJFF = new AqS158S0200000_11(context, r6m, 13);
        Spanned LJIJ = C1A7.LJIJ(context, R.string.jd7, c72062SPy.LIZ(context));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(text);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LJIJ);
        return spannableStringBuilder;
    }
}
