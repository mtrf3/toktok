package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C2318698c;
import X.C2319098g;
import X.C2320698w;
import X.C234999Kd;
import X.C243089gO;
import X.C25770A9m;
import X.C55953Lxd;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78939UyV;
import X.C8VC;
import X.C8YN;
import X.C99F;
import X.C99H;
import X.C9KV;
import X.InterfaceC235069Kk;
import X.InterfaceC57760Mlg;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS93S0100000_4;
import Y.IDAListenerS2S0110000_4;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.profile.experiment.HomepageRecommendSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HomepageRecommendAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C25770A9m LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;

    public HomepageRecommendAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(HomepageRecommendVM.class);
        this.LJLIL = new C214298b3(new AqS154S0100000_4(LIZ, 749), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C2319098g.INSTANCE, LIZ);
    }

    public final void v3() {
        C25770A9m c25770A9m = this.LJLILLLLZI;
        if (c25770A9m != null) {
            c25770A9m.clearAnimation();
        } else {
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
    }

    public final HomepageRecommendVM x3() {
        return (HomepageRecommendVM) this.LJLIL.getValue();
    }

    public final void A3(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 43));
        ofFloat.addListener(new IDAListenerS2S0110000_4(this, z, 5));
        ofFloat.addListener(new IDAListenerS2S0110000_4(this, z, 4));
        if (z) {
            ofFloat.start();
        } else {
            ofFloat.reverse();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C25770A9m c25770A9m;
        long j;
        int i;
        o.LJIIIZ(view, "view");
        if (!C78939UyV.LJJJJLI(x3().iv0())) {
            return;
        }
        if (C2318698c.LIZIZ()) {
            View findViewById = view.findViewById(R.id.myn);
            o.LJIIIIZZ(findViewById, "{\n            findViewBy…d_layout_below)\n        }");
            c25770A9m = (C25770A9m) findViewById;
        } else {
            View findViewById2 = view.findViewById(R.id.mym);
            o.LJIIIIZZ(findViewById2, "{\n            findViewBy…er_card_layout)\n        }");
            c25770A9m = (C25770A9m) findViewById2;
        }
        this.LJLILLLLZI = c25770A9m;
        View findViewById3 = view.findViewById(R.id.mz2);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.user_info_layout)");
        this.LJLJI = findViewById3;
        findViewById3.post(new ARunnableS40S0100000_4(this, 108));
        User iv0 = x3().iv0();
        C25770A9m c25770A9m2 = this.LJLILLLLZI;
        User user = null;
        if (c25770A9m2 != null) {
            c25770A9m2.LJJJ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this), new AqS170S0100000_4(iv0, 1042));
            C25770A9m c25770A9m3 = this.LJLILLLLZI;
            if (c25770A9m3 != null) {
                c25770A9m3.W7(x3());
                C25770A9m c25770A9m4 = this.LJLILLLLZI;
                if (c25770A9m4 != null) {
                    c25770A9m4.LIZ(R.string.pey, new ACListenerS24S0100000_4(this, 257));
                    InterfaceC57760Mlg hv0 = x3().hv0();
                    if (hv0 != null) {
                        C25770A9m c25770A9m5 = this.LJLILLLLZI;
                        if (c25770A9m5 != null) {
                            c25770A9m5.W7(hv0);
                        } else {
                            o.LJIJI("horizontalUserCardLayout");
                            throw null;
                        }
                    }
                    C8YN.LJII(this, x3(), new TBT() { // from class: X.98l
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C2320198r) obj).LJLIL;
                        }
                    }, null, new AqS186S0100000_4(this, 267), 6);
                    C8YN.LJII(this, x3(), new TBT() { // from class: X.98f
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C2320198r) obj).LJLILLLLZI;
                        }
                    }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 268), 4);
                    C8YN.LJII(this, x3(), new TBT() { // from class: X.98h
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C2320198r) obj).LJLJI;
                        }
                    }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 269), 4);
                    C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9IT
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C9PL) obj).LIZJ;
                        }
                    }, new AqS170S0100000_4(this, 1043));
                    HomepageRecommendSetting.HomepageRecommendConfigModel LIZ = HomepageRecommendSetting.LIZ();
                    C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
                    if (c234999Kd != null) {
                        user = c234999Kd.LIZ;
                    }
                    if (user != null) {
                        j = user.getFriendCount();
                    } else {
                        j = 0;
                    }
                    long max = Math.max(j, C99H.LIZ());
                    if (user != null) {
                        i = user.historyMaxFollowerCount;
                    } else {
                        i = -1;
                    }
                    C243089gO.LIZLLL(max, i, C2320698w.LIZIZ(), LIZ.xDays, LIZ.yHide, LIZ.lowMufBound, LIZ.lowFollowerBound, C99F.LIZ());
                    return;
                }
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }
}
