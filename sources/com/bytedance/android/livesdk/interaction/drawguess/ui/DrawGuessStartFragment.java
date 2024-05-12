package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.ActivityC45651qj;
import X.BAF;
import X.BAI;
import X.BFI;
import X.BZI;
import X.C06490Nh;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28334BAc;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessStartFragment extends BaseFragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public DrawGuessWord LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public ValueAnimator LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public String LJLJI = "";
    public String LJLJL = "";
    public String LJLLI = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
        ValueAnimator valueAnimator = this.LJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    public final void wl() {
        C2A7 c2a7;
        if (isViewValid() && (c2a7 = (C2A7) _$_findCachedViewById(R.id.kcs)) != null) {
            c2a7.LJII();
            if (C76800UCe.LIZ == null) {
                return;
            }
            BAF.LJJIFFI(this, new AqS171S0100000_5(this, 421));
        }
    }

    public final void xl(boolean z) {
        if (!isViewValid()) {
            return;
        }
        C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.c58), z);
        C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.a_h), !z);
        _$_findCachedViewById(R.id.kcs).setEnabled(z);
        ((C2A7) _$_findCachedViewById(R.id.kcs)).LJL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean bool2 = null;
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("argument_is_custom_next_word"));
        } else {
            bool = null;
        }
        this.LJLJJLL = C29306Beo.LJJIFFI(bool);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bool2 = Boolean.valueOf(arguments2.getBoolean("argument_is_from_round_summary"));
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            str = "next_word";
        } else if (this.LJLJJLL) {
            str = "custom";
        } else {
            str = "words";
        }
        this.LJLJL = str;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.ov0(this, DrawGuessRoundDurationChannel.class, new C28334BAc(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3p, viewGroup, false);
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

    public final void vl(String str, String str2, boolean z) {
        if (!isViewValid()) {
            return;
        }
        xl(z);
        if (z) {
            BFI.LJ = new DrawGuessWord(0L, str);
        } else {
            TextView textView = (TextView) _$_findCachedViewById(R.id.a_h);
            if (str2 == null || str2.length() <= 0) {
                str2 = getString(R.string.ks0);
            }
            textView.setText(str2);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_word_audit");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        BAI.LIZ(LIZ);
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_approved");
        LIZ.LJIJJ(this.LJLJL, "enter_from");
        C06490Nh.LIZLLL(LIZ, this.LJLJI, "original_word", str, "content");
    }
}
