package com.ss.android.ugc.aweme.feed.assem.report;

import X.C188727au;
import X.C201727vs;
import X.C220858ld;
import X.C33Q;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.FMX;
import android.content.Context;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReportVideoMaskVM extends FeedBaseViewModel<C201727vs> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C201727vs(0);
    }

    public final void kv0() {
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            setState(new AqS134S0200000_3(this, gv0, 85));
        }
    }

    public final void mv0(String str) {
        String str2;
        Aweme aweme;
        Aweme aweme2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        VideoItemParams gv0 = gv0();
        String str3 = null;
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme = gv02.getAweme()) != null) {
            str3 = aweme.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void nv0(C201727vs state, VideoItemParams item) {
        VideoMaskInfo videoMaskInfo;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        if (!o.LJ(videoMaskInfo, state.LJLILLLLZI)) {
            Aweme aweme2 = item.getAweme();
            if (aweme2 != null) {
                aweme2.setReportMaskInfo(state.LJLILLLLZI);
            }
            AwemeService.LIZ().R1(item.getAweme());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.C8YE
    public final /* bridge */ /* synthetic */ Object b50(C33Q c33q, Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        nv0((C201727vs) c33q, videoItemParams);
        return videoItemParams;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C201727vs iv0(C201727vs state, VideoItemParams item) {
        VideoMaskInfo videoMaskInfo;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        return new C201727vs(C220858ld.LJIIJJI(item.getAweme()), videoMaskInfo);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* bridge */ /* synthetic */ VideoItemParams jv0(C201727vs c201727vs, VideoItemParams videoItemParams) {
        nv0(c201727vs, videoItemParams);
        return videoItemParams;
    }

    public final void lv0(Context context, String str) {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        AwemeRawAd awemeRawAd = null;
        if (gv0 != null) {
            aweme = gv0.getAweme();
            if (aweme != null && !aweme.isAd()) {
                return;
            }
        } else {
            aweme = null;
        }
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "background_ad";
        LIZ.LIZIZ = str;
        LIZ.LJIIIIZZ("report_mask");
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(context);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", str, awemeRawAd);
        LIZLLL.LIZJ("report_mask", "refer");
        LIZLLL.LJII();
    }
}
