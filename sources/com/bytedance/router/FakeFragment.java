package com.bytedance.router;

import X.ActivityC45651qj;
import X.C1B3;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes11.dex */
public class FakeFragment extends Fragment {
    public OnActivityResultCallback mCallback;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallback = null;
    }

    public void setCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mCallback = onActivityResultCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OnActivityResultCallback onActivityResultCallback = this.mCallback;
        if (onActivityResultCallback != null) {
            onActivityResultCallback.onActivityResult(i, i2, intent);
            this.mCallback = null;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(this);
            c1b3.LJIILLIIL();
        }
    }
}
