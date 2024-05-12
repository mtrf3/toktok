package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.assem;

import X.C111084Xo;
import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SYL;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;

/* loaded from: classes2.dex */
public final class VideoSelectionListAssem extends UIListContentAssem<VideoSelectionViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public VideoSelectionListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 278));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoSelectionViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 279), C111084Xo.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final VideoSelectionViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }
}
