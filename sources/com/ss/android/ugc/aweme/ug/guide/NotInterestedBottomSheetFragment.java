package com.ss.android.ugc.aweme.ug.guide;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C54258LRe;
import X.C73411SrX;
import X.C76800UCe;
import X.C84763XOl;
import X.C90903hW;
import X.FMX;
import X.InterfaceC219588ja;
import X.LRD;
import X.SY4;
import X.T16;
import Y.ACListenerS21S0100000_1;
import Y.AfS53S0100000_1;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NotInterestedBottomSheetFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJL = 0;
    public NotInterestedViewModel LJLIL;
    public C54258LRe LJLJI;
    public long LJLJJI;
    public C73411SrX LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public long LJLILLLLZI = SystemClock.elapsedRealtime();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 727));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLILLLLZI = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LJLJJI = (SystemClock.elapsedRealtime() - this.LJLILLLLZI) + this.LJLJJI;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLIL = (NotInterestedViewModel) ViewModelProviders.of(mo49getActivity).get(NotInterestedViewModel.class);
            this.LJLJI = LRD.LIZ(mo49getActivity);
        }
        this.LJLJJL = (C73411SrX) C84763XOl.LJFF().LJJL(T16.LIZ()).LJJJJZI(new AfS53S0100000_1(this, 40));
    }

    public final void vl(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("dismiss_method", str);
        c188727au.LJ((SystemClock.elapsedRealtime() - this.LJLILLLLZI) + this.LJLJJI, "duration");
        FMX.LJIIL("dismiss_not_interested_tutorial", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        final TuxTextView tuxTextView;
        final TuxTextView tuxTextView2;
        final TuxTextView tuxTextView3;
        final SY4 sy4;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ado, viewGroup, false);
        C29S c29s = null;
        if (LLLLIILL != null) {
            tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.title);
        } else {
            tuxTextView = null;
        }
        if (LLLLIILL != null) {
            tuxTextView2 = (TuxTextView) LLLLIILL.findViewById(R.id.h3k);
        } else {
            tuxTextView2 = null;
        }
        if (LLLLIILL != null) {
            tuxTextView3 = (TuxTextView) LLLLIILL.findViewById(R.id.d56);
        } else {
            tuxTextView3 = null;
        }
        if (LLLLIILL != null) {
            sy4 = (SY4) LLLLIILL.findViewById(R.id.cby);
        } else {
            sy4 = null;
        }
        NotInterestedViewModel notInterestedViewModel = this.LJLIL;
        if (notInterestedViewModel != null) {
            notInterestedViewModel.LJLIL.observe(getViewLifecycleOwner(), new Observer() { // from class: X.2KY
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    NotInterestedTutorialData notInterestedTutorialData = (NotInterestedTutorialData) obj;
                    if (notInterestedTutorialData == null || (str = notInterestedTutorialData.title) == null || ujb.o.LJJJJJL(str) || (str2 = notInterestedTutorialData.notInterestedText) == null || ujb.o.LJJJJJL(str2) || (str3 = notInterestedTutorialData.addFavoriteText) == null || ujb.o.LJJJJJL(str3) || (str4 = notInterestedTutorialData.button) == null || ujb.o.LJJJJJL(str4)) {
                        return;
                    }
                    TuxTextView tuxTextView4 = TuxTextView.this;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(notInterestedTutorialData.title);
                    }
                    TuxTextView tuxTextView5 = tuxTextView2;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(Html.fromHtml(notInterestedTutorialData.notInterestedText));
                    }
                    TuxTextView tuxTextView6 = tuxTextView3;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(Html.fromHtml(notInterestedTutorialData.addFavoriteText));
                    }
                    SY4 sy42 = sy4;
                    if (sy42 != null) {
                        sy42.setText(notInterestedTutorialData.button);
                    }
                    C54258LRe c54258LRe = this.LJLJI;
                    if (c54258LRe == null) {
                        return;
                    }
                    c54258LRe.LJI(true);
                }
            });
            if (sy4 != null) {
                C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
            }
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
        o.LJIJI("notInterestedViewModel");
        throw null;
    }
}
