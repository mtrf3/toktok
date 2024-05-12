package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C36636EZk;
import X.C3C5;
import X.C66762jg;
import X.C66772jh;
import X.C76800UCe;
import X.C780334l;
import X.C84908XUa;
import X.C84909XUb;
import X.C89V;
import X.C8BK;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.KL2;
import X.SY9;
import X.X6M;
import X.XKQ;
import X.XKX;
import X.XUW;
import X.XUX;
import X.XUZ;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS76S0100000_8;
import Y.AObserverS77S0100000_9;
import Y.AObserverS83S0100000_15;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ReuseAudioDetailFragment extends AbsFragment implements InterfaceC219588ja {
    public ViewGroup LJLIL;
    public SmartImageView LJLILLLLZI;
    public ImageView LJLJI;
    public TuxTextView LJLJJI;
    public ViewGroup LJLJJL;
    public ReuseAudioViewModel LJLJJLL;
    public MusicDetailViewModel LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZ = new C84909XUb(this);
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ReuseAudioViewModel reuseAudioViewModel = this.LJLJJLL;
        if (reuseAudioViewModel != null) {
            reuseAudioViewModel.LJLJJI.setValue(XUX.PLAY);
        }
    }

    public final void vl(XUX xux) {
        boolean z;
        int i;
        if (xux == XUX.PLAY || xux == XUX.PAUSE) {
            z = true;
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        } else {
            z = false;
        }
        int i2 = XUZ.LIZ[xux.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = R.raw.icon_spinner_normal;
            } else {
                i = R.raw.icon_pause_fill;
            }
        } else {
            i = R.raw.icon_play_fill;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        SY9 LIZ = c2068389v.LIZ(requireContext);
        ImageView imageView2 = this.LJLJI;
        if (imageView2 != null) {
            imageView2.setImageDrawable(LIZ);
        }
        if (!z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.fc);
            loadAnimation.setInterpolator(new LinearInterpolator());
            ImageView imageView3 = this.LJLJI;
            if (imageView3 != null) {
                imageView3.startAnimation(loadAnimation);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MusicDetailViewModel musicDetailViewModel;
        ReuseAudioViewModel reuseAudioViewModel;
        X6M x6m;
        Aweme aweme;
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<XUX> mutableLiveData4;
        MutableLiveData<Aweme> mutableLiveData5;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (ViewGroup) view.findViewById(R.id.bxm);
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.f12);
        this.LJLJI = (ImageView) view.findViewById(R.id.e9c);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.m00);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.kdb);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            musicDetailViewModel = (MusicDetailViewModel) new ViewModelProvider(mo49getActivity).get(MusicDetailViewModel.class);
        } else {
            musicDetailViewModel = null;
        }
        this.LJLJL = musicDetailViewModel;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, requireContext);
        C89V c89v = new C89V(KL2.LIZJ(getContext(), 4.0f), BlurMaskFilter.Blur.NORMAL, KL2.LIZJ(getContext(), 2.0f), C04330Ez.LIZIZ(requireContext(), R.color.iw));
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            viewGroup.setBackground(new C8BK(LJIIIIZZ, c89v));
        }
        ViewGroup viewGroup2 = this.LJLJJL;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, new ACListenerS35S0100000_15(this, 219));
        }
        vl(XUX.PLAY);
        ViewGroup viewGroup3 = this.LJLIL;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS35S0100000_15(this, 220));
        }
        ReuseAudioViewModel reuseAudioViewModel2 = (ReuseAudioViewModel) new ViewModelProvider(this).get(ReuseAudioViewModel.class);
        this.LJLJJLL = reuseAudioViewModel2;
        if (reuseAudioViewModel2 != null) {
            reuseAudioViewModel2.LJLJL = new ReuseAudioPlayer(this, new C84908XUa(reuseAudioViewModel2));
        }
        ReuseAudioViewModel reuseAudioViewModel3 = this.LJLJJLL;
        if (reuseAudioViewModel3 != null && (mutableLiveData5 = reuseAudioViewModel3.LJLIL) != null) {
            mutableLiveData5.observe(this, new AObserverS76S0100000_8(this, 86));
        }
        ReuseAudioViewModel reuseAudioViewModel4 = this.LJLJJLL;
        if (reuseAudioViewModel4 != null && (mutableLiveData4 = reuseAudioViewModel4.LJLJJI) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 96));
        }
        ReuseAudioViewModel reuseAudioViewModel5 = this.LJLJJLL;
        if (reuseAudioViewModel5 != null && (mutableLiveData3 = reuseAudioViewModel5.LJLJI) != null) {
            mutableLiveData3.observe(this, new AObserverS77S0100000_9(this, 70));
        }
        ReuseAudioViewModel reuseAudioViewModel6 = this.LJLJJLL;
        if (reuseAudioViewModel6 != null && (mutableLiveData2 = reuseAudioViewModel6.LJLILLLLZI) != null) {
            mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 87));
        }
        ReuseAudioViewModel reuseAudioViewModel7 = this.LJLJJLL;
        if (reuseAudioViewModel7 != null && (mutableLiveData = reuseAudioViewModel7.LJLJJLL) != null) {
            mutableLiveData.observe(this, new AObserverS76S0100000_8(this, 88));
        }
        String str = this.LJLJLJ;
        if (str != null && (reuseAudioViewModel = this.LJLJJLL) != null) {
            reuseAudioViewModel.LJLJJI.setValue(XUX.LOADING);
            Map<String, X6M> map = C66772jh.LIZ;
            if (map.containsKey(str)) {
                Object obj = ((LinkedHashMap) map).get(str);
                o.LJI(obj);
                x6m = (X6M) obj;
            } else {
                x6m = new X6M(str);
                map.put(str, x6m);
            }
            XUW xuw = new XUW(reuseAudioViewModel);
            XKQ xkq = x6m.LIZIZ;
            if (xkq != null && xkq.isCompleted() && x6m.LIZLLL != null && (aweme = x6m.LJ) != null) {
                xuw.LJFF(x6m.LJFF, aweme);
                String str2 = x6m.LIZLLL;
                o.LJI(str2);
                xuw.onDownloadSuccess(str2);
                return;
            }
            x6m.LIZJ = xuw;
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C66762jg(x6m, null), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(inflater, "inflater");
        Bundle arguments = getArguments();
        C29S c29s = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.LJLJLJ = str;
        if (arguments != null) {
            str2 = arguments.getString("music_id");
        } else {
            str2 = null;
        }
        this.LJLJLLL = str2;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bvc, viewGroup, false);
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
