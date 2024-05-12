package com.ss.android.ugc.aweme.feed.assem.review;

import X.C198517qh;
import X.C1DD;
import X.C220858ld;
import X.C33Q;
import X.C43282Gyk;
import X.C47261Igj;
import X.C79045V0n;
import X.C80S;
import X.C84763XOl;
import X.C8HX;
import X.C8ML;
import X.EF7;
import X.MEX;
import X.X1D;
import android.app.Activity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoReviewStatusVM extends FeedBaseViewModel<C43282Gyk> {
    public static final List<Integer> LJLJLLL = C47261Igj.LJJIJIL(1, 2);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C43282Gyk(0);
    }

    public static String kv0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LIZIZ().getString(R.string.e08));
        LIZ.append('\n');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C43282Gyk iv0(C43282Gyk c43282Gyk, VideoItemParams item) {
        CharSequence title;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        String str;
        AwemeStatus status2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        AwemeStatus status3;
        String string;
        String reviewDetailUrl;
        C43282Gyk state = c43282Gyk;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        String str2 = null;
        String str3 = "";
        if (C8ML.LIZIZ(item)) {
            String videoDetailNoticeBottom = item.getAweme().getVideoDetailNoticeBottom();
            if (TextUtils.isEmpty(videoDetailNoticeBottom)) {
                VideoItemParams gv0 = gv0();
                if (gv0 != null) {
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("type", "video_detail_notice_bottom");
                    c198517qh.LIZ.put("log_id", gv0.getAweme().getRequestId());
                    c198517qh.LIZ.put("item_id", gv0.getAweme().getAid());
                    C8HX.LIZIZ("notice_content_empty", "", c198517qh.LJ());
                }
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null || (videoDetailNoticeBottom = LJIIIIZZ.getString(R.string.tmg)) == null) {
                    videoDetailNoticeBottom = "";
                }
            } else {
                o.LJIIIIZZ(videoDetailNoticeBottom, "videoDetailNoticeBottom");
            }
            Aweme aweme = item.getAweme();
            if (aweme != null && (reviewDetailUrl = aweme.getReviewDetailUrl()) != null) {
                str3 = reviewDetailUrl;
            }
            return C43282Gyk.LIZ(state, 1, R.attr.gz, R.raw.icon_exclamation_mark_circle_fill, videoDetailNoticeBottom, str3, new IDqS426S0100000_1(this, 9), 32);
        }
        if (!C220858ld.LJII(item.getAweme())) {
            return state;
        }
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && (status3 = aweme2.getStatus()) != null && status3.getMusicEditStatus() == 2) {
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ2 != null && (string = LJIIIIZZ2.getString(R.string.q3c)) != null) {
                str3 = string;
            }
            return C43282Gyk.LIZ(state, 2, R.attr.d7, 0, str3, null, null, 116);
        }
        Aweme aweme3 = item.getAweme();
        if (aweme3 == null || (status2 = aweme3.getStatus()) == null || (videoMuteInfo2 = status2.getVideoMuteInfo()) == null || (title = videoMuteInfo2.getMuteDetailNotice()) == null) {
            title = "";
        }
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LJFF() && C220858ld.LJI(item.getAweme())) {
            User author = item.getAweme().getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str, curUserId)) {
                if (C80S.LIZ(item.getAweme())) {
                    title = kv0();
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kv0());
                    SpannableString spannableString = new SpannableString(C1DD.LIZLLL(R.string.e07, "AppContextManager.getApp…ilePage_removedSound_cta)"));
                    Integer LJI = C79045V0n.LJI(R.attr.e2, EF7.LIZIZ());
                    if (LJI != null) {
                        spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), 0, spannableString.length(), 33);
                    }
                    title = spannableStringBuilder.append((CharSequence) spannableString);
                    o.LJIIIIZZ(title, "builder.append(ctaColorSpan)");
                }
            }
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        if (e1.LIZ(31744, "show_detailed_reason_for_muted_video_consumption", true, false) && C220858ld.LJI(item.getAweme())) {
            User author2 = item.getAweme().getAuthor();
            if (author2 != null) {
                str2 = author2.getUid();
            }
            if (!o.LJ(str2, curUserId)) {
                title = kv0();
            }
        }
        Aweme aweme4 = item.getAweme();
        if (aweme4 != null && (status = aweme4.getStatus()) != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) != null) {
            str3 = muteDetailUrl;
        }
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 232);
        IDqS432S0100000_7 iDqS432S0100000_7 = new IDqS432S0100000_7(this, 7);
        o.LJIIIZ(title, "title");
        return new C43282Gyk(2, R.attr.d7, R.raw.icon_speaker_x_mark_fill_ltr, title, str3, aqS167S0100000_1, iDqS432S0100000_7);
    }
}
