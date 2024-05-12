package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87643cG;
import X.C88023cs;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailAuthorAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public StickerSetDetailAuthorAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 239), C87643cG.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C88023cs.class, "sticker_set_detail_config"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 237));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 236));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3cD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87463by c87463by = (C87463by) obj;
                c87463by.getClass();
                return C208708Ha.LIZLLL(c87463by);
            }
        }, null, new AqS167S0100000_1(this, 95), new AqS151S0100000_1(this, 238), new AqS167S0100000_1(this, 96), 2, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3cF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C87463by) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 11), 6);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 58), getContainerView());
    }
}
