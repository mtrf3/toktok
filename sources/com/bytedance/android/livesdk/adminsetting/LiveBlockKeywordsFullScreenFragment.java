package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.B83;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1TQ;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBlockKeywordsFullScreenFragment extends BaseFragment {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 85));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 83));

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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (isViewValid()) {
            LiveEditText block_word_edit_text = (LiveEditText) ((C1TQ) _$_findCachedViewById(R.id.ams)).LJFF(R.id.amo);
            o.LJIIIIZZ(block_word_edit_text, "block_word_edit_text");
            C29306Beo.LJII(block_word_edit_text);
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC05190Ih interfaceC05190Ih;
        String secUid;
        long j;
        User owner;
        String secUid2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str = "";
        if (this.LJLIL.getValue() != null) {
            C1TQ block_word_view = (C1TQ) _$_findCachedViewById(R.id.ams);
            o.LJIIIIZZ(block_word_view, "block_word_view");
            boolean booleanValue = ((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
            Room room = (Room) this.LJLIL.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LJLIL.getValue();
            if (room2 != null) {
                j = room2.getId();
            } else {
                j = 0;
            }
            C1TQ.LJIIIIZZ(block_word_view, booleanValue, str, j, "autosuggest");
        } else {
            C1TQ block_word_view2 = (C1TQ) _$_findCachedViewById(R.id.ams);
            o.LJIIIIZZ(block_word_view2, "block_word_view");
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (secUid = interfaceC05190Ih.getSecUid()) != null) {
                str = secUid;
            }
            C1TQ.LJIIIIZZ(block_word_view2, true, str, 0L, "autosuggest");
        }
        ((C1TQ) _$_findCachedViewById(R.id.ams)).setOnAddSuccessCallback(new AqS155S0100000_5(this, 84));
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 44));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3e, viewGroup, false);
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
