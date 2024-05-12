package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.assem;

import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C42625Go9;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72082sG;
import X.C78926UyI;
import X.C87123bQ;
import X.C87763cS;
import X.C88033ct;
import X.C88963eO;
import X.C9BE;
import X.EnumC87003bE;
import X.InterfaceC65350Pko;
import X.O6R;
import X.QD3;
import X.SYL;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.StickerLoadingFooterCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class VideoStickerContentListAssem extends UIListContentAssem<VideoStickerContentViewModel> {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;

    public VideoStickerContentListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C88033ct.class, "sticker_store_video_sticker_content_config"), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 221));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerContentViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 222), C87763cS.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final VideoStickerContentViewModel A3() {
        return (AssemListViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = StickerLoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (C88963eO.LJFF()) {
            withState((AssemViewModel) this.LJLJI.getValue(), new AqS167S0100000_1(this, 93));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAddVideoSticker(C72082sG event) {
        o.LJIIIZ(event, "event");
        VideoSticker videoSticker = event.LJLIL;
        if (videoSticker != null) {
            VideoStickerContentViewModel videoStickerContentViewModel = (VideoStickerContentViewModel) this.LJLJI.getValue();
            Long originVideoId = videoSticker.getOriginVideoId();
            if (originVideoId != null) {
                videoStickerContentViewModel.LJLJI.add(String.valueOf(originVideoId.longValue()));
            }
            videoStickerContentViewModel.listAddItemAt(0, (int) new C87123bQ(videoSticker));
        }
        v3().LJLI(0);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!C88963eO.LJFF()) {
            ((AssemSingleListViewModel) this.LJLJI.getValue()).manualListRefresh();
        }
        C88033ct c88033ct = (C88033ct) this.LJLIL.getValue();
        if (c88033ct != null && c88033ct.LJLILLLLZI == EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType()) {
            v3().setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(57)));
        }
    }
}
