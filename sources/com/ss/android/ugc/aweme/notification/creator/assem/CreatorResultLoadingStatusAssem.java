package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C1DH;
import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C56875MTv;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import X.V1B;
import Y.ALAdapterS2S0110000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorResultLoadingStatusAssem extends UIContentAssem {
    public final C214298b3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public Animator LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = V1B.LJZI(new AqS159S0100000_9(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        Integer valueOf = Integer.valueOf(R.raw.icon_large_inbox);
        Context context = getContext();
        if (context != null) {
            C73306Spq c73306Spq = new C73306Spq();
            String string = context.getString(R.string.iw5);
            o.LJIIIIZZ(string, "context.getString(titleId)");
            c73306Spq.LJFF = string;
            String string2 = context.getString(R.string.iwg);
            o.LJIIIIZZ(string2, "context.getString(descId)");
            c73306Spq.LJI = string2;
            if (valueOf != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = valueOf.intValue();
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq.LIZ(c2068389v);
            }
            if (C1DH.LJIJJLI()) {
                new C73306Spq();
                o.LJIIIIZZ(context.getString(R.string.hn6), "context.getString(R.stri…notification_description)");
            }
            C73306Spq c73306Spq2 = new C73306Spq();
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_large_refresh;
            c2068389v2.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq2.LIZJ = 0;
            c73306Spq2.LIZIZ = c2068389v2;
            String string3 = context.getString(R.string.ea0);
            o.LJIIIIZZ(string3, "context.getString(R.stri…te_noConnection_headline)");
            c73306Spq2.LJFF = string3;
            String string4 = context.getString(R.string.ea1);
            o.LJIIIIZZ(string4, "context.getString(R.stri…noConnection_subheadline)");
            c73306Spq2.LJI = string4;
            C73312Spw.LJI(c73306Spq2, new AqS159S0100000_9(this, 773));
        }
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 38), 4);
    }

    public CreatorResultLoadingStatusAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeResultVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 388), C56875MTv.INSTANCE, null);
        this.LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 386));
        this.LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 391));
        this.LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 389));
        this.LJLJJLL = V1B.LJZI(new AqS159S0100000_9(this, 387));
    }

    public final C73305Spp A3() {
        return (C73305Spp) this.LJLJJI.getValue();
    }

    public final void C3() {
        ((View) this.LJLJJL.getValue()).setVisibility(0);
        ((View) this.LJLJJLL.getValue()).setVisibility(8);
        ((C73305Spp) this.LJLJI.getValue()).setVisibility(0);
        ((C73305Spp) this.LJLJI.getValue()).LJFF();
    }

    public final CreatorNoticeResultVM x3() {
        return (CreatorNoticeResultVM) this.LJLILLLLZI.getValue();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        withState(x3(), new AqS175S0100000_9(this, 158));
    }

    public final void v3(boolean z) {
        int i;
        int i2;
        Animator animator = this.LJLJL;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (z) {
            i = -((Number) this.LJLIL.getValue()).intValue();
            i2 = 0;
        } else {
            i = 0;
            i2 = -((Number) this.LJLIL.getValue()).intValue();
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        C73305Spp topView = A3();
        o.LJIIIIZZ(topView, "topView");
        ViewGroup.LayoutParams layoutParams = topView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        topView.setLayoutParams(marginLayoutParams);
        ofInt.addUpdateListener(new AUListenerS97S0100000_9(this, 12));
        ofInt.addListener(new ALAdapterS2S0110000_9(this, z, 1));
        ofInt.setDuration(200L);
        ofInt.start();
        this.LJLJL = ofInt;
    }
}
