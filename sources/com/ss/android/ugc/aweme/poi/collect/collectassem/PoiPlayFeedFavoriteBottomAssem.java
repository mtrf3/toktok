package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C110614Vt;
import X.C16880lQ;
import X.C186537Tt;
import X.C190217dJ;
import X.C190247dM;
import X.C190257dN;
import X.C190267dO;
import X.C190297dR;
import X.C190787eE;
import X.C190797eF;
import X.C190817eH;
import X.C190827eI;
import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C225248si;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.KL2;
import X.O6R;
import X.RBW;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiCollectBottomBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiPlayFeedFavoriteBottomAssem extends PoiCollectStatusBaseAssem {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public TuxTextView LJZ;
    public String LJZI;
    public final C214298b3 LJZL;
    public String LL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0d;
    }

    public PoiPlayFeedFavoriteBottomAssem() {
        new LinkedHashMap();
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 702));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 703));
        this.LJLZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 704));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectBottomBarViewModel.class);
        this.LJZL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 705), C190297dR.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View L3() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectContainer>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final TuxIconView N3() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectIcon>(...)");
        return (TuxIconView) value;
    }

    public final PoiCollectBottomBarViewModel U3() {
        return (PoiCollectBottomBarViewModel) this.LJZL.getValue();
    }

    public final C190817eH W3() {
        C190817eH c190817eH;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Aweme aweme = (Aweme) withState(U3(), C190247dM.LJLIL);
        String str8 = null;
        if (aweme == null || (c190817eH = M3().LJLJL) == null) {
            return null;
        }
        C190787eE.Companion.getClass();
        C190787eE LIZIZ = C190797eF.LIZIZ(aweme);
        PoiAnchorData.Companion.getClass();
        PoiAnchorData LIZLLL = C190827eI.LIZLLL(aweme);
        if (LIZLLL != null) {
            str = LIZLLL.getPoiId();
            str2 = LIZLLL.getPoiInfoSource();
            str3 = LIZLLL.getPoiCityCode();
            str4 = LIZLLL.getPoiRegionCode();
            Integer poiDeviceSameCity = LIZLLL.getPoiDeviceSameCity();
            if (poiDeviceSameCity != null) {
                str5 = poiDeviceSameCity.toString();
                str6 = LIZLLL.isClaimedStr();
                str7 = LIZLLL.getPoiDetailTypeFromLevelType();
                str8 = LIZLLL.getCollectInfo();
                return C190817eH.copy$default(c190817eH, null, null, null, 0, null, null, null, null, null, null, null, null, str, str2, str3, str4, str5, str6, str7, str8, null, LIZIZ.getGroupId(), LIZIZ.getAuthorId(), null, null, 26218495, null);
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        str5 = null;
        if (LIZLLL == null) {
            str6 = null;
            str7 = null;
            return C190817eH.copy$default(c190817eH, null, null, null, 0, null, null, null, null, null, null, null, null, str, str2, str3, str4, str5, str6, str7, str8, null, LIZIZ.getGroupId(), LIZIZ.getAuthorId(), null, null, 26218495, null);
        }
        str6 = LIZLLL.isClaimedStr();
        str7 = LIZLLL.getPoiDetailTypeFromLevelType();
        str8 = LIZLLL.getCollectInfo();
        return C190817eH.copy$default(c190817eH, null, null, null, 0, null, null, null, null, null, null, null, null, str, str2, str3, str4, str5, str6, str7, str8, null, LIZIZ.getGroupId(), LIZIZ.getAuthorId(), null, null, 26218495, null);
    }

    public final TuxTextView X3() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectText>(...)");
        return (TuxTextView) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final String I3() {
        String poiId;
        Aweme aweme = (Aweme) withState(U3(), C190267dO.LJLIL);
        if (aweme == null) {
            return M3().LJLIL;
        }
        PoiAnchorData LIZ = C190217dJ.LIZ(aweme);
        if (LIZ == null || (poiId = LIZ.getPoiId()) == null) {
            return M3().LJLIL;
        }
        return poiId;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void P3(boolean z) {
        C190817eH W3 = W3();
        if (W3 == null) {
            return;
        }
        if (z) {
            C225248si.LJIILJJIL(W3.forceToMap());
        } else {
            C225248si.LJFF(W3.forceToMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void R3(boolean z) {
        Integer valueOf = Integer.valueOf(R.attr.dj);
        if (z) {
            View L3 = L3();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
            c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            Context context = L3().getContext();
            o.LJIIIIZZ(context, "poiCollectContainer.context");
            L3.setBackground(c110614Vt.LIZ(context));
            TuxIconView N3 = N3();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bookmark_fill;
            c2068389v.LJ = valueOf;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            N3.setTuxIcon(c2068389v);
            if (C186537Tt.LIZ()) {
                X3().setText(R.string.oyx);
            } else {
                X3().setText(R.string.ozn);
            }
            X3().setTextColorRes(R.attr.dj);
            return;
        }
        View L32 = L3();
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt2.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
        Context context2 = L3().getContext();
        o.LJIIIIZZ(context2, "poiCollectContainer.context");
        L32.setBackground(c110614Vt2.LIZ(context2));
        TuxIconView N32 = N3();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_bookmark;
        c2068389v2.LJ = valueOf;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        N32.setTuxIcon(c2068389v2);
        if (C186537Tt.LIZ()) {
            X3().setText(R.string.oyw);
        } else {
            X3().setText(R.string.ozm);
        }
        X3().setTextColorRes(R.attr.dj);
    }

    public final void Y3(Boolean bool) {
        String str;
        Aweme aweme = (Aweme) withState(U3(), C190257dN.LJLIL);
        String str2 = this.LL;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            return;
        }
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        this.LL = str3;
        C190817eH W3 = W3();
        if (W3 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(W3.forceToMap());
        String str4 = "1";
        if (RBW.LJLLI.LJI()) {
            linkedHashMap.put("is_login", "1");
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str4);
        }
        C225248si.LJJIIJ(linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        L3().setMinimumWidth((int) (KL2.LJIIJJI(getContext()) * 0.4f));
        View findViewById = view.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_poi_name)");
        this.LJZ = (TuxTextView) findViewById;
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, LiveTryModeCountDownThresholdSetting.DEFAULT), view);
        C8YN.LJII(this, U3(), new TBT() { // from class: X.7dP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C190287dQ) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 62), 6);
        withState(U3(), new AqS169S0100000_3(this, 372));
    }
}
