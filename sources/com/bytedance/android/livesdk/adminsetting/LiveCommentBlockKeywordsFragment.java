package com.bytedance.android.livesdk.adminsetting;

import X.B83;
import X.C14030gp;
import X.C15G;
import X.C16880lQ;
import X.C1TQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C29374Bfu;
import X.C40901j4;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import Y.ACListenerS25S0100000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCommentBlockKeywordsFragment extends LiveDialogFragment implements C15G {
    public String LJLIL;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 87));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 86));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
    public final void onDestroyView() {
        C14030gp.LIZ = false;
        vl();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0h);
        c28507BGt.LIZJ = R.style.ab1;
        c28507BGt.LJIIL = new ColorDrawable(R.drawable.chg);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    public final void vl() {
        if (this.isViewValid) {
            C40901j4 c40901j4 = (C40901j4) _$_findCachedViewById(R.id.ams);
            if (c40901j4.LJLJLJ) {
                LiveEditText block_word_edit_text = (LiveEditText) c40901j4.LJFF(R.id.amo);
                o.LJIIIIZZ(block_word_edit_text, "block_word_edit_text");
                C29306Beo.LJII(block_word_edit_text);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        wl(i, z);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC05190Ih interfaceC05190Ih;
        String secUid;
        long j;
        User owner;
        String secUid2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C14030gp.LIZ = true;
        wl(0, false);
        String str = "";
        if (this.LJLILLLLZI.getValue() != null) {
            C1TQ block_word_view = (C1TQ) _$_findCachedViewById(R.id.ams);
            o.LJIIIIZZ(block_word_view, "block_word_view");
            boolean booleanValue = ((Boolean) this.LJLJI.getValue()).booleanValue();
            Room room = (Room) this.LJLILLLLZI.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LJLILLLLZI.getValue();
            if (room2 != null) {
                j = room2.getId();
            } else {
                j = 0;
            }
            C1TQ.LJIIIIZZ(block_word_view, booleanValue, str, j, "live_take_detail");
        } else {
            C1TQ block_word_view2 = (C1TQ) _$_findCachedViewById(R.id.ams);
            o.LJIIIIZZ(block_word_view2, "block_word_view");
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (secUid = interfaceC05190Ih.getSecUid()) != null) {
                str = secUid;
            }
            C1TQ.LJIIIIZZ(block_word_view2, true, str, 0L, "live_take_detail");
        }
        ((C1TQ) _$_findCachedViewById(R.id.ams)).setOnAddSuccessCallback(new AqS155S0100000_5(this, 88));
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 45));
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsKeyboardObserver(this);
    }

    public final void wl(int i, boolean z) {
        int i2;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ggi);
        if (_$_findCachedViewById != null && this.isViewValid) {
            if (z) {
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    _$_findCachedViewById.setLayoutParams(layoutParams);
                    _$_findCachedViewById.setPadding(_$_findCachedViewById.getPaddingLeft(), _$_findCachedViewById.getPaddingTop(), _$_findCachedViewById.getPaddingRight(), i);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (_$_findCachedViewById.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
                    _$_findCachedViewById.setLayoutParams(layoutParams2);
                }
            }
            C40901j4 c40901j4 = (C40901j4) _$_findCachedViewById(R.id.ams);
            if (c40901j4.LJLJLJ != z) {
                c40901j4.LJLJLJ = z;
            }
            View LJFF = c40901j4.LJFF(R.id.amq);
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            LJFF.setVisibility(i2);
        }
    }
}
