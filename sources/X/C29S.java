package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.29S, reason: invalid class name */
/* loaded from: classes.dex */
public class C29S extends ActivityC45651qj implements AnonymousClass026, InterfaceC020806i {
    public AnonymousClass027 mDelegate;
    public Resources mResources;

    public void androidx_appcompat_app_AppCompatActivity__recreate$___twin___() {
        super.recreate();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(this);
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C020906j c020906j) {
    }

    @Override // X.AnonymousClass026
    public void onSupportActionModeFinished(AbstractC25580zS abstractC25580zS) {
    }

    @Override // X.AnonymousClass026
    public void onSupportActionModeStarted(AbstractC25580zS abstractC25580zS) {
    }

    public void onSupportContentChanged() {
    }

    @Override // X.AnonymousClass026
    public AbstractC25580zS onWindowStartingSupportActionMode(InterfaceC25570zR interfaceC25570zR) {
        return null;
    }

    @Override // android.app.Activity
    public void recreate() {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, view, layoutParams);
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public Resources androidx_appcompat_app_AppCompatActivity__getResources$___twin___() {
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public AnonymousClass027 getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.mDelegate;
    }

    public C29S() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().LIZJ("androidx:appcompat", new AnonymousClass106() { // from class: X.18U
            @Override // X.AnonymousClass106
            public final Bundle saveState() {
                Bundle bundle = new Bundle();
                C29S.this.getDelegate().LJIJI(bundle);
                return bundle;
            }
        });
        addOnContextAvailableListener(new InterfaceC17450mL() { // from class: X.18V
            @Override // X.InterfaceC17450mL
            public final void LIZ(Context context) {
                AnonymousClass027 delegate = C29S.this.getDelegate();
                delegate.LJIIL();
                delegate.LJIILL(C29S.this.getSavedStateRegistry().LIZ("androidx:appcompat"));
            }
        });
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        C10A.LIZIZ(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.LIZ()) {
                super.closeOptionsMenu();
            }
        }
    }

    public AnonymousClass022 getDrawerToggleDelegate() {
        return getDelegate().LJIIIIZZ();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().LJIIJ();
    }

    public AnonymousClass021 getSupportActionBar() {
        return getDelegate().LJIIJJI();
    }

    @Override // X.InterfaceC020806i
    public Intent getSupportParentActivityIntent() {
        return C021806s.LIZ(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().LJIILIIL();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().LJIILLIIL();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().LJIJ();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().LJIJJ();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().LJIJJLI();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                C020906j c020906j = new C020906j(this);
                onCreateSupportNavigateUpTaskStack(c020906j);
                onPrepareSupportNavigateUpTaskStack(c020906j);
                c020906j.LJFF();
                try {
                    C06N.LIZ(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.LJIIJJI()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // X.ActivityC45651qj
    public void supportInvalidateOptionsMenu() {
        getDelegate().LJIILIIL();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public C29S(int i) {
        super(i);
        initDelegate();
    }

    public static Resources androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(C29S c29s) {
        Resources androidx_appcompat_app_AppCompatActivity__getResources$___twin___ = c29s.androidx_appcompat_app_AppCompatActivity__getResources$___twin___();
        TiktokSkinHelper.LIZ(androidx_appcompat_app_AppCompatActivity__getResources$___twin___);
        return androidx_appcompat_app_AppCompatActivity__getResources$___twin___;
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(C29S c29s) {
        c29s.androidx_appcompat_app_AppCompatActivity__recreate$___twin___();
        try {
            throw new RuntimeException("Activity recreated!");
        } catch (Exception e) {
            PEH.LIZJ(e);
        }
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(int i) {
        initViewTreeOwners();
        getDelegate().LJJI(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().LJFF(context));
    }

    @Override // X.C1AU, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.LJIIJ(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().LJII(i);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().LJIILJJIL(configuration);
    }

    public void onCreateSupportNavigateUpTaskStack(C020906j c020906j) {
        c020906j.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null || (supportParentActivityIntent = C021806s.LIZ(this)) != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(c020906j.LJLILLLLZI.getPackageManager());
            }
            c020906j.LIZJ(component);
            c020906j.LJLIL.add(supportParentActivityIntent);
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().LJIIZILJ(bundle);
    }

    public void setSupportActionBar(C011902x c011902x) {
        getDelegate().LJJIIJ(c011902x);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().LJJIIJZLJL(i);
    }

    public AbstractC25580zS startSupportActionMode(InterfaceC25570zR interfaceC25570zR) {
        return getDelegate().LJJIIZI(interfaceC25570zR);
    }

    public void supportNavigateUpTo(Intent intent) {
        C021706r.LIZIZ(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().LJJ(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C021706r.LIZJ(this, intent);
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(View view) {
        initViewTreeOwners();
        getDelegate().LJJIFFI(view);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(C29S c29s, int i) {
        if (!C35825E4f.LIZ()) {
            c29s.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(i);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c29s.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(i);
        C35825E4f.LIZIZ(i, SystemClock.elapsedRealtime() - elapsedRealtime, c29s, "set");
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C29S c29s, View view) {
        C29S c29s2;
        o.LJIIIZ(view, "view");
        if (c29s instanceof C29S) {
            c29s2 = c29s;
        } else {
            c29s2 = null;
        }
        C90903hW.LIZ(c29s2);
        c29s.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().LIZLLL(view, layoutParams);
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().LJJII(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.LIZLLL() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().LJJIIZ(charSequence);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C29S c29s, int i) {
        C29S c29s2;
        if (c29s instanceof C29S) {
            c29s2 = c29s;
        } else {
            c29s2 = null;
        }
        C90903hW.LIZ(c29s2);
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(c29s, i);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C29S c29s, View view, ViewGroup.LayoutParams param) {
        C29S c29s2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(param, "param");
        if (c29s instanceof C29S) {
            c29s2 = c29s;
        } else {
            c29s2 = null;
        }
        C90903hW.LIZ(c29s2);
        c29s.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(view, param);
    }
}
