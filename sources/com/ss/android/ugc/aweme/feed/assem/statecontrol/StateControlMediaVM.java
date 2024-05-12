package com.ss.android.ugc.aweme.feed.assem.statecontrol;

import X.C242529fU;
import X.C33Q;
import X.C42523GmV;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StateControlMediaVM extends FeedBaseViewModel<C242529fU> {
    public static final /* synthetic */ int LJLJLLL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C242529fU(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C242529fU iv0(C242529fU state, VideoItemParams item) {
        String str;
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ScmLabelInfo scmLabelInfo;
        String learnMoreUrl;
        AVUploadMiscInfoStruct uploadMiscInfoStruct2;
        ScmLabelInfo scmLabelInfo2;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        boolean LIZ = C42523GmV.LIZ(item);
        Aweme aweme = item.getAweme();
        String str2 = "";
        if (aweme == null || (uploadMiscInfoStruct2 = aweme.getUploadMiscInfoStruct()) == null || (scmLabelInfo2 = uploadMiscInfoStruct2.scmLabelInfo) == null || (str = scmLabelInfo2.getContent()) == null) {
            str = "";
        }
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && (uploadMiscInfoStruct = aweme2.getUploadMiscInfoStruct()) != null && (scmLabelInfo = uploadMiscInfoStruct.scmLabelInfo) != null && (learnMoreUrl = scmLabelInfo.getLearnMoreUrl()) != null) {
            str2 = learnMoreUrl;
        }
        return new C242529fU(LIZ, str, str2);
    }
}
