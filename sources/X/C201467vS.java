package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7vS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201467vS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIIJ(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public static void LJIIZILJ(FullPageParam fullPageParam) {
        int i;
        String str;
        o.LJIIIZ(fullPageParam, "fullPageParam");
        J8I j8i = new J8I();
        j8i.LJJLIIIJJIZ = "click";
        Aweme aweme = fullPageParam.getAweme();
        PostModeDetailParams postModeDetailParams = fullPageParam.getPostModeDetailParams();
        if (postModeDetailParams != null) {
            i = postModeDetailParams.pageType;
        } else {
            i = 0;
        }
        j8i.LJJIIZ(i, aweme);
        PostModeDetailParams postModeDetailParams2 = fullPageParam.getPostModeDetailParams();
        if (postModeDetailParams2 == null || (str = postModeDetailParams2.eventType) == null) {
            str = "";
        }
        j8i.LJJL = str;
        j8i.LJJLIIIJILLIZJL = "graphic_detail";
        j8i.LJIILIIL();
    }

    public static void LIZ(C188727au c188727au, Aweme aweme) {
        String str;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        c188727au.LJI("author_id", str);
    }

    public static void LIZIZ(C188727au c188727au, Aweme aweme) {
        Integer num;
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
    }

    public static void LIZJ(C188727au c188727au, PostModeDetailParams postModeDetailParams) {
        String str;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        c188727au.LJI("enter_from", str);
    }

    public static void LIZLLL(C188727au c188727au, Aweme aweme) {
        String str;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJI("group_id", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r0.hasTitle() == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C188727au r2, com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            if (r3 == 0) goto L15
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r3.getPhotoModeImageInfo()
            if (r0 == 0) goto L15
            boolean r0 = r0.hasTitle()
            r1 = 1
            if (r0 != r1) goto L15
        Lf:
            java.lang.String r0 = "has_title"
            r2.LIZLLL(r1, r0)
            return
        L15:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201467vS.LJ(X.7au, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LJFF(C188727au c188727au, Aweme aweme) {
        String LIZIZ;
        if (aweme != null && (LIZIZ = C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme))) != null) {
            c188727au.LJI("log_pb", LIZIZ);
        }
    }

    public static void LJI(C188727au c188727au, Aweme aweme) {
        if (aweme != null && C78685UuP.LJJJZ(C187677Yd.LIZ(aweme))) {
            c188727au.LJI("photo_content_type", C187677Yd.LIZ(aweme));
        }
    }

    public static void LJII(C188727au c188727au, Aweme aweme) {
        Integer num;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            num = Integer.valueOf(imageList.size());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "pic_cnt");
    }

    public static void LJIIIIZZ(C188727au c188727au, Integer num) {
        if (num != null) {
            c188727au.LIZLLL(num.intValue() + 1, "pic_location");
        }
    }

    public static void LJIILIIL(String str, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(aweme.getAuthor()));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme)));
        c188727au.LJIIIZ("enter_method", "actionbar");
        c188727au.LJFF(Integer.valueOf(aweme.getAwemeType()), "aweme_type");
        c188727au.LIZLLL(C227768wm.LJIILIIL(aweme), "pic_cnt");
        c188727au.LJFF(Boolean.valueOf(aweme.isHighlighted()), "is_highlighted");
        c188727au.LJFF(Integer.valueOf(aweme.getOriginalPos()), "rank_index");
        C222578oP.LIZJ(c220488l2.LJII(aweme, c188727au), aweme, null, null, 14);
        LJ(c188727au, aweme);
        c188727au.LJI("from_page", "graphic_detail");
        FMX.LJIIL("favourite_video", c188727au.LIZ);
    }

    public static void LJIJ(String str, FullPageParam param) {
        String str2;
        String str3;
        o.LJIIIZ(param, "param");
        C188727au c188727au = new C188727au();
        PostModeDetailParams postModeDetailParams = param.getPostModeDetailParams();
        String str4 = null;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.eventType;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        Aweme aweme = param.getAweme();
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("group_id", str3);
        Aweme aweme2 = param.getAweme();
        if (aweme2 != null) {
            str4 = aweme2.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str4);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJIIJJI(Aweme aweme, PostModeDetailParams postModeDetailParams, Integer num) {
        String str;
        long j;
        int i;
        String str2;
        List<TextExtraStruct> list;
        Integer num2;
        PhotoModeIngressEtData photoModeIngressEtData;
        PostModeEntranceMechanism postModeEntranceMechanism;
        C188727au c188727au = new C188727au();
        String str3 = null;
        if (postModeDetailParams != null && (postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) != null) {
            str = postModeEntranceMechanism.getValue();
        } else {
            str = null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (postModeDetailParams != null && (photoModeIngressEtData = postModeDetailParams.photoModeIngressEtData) != null) {
            j = photoModeIngressEtData.timeStamp;
        } else {
            j = 0;
        }
        long j2 = elapsedRealtime - j;
        LIZJ(c188727au, postModeDetailParams);
        LIZLLL(c188727au, aweme);
        LJII(c188727au, aweme);
        LJIIIIZZ(c188727au, num);
        LIZIZ(c188727au, aweme);
        c188727au.LJI("enter_method", str);
        LJFF(c188727au, aweme);
        if (aweme != null) {
            if (postModeDetailParams != null) {
                i = postModeDetailParams.pageType;
            } else {
                i = 0;
            }
            String LJIILL = C227768wm.LJIILL(i, aweme);
            if (LJIILL != null) {
                c188727au.LJI("request_id", LJIILL);
            }
        }
        LIZ(c188727au, aweme);
        if (aweme == null || (str2 = aweme.getDesc()) == null) {
            str2 = "";
        }
        if (aweme != null) {
            list = aweme.getTextExtra();
        } else {
            list = null;
        }
        c188727au.LIZLLL(C2051783l.LIZIZ(str2, list).length(), "title_without_hashtag_length");
        if (postModeDetailParams != null) {
            PhotoModeIngressEtData photoModeIngressEtData2 = postModeDetailParams.photoModeIngressEtData;
            if (photoModeIngressEtData2 != null) {
                num2 = Integer.valueOf(photoModeIngressEtData2.remainingWordCountWithoutHashTag);
            } else {
                num2 = null;
            }
            c188727au.LJFF(num2, "remain_word_count_without_hashtag");
        }
        c188727au.LJFF(Long.valueOf(j2), "duration");
        LJI(c188727au, aweme);
        Z9N z9n = Z9N.LIZIZ;
        if (postModeDetailParams != null) {
            str3 = postModeDetailParams.eventType;
        }
        c188727au.LJII(z9n.LLJJL(aweme, str3));
        FMX.LJIIL("enter_graphic_detail", c188727au.LIZ);
    }

    public static void LJIIL(FullPageParam fullPageParam, Context context, TextExtraStruct struct) {
        PostModeDetailParams postModeDetailParams;
        boolean z;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(struct, "struct");
        Aweme aweme = fullPageParam.getAweme();
        if (aweme == null || (postModeDetailParams = fullPageParam.getPostModeDetailParams()) == null) {
            return;
        }
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        int i = 1;
        if (aweme.getBottomBarModel() != null) {
            z = true;
        } else {
            z = false;
        }
        String searchResultId = C2S6.LIZ(context).getSearchResultId();
        String str2 = "";
        if (searchResultId == null) {
            searchResultId = "";
        }
        if (TextUtils.isEmpty(searchResultId)) {
            searchResultId = C227768wm.LIZIZ(aweme);
        }
        C201487vU c201487vU = new C201487vU();
        String str3 = postModeDetailParams.eventType;
        if (str3 == null) {
            str3 = "";
        }
        c201487vU.LIZLLL = str3;
        c201487vU.LJJIIZ(context);
        if (aweme.getAuthor() == null) {
            str = "";
        } else {
            str = aweme.getAuthor().getUid();
        }
        c201487vU.LJJLIIIJILLIZJL = str;
        c201487vU.LJJLIIIJ = aweme.getAid();
        c201487vU.LJJIIZI(aweme);
        c201487vU.LJLIIIL = postModeDetailParams.previousPage;
        c201487vU.LJLIIL = C2S6.LIZ(context).getPreviousPagePosition();
        c201487vU.LJLIL = z;
        c201487vU.LJJLIIIJLJLI = LIZ2;
        c201487vU.LJIILLIIL = C227768wm.LJIIL(postModeDetailParams.pageType, aweme);
        String cid = struct.getCid();
        if (cid != null) {
            str2 = cid;
        }
        c201487vU.LJJLIIIJJI = str2;
        c201487vU.LJJLI = "click_in_video_name";
        c201487vU.LJJIJ(C227768wm.LJIILL(postModeDetailParams.pageType, aweme));
        c201487vU.LJJIFFI = searchResultId;
        c201487vU.LJJIL = C2S6.LIZ(context).getSearchId();
        c201487vU.LJLJJI = C2S6.LIZ(context).getCategoryName();
        c201487vU.LIZ(K02.LIZIZ("enter_tag_detail", aweme, postModeDetailParams.eventType));
        C198597qp LIZ3 = C76V.LIZ();
        String aid = aweme.getAid();
        if (aid == null) {
            LIZ3.getClass();
        } else {
            C0M6<String, ZJX> c0m6 = LIZ3.LIZ;
            if (c0m6 != null && c0m6.LIZIZ(aid) != null) {
                c201487vU.LIZJ(0, "folded_tag_cnt");
                c201487vU.LIZJ(0, "spammy_tag_cnt");
                c201487vU.LIZJ(struct.getEverFolded() ? 1 : 0, "is_folded_tag");
            }
        }
        c201487vU.LIZLLL("from_page", "graphic_detail");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || !photoModeImageInfo.hasTitle()) {
            i = 0;
        }
        c201487vU.LIZJ(i, "has_title");
        c201487vU.LJIILIIL();
    }

    public static void LJIILJJIL(Aweme aweme, PostModeDetailParams postModeDetailParams, Integer num) {
        C188727au c188727au = new C188727au();
        LIZJ(c188727au, postModeDetailParams);
        LIZLLL(c188727au, aweme);
        LJII(c188727au, aweme);
        LJIIIIZZ(c188727au, num);
        c188727au.LJI("from_page", "graphic_detail");
        LJ(c188727au, aweme);
        LIZIZ(c188727au, aweme);
        LJFF(c188727au, aweme);
        LIZ(c188727au, aweme);
        LJI(c188727au, aweme);
        FMX.LJIIL("graphic_detail_finish", c188727au.LIZ);
    }

    public static void LJIILL(Aweme aweme, PostModeDetailParams postModeDetailParams, long j) {
        HashMap<String, String> hashMap;
        C188727au c188727au = new C188727au();
        LIZJ(c188727au, postModeDetailParams);
        LIZIZ(c188727au, aweme);
        LJII(c188727au, aweme);
        c188727au.LJFF(Long.valueOf(j), "duration");
        LIZ(c188727au, aweme);
        LIZLLL(c188727au, aweme);
        c188727au.LJI("from_page", "graphic_detail");
        LJ(c188727au, aweme);
        LJFF(c188727au, aweme);
        LJI(c188727au, aweme);
        c188727au.LJII(C227768wm.LJIJJLI(aweme));
        if (postModeDetailParams != null && (hashMap = postModeDetailParams.displayTitleParams) != null) {
            c188727au.LJII(hashMap);
        }
        FMX.LJIIL("graphic_detail_playtime", c188727au.LIZ);
    }

    public static void LJIILLIIL(Aweme aweme, PostModeDetailParams postModeDetailParams, boolean z, Integer num) {
        String str;
        C188727au c188727au = new C188727au();
        LIZ(c188727au, aweme);
        LIZIZ(c188727au, aweme);
        LIZJ(c188727au, postModeDetailParams);
        c188727au.LJI("from_page", "graphic_detail");
        LIZLLL(c188727au, aweme);
        LJII(c188727au, aweme);
        LJIIIIZZ(c188727au, num);
        if (!z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJI("to_status", str);
        LJ(c188727au, aweme);
        LJFF(c188727au, aweme);
        LJI(c188727au, aweme);
        FMX.LJIIL("graphic_detail_volume", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x010c, code lost:
    
        if (r13.equals("back_to_feed") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0114, code lost:
    
        if (r13.equals("graphic_detail_finish") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x011c, code lost:
    
        if (r13.equals("graphic_detail_volume") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r13.equals("graphic_detail_finish_rate") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r13.equals("click_trans_layer") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0126, code lost:
    
        LIZJ(r2, r15);
        LJII(r2, r14);
        LIZLLL(r2, r14);
        LIZ(r2, r14);
        r2.LJI("from_page", "graphic_detail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0139, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "graphic_detail_playtime") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013b, code lost:
    
        kotlin.jvm.internal.o.LJ(r13, "back_to_feed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "graphic_detail_finish_rate") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0144, code lost:
    
        r2.LJFF(r6, "rate");
        LJI(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0152, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "graphic_detail_volume") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0154, code lost:
    
        r11 = null;
        r2.LJI("to_status", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "back_to_feed") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015e, code lost:
    
        r2.LJIIIZ("to_status", r11);
        r2.LJIIIZ("to_group_id", r14.getAid());
        r2.LJI("action_type", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
    
        r11 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
    
        if (r11 == (-1136574248)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017e, code lost:
    
        if (r11 == 358693258) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0180, code lost:
    
        if (r11 == 1340165553) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0182, code lost:
    
        r1 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        if (r1 == (-1847886635)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        if (r1 == 876606250) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0190, code lost:
    
        if (r1 == 1340165553) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "click_trans_layer") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0198, code lost:
    
        LIZIZ(r2, r14);
        r2.LIZLLL(r14.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01aa, code lost:
    
        if (r13.equals("graphic_detail_volume") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ba, code lost:
    
        LJIIIIZZ(r2, r18);
        LIZIZ(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
    
        if (r13.equals("graphic_detail_finish") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r13.equals("graphic_detail_finish_rate") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c7, code lost:
    
        if (r13.equals("graphic_detail_volume") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d7, code lost:
    
        r2.LIZLLL(r14.getAwemeType(), "aweme_type");
        r2.LJI("author_id", r14.getAuthorUid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d5, code lost:
    
        if (r13.equals("back_to_feed") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ce, code lost:
    
        if (r13.equals("graphic_detail_playtime") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e6, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005d, code lost:
    
        if (r13.equals("graphic_detail_playtime") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f5, code lost:
    
        if (r5 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(java.lang.String r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, com.ss.android.ugc.aweme.model.PostModeDetailParams r15, java.lang.Integer r16, java.lang.Double r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201467vS.LJIIIZ(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.Integer, java.lang.Double, java.lang.String, int):void");
    }
}
