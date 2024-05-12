package X;

import Y.ACListenerS30S0100000_10;
import Y.AfS53S0100000_1;
import Y.IDCListenerS164S0200000_10;
import Y.IDCListenerS257S0100000_10;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OOL extends OOS implements C4C6 {
    public final Activity LJLJLLL;
    public final String LJLL;
    public final C61658OHu LJLLI;
    public boolean LJLLILLLL;

    @Override // X.C4C6
    public final void LIZ() {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/introSheet/ProfileNaviIntroSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-5235266076254561967")).LIZ) {
            return;
        }
        show();
    }

    public final boolean LJJ() {
        SharedPreferences preferences = this.LJLJLLL.getPreferences(0);
        if (preferences == null) {
            return false;
        }
        return preferences.getBoolean("profile_navi_intro_sheet_shown", false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SharedPreferences preferences = this.LJLJLLL.getPreferences(0);
        if (preferences == null) {
            return;
        }
        SharedPreferences.Editor edit = preferences.edit();
        edit.putBoolean("profile_navi_intro_sheet_shown", true);
        edit.apply();
    }

    public final void LJJI(AqS151S0100000_1 aqS151S0100000_1) {
        if (LJJ()) {
            return;
        }
        OOO ooo = new OOO();
        ooo.LIZ = 1;
        OON oon = new OON();
        oon.LIZ = ooo.LIZ;
        C36392EQa.LIZ(oon).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS53S0100000_1(aqS151S0100000_1, 49), new InterfaceC64592gB() { // from class: X.9Ff
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C34B.LIZJ("ProfileNaviIntroSheetDialog", message);
        }
        super.onCreate(bundle);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        setContentView(R.layout.c7_);
        String str = this.LJLL;
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", "click");
        FMX.LJIIL("show_avatar_intro", LIZLLL.LIZ);
        C16880lQ.LJJJ((TuxIconView) findViewById(R.id.gxl), new ACListenerS30S0100000_10(this, 93));
        SY4 sy4 = (SY4) findViewById(R.id.gxm);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS30S0100000_10(this, 94));
        }
        W5F LJFF = W5U.LJFF(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_intro_sheet_img_09282021.png"));
        LJFF.LIZJ = findViewById(R.id.gxs).getContext();
        LJFF.LJJIIJ = (SmartImageView) findViewById(R.id.gxs);
        C16880lQ.LLJJJ(LJFF);
        View navi_sheet_root = findViewById(R.id.gy9);
        o.LJIIIIZZ(navi_sheet_root, "navi_sheet_root");
        navi_sheet_root.addOnLayoutChangeListener(new IDCListenerS257S0100000_10(this, 0));
    }

    public OOL(Activity activity, C61658OHu c61658OHu) {
        super(activity, R.style.a9w);
        this.LJLJLLL = activity;
        this.LJLL = "chat";
        this.LJLLI = c61658OHu;
        setOnCancelListener(new IDCListenerS164S0200000_10(this, null, 1));
    }
}
