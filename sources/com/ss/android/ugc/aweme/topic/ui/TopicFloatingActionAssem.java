package com.ss.android.ugc.aweme.topic.ui;

import X.C16880lQ;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7S6;
import X.C7UT;
import X.C8YN;
import X.C9BD;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS7S0101000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicFloatingActionAssem extends ShootAssem implements ViewPagerPageSelectedSubscriber {
    public final C214298b3 LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;

    public TopicFloatingActionAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewVM.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1115), C7UT.INSTANCE, null);
    }

    public final void O3() {
        String string;
        int i;
        int i2;
        TextView N3 = N3();
        if (this.LJLZ == 0) {
            string = N3().getContext().getString(R.string.cch);
        } else {
            string = N3().getContext().getString(R.string.cda);
        }
        N3.setText(string);
        TuxIconView tuxIconView = this.LJLLI;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            if (this.LJLZ == 0) {
                i = R.raw.icon_video_fill;
            } else {
                i = R.raw.icon_star_fill;
            }
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v);
            ViewGroup M3 = M3();
            if (this.LJLZ == 1 && this.LJZ) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            M3.setVisibility(i2);
            M3().requestLayout();
            C16880lQ.LJIIL(M3(), new ACListenerS23S0100000_3(this, 165));
            return;
        }
        o.LJIJI("startRecordIcon");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.7US
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C186157Sh) obj).LJLJJL);
            }
        }, null, new AqS185S0100000_3(this, 97), 6);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ViewPagerPageSelectedSubscriber.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, ViewPagerPageSelectedSubscriber.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(ViewPagerPageSelectedSubscriber.class.getClassLoader(), new Class[]{ViewPagerPageSelectedSubscriber.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ViewPagerPageSelectedSubscriber.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void cR(int i, C7S6 switchMethod) {
        o.LJIIIZ(switchMethod, "switchMethod");
        M3().setPivotX(M3().getWidth() / 2.0f);
        M3().setPivotY(M3().getHeight() / 2.0f);
        M3().animate().scaleX(0.9f).scaleY(0.9f).setDuration(200L).withEndAction(new ARunnableS7S0101000_3(i, this, 6)).start();
    }
}
