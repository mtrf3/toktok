package com.ss.android.ugc.now.interaction.assem;

import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentBanedAssem extends UIContentAssem {
    public CommentBanedAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (a.LJ().LJ(3)) {
            getContainerView().setVisibility(0);
        } else {
            if (getContainerView().getVisibility() != 0) {
                return;
            }
            getContainerView().setVisibility(8);
        }
    }
}
