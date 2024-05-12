package com.ss.android.ugc.aweme.offlinemode.ui.pagestate;

import X.ActivityC45651qj;
import X.C184077Kh;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C252219v7;
import X.C252229v8;
import X.C252239v9;
import X.C26222AQw;
import X.C2K0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C7MY;
import X.C8W0;
import X.C8YN;
import X.C9BD;
import X.InterfaceC65784Pro;
import X.KUR;
import X.TBT;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;

/* loaded from: classes5.dex */
public final class OfflineModeDetailPageStateImp extends DetailPageStateImp {
    public static final C26222AQw LJZ = new C26222AQw("OfflineModeDetailPageStateImp");
    public final C214378bB LJLLJ;
    public final C214298b3 LJLLL;
    public final C62822Ol8 LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 498));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 499));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 501));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // X.C8W0
    public final void onParentViewCreated() {
        boolean z;
        super.onParentViewCreated();
        if (C3().getState().LJLILLLLZI > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLLLL = z;
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9v6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9S3) obj).LJLJL;
            }
        }, null, new AqS186S0100000_4(this, 135), 6);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9v5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 136), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp, com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp, com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final KUR v3() {
        return null;
    }

    public OfflineModeDetailPageStateImp() {
        InterfaceC65784Pro LJIILJJIL;
        C252219v7 c252219v7 = C252219v7.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeListVM.class);
        C252239v9 c252239v9 = C252239v9.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 503);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLLJ = new C214378bB(LIZ, c252219v7, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c252239v9, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS154S0100000_4(LIZ2, 502), C252229v8.INSTANCE, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
    }

    public final OfflineModeManagerVM C3() {
        return (OfflineModeManagerVM) this.LJLLL.getValue();
    }

    public final void E3() {
        boolean z;
        if (C3().getState().LJLJL == null) {
            z = true;
        } else {
            z = false;
        }
        if (C3().getState().LJLILLLLZI <= 0 && z) {
            NV();
            return;
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LJLLI.getValue();
        if (iPageStateAbility == null) {
            return;
        }
        iPageStateAbility.lR();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ic0(Exception exc) {
        String str;
        String str2;
        String string;
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            String str3 = "";
            if (LIZ == null || (str = LIZ.getString(R.string.j8p)) == null) {
                str = "";
            }
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 == null || (str2 = LIZ2.getString(R.string.j8o)) == null) {
                str2 = "";
            }
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
            if (LIZ3 != null && (string = LIZ3.getString(R.string.j8n)) != null) {
                str3 = string;
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_cloud_arrow_down;
            c2068389v.LJ = Integer.valueOf(R.attr.dm);
            c2068389v.LIZIZ = C7MY.LIZIZ(72);
            c2068389v.LIZJ = C7MY.LIZIZ(72);
            AqS58S1100000_4 aqS58S1100000_4 = new AqS58S1100000_4(str3, this, 18);
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZ(c2068389v);
            c73306Spq.LJFF = str;
            c73306Spq.LJI = str2;
            c73306Spq.LJII = aqS58S1100000_4;
            c73305Spp.setStatus(c73306Spq);
            ((TuxTextView) _$_findCachedViewById(R.id.lao)).setTextColorRes(R.attr.dk);
            ((TuxTextView) _$_findCachedViewById(R.id.message_tv)).setTextColorRes(R.attr.dl);
            c73305Spp.setVisibility(0);
        }
        LJZ.LIZ(null, "showNewStatusView, localTuxStatusView");
    }
}
