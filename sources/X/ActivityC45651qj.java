package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.o;

/* renamed from: X.1qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC45651qj extends ComponentActivity implements C06Q, C06R {
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final AnonymousClass096 mFragments;
    public int mNextCandidateRequestIndex;
    public C0MB<String> mPendingFragmentActivityResults;
    public boolean mRequestedPermissionsFromFragment;
    public boolean mResumed;
    public boolean mStartedActivityFromFragment;
    public boolean mStartedIntentSenderFromFragment;
    public boolean mStopped;

    public void androidx_fragment_app_FragmentActivity__applyOverrideConfiguration$___twin___(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityConfigurationLancet_applyOverrideConfiguration(this, configuration);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_startActivityForResult(this, intent, i, bundle);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.LIZ.LJLJJI;
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.LIZ.LJLJJI.LJJIII();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.LIZ();
    }

    public ActivityC45651qj() {
        this.mFragments = new AnonymousClass096(new C40101hm(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public C09N getSupportLoaderManager() {
        return C09N.LIZIZ(this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.LIZ.LJLJJI.LJIJI();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.LIZ.LJLJJI.LJIJJ();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.LIZ.LJLJJI.LJJIIJZLJL(3);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.LIZ();
        this.mFragments.LIZ.LJLJJI.LJJIJIL(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.LIZ.LJLJJI.LJIILJJIL();
        }
        this.mFragments.LIZ();
        this.mFragments.LIZ.LJLJJI.LJJIJIL(true);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.LIZ.LJLJJI.LJJIIJ();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.LIZ.LJLJJI.LJJIIZ();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void supportFinishAfterTransition() {
        C06O.LIZ(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C06O.LIZIZ(this);
    }

    public void supportStartPostponedEnterTransition() {
        C06O.LJ(this);
    }

    public ActivityC45651qj(int i) {
        super(i);
        this.mFragments = new AnonymousClass096(new C40101hm(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.LJIIIIZZ() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            C0MB<String> c0mb = this.mPendingFragmentActivityResults;
            int i = this.mNextCandidateRequestIndex;
            if (c0mb.LJLIL) {
                c0mb.LIZLLL();
            }
            if (C60903NvH.LIZLLL(c0mb.LJLJJI, i, c0mb.LJLILLLLZI) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            } else {
                int i2 = this.mNextCandidateRequestIndex;
                this.mPendingFragmentActivityResults.LJI(i2, fragment.mWho);
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
                return i2;
            }
        }
    }

    public static void checkForValidRequestCode(int i) {
        if ((i & (-65536)) == 0) {
        } else {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.LIZ();
        this.mFragments.LIZ.LJLJJI.LJIILL(configuration);
    }

    @Override // androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C1BB<?> c1bb = this.mFragments.LIZ;
        c1bb.LJLJJI.LJII(c1bb, c1bb, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C1BB<?> c1bb2 = this.mFragments.LIZ;
            if (c1bb2 instanceof ViewModelStoreOwner) {
                c1bb2.LJLJJI.LJJZZIII(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                        this.mPendingFragmentActivityResults = new C0MB<>(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.mPendingFragmentActivityResults.LJI(intArray[i], stringArray[i]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0MB<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.LIZ.LJLJJI.LJIIZILJ();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.LIZ.LJLJJI.LJIJJLI(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.LIZ();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.LIZ.LJLJJI.LJJIFFI(z);
    }

    @Override // androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        Parcelable LJL = this.mFragments.LIZ.LJLJJI.LJL();
        if (LJL != null) {
            bundle.putParcelable("android:support:fragments", LJL);
        }
        if (this.mPendingFragmentActivityResults.LJIIIIZZ() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.LJIIIIZZ()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.LJIIIIZZ()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.LJIIIIZZ(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.LJFF(i);
                strArr[i] = this.mPendingFragmentActivityResults.LJIIIZ(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void setEnterSharedElementCallback(AbstractC020606g abstractC020606g) {
        C06O.LIZJ(this, null);
    }

    public void setExitSharedElementCallback(AbstractC020606g abstractC020606g) {
        C06O.LIZLLL(this, null);
    }

    @Override // X.C06R
    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public static void androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityConfigurationLancet_applyOverrideConfiguration(ActivityC45651qj activityC45651qj, Configuration configuration) {
        Integer num;
        Resources resources;
        Configuration configuration2;
        Configuration configuration3;
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (!SettingsManager.LIZ("activity_configuration_webview_fix", true)) {
            activityC45651qj.androidx_fragment_app_FragmentActivity__applyOverrideConfiguration$___twin___(configuration);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        o.LJII(activityC45651qj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        if (i < 26) {
            Resources resources2 = activityC45651qj.getResources();
            Integer num2 = null;
            if (resources2 != null && (configuration3 = resources2.getConfiguration()) != null) {
                num = Integer.valueOf(configuration3.uiMode);
            } else {
                num = null;
            }
            Context LLLLLILLIL = C16880lQ.LLLLLILLIL(activityC45651qj);
            if (LLLLLILLIL != null && (resources = LLLLLILLIL.getResources()) != null && (configuration2 = resources.getConfiguration()) != null) {
                num2 = Integer.valueOf(configuration2.uiMode);
            }
            if (o.LJ(num, num2)) {
                return;
            }
        }
        activityC45651qj.androidx_fragment_app_FragmentActivity__applyOverrideConfiguration$___twin___(configuration);
    }

    public static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.LJJJJLI()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                if (fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            AnonymousClass096 anonymousClass096 = this.mFragments;
            return onCreatePanelMenu | anonymousClass096.LIZ.LJLJJI.LJIJ(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.mFragments.LIZ.LJLJJI.LJIILLIIL(menuItem);
        }
        return this.mFragments.LIZ.LJLJJI.LJIL(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.LIZ.LJLJJI.LJJ(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void androidx_fragment_app_FragmentActivity__startActivityForResult$___twin___(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment LJJJJ;
        this.mFragments.LIZ();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String LJ = this.mPendingFragmentActivityResults.LJ(i4, null);
            this.mPendingFragmentActivityResults.LJII(i4);
            if (LJ == null || (LJJJJ = this.mFragments.LIZ.LJLJJI.LJJJJ(LJ)) == null) {
                return;
            }
            LJJJJ.onActivityResult(i & 65535, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.LIZ.LJLJJI.LJJII(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment LJJJJ;
        this.mFragments.LIZ();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String LJ = this.mPendingFragmentActivityResults.LJ(i3, null);
            this.mPendingFragmentActivityResults.LJII(i3);
            if (LJ == null || (LJJJJ = this.mFragments.LIZ.LJLJJI.LJJJJ(LJ)) == null) {
                return;
            }
            LJJJJ.onRequestPermissionsResult(i & 65535, strArr, iArr);
        }
    }

    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C1AR.LJFF(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C1AR.LJFF(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public static void androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_startActivityForResult(ActivityC45651qj activityC45651qj, Intent intent, int i, Bundle bundle) {
        C1FP.LJIJI(C35527Dwx.LJLIL);
        activityC45651qj.androidx_fragment_app_FragmentActivity__startActivityForResult$___twin___(intent, i, bundle);
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.LIZ.LJLJJI.mLayoutInflaterFactory.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("  ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        printWriter.print(LIZIZ);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C09N.LIZIZ(this).LIZLLL(LIZIZ, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.LIZ.LJLJJI.LJJIIZI(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        try {
            if (i == -1) {
                C06N.LIZIZ(this, intent, -1, bundle);
            } else {
                checkForValidRequestCode(i);
                C06N.LIZIZ(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            }
        } finally {
            this.mStartedActivityFromFragment = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.mStartedIntentSenderFromFragment = true;
        try {
            if (i == -1) {
                C06N.LIZJ(this, intentSender, i, intent, i2, i3, i4, bundle);
            } else {
                checkForValidRequestCode(i);
                C06N.LIZJ(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
            }
        } finally {
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
