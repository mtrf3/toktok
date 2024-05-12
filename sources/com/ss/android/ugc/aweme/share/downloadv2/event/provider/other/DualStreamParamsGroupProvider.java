package com.ss.android.ugc.aweme.share.downloadv2.event.provider.other;

import X.C55247LmF;
import X.C62840OlQ;
import X.C7GD;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;

/* loaded from: classes11.dex */
public final class DualStreamParamsGroupProvider implements BaseDownloadParamsGroupProvider<C7GD> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62840OlQ.class, "Download");
        if (LIZLLL != null && (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) != null) {
            return new C7GD(c62840OlQ.LJLILLLLZI);
        }
        return null;
    }
}
