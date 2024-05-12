package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.assem;

import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87983co;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.SYL;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoStickerNotificationUserListAssem extends UIListContentAssem<VideoStickerNotificationUserViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public VideoStickerNotificationUserListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 166));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerNotificationUserViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 167), C87983co.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel, com.bytedance.ext_power_list.AssemListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final VideoStickerNotificationUserViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((AssemSingleListViewModel) this.LJLILLLLZI.getValue()).manualListRefresh();
    }
}
