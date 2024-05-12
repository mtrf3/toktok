package com.ss.android.ugc.aweme.rss.link.ui;

import X.AFA;
import X.AJE;
import X.AJU;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C26018AJa;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78857UxB;
import X.C78926UyI;
import X.C87753cR;
import X.C8YN;
import X.C9BE;
import X.C9RT;
import X.SY4;
import X.T5T;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS23S0200000_4;
import Y.IDObjectS177S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RssLinkAssem extends UISlotAssem {
    public final C214298b3 LJLL;
    public final C62822Ol8 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, RssLinkParam.class, null), checkSupervisorPrepared());

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
        return R.layout.cb4;
    }

    public RssLinkAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 770);
        C65776Prg LIZ = C65352Pkq.LIZ(RssLinkViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 769), AFA.INSTANCE, aqS154S0100000_4);
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 768));
    }

    public final RssLinkViewModel H3() {
        return (RssLinkViewModel) this.LJLL.getValue();
    }

    public final void I3() {
        T5T t5t;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.j92);
        if (_$_findCachedViewById != null && (t5t = (T5T) _$_findCachedViewById.findViewById(R.id.cps)) != null) {
            t5t.postDelayed(new ARunnableS23S0200000_4(t5t, this, 20), 200L);
        }
    }

    public final void A90(boolean z) {
        TextView textView;
        TextView textView2;
        if (z) {
            SY4 sy4 = (SY4) _$_findCachedViewById(R.id.j91);
            if (sy4 != null) {
                sy4.setLoading(true);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.j92);
            if (_$_findCachedViewById != null && (textView2 = (TextView) _$_findCachedViewById.findViewById(R.id.cps)) != null) {
                textView2.setEnabled(false);
            }
            C16880lQ.LJJJ((TuxIconView) this.LJLLI.getValue(), AJU.LJLIL);
            return;
        }
        SY4 sy42 = (SY4) _$_findCachedViewById(R.id.j91);
        if (sy42 != null) {
            sy42.setLoading(false);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.j92);
        if (_$_findCachedViewById2 != null && (textView = (TextView) _$_findCachedViewById2.findViewById(R.id.cps)) != null) {
            textView.setEnabled(true);
        }
        C16880lQ.LJJJ((TuxIconView) this.LJLLI.getValue(), new ACListenerS24S0100000_4(this, 162));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AJE pageMode;
        o.LJIIIZ(view, "view");
        RssLinkViewModel H3 = H3();
        if (C78857UxB.LJJJIL(((RssLinkParam) this.LJLJLLL.getValue()).getRssFeedUrl())) {
            pageMode = AJE.EDIT;
        } else {
            pageMode = AJE.NEW;
        }
        H3.getClass();
        o.LJIIIZ(pageMode, "pageMode");
        H3.setState(new AqS170S0100000_4(pageMode, 9));
        C26018AJa c26018AJa = (C26018AJa) _$_findCachedViewById(R.id.j92);
        if (c26018AJa != null) {
            c26018AJa.LJ(false);
            ((TextView) c26018AJa.LIZIZ(R.id.cps)).setMaxLines(1);
            TextView textView = (TextView) c26018AJa.findViewById(R.id.cps);
            if (textView != null) {
                textView.setSingleLine(true);
            }
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.cwv).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388693;
            if (C9RT.LIZ()) {
                I3();
            }
            c26018AJa.LIZJ(new IDObjectS177S0100000_4(this, 19));
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.j91);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 335));
        }
        AssemViewModel.asyncSubscribe$default(H3(), new TBT() { // from class: X.AJP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AJD) obj).LJLJJLL;
            }
        }, null, new AqS170S0100000_4(this, 1726), new AqS154S0100000_4(this, 1280), new AqS170S0100000_4(this, 1727), 2, null);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.AJC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((AJD) obj).LJLILLLLZI);
            }
        }, null, C87753cR.LJLIL, 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.AJT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AJD) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 346), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.AJQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AJD) obj).LJLJI;
            }
        }, null, new AqS186S0100000_4(this, 347), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.AJR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AJD) obj).LJLJJI;
            }
        }, null, new AqS186S0100000_4(this, 348), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.AJS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AJD) obj).LJLJJL;
            }
        }, null, new AqS186S0100000_4(this, 349), 6);
    }
}
