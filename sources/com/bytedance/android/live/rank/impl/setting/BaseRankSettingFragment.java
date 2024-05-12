package com.bytedance.android.live.rank.impl.setting;

import X.ActivityC45651qj;
import X.BJW;
import X.BZI;
import X.C011602u;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28575BJj;
import X.C28576BJk;
import X.C28577BJl;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseRankSettingFragment extends BaseFragment {
    public BJW LJLIL;
    public BJW LJLILLLLZI;
    public BJW LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    public View _$_findCachedViewById(int i) {
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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BaseRankSettingFragment() {
        BJW bjw = BJW.RANK_SWITCH_STATUS_HIDE;
        this.LJLIL = bjw;
        this.LJLILLLLZI = bjw;
        this.LJLJI = bjw;
    }

    public BJW vl() {
        return this.LJLJI;
    }

    public BJW wl() {
        return this.LJLILLLLZI;
    }

    public BJW xl() {
        return this.LJLIL;
    }

    public final BZI Al(String str) {
        String str2;
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIJJ("live_take_page", "enter_from");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && C29306Beo.LJIIJ(LJIILIIL)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        return LIZ;
    }

    public void Dl(BJW bjw) {
        o.LJIIIZ(bjw, "<set-?>");
        this.LJLJI = bjw;
    }

    public void Gl(BJW bjw) {
        o.LJIIIZ(bjw, "<set-?>");
        this.LJLILLLLZI = bjw;
    }

    public void Hl(BJW bjw) {
        o.LJIIIZ(bjw, "<set-?>");
        this.LJLIL = bjw;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.dup);
        BJW xl = xl();
        BJW bjw = BJW.RANK_SWITCH_STATUS_HIDE;
        int i3 = 8;
        boolean z3 = false;
        if (xl != bjw) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.duo);
        BJW xl2 = xl();
        BJW bjw2 = BJW.RANK_SWITCH_STATUS_ON;
        if (xl2 == bjw2) {
            z = true;
        } else {
            z = false;
        }
        c011602u.setChecked(z);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.dup), new C28577BJl(this));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.dqs);
        if (wl() != bjw) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
        C011602u c011602u2 = (C011602u) _$_findCachedViewById(R.id.dqr);
        if (wl() == bjw2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c011602u2.setChecked(z2);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.dqs), new C28576BJk(this));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.ckp);
        if (vl() != bjw) {
            i3 = 0;
        }
        _$_findCachedViewById3.setVisibility(i3);
        C011602u c011602u3 = (C011602u) _$_findCachedViewById(R.id.cko);
        if (vl() == bjw2) {
            z3 = true;
        }
        c011602u3.setChecked(z3);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.ckp), new C28575BJj(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d08, viewGroup, false);
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
