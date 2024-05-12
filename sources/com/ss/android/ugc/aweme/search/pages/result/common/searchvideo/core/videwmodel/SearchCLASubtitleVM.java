package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C33Q;
import X.C49104JOy;
import X.C8YE;
import X.EnumC48742JBa;
import X.JOV;
import X.JOZ;
import X.JQA;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCLASubtitleVM extends AssemViewModelWithItem<JOV, Aweme> implements C8YE<JOV, Aweme> {
    public static final /* synthetic */ int LJLJI = 0;
    public final JOZ LJLILLLLZI = new JOZ(this);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new JOV(0);
    }

    public final void iv0(EnumC48742JBa state) {
        o.LJIIIZ(state, "state");
        setState(new AqS174S0100000_8(state, 93));
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    public static void hv0(JQA jqa, Aweme aweme, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        C49104JOy c49104JOy = new C49104JOy();
        String str6 = null;
        if (jqa != null) {
            str2 = jqa.LJFF;
        } else {
            str2 = null;
        }
        c49104JOy.LJIJI(str2);
        if (jqa != null) {
            str3 = jqa.LIZJ;
        } else {
            str3 = null;
        }
        c49104JOy.LJIIZILJ("search_type", str3);
        if (jqa != null) {
            str4 = jqa.LJII;
        } else {
            str4 = null;
        }
        c49104JOy.LJIIZILJ("search_id", str4);
        if (aweme != null) {
            str5 = aweme.getAid();
        } else {
            str5 = null;
        }
        c49104JOy.LJIJ("search_result_id", str5);
        if (jqa != null) {
            str6 = jqa.LJ;
        }
        c49104JOy.LJIIZILJ("search_keyword", str6);
        c49104JOy.LJIJJLI(Boolean.FALSE);
        c49104JOy.LIZLLL("switch_states", str);
        c49104JOy.LJIILIIL();
    }

    @Override // X.C8YE
    public final JOV HU(JOV state, Aweme item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new JOV(0);
    }
}
