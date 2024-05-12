package com.ss.android.ugc.aweme.share.downloadv2.event.provider.other;

import X.C55247LmF;
import X.C62062c6;
import X.C62840OlQ;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;

/* loaded from: classes11.dex */
public final class UpvoteParamsGroupProvider implements BaseDownloadParamsGroupProvider<C62062c6> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62840OlQ.class, "Download");
        if (LIZLLL != null && (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) != null) {
            return new C62062c6(c62840OlQ.LJLJI, c62840OlQ.LJLILLLLZI);
        }
        return null;
    }
}
