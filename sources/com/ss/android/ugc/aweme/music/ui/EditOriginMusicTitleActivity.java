package com.ss.android.ugc.aweme.music.ui;

import X.AH1;
import X.AbstractC234519Ih;
import X.ActivityC86117Xqz;
import X.C109824Ss;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C65803Ps7;
import X.C9KF;
import X.EnumC252729vw;
import X.InterfaceC25988AHw;
import Y.ACListenerS24S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EditOriginMusicTitleActivity extends ActivityC86117Xqz implements InterfaceC25988AHw {
    public C252709vu LJLIL;
    public EditText LJLILLLLZI;
    public ImageView LJLJI;
    public String LJLJJL;
    public String LJLJJLL;
    public EditOriginMusicTitlePresenter LJLJL;
    public ProgressDialog LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final String LJLJJI = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(EditOriginMusicTitleActivity.class);
    }

    @Override // X.InterfaceC25988AHw
    public final void onSuccess() {
        ProgressDialog progressDialog = this.LJLJLJ;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.LJLJLJ;
            o.LJI(progressDialog2);
            progressDialog2.dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.LJLJJL);
        setResult(-1, intent);
        finish();
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        activityConfiguration(AH1.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.buh);
        this.LJLIL = (C252709vu) findViewById(R.id.l_2);
        this.LJLILLLLZI = (EditText) findViewById(R.id.gu8);
        ImageView imageView = (ImageView) findViewById(R.id.bee);
        this.LJLJI = imageView;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS24S0100000_4(this, 93));
        }
        this.LJLJL = new EditOriginMusicTitlePresenter(this);
        this.LJLJJLL = C16880lQ.LLJJIJIIJIL(getIntent(), "MUSIC_TITLE");
        EditText editText = this.LJLILLLLZI;
        if (editText != null) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        }
        EditText editText2 = this.LJLILLLLZI;
        if (editText2 != null) {
            editText2.addTextChangedListener(new IDObjectS177S0100000_4(this, 6));
        }
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234509Ig c234509Ig = new C234509Ig();
            String string = getString(R.string.cel);
            o.LJIIIIZZ(string, "getString(R.string.button_cancel)");
            c234509Ig.LIZJ = string;
            c234509Ig.LIZ(EnumC252729vw.SECONDARY);
            c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 485));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
            String string2 = getString(R.string.fjb);
            o.LJIIIIZZ(string2, "getString(R.string.edit_music_title)");
            LIZLLL.LIZJ = string2;
            c235119Kp.LIZJ = LIZLLL;
            C234509Ig c234509Ig2 = new C234509Ig();
            String string3 = getString(R.string.fl5);
            o.LJIIIIZZ(string3, "getString(R.string.edit_sound_name_save)");
            c234509Ig2.LIZJ = string3;
            c234509Ig2.LIZIZ = "save";
            c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 486));
            c235119Kp.LIZIZ(c234509Ig2);
            c252709vu.setNavActions(c235119Kp);
        }
        C252709vu c252709vu2 = this.LJLIL;
        o.LJI(c252709vu2);
        c252709vu2.LJIJ("save", new AqS9S0010000_4(false, 32));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }

    @Override // X.InterfaceC25988AHw
    public final void onError(String str) {
        ProgressDialog progressDialog = this.LJLJLJ;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.LJLJLJ;
            o.LJI(progressDialog2);
            progressDialog2.dismiss();
        }
        if (!TextUtils.isEmpty(str)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public final void onViewClicked(View view) {
        o.LJIIIZ(view, "view");
        if (view.getId() == R.id.bee) {
            EditText editText = this.LJLILLLLZI;
            o.LJI(editText);
            editText.setText("");
        }
    }
}
