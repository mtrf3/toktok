package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.81a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045481a implements IPhotoModeLogUtil {
    public static final C2045481a LIZ = new C2045481a();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r0.hasTitle() == true) goto L31;
     */
    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logBackToFeed(com.ss.android.ugc.aweme.model.PostModeEgressEtData r7, java.lang.String r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r6 = this;
            java.lang.String r0 = "postModeEgressEtData"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.7au r5 = new X.7au
            r5.<init>()
            java.lang.String r0 = "enter_from"
            r5.LJIIIZ(r0, r8)
            java.lang.String r1 = "from_page"
            java.lang.String r0 = "graphic_detail"
            r5.LJIIIZ(r1, r0)
            r2 = 0
            if (r9 == 0) goto La6
            java.lang.String r1 = r9.getAid()
        L1d:
            java.lang.String r0 = "group_id"
            r5.LJIIIZ(r0, r1)
            if (r9 == 0) goto La4
            int r0 = r9.getAwemeType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L2c:
            java.lang.String r0 = "aweme_type"
            r5.LJFF(r1, r0)
            if (r9 == 0) goto La2
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r9.getPhotoModeImageInfo()
            if (r0 == 0) goto La2
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto La2
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L47:
            java.lang.String r0 = "pic_cnt"
            r5.LJFF(r1, r0)
            if (r9 == 0) goto La0
            java.lang.String r0 = X.C187677Yd.LIZ(r9)
        L52:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L63
            if (r9 == 0) goto L5e
            java.lang.String r2 = X.C187677Yd.LIZ(r9)
        L5e:
            java.lang.String r0 = "photo_content_type"
            r5.LJI(r0, r2)
        L63:
            X.7uu r0 = r7.exitMethod
            if (r0 == 0) goto L70
            java.lang.String r1 = "action_type"
            java.lang.String r0 = r0.getMobValue()
            r5.LJI(r1, r0)
        L70:
            if (r9 == 0) goto L9e
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r9.getPhotoModeImageInfo()
            if (r0 == 0) goto L9e
            boolean r0 = r0.hasTitle()
            r1 = 1
            if (r0 != r1) goto L9e
        L7f:
            java.lang.String r0 = "has_title"
            r5.LIZLLL(r1, r0)
            java.lang.Long r0 = r7.leaveFullPageTime
            if (r0 == 0) goto L96
            long r3 = r0.longValue()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            java.lang.String r0 = "duration"
            r5.LJ(r1, r0)
        L96:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.LIZ
            java.lang.String r0 = "back_to_feed"
            X.FMX.LJIIL(r0, r1)
            return
        L9e:
            r1 = 0
            goto L7f
        La0:
            r0 = r2
            goto L52
        La2:
            r1 = r2
            goto L47
        La4:
            r1 = r2
            goto L2c
        La6:
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2045481a.logBackToFeed(com.ss.android.ugc.aweme.model.PostModeEgressEtData, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LIZ(Aweme aweme, long j, long j2, String enterFrom, double d, double d2) {
        int i;
        String str;
        ITZ playerType;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJ(j + j2, "duration");
        c188727au.LJ(j, "play_duration");
        c188727au.LJ(j2, "post_stay_duration");
        c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(aweme.getAuthor()));
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i = imageList.size();
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "pic_cnt");
        c188727au.LJIIIZ("is_fullscreen", "1");
        c188727au.LJIIIZ("is_long", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("has_cla", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("has_tts", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("start_volumn_value", String.valueOf(d));
        c188727au.LJIIIZ("end_volumn_value", String.valueOf(d2));
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        if (LJJLIIIIJ != null && (playerType = LJJLIIIIJ.getPlayerType()) != null) {
            str = playerType.toString();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("player_type", str);
        Z9N z9n = Z9N.LIZIZ;
        if (z9n.LJJIJLIJ(enterFrom)) {
            C73340SqO.LJII(c188727au, z9n.LLJLLIL(enterFrom, ""));
        }
        if (C78685UuP.LJJJZ(C187677Yd.LIZ(aweme))) {
            c188727au.LJI("photo_content_type", C187677Yd.LIZ(aweme));
        }
        FMX.LJIIL("post_stay_time", c188727au.LIZ);
    }

    public static void LIZIZ(final String enterFrom, final String str, final Aweme aweme, final int i, final String str2, boolean z, int i2, java.util.Map map, HashMap hashMap, int i3) {
        String str3;
        final java.util.Map map2 = map;
        final boolean z2 = z;
        final HashMap hashMap2 = hashMap;
        final Integer num = null;
        if ((i3 & 64) != 0) {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            map2 = null;
        }
        if ((i3 & 512) != 0) {
            hashMap2 = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        C38995FSd.LIZJ().execute(new Runnable() { // from class: X.7Eu
            public final void LIZ() {
                int i4;
                List<PhotoModeImageUrlModel> imageList;
                String str4 = enterFrom;
                String str5 = str;
                Aweme aweme2 = aweme;
                int i5 = i;
                String str6 = str2;
                Integer num2 = num;
                boolean z3 = z2;
                java.util.Map<String, String> map3 = map2;
                HashMap<String, String> hashMap3 = hashMap2;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str4);
                c188727au.LJIIIZ("enter_method", str5);
                c188727au.LIZLLL(aweme2.getAwemeType(), "aweme_type");
                c188727au.LJIIIZ("group_id", aweme2.getAid());
                c188727au.LJIIIZ("author_id", aweme2.getAuthorUid());
                PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    i4 = imageList.size();
                } else {
                    i4 = 0;
                }
                c188727au.LIZLLL(i4, "pic_cnt");
                c188727au.LIZLLL(i5 + 1, "pic_location");
                c188727au.LJI("action_type", str6);
                if (num2 != null) {
                    c188727au.LIZLLL(num2.intValue(), "has_title");
                }
                if (z3) {
                    c188727au.LJI("from_page", "graphic_detail");
                } else {
                    c188727au.LJI("from_page", "");
                }
                Z9N z9n = Z9N.LIZIZ;
                if (z9n.LJJIJLIJ(str4)) {
                    C73340SqO.LJII(c188727au, z9n.LLJLLIL(str4, ""));
                    if (map3 != null) {
                        C73340SqO.LJII(c188727au, map3);
                    }
                }
                if (C78685UuP.LJJJZ(C187677Yd.LIZ(aweme2))) {
                    c188727au.LJI("photo_content_type", C187677Yd.LIZ(aweme2));
                }
                c188727au.LJII(C227768wm.LJIJJLI(aweme2));
                if (hashMap3 != null) {
                    c188727au.LJII(hashMap3);
                }
                FMX.LJIIL("multi_photo_slide", c188727au.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        if (aweme.isAd()) {
            IAdPhotoModeService LIZ2 = AdPhotoModeServiceImpl.LIZ();
            int i4 = i + 1;
            String str4 = "auto";
            if (TextUtils.equals(str, "manual_click")) {
                str3 = "manual";
            } else {
                str3 = "auto";
            }
            LIZ2.g1(i4, i2, aweme, str3);
            IAdPhotoModeService LIZ3 = AdPhotoModeServiceImpl.LIZ();
            if (TextUtils.equals(str, "manual_click")) {
                str4 = "manual";
            }
            LIZ3.q1(i, i2, aweme, str4, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    public final void logPinchZoom(final String enterFrom, final Aweme aweme, final int i, final long j, final boolean z, final Integer num, final boolean z2, final Float f, final Boolean bool, final Boolean bool2, final Boolean bool3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
        C38995FSd.LIZJ().execute(new Runnable() { // from class: X.81d
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
            
                if (r14 != null) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instructions count: 388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2045781d.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }
}
