package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
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
import X.C86V;
import X.C8W0;
import X.C8YN;
import X.C92292a8O;
import X.C92310a8g;
import X.C92619aDf;
import X.C92630aDq;
import X.C93009aJx;
import X.C93010aJy;
import X.InterfaceC65784Pro;
import X.SY4;
import X.TBT;
import Y.IDCListenerS138S0100000_31;
import Y.IDRunnableS89S0100000_31;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinConfirmViewAssem extends BasePinUIAssem {
    public final C214378bB LJLILLLLZI;
    public final C55749LuL LJLJI;
    public String LJLJJI;
    public InputMethodManager LJLJJL;
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

    public PinConfirmViewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PinConfirmViewModel.class);
        C92619aDf c92619aDf = C92619aDf.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 61);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92619aDf, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C92292a8O.class, "KEY_CONFIRM_DATA"), checkSupervisorPrepared());
        this.LJLJJI = "";
    }

    public final C92292a8O A3() {
        return (C92292a8O) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        Object obj;
        Window window;
        Window window2;
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window2 = LIZ.getWindow()) != null) {
            window2.setSoftInputMode(16);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        InputMethodManager inputMethodManager = null;
        if (LIZ2 != null) {
            obj = C16880lQ.LLILLJJLI(LIZ2, "input_method");
        } else {
            obj = null;
        }
        if (obj instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) obj;
        }
        this.LJLJJL = inputMethodManager;
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 != null && (window = LIZ3.getWindow()) != null) {
            window.setFlags(FileUtils.BUFFER_SIZE, FileUtils.BUFFER_SIZE);
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        _$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(this, 1));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92311a8h) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 24), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92311a8h) obj).LJLILLLLZI;
            }
        }, null, C93009aJx.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92311a8h) obj).LJLJJI;
            }
        }, null, C93010aJy.LJLIL, 6);
        ((TuxTextView) _$_findCachedViewById(R.id.gj)).LJJJ(32.0f);
        _$_findCachedViewById(R.id.ge).setVisibility(0);
        _$_findCachedViewById(R.id.gj).setVisibility(0);
        _$_findCachedViewById(R.id.gd).setVisibility(0);
        _$_findCachedViewById(R.id.gb).setVisibility(0);
        _$_findCachedViewById(R.id.gf).setVisibility(0);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ge);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_x_mark_small;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 116));
        c235119Kp.LIZIZ(c234529Ii);
        c252709vu.setNavActions(c235119Kp);
        ((C92630aDq) _$_findCachedViewById(R.id.gb)).setInputCallback(new C92310a8g(this));
        ((TextView) _$_findCachedViewById(R.id.gj)).setText(R.string.jrt);
        ((TextView) _$_findCachedViewById(R.id.gd)).setText(R.string.jrr);
        _$_findCachedViewById(R.id.gf).getClass();
        ((TextView) _$_findCachedViewById(R.id.gf)).setText(C86V.LJFF(R.string.jrq));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.gf), new IDCListenerS138S0100000_31(this, 15));
        _$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(this, 6));
    }
}
