package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C33Q;
import X.C50322Jp0;
import X.C8YE;
import X.C95V;
import X.JN4;
import X.JOP;
import X.JOQ;
import X.JQA;
import X.KNV;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoSkipVM extends AssemViewModelWithItem<C95V, Aweme> implements C8YE<C95V, Aweme> {
    public boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C95V(0);
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    public static void hv0(JQA jqa, String str, boolean z) {
        JN4 jop;
        String str2;
        String str3;
        String str4;
        if (z) {
            jop = new JOQ();
        } else {
            jop = new JOP();
        }
        String str5 = null;
        if (jqa != null) {
            str2 = jqa.LJFF;
        } else {
            str2 = null;
        }
        jop.LJIJI(str2);
        if (jqa != null) {
            str3 = jqa.LJII;
        } else {
            str3 = null;
        }
        jop.LJIIZILJ("search_id", str3);
        if (jqa != null) {
            str4 = jqa.LJ;
        } else {
            str4 = null;
        }
        jop.LJIIZILJ("search_keyword", str4);
        if (jqa != null) {
            str5 = jqa.LJIL;
        }
        jop.LJIJJLI(Boolean.valueOf(Boolean.parseBoolean(str5)));
        jop.LJIIZILJ("group_id", str);
        jop.LJIILIIL();
    }

    public static void iv0(String str, String str2, boolean z) {
        JN4 jop;
        C50322Jp0 c50322Jp0 = (C50322Jp0) KNV.LIZ();
        if (z) {
            jop = new JOQ();
        } else {
            jop = new JOP();
        }
        jop.LJIJI(str2);
        jop.LJIIZILJ("search_id", c50322Jp0.LJLJI);
        jop.LJIIZILJ("search_keyword", c50322Jp0.LJLJJI);
        jop.LJIJJLI(Boolean.TRUE);
        jop.LJIIZILJ("group_id", str);
        jop.LJIILIIL();
    }

    @Override // X.C8YE
    public final C95V HU(C95V state, Aweme item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C95V(0);
    }
}
