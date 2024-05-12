package com.ss.android.ugc.aweme.compliance.protection.familypairing.ui;

import X.ASL;
import X.ActivityC86117Xqz;
import X.C110614Vt;
import X.C16880lQ;
import X.C19N;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C239089Zw;
import X.C252709vu;
import X.C32151Nz;
import X.C33381Ss;
import X.C42625Go9;
import X.C56642Ke;
import X.C61328O5c;
import X.C65803Ps7;
import X.C79045V0n;
import X.C86305Xu1;
import X.EnumC62934Omw;
import X.O6R;
import X.QD3;
import X.SY4;
import X.SY9;
import X.T5U;
import Y.ACListenerS24S0100000_4;
import Y.IDCSpanS30S0100000_4;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class ManageByParentIntermediateActivity extends ActivityC86117Xqz {
    public TuxSheet LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.familypairing.ui.ManageByParentIntermediateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.familypairing.ui.ManageByParentIntermediateActivity", "onCreate", true);
        activityConfiguration(C239089Zw.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.aft);
        C42625Go9.LIZIZ(this);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 97));
        c235119Kp.LIZLLL(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.ba0;
        ((ImageView) _$_findCachedViewById(R.id.gct)).setImageDrawable(c33381Ss.LIZ(this));
        int intExtra = getIntent().getIntExtra("last_page_type", -1);
        SpannableString spannableString = new SpannableString(getString(R.string.q77, getString(R.string.dhz), getString(R.string.n2)));
        String string = getString(R.string.dhz);
        o.LJIIIIZZ(string, "getString(R.string.com_setting_title)");
        String string2 = getString(R.string.n2);
        o.LJIIIIZZ(string2, "getString(R.string.Family_pairing)");
        int LJJLIIIJL = s.LJJLIIIJL(spannableString, string, 0, false, 6);
        int LJJLIIIJL2 = s.LJJLIIIJL(spannableString, string2, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            spannableString.setSpan(new T5U(32, false), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
            Integer LJI = C79045V0n.LJI(R.attr.go, this);
            if (LJI != null) {
                i3 = LJI.intValue();
            } else {
                i3 = 0;
            }
            spannableString.setSpan(new ForegroundColorSpan(i3), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        }
        if (LJJLIIIJL2 >= 0) {
            spannableString.setSpan(new IDCSpanS30S0100000_4(this, 0), LJJLIIIJL2, string2.length() + LJJLIIIJL2, 33);
            spannableString.setSpan(new T5U(32, false), LJJLIIIJL2, string2.length() + LJJLIIIJL2, 33);
            Integer LJI2 = C79045V0n.LJI(R.attr.go, this);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = 0;
            }
            spannableString.setSpan(new ForegroundColorSpan(i2), LJJLIIIJL2, string2.length() + LJJLIIIJL2, 33);
        }
        if (a.LJIIIZ().LIZ() == EnumC62934Omw.CHILD) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.gcu);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.gcu);
            if (intExtra == 0) {
                i = R.string.q79;
            } else {
                i = R.string.g94;
            }
            textView2.setText(getString(i));
        }
        if (C19N.LJ("notice_update_to_use_content_level", false)) {
            View inflate = View.inflate(this, R.layout.agf, null);
            View findViewById = inflate.findViewById(R.id.ebr);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_exclamation_mark;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            SY9 LIZ = c2068389v.LIZ(this);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
            c110614Vt.LIZJ = C61328O5c.LIZJ(50);
            c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
            c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
            findViewById.setBackground(new LayerDrawable(new Drawable[]{LIZ, c110614Vt.LIZ(this)}));
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_x_mark;
            C16880lQ.LJJIZ((SY4) inflate.findViewById(R.id.fcz), new ACListenerS24S0100000_4(this, 328));
            ASL asl = new ASL();
            C235119Kp c235119Kp2 = new C235119Kp();
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZ(c2068389v2);
            c234529Ii.LIZLLL = true;
            c234529Ii.LIZIZ(new AqS154S0100000_4(this, 1272));
            c235119Kp2.LIZIZ(c234529Ii);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLL = c235119Kp2;
            tuxSheet.LJLLI = inflate;
            asl.LJI(0);
            TuxSheet tuxSheet2 = asl.LIZ;
            this.LJLIL = tuxSheet2;
            if (tuxSheet2 != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "this.supportFragmentManager");
                tuxSheet2.show(supportFragmentManager, "family_pairing_intermediate");
            } else {
                o.LJIJI("sheet");
                throw null;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.familypairing.ui.ManageByParentIntermediateActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onParentalModeChanged(C56642Ke event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("guardian_platform_child_unlink", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
            finish();
            SmartRouter.buildRoute(this, "aweme://setting").open();
            C86305Xu1.LJIIIZ(null);
        }
    }
}
