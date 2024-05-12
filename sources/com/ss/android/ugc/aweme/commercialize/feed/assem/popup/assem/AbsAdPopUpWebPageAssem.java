package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem;

import X.C214348b8;
import X.C3C8;
import X.C5H3;
import X.C65352Pkq;
import X.C8XO;
import X.NWF;
import X.NY2;
import X.NY3;
import X.NY4;
import X.NY5;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdEventViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class AbsAdPopUpWebPageAssem<RECEIVER extends C3C8> extends ReusedUIContentAssem<RECEIVER> implements C8XO<VideoItemParams> {
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public NWF LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AbsAdPopUpWebPageAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), NY2.INSTANCE);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), NY3.INSTANCE);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), NY4.INSTANCE);
        this.LLF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdEventViewModel.class), NY5.INSTANCE);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}
