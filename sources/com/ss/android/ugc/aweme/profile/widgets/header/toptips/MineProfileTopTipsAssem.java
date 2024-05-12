package com.ss.android.ugc.aweme.profile.widgets.header.toptips;

import X.C237259Sv;
import X.HG3;
import X.RBX;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MineProfileTopTipsAssem extends UIContentAssem {
    public View LJLIL;

    public MineProfileTopTipsAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        v3(getContainerView());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        v3(view);
    }

    public final void v3(View view) {
        ViewStub viewStub;
        if (((RBX) HG3.LJIILL()).getCurUser().isAccuratePrivateAccount()) {
            if (this.LJLIL == null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (view != null && (viewStub = (ViewStub) view.findViewById(R.id.i_c)) != null) {
                    this.LJLIL = viewStub.inflate();
                }
                C237259Sv.LJIIL(System.currentTimeMillis() - currentTimeMillis, "top_tips");
            }
            View view2 = this.LJLIL;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            }
            return;
        }
        View view3 = this.LJLIL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }
}
