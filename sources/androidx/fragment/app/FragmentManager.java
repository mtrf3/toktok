package androidx.fragment.app;

import X.AbstractC008101l;
import X.AbstractC025808g;
import X.AnonymousClass091;
import X.AnonymousClass094;
import X.AnonymousClass095;
import X.AnonymousClass098;
import X.AnonymousClass099;
import X.BPQ;
import X.BPR;
import X.C025508d;
import X.C025708f;
import X.C026808q;
import X.C08X;
import X.C08Y;
import X.C08Z;
import X.C09A;
import X.C09B;
import X.C09E;
import X.C0M4;
import X.C0ON;
import X.C10610bJ;
import X.C15050iT;
import X.C16880lQ;
import X.C18I;
import X.C198517qh;
import X.C1B0;
import X.C1B1;
import X.C1B2;
import X.C1B3;
import X.C1B8;
import X.C1BB;
import X.C28771Az;
import X.C39144FXw;
import X.C78977Uz7;
import X.C84763XOl;
import X.C8HX;
import X.InterfaceC025208a;
import X.InterfaceC025308b;
import X.InterfaceC026608o;
import X.X1D;
import Y.ARunnableS9S0201000_6;
import Y.IDRunnableS0S0201000;
import Y.IDRunnableS85S0100000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean DEBUG;
    public ArrayList<C1B3> mBackStack;
    public ArrayList<InterfaceC025208a> mBackStackChangeListeners;
    public AnonymousClass095 mContainer;
    public ArrayList<Fragment> mCreatedMenus;
    public boolean mDestroyed;
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public C1BB<?> mHost;
    public boolean mNeedMenuInvalidate;
    public FragmentManagerViewModel mNonConfig;
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    public Fragment mParent;
    public ArrayList<C1B2> mPostponedTransactions;
    public Fragment mPrimaryNav;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList<Fragment> mTmpAddedFragments;
    public ArrayList<Boolean> mTmpIsPop;
    public ArrayList<C1B3> mTmpRecords;
    public final ArrayList<InterfaceC025308b> mPendingActions = new ArrayList<>();
    public final C025508d mFragmentStore = new C025508d();
    public final AnonymousClass099 mLayoutInflaterFactory = new AnonymousClass099(this);
    public final AbstractC008101l mOnBackPressedCallback = new AbstractC008101l() { // from class: X.1Ay
        @Override // X.AbstractC008101l
        public final void LIZ() {
            FragmentManager.this.LJJJJZ();
        }

        {
            super(false);
        }
    };
    public final AtomicInteger mBackStackIndex = new AtomicInteger();
    public ConcurrentHashMap<Fragment, HashSet<C10610bJ>> mExitAnimationCancellationSignals = new ConcurrentHashMap<>();
    public final InterfaceC026608o mFragmentTransitionCallback = new C28771Az(this);
    public final C09B mLifecycleCallbacksDispatcher = new C09B(this);
    public int mCurState = -1;
    public AnonymousClass098 mFragmentFactory = null;
    public AnonymousClass098 mHostFragmentFactory = new C1B0(this);
    public Runnable mExecCommit = new IDRunnableS85S0100000(this, 19);

    public final void LJIIJ() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    public final void LJIILJJIL() {
        this.mStateSaved = false;
        this.mStopped = false;
        LJJIIJZLJL(2);
    }

    public final void LJIIZILJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        LJJIIJZLJL(1);
    }

    public final void LJIJI() {
        this.mDestroyed = true;
        LJJIJIL(true);
        LJJIJ();
        LJJIIJZLJL(-1);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.LIZIZ();
            this.mOnBackPressedDispatcher = null;
        }
    }

    public final void LJJIII() {
        this.mStateSaved = false;
        this.mStopped = false;
        LJJIIJZLJL(4);
    }

    public final void LJJIIJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        LJJIIJZLJL(3);
    }

    public final void LJJIIZ() {
        this.mStopped = true;
        LJJIIJZLJL(2);
    }

    public final void LJJIL() {
        LJJIJIL(true);
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                ((C1B2) ListProtector.remove(this.mPostponedTransactions, 0)).LIZ();
            }
        }
    }

    public final void LJJJJZ() {
        LJJIJIL(true);
        if (this.mOnBackPressedCallback.LIZ) {
            LJJLIIIJL();
        } else {
            this.mOnBackPressedDispatcher.LIZJ();
        }
    }

    public final void LJJLIIIJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean LJJLIIIJL() {
        return LJJLIIIJLJLI(-1, 0, null);
    }

    public static boolean LJJJJZI() {
        if (DEBUG || Log.isLoggable("FragmentManager", 2)) {
            return true;
        }
        return false;
    }

    public final int LJI() {
        return this.mBackStackIndex.getAndIncrement();
    }

    public final void LJIJJ() {
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void LJJIJ() {
        if (!this.mExitAnimationCancellationSignals.isEmpty()) {
            for (Fragment fragment : this.mExitAnimationCancellationSignals.keySet()) {
                LJIIIZ(fragment);
                LIZ(this, fragment, fragment.getStateAfterAnimating());
            }
        }
    }

    public final int LJJJJIZL() {
        ArrayList<C1B3> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final AnonymousClass098 LJJJJL() {
        AnonymousClass098 anonymousClass098 = this.mFragmentFactory;
        if (anonymousClass098 != null) {
            return anonymousClass098;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.LJJJJL();
        }
        return this.mHostFragmentFactory;
    }

    public final List<Fragment> LJJJJLI() {
        return this.mFragmentStore.LIZLLL();
    }

    public final boolean LJJJLZIJ() {
        if (this.mStateSaved || this.mStopped) {
            return true;
        }
        return false;
    }

    public final void LJJLIIIJJI() {
        LJJIJIIJI(new C1B1(this, null, -1, 0), false);
    }

    public final Parcelable LJL() {
        ArrayList<String> arrayList;
        int size;
        int i = 0;
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                ((C1B2) ListProtector.remove(this.mPostponedTransactions, 0)).LIZ();
            }
        }
        LJJIJ();
        LJJIJIL(true);
        this.mStateSaved = true;
        C025508d c025508d = this.mFragmentStore;
        c025508d.getClass();
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(c025508d.LIZIZ.size());
        for (C09E c09e : c025508d.LIZIZ.values()) {
            if (c09e != null) {
                FragmentState fragmentState = new FragmentState(c09e.LIZIZ);
                Fragment fragment = c09e.LIZIZ;
                if (fragment.mState > -1 && fragmentState.LJLLJ == null) {
                    Bundle LIZIZ = c09e.LIZIZ();
                    fragmentState.LJLLJ = LIZIZ;
                    if (c09e.LIZIZ.mTargetWho != null) {
                        if (LIZIZ == null) {
                            fragmentState.LJLLJ = new Bundle();
                        }
                        fragmentState.LJLLJ.putString("android:target_state", c09e.LIZIZ.mTargetWho);
                        int i2 = c09e.LIZIZ.mTargetRequestCode;
                        if (i2 != 0) {
                            fragmentState.LJLLJ.putInt("android:target_req_state", i2);
                        }
                    }
                } else {
                    fragmentState.LJLLJ = fragment.mSavedFragmentState;
                }
                arrayList2.add(fragmentState);
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            return null;
        }
        C025508d c025508d2 = this.mFragmentStore;
        synchronized (c025508d2.LIZ) {
            if (!c025508d2.LIZ.isEmpty()) {
                arrayList = new ArrayList<>(c025508d2.LIZ.size());
                Iterator<Fragment> it = c025508d2.LIZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mWho);
                }
            } else {
                arrayList = null;
            }
        }
        ArrayList<C1B3> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            do {
                backStackStateArr[i] = new BackStackState((C1B3) ListProtector.get(this.mBackStack, i));
                i++;
            } while (i < size);
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.LJLIL = arrayList2;
        fragmentManagerState.LJLILLLLZI = arrayList;
        fragmentManagerState.LJLJI = backStackStateArr;
        fragmentManagerState.LJLJJI = this.mBackStackIndex.get();
        Fragment fragment2 = this.mPrimaryNav;
        if (fragment2 != null) {
            fragmentManagerState.LJLJJL = fragment2.mWho;
        }
        return fragmentManagerState;
    }

    public final void LJLIIIL() {
        boolean z;
        synchronized (this.mPendingActions) {
            ArrayList<C1B2> arrayList = this.mPostponedTransactions;
            boolean z2 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (this.mPendingActions.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.mHost.LJLJI.removeCallbacks(this.mExecCommit);
                this.mHost.LJLJI.post(this.mExecCommit);
                LJLJL();
            }
        }
    }

    public final void LJLJJI() {
        Iterator it = ((ArrayList) this.mFragmentStore.LIZJ()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                LJJLIIIJILLIZJL(fragment);
            }
        }
    }

    public final void LJLJL() {
        synchronized (this.mPendingActions) {
            boolean z = true;
            if (!this.mPendingActions.isEmpty()) {
                this.mOnBackPressedCallback.LIZ = true;
                return;
            }
            AbstractC008101l abstractC008101l = this.mOnBackPressedCallback;
            if (LJJJJIZL() <= 0 || !LJJJLL(this.mParent)) {
                z = false;
            }
            abstractC008101l.LIZ = z;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(C16880lQ.LJLLJ(fragment.getClass()));
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            sb.append(C16880lQ.LJLLJ(this.mHost.getClass()));
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    public static boolean LJJJLIIL(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = ((ArrayList) fragment.mChildFragmentManager.mFragmentStore.LIZJ()).iterator();
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null && LJJJLIIL(fragment2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJJLL(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.mPrimaryNav) && LJJJLL(fragmentManager.mParent)) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(C0M4<Fragment> c0m4) {
        int i = this.mCurState;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment.mState < min) {
                LIZ(this, fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c0m4.add(fragment);
                }
            }
        }
    }

    public final void LIZLLL(Fragment fragment) {
        LJJJZ(fragment);
        if (!fragment.mDetached) {
            this.mFragmentStore.LIZ(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (LJJJLIIL(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    public final void LJ(InterfaceC025208a interfaceC025208a) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(interfaceC025208a);
    }

    public final void LJFF(Fragment fragment) {
        if (LJJJLZIJ()) {
            return;
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        if (fragmentManagerViewModel.LJLIL.containsKey(fragment.mWho)) {
            return;
        }
        fragmentManagerViewModel.LJLIL.put(fragment.mWho, fragment);
    }

    public final void LJIIIIZZ(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.LIZ(fragment);
                if (LJJJLIIL(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public final void LJIIIZ(Fragment fragment) {
        HashSet<C10610bJ> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null) {
            Iterator<C10610bJ> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            hashSet.clear();
            LJIIL(fragment);
            this.mExitAnimationCancellationSignals.remove(fragment);
        }
    }

    public final void LJIIL(Fragment fragment) {
        fragment.performDestroyView();
        this.mLifecycleCallbacksDispatcher.LJIILIIL(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void LJIILIIL(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                C025508d c025508d = this.mFragmentStore;
                synchronized (c025508d.LIZ) {
                    c025508d.LIZ.remove(fragment);
                }
                fragment.mAdded = false;
                if (LJJJLIIL(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                LJLJI(fragment);
            }
        }
    }

    public final void LJIILL(Configuration configuration) {
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final boolean LJIILLIIL(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIJJLI(boolean z) {
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final boolean LJIL(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void LJJ(Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void LJJI(Fragment fragment) {
        if (fragment != null && fragment.equals(LJJJ(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void LJJIFFI(boolean z) {
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final boolean LJJII(Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void LJJIIJZLJL(int i) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.LIZIZ(i);
            LJJLIIIIJ(i, false);
            this.mExecutingActions = false;
            LJJIJIL(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    public final void LJJIJIIJIL(boolean z) {
        if (!this.mExecutingActions) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.mHost.LJLJI.getLooper()) {
                if (z || !LJJJLZIJ()) {
                    if (this.mTmpRecords == null) {
                        this.mTmpRecords = new ArrayList<>();
                        this.mTmpIsPop = new ArrayList<>();
                    }
                    this.mExecutingActions = true;
                    try {
                        LJJIZ(null, null);
                        return;
                    } finally {
                        this.mExecutingActions = false;
                    }
                }
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean LJJIJIL(boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C78977Uz7.LJJLIIIIJ(new ARunnableS9S0201000_6(0, atomicBoolean, this, 8));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentManagerLancet#execPendingActions find action cost: ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        LJJIJIIJIL(z);
        boolean z3 = false;
        while (true) {
            ArrayList<C1B3> arrayList = this.mTmpRecords;
            ArrayList<Boolean> arrayList2 = this.mTmpIsPop;
            synchronized (this.mPendingActions) {
                if (!this.mPendingActions.isEmpty()) {
                    int size = this.mPendingActions.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= this.mPendingActions.get(i).LIZ(arrayList, arrayList2);
                    }
                    this.mPendingActions.clear();
                    this.mHost.LJLJI.removeCallbacks(this.mExecCommit);
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                break;
            }
            this.mExecutingActions = true;
            try {
                LJJZ(this.mTmpRecords, this.mTmpIsPop);
                LJIIJ();
                z3 = true;
            } catch (Throwable th) {
                LJIIJ();
                throw th;
            }
        }
        LJLJL();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            LJLJJI();
        }
        this.mFragmentStore.LIZIZ.values().removeAll(Collections.singleton(null));
        BPR LIZ2 = C39144FXw.LIZ();
        if (LIZ2 != null && LIZ2.LIZ) {
            BPQ.LIZIZ().execute(new IDRunnableS0S0201000(3, atomicBoolean, this, 5));
        }
        return z3;
    }

    public final Fragment LJJJ(String str) {
        C09E c09e = this.mFragmentStore.LIZIZ.get(str);
        if (c09e != null) {
            return c09e.LIZIZ;
        }
        return null;
    }

    public final Fragment LJJJI(int i) {
        C025508d c025508d = this.mFragmentStore;
        int size = c025508d.LIZ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) ListProtector.get(c025508d.LIZ, size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C09E c09e : c025508d.LIZIZ.values()) {
                    if (c09e != null) {
                        Fragment fragment2 = c09e.LIZIZ;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment LJJJIL(String str) {
        C025508d c025508d = this.mFragmentStore;
        if (str != null) {
            int size = c025508d.LIZ.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Fragment fragment = (Fragment) ListProtector.get(c025508d.LIZ, size);
                    if (fragment != null && str.equals(fragment.mTag)) {
                        return fragment;
                    }
                } else {
                    for (C09E c09e : c025508d.LIZIZ.values()) {
                        if (c09e != null) {
                            Fragment fragment2 = c09e.LIZIZ;
                            if (str.equals(fragment2.mTag)) {
                                return fragment2;
                            }
                        }
                    }
                }
            }
        } else {
            c025508d.getClass();
        }
        return null;
    }

    public final Fragment LJJJJ(String str) {
        Fragment findFragmentByWho;
        for (C09E c09e : this.mFragmentStore.LIZIZ.values()) {
            if (c09e != null && (findFragmentByWho = c09e.LIZIZ.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final C08Y LJJJJI(int i) {
        return (C08Y) ListProtector.get(this.mBackStack, i);
    }

    public final ViewGroup LJJJJJL(Fragment fragment) {
        if (fragment.mContainerId > 0 && this.mContainer.LIZIZ()) {
            View LIZ = this.mContainer.LIZ(fragment.mContainerId);
            if (LIZ instanceof ViewGroup) {
                return (ViewGroup) LIZ;
            }
        }
        return null;
    }

    public final ViewModelStore LJJJJLL(Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        ViewModelStore viewModelStore = fragmentManagerViewModel.LJLJI.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            fragmentManagerViewModel.LJLJI.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    public final void LJJJZ(Fragment fragment) {
        C025508d c025508d = this.mFragmentStore;
        if (c025508d.LIZIZ.containsKey(fragment.mWho)) {
            return;
        }
        C09E c09e = new C09E(this.mLifecycleCallbacksDispatcher, fragment);
        c09e.LIZ(this.mHost.LJLILLLLZI.getClassLoader());
        this.mFragmentStore.LIZIZ.put(fragment.mWho, c09e);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                LJFF(fragment);
            } else {
                LJJZZI(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        c09e.LIZJ = this.mCurState;
    }

    public final void LJJL(final Fragment fragment) {
        int i;
        if (!this.mFragmentStore.LIZIZ.containsKey(fragment.mWho)) {
            return;
        }
        LIZ(this, fragment, this.mCurState);
        if (fragment.mView != null) {
            C025508d c025508d = this.mFragmentStore;
            c025508d.getClass();
            ViewGroup viewGroup = fragment.mContainer;
            View view = fragment.mView;
            if (viewGroup != null && view != null) {
                int indexOf = c025508d.LIZ.indexOf(fragment);
                while (true) {
                    indexOf--;
                    if (indexOf < 0) {
                        break;
                    }
                    Fragment fragment2 = (Fragment) ListProtector.get(c025508d.LIZ, indexOf);
                    if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                        View view2 = fragment2.mView;
                        ViewGroup viewGroup2 = fragment.mContainer;
                        int indexOfChild = viewGroup2.indexOfChild(view2);
                        int indexOfChild2 = viewGroup2.indexOfChild(fragment.mView);
                        if (indexOfChild2 < indexOfChild) {
                            C16880lQ.LLIFFJFJJ(indexOfChild2, viewGroup2);
                            viewGroup2.addView(fragment.mView, indexOfChild);
                        }
                    }
                }
            }
            if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                AnonymousClass091 LIZ = AnonymousClass094.LIZ(this.mHost.LJLILLLLZI, this.mContainer, fragment, true);
                if (LIZ != null) {
                    Animation animation = LIZ.LIZ;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        LIZ.LIZIZ.setTarget(fragment.mView);
                        LIZ.LIZIZ.start();
                    }
                }
            }
        }
        if (fragment.mHiddenChanged) {
            if (fragment.mView != null) {
                AnonymousClass091 LIZ2 = AnonymousClass094.LIZ(this.mHost.LJLILLLLZI, this.mContainer, fragment, !fragment.mHidden);
                if (LIZ2 != null) {
                    Animator animator = LIZ2.LIZIZ;
                    if (animator != null) {
                        animator.setTarget(fragment.mView);
                        if (fragment.mHidden) {
                            if (fragment.isHideReplaced()) {
                                fragment.setHideReplaced(false);
                            } else {
                                final ViewGroup viewGroup3 = fragment.mContainer;
                                final View view3 = fragment.mView;
                                viewGroup3.startViewTransition(view3);
                                LIZ2.LIZIZ.addListener(new AnimatorListenerAdapter() { // from class: X.09C
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator2) {
                                        viewGroup3.endViewTransition(view3);
                                        C16880lQ.LJLJLJ(this, animator2);
                                        Fragment fragment3 = fragment;
                                        View view4 = fragment3.mView;
                                        if (view4 != null && fragment3.mHidden) {
                                            view4.setVisibility(8);
                                        }
                                    }
                                });
                            }
                        } else {
                            fragment.mView.setVisibility(0);
                        }
                        LIZ2.LIZIZ.start();
                    } else {
                        fragment.mView.startAnimation(LIZ2.LIZ);
                        LIZ2.LIZ.start();
                    }
                }
                if (fragment.mHidden && !fragment.isHideReplaced()) {
                    i = 8;
                } else {
                    i = 0;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
            if (fragment.mAdded && LJJJLIIL(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mHiddenChanged = false;
            fragment.onHiddenChanged(fragment.mHidden);
        }
    }

    public final void LJJLIIIJILLIZJL(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = false;
                LIZ(this, fragment, this.mCurState);
            }
        }
    }

    public final void LJJLJLI(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            C025508d c025508d = this.mFragmentStore;
            synchronized (c025508d.LIZ) {
                c025508d.LIZ.remove(fragment);
            }
            fragment.mAdded = false;
            if (LJJJLIIL(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            LJLJI(fragment);
        }
    }

    public final void LJJLL(InterfaceC025208a interfaceC025208a) {
        ArrayList<InterfaceC025208a> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(interfaceC025208a);
        }
    }

    public final void LJJZZI(Fragment fragment) {
        if (LJJJLZIJ()) {
            return;
        }
        this.mNonConfig.LJLIL.remove(fragment.mWho);
    }

    public final void LJJZZIII(Parcelable parcelable) {
        Fragment fragment;
        C09E c09e;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.LJLIL == null) {
            return;
        }
        this.mFragmentStore.LIZIZ.clear();
        Iterator<FragmentState> it = fragmentManagerState.LJLIL.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment fragment2 = this.mNonConfig.LJLIL.get(next.LJLILLLLZI);
                if (fragment2 != null) {
                    c09e = new C09E(this.mLifecycleCallbacksDispatcher, fragment2, next);
                } else {
                    c09e = new C09E(this.mLifecycleCallbacksDispatcher, this.mHost.LJLILLLLZI.getClassLoader(), LJJJJL(), next);
                }
                c09e.LIZIZ.mFragmentManager = this;
                c09e.LIZ(this.mHost.LJLILLLLZI.getClassLoader());
                this.mFragmentStore.LIZIZ.put(c09e.LIZIZ.mWho, c09e);
                c09e.LIZJ = this.mCurState;
            }
        }
        for (Fragment fragment3 : this.mNonConfig.LJLIL.values()) {
            if (!this.mFragmentStore.LIZIZ.containsKey(fragment3.mWho)) {
                LIZ(this, fragment3, 1);
                fragment3.mRemoving = true;
                LIZ(this, fragment3, -1);
            }
        }
        C025508d c025508d = this.mFragmentStore;
        ArrayList<String> arrayList = fragmentManagerState.LJLILLLLZI;
        c025508d.LIZ.clear();
        if (arrayList != null) {
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                C09E c09e2 = c025508d.LIZIZ.get(next2);
                if (c09e2 != null && (fragment = c09e2.LIZIZ) != null) {
                    c025508d.LIZ(fragment);
                } else {
                    throw new IllegalStateException(a1.LJ("No instantiated fragment for (", next2, ")"));
                }
            }
        }
        if (fragmentManagerState.LJLJI != null) {
            this.mBackStack = new ArrayList<>(fragmentManagerState.LJLJI.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.LJLJI;
                if (i >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i];
                backStackState.getClass();
                C1B3 c1b3 = new C1B3(this);
                int i2 = 0;
                int i3 = 0;
                while (i2 < backStackState.LJLIL.length) {
                    C025708f c025708f = new C025708f();
                    int i4 = i2 + 1;
                    c025708f.LIZ = backStackState.LJLIL[i2];
                    String str = (String) ListProtector.get(backStackState.LJLILLLLZI, i3);
                    if (str != null) {
                        c025708f.LIZIZ = LJJJ(str);
                    } else {
                        c025708f.LIZIZ = null;
                    }
                    c025708f.LJI = Lifecycle.State.values()[backStackState.LJLJI[i3]];
                    c025708f.LJII = Lifecycle.State.values()[backStackState.LJLJJI[i3]];
                    int[] iArr = backStackState.LJLIL;
                    int i5 = i4 + 1;
                    int i6 = iArr[i4];
                    c025708f.LIZJ = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    c025708f.LIZLLL = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    c025708f.LJ = i10;
                    i2 = i9 + 1;
                    int i11 = iArr[i9];
                    c025708f.LJFF = i11;
                    c1b3.LIZIZ = i6;
                    c1b3.LIZJ = i8;
                    c1b3.LIZLLL = i10;
                    c1b3.LJ = i11;
                    c1b3.LIZJ(c025708f);
                    i3++;
                }
                c1b3.LJFF = backStackState.LJLJJL;
                c1b3.LJIIIIZZ = backStackState.LJLJJLL;
                c1b3.LJIJ = backStackState.LJLJL;
                c1b3.LJI = true;
                c1b3.LJIIIZ = backStackState.LJLJLJ;
                c1b3.LJIIJ = backStackState.LJLJLLL;
                c1b3.LJIIJJI = backStackState.LJLL;
                c1b3.LJIIL = backStackState.LJLLI;
                c1b3.LJIILIIL = backStackState.LJLLILLLL;
                c1b3.LJIILJJIL = backStackState.LJLLJ;
                c1b3.LJIILL = backStackState.LJLLL;
                c1b3.LJIILIIL(1);
                if (LJJJJZI()) {
                    PrintWriter printWriter = new PrintWriter(new C15050iT());
                    c1b3.LJIJ("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(c1b3);
                i++;
            }
        } else {
            this.mBackStack = null;
        }
        this.mBackStackIndex.set(fragmentManagerState.LJLJJI);
        String str2 = fragmentManagerState.LJLJJL;
        if (str2 != null) {
            Fragment LJJJ = LJJJ(str2);
            this.mPrimaryNav = LJJJ;
            LJJI(LJJJ);
        }
    }

    public final Fragment.SavedState LJLI(Fragment fragment) {
        Bundle LIZIZ;
        C09E c09e = this.mFragmentStore.LIZIZ.get(fragment.mWho);
        if (c09e != null && c09e.LIZIZ.equals(fragment)) {
            if (c09e.LIZIZ.mState <= -1 || (LIZIZ = c09e.LIZIZ()) == null) {
                return null;
            }
            return new Fragment.SavedState(LIZIZ);
        }
        LJLJJL(new IllegalStateException(C1B8.LIZ("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void LJLILLLLZI(Fragment fragment) {
        if (fragment == null || (fragment.equals(LJJJ(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            LJJI(fragment2);
            LJJI(this.mPrimaryNav);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fragment ");
        LIZ.append(fragment);
        LIZ.append(" is not an active fragment of FragmentManager ");
        LIZ.append(this);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final void LJLJI(Fragment fragment) {
        ViewGroup LJJJJJL = LJJJJJL(fragment);
        if (LJJJJJL != null) {
            if (LJJJJJL.getTag(R.id.nda) == null) {
                LJJJJJL.setTag(R.id.nda, fragment);
            }
            ((Fragment) LJJJJJL.getTag(R.id.nda)).setNextAnim(fragment.getNextAnim());
        }
    }

    public final void LJLJJL(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new C15050iT());
        C1BB<?> c1bb = this.mHost;
        try {
            if (c1bb != null) {
                c1bb.LIZLLL(printWriter, new String[0]);
            } else {
                LJJIIZI("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void LJLJJLL(C08Z c08z) {
        C09B c09b = this.mLifecycleCallbacksDispatcher;
        synchronized (c09b.LIZ) {
            int size = c09b.LIZ.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (c09b.LIZ.get(i).LIZ == c08z) {
                    c09b.LIZ.remove(i);
                    break;
                }
                i++;
            }
        }
    }

    public final void LIZJ(Fragment fragment, C10610bJ c10610bJ) {
        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
            this.mExitAnimationCancellationSignals.put(fragment, new HashSet<>());
        }
        this.mExitAnimationCancellationSignals.get(fragment).add(c10610bJ);
    }

    public final boolean LJIJ(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.LIZLLL()) {
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment2 = (Fragment) ListProtector.get(this.mCreatedMenus, i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public final void LJJIJIIJI(InterfaceC025308b interfaceC025308b, boolean z) {
        if (!z) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (LJJJLZIJ()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.mPendingActions) {
            if (this.mHost == null) {
                if (z) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.mPendingActions.add(interfaceC025308b);
                LJLIIIL();
            }
        }
    }

    public final void LJJIJL(InterfaceC025308b interfaceC025308b, boolean z) {
        if (z && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        LJJIJIIJIL(z);
        if (interfaceC025308b.LIZ(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                LJJZ(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                LJIIJ();
            }
        }
        LJLJL();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            LJLJJI();
        }
        this.mFragmentStore.LIZIZ.values().removeAll(Collections.singleton(null));
    }

    public final void LJJIZ(ArrayList<C1B3> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1B2> arrayList3 = this.mPostponedTransactions;
        if (arrayList3 == null) {
            return;
        }
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            C1B2 c1b2 = (C1B2) ListProtector.get(this.mPostponedTransactions, i);
            if (arrayList != null && !c1b2.LIZ && (indexOf2 = arrayList.indexOf(c1b2.LIZIZ)) != -1 && arrayList2 != null && ((Boolean) ListProtector.get(arrayList2, indexOf2)).booleanValue()) {
                ListProtector.remove(this.mPostponedTransactions, i);
                i--;
                size--;
                C1B3 c1b3 = c1b2.LIZIZ;
                c1b3.LJIILLIIL.LJIIJJI(c1b3, c1b2.LIZ, false, false);
            } else if (c1b2.LIZJ == 0 || (arrayList != null && c1b2.LIZIZ.LJIL(arrayList, 0, arrayList.size()))) {
                ListProtector.remove(this.mPostponedTransactions, i);
                i--;
                size--;
                if (arrayList != null && !c1b2.LIZ && (indexOf = arrayList.indexOf(c1b2.LIZIZ)) != -1 && arrayList2 != null && ((Boolean) ListProtector.get(arrayList2, indexOf)).booleanValue()) {
                    C1B3 c1b32 = c1b2.LIZIZ;
                    c1b32.LJIILLIIL.LJIIJJI(c1b32, c1b2.LIZ, false, false);
                } else {
                    c1b2.LIZ();
                }
            }
            i++;
        }
    }

    public final Fragment LJJJJJ(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment LJJJ = LJJJ(string);
        if (LJJJ != null) {
            return LJJJ;
        }
        LJLJJL(new IllegalStateException(C0ON.LIZJ("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r0 != 3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI(int r18, final androidx.fragment.app.Fragment r19) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LJJLI(int, androidx.fragment.app.Fragment):void");
    }

    public final void LJJLIIIIJ(int i, boolean z) {
        C1BB<?> c1bb;
        if (this.mHost != null || i == -1) {
            if (!z && i == this.mCurState) {
                return;
            }
            this.mCurState = i;
            Iterator<Fragment> it = this.mFragmentStore.LIZLLL().iterator();
            while (it.hasNext()) {
                LJJL(it.next());
            }
            Iterator it2 = ((ArrayList) this.mFragmentStore.LIZJ()).iterator();
            while (it2.hasNext()) {
                Fragment fragment = (Fragment) it2.next();
                if (fragment != null && !fragment.mIsNewlyAdded) {
                    LJJL(fragment);
                }
            }
            LJLJJI();
            if (this.mNeedMenuInvalidate && (c1bb = this.mHost) != null && this.mCurState == 4) {
                c1bb.LJIIL();
                this.mNeedMenuInvalidate = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("No activity");
    }

    public final void LJJLIIIJJIZ(int i, String str) {
        LJJIJIIJI(new C1B1(this, str, -1, i), false);
    }

    public final void LJJLIL(C08Z c08z, boolean z) {
        this.mLifecycleCallbacksDispatcher.LIZ.add(new C09A(c08z, z));
    }

    public final void LJJLJ(Fragment fragment, C10610bJ c10610bJ) {
        HashSet<C10610bJ> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null && hashSet.remove(c10610bJ) && hashSet.isEmpty()) {
            this.mExitAnimationCancellationSignals.remove(fragment);
            if (fragment.mState < 3) {
                LJIIL(fragment);
                LIZ(this, fragment, fragment.getStateAfterAnimating());
            }
        }
    }

    public final void LJJZ(ArrayList<C1B3> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            LJJIZ(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((AbstractC025808g) ListProtector.get(arrayList, i)).LJIILL) {
                    if (i2 != i) {
                        LJJIJLIJ(i2, i, arrayList, arrayList2);
                    }
                    i2 = i + 1;
                    if (((Boolean) ListProtector.get(arrayList2, i)).booleanValue()) {
                        while (i2 < size && ((Boolean) ListProtector.get(arrayList2, i2)).booleanValue() && !((AbstractC025808g) ListProtector.get(arrayList, i2)).LJIILL) {
                            i2++;
                        }
                    }
                    LJJIJLIJ(i, i2, arrayList, arrayList2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                LJJIJLIJ(i2, size, arrayList, arrayList2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void LJLIIL(Fragment fragment, boolean z) {
        ViewGroup LJJJJJL = LJJJJJL(fragment);
        if (LJJJJJL != null && (LJJJJJL instanceof C08X)) {
            ((C08X) LJJJJJL).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void LJLIL(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(LJJJ(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fragment ");
        LIZ.append(fragment);
        LIZ.append(" is not an active fragment of FragmentManager ");
        LIZ.append(this);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void LIZ(FragmentManager fragmentManager, Fragment fragment, int i) {
        String name;
        String str;
        try {
            fragmentManager.LJJLI(i, fragment);
        } catch (Exception e) {
            if (fragment == null) {
                name = "";
            } else {
                try {
                    name = fragment.getClass().getName();
                } catch (Exception unused) {
                    return;
                }
            }
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                str = "";
            } else {
                str = LJIIIIZZ.getClass().getName();
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("fragmentname", name);
            c198517qh.LIZ.put("newState", Integer.valueOf(i));
            c198517qh.LIZ.put("currentActivity", str);
            c198517qh.LIZ.put("errorMsg", Log.getStackTraceString(e));
            JSONObject LJ = c198517qh.LJ();
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("errorDesc", LJ.toString());
            c198517qh2.LIZ.put("fragment_name", name);
            C8HX.LIZIZ("fragment_crash_log", "", c198517qh2.LJ());
            System.err.println("fragment_name ---> ".concat(name));
            System.err.println("fragment_crash_log ---> " + LJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(C1BB<?> c1bb, AnonymousClass095 anonymousClass095, Fragment fragment) {
        if (this.mHost == null) {
            this.mHost = c1bb;
            this.mContainer = anonymousClass095;
            this.mParent = fragment;
            if (fragment != null) {
                LJLJL();
            }
            if (c1bb instanceof C18I) {
                C18I c18i = (C18I) c1bb;
                OnBackPressedDispatcher onBackPressedDispatcher = c18i.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = c18i;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.LIZ(lifecycleOwner, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.mNonConfig;
                FragmentManagerViewModel fragmentManagerViewModel2 = fragmentManagerViewModel.LJLILLLLZI.get(fragment.mWho);
                if (fragmentManagerViewModel2 == null) {
                    fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.LJLJJI);
                    fragmentManagerViewModel.LJLILLLLZI.put(fragment.mWho, fragmentManagerViewModel2);
                }
                this.mNonConfig = fragmentManagerViewModel2;
                return;
            }
            if (c1bb instanceof ViewModelStoreOwner) {
                this.mNonConfig = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) c1bb).getViewModelStore(), FragmentManagerViewModel.LJLJJLL).get(FragmentManagerViewModel.class);
                return;
            } else {
                this.mNonConfig = new FragmentManagerViewModel(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    public final boolean LJJLIIIJLJLI(int i, int i2, String str) {
        LJJIJIL(false);
        LJJIJIIJIL(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().LJJLIIIJL()) {
            return true;
        }
        boolean LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (LJJLIIIJLLLLLLLZ) {
            this.mExecutingActions = true;
            try {
                LJJZ(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                LJIIJ();
            }
        }
        LJLJL();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            LJLJJI();
        }
        this.mFragmentStore.LIZIZ.values().removeAll(Collections.singleton(null));
        return LJJLIIIJLLLLLLLZ;
    }

    public final void LJJLIIJ(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            LJLJJL(new IllegalStateException(C1B8.LIZ("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void LJIIJJI(C1B3 c1b3, boolean z, boolean z2, boolean z3) {
        if (z) {
            c1b3.LJIJJ(z3);
        } else {
            c1b3.LJIJI();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1b3);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C026808q.LJIIJ(this, arrayList, arrayList2, 0, 1, true, this.mFragmentTransitionCallback);
        }
        if (z3) {
            LJJLIIIIJ(this.mCurState, true);
        }
        Iterator it = ((ArrayList) this.mFragmentStore.LIZJ()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c1b3.LJIJJLI(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public final void LJJIIZI(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String LJFF = i0.LJFF(str, "    ");
        C025508d c025508d = this.mFragmentStore;
        c025508d.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("    ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!c025508d.LIZIZ.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C09E c09e : c025508d.LIZIZ.values()) {
                printWriter.print(str);
                if (c09e != null) {
                    Fragment fragment = c09e.LIZIZ;
                    printWriter.println(fragment);
                    fragment.dump(LIZIZ, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c025508d.LIZ.size();
        int i = 0;
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            int i2 = 0;
            do {
                Fragment fragment2 = (Fragment) ListProtector.get(c025508d.LIZ, i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
                i2++;
            } while (i2 < size3);
        }
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            int i3 = 0;
            do {
                Fragment fragment3 = (Fragment) ListProtector.get(this.mCreatedMenus, i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
                i3++;
            } while (i3 < size2);
        }
        ArrayList<C1B3> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            int i4 = 0;
            do {
                C1B3 c1b3 = (C1B3) ListProtector.get(this.mBackStack, i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c1b3.toString());
                c1b3.LJIJ(LJFF, printWriter, true);
                i4++;
            } while (i4 < size);
        }
        printWriter.print(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Back Stack Index: ");
        LIZ2.append(this.mBackStackIndex.get());
        printWriter.println(X1D.LIZIZ(LIZ2));
        synchronized (this.mPendingActions) {
            int size4 = this.mPendingActions.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                do {
                    Object obj = (InterfaceC025308b) this.mPendingActions.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(obj);
                    i++;
                } while (i < size4);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public final void LJJIJLIJ(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        boolean z;
        int i4 = i;
        boolean z2 = ((AbstractC025808g) ListProtector.get(arrayList, i4)).LJIILL;
        ArrayList<Fragment> arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.LIZLLL());
        Fragment fragment = this.mPrimaryNav;
        int i5 = i4;
        boolean z3 = false;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                AbstractC025808g abstractC025808g = (AbstractC025808g) ListProtector.get(arrayList, i5);
                int i7 = 3;
                if (!((Boolean) ListProtector.get(arrayList2, i5)).booleanValue()) {
                    ArrayList<Fragment> arrayList4 = this.mTmpAddedFragments;
                    int i8 = 0;
                    while (i8 < abstractC025808g.LIZ.size()) {
                        C025708f c025708f = (C025708f) ListProtector.get(abstractC025808g.LIZ, i8);
                        int i9 = c025708f.LIZ;
                        if (i9 != i6) {
                            if (i9 != 2) {
                                if (i9 != i7 && i9 != 6) {
                                    if (i9 != 7) {
                                        if (i9 == 8) {
                                            ListProtector.add(abstractC025808g.LIZ, i8, new C025708f(9, fragment));
                                            i8++;
                                            fragment = c025708f.LIZIZ;
                                        }
                                    }
                                } else {
                                    arrayList4.remove(c025708f.LIZIZ);
                                    Fragment fragment2 = c025708f.LIZIZ;
                                    if (fragment2 == fragment) {
                                        ListProtector.add(abstractC025808g.LIZ, i8, new C025708f(9, fragment2));
                                        i8++;
                                        fragment = null;
                                    }
                                }
                            } else {
                                Fragment fragment3 = c025708f.LIZIZ;
                                int i10 = fragment3.mContainerId;
                                boolean z4 = false;
                                for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                    Fragment fragment4 = (Fragment) ListProtector.get(arrayList4, size);
                                    if (fragment4.mContainerId == i10) {
                                        if (fragment4 == fragment3) {
                                            z4 = true;
                                        } else {
                                            if (fragment4 == fragment) {
                                                ListProtector.add(abstractC025808g.LIZ, i8, new C025708f(9, fragment4));
                                                i8++;
                                                fragment = null;
                                            }
                                            C025708f c025708f2 = new C025708f(3, fragment4);
                                            c025708f2.LIZJ = c025708f.LIZJ;
                                            c025708f2.LJ = c025708f.LJ;
                                            c025708f2.LIZLLL = c025708f.LIZLLL;
                                            c025708f2.LJFF = c025708f.LJFF;
                                            ListProtector.add(abstractC025808g.LIZ, i8, c025708f2);
                                            arrayList4.remove(fragment4);
                                            i8++;
                                        }
                                    }
                                }
                                if (z4) {
                                    ListProtector.remove(abstractC025808g.LIZ, i8);
                                    i8--;
                                } else {
                                    c025708f.LIZ = 1;
                                    arrayList4.add(fragment3);
                                }
                            }
                            i8++;
                            i7 = 3;
                            i6 = 1;
                        }
                        arrayList4.add(c025708f.LIZIZ);
                        i8++;
                        i7 = 3;
                        i6 = 1;
                    }
                } else {
                    ArrayList<Fragment> arrayList5 = this.mTmpAddedFragments;
                    for (int size2 = abstractC025808g.LIZ.size() - 1; size2 >= 0; size2--) {
                        C025708f c025708f3 = (C025708f) ListProtector.get(abstractC025808g.LIZ, size2);
                        int i11 = c025708f3.LIZ;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                switch (i11) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = c025708f3.LIZIZ;
                                        break;
                                    case 10:
                                        c025708f3.LJII = c025708f3.LJI;
                                        break;
                                }
                            }
                            arrayList5.add(c025708f3.LIZIZ);
                        }
                        arrayList5.remove(c025708f3.LIZIZ);
                    }
                }
                if (z3 || abstractC025808g.LJI) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i5++;
            } else {
                this.mTmpAddedFragments.clear();
                if (!z2) {
                    C026808q.LJIIJ(this, arrayList, arrayList2, i4, i2, false, this.mFragmentTransitionCallback);
                }
                for (int i12 = i4; i12 < i2; i12++) {
                    C1B3 c1b3 = (C1B3) ListProtector.get(arrayList, i12);
                    if (((Boolean) ListProtector.get(arrayList2, i12)).booleanValue()) {
                        c1b3.LJIILIIL(-1);
                        if (i12 == i2 - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1b3.LJIJJ(z);
                    } else {
                        c1b3.LJIILIIL(1);
                        c1b3.LJIJI();
                    }
                }
                if (z2) {
                    C0M4<Fragment> c0m4 = new C0M4<>();
                    LIZIZ(c0m4);
                    i3 = i2;
                    for (int i13 = i2 - 1; i13 >= i4; i13--) {
                        C1B3 c1b32 = (C1B3) ListProtector.get(arrayList, i13);
                        boolean booleanValue = ((Boolean) ListProtector.get(arrayList2, i13)).booleanValue();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= c1b32.LIZ.size()) {
                                break;
                            }
                            if (C1B3.LJJ((C025708f) ListProtector.get(c1b32.LIZ, i14))) {
                                if (!c1b32.LJIL(arrayList, i13 + 1, i2)) {
                                    if (this.mPostponedTransactions == null) {
                                        this.mPostponedTransactions = new ArrayList<>();
                                    }
                                    C1B2 c1b2 = new C1B2(c1b32, booleanValue);
                                    this.mPostponedTransactions.add(c1b2);
                                    for (int i15 = 0; i15 < c1b32.LIZ.size(); i15++) {
                                        C025708f c025708f4 = (C025708f) ListProtector.get(c1b32.LIZ, i15);
                                        if (C1B3.LJJ(c025708f4)) {
                                            c025708f4.LIZIZ.setOnStartEnterTransitionListener(c1b2);
                                        }
                                    }
                                    if (booleanValue) {
                                        c1b32.LJIJI();
                                    } else {
                                        c1b32.LJIJJ(false);
                                    }
                                    i3--;
                                    if (i13 != i3) {
                                        ListProtector.remove(arrayList, i13);
                                        ListProtector.add(arrayList, i3, c1b32);
                                    }
                                    LIZIZ(c0m4);
                                }
                            } else {
                                i14++;
                            }
                        }
                    }
                    int i16 = c0m4.LJLJI;
                    for (int i17 = 0; i17 < i16; i17++) {
                        Fragment fragment5 = (Fragment) c0m4.LJLILLLLZI[i17];
                        if (!fragment5.mAdded) {
                            View requireView = fragment5.requireView();
                            fragment5.mPostponedAlpha = requireView.getAlpha();
                            requireView.setAlpha(0.0f);
                        }
                    }
                } else {
                    i3 = i2;
                }
                if (i3 != i4 && z2) {
                    C026808q.LJIIJ(this, arrayList, arrayList2, i4, i3, true, this.mFragmentTransitionCallback);
                    LJJLIIIIJ(this.mCurState, true);
                }
                while (i4 < i2) {
                    C1B3 c1b33 = (C1B3) ListProtector.get(arrayList, i4);
                    if (((Boolean) ListProtector.get(arrayList2, i4)).booleanValue() && c1b33.LJIJ >= 0) {
                        c1b33.LJIJ = -1;
                    }
                    c1b33.getClass();
                    i4++;
                }
                if (z3 && this.mBackStackChangeListeners != null) {
                    for (int i18 = 0; i18 < this.mBackStackChangeListeners.size(); i18++) {
                        ((InterfaceC025208a) ListProtector.get(this.mBackStackChangeListeners, i18)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJLIIIJLLLLLLLZ(ArrayList<C1B3> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int size;
        ArrayList<C1B3> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0) {
            if ((i2 & 1) == 0) {
                int size2 = arrayList3.size() - 1;
                if (size2 < 0) {
                    return false;
                }
                arrayList.add(ListProtector.remove(this.mBackStack, size2));
                arrayList2.add(Boolean.TRUE);
                return true;
            }
            size = -1;
        } else {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                C1B3 c1b3 = (C1B3) ListProtector.get(this.mBackStack, size);
                if ((str == null || !str.equals(c1b3.LJIIIIZZ)) && (i < 0 || i != c1b3.LJIJ)) {
                    size--;
                } else if ((i2 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C1B3 c1b32 = (C1B3) ListProtector.get(this.mBackStack, size);
                        if (str == null || !str.equals(c1b32.LJIIIIZZ)) {
                            if (i < 0 || i != c1b32.LJIJ) {
                                break;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (size == this.mBackStack.size() - 1) {
            return false;
        }
        for (int size3 = this.mBackStack.size() - 1; size3 > size; size3--) {
            arrayList.add(ListProtector.remove(this.mBackStack, size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }
}
