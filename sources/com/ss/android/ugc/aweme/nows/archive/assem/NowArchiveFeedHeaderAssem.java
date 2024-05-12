package com.ss.android.ugc.aweme.nows.archive.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveFeedHeaderAssem extends UIContentAssem {
    public NowArchiveFeedHeaderAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.h6h);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.n…lendar_header_close_icon)");
        C16880lQ.LJJJ((TuxIconView) findViewById, new ACListenerS23S0100000_3(LIZ, 97));
    }
}
