package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.router.SmartIntent;
import com.ss.android.ugc.aweme.api.LegoBusinessServiceImpl;
import com.ss.android.ugc.aweme.lego.common.LegoBusinessService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.IDqS17S0101000_15;
import kotlin.jvm.internal.IDqS188S0200000_15;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xqz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class ActivityC86117Xqz extends KMV implements InterfaceC78499UrP, KL3 {
    public static final C86140XrM callback;
    public static final List<InterfaceC65784Pro<List<G46>>> processGenerator;
    public WeakReference<ActivityC86117Xqz> activityRef;
    public final List<G46> innerProcessors;
    public static final C71426S1m Companion = new C71426S1m();
    public static Class<? extends BaseActivityViewModel> viewModelClass = BaseActivityViewModel.class;
    public java.util.Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final /* synthetic */ C86118Xr0 $$delegate_0 = new C86118Xr0();
    public final C5H3 baseViewModel$delegate = C221108m2.LIZIZ(new AqS165S0100000_15(this, 930));
    public final C5H3 processors$delegate = C221108m2.LIZIZ(new AqS165S0100000_15(this, 931));

    @Override // X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.KMV
    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void buildCommonIntent() {
    }

    public void dismissCustomToast() {
        this.$$delegate_0.getClass();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86137XrJ.LJLIL, 6);
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(this);
    }

    @Override // X.C29S
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86136XrI.LJLIL, 6);
    }

    public void showCustomToast(int i, String str) {
        this.$$delegate_0.LIZ(i, str);
    }

    static {
        LegoBusinessService legoBusinessService;
        C86140XrM c86140XrM = new C86140XrM();
        callback = c86140XrM;
        processGenerator = new ArrayList();
        try {
            ((Application) EF7.LIZIZ()).registerActivityLifecycleCallbacks(c86140XrM);
        } catch (Throwable th) {
            Object LIZ = C58096Mr6.LIZ(LegoBusinessService.class, false);
            if (LIZ == null) {
                if (C58096Mr6.LLIIJI == null) {
                    synchronized (LegoBusinessService.class) {
                        if (C58096Mr6.LLIIJI == null) {
                            C58096Mr6.LLIIJI = new LegoBusinessServiceImpl();
                        }
                    }
                }
                legoBusinessService = C58096Mr6.LLIIJI;
            } else {
                legoBusinessService = (LegoBusinessService) LIZ;
            }
            throw new RuntimeException(legoBusinessService.LIZ(), th);
        }
    }

    public ActivityC86117Xqz() {
        List<InterfaceC65784Pro<List<G46>>> list = processGenerator;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC65784Pro<List<G46>>> it = list.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().invoke(), arrayList);
        }
        this.innerProcessors = arrayList;
    }

    public void com_bytedance_ies_foundation_activity_BaseActivity__onPause$___twin___() {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86132XrE.LJLIL, 6);
        super.onPause();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86127Xr9.LJLIL, 6);
    }

    public final BaseActivityViewModel getBaseViewModel() {
        return (BaseActivityViewModel) this.baseViewModel$delegate.getValue();
    }

    public final List<G48> getProcessors$foundation_release() {
        return (List) this.processors$delegate.getValue();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86131XrD.LJLIL, 6);
        super.onDestroy();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86126Xr8.LJLIL, 6);
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86133XrF.LJLIL, 6);
        super.onResume();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86128XrA.LJLIL, 6);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86134XrG.LJLIL, 6);
        super.onStart();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86129XrB.LJLIL, 6);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86135XrH.LJLIL, 6);
        super.onStop();
        C86140XrM.LIZ(c86140XrM, this, false, null, C86130XrC.LJLIL, 6);
    }

    @Override // X.C29S
    public AnonymousClass027 getDelegate() {
        final AnonymousClass027 delegate = super.getDelegate();
        o.LJIIIIZZ(delegate, "super.getDelegate()");
        if (C40905G3p.LIZIZ) {
            return new AnonymousClass027(delegate) { // from class: X.18a
                public final AnonymousClass027 LJLJJI;

                @Override // X.AnonymousClass027
                public final boolean LJ() {
                    return this.LJLJJI.LJ();
                }

                @Override // X.AnonymousClass027
                public final AnonymousClass022 LJIIIIZZ() {
                    return this.LJLJJI.LJIIIIZZ();
                }

                @Override // X.AnonymousClass027
                public final int LJIIIZ() {
                    return this.LJLJJI.LJIIIZ();
                }

                @Override // X.AnonymousClass027
                public final MenuInflater LJIIJ() {
                    MenuInflater LJIIJ = this.LJLJJI.LJIIJ();
                    o.LJIIIIZZ(LJIIJ, "superDelegate.menuInflater");
                    return LJIIJ;
                }

                @Override // X.AnonymousClass027
                public final AnonymousClass021 LJIIJJI() {
                    return this.LJLJJI.LJIIJJI();
                }

                @Override // X.AnonymousClass027
                public final void LJIIL() {
                    this.LJLJJI.LJIIL();
                }

                @Override // X.AnonymousClass027
                public final void LJIILIIL() {
                    this.LJLJJI.LJIILIIL();
                }

                @Override // X.AnonymousClass027
                public final void LJIILLIIL() {
                    this.LJLJJI.LJIILLIIL();
                    synchronized (AnonymousClass027.LJLJI) {
                        AnonymousClass027.LJIL(this);
                    }
                }

                @Override // X.AnonymousClass027
                public final void LJIJ() {
                    this.LJLJJI.LJIJ();
                }

                @Override // X.AnonymousClass027
                public final void LJIJJ() {
                    this.LJLJJI.LJIJJ();
                }

                @Override // X.AnonymousClass027
                public final void LJIJJLI() {
                    this.LJLJJI.LJIJJLI();
                }

                {
                    this.LJLJJI = delegate;
                }

                @Override // X.AnonymousClass027
                public final Context LJFF(Context context) {
                    o.LJIIIZ(context, "context");
                    Context LJFF = this.LJLJJI.LJFF(context);
                    o.LJIIIIZZ(LJFF, "superDelegate.attachBase…achBaseContext2(context))");
                    return new FKJ(LJFF, C40905G3p.LIZLLL);
                }

                @Override // X.AnonymousClass027
                public final <T extends View> T LJII(int i) {
                    return (T) this.LJLJJI.LJII(i);
                }

                @Override // X.AnonymousClass027
                public final void LJIILJJIL(Configuration configuration) {
                    this.LJLJJI.LJIILJJIL(configuration);
                }

                @Override // X.AnonymousClass027
                public final void LJIILL(Bundle bundle) {
                    this.LJLJJI.LJIILL(bundle);
                    AnonymousClass027 anonymousClass027 = this.LJLJJI;
                    synchronized (AnonymousClass027.LJLJI) {
                        AnonymousClass027.LJIL(anonymousClass027);
                    }
                    AnonymousClass027.LIZJ(this);
                }

                @Override // X.AnonymousClass027
                public final void LJIIZILJ(Bundle bundle) {
                    this.LJLJJI.LJIIZILJ(bundle);
                }

                @Override // X.AnonymousClass027
                public final void LJIJI(Bundle bundle) {
                    this.LJLJJI.LJIJI(bundle);
                }

                @Override // X.AnonymousClass027
                public final boolean LJJ(int i) {
                    return this.LJLJJI.LJJ(i);
                }

                @Override // X.AnonymousClass027
                public final void LJJI(int i) {
                    this.LJLJJI.LJJI(i);
                }

                @Override // X.AnonymousClass027
                public final void LJJIFFI(View view) {
                    this.LJLJJI.LJJIFFI(view);
                }

                @Override // X.AnonymousClass027
                public final void LJJIIJ(C011902x c011902x) {
                    this.LJLJJI.LJJIIJ(c011902x);
                }

                @Override // X.AnonymousClass027
                public final void LJJIIJZLJL(int i) {
                    this.LJLJJI.LJJIIJZLJL(i);
                }

                @Override // X.AnonymousClass027
                public final void LJJIIZ(CharSequence charSequence) {
                    this.LJLJJI.LJJIIZ(charSequence);
                }

                @Override // X.AnonymousClass027
                public final AbstractC25580zS LJJIIZI(InterfaceC25570zR callback2) {
                    o.LJIIIZ(callback2, "callback");
                    return this.LJLJJI.LJJIIZI(callback2);
                }

                @Override // X.AnonymousClass027
                public final void LIZLLL(View view, ViewGroup.LayoutParams layoutParams) {
                    this.LJLJJI.LIZLLL(view, layoutParams);
                }

                @Override // X.AnonymousClass027
                public final void LJJII(View view, ViewGroup.LayoutParams layoutParams) {
                    this.LJLJJI.LJJII(view, layoutParams);
                }

                @Override // X.AnonymousClass027
                public final View LJI(View view, String str, Context context, AttributeSet attrs) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(attrs, "attrs");
                    return this.LJLJJI.LJI(view, str, context, attrs);
                }
            };
        }
        return delegate;
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null && (!SmartIntent.isSmartIntent(intent))) {
            intent = SmartIntent.smartIntent(intent);
            setIntent(intent);
        }
        o.LJIIIIZZ(intent, "intent");
        return intent;
    }

    public final BaseActivityViewModel getViewModel() {
        return (BaseActivityViewModel) ViewModelProviders.of(this).get(viewModelClass);
    }

    public final boolean isActive() {
        Lifecycle.State state;
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC78499UrP
    public BaseViewModel provideBaseViewModel() {
        return getBaseViewModel();
    }

    public static void com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(ActivityC86117Xqz activityC86117Xqz) {
        activityC86117Xqz.com_bytedance_ies_foundation_activity_BaseActivity__onPause$___twin___();
        C78855Ux9.LJLILLLLZI = activityC86117Xqz.getClass();
    }

    private final void tryCatchDeadSystemException(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (Build.VERSION.SDK_INT > 24) {
            try {
                interfaceC65784Pro.invoke();
                return;
            } catch (DeadSystemException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        interfaceC65784Pro.invoke();
    }

    public final void activityConfiguration(InterfaceC88472Yns<? super BaseActivityViewModel, C76800UCe> build) {
        o.LJIIIZ(build, "build");
        build.invoke(getViewModel());
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Iterator<InterfaceC86124Xr6> it = callback.LJLIL.iterator();
        while (it.hasNext()) {
            context = it.next().attachPreBaseContext(context);
        }
        super.attachBaseContext(context);
        try {
            C39647FhD.LJ(this);
        } catch (Exception unused) {
        }
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        Iterator<InterfaceC86124Xr6> it2 = c86140XrM.LJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().attachBaseContext(context, this);
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS439S0100000_15(newConfig, 16), 6);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        tryCatchDeadSystemException(new AqS162S0200000_15(this, bundle, 88));
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS439S0100000_15(savedInstanceState, 17), 6);
        super.onRestoreInstanceState(savedInstanceState);
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS439S0100000_15(savedInstanceState, 18), 6);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS439S0100000_15(outState, 15), 6);
        super.onSaveInstanceState(outState);
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS439S0100000_15(outState, 13), 6);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new C86125Xr7(z), 6);
    }

    public void setActivityRef(WeakReference<ActivityC86117Xqz> ref) {
        o.LJIIIZ(ref, "ref");
        C86118Xr0 c86118Xr0 = this.$$delegate_0;
        c86118Xr0.getClass();
        c86118Xr0.LJLIL = ref;
    }

    @Override // X.C29S, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS17S0101000_15(this, i, 0), 6);
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void showCustomToast(String str) {
        ActivityC86117Xqz activityC86117Xqz;
        WeakReference<ActivityC86117Xqz> weakReference = this.$$delegate_0.LJLIL;
        if (weakReference == null || (activityC86117Xqz = weakReference.get()) == null || !V1B.LJLI(activityC86117Xqz)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activityC86117Xqz);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.C29S, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS188S0200000_15(this, view, 1), 6);
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new IDqS17S0101000_15(i, intent, 1), 6);
    }

    @Override // X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        Boolean bool = (Boolean) C86140XrM.LIZ(c86140XrM, this, false, Boolean.FALSE, new IDqS17S0101000_15(i, keyEvent, 2), 2);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.KL3
    public void showCustomLongToast(int i, String str) {
        this.$$delegate_0.LIZ(i, str);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C86140XrM c86140XrM = callback;
        c86140XrM.getClass();
        C86140XrM.LIZ(c86140XrM, this, false, null, new C86123Xr5(i, i2, intent), 6);
    }

    public void showCustomToast(String str, int i, int i2) {
        ActivityC86117Xqz activityC86117Xqz;
        WeakReference<ActivityC86117Xqz> weakReference = this.$$delegate_0.LJLIL;
        if (weakReference == null || (activityC86117Xqz = weakReference.get()) == null || !V1B.LJLI(activityC86117Xqz)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activityC86117Xqz);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        callback.getClass();
        Iterator<G48> it = getViewModel().getProcessors().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // X.KL3
    public void showCustomToast(int i, String str, int i2, int i3) {
        this.$$delegate_0.LIZ(i, str);
    }
}
