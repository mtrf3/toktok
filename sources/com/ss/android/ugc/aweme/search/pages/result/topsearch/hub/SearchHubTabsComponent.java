package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub;

import X.AbstractC030309z;
import X.C214298b3;
import X.C50248Jno;
import X.C50251Jnr;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC65350Pko;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHubTabsComponent extends UISlotAssem {
    public final C214298b3 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cge;
    }

    public SearchHubTabsComponent() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchHubHeaderVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 311), C50251Jnr.INSTANCE, null);
    }

    public final SearchHubHeaderVM H3() {
        return (SearchHubHeaderVM) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        final RecyclerView recyclerView = (RecyclerView) x3().findViewById(R.id.isu);
        recyclerView.setItemAnimator(null);
        recyclerView.LJII(new AbstractC030309z() { // from class: X.4TX
            public final int LJLIL = C7MY.LIZIZ(8);

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                if (LIZJ == -1) {
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                o.LJIIIIZZ(recyclerView3, "recyclerView");
                if (!C26338AVi.LIZLLL(recyclerView3)) {
                    if (LIZJ != 0) {
                        rect.left = this.LJLIL;
                    }
                } else {
                    if (LIZJ == 0) {
                        return;
                    }
                    rect.right = this.LJLIL;
                }
            }
        }, -1);
        x3().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(new C50248Jno(recyclerView, this));
    }
}
