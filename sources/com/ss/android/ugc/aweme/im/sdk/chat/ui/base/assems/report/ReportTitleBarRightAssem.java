package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report;

import X.C1046148r;
import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* loaded from: classes2.dex */
public final class ReportTitleBarRightAssem extends UISlotAssem {
    public TuxTextView LJLJLLL;
    public final C214298b3 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8x;
    }

    public ReportTitleBarRightAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatReportPageViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 433), C1046148r.INSTANCE, null);
    }

    public final void H3(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LJLJLLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.eb);
                TuxTextView tuxTextView2 = this.LJLJLLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setEnabled(true);
                    return;
                } else {
                    o.LJIJI("tv");
                    throw null;
                }
            }
            o.LJIJI("tv");
            throw null;
        }
        TuxTextView tuxTextView3 = this.LJLJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColorRes(R.attr.gp);
            TuxTextView tuxTextView4 = this.LJLJLLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setEnabled(true);
                return;
            } else {
                o.LJIJI("tv");
                throw null;
            }
        }
        o.LJIJI("tv");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.l__);
        TuxTextView onViewCreated$lambda$0 = (TuxTextView) findViewById;
        o.LJIIIIZZ(onViewCreated$lambda$0, "onViewCreated$lambda$0");
        onViewCreated$lambda$0.setVisibility(0);
        onViewCreated$lambda$0.setText(R.string.h7k);
        C16880lQ.LJJJJI(onViewCreated$lambda$0, new ACListenerS21S0100000_1(this, 80));
        h0.LJIJI(onViewCreated$lambda$0, new IDaS88S0000000_1(1));
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxTex…\n            })\n        }");
        this.LJLJLLL = (TuxTextView) findViewById;
        H3(!((ChatReportPageViewModel) this.LJLL.getValue()).gv0().isEmpty());
        C8YN.LJII(this, (AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.48q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C1045448k) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 30), 6);
    }
}
