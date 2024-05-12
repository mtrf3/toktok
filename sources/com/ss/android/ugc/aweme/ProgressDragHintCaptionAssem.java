package com.ss.android.ugc.aweme;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.C9BF;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProgressDragHintCaptionAssem extends UIContentAssem {
    public final C214298b3 LJLIL;

    public ProgressDragHintCaptionAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProgressDragHintViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 34), C9BF.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.9BG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9BX) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4((TuxTextView) view.findViewById(R.id.b4k), 12), 6);
    }
}
