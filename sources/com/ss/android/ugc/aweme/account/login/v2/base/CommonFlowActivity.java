package com.ss.android.ugc.aweme.account.login.v2.base;

import X.AbstractActivityC69131RBf;
import X.C00F;
import X.C16880lQ;
import X.C221108m2;
import X.C252819w5;
import X.C252859w9;
import X.C35936E8m;
import X.C41565GSz;
import X.C43212Gxc;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C69106RAg;
import X.C69109RAj;
import X.C69110RAk;
import X.C85635XjD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.GGS;
import X.InterfaceC252919wF;
import X.InterfaceC62984Onk;
import X.R47;
import X.RAP;
import Y.IDxS128S0200000_4;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.verify.EmailConsentPageFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public class CommonFlowActivity extends AbstractActivityC69131RBf implements InterfaceC62984Onk {
    public static final SparseArray<R47> LJLLI;
    public boolean LJLJJI;
    public Bundle LJLJJL;
    public boolean LJLJL;
    public Integer LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public EnumC69113RAn LJLJI = EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD;
    public boolean LJLJJLL = true;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new C69110RAk(this));

    public int LLIILII() {
        return 0;
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        new Companion();
        LJLLI = new SparseArray<>();
    }

    public C43212Gxc LLIL() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    public final void LLIIJI() {
        int i;
        int intExtra = getIntent().getIntExtra("action_type", -1);
        if (intExtra != -1) {
            SparseArray<R47> sparseArray = LJLLI;
            if (sparseArray.get(intExtra) != null) {
                if (!this.LJLJJLL || this.LJLJJI) {
                    R47 r47 = sparseArray.get(intExtra);
                    o.LJI(r47);
                    R47 r472 = r47;
                    Integer num = this.LJLJLLL;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = intExtra;
                    }
                    r472.onResult(i, 1, this.LJLJJL);
                } else {
                    R47 r473 = sparseArray.get(intExtra);
                    o.LJI(r473);
                    r473.onResult(intExtra, 2, null);
                }
                sparseArray.remove(intExtra);
            }
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public void finish() {
        super.finish();
        LLIIJI();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (this.LJLJL) {
            finish();
        }
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLFZ(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int i = bundle2.getInt("next_page", EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD.getValue());
        c69106RAg.getClass();
        EnumC69113RAn LIZ = C69106RAg.LIZ(i);
        int i2 = bundle2.getInt("previous_page", -1);
        if (i2 == LIZ.getValue() && i2 != -1) {
            onBackPressed();
            return;
        }
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", LIZ.getValue());
        int i3 = bundle2.getInt("next_next_page", -1);
        if (i3 != -1) {
            bundle2.putInt("next_page", i3);
            bundle2.remove("next_next_page");
        } else {
            bundle2.remove("next_page");
        }
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(LIZ), bundle2);
    }

    @Override // X.AbstractActivityC69131RBf
    public void LLII(Bundle bundle) {
        Bundle bundle2;
        final String str;
        boolean z;
        this.LJLJJI = true;
        if (bundle == null || (bundle2 = bundle.getBundle("final_data")) == null) {
            bundle2 = new Bundle();
        }
        this.LJLJJL = bundle2;
        Bundle value = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL.getValue();
        if (value != null) {
            str = value.getString("enter_from_item");
        } else {
            str = null;
        }
        if (C41565GSz.LIZIZ(getIntent())) {
            this.LJLJL = true;
            LLIIJI();
            return;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) != 4 && C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) != 2) || !C69109RAj.LIZIZ.contains(str) || !C252819w5.LIZ("manage_account_page"))) {
            finish();
            return;
        }
        EmailConsentPageFragment emailConsentPageFragment = new EmailConsentPageFragment();
        emailConsentPageFragment.LJLLLLLL = new InterfaceC252919wF(this) { // from class: X.9wE
            public final /* synthetic */ String LIZ = "manage_account_page";
            public final /* synthetic */ CommonFlowActivity LIZJ;

            @Override // X.InterfaceC252919wF
            public final void LJI() {
            }

            @Override // X.InterfaceC252919wF
            public final void LIZ() {
                a.LJIILIIL().LJI("email_consent");
                C252809w4.LIZ(this.LIZ, "get_updates");
                if (!o.LJ(str, "settings_page_bind_email")) {
                    Intent intent = new Intent();
                    intent.putExtra("bind_email_result", 1);
                    CommonFlowActivity commonFlowActivity = this.LIZJ;
                    if (commonFlowActivity != null) {
                        commonFlowActivity.setResult(2, intent);
                    }
                } else {
                    C57082Lw.LIZ.LIZJ("email_consent_status").postValue(new C252889wC(true));
                }
                this.LIZJ.finish();
            }

            @Override // X.InterfaceC252919wF
            public final void onCancel() {
                C252859w9.LIZIZ();
                C252809w4.LIZ(this.LIZ, "no_thanks");
                this.LIZJ.finish();
            }

            {
                this.LIZJ = this;
            }
        };
        Bundle bundle3 = new Bundle();
        bundle3.putString("enter_from", "manage_account_page");
        emailConsentPageFragment.setArguments(bundle3);
        C252859w9.LIZ().LIZ(new IDxS128S0200000_4(this, emailConsentPageFragment, 0));
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", true);
        activityConfiguration(new AqS177S0100000_11(this, 11));
        super.onCreate(bundle);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int intExtra = getIntent().getIntExtra("next_page", EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD.getValue());
        c69106RAg.getClass();
        this.LJLJI = C69106RAg.LIZ(intExtra);
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL;
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            LLJJIJI.putString("enter_from", LJJLIIIJJI());
            LLJJIJI.putString("enter_method", LJJLIIIJLLLLLLLZ());
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_type");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            LLJJIJI.putString("enter_type", LLJJIJIIJIL);
            LLJJIJI.putInt("next_page", this.LJLJI.getValue());
            mediatorLiveData.postValue(LLJJIJI);
        }
        RAP.LIZ().getClass();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
        c35936E8m.LIZLLL("enter_method", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method"));
        c35936E8m.LIZLLL("page", C16880lQ.LLJJIJIIJIL(getIntent(), "page"));
        FMX.LJIIL("enter_email_code_page", c35936E8m.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", false);
    }

    public final void LLIIJLIL(int i, Bundle bundle) {
        this.LJLJJL = bundle;
        this.LJLJLLL = Integer.valueOf(i);
        this.LJLJJLL = false;
        finish();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RAP.LIZ().getClass();
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static void LIZ(Activity activity, final int i, R47 r47, Boolean bool) {
            o.LJIIIZ(activity, "activity");
            if (r47 == null) {
                return;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                CommonFlowActivity.LJLLI.put(i, r47);
            } else {
                if (activity instanceof LifecycleOwner) {
                    CommonFlowActivity.LJLLI.put(i, r47);
                    final LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
                    lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$Companion$addResult$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                onDestroy();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                        public final void onDestroy() {
                            CommonFlowActivity.LJLLI.remove(i);
                            lifecycleOwner.getLifecycle().removeObserver(this);
                            RAP.LIZ().getClass();
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("activity must be a LifecycleOwner!");
            }
        }

        public static void LIZIZ(Activity activity, EnumC69113RAn step, EnumC69116RAq scene, Bundle data, R47 r47, Class cls, Boolean bool) {
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(step, "step");
            o.LJIIIZ(scene, "scene");
            o.LJIIIZ(data, "data");
            int i = data.getInt("current_scene", -1);
            if (i != -1) {
                data.putInt("last_scene", i);
            }
            if (cls == null) {
                cls = CommonFlowActivity.class;
            }
            Intent intent = new Intent(activity, (Class<?>) cls);
            data.putInt("next_page", step.getValue());
            data.putInt("current_scene", scene.getValue());
            intent.putExtras(data);
            intent.putExtra("action_type", scene.getValue());
            String string = data.getString("enter_from_item");
            if (string == null) {
                string = "";
            }
            intent.putExtra("enter_from_item", string);
            LIZ(activity, scene.getValue(), r47, bool);
            if (C69109RAj.LIZ.contains(step) && (C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 4 || C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 2)) {
                C16880lQ.LJFF(activity, 1, intent);
            } else {
                C16880lQ.LIZIZ(activity, intent);
            }
        }
    }
}
