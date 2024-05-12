package Y;

import X.C188727au;
import X.C2060386t;
import X.C47261Igj;
import X.C48236IwS;
import X.C53295Kvr;
import X.C54492La4;
import X.C54944LhM;
import X.C54947LhP;
import X.C56662Kg;
import X.C60903NvH;
import X.C76800UCe;
import X.C88545Yp3;
import X.EF7;
import X.EnumC123174sT;
import X.EnumC54493La5;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LLQ;
import X.LLR;
import X.LQ7;
import X.MIV;
import X.OSZ;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ACallableS36S1100000_9 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        String str;
        String authorUid;
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("story_view_list", "account_type");
        oszArr[1] = new OSZ(aCallableS36S1100000_9.s0, "action_type");
        oszArr[2] = new OSZ(((C54947LhP) aCallableS36S1100000_9.l1).LJLILLLLZI, "enter_from");
        Aweme aweme = ((C54947LhP) aCallableS36S1100000_9.l1).LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[3] = new OSZ(str, "group_id");
        Aweme aweme2 = ((C54947LhP) aCallableS36S1100000_9.l1).LJLIL;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        oszArr[4] = new OSZ(str2, "author_id");
        oszArr[5] = new OSZ(((C54947LhP) aCallableS36S1100000_9.l1).LJLJJL, "view_list_popup_type");
        OSZ[] oszArr2 = (OSZ[]) C47261Igj.LJJIJIL(oszArr).toArray(new OSZ[0]);
        FMX.LJIILL("story_popup", (OSZ[]) Arrays.copyOf(oszArr2, oszArr2.length));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        MIV miv = (MIV) aCallableS36S1100000_9.l1;
        String str = aCallableS36S1100000_9.s0;
        StickerPropApi stickerPropApi = miv.LJLJLLL;
        C60903NvH.LJIIJJI().getApplicationService();
        return stickerPropApi.getStickerDetail(str, 1, EF7.LIZLLL()).get();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS36S1100000_9 r7) {
        /*
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = (com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel) r0
            java.lang.String r2 = r0.getEventType()
            java.lang.String r3 = "enter_homepage_follow"
            java.lang.String r1 = ""
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
            switch(r0) {
                case -1271119582: goto L85;
                case -1051643920: goto L79;
                case -460940408: goto L6d;
                case 910581405: goto L61;
                case 1691937916: goto L55;
                default: goto L15;
            }
        L15:
            r6 = r1
        L16:
            com.ss.android.ugc.aweme.main.IMainPageFragment r0 = com.bytedance.tiktok.homepage.services.MainPageFragmentImpl.LJI()
            java.lang.String r5 = r0.LJJLIIIJJI()
            int r0 = r6.length()
            r4 = 0
            if (r0 <= 0) goto L51
            X.LQ7 r2 = new X.LQ7
            r2.<init>(r6)
            java.lang.String r0 = r7.s0
            r2.LJIILLIIL = r0
            java.lang.String r0 = "others_homepage"
            r2.LIZLLL = r0
            r2.LJIIZILJ = r5
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r3)
            if (r0 == 0) goto L4e
            X.Yp3 r0 = X.C88545Yp3.LIZIZ
            if (r0 == 0) goto L42
            boolean r4 = r0.isConnected()
        L42:
            r2.LJJIFFI = r4
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.LJIILJJIL()
            if (r0 != 0) goto L53
        L4c:
            r2.LJJII = r1
        L4e:
            r2.LJIILIIL()
        L51:
            r0 = 0
            return r0
        L53:
            r1 = r0
            goto L4c
        L55:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5e
            goto L15
        L5e:
            java.lang.String r6 = "enter_homepage_hot"
            goto L16
        L61:
            java.lang.String r0 = "homepage_live"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6a
            goto L15
        L6a:
            java.lang.String r6 = "enter_homepage_live"
            goto L16
        L6d:
            java.lang.String r0 = "homepage_popular"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L76
            goto L15
        L76:
            java.lang.String r6 = "enter_homepage_popular"
            goto L16
        L79:
            java.lang.String r0 = "homepage_nearby"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L82
            goto L15
        L82:
            java.lang.String r6 = "enter_homepage_nearby"
            goto L16
        L85:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8e
            goto L15
        L8e:
            r6 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS36S1100000_9.call$2(Y.ACallableS36S1100000_9):java.lang.Object");
    }

    public static final Object call$3(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        if (((CommentEmotionCheck) aCallableS36S1100000_9.l1).LIZJ()) {
            ((CommentEmotionCheck) aCallableS36S1100000_9.l1).getClass();
            IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(EF7.LJIIIZ));
            if (featureCore != null) {
                featureCore.createInMemoryKVStore("tiktok_clientai_cloud_data").setValueForKey("client_ai_upload_json_str", aCallableS36S1100000_9.s0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        FMX.LJIILJJIL(aCallableS36S1100000_9.s0, (JSONObject) aCallableS36S1100000_9.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        for (Aweme aweme : (List) aCallableS36S1100000_9.l1) {
            int i7 = !C54944LhM.LIZ(aweme) ? 1 : 0;
            int i8 = 0;
            if ((aweme != null && aweme.getAuthor() != null && aweme.getAuthor().getNickname() != null) || !C54944LhM.LIZ(aweme)) {
                i = 0;
            } else {
                i = 1;
            }
            int i9 = !C54944LhM.LIZJ(aweme) ? 1 : 0;
            if ((aweme != null && aweme.getMusic() != null && !C2060386t.LIZ(aweme.getMusic().getMusicName())) || !C54944LhM.LIZJ(aweme)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if ((aweme != null && aweme.getAuthor() != null && aweme.getAuthor().getUniqueId() != null) || !C54944LhM.LIZ(aweme)) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (!C54944LhM.LIZIZ(aweme) && C54944LhM.LIZ(aweme)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (aweme != null && aweme.getDesc() != null && !C2060386t.LIZ(aweme.getDesc())) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            int i10 = i5 ^ 1;
            if (!C54944LhM.LIZLLL(aweme) && C54944LhM.LIZJ(aweme)) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            boolean LJIIL = C48236IwS.LJIIL(str);
            if (i7 == 1 || i == 1 || i9 == 1 || i2 == 1 || i4 == 1 || i10 == 1 || i6 == 1) {
                i8 = 1;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", aCallableS36S1100000_9.s0);
            c188727au.LIZLLL(LJIIL ? 1 : 0, "cache");
            c188727au.LIZLLL(i8, "is_success");
            if (i7 == 1) {
                c188727au.LIZLLL(i7, "author_miss");
            }
            if (i == 1) {
                c188727au.LIZLLL(i, "nickname_miss");
            }
            if (i3 == 1) {
                c188727au.LIZLLL(i3, "uniqueid_miss");
            }
            if (i4 == 1) {
                c188727au.LIZLLL(i4, "avatar_miss");
            }
            if (i9 == 1) {
                c188727au.LIZLLL(i9, "music_miss");
            }
            if (i2 == 1) {
                c188727au.LIZLLL(i2, "music_title_miss");
            }
            if (i10 == 1) {
                c188727au.LIZLLL(i10, "desc_miss");
            }
            if (i6 == 1) {
                c188727au.LIZLLL(i6, "music_turntable_miss");
            }
            FMX.LJIIL("field_receive", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        LLQ llq = LLR.LJIIJ;
        if (llq != null) {
            llq.LIZ(aCallableS36S1100000_9.s0, (InterfaceC88472Yns) aCallableS36S1100000_9.l1);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$7(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        boolean z;
        String str;
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aCallableS36S1100000_9.l1;
        String str2 = aCallableS36S1100000_9.s0;
        feedFollowFragment.getClass();
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null) {
            z = c88545Yp3.isConnected();
            str = c88545Yp3.LJIILJJIL();
        } else {
            z = false;
            str = "";
        }
        LQ7 lq7 = new LQ7("enter_homepage_follow");
        lq7.LIZLLL = "open_app";
        lq7.LJJIFFI = z;
        lq7.LJJII = str;
        lq7.LJIILLIIL = "open_app";
        if (!TextUtils.isEmpty(str2)) {
            lq7.LJIJI = str2;
        }
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = feedFollowFragment.LLFZ;
        if (followFeedFragmentPanelMT != null && followFeedFragmentPanelMT.getCurrentAweme() != null) {
            lq7.LJIILLIIL(feedFollowFragment.LLFZ.getCurrentAweme());
        }
        if (!C53295Kvr.LIZ()) {
            lq7.LJIILIIL();
            return null;
        }
        return null;
    }

    public static final Object call$8(ACallableS36S1100000_9 aCallableS36S1100000_9) {
        C188727au c188727au = new C188727au();
        c188727au.LJ(C54492La4.LIZ - C56662Kg.LIZ().LJIIJJI, "time_from_launch_to_following_feed");
        c188727au.LJ(C54492La4.LIZIZ - C54492La4.LIZ, EnumC123174sT.PAGE_CREATION_TO_VIEW_VISIBLE.getValue());
        c188727au.LJ(SystemClock.elapsedRealtime() - C54492La4.LIZ, EnumC123174sT.PAGE_CREATION_TO_FIRST_FRAME_RENDER.getValue());
        c188727au.LJIIIZ("cache_invalidation", C54492La4.LIZLLL);
        c188727au.LIZLLL(C54492La4.LIZJ, "is_use_preload_data");
        c188727au.LIZLLL(((EnumC54493La5) aCallableS36S1100000_9.l1).getValue(), "result");
        c188727au.LJIIIZ("to_page", aCallableS36S1100000_9.s0);
        FMX.LJIIL("follow_feed_landing", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS36S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
