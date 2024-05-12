package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndWhenAnchorResumeLive;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowSeiUpdateStart;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiExtraInfo;
import com.bytedance.android.livesdk.sei.SeiLiveShowExtra;
import com.bytedance.android.livesdk.sei.SeiLiveShowGuestInfo;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U34 extends U39 {
    @Override // X.U39
    public final String LJIJ() {
        return "LiveShowAudienceModel";
    }

    public U34(DataChannel dataChannel) {
        super(dataChannel);
        C0NB.LJIIIZ("LiveShowAudienceModel", "init");
    }

    @Override // X.U39, X.U3C
    public final void LIZIZ(SeiAppData seiAppData) {
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        long j;
        boolean z;
        int i;
        long j2;
        int i2;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo2;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo3;
        AbstractC74727TUl LIZ;
        long j3;
        ImageModel imageModel;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo4;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo5;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo6;
        Long LJJIZ;
        java.util.Map<String, java.util.Map<String, String>> map3;
        if (seiAppData != null && (map3 = seiAppData.businessExtraInfo) != null) {
            map = map3.get("live_show_sei");
        } else {
            map = null;
        }
        if (map == null) {
            LJIL(null, "sei");
            return;
        }
        java.util.Map<String, java.util.Map<String, String>> map4 = seiAppData.businessExtraInfo;
        if (map4 == null || (map2 = map4.get("live_show_sei")) == null) {
            return;
        }
        Object fromJson = GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, C46104I7o.LJJJJZ(map2), (Class<Object>) SeiLiveShowExtra.class);
        o.LJIIIIZZ(fromJson, "get().fromJson(it.toGson…iveShowExtra::class.java)");
        SeiLiveShowExtra seiLiveShowExtra = (SeiLiveShowExtra) fromJson;
        ShowContent showContent = new ShowContent();
        showContent.showId = seiLiveShowExtra.showId;
        showContent.showStatus = seiLiveShowExtra.showStatus;
        ShowConfig showConfig = new ShowConfig();
        showContent.showConfig = showConfig;
        showConfig.durationPerGuest = seiLiveShowExtra.eachShowDuration;
        String str = seiAppData.channelId;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        showContent.channelId = j;
        showContent.version = 0L;
        showContent.showingAndReadyList = new ArrayList();
        showContent.finishedList = new ArrayList();
        List<SeiRegion> list = seiAppData.grids;
        if (list != null) {
            for (SeiRegion seiRegion : list) {
                SeiExtraInfo seiExtraInfo = seiRegion.extraInfo;
                if (seiExtraInfo != null) {
                    SeiLiveShowGuestInfo seiLiveShowGuestInfo7 = seiExtraInfo.guestLiveShowInfo;
                    if (seiLiveShowGuestInfo7 != null && seiLiveShowGuestInfo7.show_status == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || (seiExtraInfo != null && (((seiLiveShowGuestInfo5 = seiExtraInfo.guestLiveShowInfo) != null && seiLiveShowGuestInfo5.show_status == 2) || ((seiLiveShowGuestInfo6 = seiExtraInfo.guestLiveShowInfo) != null && seiLiveShowGuestInfo6.show_status == 3)))) {
                        ShowListUser showListUser = new ShowListUser();
                        SeiExtraInfo seiExtraInfo2 = seiRegion.extraInfo;
                        if (seiExtraInfo2 != null && (seiLiveShowGuestInfo4 = seiExtraInfo2.guestLiveShowInfo) != null) {
                            i = seiLiveShowGuestInfo4.show_order;
                        } else {
                            i = 0;
                        }
                        showListUser.order = i;
                        String str2 = seiRegion.uidStr;
                        o.LJIIIIZZ(str2, "it.uidStr");
                        showListUser.linkmicIdStr = str2;
                        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                        if (tq8 != null && (LIZ = tq8.LIZ()) != null) {
                            String str3 = seiRegion.uidStr;
                            o.LJIIIIZZ(str3, "it.uidStr");
                            LinkListUser linkListUser = (LinkListUser) LIZ.LJIIJJI(str3);
                            if (linkListUser != null) {
                                User user = linkListUser.user;
                                if (user != null) {
                                    j3 = user.getId();
                                } else {
                                    j3 = 0;
                                }
                                showListUser.userId = j3;
                                String LIZLLL = C05170If.LIZLLL(linkListUser.user);
                                o.LJIIIIZZ(LIZLLL, "getNickname(linkUser.user)");
                                showListUser.nickname = LIZLLL;
                                User user2 = linkListUser.user;
                                if (user2 != null) {
                                    imageModel = user2.getAvatarThumb();
                                } else {
                                    imageModel = null;
                                }
                                showListUser.avatarThumb = imageModel;
                            }
                        }
                        SeiExtraInfo seiExtraInfo3 = seiRegion.extraInfo;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo3 = seiExtraInfo3.guestLiveShowInfo) != null) {
                            j2 = seiLiveShowGuestInfo3.start_time;
                        } else {
                            j2 = 0;
                        }
                        showListUser.showStartTime = j2;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo2 = seiExtraInfo3.guestLiveShowInfo) != null) {
                            i2 = seiLiveShowGuestInfo2.show_status;
                        } else {
                            i2 = 0;
                        }
                        showListUser.status = i2;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo = seiExtraInfo3.guestLiveShowInfo) != null && seiLiveShowGuestInfo.show_status == 3) {
                            showContent.finishedList.add(showListUser);
                        } else {
                            showContent.showingAndReadyList.add(showListUser);
                        }
                    }
                }
            }
        }
        LJIL(showContent, "sei");
    }

    @Override // X.U3C
    public final AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).getShowContent(getShowContentParams), "LiveShowAudienceModel", "getShowContent").LJIILIIL(new AfS65S0100000_13(this, 227)).LJFF(new C62705OjF());
    }

    @Override // X.U39
    public final void LJIL(ShowContent showContent, String str) {
        ShowListUser showListUser;
        ShowListUser showListUser2;
        String str2;
        String str3;
        DataChannel dataChannel;
        Long l;
        ShowListUser showListUser3;
        List<ShowListUser> list;
        List<ShowListUser> list2;
        ShowListUser showListUser4;
        ShowConfig showConfig;
        List<ShowListUser> list3;
        ShowListUser showListUser5;
        List<ShowListUser> list4;
        ShowListUser showListUser6;
        DataChannel dataChannel2;
        ShowContent showContent2 = this.LIZIZ;
        if (showContent2 == null) {
            if (showContent == null) {
                return;
            }
        } else if (showContent != null && showContent2.roomId == showContent.roomId && showContent2.channelId == showContent.channelId && showContent2.showId == showContent.showId && showContent2.showStatus == showContent.showStatus && showContent2.version == showContent.version && showContent2.showCreateTime == showContent.showCreateTime && U30.LIZLLL(showContent2.showConfig, showContent.showConfig) && U30.LIZJ(showContent2.showingAndReadyList, showContent.showingAndReadyList) && U30.LIZJ(showContent2.finishedList, showContent.finishedList)) {
            return;
        }
        super.LJIL(showContent, str);
        ShowContent showContent3 = this.LIZIZ;
        if (showContent2 == null && showContent3 != null && (dataChannel2 = this.LIZ) != null) {
            dataChannel2.qv0(LiveShowSeiUpdateStart.class, showContent3);
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.qv0(LiveShowContentChangedEvent.class, showContent3);
        }
        List<ShowListUser> list5 = null;
        if (showContent2 != null && (list4 = showContent2.showingAndReadyList) != null) {
            Iterator<ShowListUser> it = list4.iterator();
            while (true) {
                if (it.hasNext()) {
                    showListUser6 = it.next();
                    if (showListUser6.status == 2) {
                        break;
                    }
                } else {
                    showListUser6 = null;
                    break;
                }
            }
            showListUser = showListUser6;
        } else {
            showListUser = null;
        }
        if (showContent3 != null && (list3 = showContent3.showingAndReadyList) != null) {
            Iterator<ShowListUser> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    showListUser5 = it2.next();
                    if (showListUser5.status == 2) {
                        break;
                    }
                } else {
                    showListUser5 = null;
                    break;
                }
            }
            showListUser2 = showListUser5;
        } else {
            showListUser2 = null;
        }
        if (showListUser != null) {
            str2 = showListUser.linkmicIdStr;
        } else {
            str2 = null;
        }
        if (showListUser2 != null) {
            str3 = showListUser2.linkmicIdStr;
        } else {
            str3 = null;
        }
        if (!o.LJ(str2, str3) && showListUser2 != null && showListUser2.linkmicIdStr != null) {
            DataChannel dataChannel4 = this.LIZ;
            if (dataChannel4 != null) {
                ShowContent showContent4 = this.LIZIZ;
                if (showContent4 != null && (showConfig = showContent4.showConfig) != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                ShowContent showContent5 = this.LIZIZ;
                if (showContent5 != null && (list2 = showContent5.showingAndReadyList) != null) {
                    Iterator<ShowListUser> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            showListUser4 = it3.next();
                            if (showListUser4.status == 2) {
                                break;
                            }
                        } else {
                            showListUser4 = null;
                            break;
                        }
                    }
                    showListUser3 = showListUser4;
                } else {
                    showListUser3 = null;
                }
                ShowContent showContent6 = this.LIZIZ;
                if (showContent6 != null) {
                    list = showContent6.showingAndReadyList;
                } else {
                    list = null;
                }
                ShowContent showContent7 = this.LIZIZ;
                if (showContent7 != null) {
                    list5 = showContent7.finishedList;
                }
                dataChannel4.qv0(LiveShowNextGuestEvent.class, new U33(l, showListUser3, list, list5));
            }
            C76548U2m.LJII();
        }
        if (showContent != null || !o.LJ(str, "sei") || showContent2 == null || showContent2.showStatus != 2 || LJIILIIL() != 0 || (dataChannel = this.LIZ) == null) {
            return;
        }
        dataChannel.pv0(LiveShowEndWhenAnchorResumeLive.class);
    }
}
