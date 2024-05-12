package com.ss.android.ugc.aweme.trending.ui.detailpage;

import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.KOK;
import X.MBK;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CommentAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214378bB LJLILLLLZI;

    public CommentAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, MBK.class, null), checkSupervisorPrepared());
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 342);
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingDetailOperatorWrapper.class);
        KOK kok = KOK.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS158S0100000_8((C8W0) this, 343);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, kok, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.KOL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C56386MBa) obj).LJLJL);
            }
        }, null, new AqS190S0100000_8(view.findViewById(R.id.aoo), 41), 6);
    }
}
