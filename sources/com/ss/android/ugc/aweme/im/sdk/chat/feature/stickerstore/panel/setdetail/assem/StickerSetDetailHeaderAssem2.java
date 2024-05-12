package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem;

import X.AnonymousClass391;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C88023cs;
import X.C88103d0;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
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
public final class StickerSetDetailHeaderAssem2 extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C55749LuL LJLJJL;

    public StickerSetDetailHeaderAssem2() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 255), C88103d0.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 254));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 253));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 252));
        this.LJLJJL = new C55749LuL(C47704Ins.LIZJ(this, C88023cs.class, "sticker_set_detail_config"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (((C88023cs) this.LJLJJL.getValue()).LJLJJI) {
            C26338AVi.LJI(view, 0, AnonymousClass391.LIZJ(24), 0, 0, false, 16);
        } else {
            C26338AVi.LJI(view, 0, 0, 0, 0, false, 16);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3cy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C87463by) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 14), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3cz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87463by c87463by = (C87463by) obj;
                c87463by.getClass();
                return C208708Ha.LIZLLL(c87463by);
            }
        }, null, new AqS167S0100000_1(this, 102), new AqS151S0100000_1(this, 251), new AqS167S0100000_1(this, 103), 2, null);
    }
}
