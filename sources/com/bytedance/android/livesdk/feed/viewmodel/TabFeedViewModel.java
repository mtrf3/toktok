package com.bytedance.android.livesdk.feed.viewmodel;

import X.BM8;
import X.BMD;
import X.BMM;
import X.BMN;
import X.BOX;
import X.C0ON;
import X.C28594BKc;
import X.C38354F3m;
import X.C39301gU;
import X.CN1;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.other.LiveSquareInboxRefreshIntervalSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import defpackage.a1;
import defpackage.i0;

/* loaded from: classes6.dex */
public class TabFeedViewModel extends BaseFeedDataViewModel {
    public final long LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public BM8 LLIIII;
    public C39301gU LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public long LLIIJI;

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final void kv0() {
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final FeedDataKey iv0() {
        if (TextUtils.isEmpty(this.LLFFF) && BOX.LJFF().LIZLLL(this.LLI) != null) {
            this.LLFFF = BOX.LJFF().LIZLLL(this.LLI).getEvent();
        }
        if (TextUtils.isEmpty(this.LLFFF)) {
            this.LLFFF = "video";
        }
        return FeedDataKey.LIZ(this.LLI, this.LLFFF, jv0());
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final String jv0() {
        if (C38354F3m.LJ(this.LLD) && BOX.LJFF().LIZLLL(this.LLI) != null) {
            String url = BOX.LJFF().LIZLLL(this.LLI).getUrl();
            if (C28594BKc.LIZJ() != null) {
                if (C38354F3m.LIZJ("referral_task", C28594BKc.LIZJ().LIZ())) {
                    url = ov0(url, LiveFeedDraw.getChannelId("referral_task", "H5"));
                }
                url = ov0(url, "96");
            }
            return lv0(url);
        }
        String lv0 = lv0(this.LLD);
        this.LLD = lv0;
        return lv0;
    }

    public final void nv0() {
        if (this.LLIIIZ) {
            return;
        }
        super.start();
        this.LLIIIZ = true;
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.RxViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLZ.yo().LIZJ(this.LLIIII);
        this.LJLZ.yo().LJI(this.LLIIIILZ);
        this.LLIIII = null;
        super.onCleared();
    }

    public final void pv0() {
        if (this.LLIIJI == -1) {
            this.LLIIJI = SystemClock.elapsedRealtime();
        } else if (SystemClock.elapsedRealtime() - this.LLIIJI > LiveSquareInboxRefreshIntervalSetting.INSTANCE.getValue() * 1000) {
            this.LJLZ.pV();
            this.LLIIJI = SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.BM8] */
    public final void qv0() {
        if (this.LLIIII != null) {
            return;
        }
        this.LLIIII = new BMD() { // from class: X.BM8
            /* JADX WARN: Removed duplicated region for block: B:103:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
            @Override // X.BMD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r16, java.util.List r17, com.bytedance.android.live.base.model.feed.FeedExtra r18, boolean r19) {
                /*
                    Method dump skipped, instructions count: 430
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.BM8.LIZ(java.lang.String, java.util.List, com.bytedance.android.live.base.model.feed.FeedExtra, boolean):void");
            }
        };
        this.LLIIIILZ = new C39301gU(this);
        this.LJLZ.yo().LJII(this.LLIIII);
        this.LJLZ.yo().LIZLLL(this.LLIIIILZ);
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final void start() {
        if (!this.LLIIIL) {
            return;
        }
        nv0();
    }

    public final String lv0(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("/webcast/feed/")) {
            if ((((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) && !str.contains("&debug=true")) {
                return i0.LJFF(str, "&debug=true");
            }
            return str;
        }
        return str;
    }

    public final void mv0(boolean z) {
        BMM bmm;
        this.LLIIIL = z;
        if (!z) {
            if (this.LLIIIZ && (bmm = this.LJLZ) != null) {
                bmm.L70();
            }
        } else {
            pv0();
        }
        start();
    }

    public static String ov0(String str, String str2) {
        if (!C38354F3m.LJ(str) && !C38354F3m.LJ(str2)) {
            return str.replaceAll(a1.LJ("&", "channel_id", "=[^&]*"), C0ON.LIZJ("&", "channel_id", "=", str2));
        }
        return str;
    }

    public TabFeedViewModel(BMM bmm, BMN bmn, long j) {
        super(bmm, bmn);
        this.LLIIJI = -1L;
        this.LLI = j;
    }
}
