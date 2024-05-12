package com.ss.android.ugc.aweme.views;

import X.AbstractViewOnClickListenerC55470Lpq;
import X.C81541VzN;
import X.C81658W3a;
import X.C82028WHg;
import X.C82032WHk;
import X.C82035WHn;
import X.C82552Waa;
import X.C82553Wab;
import X.C82573Wav;
import X.C82588WbA;
import X.EnumC147935rJ;
import X.EnumC43998HOo;
import X.EnumC79548VJw;
import X.HJC;
import X.InterfaceC82548WaW;
import X.InterfaceC82571Wat;
import X.InterfaceC82605WbR;
import X.ViewOnClickListenerC82415WWd;
import Y.ALAdapterS11S0100000_14;
import Y.ALAdapterS11S0200000_14;
import Y.IDCListenerS165S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDlS65S0100000_14 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS65S0100000_14(C82553Wab c82553Wab, int i) {
        super(1500L);
        this.$t = i;
        switch (i) {
            case 2:
                this.l0 = c82553Wab;
                return;
            default:
                this.l0 = c82553Wab;
                return;
        }
    }

    public static final void LIZ$0(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        ((ViewOnClickListenerC82415WWd) iDlS65S0100000_14.l0).onClick(view);
    }

    public static final void LIZ$1(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        if (!((FavoriteSticker) iDlS65S0100000_14.l0).LJLLL.isLogin()) {
            ((FavoriteSticker) iDlS65S0100000_14.l0).LJLLL.LIZJ();
            FavoriteSticker favoriteSticker = (FavoriteSticker) iDlS65S0100000_14.l0;
            favoriteSticker.LJLLL.LIZIZ(favoriteSticker.LJLLI, "favorite_sticker", 242, null, new AqS164S0100000_14(iDlS65S0100000_14, 175));
            return;
        }
        C81658W3a c81658W3a = ((FavoriteSticker) iDlS65S0100000_14.l0).LJLLLLLL;
        c81658W3a.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c81658W3a, "scaleX", 1.0f, 1.08f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c81658W3a, "scaleY", 1.0f, 1.08f);
        long j = 100;
        ofFloat.setDuration(j);
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c81658W3a, "scaleX", 1.08f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c81658W3a, "scaleY", 1.08f, 0.0f);
        ofFloat3.setDuration(j);
        ofFloat4.setDuration(j);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c81658W3a, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c81658W3a, "alpha", 1.0f, 0.0f);
        ofFloat6.setDuration(j);
        ofFloat5.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c81658W3a, "scaleX", 0.0f, 1.08f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c81658W3a, "scaleY", 0.0f, 1.08f);
        ofFloat7.setDuration(j);
        ofFloat8.setDuration(j);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c81658W3a, "scaleX", 1.08f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(c81658W3a, "scaleY", 1.08f, 1.0f);
        ofFloat9.setDuration(j);
        ofFloat9.setDuration(j);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new ALAdapterS11S0200000_14(animatorSet2, c81658W3a, 2));
        animatorSet2.addListener(new ALAdapterS11S0100000_14(c81658W3a, 20));
        animatorSet.start();
    }

    public static final void LIZ$2(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        MvThemeData mvThemeData;
        boolean LIZLLL;
        C82553Wab c82553Wab = (C82553Wab) iDlS65S0100000_14.l0;
        InterfaceC82548WaW LJJIIZ = c82553Wab.LJZL.LJJIIZ(c82553Wab.LJLLILLLL);
        InterfaceC82571Wat interfaceC82571Wat = c82553Wab.LJZ;
        if (interfaceC82571Wat != null) {
            C82552Waa c82552Waa = (C82552Waa) interfaceC82571Wat;
            if (LJJIIZ == null) {
                return;
            }
            if (LJJIIZ.LJII() == EnumC43998HOo.MV_TEMPLATE && (LIZLLL = HJC.LIZLLL((mvThemeData = (MvThemeData) LJJIIZ)))) {
                HJC.LJFF(c82552Waa.LJLILLLLZI, mvThemeData, new IDCListenerS165S0100000_14(c82552Waa, 5), null);
                if (!(!LIZLLL)) {
                    return;
                }
            }
            ((C82553Wab) iDlS65S0100000_14.l0).LJFF();
        }
    }

    public static final void LIZ$3(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        C82553Wab c82553Wab = (C82553Wab) iDlS65S0100000_14.l0;
        InterfaceC82571Wat interfaceC82571Wat = c82553Wab.LJZ;
        if (interfaceC82571Wat != null) {
            ((C82552Waa) interfaceC82571Wat).LIZIZ(c82553Wab.LJZL.LJJIIZ(c82553Wab.LJLLILLLL), 2, ((C82553Wab) iDlS65S0100000_14.l0).LJLLILLLL);
        }
    }

    public static final void LIZ$4(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        if (((C82032WHk) iDlS65S0100000_14.l0).M().LIZIZ == EnumC147935rJ.ENABLE_CLICK) {
            C82032WHk c82032WHk = (C82032WHk) iDlS65S0100000_14.l0;
            c82032WHk.LJLILLLLZI.LJLIL.invoke(new C82035WHn(c82032WHk.M().LIZ, true));
            C82032WHk c82032WHk2 = (C82032WHk) iDlS65S0100000_14.l0;
            c82032WHk2.LJLILLLLZI.LJLILLLLZI.invoke(new C82028WHg(EnumC79548VJw.CLICK, c82032WHk2.M().LIZ, ((C82032WHk) iDlS65S0100000_14.l0).LJLJJI));
            return;
        }
        C82032WHk c82032WHk3 = (C82032WHk) iDlS65S0100000_14.l0;
        c82032WHk3.LJLILLLLZI.LJLIL.invoke(new C82035WHn(c82032WHk3.M().LIZ, false));
    }

    public static final void LIZ$5(IDlS65S0100000_14 iDlS65S0100000_14, View v) {
        o.LJIIIZ(v, "v");
        C82588WbA c82588WbA = (C82588WbA) iDlS65S0100000_14.l0;
        InterfaceC82605WbR interfaceC82605WbR = c82588WbA.LJLILLLLZI;
        if (interfaceC82605WbR != null) {
            interfaceC82605WbR.LIZ(c82588WbA.getAdapterPosition(), v);
        }
    }

    public static final void LIZ$6(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        ((C82573Wav) iDlS65S0100000_14.l0).LLJILJILJ();
    }

    public static final void LIZ$7(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        ((C82573Wav) iDlS65S0100000_14.l0).LLJILJILJ();
    }

    public static final void LIZ$8(IDlS65S0100000_14 iDlS65S0100000_14, View view) {
        ((C82573Wav) iDlS65S0100000_14.l0).LLJILJILJ();
    }

    public static final void LIZ$9(IDlS65S0100000_14 iDlS65S0100000_14, View v) {
        o.LJIIIZ(v, "v");
        ((C81541VzN) iDlS65S0100000_14.l0).N(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS65S0100000_14(ViewOnClickListenerC82415WWd viewOnClickListenerC82415WWd, int i) {
        super(500L);
        this.$t = i;
        this.l0 = viewOnClickListenerC82415WWd;
    }

    public IDlS65S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
