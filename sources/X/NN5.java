package X;

import Y.ACallableS4S2000000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.feed.slide.ProfileAdWebModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.FeedLandPageClickUploadExp;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.helper.FeedSharePlayInfoHelperProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NN5 implements NT3 {
    public static boolean LIZJ;
    public Aweme LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(NN7.LJLIL);

    @Override // X.NT3
    public final void LJIILIIL(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
    }

    public final NIW LJJJZ() {
        return (NIW) this.LIZIZ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r0.isDisableLeftSlideFollow() == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        X.NN1.LJJIJIIJI(r7, r3);
        X.NN1.LJJIII(r7, r3, "slide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (X.NO5.LJIIJ(40, r7, r3, null) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0107, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r0)) == false) goto L51;
     */
    @Override // X.NT3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN5.LJJIIZ(android.content.Context):void");
    }

    public static void LJJLI(C58655N0h c58655N0h, Aweme aweme) {
        int i;
        List<PhotoModeImageUrlModel> imageList;
        String str;
        List<PhotoModeImageUrlModel> imageList2;
        if (C63081OpJ.LJZL(aweme)) {
            int i2 = NNB.LJFF;
            c58655N0h.LIZIZ(Integer.valueOf(i2 + 1), "image_location");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null) {
                i = imageList2.size();
            } else {
                i = 0;
            }
            c58655N0h.LIZIZ(Integer.valueOf(i), "image_cnt");
            c58655N0h.LIZIZ(NNB.LJI, "enter_method");
            c58655N0h.LIZIZ(Long.valueOf(System.currentTimeMillis() - NNB.LJII), "first_slide_duration");
            c58655N0h.LIZIZ(NNB.LIZIZ(i2), "image_show_count");
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && i2 >= 0 && i2 < imageList.size()) {
                UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i2)).getDisplayImageNoWatermark();
                if (displayImageNoWatermark != null) {
                    str = displayImageNoWatermark.getUri();
                } else {
                    str = null;
                }
                c58655N0h.LIZIZ(str, "image_id");
            }
        }
    }

    @Override // X.NT3
    public final void LJIIZILJ(Aweme aweme, Context context) {
        String str;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if (IEW.LJFF) {
            IEW.LJ = true;
        }
        if (!C63081OpJ.LJLJJL(aweme)) {
            if (C63081OpJ.LJLIL(aweme)) {
                str = "video";
            } else {
                str = "";
            }
            NN1.LJJIJIIJIL(context, aweme, str);
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getProfileWithWebview() == 1) {
                NN1.LJJIII(context, aweme, "slide");
                return;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            C58655N0h LJJJJ = C63081OpJ.LJJJJ("draw_ad", aweme, "otherclick");
            if (LJJJJ != null) {
                LIZLLL = LJJJJ;
            }
            LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL.LIZJ("slide", "refer");
            LJJLI(LIZLLL, aweme);
            LIZLLL.LJI();
            return;
        }
        if (C63081OpJ.LJJ(aweme)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && C78977Uz7.LJJLIIIJJIZ(awemeRawAd2)) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && C78977Uz7.LJJJJL(awemeRawAd3)) {
                    NN1.LJJIJIIJI(context, aweme);
                    FeedLandPageClickUploadExp.logFeedRawAdClick(context, aweme, "slide");
                    return;
                } else {
                    C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                    LIZLLL2.LIZJ("slide", "refer");
                    LJJLI(LIZLLL2, aweme);
                    LIZLLL2.LJI();
                    return;
                }
            }
            C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            LIZLLL3.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL3.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL3.LIZJ("slide", "refer");
            LJJLI(LIZLLL3, aweme);
            LIZLLL3.LJI();
            return;
        }
        if (C63081OpJ.LJLILLLLZI(aweme)) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null && awemeRawAd4.allowJumpToPlayStore()) {
                NN1.LJJIJIIJI(context, aweme);
                NN1.LJJIII(context, aweme, "slide");
                return;
            } else {
                NN1.LJJIJIIJI(context, aweme);
                return;
            }
        }
        if (C63081OpJ.LJJJZ(aweme)) {
            if (NNA.LIZ(context, aweme)) {
                java.util.Map<Aweme, String> map = NNA.LIZ;
                if (map.containsKey(aweme)) {
                    return;
                } else {
                    map.put(aweme, "STATUS_ON_PAGE_SELECTED");
                }
            }
            NN1.LJJIJIIJI(context, aweme);
            FeedLandPageClickUploadExp.logFeedRawAdClick(context, aweme, "slide");
            return;
        }
        C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        LIZLLL4.LIZJ("slide", "refer");
        LIZLLL4.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
        LIZLLL4.LIZIZ(C59406NTe.LJI(aweme), "room_id");
        LJJLI(LIZLLL4, aweme);
        LIZLLL4.LJI();
    }

    @Override // X.NT3
    public final void LJJIII(Context context, Aweme aweme) {
        String str;
        HashMap hashMap;
        AwemeRawAd awemeRawAd;
        Integer num;
        User author;
        AwemeRawAd LJJJJI;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        User author2;
        o.LJIIIZ(context, "context");
        Integer num2 = null;
        if (TextUtils.isEmpty(null)) {
            str = "photo";
        } else {
            str = null;
        }
        JHI.LIZ().LJIIIIZZ = 64;
        if (C59251NNf.LIZIZ(3, aweme)) {
            C59252NNg.LJIILJJIL(C59251NNf.LIZJ(aweme));
        }
        if (!C63081OpJ.LJLJJL(aweme)) {
            if (C63081OpJ.LLIIIILZ(aweme)) {
                NN1.LJJII(context, aweme, str, null);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                LIZLLL.LIZJ(str, "refer");
                C0DC.LIZJ(aweme, LIZLLL, "anchor_id", aweme, "room_id");
                return;
            }
            if (!C63081OpJ.LJLIL(aweme) || (author2 = aweme.getAuthor()) == null || !author2.isLive() || !UC0.LJJLI() || author2.isBlock()) {
                NN1.LJJII(context, aweme, str, null);
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                LIZLLL2.LIZJ(str, "refer");
                C0DC.LIZJ(aweme, LIZLLL2, "anchor_id", aweme, "room_id");
            }
            if (C63081OpJ.LJLJL(aweme) || ((aweme.isAd() && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && awemeRawAd3.liveRoom == 1) || C63081OpJ.LJLJJLL(aweme))) {
                NN1.LJJIII(context, aweme, str);
                return;
            }
            if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getProfileWithWebview() == 1) {
                NN1.LJJIII(context, aweme, "photo");
                return;
            }
            if (!C63081OpJ.LLF(aweme)) {
                LJJJJI = aweme.getAwemeRawAd();
            } else {
                LJJJJI = C63081OpJ.LJJJJI(aweme);
            }
            C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "otherclick", LJJJJI);
            LIZLLL3.LIZJ(str, "refer");
            LIZLLL3.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL3.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LJJLI(LIZLLL3, aweme);
            LIZLLL3.LJI();
            return;
        }
        if (C63081OpJ.LJJ(aweme)) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null && C78977Uz7.LJJLIIIJJIZ(awemeRawAd4)) {
                AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                if (awemeRawAd5 != null && C78977Uz7.LJJJJL(awemeRawAd5)) {
                    C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "click", aweme.getAwemeRawAd());
                    LIZLLL4.LIZJ("photo", "refer");
                    LJJLI(LIZLLL4, aweme);
                    LIZLLL4.LJI();
                    return;
                }
                C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                LIZLLL5.LIZJ("photo", "refer");
                LJJLI(LIZLLL5, aweme);
                LIZLLL5.LJI();
                return;
            }
            C58655N0h LIZLLL6 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            LIZLLL6.LIZJ(str, "refer");
            LIZLLL6.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL6.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LJJLI(LIZLLL6, aweme);
            LIZLLL6.LJI();
            return;
        }
        if (C63081OpJ.LJJJZ(aweme)) {
            if (!C63081OpJ.LJLIL(aweme) || (author = aweme.getAuthor()) == null || !author.isLive() || !UC0.LJJLI() || author.isBlock()) {
                if (C63081OpJ.LLJLILLLLZIIL(aweme)) {
                    hashMap = new HashMap();
                    AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                    if (awemeRawAd6 != null) {
                        num = Integer.valueOf(awemeRawAd6.getAdAvatarLinkTagStyle());
                    } else {
                        num = null;
                    }
                    hashMap.put("photo_link", num);
                } else {
                    hashMap = null;
                }
                NN1.LJJII(context, aweme, str, hashMap);
                C58655N0h LIZLLL7 = C58704N2e.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                LIZLLL7.LIZJ(str, "refer");
                LIZLLL7.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
                LIZLLL7.LIZIZ(C59406NTe.LJI(aweme), "room_id");
                if (C63081OpJ.LLJLILLLLZIIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    num2 = Integer.valueOf(awemeRawAd.getAdAvatarLinkTagStyle());
                }
                LIZLLL7.LIZIZ(num2, "photo_link");
                LIZLLL7.LJII();
            }
            NN1.LJJIII(context, aweme, str);
            return;
        }
        C58655N0h LIZLLL8 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        LIZLLL8.LIZJ(str, "refer");
        LIZLLL8.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
        LIZLLL8.LIZIZ(C59406NTe.LJI(aweme), "room_id");
        LJJLI(LIZLLL8, aweme);
        LIZLLL8.LJI();
    }

    @Override // X.NT3
    public final void LJJIIZI(Context context, Aweme aweme) {
        AwemeRawAd LJJJJI;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if (!C63081OpJ.LJLJJL(aweme)) {
            NN1.LJJII(context, aweme, "name", null);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
            LIZLLL.LIZJ("name", "refer");
            LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL.LJII();
            if (C63081OpJ.LJLJL(aweme)) {
                NN1.LJJIII(context, aweme, null);
            }
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getProfileWithWebview() == 1) {
                NN1.LJJIII(context, aweme, "name");
                return;
            }
            if (!C63081OpJ.LLF(aweme)) {
                LJJJJI = aweme.getAwemeRawAd();
            } else {
                LJJJJI = C63081OpJ.LJJJJI(aweme);
            }
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "otherclick", LJJJJI);
            LIZLLL2.LIZJ("name", "refer");
            LIZLLL2.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL2.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LJJLI(LIZLLL2, aweme);
            LIZLLL2.LJI();
            return;
        }
        if (C63081OpJ.LJJ(aweme)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && C78977Uz7.LJJLIIIJJIZ(awemeRawAd2)) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && C78977Uz7.LJJJJL(awemeRawAd3)) {
                    C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "click", aweme.getAwemeRawAd());
                    LIZLLL3.LIZJ("name", "refer");
                    LJJLI(LIZLLL3, aweme);
                    LIZLLL3.LJI();
                    return;
                }
                C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                LIZLLL4.LIZJ("name", "refer");
                LJJLI(LIZLLL4, aweme);
                LIZLLL4.LJI();
                return;
            }
            C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            LIZLLL5.LIZJ("name", "refer");
            LIZLLL5.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL5.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LJJLI(LIZLLL5, aweme);
            LIZLLL5.LJI();
            return;
        }
        if (C63081OpJ.LJJJZ(aweme)) {
            JHI.LIZ().LJIIIIZZ = 39;
            NN1.LJJII(context, aweme, "name", null);
            C58655N0h LIZLLL6 = C58704N2e.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
            LIZLLL6.LIZJ("name", "refer");
            C0DC.LIZJ(aweme, LIZLLL6, "anchor_id", aweme, "room_id");
            NN1.LJJIII(context, aweme, "name");
            return;
        }
        C58655N0h LIZLLL7 = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        LIZLLL7.LIZJ("name", "refer");
        LIZLLL7.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
        LIZLLL7.LIZIZ(C59406NTe.LJI(aweme), "room_id");
        LJJLI(LIZLLL7, aweme);
        LIZLLL7.LJI();
    }

    @Override // X.NT3
    public final void LJJIJIIJIL(Context context, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        NN1.LJJ(context, aweme);
    }

    @Override // X.NT3
    public final void LJJJLIIL(Aweme aweme, Context context) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        FeedLandPageClickUploadExp.clearDelayedPostMessage();
    }

    @Override // X.NT3
    public final void LJIIJ(Context context, Aweme aweme, int i) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        NN1.LJJIIZI(context, aweme, i);
        NQL.LJIILL().getClass();
        NQL.LJIJI(aweme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0348, code lost:
    
        if (com.ss.android.ugc.aweme.commercialize.im.OpenChatExt.LIZIZ(r21) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x034a, code lost:
    
        X.NN1.LJJJJIZL(r23, "background_ad", "click_message", r24, X.NN1.LJIIL(r23, r24, false, null));
        X.C0DC.LIZJ(r24, X.C58704N2e.LIZLLL("background_ad", "click_message", r24.getAwemeRawAd()), "anchor_id", r24, "room_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0362, code lost:
    
        r4.put("refer", "button");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x036a, code lost:
    
        X.NN1.LJJJJ(r23, "click_button", r24, X.NN1.LJIIIZ(r23, r24));
        X.C0DC.LIZJ(r24, X.C58704N2e.LIZLLL("background_ad", "click_button", r24.getAwemeRawAd()), "anchor_id", r24, "room_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0381, code lost:
    
        if (com.ss.android.ugc.aweme.commercialize.im.OpenChatExt.LIZIZ(r21) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0383, code lost:
    
        X.NN1.LJJJJI(r23, "click_message", r24, X.NN1.LJIIL(r23, r24, false, null));
        X.C0DC.LIZJ(r24, X.C58704N2e.LIZLLL("draw_ad", "click_message", r24.getAwemeRawAd()), "anchor_id", r24, "room_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x039b, code lost:
    
        X.NN1.LJJIII(r23, r24, "button");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03a0, code lost:
    
        X.NN1.LJJJJI(r23, "click_button", r24, X.NN1.LJIIIZ(r23, r24));
        X.C0DC.LIZJ(r24, X.C58704N2e.LIZLLL("draw_ad", "click_button", r24.getAwemeRawAd()), "anchor_id", r24, "room_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018d, code lost:
    
        if (r25 != 20) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e6, code lost:
    
        if (r25 != 20) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
    
        if (r9.equals("web") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        if (r9.equals("counsel") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0285, code lost:
    
        if (r25 == 2) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0288, code lost:
    
        if (r25 == 3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028a, code lost:
    
        switch(r25) {
            case 11: goto L159;
            case 12: goto L160;
            case 13: goto L158;
            case 14: goto L157;
            default: goto L144;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028d, code lost:
    
        switch(r25) {
            case 19: goto L156;
            case 20: goto L160;
            case 21: goto L158;
            default: goto L145;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0290, code lost:
    
        switch(r25) {
            case 53: goto L153;
            case 54: goto L150;
            case 55: goto L149;
            case 56: goto L148;
            case 57: goto L147;
            default: goto L61;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0295, code lost:
    
        LJJJZ().LJIILIIL(r24.getAwemeRawAd());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02a2, code lost:
    
        LJJJZ().LJIL(r24.getAwemeRawAd());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02af, code lost:
    
        LJJJZ().LJ(r24.getAwemeRawAd());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02bc, code lost:
    
        LJJJZ().LJFF(r24.getAwemeRawAd(), X.C59406NTe.LJI(r24));
        r0 = r24.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02cf, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d1, code lost:
    
        r5 = r0.getClickTrackUrlList();
        r4 = r0.getCreativeId();
        r3 = r0.getLogExtra();
        new kotlin.jvm.internal.AqS192S0100000_10(r24, 23);
        X.O8Z.LIZ("click", r5, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e9, code lost:
    
        LJJJZ().LJIILL(r24.getAwemeRawAd(), X.C59406NTe.LJI(r24));
        r0 = r24.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02fc, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02fe, code lost:
    
        r5 = r0.getClickTrackUrlList();
        r4 = r0.getCreativeId();
        r3 = r0.getLogExtra();
        new kotlin.jvm.internal.AqS192S0100000_10(r24, 22);
        X.O8Z.LIZ("click", r5, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0316, code lost:
    
        r4.put("refer", "image");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0320, code lost:
    
        r4.put("refer", "name");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x032a, code lost:
    
        r4.put("refer", "hot_region");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0334, code lost:
    
        r4.put("refer", "photo");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033c, code lost:
    
        r4.put("refer", "title");
        X.NN1.LJIL(r23, r24, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    @Override // X.NT3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(android.content.Context r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, int r25) {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN5.LJIILLIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    @Override // X.NT3
    public final void LJJ(Aweme aweme, Context context, EnumC57246MdO enumC57246MdO) {
        o.LJIIIZ(context, "context");
        ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
        if (LJIIJJI != null && enumC57246MdO != null && LJIIJJI.LJI() && aweme.getAwemeRawAd() != null) {
            String area = enumC57246MdO.getAREA();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            o.LJI(awemeRawAd);
            LJIIJJI.LIZ(awemeRawAd, area);
            return;
        }
        NN1.LJJJJI(context, "music_click", aweme, NN1.LJIIIZ(context, aweme));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "music_click", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
        LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
        LIZLLL.LIZ(EngagementTraceImpl.LIZIZ().LIZ());
        LIZLLL.LJII();
    }

    @Override // X.NT3
    public final void LJJIFFI(Context context, Aweme aweme, int i) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        NN1.LJJIIZI(context, aweme, i);
        NQL.LJIILL().getClass();
        NQL.LJIJI(aweme);
        if (LIZJ) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "first_play", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL.LJI();
            LIZJ = false;
        }
    }

    @Override // X.NT3
    public final void LJJIJIIJI(Context context, Aweme aweme, boolean z) {
        AwemeRawAd LJJJJI;
        AwemeRawAd LJJJJI2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if (z) {
            NN1.LJJJJI(context, "like", aweme, NN1.LJIIIZ(context, aweme));
            if (!C63081OpJ.LLF(aweme)) {
                LJJJJI2 = aweme.getAwemeRawAd();
            } else {
                LJJJJI2 = C63081OpJ.LJJJJI(aweme);
            }
            C0DC.LIZJ(aweme, C58704N2e.LIZLLL("draw_ad", "like", LJJJJI2), "anchor_id", aweme, "room_id");
            return;
        }
        NN1.LJJJJI(context, "like_cancel", aweme, NN1.LJIIIZ(context, aweme));
        if (!C63081OpJ.LLF(aweme)) {
            LJJJJI = aweme.getAwemeRawAd();
        } else {
            LJJJJI = C63081OpJ.LJJJJI(aweme);
        }
        C0DC.LIZJ(aweme, C58704N2e.LIZLLL("draw_ad", "like_cancel", LJJJJI), "anchor_id", aweme, "room_id");
    }

    @Override // X.NT3
    public final boolean LJJJIL(Aweme aweme, ActivityC45651qj context, float f) {
        int i;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if (!NNA.LIZ(context, aweme) || !C63081OpJ.LJLJJL(aweme) || C63081OpJ.LJJ(aweme) || C63081OpJ.LJLILLLLZI(aweme) || !C63081OpJ.LJJJZ(aweme)) {
            return false;
        }
        float ceil = (float) Math.ceil(f * 100);
        if (NNA.LIZIZ(aweme.getAwemeRawAd())) {
            i = ((ProfileAdWebModel) NN8.LIZIZ.getValue()).trackLynxProcess;
        } else {
            i = ((ProfileAdWebModel) NN8.LIZIZ.getValue()).trackWebProcess;
        }
        if (ceil < i) {
            return false;
        }
        java.util.Map<Aweme, String> map = NNA.LIZ;
        if (map.containsKey(aweme)) {
            return false;
        }
        NN1.LJJIJIIJI(context, aweme);
        FeedLandPageClickUploadExp.logFeedRawAdClick(context, aweme, "slide");
        map.put(aweme, "STATUS_ON_PAGE_SCROLL");
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:5|(3:7|(1:9)(1:11)|10)|12|(1:14)|15|16|17|(2:19|(1:21)(11:75|23|(1:74)(5:27|29|30|(1:32)(5:64|(1:66)|67|(1:69)(1:71)|70)|33)|34|35|(1:60)(2:39|40)|41|42|(3:44|(2:47|(1:49)(2:50|(1:52)))|46)|53|(2:55|56)(1:58)))(1:76)|22|23|(1:25)|74|34|35|(1:37)|60|41|42|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // X.NT3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(int r25, long r26, android.content.Context r28, com.ss.android.ugc.aweme.feed.model.Aweme r29) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN5.LJJIL(int, long, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.NT3
    public final void LJJIZ(Context context, Aweme aweme, boolean z, boolean z2) {
        String str;
        AwemeRawAd awemeRawAd;
        HashMap hashMap;
        InterfaceC49504Jbo LIZIZ;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if ((C46252IDg.LIZ(aweme) || C63081OpJ.LJLJI(aweme)) && z) {
            return;
        }
        this.LIZ = aweme;
        if (FWC.LJ == null) {
            synchronized (FWC.class) {
                if (FWC.LJ == null) {
                    FWC.LJ = new FWC();
                }
            }
        }
        FWC fwc = FWC.LJ;
        String aid = aweme.getAid();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        N7D n7d = null;
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getCreativeIdStr();
        } else {
            str = null;
        }
        if (!((HashMap) fwc.LIZLLL).containsKey(aid)) {
            ((HashMap) fwc.LIZLLL).put(aid, str);
        }
        C10K.LIZIZ(new ACallableS4S2000000_6(aid, str, 1), C10K.LJI, null);
        if (NN1.LJIJ(context, aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !C38354F3m.LJ(awemeRawAd.getOpenUrl())) {
            android.net.Uri parse = UriProtector.parse(awemeRawAd.getOpenUrl());
            if ("webcast_room".equals(parse.getHost()) && "ad_link".equals(UriProtector.getQueryParameter(parse, "enter_from_merge"))) {
                HashMap LIZ = C45243HpH.LIZ("enter_from_merge", "ad_link", "action_type", "click");
                String queryParameter = UriProtector.getQueryParameter(parse, "enter_method");
                if (!C38354F3m.LJ(queryParameter)) {
                    LIZ.put("enter_method", queryParameter);
                }
                String queryParameter2 = UriProtector.getQueryParameter(parse, "user_id");
                if (!C38354F3m.LJ(queryParameter2)) {
                    LIZ.put("anchor_id", queryParameter2);
                }
                String queryParameter3 = UriProtector.getQueryParameter(parse, "room_id");
                if (!C38354F3m.LJ(queryParameter3)) {
                    LIZ.put("room_id", queryParameter3);
                }
                String queryParameter4 = UriProtector.getQueryParameter(parse, "video_id");
                if (!C38354F3m.LJ(queryParameter4)) {
                    LIZ.put("video_id", queryParameter4);
                }
                String queryParameter5 = UriProtector.getQueryParameter(parse, "log_pb");
                if (!C38354F3m.LJ(queryParameter5)) {
                    LIZ.put("log_pb", queryParameter5);
                }
                String queryParameter6 = UriProtector.getQueryParameter(parse, "request_id");
                if (!C38354F3m.LJ(queryParameter6)) {
                    LIZ.put("request_id", queryParameter6);
                }
                LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                if (newLiveRoomData == null) {
                    hashMap = new HashMap();
                } else {
                    hashMap = new HashMap();
                    if (newLiveRoomData.roomLayout == 1) {
                        hashMap.put("live_type", "game");
                    } else if (newLiveRoomData.liveTypeAudio) {
                        hashMap.put("live_type", "voice_type");
                    } else if (newLiveRoomData.isThirdParty) {
                        hashMap.put("live_type", "thirdparty");
                    } else {
                        hashMap.put("live_type", "video_live");
                    }
                }
                LIZ.putAll(hashMap);
                LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
                HashMap hashMap2 = new HashMap();
                if (newLiveRoomData2 != null && newLiveRoomData2.withLinkmic && (newLiveRoomData2.liveTypeAudio || newLiveRoomData2.linkMicLayout == 16)) {
                    hashMap2.put("interact_function", "chat_room");
                }
                LIZ.putAll(hashMap2);
                C78688UuS.LJJJJZ(LIZ);
            }
        }
        boolean z3 = C46277IEf.LIZ;
        if (!aweme.isLive()) {
            if (C63081OpJ.LLIIII(aweme) && !C63081OpJ.LLIIJI(aweme) && z3) {
                MeasurementServiceImpl.LJ().LIZLLL().LIZIZ(aweme, "top_view", JCE.LIZ, new AqS173S0100000_7(context, 221));
            }
            LIZJ = true;
        }
        JHI LIZ2 = FeedSharePlayInfoHelperProvider.LIZIZ().LIZ();
        if (O5Y.LJJJIL(aweme) && C46278IEg.LIZ() && (LIZIZ = C58784N5g.LIZIZ.LIZIZ()) != null) {
            n7d = LIZIZ.LIZJ(aweme);
        }
        if (z2) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIIL(true);
            if (C46278IEg.LIZ()) {
                if (n7d != null) {
                    n7d.nB(new AqS157S0200000_10(context, aweme, 19));
                    return;
                }
                return;
            }
            if (!C63081OpJ.LJIL(aweme) && !LIZ2.LJIIJ && !C63081OpJ.LLFFF(aweme, "general_search")) {
                NN1.LJJIJ(context, aweme);
                LIZ2.LJIIJ = true;
            }
            LJJJZ().LJJIIJZLJL(aweme.getAwemeRawAd(), true, SearchAdMainService.LJIIJJI().LJIIIIZZ().LJFF());
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIIJ(false);
            return;
        }
        if (z3) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_100pct", aweme.getAwemeRawAd());
            LIZLLL.LJII = aweme;
            LIZLLL.LJI();
        } else {
            NN1.LJJIJ(context, aweme);
        }
        if (!O5Y.LJJJIL(aweme)) {
            return;
        }
        SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIIL(false);
        if (C46278IEg.LIZ()) {
            if (n7d == null) {
                return;
            }
            n7d.p40();
            return;
        }
        LIZ2.LJIIJ = true;
    }

    @Override // X.NT3
    public final void LJIILL(Aweme aweme, Context context, String sourceId, OSZ<Integer, Long> osz, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sourceId, "sourceId");
        if (C63081OpJ.LJZL(aweme)) {
            return;
        }
        LJJL(context, aweme, sourceId, osz, i, null);
    }

    public static void LJJL(Context context, Aweme aweme, String str, OSZ osz, int i, String str2) {
        if (TextUtils.equals(str, aweme.getAid()) && aweme.isAd()) {
            NN1.LIZIZ(context, aweme, osz, i);
            if (str2 == null || str2.length() == 0) {
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJFF(osz, "real_time");
            c188727au.LJIIIZ("predict_time", str2);
            FMX.LJIIL("ad_duration_prediction", c188727au.LIZ);
        }
    }

    @Override // X.NT3
    public final void LJJIJL(Aweme aweme, Context context, Aweme aweme2, String str, OSZ<Integer, Long> osz, int i, String str2) {
        o.LJIIIZ(context, "context");
        if (str == null || aweme2 == null) {
            return;
        }
        if ((aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) || C63081OpJ.LJZL(aweme2)) {
            return;
        }
        LJJL(context, aweme2, str, osz, i, str2);
    }
}
