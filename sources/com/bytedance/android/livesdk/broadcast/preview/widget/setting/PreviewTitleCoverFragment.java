package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.ActivityC45651qj;
import X.BGO;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15G;
import X.C15I;
import X.C15J;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C30326BvG;
import X.C3C5;
import X.C42398GkU;
import X.C51029K0z;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewTitleCoverFragment extends BasePreviewFragment implements C15G {
    public LiveEditText LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(BGO.LJLIL);
    public String LJLJJI = "";
    public final IDObjectS178S0100000_5 LJLJJL = new IDObjectS178S0100000_5(this, 3);

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LiveEditText liveEditText = this.LJLJI;
        if (liveEditText != null) {
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.LJLJI;
                if (liveEditText2 != null) {
                    if (!TextUtils.isEmpty(String.valueOf(liveEditText2.getText()))) {
                        LiveEditText liveEditText3 = this.LJLJI;
                        if (liveEditText3 != null) {
                            liveEditText3.setText(str);
                            return;
                        } else {
                            o.LJIJI("titleView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            }
            SpannableString spannableString = new SpannableString(C42398GkU.LIZIZ(str, ' '));
            LiveEditText liveEditText4 = this.LJLJI;
            if (liveEditText4 != null) {
                liveEditText4.setText(spannableString);
                return;
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        o.LJIJI("titleView");
        throw null;
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        View view = getView();
        if (view != null) {
            C29306Beo.LJJJJJL(i - C15380j0.LIZ(20.0f), view);
        }
        if (!z) {
            _$_findCachedViewById(R.id.l_r).clearFocus();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 119));
        C15I c15i = new C15I();
        c15i.LIZ = this;
        c15i.LIZIZ = view;
        new C15J(this, view, c15i.LIZJ);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        LiveEditText liveEditText = null;
        if (LJIILIIL != null) {
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL2 != null) {
                lifecycleOwner = LJIILIIL2.LJLJJI;
            } else {
                lifecycleOwner = null;
            }
            LJIILIIL.ov0(lifecycleOwner, BroadcastCoverData.class, new AqS171S0100000_5(this, 232));
        }
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 74), this);
        View view2 = getView();
        if (view2 != null) {
            liveEditText = (LiveEditText) view2.findViewById(R.id.l_r);
        }
        if (!(liveEditText instanceof LiveEditText) || liveEditText == null) {
            return;
        }
        this.LJLJI = liveEditText;
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL3 != null) {
            LJIILIIL3.lv0(this, PreviewHideKeyboardEvent.class, new AqS171S0100000_5(this, 816));
        }
        DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL4 == null) {
            return;
        }
        LJIILIIL4.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 817));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5_, viewGroup, false);
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
