package com.ugc.effectcreator.foundation.view;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C45621qg;
import X.C76800UCe;
import X.C90903hW;
import X.C93618aTm;
import X.C93750aVu;
import X.C94249adx;
import X.C94357afh;
import X.InterfaceC93615aTj;
import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public abstract class BottomDialog extends Fragment {
    public C94357afh LJLIL;
    public final List<InterfaceC93615aTj> LJLILLLLZI = new ArrayList();

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract View xl(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void wl() {
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((InterfaceC93615aTj) it.next()).onDismiss();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJIILJJIL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C94357afh c94357afh = this.LJLIL;
        if (c94357afh != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(c94357afh.LJLILLLLZI);
            o.LJIIIIZZ(from, "from(binding.bottomSheetContainer)");
            Al(from.getState());
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    public static void vl(BottomDialog bottomDialog) {
        C94357afh c94357afh = bottomDialog.LJLIL;
        if (c94357afh != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(c94357afh.LJLILLLLZI);
            o.LJIIIIZZ(from, "from(binding.bottomSheetContainer)");
            from.setState(5);
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void Al(int i) {
        int height;
        if (i != 4) {
            if (i != 5) {
                C94357afh c94357afh = this.LJLIL;
                if (c94357afh != null) {
                    c94357afh.LJLILLLLZI.setPadding(0, 0, 0, 0);
                    return;
                } else {
                    o.LJIJI("binding");
                    throw null;
                }
            }
            wl();
            return;
        }
        C94357afh c94357afh2 = this.LJLIL;
        if (c94357afh2 != null) {
            C93618aTm c93618aTm = c94357afh2.LJLILLLLZI;
            BottomSheetBehavior behavior = BottomSheetBehavior.from(c93618aTm);
            View content = requireActivity().findViewById(R.id.content);
            o.LJIIIIZZ(behavior, "behavior");
            if (behavior.getPeekHeight() == -1) {
                o.LJIIIIZZ(content, "content");
                height = (content.getWidth() * 9) / 16;
            } else {
                o.LJIIIIZZ(content, "content");
                height = content.getHeight() - behavior.getPeekHeight();
            }
            c93618aTm.setPadding(0, 0, 0, height);
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C94357afh c94357afh = this.LJLIL;
        if (c94357afh != null) {
            BottomSheetBehavior behavior = BottomSheetBehavior.from(c94357afh.LJLILLLLZI);
            o.LJIIIIZZ(behavior, "behavior");
            behavior.setHideable(true);
            behavior.setBottomSheetCallback(new C94249adx(this));
            C94357afh c94357afh2 = this.LJLIL;
            if (c94357afh2 != null) {
                C45621qg c45621qg = c94357afh2.LJLJI;
                o.LJIIIIZZ(c45621qg, "binding.root");
                C93750aVu.LIZ(c45621qg, 800L, new IDqS419S0100000_42(this, 69));
                return;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, com.zhiliaoapp.musically.R.layout.dvi, null, false);
        C93618aTm c93618aTm = (C93618aTm) LLLLIILL.findViewById(com.zhiliaoapp.musically.R.id.ard);
        if (c93618aTm != null) {
            C45621qg c45621qg = (C45621qg) LLLLIILL;
            this.LJLIL = new C94357afh(c45621qg, c93618aTm, c45621qg);
            View xl = xl(inflater, c93618aTm);
            C94357afh c94357afh = this.LJLIL;
            if (c94357afh != null) {
                c94357afh.LJLILLLLZI.addView(xl);
                C94357afh c94357afh2 = this.LJLIL;
                if (c94357afh2 != null) {
                    C45621qg c45621qg2 = c94357afh2.LJLJI;
                    o.LJIIIIZZ(c45621qg2, "binding.root");
                    try {
                        ViewTreeLifecycleOwner.set(c45621qg2, getViewLifecycleOwner());
                        ViewTreeViewModelStoreOwner.set(c45621qg2, this);
                        C10A.LIZIZ(c45621qg2, this);
                        ActivityC45651qj mo49getActivity = mo49getActivity();
                        if (mo49getActivity instanceof C29S) {
                            c29s = (C29S) mo49getActivity;
                        }
                        C90903hW.LIZ(c29s);
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    return c45621qg2;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(com.zhiliaoapp.musically.R.id.ard)));
    }
}
