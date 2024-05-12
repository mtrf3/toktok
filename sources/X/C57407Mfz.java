package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.compliance.api.expriements.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import com.ss.android.ugc.aweme.compliance.protection.timelock.RevampPasscodeUtil;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* renamed from: X.Mfz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57407Mfz implements M5A {
    public static CountDownTimer LJLJJLL;
    public final Keva LJLIL = Keva.getRepo("used_app_duration_and_times");
    public CountDownTimer LJLILLLLZI;
    public TuxSheet LJLJI;
    public TuxSheet LJLJJI;
    public CountDownTimer LJLJJL;

    public final void LIZ() {
        long j = 60000;
        this.LJLILLLLZI = new CountDownTimer(C86306Xu2.LIZ() * j, j * C86306Xu2.LIZ(), new C57409Mg1(this));
    }

    public C57407Mfz() {
        PipServiceImpl.LJJII().LJ(new MXR());
    }

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        C42625Go9.LIZJ(this);
        if (!PipServiceImpl.LJJII().isInPipMode()) {
            CountDownTimer countDownTimer = LJLJJLL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C57408Mg0.LJFF(2);
        }
        CountDownTimer countDownTimer2 = this.LJLILLLLZI;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        CountDownTimer countDownTimer3 = this.LJLJJL;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
        }
        RevampPasscodeUtil.LIZ.getClass();
        RevampPasscodeUtil.LIZJ = false;
        C57399Mfr.LJFF = false;
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        C42625Go9.LIZIZ(this);
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        CountDownTimer countDownTimer = LJLJJLL;
        if (countDownTimer == null || !countDownTimer.isRunning()) {
            this.LJLIL.storeLong(C57408Mg0.LIZJ("start_time"), System.currentTimeMillis());
            C34K c34k = new C34K();
            c34k.element = true;
            LJLJJLL = new CountDownTimer(Long.MAX_VALUE, 600000L, new C54026LIg(c34k, this));
            this.LJLJJL = new CountDownTimer(600000L, 600000L, new C54027LIh(this));
            LIZ();
            CountDownTimer countDownTimer2 = LJLJJLL;
            if (countDownTimer2 != null) {
                countDownTimer2.start();
            }
        }
        LIZIZ(0);
    }

    public final void LIZIZ(int i) {
        Activity validTopActivity;
        CountDownTimer countDownTimer;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 || (countDownTimer = this.LJLJJL) == null) {
                            return;
                        }
                        countDownTimer.start();
                        return;
                    }
                    CountDownTimer countDownTimer2 = this.LJLILLLLZI;
                    if (countDownTimer2 == null) {
                        return;
                    }
                    countDownTimer2.cancel();
                    return;
                }
                RevampPasscodeUtil.LIZ.getClass();
                if (RevampPasscodeUtil.LIZJ || C57399Mfr.LJFF || RevampPasscodeUtil.LIZIZ || C57399Mfr.LJ) {
                    return;
                }
                if (C86306Xu2.LIZ() != 0 && (validTopActivity = ActivityStack.getValidTopActivity()) != null) {
                    C26227ARb c26227ARb = new C26227ARb(validTopActivity);
                    c26227ARb.LJFF(validTopActivity.getString(R.string.qal));
                    c26227ARb.LIZIZ(validTopActivity.getString(R.string.qak, Integer.valueOf(C86306Xu2.LIZ())));
                    C242989gE c242989gE = new C242989gE(validTopActivity);
                    c242989gE.LIZJ();
                    String string = validTopActivity.getString(R.string.qah);
                    o.LJIIIIZZ(string, "activity.getString(R.str…_modal_editreminder_link)");
                    c242989gE.LIZLLL(string);
                    c242989gE.LJ(new AqS140S0200000_9(validTopActivity, this, 62));
                    c26227ARb.LJIIJJI = c242989gE;
                    UC0.LIZJ(c26227ARb, new AqS140S0200000_9(validTopActivity, this, 63));
                    C78685UuP.LJIJJ(c26227ARb, C57408Mg0.LIZ(validTopActivity, R.drawable.bbm));
                    c26227ARb.LJI().LIZLLL();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                    FMX.LJIIL("screen_time_breaks_popup", c188727au.LIZ);
                }
                LIZIZ(3);
                return;
            }
            CountDownTimer countDownTimer3 = this.LJLILLLLZI;
            if (countDownTimer3 == null) {
                return;
            }
            countDownTimer3.start();
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() || C86306Xu2.LIZ() <= 0) {
            return;
        }
        LIZIZ(1);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        o.LJIIIZ(event, "event");
        try {
            if (TextUtils.equals("close_reminder_sheet", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName")) && (tuxSheet2 = this.LJLJI) != null) {
                tuxSheet2.dismiss();
            }
            if (TextUtils.equals("update_screen_time_breaks", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                String screenTime = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(event.LJLIL, "data"), "screen_time_breaks");
                String screenTimeType = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(event.LJLIL, "data"), "session_duration_type");
                String source = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(event.LJLIL, "data"), "session_duration_source");
                o.LJIIIIZZ(screenTime, "screenTime");
                int parseInt = CastIntegerProtector.parseInt(screenTime);
                o.LJIIIIZZ(screenTimeType, "screenTimeType");
                int parseInt2 = CastIntegerProtector.parseInt(screenTimeType);
                DigitalWellbeingSetting digitalWellbeingSetting = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting != null) {
                    digitalWellbeingSetting.setScreenTimeBreaks(parseInt);
                }
                DigitalWellbeingSetting digitalWellbeingSetting2 = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting2 != null) {
                    digitalWellbeingSetting2.setScreenTimeType(parseInt2);
                }
                C86306Xu2.LJFF(C86306Xu2.LIZIZ);
                o.LJIIIIZZ(source, "source");
                if (CastIntegerProtector.parseInt(source) == 1) {
                    CastIntegerProtector.parseInt(screenTime);
                    C2U8.LIZ(new C57410Mg2());
                }
            }
            if (TextUtils.equals("close_minor_sheet", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName")) && (tuxSheet = this.LJLJJI) != null) {
                tuxSheet.xl();
            }
            if (TextUtils.equals("open_screen_time_for_minor", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                TuxSheet tuxSheet3 = this.LJLJJI;
                if (tuxSheet3 != null) {
                    tuxSheet3.xl();
                }
                Activity activity = ActivityStack.getValidTopActivity();
                o.LJIIIIZZ(activity, "activity");
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIIZ(activity.getString(R.string.qag));
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LJIIJ();
            }
            if (TextUtils.equals("show_edited_sleep_time_toast", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                C10K.LIZIZ(new Callable() { // from class: X.7WY
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Activity activity2 = ActivityStack.getValidTopActivity();
                        o.LJIIIIZZ(activity2, "activity");
                        C26045AKb c26045AKb2 = new C26045AKb(activity2);
                        c26045AKb2.LIZ(true);
                        c26045AKb2.LJIIIZ(activity2.getString(R.string.iq9));
                        c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
                        c26045AKb2.LJII(R.attr.e8);
                        c26045AKb2.LJIIJ();
                        return C76800UCe.LIZ;
                    }
                }, C10K.LJIIIIZZ, null);
            }
        } catch (JSONException unused) {
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        CountDownTimer countDownTimer = this.LJLILLLLZI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.LJLJJL;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        LIZIZ(0);
        this.LJLIL.storeLong(C57408Mg0.LIZJ("login_time"), System.currentTimeMillis());
        this.LJLIL.storeLong(C57408Mg0.LIZJ("start_time"), System.currentTimeMillis());
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onScreenTimeChanged(C57410Mg2 event) {
        o.LJIIIZ(event, "event");
        LIZ();
        LIZIZ(0);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowScreenTimeForMinor(C59742Wc event) {
        String str;
        o.LJIIIZ(event, "event");
        Activity activity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(activity, "activity");
        View inflate = View.inflate(activity, R.layout.ahq, null);
        C60193Njp c60193Njp = (C60193Njp) inflate.findViewById(R.id.b0v);
        c60193Njp.LIZLLL(BulletService.LIZ().LJIILIIL());
        if (C52254Kf4.LIZ()) {
            str = "fe_tns_screen_time_management";
        } else {
            str = "fe_privacy_and_safety_lynx";
        }
        String LJ = a1.LJ("aweme://lynxview/?channel=", str, "&bundle=show-minor-screen-time-page/template.js&dynamic=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1");
        DigitalWellbeingEntranceSettings.LIZ.getClass();
        C38281F0r c38281F0r = new C38281F0r(DigitalWellbeingEntranceSettings.LIZ(LJ));
        c38281F0r.LIZLLL("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        String schema = c38281F0r.LJ();
        o.LJIIIIZZ(schema, "schema");
        c60193Njp.t(C38956FQq.LIZIZ(schema), new Bundle(), new C57417Mg9());
        ASL asl = new ASL();
        asl.LIZ.LJLLI = inflate;
        asl.LJI(2);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        this.LJLJJI = tuxSheet;
        C1DG.LJII((ActivityC45651qj) activity, "activity as FragmentActi…y).supportFragmentManager", tuxSheet, "screenForMinorPopup");
    }
}
