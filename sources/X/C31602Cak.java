package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDislikeVersion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31602Cak implements C92D {
    public final /* synthetic */ LongPressWidget LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C31602Cak(Context context, LongPressWidget longPressWidget) {
        this.LIZ = longPressWidget;
        this.LIZIZ = context;
    }

    @Override // X.C92D
    public final void LIZ(float f, float f2) {
        int value;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        LiveRoomStruct liveRoomStruct;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> boostToggleTags;
        FeedRoomTag feedRoomTag;
        Aweme aweme;
        Aweme aweme2;
        String secUid;
        Aweme aweme3;
        C86343Xud LJLZ;
        Aweme aweme4;
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        LiveRoomStruct liveRoomStruct2;
        String str2;
        Aweme aweme5;
        this.LIZ.LJLJI = true;
        Room room = new Room();
        C86343Xud LJLZ2 = this.LIZ.LJLZ();
        String str3 = "";
        if (LJLZ2 != null && (liveRoomStruct2 = LJLZ2.LIZIZ) != null) {
            LongPressWidget longPressWidget = this.LIZ;
            room.setId(liveRoomStruct2.id);
            User user = new User();
            user.setSecUid(liveRoomStruct2.owner.getSecUid());
            user.setId(liveRoomStruct2.ownerUserId);
            FollowInfo followInfo = new FollowInfo();
            followInfo.setFollowStatus(liveRoomStruct2.owner.getFollowStatus());
            user.setFollowInfo(followInfo);
            user.setSecret(liveRoomStruct2.owner.isAccuratePrivateAccount() ? 1 : 0);
            user.setNickName(liveRoomStruct2.owner.getNickname());
            room.setOwner(user);
            C86343Xud LJLZ3 = longPressWidget.LJLZ();
            if (LJLZ3 == null || (aweme5 = LJLZ3.LIZ) == null || (str2 = aweme5.getRequestId()) == null) {
                str2 = "";
            }
            room.setRequestId(str2);
            room.setOwnerUserId(liveRoomStruct2.ownerUserId);
            room.setLiveTypeAudio(liveRoomStruct2.liveTypeAudio);
            room.liveSubOnly = liveRoomStruct2.liveSubOnly;
            ImageModel imageModel = new ImageModel();
            imageModel.setUri(liveRoomStruct2.roomCover.getUri());
            imageModel.setUrls(liveRoomStruct2.roomCover.getUrlList());
            room.setCover(imageModel);
        }
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            Context context = this.LIZIZ;
            LongPressWidget longPressWidget2 = this.LIZ;
            C29929Bor c29929Bor = new C29929Bor(room);
            C86343Xud LJLZ4 = longPressWidget2.LJLZ();
            if (LJLZ4 != null && (aweme3 = LJLZ4.LIZ) != null && aweme3.isAd() && (LJLZ = longPressWidget2.LJLZ()) != null && (aweme4 = LJLZ.LIZ) != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null && (dislikeInfo = awemeRawAd.getDislikeInfo()) != null && dislikeInfo.getEnable() == 1) {
                value = 0;
            } else {
                value = LiveDislikeVersion.INSTANCE.getValue();
            }
            C86343Xud LJLZ5 = longPressWidget2.LJLZ();
            String str4 = null;
            if (LJLZ5 != null) {
                str = LJLZ5.LIZJ;
            } else {
                str = null;
            }
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            o.LJIIIIZZ(currentUserID, "get()\n                  …class.java).currentUserID");
            c29929Bor.LIZLLL = CastLongProtector.parseLong(currentUserID);
            room.getId();
            room.getOwnerUserId();
            c29929Bor.LJIIZILJ = room.getRequestId();
            c29929Bor.LJJ = str;
            c29929Bor.LJJI = "live_cell";
            c29929Bor.LJJJJJL = "fyp";
            c29929Bor.LJIILJJIL = false;
            c29929Bor.LJJIII = true;
            c29929Bor.LJJII = "long_press";
            c29929Bor.LJJIIZ = C35971E9v.LIZ();
            if (room.liveSubOnly == 1) {
                z = true;
            } else {
                z = false;
            }
            c29929Bor.LJJIIJZLJL = z;
            User owner = room.getOwner();
            if (owner != null && (secUid = owner.getSecUid()) != null) {
                str3 = secUid;
            }
            c29929Bor.LJIJI = str3;
            C86343Xud LJLZ6 = longPressWidget2.LJLZ();
            if (LJLZ6 != null && (aweme2 = LJLZ6.LIZ) != null && aweme2.isAd()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c29929Bor.LJJIIJ = LJJIJIL.M(str, "live_cell", z2);
            c29929Bor.LJJJIL = new C31606Cao(longPressWidget2);
            c29929Bor.LJJJJIZL = new C29243Bdn(context, room, str);
            c29929Bor.LJJJJ = new C31604Cam(longPressWidget2, room, str);
            c29929Bor.LJJJJI = new C31603Cal(longPressWidget2, str, room, value);
            C86343Xud LJLZ7 = longPressWidget2.LJLZ();
            if (LJLZ7 != null && (aweme = LJLZ7.LIZ) != null) {
                str4 = aweme.getAid();
            }
            c29929Bor.LJJIJIIJI = str4;
            c29929Bor.LIZIZ("dislike_version", String.valueOf(value));
            c29929Bor.LIZ(Boolean.TRUE, "is_preview");
            C86343Xud LJLZ8 = longPressWidget2.LJLZ();
            if (LJLZ8 != null && (liveRoomStruct = LJLZ8.LIZIZ) != null && (feedRoomTagList = liveRoomStruct.feedRoomTagList) != null && (boostToggleTags = feedRoomTagList.getBoostToggleTags()) != null && (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(boostToggleTags)) != null && !TextUtils.isEmpty(feedRoomTag.getContent())) {
                z3 = true;
            } else {
                z3 = false;
            }
            c29929Bor.LJJJLIIL = z3;
            c29929Bor.LJJJLL = new I9B(context, longPressWidget2);
            C86343Xud LJLZ9 = longPressWidget2.LJLZ();
            if (LJLZ9 != null && C78963Uyt.LJII(LJLZ9)) {
                c29929Bor.LJJIFFI = "fyp_long_press";
            } else {
                C86343Xud LJLZ10 = longPressWidget2.LJLZ();
                if (LJLZ10 != null && C78963Uyt.LJI(LJLZ10)) {
                    c29929Bor.LJJIFFI = "following_long_press";
                } else {
                    C86343Xud LJLZ11 = longPressWidget2.LJLZ();
                    if (LJLZ11 != null && C78963Uyt.LJIIIIZZ(LJLZ11)) {
                        c29929Bor.LJJIFFI = "livetab_long_press";
                    }
                }
            }
            C29930Bos c29930Bos = new C29930Bos(c29929Bor);
            LJJIJIL.LJII(context, room, c29930Bos, longPressWidget2.LJLJLJ, new C29242Bdm(room, c29930Bos, longPressWidget2));
        }
    }
}
