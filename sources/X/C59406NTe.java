package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromotePageModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.NTe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59406NTe {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LJIIIIZZ() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getMusicComplianceAccount() > 0) {
            return false;
        }
        C59411NTj c59411NTj = C59411NTj.LIZIZ;
        return c59411NTj.LIZIZ() == 1 || c59411NTj.LIZIZ() == 2;
    }

    public static final boolean LJ() {
        return C59411NTj.LIZIZ.LJIIIZ();
    }

    public static final boolean LJIILL() {
        if (LJ() && C59411NTj.LIZIZ.LJJI()) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(Aweme aweme) {
        User author;
        String uid;
        RoomFeedCellStruct roomFeedCellStruct;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return null;
            }
            return Long.valueOf(newLiveRoomData.getAnchorId()).toString();
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive() || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            return null;
        }
        return uid;
    }

    public static final long LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getVideo() == null || aweme.getVideo().getDuration() == 0) {
            return 1L;
        }
        return aweme.getVideo().getDuration();
    }

    public static final String LJI(Aweme aweme) {
        User author;
        RoomFeedCellStruct roomFeedCellStruct;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return null;
            }
            return Long.valueOf(newLiveRoomData.id).toString();
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive() || (author = aweme.getAuthor()) == null) {
            return null;
        }
        return Long.valueOf(author.roomId).toString();
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        PromotePageModel promotePageModel;
        Integer promoteLynxSchemaType;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPromotePage() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getPromotePageModel() == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || (promotePageModel = awemeRawAd3.getPromotePageModel()) == null || (promoteLynxSchemaType = promotePageModel.getPromoteLynxSchemaType()) == null) {
            return false;
        }
        if (promoteLynxSchemaType.intValue() != 1 && promoteLynxSchemaType.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static final void LJIIJJI(String schema) {
        o.LJIIIZ(schema, "schema");
        C59411NTj.LIZIZ.LJJIFFI(schema);
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        return C59411NTj.LIZIZ.LJIILIIL(aweme);
    }

    public static final boolean LJIILJJIL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C59411NTj c59411NTj = C59411NTj.LIZIZ;
        if (!c59411NTj.LJIILLIIL().getSwitch() || !NII.LIZ.contains(Integer.valueOf(aweme.getHasPromoteEntry()))) {
            return false;
        }
        long LIZJ = LIZJ(aweme);
        if (LIZJ == 1) {
            return false;
        }
        if ((aweme.getHasPromoteEntry() == 5 || aweme.getHasPromoteEntry() == 4) && LIZJ < c59411NTj.LJIILLIIL().getDelayTimeTypeA()) {
            return false;
        }
        if ((aweme.getHasPromoteEntry() == 6 && LIZJ < c59411NTj.LJIILLIIL().getDelayTimeTypeB()) || c59411NTj.LJJ() >= c59411NTj.LJIILLIIL().getPromoteIconFlipMaxTimes() || (System.currentTimeMillis() - c59411NTj.LJIJJLI()) / 86400000 < c59411NTj.LJIILLIIL().getPromoteIconFlipTimeGap()) {
            return false;
        }
        return true;
    }

    public static final AdLiveEnterRoomConfig LIZ(Aweme aweme, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(aweme, "aweme");
        return C59411NTj.LIZIZ.LJIILL(aweme, awemeRawAd, 12);
    }

    public static final void LJIIJ(Context context, String schema) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(context, "context");
        C59411NTj.LIZIZ.preload(context, schema);
    }

    public static final void LJIIL(Context context, String str) {
        o.LJIIIZ(context, "context");
        C59411NTj.LIZIZ.LJIIJ(context, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r5.equals("creator_tools") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        r2 = X.C59411NTj.LIZIZ.LJIL().settings;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r5.equals("modify_setting") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r2 = X.C59411NTj.LIZIZ.LJIL().video;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r5.equals("video") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r5.equals("during_live") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r2 = X.C59411NTj.LIZIZ.LJIL().live;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r5.equals("before_live") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5.equals("business_suite") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(java.lang.Long r3, java.lang.String r4, java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -1943164487: goto L53;
                case -1095106132: goto L41;
                case -522623958: goto L38;
                case 112202875: goto L26;
                case 368759755: goto L1d;
                case 1756617736: goto L14;
                default: goto L7;
            }
        L7:
            java.lang.String r2 = ""
        L9:
            java.lang.String r1 = "&item_id="
            java.lang.String r0 = "&source="
            if (r3 != 0) goto L65
            java.lang.String r0 = X.UPJ.LIZIZ(r2, r0, r5, r1, r4)
            return r0
        L14:
            java.lang.String r0 = "creator_tools"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5c
            goto L7
        L1d:
            java.lang.String r0 = "modify_setting"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2f
            goto L7
        L26:
            java.lang.String r0 = "video"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2f
            goto L7
        L2f:
            X.NTj r0 = X.C59411NTj.LIZIZ
            com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel r0 = r0.LJIL()
            java.lang.String r2 = r0.video
            goto L9
        L38:
            java.lang.String r0 = "during_live"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4a
            goto L7
        L41:
            java.lang.String r0 = "before_live"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4a
            goto L7
        L4a:
            X.NTj r0 = X.C59411NTj.LIZIZ
            com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel r0 = r0.LJIL()
            java.lang.String r2 = r0.live
            goto L9
        L53:
            java.lang.String r0 = "business_suite"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5c
            goto L7
        L5c:
            X.NTj r0 = X.C59411NTj.LIZIZ
            com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel r0 = r0.LJIL()
            java.lang.String r2 = r0.settings
            goto L9
        L65:
            java.lang.StringBuilder r1 = X.C06540Nm.LIZLLL(r2, r0, r5, r1, r4)
            java.lang.String r0 = "&click_time="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59406NTe.LJFF(java.lang.Long, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final String LIZLLL(String str, String str2, String str3, Long l) {
        if (l == null) {
            return UPJ.LIZIZ(str, "&source=", str3, "&item_id=", str2);
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL(str, "&source=", str3, "&item_id=", str2);
        LIZLLL.append("&click_time=");
        LIZLLL.append(l);
        return X1D.LIZIZ(LIZLLL);
    }

    public static final void LJIIIZ(Context context, Aweme aweme, int i, User user) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        C59411NTj.LIZIZ.LIZJ(context, aweme, i, user);
    }
}
