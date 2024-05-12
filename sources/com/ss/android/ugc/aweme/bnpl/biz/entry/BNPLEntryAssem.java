package com.ss.android.ugc.aweme.bnpl.biz.entry;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8YN;
import X.C91657Zy9;
import X.C91824a0q;
import X.C92175a6V;
import X.C92280a8C;
import X.C92600aDM;
import X.C9BE;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BNPLEntryAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public BNPLEntryAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BNPLEntryViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 57), C92600aDM.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C92280a8C.class, "LANDING_DATA"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((C73305Spp) _$_findCachedViewById(R.id.lv3)).LIZIZ(new C92175a6V(this));
        C8YN.LJIILLIIL(this, (AssemViewModel) this.LJLIL.getValue(), null, new IDqS445S0100000_31(this, 6), 3);
        ((BNPLEntryViewModel) this.LJLIL.getValue()).gv0();
    }

    public final void v3(String str, String str2) {
        String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("order_id", str2).appendQueryParameter("source", C91824a0q.LJFF).appendQueryParameter("previous_page_id", C91824a0q.LJFF).build().toString();
        o.LJIIIIZZ(uri, "uriBuilder.build().toString()");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C91657Zy9.LIZJ(LIZ, uri, true, true, false);
        }
    }
}
