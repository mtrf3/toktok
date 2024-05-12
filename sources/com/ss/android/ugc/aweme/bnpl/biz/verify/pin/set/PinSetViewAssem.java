package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set;

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
import X.C92058a4c;
import X.C92294a8Q;
import X.C92313a8j;
import X.C92621aDh;
import X.C92630aDq;
import X.InterfaceC65784Pro;
import X.TBT;
import Y.IDRunnableS89S0100000_31;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinSetViewAssem extends BasePinUIAssem {
    public final C214378bB LJLILLLLZI;
    public final C55749LuL LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem
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

    public PinSetViewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PinSetViewModel.class);
        C92621aDh c92621aDh = C92621aDh.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 62);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92621aDh, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C92294a8Q.class, "KEY_SET_DATA"), checkSupervisorPrepared());
        this.LJLJJI = "";
    }

    public final C92294a8Q A3() {
        return (C92294a8Q) this.LJLJI.getValue();
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

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        _$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(this, 2));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92314a8k) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 25), 6);
        ((TuxTextView) _$_findCachedViewById(R.id.gj)).LJJJ(32.0f);
        _$_findCachedViewById(R.id.ge).setVisibility(0);
        _$_findCachedViewById(R.id.gj).setVisibility(0);
        _$_findCachedViewById(R.id.gd).setVisibility(0);
        _$_findCachedViewById(R.id.gb).setVisibility(0);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ge);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_x_mark_small;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 117));
        c235119Kp.LIZIZ(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
        ((TextView) _$_findCachedViewById(R.id.gj)).setText(R.string.jsl);
        ((TextView) _$_findCachedViewById(R.id.gd)).setText(R.string.js8);
        ((C92630aDq) _$_findCachedViewById(R.id.gb)).setInputCallback(new C92313a8j(this));
        _$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(this, 7));
        this.LJLJJL = System.currentTimeMillis();
        C92058a4c.LJFF(0L, "bnpl_pin_set", A3().LJLJI);
    }

    public final void C3(String str, String str2, String str3) {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.gb));
        C92058a4c.LJ("bnpl_pin_set", A3().LJLJI, "{1,change_passcode}", str3);
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LJFF(str);
            LIZ.LJII = false;
            LIZ.LIZIZ(str2);
            C77123UOp.LJIILL(LIZ, new IDqS16S1100000_31(this, str3, 3));
            LIZ.LJI().LIZLLL();
        }
    }
}
