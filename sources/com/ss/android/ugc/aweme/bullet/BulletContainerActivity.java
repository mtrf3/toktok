package com.ss.android.ugc.aweme.bullet;

import X.AKZ;
import X.AbstractActivityC60177NjZ;
import X.AbstractC59475NVv;
import X.C04330Ez;
import X.C16880lQ;
import X.C201037ul;
import X.C25741A8j;
import X.C27740Aue;
import X.C2U8;
import X.C34X;
import X.C39386Fd0;
import X.C39647FhD;
import X.C40515FvD;
import X.C57415Mg7;
import X.C59082NGs;
import X.C59297NOz;
import X.C59439NUl;
import X.C59472NVs;
import X.C59897Nf3;
import X.C60003Ngl;
import X.C60213Nk9;
import X.C60592NqG;
import X.C65803Ps7;
import X.C85999Xp5;
import X.C9UE;
import X.EnumC60063Nhj;
import X.FMX;
import X.GHC;
import X.INY;
import X.InterfaceC27436Apk;
import X.InterfaceC40516FvE;
import X.InterfaceC59504NWy;
import X.InterfaceC59899Nf5;
import X.KL3;
import X.OGB;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class BulletContainerActivity extends AbstractActivityC60177NjZ implements KL3, OGB, C34X {
    public C60003Ngl LLFZ;
    public InterfaceC27436Apk LLI;
    public C59472NVs LLIFFJFJJ;
    public List<GHC> LLII;
    public long LLIIIILZ;
    public boolean LLIIIJ;
    public String LLIIIL;
    public boolean LLIIIZ;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public final InterfaceC59504NWy LLIIII = C57415Mg7.LIZ().LJIILIIL();

    @Override // X.AbstractActivityC60177NjZ
    public final void LLIIIJ(ViewGroup viewGroup, Uri uri) {
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.AbstractActivityC60177NjZ
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
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

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // X.AbstractActivityC60177NjZ, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC60177NjZ
    public final InterfaceC59899Nf5 LLII() {
        return new C59897Nf3();
    }

    @Override // X.AbstractActivityC60177NjZ
    public final View LLIIIILZ() {
        return BulletService.LIZ().LJIIJJI(this);
    }

    @Override // X.AbstractActivityC60177NjZ
    public final CharSequence LLIIIZ() {
        String string = getString(R.string.rkd);
        o.LJIIIIZZ(string, "getString(R.string.ss_title_browser)");
        return string;
    }

    public int LLIIJI() {
        Intent intent = getIntent();
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("activity_translation_type", 0);
    }

    @Override // X.AbstractActivityC60177NjZ, android.app.Activity
    public void finish() {
        C59297NOz c59297NOz;
        C9UE.LIZIZ(this);
        super.finish();
        C59082NGs.LIZ = null;
        if (!getIntent().getBooleanExtra("from_promote_live", false)) {
            C59472NVs c59472NVs = this.LLIFFJFJJ;
            if (c59472NVs == null || (c59297NOz = c59472NVs.LJJIJIIJIL) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
                C201037ul.LIZ(LLIIJI(), this, false);
            }
        }
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C60003Ngl c60003Ngl = this.LLFZ;
        if (c60003Ngl != null && !c60003Ngl.LJ && !c60003Ngl.LJFF) {
            c60003Ngl.LJI.removeCallbacks(c60003Ngl.LJII);
            c60003Ngl.LIZ();
            c60003Ngl.LJ = true;
        }
        C2U8.LIZ(new C25741A8j(System.currentTimeMillis() - this.LLIIIILZ));
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C60003Ngl c60003Ngl = this.LLFZ;
        if (c60003Ngl != null && !c60003Ngl.LJ && !c60003Ngl.LJFF) {
            c60003Ngl.LJI.removeCallbacks(c60003Ngl.LJII);
            c60003Ngl.LIZ();
            c60003Ngl.LJFF = true;
        }
        AKZ.LIZ();
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", true);
        super.onResume();
        C60003Ngl c60003Ngl = this.LLFZ;
        if (c60003Ngl != null) {
            c60003Ngl.LJFF = false;
        }
        this.LLIIIZ = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0
    public final void setStatusBarColor() {
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            C60592NqG.LJ(this, getWindow(), false);
        }
    }

    private final void LLIIJLIL(int i) {
        if (!this.LLIIIJ && this.LLIIIL != null) {
            JSONObject jSONObject = new JSONObject(this.LLIIIL);
            try {
                jSONObject.put("status", String.valueOf(i)).put("duration", System.currentTimeMillis() - this.LLIIIILZ);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            FMX.LJIILJJIL("request_anchor_detail", jSONObject);
            this.LLIIIJ = true;
        }
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        CrashSdkImpl.LJ().LIZLLL(context);
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LIZLLL(LIZ);
        if (AabPluginServiceImpl.LIZLLL().LIZJ() != null) {
            C39647FhD.LIZLLL(LIZ);
        }
        super.attachBaseContext(LIZ);
    }

    @Override // X.AbstractActivityC60177NjZ, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C85999Xp5.LJFF(this);
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", true);
        Intent intent = getIntent();
        Uri uri = null;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "resso_key");
        } else {
            str = null;
        }
        this.LLIIIL = str;
        this.LLIIIILZ = System.currentTimeMillis();
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            setTheme(R.style.vj);
            INY.LIZ(this);
        }
        this.LJZI = Boolean.TRUE;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            ViewGroup viewGroup = this.LJLLL;
            if (viewGroup != null) {
                viewGroup.post(new ARunnableS46S0100000_10(this, 16));
                C60592NqG.LIZLLL(this, 0);
                overridePendingTransition(0, 0);
            } else {
                o.LJIJI("rootLayout");
                throw null;
            }
        }
        getLifecycle().addObserver(new BulletEventObserver(this.LJLJLLL, this));
        C40515FvD LIZJ = C40515FvD.LIZJ();
        Intent intent2 = getIntent();
        if (intent2 != null) {
            uri = intent2.getData();
        }
        LIZJ.LIZ(uri);
        C85999Xp5.LJFF(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", false);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LLII == null) {
            this.LLII = new ArrayList();
        }
        List<GHC> list = this.LLII;
        if (list != null && !list.contains(listener)) {
            list.add(listener);
        }
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk listener) {
        o.LJIIIZ(listener, "listener");
        this.LLI = listener;
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        List<GHC> list = this.LLII;
        if (list != null) {
            ((ArrayList) list).remove(listener);
        }
    }

    @Override // X.AbstractActivityC60177NjZ, X.InterfaceC60172NjU
    public final void LLL(Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        super.LLL(uri, e);
        LLIIJLIL(0);
    }

    @Override // X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        List<GHC> list = this.LLII;
        if (list != null) {
            Iterator<GHC> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.KL3
    public final void showCustomLongToast(int i, String text) {
        o.LJIIIZ(text, "text");
        if (isFinishing()) {
            return;
        }
        if (this.LLFZ == null) {
            this.LLFZ = new C60003Ngl(this);
        }
        C60003Ngl c60003Ngl = this.LLFZ;
        if (c60003Ngl != null) {
            c60003Ngl.LIZIZ(i, 3500, text);
        }
    }

    @Override // X.AbstractActivityC60177NjZ, X.InterfaceC60172NjU
    public final void LLLII(View view, Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLLII(view, uri, instance);
        LLIIJLIL(1);
    }

    @Override // X.AbstractActivityC60177NjZ, X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
        super.gk(instance, uri, param);
        if (!(param instanceof C59472NVs)) {
            return;
        }
        C59472NVs c59472NVs = (C59472NVs) param;
        this.LLIFFJFJJ = c59472NVs;
        if (!getIntent().getBooleanExtra("from_promote_live", false) && !o.LJ(c59472NVs.LJJIJIIJIL.getValue(), Boolean.TRUE)) {
            C201037ul.LIZ(LLIIJI(), this, true);
        }
    }

    @Override // X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LLI;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractActivityC60177NjZ, X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, Uri uri, InterfaceC40516FvE instance, boolean z) {
        C59439NUl c59439NUl;
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLIIL(viewComponents, uri, instance, z);
        C59472NVs c59472NVs = this.LLIFFJFJJ;
        if (c59472NVs != null && c59472NVs.LJIIIIZZ.getValue() == EnumC60063Nhj.AUTO && (c59439NUl = (C59439NUl) c59472NVs.LJII.getValue()) != null && c59439NUl.LJLIL == -2) {
            getWindow().setStatusBarColor(C04330Ez.LIZIZ(this, R.color.cn));
            C27740Aue.LJII(this);
        }
    }

    @Override // X.KL3
    public final void showCustomToast(int i, String text, int i2, int i3) {
        o.LJIIIZ(text, "text");
        if (isFinishing()) {
            return;
        }
        if (this.LLFZ == null) {
            this.LLFZ = new C60003Ngl(this);
        }
        C60003Ngl c60003Ngl = this.LLFZ;
        if (c60003Ngl != null) {
            c60003Ngl.LIZIZ(i, i2, text);
        }
    }
}
