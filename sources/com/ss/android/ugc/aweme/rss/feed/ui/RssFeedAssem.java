package com.ss.android.ugc.aweme.rss.feed.ui;

import X.AJV;
import X.AJZ;
import X.AbstractC234519Ih;
import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68432mN;
import X.C74017T3d;
import X.C76800UCe;
import X.C78926UyI;
import X.C78983UzD;
import X.C8YN;
import X.C9KF;
import X.HK3;
import X.InterfaceC65350Pko;
import X.SY4;
import X.SYL;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RssFeedAssem extends UISlotAssem {
    public final C214298b3 LJLL;
    public SY4 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, RssFeedParam.class, null), checkSupervisorPrepared());

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cb1;
    }

    public RssFeedAssem() {
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 334);
        C65776Prg LIZ = C65352Pkq.LIZ(RssFeedViewModel.class);
        this.LJLL = new C214298b3(new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 333), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS160S0100000_10, C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C74017T3d.INSTANCE, LIZ);
    }

    public final RssFeedViewModel H3() {
        return (RssFeedViewModel) this.LJLL.getValue();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        SY4 sy4 = this.LJLLI;
        if (sy4 != null) {
            sy4.setLoading(false);
        }
        H3().setState(C68432mN.LJLIL);
    }

    public final void I3(Throwable th) {
        if (th instanceof AJZ) {
            C78983UzD.LJJJLZIJ(this, ((AJZ) th).getErrMsgId(), true);
            return;
        }
        if (th instanceof AJV) {
            AJV ajv = (AJV) th;
            if (ajv.getApiMsg() != null) {
                C78983UzD.LJJJZ(this, ajv.getApiMsg());
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            C78983UzD.LJJJLZIJ(this, R.string.bta, false);
            return;
        }
        C78983UzD.LJJJLZIJ(this, R.string.bsy, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C252709vu c252709vu;
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) _$_findCachedViewById(R.id.j8w);
        if (syl != null) {
            syl.LLLF.LJZL(RssEntryViewHolder.class);
            syl.setLifecycleOwner(this);
        }
        Context context = getContext();
        if (context != null && (c252709vu = (C252709vu) _$_findCachedViewById(R.id.j8x)) != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ.LIZIZ(new AqS154S0100000_4(context, 1248));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            String string = context.getString(R.string.bsw);
            o.LJIIIIZZ(string, "ctx.getString(R.string.a…_chooseArticlePage_title)");
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZIZ = "editButton";
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_pen;
            c234529Ii.LIZIZ(new AqS157S0200000_10(this, context, 49));
            c235119Kp.LIZIZ(c234529Ii);
            c252709vu.setNavActions(c235119Kp);
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.j8y);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS32S0100000_12(this, 194));
        } else {
            sy4 = null;
        }
        this.LJLLI = sy4;
        AssemViewModel.asyncSubscribe$default(H3(), new TBT() { // from class: X.T3f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33W) obj).LJLIL;
            }
        }, null, new AqS178S0100000_12(this, 279), new AqS162S0100000_12(this, 906), new AqS178S0100000_12(this, 280), 2, null);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.T3b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33W) obj).LJLJJL;
            }
        }, null, HK3.LJLIL, 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.T3g
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33W) obj).LJLJI;
            }
        }, null, new AqS189S0100000_7(this, 11), 6);
        AssemViewModel.asyncSubscribe$default(H3(), new TBT() { // from class: X.T3h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33W) obj).LJLILLLLZI;
            }
        }, null, new AqS178S0100000_12(this, 278), new AqS162S0100000_12(this, 905), new AqS173S0100000_7(this, 81), 2, null);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.T3Y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C33W) obj).LJLJJI);
            }
        }, C213688a4.LIZLLL(), new AqS189S0100000_7(this, 10), 4);
        RssFeedViewModel H3 = H3();
        H3.getClass();
        H3.withState(new AqS167S0100000_1(H3, 472));
    }
}
