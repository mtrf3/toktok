package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28375BBr;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C41051jJ;
import X.C41071jL;
import X.C47121t6;
import X.C51029K0z;
import X.C5H3;
import X.C72259SXn;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFilterCommentSettingFragment extends BaseFragment {
    public C28375BBr LJLILLLLZI;
    public LinearLayout LJLJJI;
    public LinearLayout LJLJJL;
    public LinearLayout LJLJJLL;
    public FrameLayout LJLJL;
    public LiveIconView LJLJLJ;
    public C41071jL LJLJLLL;
    public C41051jJ LJLL;
    public C41051jJ LJLLI;
    public String LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 100));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 99));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        long j;
        View view;
        super.onViewStateRestored(bundle);
        if (!C29306Beo.LJIILIIL(C51029K0z.LJIILIIL(this)) && (view = getView()) != null) {
            view.getLayoutParams().height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            view.setLayoutParams(view.getLayoutParams());
        }
        Room room = (Room) this.LJLIL.getValue();
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C28375BBr c28375BBr = new C28375BBr(j, ((Boolean) this.LJLJI.getValue()).booleanValue(), this.LJLL, this.LJLLI, this.LJLJLLL, this.LJLJJLL, "", "");
        this.LJLILLLLZI = c28375BBr;
        c28375BBr.LIZJ();
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 70));
        }
        C41051jJ c41051jJ = this.LJLL;
        if (c41051jJ != null) {
            c41051jJ.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 6));
        }
        LinearLayout linearLayout2 = this.LJLJJL;
        if (linearLayout2 != null) {
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS25S0100000_5(this, 71));
        }
        C41051jJ c41051jJ2 = this.LJLLI;
        if (c41051jJ2 != null) {
            c41051jJ2.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 7));
        }
        LinearLayout linearLayout3 = this.LJLJJLL;
        if (linearLayout3 != null) {
            C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS25S0100000_5(this, 72));
        }
        C41071jL c41071jL = this.LJLJLLL;
        if (c41071jL != null) {
            c41071jL.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 8));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        FrameLayout frameLayout;
        LiveIconView liveIconView;
        C41071jL c41071jL;
        C41051jJ c41051jJ;
        String str;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        C41051jJ c41051jJ2 = null;
        if (view2 != null) {
            linearLayout = (LinearLayout) view2.findViewById(R.id.g5b);
        } else {
            linearLayout = null;
        }
        this.LJLJJI = linearLayout;
        View view3 = getView();
        if (view3 != null) {
            linearLayout2 = (LinearLayout) view3.findViewById(R.id.g2f);
        } else {
            linearLayout2 = null;
        }
        this.LJLJJL = linearLayout2;
        View view4 = getView();
        if (view4 != null) {
            linearLayout3 = (LinearLayout) view4.findViewById(R.id.g5m);
        } else {
            linearLayout3 = null;
        }
        this.LJLJJLL = linearLayout3;
        View view5 = getView();
        if (view5 != null) {
            frameLayout = (FrameLayout) view5.findViewById(R.id.aeg);
        } else {
            frameLayout = null;
        }
        this.LJLJL = frameLayout;
        View view6 = getView();
        if (view6 != null) {
            liveIconView = (LiveIconView) view6.findViewById(R.id.ebr);
        } else {
            liveIconView = null;
        }
        this.LJLJLJ = liveIconView;
        View view7 = getView();
        if (view7 != null) {
            c41071jL = (C41071jL) view7.findViewById(R.id.gai);
        } else {
            c41071jL = null;
        }
        this.LJLJLLL = c41071jL;
        View view8 = getView();
        if (view8 != null) {
            c41051jJ = (C41051jJ) view8.findViewById(R.id.fo3);
        } else {
            c41051jJ = null;
        }
        this.LJLL = c41051jJ;
        View view9 = getView();
        if (view9 != null) {
            c41051jJ2 = (C41051jJ) view9.findViewById(R.id.fo2);
        }
        this.LJLLI = c41051jJ2;
        if (C29306Beo.LJIILIIL(C51029K0z.LJIILIIL(this))) {
            ((C47121t6) _$_findCachedViewById(R.id.title)).LJJIJIL(R.style.a41);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.j83);
            if (_$_findCachedViewById != null && (layoutParams = _$_findCachedViewById.getLayoutParams()) != null) {
                layoutParams.height = -1;
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.j83);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setLayoutParams(layoutParams);
                }
            }
        }
        LiveIconView liveIconView2 = this.LJLJLJ;
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new ACListenerS25S0100000_5(this, 68));
        }
        LiveIconView liveIconView3 = this.LJLJLJ;
        if (liveIconView3 != null) {
            C72259SXn.LIZIZ(liveIconView3, 5, 5, 5, 5);
        }
        FrameLayout frameLayout2 = this.LJLJL;
        if (frameLayout2 != null) {
            C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS25S0100000_5(this, 69));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_filter_comments_view");
        LIZ.LJIIZILJ();
        if (((Boolean) this.LJLJI.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        LIZ.LJIJJ(str, "admin_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cwu, viewGroup, false);
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
