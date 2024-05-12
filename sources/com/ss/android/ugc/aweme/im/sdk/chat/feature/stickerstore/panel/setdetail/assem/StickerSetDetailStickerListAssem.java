package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem;

import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87653cH;
import X.C88023cs;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailStickerListAssem extends UIListContentAssem<StickerSetDetailViewModel> {
    public final C55749LuL LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C214298b3 LJLJJI;

    public StickerSetDetailStickerListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C88023cs.class, "sticker_set_detail_config"), checkSupervisorPrepared());
        this.LJLILLLLZI = true;
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 256));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 257), C87653cH.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final StickerSetDetailViewModel A3() {
        return (AssemListViewModel) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.3c7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87463by c87463by = (C87463by) obj;
                c87463by.getClass();
                return C208708Ha.LIZLLL(c87463by);
            }
        }, null, null, null, new AqS167S0100000_1(this, 104), 14, null);
    }
}
