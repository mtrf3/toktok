package com.ss.android.ugc.aweme.share.downloadv2.event.provider.download;

import X.C193667is;
import X.C55247LmF;
import X.C62814Ol0;
import X.C62840OlQ;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadGlobalParamsGroupProvider implements BaseDownloadParamsGroupProvider<C193667is> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        String repostFromGroupId;
        String str;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62840OlQ.class, "Download");
        if (LIZLLL == null || (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) == null) {
            return null;
        }
        Aweme aweme = c62840OlQ.LJLILLLLZI;
        if (aweme.getRepostFromGroupId() != null || aweme.getRepostFromUserId() != null) {
            repostFromGroupId = aweme.getRepostFromGroupId();
        } else {
            repostFromGroupId = aweme.getAid();
        }
        o.LJIIIIZZ(repostFromGroupId, "if (aweme.repostFromGrou…romGroupId else aweme.aid");
        int awemeType = aweme.getAwemeType();
        String str2 = c62840OlQ.LJLJI;
        String str3 = c62840OlQ.LJLJJI;
        if (C62814Ol0.LJIL(aweme)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        return new C193667is(awemeType, repostFromGroupId, str2, str3, str, c62840OlQ.LJLJJL, c62840OlQ.LJLJL);
    }
}
