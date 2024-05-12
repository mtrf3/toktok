package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C47704Ins;
import X.C48991JKp;
import X.C48997JKv;
import X.C55749LuL;
import X.C72434Sbm;
import X.C76800UCe;
import X.EnumC48990JKo;
import X.InterfaceC88472Yns;
import X.JKY;
import X.JL0;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBuiltInBottomAssem extends SearchCardBottomBarAssem {
    public final C55749LuL LLIIIZ;
    public final C55749LuL LLIIJI;

    public SearchBuiltInBottomAssem() {
        new LinkedHashMap();
        this.LLIIIZ = new C55749LuL(C47704Ins.LIZJ(this, C48997JKv.class, null), checkSupervisorPrepared());
        this.LLIIJI = new C55749LuL(C47704Ins.LJ(this, JL0.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final JKY n4() {
        return ((C48997JKv) this.LLIIIZ.getValue()).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        JL0 jl0 = (JL0) this.LLIIJI.getValue();
        if (jl0 != null && (interfaceC88472Yns = jl0.LJLIL) != null) {
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView != null) {
                C48991JKp.LIZ(tuxTextView, EnumC48990JKo.DESC, interfaceC88472Yns);
            }
            C72434Sbm c72434Sbm = this.LLI;
            if (c72434Sbm != null) {
                C48991JKp.LIZ(c72434Sbm, EnumC48990JKo.AUTHOR_AVATAR, interfaceC88472Yns);
            }
            TuxTextView tuxTextView2 = this.LLFZ;
            if (tuxTextView2 != null) {
                C48991JKp.LIZ(tuxTextView2, EnumC48990JKo.AUTHOR_NAME, interfaceC88472Yns);
            }
            TuxTextView tuxTextView3 = this.LLII;
            if (tuxTextView3 != null) {
                C48991JKp.LIZ(tuxTextView3, EnumC48990JKo.LIKE, interfaceC88472Yns);
            }
        }
    }
}
