package com.ss.android.ugc.aweme.bnpl.biz.credit.phone;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74090T5y;
import X.C78926UyI;
import X.C8YN;
import X.C91798a0Q;
import X.C91924a2S;
import X.C91928a2W;
import X.C92006a3m;
import X.C92174a6U;
import X.C92274a86;
import X.C92594aDG;
import X.C92595aDH;
import X.C9BE;
import X.EnumC92023a43;
import X.OSZ;
import X.SY4;
import X.TBT;
import X.TBV;
import X.X1D;
import Y.IDCListenerS138S0100000_31;
import Y.IDRunnableS89S0100000_31;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.PhoneRule;
import com.ss.android.ugc.aweme.bnpl.network.model.UserAgreement;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PhoneNumberAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public ViewTreeObserver.OnGlobalLayoutListener LJLJJL;
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

    public PhoneNumberAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PhoneNumberVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 55), C92595aDH.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C92274a86.class, "phone_number_data"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        ActivityC45651qj LIZ;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        if (this.LJLJJL != null && (LIZ = C212428Vi.LIZ(this)) != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLJJL);
        }
        super.onDestroy();
    }

    public final PhoneNumberVM v3() {
        return (PhoneNumberVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        UserAgreement userAgreement;
        Window window;
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.fl);
            BNPLEntryData bNPLEntryData = C92006a3m.LIZ;
            if (bNPLEntryData == null || (userAgreement = bNPLEntryData.getUserAgreement()) == null || (str = userAgreement.getPaAgreement()) == null) {
                str = "";
            }
            textView.setText(C92006a3m.LIZ(LIZ2, str, R.attr.gq, new IDqS418S0100000_31(this, 28)));
        }
        PhoneNumberVM v3 = v3();
        EnumC92023a43 mode = EnumC92023a43.EDIT;
        v3.getClass();
        o.LJIIIZ(mode, "mode");
        v3.withState(new IDqS174S0200000_31(v3, mode, 25));
        PhoneNumberVM v32 = v3();
        ArrayList<PhoneRule> arrayList = ((C92274a86) this.LJLILLLLZI.getValue()).LJLILLLLZI;
        v32.getClass();
        o.LJIIIZ(arrayList, "<set-?>");
        v32.LJLJJI = arrayList;
        v3().LJLJI = ((C92274a86) this.LJLILLLLZI.getValue()).LJLIL;
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.fi), new IDCListenerS138S0100000_31(this, 12));
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C91928a2W.LIZ(((C74090T5y) _$_findCachedViewById(R.id.ff)).getEditText());
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        TextView textView = (TextView) _$_findCachedViewById(R.id.fe);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(v3().LJLJI);
        textView.setText(X1D.LIZIZ(LIZ));
        _$_findCachedViewById(R.id.ff).post(new IDRunnableS89S0100000_31(this, 0));
        ((C74090T5y) _$_findCachedViewById(R.id.ff)).setListener(new C92174a6U(this));
        ((C74090T5y) _$_findCachedViewById(R.id.ff)).setTextWatcher(new C91798a0Q(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aMo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92273a85) obj).LJLILLLLZI);
            }
        }, null, new IDqS445S0100000_31(this, 5), 6);
        C8YN.LJIIJJI(this, v3(), new TBT() { // from class: X.aMp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92273a85) obj).LJLJI;
            }
        }, new TBV() { // from class: X.aNY
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C92273a85) obj).LJLJJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C92273a85) obj).LJLJJI = (ConfirmRegisterMobileResponse) obj2;
            }
        }, new TBT() { // from class: X.aMq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92273a85) obj).LJLJJL;
            }
        }, null, new C92594aDG(this), 24);
        v3().LJLJJL = System.currentTimeMillis();
        PhoneNumberVM v3 = v3();
        v3.getClass();
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_phone_number_show", "bnpl_activate_phone_number", ((C92274a86) v3.LJLIL.getValue()).LJLJI, C51029K0z.LJJIIZI(new OSZ("interface_return_cost", CardStruct.IStatusCode.DEFAULT)), 8);
    }
}
