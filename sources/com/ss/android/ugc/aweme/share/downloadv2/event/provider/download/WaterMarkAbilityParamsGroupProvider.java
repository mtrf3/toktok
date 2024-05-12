package com.ss.android.ugc.aweme.share.downloadv2.event.provider.download;

import X.C43238Gy2;
import X.C45348Hqy;
import X.C55247LmF;
import X.C62844OlU;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;

/* loaded from: classes11.dex */
public final class WaterMarkAbilityParamsGroupProvider implements BaseDownloadParamsGroupProvider<C43238Gy2> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62844OlU c62844OlU;
        String str;
        String str2;
        boolean z;
        Long l;
        long j;
        int i;
        String str3;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62844OlU.class, "Download");
        Long l2 = null;
        if (LIZLLL != null) {
            c62844OlU = (C62844OlU) LIZLLL.getSource();
        } else {
            c62844OlU = null;
        }
        if (c62844OlU == null || (str3 = c62844OlU.LJLIL) == null || (str = C45348Hqy.LIZ(str3)) == null) {
            str = "";
        }
        if (c62844OlU != null && c62844OlU.LJLJJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (c62844OlU != null) {
            z = c62844OlU.LJLJI;
        } else {
            z = false;
        }
        String LIZIZ = C45348Hqy.LIZIZ(z);
        if (c62844OlU != null) {
            l = Long.valueOf(c62844OlU.LJLJJL);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (c62844OlU != null) {
            l2 = Long.valueOf(c62844OlU.LJLJJLL);
        }
        String valueOf2 = String.valueOf(l2);
        long j2 = -1;
        if (c62844OlU != null) {
            j = c62844OlU.LJLJJLL;
            j2 = c62844OlU.LJLJJL;
        } else {
            j = -1;
        }
        int i2 = (int) (j - j2);
        if (c62844OlU != null) {
            i = c62844OlU.LJLJL;
        } else {
            i = 0;
        }
        return new C43238Gy2(str, str2, LIZIZ, valueOf, valueOf2, i2, i);
    }
}
