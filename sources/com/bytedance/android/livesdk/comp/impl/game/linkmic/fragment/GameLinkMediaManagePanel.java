package com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment;

import X.C0NB;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C30868C9o;
import X.C47061t0;
import X.C48459J0d;
import X.C62822Ol8;
import X.InterfaceC30442Bx8;
import X.TTG;
import X.TVD;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkMediaManagePanel extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public GameLinkMediaManageFragment LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(TTG.LJLIL);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cx5);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJ = true;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C47061t0 c47061t0;
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LJLIL;
        if (gameLinkMediaManageFragment != null) {
            C0NB.LJIIIZ("GameLinkMediaManageFragment", "onDialogDismissOrBackPressed");
            gameLinkMediaManageFragment.LJZ = true;
        }
        GameLinkMediaManageFragment gameLinkMediaManageFragment2 = this.LJLIL;
        if (gameLinkMediaManageFragment2 != null && (c47061t0 = gameLinkMediaManageFragment2.LJLIL) != null) {
            c47061t0.post(new ARunnableS49S0100000_13(this, 66));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismiss();
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        TVD tvd = (TVD) this.LJLILLLLZI.getValue();
        if (tvd == null) {
            return;
        }
        tvd.LJIIIZ = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        TVD tvd = (TVD) this.LJLILLLLZI.getValue();
        if (tvd == null) {
            return;
        }
        tvd.LJIIIZ = true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 71), _$_findCachedViewById(R.id.hej));
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LJLIL;
        if (gameLinkMediaManageFragment != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.dqg, 1, gameLinkMediaManageFragment, null);
            LIZ.LJIILJJIL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LJLIL;
        if (gameLinkMediaManageFragment != null && !gameLinkMediaManageFragment.isAdded()) {
            try {
                super.show(manager, str);
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.q0;
                if (o.LJ(c48459J0d.LIZJ(), Boolean.FALSE)) {
                    C30868C9o.LIZJ(R.string.nfi);
                    c48459J0d.LIZ(Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
        }
    }
}
