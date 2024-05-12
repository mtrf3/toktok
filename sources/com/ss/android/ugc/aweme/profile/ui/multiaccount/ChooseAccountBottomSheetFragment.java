package com.ss.android.ugc.aweme.profile.ui.multiaccount;

import X.ASQ;
import X.ASX;
import X.AV4;
import X.AV5;
import X.AV6;
import X.AV9;
import X.AVA;
import X.AVD;
import X.AVM;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C54305LSz;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.KL2;
import X.OUP;
import X.QD3;
import Y.AObserverS68S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class ChooseAccountBottomSheetFragment extends Fragment implements InterfaceC219588ja, AVA {
    public static boolean LJLJJL;
    public AVM LJLIL;
    public MultiProfilesViewModel LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 702));

    static {
        new AV6();
    }

    @Override // X.AVA
    public final void dismiss() {
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.dpf);
        o.LJIIIIZZ(string, "getString(R.string.common_multiaccount_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        String string2 = getString(R.string.a_c);
        o.LJIIIIZZ(string2, "getString(R.string.acces…abels_captions_btn_close)");
        LIZJ.LJII = string2;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 701));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    public final AV9 vl() {
        return (AV9) this.LJLJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (!C54305LSz.LIZJ()) {
            LJLJJL = false;
            EventBus.LIZJ().LJIJ(this);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!C54305LSz.LIZJ()) {
            LJLJJL = true;
            EventBus.LIZJ().LJIILJJIL(this);
        }
        if (C54305LSz.LIZIZ()) {
            C2U8.LIZ(new AV4());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLILLLLZI = (MultiProfilesViewModel) ViewModelProviders.of(mo49getActivity).get(MultiProfilesViewModel.class);
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void refreshNoticeCount(AV5 event) {
        o.LJIIIZ(event, "event");
        AVM avm = this.LJLIL;
        if (avm != null) {
            avm.notifyDataSetChanged();
        } else {
            o.LJIJI("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        o.LJI(context);
        C29S c29s = null;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLIL = new AVM(new WeakReference(this), vl(), mo49getActivity, getArguments());
            OUP.LJJJJJL((int) KL2.LIZJ(getContext(), 8.0f), recyclerView);
            OUP.LJJJJI((int) KL2.LIZJ(getContext(), 8.0f), recyclerView);
            MultiProfilesViewModel multiProfilesViewModel = this.LJLILLLLZI;
            if (multiProfilesViewModel != null) {
                LiveData map = Transformations.map(multiProfilesViewModel.LJLILLLLZI, new AVD(multiProfilesViewModel));
                o.LJIIIIZZ(map, "fun multiAccountLiveData…erimentalList()\n        }");
                map.observe(getViewLifecycleOwner(), new AObserverS68S0200000_4(recyclerView, this, 2));
            } else {
                o.LJIJI("profilesViewModel");
                throw null;
            }
        }
        try {
            ViewTreeLifecycleOwner.set(recyclerView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(recyclerView, this);
            C10A.LIZIZ(recyclerView, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return recyclerView;
    }
}
