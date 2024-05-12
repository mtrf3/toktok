package com.ss.android.ugc.aweme.compliance.business.antibullying.base;

import X.AEY;
import X.AI2;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C252709vu;
import X.C29S;
import X.C33381Ss;
import X.C3C5;
import X.C41236GGi;
import X.C76800UCe;
import X.C78496UrM;
import X.C78897Uxp;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.GIH;
import X.GII;
import X.GIJ;
import X.GIR;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.AfS59S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes8.dex */
public abstract class BaseAntiBullyingFragment extends BaseFragment implements JBS {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public abstract String getEnterFrom();

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public abstract GIJ wl();

    public abstract AntiBullyingCommonViewModel xl();

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        JBR.LIZIZ(this);
        wl().LJ();
    }

    public final void Al(int i) {
        int i2;
        View findViewById = _$_findCachedViewById(R.id.gw8).findViewById(R.id.gwk);
        int i3 = 0;
        if (i > _$_findCachedViewById(R.id.la4).getBottom()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        findViewById.setVisibility(i2);
        boolean z = !_$_findCachedViewById(R.id.jcz).canScrollVertically(1);
        if (z) {
            _$_findCachedViewById(R.id.aq7).setBackground(null);
        } else {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.cl, requireContext);
            if (LJI != null) {
                _$_findCachedViewById(R.id.aq7).setBackgroundColor(LJI.intValue());
            }
        }
        View findViewById2 = _$_findCachedViewById(R.id.aq7).findViewById(R.id.aq8);
        if (z) {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
    }

    @Override // X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.kp);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C41236GGi.LJLIL);
        super.onCreate(bundle);
        xl().gv0().LJJJJZI(new AfS59S0100000_7(this, 7));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gw8);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 74));
        c252709vu.LIZJ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.eds);
        o.LJIIIIZZ(string, "getString(R.string.cyber…Page_section_headerTitle)");
        c9kf.LIZJ = string;
        c252709vu.LJIILLIIL(c9kf);
        c252709vu.LJIILJJIL(false);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.lal);
        tuxTextView.LJJJ(24.0f);
        tuxTextView.getViewTreeObserver().addOnDrawListener(new GIR(tuxTextView));
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.l9y);
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.be1;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        imageView.setImageDrawable(c33381Ss.LIZ(requireContext));
        if (Build.VERSION.SDK_INT >= 23) {
            ((ScrollView) _$_findCachedViewById(R.id.jcz)).setOnScrollChangeListener(new GIH(this));
        }
        Al(0);
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.jan);
        sy4.getClass();
        C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(this, 15));
        View more_control_button = _$_findCachedViewById(R.id.gmb);
        o.LJIIIIZZ(more_control_button, "more_control_button");
        C78897Uxp.LJJJJLI(more_control_button, null);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.gmb), new ACListenerS27S0100000_7(this, 16));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ags, viewGroup, false, "inflater.inflate(R.layou…agment, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }

    public final void vl(AI8 ai8, MutableLiveData<Boolean> liveData, String str) {
        AEY aey;
        o.LJIIIZ(liveData, "liveData");
        AI9 accessory = ai8.getAccessory();
        if ((accessory instanceof AI2) && (aey = (AEY) accessory) != null) {
            aey.LJIILL(new GII(liveData, this, str));
        }
        liveData.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(ai8, 12));
    }
}
