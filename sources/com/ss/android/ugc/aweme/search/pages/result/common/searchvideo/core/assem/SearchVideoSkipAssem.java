package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C214348b8;
import X.C32151Nz;
import X.C34474Dfy;
import X.C49095JOp;
import X.C49096JOq;
import X.C49097JOr;
import X.C49098JOs;
import X.C49099JOt;
import X.C49102JOw;
import X.C49105JOz;
import X.C5H3;
import X.C65352Pkq;
import X.C79043V0l;
import X.C7MY;
import X.C8XO;
import X.C8YN;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoSkipAssem extends ReusedUIContentAssem<SearchVideoSkipAssem> implements C8XO<C49105JOz> {
    public final C5H3 LJZL;
    public final C5H3 LL;
    public Aweme LLD;
    public TuxTextView LLF;
    public View LLFF;
    public boolean LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchVideoSkipAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoHolderVM.class), C49095JOp.INSTANCE);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoSkipVM.class), C49102JOw.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C49105JOz c49105JOz) {
        C49105JOz item = c49105JOz;
        o.LJIIIZ(item, "item");
        this.LLD = item.LJLIL;
        this.LLFFF = false;
    }

    @Override // X.C8XO
    public final boolean c2(C49105JOz c49105JOz) {
        C49105JOz item = c49105JOz;
        o.LJIIIZ(item, "item");
        return C49099JOt.LIZ(item.LJLIL, ((SearchVideoHolderVM) this.LJZL.getValue()).LJLILLLLZI);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        this.LLF = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.k2j, "view.findViewById(R.id.skip_button_desc)");
        View findViewById = view.findViewById(R.id.n82);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.video_skip_view)");
        this.LLFF = findViewById;
        C49098JOs.LIZ.getClass();
        C34474Dfy.LIZ.getClass();
        boolean z = false;
        if (C34474Dfy.LIZ() == 2) {
            i = 6;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() > 0) {
            z = true;
        }
        if (z) {
            float LJIIZILJ = C32151Nz.LJIIZILJ(valueOf);
            View view2 = this.LLFF;
            if (view2 != null) {
                C79043V0l.LJIJI(view2, LJIIZILJ, LJIIZILJ, LJIIZILJ, LJIIZILJ);
            } else {
                o.LJIJI("videoSkipView");
                throw null;
            }
        }
        TuxTextView tuxTextView = this.LLF;
        if (tuxTextView != null) {
            tuxTextView.setMinTextSize(10.0f);
            C8YN.LJII(this, (AssemViewModel) this.LJZL.getValue(), new TBT() { // from class: X.JOn
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C49052JMy) obj).LJLILLLLZI;
                }
            }, null, C49096JOq.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LJZL.getValue(), new TBT() { // from class: X.JOo
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C49052JMy) obj).LJLIL;
                }
            }, null, C49097JOr.LJLIL, 6);
            return;
        }
        o.LJIJI("descText");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49105JOz c49105JOz) {
    }
}
