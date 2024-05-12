package com.ss.android.ugc.aweme.setting.ui;

import X.AEY;
import X.AGX;
import X.AGY;
import X.AGZ;
import X.AI8;
import X.AI9;
import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C158056If;
import X.C16880lQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25940AGa;
import X.C26045AKb;
import X.C26227ARb;
import X.C2YJ;
import X.C36922EeM;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C76800UCe;
import X.C77413UZt;
import X.C78840Uwu;
import X.C78857UxB;
import X.DialogC25756A8y;
import X.InterfaceC65784Pro;
import X.NO5;
import X.OHT;
import X.Q0C;
import X.Q8U;
import X.UC0;
import X.X1D;
import Y.IDCListenerS205S0100000_4;
import Y.IDCSpanS30S0100000_4;
import Y.IDdS377S0100000_4;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdAuthorizationDialog;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS11S1110000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class AdSettingsActivity extends ActivityC86117Xqz implements View.OnClickListener {
    public static Aweme LJLL;
    public String LJLIL;
    public String LJLILLLLZI;
    public long LJLJJI;
    public long LJLJJL;
    public final AdSettingsApi LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public int LJLJI = -1;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public AdSettingsActivity() {
        AdSettingsApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(AdSettingsApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…dSettingsApi::class.java)");
        this.LJLJJLL = (AdSettingsApi) create;
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 812));
        this.LJLJLJ = C221108m2.LIZIZ(C25940AGa.LJLIL);
    }

    public final void LLFII() {
        try {
            AdFeSettings adFeSettings = C2YJ.LIZIZ.LIZ.getAdFeSettings();
            if (adFeSettings == null) {
                return;
            }
            String legalPage = adFeSettings.getLegalPage();
            if (TextUtils.isEmpty(legalPage)) {
                return;
            }
            NO5.LJII(this, legalPage, getString(R.string.qy2));
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.g2);
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

    public final m LLFZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ((com.google.gson.o) this.LJLJLJ.getValue()).getClass();
                return com.google.gson.o.LIZ(str).LJIIZILJ();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void LLIIIILZ(boolean z) {
        Aweme i6;
        String str = this.LJLIL;
        if (str == null || (i6 = AwemeService.LIZ().i6(str)) == null) {
            return;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = i6.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null) {
            commerceVideoAuthInfo = new AwemeCommerceStruct();
            i6.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
        }
        commerceVideoAuthInfo.setAdvPromotable(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.m2y) {
            String str = this.LJLILLLLZI;
            if (str != null) {
                try {
                    OHT.LIZ(str, str, this, C78857UxB.LJJIIJ(1476399125, "bpea-216"));
                } catch (Q0C e) {
                    C36922EeM.LJFF(e);
                }
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIZ(getResources().getString(R.string.dw6));
                c26045AKb.LJIIJ();
                return;
            }
            return;
        }
        if (id == R.id.m7k) {
            String string = getResources().getString(R.string.qg6);
            AGZ agz = new AGZ(this);
            AdAuthorizationDialog adAuthorizationDialog = new AdAuthorizationDialog();
            adAuthorizationDialog.LJLILLLLZI = string;
            adAuthorizationDialog.LJLJI = agz;
            adAuthorizationDialog.LJLJJL = 0L;
            adAuthorizationDialog.LJLJJLL = 0L;
            adAuthorizationDialog.setCancelable(true);
            adAuthorizationDialog.show(getSupportFragmentManager(), "authorization_dialog");
            return;
        }
        if (id == R.id.m4g) {
            if (this.LJLJI == 2) {
                String str2 = this.LJLIL;
                if (str2 != null) {
                    this.LJLJJLL.requestCodeDelete(str2, false).enqueue(new IDdS377S0100000_4(this, 4));
                    return;
                }
                return;
            }
            String string2 = getResources().getString(R.string.efk);
            o.LJIIIIZZ(string2, "resources.getString(R.string.delete_code_subtext)");
            String string3 = getResources().getString(R.string.efd);
            o.LJIIIIZZ(string3, "resources.getString(R.string.delete)");
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 813);
            String string4 = getResources().getString(R.string.efl);
            o.LJIIIIZZ(string4, "resources.getString(R.string.delete_code_title)");
            LLII(string2, string3, aqS154S0100000_4, true, string4);
            return;
        }
        if (id == R.id.m6g) {
            String string5 = getResources().getString(R.string.qg6);
            AGY agy = new AGY(this);
            long j = this.LJLJJI;
            long j2 = this.LJLJJL;
            AdAuthorizationDialog adAuthorizationDialog2 = new AdAuthorizationDialog();
            adAuthorizationDialog2.LJLILLLLZI = string5;
            adAuthorizationDialog2.LJLJI = agy;
            adAuthorizationDialog2.LJLJJL = j;
            adAuthorizationDialog2.LJLJJLL = j2;
            adAuthorizationDialog2.setCancelable(true);
            adAuthorizationDialog2.show(getSupportFragmentManager(), "extend_authorization_period_dialog");
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.fv, 0);
        setContentView(R.layout.dk);
        this.LJLIL = C16880lQ.LLJJIJIIJIL(getIntent(), "id");
        DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) this.LJLJL.getValue();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-5461691475268532406")).LIZ) {
            dialogC25756A8y.show();
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.qy0);
        o.LJIIIIZZ(string, "getString(R.string.setting_video_ad_icon)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 822));
        c252709vu.setNavActions(c235119Kp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string2 = getString(R.string.qxz);
        o.LJIIIIZZ(string2, "this.getString(R.string.…video_ad_check_highlight)");
        String string3 = getString(R.string.qxy);
        o.LJIIIIZZ(string3, "this.getString(R.string.…ng_video_ad_check_format)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{string2}, 1, string3, "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string2, 0, false, 6);
        spannableStringBuilder.append((CharSequence) LIZIZ);
        spannableStringBuilder.setSpan(new IDCSpanS30S0100000_4(this, 3), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
        ((TextView) _$_findCachedViewById(R.id.ty)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) _$_findCachedViewById(R.id.ty)).setText(spannableStringBuilder);
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.ts)).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AEY aey = (AEY) accessory;
        aey.LJIILJJIL(new AqS154S0100000_4(this, 820));
        aey.LJIILL(new IDCListenerS205S0100000_4(this, 5));
        AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.qp)).getAccessory();
        o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AEY aey2 = (AEY) accessory2;
        aey2.LJIILJJIL(new AqS154S0100000_4(this, 821));
        aey2.LJIILL(AGX.LJLIL);
        _$_findCachedViewById(R.id.m7k).setVisibility(8);
        _$_findCachedViewById(R.id.fhd).setVisibility(8);
        C16880lQ.LJIIJ(this, findViewById(R.id.m7k));
        C16880lQ.LJIIJ(this, findViewById(R.id.m2y));
        C16880lQ.LJIIJ(this, findViewById(R.id.m4g));
        C16880lQ.LJIIJ(this, findViewById(R.id.m6g));
        String str = this.LJLIL;
        if (str != null) {
            this.LJLJJLL.requestAdSettings(str).enqueue(new IDdS377S0100000_4(this, 1));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
    }

    public final void LLIIIJ(int i, long j, long j2, String str) {
        boolean z;
        String string;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.ts)).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AEY aey = (AEY) accessory;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.m7k);
            if (!aey.LJIIL()) {
                i2 = 8;
            }
            _$_findCachedViewById.setVisibility(i2);
            _$_findCachedViewById(R.id.fhd).setVisibility(8);
            return;
        }
        _$_findCachedViewById(R.id.m7k).setVisibility(8);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.fhd);
        if (aey.LJIIL()) {
            i3 = 0;
        }
        _$_findCachedViewById2.setVisibility(i3);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = "";
                } else {
                    string = getResources().getString(R.string.dge);
                }
            } else {
                string = getResources().getString(R.string.dgd);
            }
        } else {
            string = getResources().getString(R.string.dgc);
        }
        o.LJIIIIZZ(string, "when (codeStatus) {\n    …     else -> \"\"\n        }");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getResources().getString(R.string.dgf));
        LIZ.append(": ");
        LIZ.append(string);
        String LIZIZ = X1D.LIZIZ(LIZ);
        SpannableString spannableString = new SpannableString(LIZIZ);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        }
        ((TextView) _$_findCachedViewById(R.id.m2i)).setText(spannableString);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        Date date = new Date(j * 1000);
        Date date2 = new Date(j2 * 1000);
        TextView textView = (TextView) _$_findCachedViewById(R.id.m02);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(getResources().getString(R.string.bw6));
        LIZ2.append(":\n");
        LIZ2.append(simpleDateFormat.format(date));
        LIZ2.append(" - ");
        LIZ2.append(simpleDateFormat.format(date2));
        textView.setText(X1D.LIZIZ(LIZ2));
    }

    public final void LLII(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, String str3) {
        C26227ARb LIZIZ = C77413UZt.LIZIZ(this);
        if (!TextUtils.isEmpty(str3)) {
            LIZIZ.LJFF(str3);
        }
        LIZIZ.LIZIZ(str);
        UC0.LIZJ(LIZIZ, new AqS11S1110000_4(str2, interfaceC65784Pro, z, 2));
        LIZIZ.LJII = false;
        LIZIZ.LJI().LIZLLL();
    }
}
