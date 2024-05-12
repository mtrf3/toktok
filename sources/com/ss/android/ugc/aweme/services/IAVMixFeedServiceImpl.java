package com.ss.android.ugc.aweme.services;

import X.C2IX;
import X.C2U8;
import X.C58096Mr6;
import X.G5D;
import X.InterfaceC40960G5s;
import X.InterfaceC62865Olp;
import X.XWV;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAVMixFeedServiceImpl implements IAVMixFeedService {
    public final IMixFeedService mixFeedService = MixFeedService.LJJIJIIJIL();

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public boolean needCreateFirstMix() {
        return this.mixFeedService.needCreateFirstMix();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public boolean needShowAddOrRemoveButton() {
        return this.mixFeedService.needShowAddOrRemoveButton();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public void updateFeedEvent() {
        C2U8.LIZ(new C2IX(null, null, false));
    }

    public static IAVMixFeedService createIAVMixFeedServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IAVMixFeedService.class, z);
        if (LIZ != null) {
            return (IAVMixFeedService) LIZ;
        }
        if (C58096Mr6.K5 == null) {
            synchronized (IAVMixFeedService.class) {
                if (C58096Mr6.K5 == null) {
                    C58096Mr6.K5 = new IAVMixFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.K5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl$showAddToMixInPublishPage$1] */
    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public void showAddToMixInPublishPage(Activity activity, final InterfaceC40960G5s result, String enterFrom, String enterMethod, String mixId, String mixName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(result, "result");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(mixName, "mixName");
        this.mixFeedService.LJIILL(activity, new InterfaceC62865Olp() { // from class: com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl$showAddToMixInPublishPage$1
            @Override // X.InterfaceC62865Olp
            public void chooseMixResult(String str, String str2) {
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((XWV) InterfaceC40960G5s.this).LJLIL;
                if (videoPublishContainerScene.LLILZLL == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    videoPublishContainerScene.LJZI._nameText.setValue(str2);
                    VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                    G5D g5d = videoPublishEditModel.creativeModel.transientPostPageModel;
                    g5d.LJJJJI = str2;
                    g5d.LJJJIL = str;
                    videoPublishEditModel.playlist_id = str;
                    videoPublishEditModel.playlist_name = str2;
                    return;
                }
                if (Boolean.valueOf(SplitVideoServiceImpl.LIZ().showPlayList()).booleanValue() && !TextUtils.isEmpty(str2)) {
                    videoPublishContainerScene.LJZI._nameText.setValue(str2);
                    G5D g5d2 = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                    if (str2.equals(videoPublishContainerScene.getString(R.string.jtb))) {
                        str2 = "playlist_default_name";
                    }
                    g5d2.LJJJJI = str2;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
                    G5D g5d3 = videoPublishEditModel2.creativeModel.transientPostPageModel;
                    g5d3.LJJJIL = "";
                    videoPublishEditModel2.playlist_id = "";
                    videoPublishEditModel2.playlist_name = g5d3.LJJJJI;
                    return;
                }
                videoPublishContainerScene.LJZI._nameText.setValue("");
                VideoPublishEditModel videoPublishEditModel3 = videoPublishContainerScene.LLILZLL;
                G5D g5d4 = videoPublishEditModel3.creativeModel.transientPostPageModel;
                g5d4.LJJJIL = "";
                g5d4.LJJJJI = "";
                videoPublishEditModel3.playlist_id = "";
                videoPublishEditModel3.playlist_name = "";
            }
        }, enterFrom, enterMethod, mixId, mixName);
    }
}
