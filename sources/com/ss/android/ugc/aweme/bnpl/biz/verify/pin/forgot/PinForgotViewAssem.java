package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot;

import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C92293a8P;
import X.C92614aDa;
import X.C93152aMG;
import X.InterfaceC65784Pro;
import X.TBT;
import X.XKX;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;

/* loaded from: classes20.dex */
public final class PinForgotViewAssem extends UIContentAssem {
    public final C214378bB LJLIL;
    public final C55749LuL LJLILLLLZI;
    public String LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public PinForgotViewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PinForgotViewModel.class);
        C92614aDa c92614aDa = C92614aDa.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 60);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92614aDa, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C92293a8P.class, "KEY_FORGOT_DATA"), checkSupervisorPrepared());
        this.LJLJI = "";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, x3(), new TBT() { // from class: X.aNM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92289a8L) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 21), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.aNN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92289a8L) obj).LJLILLLLZI;
            }
        }, null, new IDqS445S0100000_31(this, 22), 6);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.aNO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92289a8L) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.aNP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92289a8L) obj).LJLJJI;
            }
        }, null, new IDqS441S0100000_31(this, 11), 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.aNQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C92289a8L) obj).LJLJJLL);
            }
        }, null, new IDqS445S0100000_31(this, 23), 6);
        PinForgotViewModel x3 = x3();
        XKX.LIZLLL(x3.getAssemVMScope(), null, null, new C93152aMG(x3, null), 3);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ft);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 114));
        c235119Kp.LIZLLL(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
    }

    public final C92293a8P v3() {
        return (C92293a8P) this.LJLILLLLZI.getValue();
    }

    public final PinForgotViewModel x3() {
        return (PinForgotViewModel) this.LJLIL.getValue();
    }
}
