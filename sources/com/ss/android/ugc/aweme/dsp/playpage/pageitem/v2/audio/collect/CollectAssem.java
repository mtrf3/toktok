package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect;

import X.C16880lQ;
import X.C2068389v;
import X.C212428Vi;
import X.C214348b8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.C91200Zqm;
import X.C91232ZrI;
import X.C91264Zro;
import X.C91395Ztv;
import X.C91552ZwS;
import X.C9BD;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterpolatorC91085Zov;
import X.TBT;
import Y.IDObserverS226S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.IDqS444S0100000_29;
import kotlin.jvm.internal.o;
import q03.IDaS492S0100000_29;

/* loaded from: classes22.dex */
public final class CollectAssem extends BaseDspItemReusedAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public C91395Ztv LLFII;
    public FrameLayout LLFZ;
    public TuxIconView LLI;
    public TuxIconView LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;

    static {
        TBT tbt = new TBT(CollectAssem.class, "collectViewModel", "getCollectViewModel()Lcom/ss/android/ugc/aweme/dsp/playpage/pageitem/v2/audio/collect/CollectViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    public CollectAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CollectViewModel.class);
        this.LLII = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 35), null, C91552ZwS.INSTANCE, null, null);
    }

    public final CollectViewModel e4() {
        return (CollectViewModel) this.LLII.LIZ(this, LLIIII[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r1 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g4() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem.g4():void");
    }

    @Override // X.C8XO
    public final void F0(C91395Ztv c91395Ztv) {
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        boolean z = true;
        if (item.LJLIL.w4() != 1) {
            z = false;
        }
        l4(z);
    }

    public final void l4(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxIconView tuxIconView2 = this.LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxIconView tuxIconView3 = this.LLIFFJFJJ;
            if (tuxIconView3 != null) {
                tuxIconView3.setScaleX(1.0f);
            }
            TuxIconView tuxIconView4 = this.LLIFFJFJJ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setScaleY(1.0f);
            return;
        }
        TuxIconView tuxIconView5 = this.LLI;
        if (tuxIconView5 != null) {
            tuxIconView5.setVisibility(0);
        }
        TuxIconView tuxIconView6 = this.LLI;
        if (tuxIconView6 != null) {
            tuxIconView6.setScaleX(1.0f);
        }
        TuxIconView tuxIconView7 = this.LLI;
        if (tuxIconView7 != null) {
            tuxIconView7.setScaleY(1.0f);
        }
        TuxIconView tuxIconView8 = this.LLIFFJFJJ;
        if (tuxIconView8 == null) {
            return;
        }
        tuxIconView8.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout frameLayout;
        IEventDispatchAbility LIZIZ;
        MutableLiveData Qf0;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.gsj);
        TuxIconView tuxIconView = null;
        if (frameLayout2 != null) {
            C16880lQ.LJIIJ(new IDaS492S0100000_29(this, 0), frameLayout2);
        } else {
            frameLayout2 = null;
        }
        this.LLFZ = frameLayout2;
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.gss);
        if (tuxIconView2 != null) {
            if (getContext() != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_bookmark;
                c2068389v.LJ = Integer.valueOf(R.attr.dm);
                tuxIconView2.setTuxIcon(c2068389v);
            }
        } else {
            tuxIconView2 = null;
        }
        this.LLI = tuxIconView2;
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.gsn);
        if (tuxIconView3 != null) {
            if (getContext() != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_bookmark_fill;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView3.setTuxIcon(c2068389v2);
            }
            tuxIconView = tuxIconView3;
        }
        this.LLIFFJFJJ = tuxIconView;
        IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
        if (LIZ != null && (OO = LIZ.OO()) != null) {
            OO.observe(this, new IDObserverS226S0100000_29(this, 13));
        }
        if (b4() && (LIZIZ = C91264Zro.LIZIZ(this)) != null && (Qf0 = LIZIZ.Qf0()) != null) {
            Qf0.observe(this, new IDObserverS226S0100000_29(this, 14));
        }
        C8YN.LJII(this, e4(), new TBT() { // from class: X.Zxd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91420ZuK) obj).LJLIL;
            }
        }, null, new IDqS444S0100000_29(this, 0), 6);
        C8YN.LJII(this, e4(), new TBT() { // from class: X.Zxe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91420ZuK) obj).LJLILLLLZI;
            }
        }, null, new IDqS444S0100000_29(this, 1), 6);
        if (b4() && (frameLayout = this.LLFZ) != null) {
            C91200Zqm.LIZIZ(frameLayout, C212428Vi.LIZLLL(this), C91264Zro.LJFF(this));
        }
    }

    public final void k4(TuxIconView tuxIconView, TuxIconView tuxIconView2, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.0f, 1.0f);
        ofFloat.setInterpolator(new InterpolatorC91085Zov(2.953f));
        ofFloat.setDuration(347L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.0f, 1.0f);
        ofFloat2.setInterpolator(new InterpolatorC91085Zov(2.953f));
        ofFloat2.setDuration(347L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.0f, 0.0f);
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.0f, 0.0f);
        ofFloat4.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat4.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new C91232ZrI(this, z));
        animatorSet.start();
    }
}
