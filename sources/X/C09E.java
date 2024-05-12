package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.Lifecycle;

/* renamed from: X.09E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09E {
    public final C09B LIZ;
    public final Fragment LIZIZ;
    public int LIZJ = -1;

    public final Bundle LIZIZ() {
        Bundle bundle = new Bundle();
        this.LIZIZ.performSaveInstanceState(bundle);
        this.LIZ.LJIIIZ(this.LIZIZ, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.LIZIZ.mView != null) {
            LIZJ();
        }
        if (this.LIZIZ.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.LIZIZ.mSavedViewState);
        }
        if (!this.LIZIZ.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.LIZIZ.mUserVisibleHint);
        }
        return bundle;
    }

    public final void LIZJ() {
        if (this.LIZIZ.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.LIZIZ.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.LIZIZ.mSavedViewState = sparseArray;
        }
    }

    public final void LIZ(ClassLoader classLoader) {
        Bundle bundle = this.LIZIZ.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.LIZIZ;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.LIZIZ;
        fragment2.mTargetWho = fragment2.mSavedFragmentState.getString("android:target_state");
        Fragment fragment3 = this.LIZIZ;
        if (fragment3.mTargetWho != null) {
            fragment3.mTargetRequestCode = fragment3.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.LIZIZ;
        Boolean bool = fragment4.mSavedUserVisibleHint;
        if (bool != null) {
            fragment4.mUserVisibleHint = bool.booleanValue();
            this.LIZIZ.mSavedUserVisibleHint = null;
        } else {
            fragment4.mUserVisibleHint = fragment4.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.LIZIZ;
        if (!fragment5.mUserVisibleHint) {
            fragment5.mDeferStart = true;
        }
    }

    public C09E(C09B c09b, Fragment fragment) {
        this.LIZ = c09b;
        this.LIZIZ = fragment;
    }

    public C09E(C09B c09b, Fragment fragment, FragmentState fragmentState) {
        String str;
        this.LIZ = c09b;
        this.LIZIZ = fragment;
        fragment.mSavedViewState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        if (fragment2 != null) {
            str = fragment2.mWho;
        } else {
            str = null;
        }
        fragment.mTargetWho = str;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.LJLLJ;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    public C09E(C09B c09b, ClassLoader classLoader, AnonymousClass098 anonymousClass098, FragmentState fragmentState) {
        this.LIZ = c09b;
        Fragment instantiate = Fragment.instantiate(((C1B0) anonymousClass098).LIZIZ.mHost.LJLILLLLZI, fragmentState.LJLIL, null);
        this.LIZIZ = instantiate;
        Bundle bundle = fragmentState.LJLL;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(fragmentState.LJLL);
        instantiate.mWho = fragmentState.LJLILLLLZI;
        instantiate.mFromLayout = fragmentState.LJLJI;
        instantiate.mRestored = true;
        instantiate.mFragmentId = fragmentState.LJLJJI;
        instantiate.mContainerId = fragmentState.LJLJJL;
        instantiate.mTag = fragmentState.LJLJJLL;
        instantiate.mRetainInstance = fragmentState.LJLJL;
        instantiate.mRemoving = fragmentState.LJLJLJ;
        instantiate.mDetached = fragmentState.LJLJLLL;
        instantiate.mHidden = fragmentState.LJLLI;
        instantiate.mMaxState = Lifecycle.State.values()[fragmentState.LJLLILLLL];
        Bundle bundle2 = fragmentState.LJLLJ;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
    }
}
