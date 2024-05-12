package X;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: X.HZi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class FragmentC44278HZi extends Fragment {
    public InterfaceC44281HZl LJLIL;
    public WMA LJLILLLLZI;

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LJI();
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        InterfaceC44281HZl interfaceC44281HZl = this.LJLIL;
        if (interfaceC44281HZl != null) {
            interfaceC44281HZl.onDetach();
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LIZIZ();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LIZJ();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LJ();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LJFF();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LIZ(getActivity(), bundle);
        } else {
            FragmentManager fragmentManager = getActivity().getFragmentManager();
            C78932UyO.LIZ(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WMA wma = this.LJLILLLLZI;
        if (wma != null) {
            wma.LIZLLL(bundle);
        }
    }
}
