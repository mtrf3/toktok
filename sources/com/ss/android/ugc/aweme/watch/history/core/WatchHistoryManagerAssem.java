package com.ss.android.ugc.aweme.watch.history.core;

import X.AbstractC234519Ih;
import X.C109824Ss;
import X.C16880lQ;
import X.C176346w2;
import X.C188227a6;
import X.C188267aA;
import X.C188307aE;
import X.C188727au;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7FU;
import X.C8W0;
import X.C8YN;
import X.C9KF;
import X.EnumC252729vw;
import X.FMX;
import X.InterfaceC65784Pro;
import X.SY4;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryManagerAssem extends Hilt_WatchHistoryManagerAssem {
    public long LJLJI;
    public final C214378bB LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public WatchHistoryManagerAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C188307aE c188307aE = C188307aE.LJLIL;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1229);
        C65776Prg LIZ = C65352Pkq.LIZ(WatchHistoryListViewModel.class);
        C188267aA c188267aA = C188267aA.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1230);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ, c188307aE, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), aqS153S0100000_3, c188267aA, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        C188727au c188727au = new C188727au();
        c188727au.LJ(Math.max(SystemClock.currentThreadTimeMillis() - this.LJLJI, 0L), "stayduration");
        FMX.LJIIL("exit_account_history", c188727au.LIZ);
        super.onDestroy();
    }

    public final WatchHistoryListViewModel v3() {
        return (WatchHistoryListViewModel) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String string;
        o.LJIIIZ(view, "view");
        this.LJLJI = SystemClock.currentThreadTimeMillis();
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "nav_bar_end_btn";
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.tuy)) == null) {
            str = "";
        }
        c234509Ig.LIZJ = str;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LJFF = false;
        c234509Ig.LIZ = new C109824Ss(new AqS153S0100000_3(this, 1513));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1512));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.tv6)) != null) {
            str2 = string;
        }
        LIZLLL.LIZJ = str2;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZIZ(c234509Ig);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.nh7), new ACListenerS23S0100000_3(this, 219));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.nh_), new ACListenerS23S0100000_3(this, 221));
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7aB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJJI;
            }
        }, null, C176346w2.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7a7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C188027Zm c188027Zm = (C188027Zm) obj;
                c188027Zm.getClass();
                return C208708Ha.LIZ(c188027Zm);
            }
        }, null, C188227a6.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7aC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJL;
            }
        }, null, C7FU.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7Zo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJJLL;
            }
        }, null, new AqS185S0100000_3(this, 124), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7Zp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJLJ;
            }
        }, null, new AqS185S0100000_3(this, 122), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7Zn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJJL;
            }
        }, null, new AqS185S0100000_3(this, 123), 6);
    }
}
