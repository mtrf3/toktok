package com.ss.android.ugc.aweme.bnpl.biz.credit.landing;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C16880lQ;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C61712OJw;
import X.C61713OJx;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C91824a0q;
import X.C91924a2S;
import X.C92006a3m;
import X.C92579aD1;
import X.C92925aIb;
import X.C92929aIf;
import X.C93134aLy;
import X.C9BE;
import X.OSZ;
import X.SY4;
import X.TBT;
import X.W5F;
import X.W5U;
import X.XKX;
import Y.IDCListenerS138S0100000_31;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.Institution;
import com.ss.android.ugc.aweme.bnpl.network.model.InstitutionIcon;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.IDqS463S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class LandingAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public LandingAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LandingAssemVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 53), C92579aD1.INSTANCE, null);
    }

    public final LandingAssemVM v3() {
        return (LandingAssemVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        Institution institutionInfo;
        Institution institutionInfo2;
        InstitutionIcon icon;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aND
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92264a7w) obj).LJLIL);
            }
        }, null, new IDqS445S0100000_31(this, 15), 6);
        C8YN.LJIIJ(this, v3(), new TBT() { // from class: X.aN7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92264a7w) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.aN8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92264a7w) obj).LJLJI);
            }
        }, null, C92925aIb.LJLIL, 12);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.eo), new IDCListenerS138S0100000_31(this, 11));
        selectSubscribe(r7, new TBT() { // from class: X.aN9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92264a7w) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.aNA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92264a7w) obj).LJLJI);
            }
        }, new TBT() { // from class: X.aNB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92264a7w) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.aNC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92264a7w) obj).LJLJJLL;
            }
        }, C213688a4.LIZIZ(v3().usedInReusedScene), null, new IDqS463S0100000_31(this, 1));
        BNPLEntryData bNPLEntryData = C92006a3m.LIZ;
        if (bNPLEntryData != null && (institutionInfo2 = bNPLEntryData.getInstitutionInfo()) != null && (icon = institutionInfo2.getIcon()) != null) {
            str = icon.getDark();
        } else {
            str = null;
        }
        BNPLEntryData bNPLEntryData2 = C92006a3m.LIZ;
        if (bNPLEntryData2 != null && (institutionInfo = bNPLEntryData2.getInstitutionInfo()) != null) {
            str2 = institutionInfo.getDescription();
        } else {
            str2 = null;
        }
        W5F LJ = W5U.LJ(R.drawable.i7);
        LJ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.em);
        C16880lQ.LLJJJ(LJ);
        if (str != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.em);
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        if (str2 != null) {
            ((TextView) _$_findCachedViewById(R.id.en)).setText(str2);
        }
        LandingAssemVM v3 = v3();
        v3.setState(C92929aIf.LJLIL);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(v3), C78613UtF.LIZJ, null, new C93134aLy(v3, null), 2);
        v3().LJLIL = System.currentTimeMillis();
        v3().getClass();
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_landing_show", "bnpl_activate_landing", C91824a0q.LJFF, C113554cx.LJJL(new OSZ("interface_return_cost", CardStruct.IStatusCode.DEFAULT), new OSZ("landing_page_cost", String.valueOf(System.currentTimeMillis() - C91824a0q.LJIIIIZZ))), 8);
    }

    public final void x3(boolean z) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C61713OJx LIZJ = C61712OJw.LIZJ(LIZ);
            LIZJ.LIZIZ(true, false);
            if (z) {
                LIZJ.LIZIZ.LJIIL();
            } else {
                LIZJ.LJII(R.attr.d4);
            }
            LIZJ.LIZJ();
        }
    }
}
