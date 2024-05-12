package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change;

import X.ActivityC45651qj;
import X.C184077Kh;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26227ARb;
import X.C3AW;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77123UOp;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C92033a4D;
import X.C92058a4c;
import X.C92291a8N;
import X.C92608aDU;
import X.C92609aDV;
import X.C93149aMD;
import X.EnumC92072a4q;
import X.InterfaceC65784Pro;
import X.TBT;
import X.XKX;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinChangeConsultResult;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinChangeViewAssem extends BasePinUIAssem {
    public final C214378bB LJLILLLLZI;
    public final C55749LuL LJLJI;
    public PinChangeConsultResult LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public PinChangeViewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PinChangeViewModel.class);
        C92609aDV c92609aDV = C92609aDV.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 59);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92609aDV, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C92291a8N.class, "KEY_CHANGE_DATA"), checkSupervisorPrepared());
    }

    public final C92291a8N A3() {
        return (C92291a8N) this.LJLJI.getValue();
    }

    public final PinChangeViewModel C3() {
        return (PinChangeViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        Window window;
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            window.setFlags(FileUtils.BUFFER_SIZE, FileUtils.BUFFER_SIZE);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.aNH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLILLLLZI;
            }
        }, null, new IDqS445S0100000_31(this, 18), 6);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.aNI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLJI;
            }
        }, null, new IDqS445S0100000_31(this, 19), 6);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.aNJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 20), 6);
        C8YN.LJIIJ(this, C3(), new TBT() { // from class: X.aNK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.aNL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLJJL;
            }
        }, null, new IDqS441S0100000_31(this, 10), 12);
        C8YN.LJIIJ(this, C3(), new TBT() { // from class: X.aNE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLJJLL;
            }
        }, new TBT() { // from class: X.aNF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92288a8K) obj).LJLJL;
            }
        }, null, new IDqS441S0100000_31(this, 9), 12);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.aNG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C92288a8K) obj).LJLJLJ);
            }
        }, null, new IDqS445S0100000_31(this, 17), 6);
        PinChangeViewModel C3 = C3();
        XKX.LIZLLL(C3.getAssemVMScope(), null, null, new C93149aMD(C3, null), 3);
        _$_findCachedViewById(R.id.ge).setVisibility(0);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ge);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 112));
        c235119Kp.LIZLLL(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
    }

    public final void E3(String str, String str2) {
        boolean z;
        List arrayList;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            if (o.LJ(str, "PASS")) {
                if (str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    EnumC92072a4q enumC92072a4q = A3().LJLIL;
                    PinChangeConsultResult pinChangeConsultResult = this.LJLJJI;
                    if (pinChangeConsultResult == null || (arrayList = pinChangeConsultResult.pinRuleList) == null) {
                        arrayList = new ArrayList();
                    }
                    C92033a4D.LIZIZ(LIZ, enumC92072a4q, arrayList, "bnpl_pin_change", new IDqS418S0100000_31(this, 35));
                    return;
                }
                C92033a4D.LIZLLL(LIZ, str2, "bnpl_pin_change", new IDqS441S0100000_31(this, 3));
                return;
            }
            LIZ.finish();
        }
    }

    public final void F3(String str, String str2, String str3) {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.gb));
        Context context = getContext();
        if (context != null) {
            if (o.LJ(str3, "PIN_INVALID")) {
                C92058a4c.LJ("bnpl_pin_change", A3().LJLILLLLZI, "{1,forgot; 2,cancel}", str3);
                C26227ARb LIZ = C3AW.LIZ(context);
                LIZ.LJFF(str);
                LIZ.LJII = false;
                LIZ.LIZIZ(str2);
                C77123UOp.LJIILL(LIZ, new C92608aDU(this, str3, context));
                LIZ.LJI().LIZLLL();
                return;
            }
            C26227ARb LIZ2 = C3AW.LIZ(context);
            LIZ2.LJFF(str);
            LIZ2.LJII = false;
            LIZ2.LIZIZ(str2);
            C77123UOp.LJIILL(LIZ2, new IDqS16S1100000_31(this, str3, 0));
            LIZ2.LJI().LIZLLL();
        }
    }
}
