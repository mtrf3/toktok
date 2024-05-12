package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem;

import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.C9RX;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StickerSetDetailStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public StickerSetDetailStatusAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 369), C9RX.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 370));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 367));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9RW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87463by c87463by = (C87463by) obj;
                c87463by.getClass();
                return C208708Ha.LIZLLL(c87463by);
            }
        }, null, new AqS170S0100000_4(this, 393), new AqS154S0100000_4(this, 368), new AqS170S0100000_4(this, 394), 2, null);
    }
}
