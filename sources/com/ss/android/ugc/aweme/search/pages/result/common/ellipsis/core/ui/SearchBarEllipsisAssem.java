package com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui;

import X.ASL;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1B3;
import X.C214298b3;
import X.C26007AIp;
import X.C45804HyK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BD;
import X.SYL;
import X.ViewOnClickListenerC26008AIq;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS280S0100000_4;
import Y.IDDListenerS144S0100000_4;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchBarEllipsisAssem extends UIContentAssem {
    public View LJLIL;
    public SYL LJLILLLLZI;
    public final C214298b3 LJLJI;
    public boolean LJLJJI;

    public SearchBarEllipsisAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchEllipsisVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 784), C26007AIp.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View inflate = View.inflate(getContext(), R.layout.cf0, null);
        o.LJIIIIZZ(inflate, "inflate(\n            con…          null,\n        )");
        this.LJLIL = inflate;
        C16880lQ.LJIIJ(ViewOnClickListenerC26008AIq.LJLIL, inflate);
        View view2 = this.LJLIL;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.i04);
            o.LJIIIIZZ(findViewById, "sheetView.findViewById(R.id.power_list)");
            SYL syl = (SYL) findViewById;
            this.LJLILLLLZI = syl;
            syl.LLLF.LJZL(SearchEllipsisSwitchCell.class);
            syl.LLLF.LJZL(SearchEllipsisTextCell.class);
            ASL asl = new ASL();
            View view3 = this.LJLIL;
            if (view3 != null) {
                asl.LIZ(view3);
                asl.LIZ.LJLLL = null;
                asl.LJI(0);
                IDCListenerS280S0100000_4 iDCListenerS280S0100000_4 = new IDCListenerS280S0100000_4(this, 0);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLIL = iDCListenerS280S0100000_4;
                tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(this, 0);
                C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, tuxSheet, 32), view);
                return;
            }
            o.LJIJI("sheetView");
            throw null;
        }
        o.LJIJI("sheetView");
        throw null;
    }

    public final void v3(Lifecycle.State state) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("container")) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJIFFI(LJJJIL, state);
            c1b3.LJI();
        }
    }
}
