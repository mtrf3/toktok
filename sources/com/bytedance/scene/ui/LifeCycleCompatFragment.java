package com.bytedance.scene.ui;

import X.C1B3;
import X.C78685UuP;
import X.WMA;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes8.dex */
public class LifeCycleCompatFragment extends Fragment {
    public WMA LJLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LIZ(mo49getActivity(), bundle);
            return;
        }
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.getClass();
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJJI(this);
        C78685UuP.LJIIIZ(c1b3, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WMA wma = this.LJLIL;
        if (wma != null) {
            wma.LIZLLL(bundle);
        }
    }
}
