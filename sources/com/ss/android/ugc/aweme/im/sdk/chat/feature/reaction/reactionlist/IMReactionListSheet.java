package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C109544Rq;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C48841JEv;
import X.C62822Ol8;
import X.C64962gm;
import X.C76800UCe;
import X.C78613UtF;
import X.C80263Da;
import X.C80333Dh;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.T2R;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import djb.IDaS20S0000000_1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class IMReactionListSheet extends BaseFragment implements InterfaceC219588ja {
    public C109544Rq LJLIL;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 141));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final C64962gm LJLJJI = C48841JEv.LIZ(C78613UtF.LIZJ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 5)).plus(T2R.LJIIJJI()));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = requireContext().getString(R.string.epk);
        o.LJIIIIZZ(string, "requireContext().getStri…reactions_reaction_panel)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 139));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    public final IMReactionListSheetViewModel vl() {
        return (IMReactionListSheetViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(vl());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("message");
        } else {
            serializable = null;
        }
        o.LJII(serializable, "null cannot be cast to non-null type com.bytedance.im.core.model.Message");
        this.LJLIL = (C109544Rq) serializable;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C80333Dh(this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        vl().LJLJJL.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        getLifecycle().addObserver(vl());
        View findViewById = view.findViewById(R.id.iow);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.reaction_list_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter((AbstractC029409q) this.LJLJI.getValue());
        if (this.LJLIL == null) {
            return;
        }
        XKX.LIZLLL(this.LJLJJI, null, null, new C80263Da(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b83, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
