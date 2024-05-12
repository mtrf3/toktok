package com.bytedance.ies.bullet.ui.common.view;

import X.InterfaceC60887Nv1;
import X.OJM;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class AbsFragment extends Fragment {
    public boolean LJLIL;
    public final OJM<InterfaceC60887Nv1> LJLILLLLZI = new OJM<>();

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LJLIL = false;
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onDestroy();
                }
            }
            this.LJLILLLLZI.LJLIL.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onPause();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onResume();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onStop();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLIL = true;
    }
}
