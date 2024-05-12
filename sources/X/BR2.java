package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagUserInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BR2 implements OnMessageListener {
    public final /* synthetic */ BR1 LJLIL;

    public BR2(BR1 br1) {
        this.LJLIL = br1;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage it) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        String str4;
        String LJIIIIZZ;
        String str5;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        FollowInfo followInfo;
        String LIZJ;
        String str6;
        String str7;
        int i;
        int i2;
        GoodyBagCommonDetail goodyBagCommonDetail;
        String str8;
        String str9;
        FollowInfo followInfo2;
        InterfaceC29405BgP LIZIZ2;
        InterfaceC05190Ih interfaceC05190Ih2;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Goody Bag receive message ");
            LIZ.append(C16880lQ.LJLLILLLL(it.getClass()));
            C0NB.LIZIZ("GoodyBagPresenter", X1D.LIZIZ(LIZ));
        }
        BR1 br1 = this.LJLIL;
        o.LJIIIIZZ(it, "it");
        br1.getClass();
        if (it instanceof GoodyBagMessage) {
            boolean z = br1.LIZJ;
            GoodyBagMessage goodyBagMessage = (GoodyBagMessage) it;
            boolean z2 = br1.LJ;
            HashMap hashMap = new HashMap();
            B83 LIZ2 = B83.LIZ();
            String str10 = "";
            if (LIZ2 == null || (LIZIZ2 = LIZ2.LIZIZ()) == null || (interfaceC05190Ih2 = ((C29374Bfu) LIZIZ2).LIZIZ) == null) {
                str = "";
            } else {
                hashMap.put("user_id", String.valueOf(interfaceC05190Ih2.getId()));
                str = String.valueOf(interfaceC05190Ih2.getId());
            }
            String str11 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", obj);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo2 = owner.getFollowInfo()) == null || (str9 = Q4K.LIZJ(followInfo2)) == null) {
                    str9 = "";
                }
                hashMap.put("follow_status", str9);
            }
            hashMap.put("msg_id", String.valueOf(goodyBagMessage.getMessageId()));
            hashMap.put("type", String.valueOf(goodyBagMessage.type));
            GoodyBagBaseInfo goodyBagBaseInfo = goodyBagMessage.baseInfo;
            if (goodyBagBaseInfo == null || (str2 = goodyBagBaseInfo.goodyBagId) == null) {
                str2 = "";
            }
            hashMap.put("goody_bag_id", str2);
            if (z2) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("joined", obj2);
            hashMap.put("winner_count", String.valueOf(goodyBagMessage.winners.size()));
            if (!z && goodyBagMessage.type == 3) {
                List<GoodyBagWinnerInfo> list = goodyBagMessage.winners;
                if (list != null) {
                    for (GoodyBagWinnerInfo goodyBagWinnerInfo : list) {
                        GoodyBagUserInfo goodyBagUserInfo = goodyBagWinnerInfo.userInfo;
                        if (goodyBagUserInfo == null || (str8 = goodyBagUserInfo.userId) == null) {
                            str8 = "-1";
                        }
                        if (o.LJ(str, str8)) {
                            i = goodyBagWinnerInfo.coins;
                            break;
                        }
                    }
                }
                i = 0;
                str11 = CardStruct.IStatusCode.DEFAULT;
                C116484hg.LIZIZ(hashMap, "win", str11, i, "coins");
                GoodyBagBaseInfo goodyBagBaseInfo2 = goodyBagMessage.baseInfo;
                if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail = goodyBagBaseInfo2.commonDetail) != null) {
                    i2 = goodyBagCommonDetail.openAt;
                } else {
                    i2 = 0;
                }
                hashMap.put("dur_from_open_at", String.valueOf(C31012CFc.LIZIZ() - (i2 * 1000)));
            }
            BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_msg_receive");
            LIZ3.LJJIFFI(hashMap);
            LIZ3.LJIIZILJ();
            LIZ3.LJIIL("other");
            LIZ3.LJIIIZ("live");
            LIZ3.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_goody_bag_msg_receive", hashMap);
            GoodyBagBaseInfo goodyBagBaseInfo3 = goodyBagMessage.baseInfo;
            if (goodyBagBaseInfo3 != null) {
                str3 = goodyBagBaseInfo3.roomId;
            } else {
                str3 = null;
            }
            Room room2 = br1.LIZLLL;
            if (room2 != null) {
                str4 = room2.getIdStr();
            } else {
                str4 = null;
            }
            if (!o.LJ(str3, str4)) {
                return;
            }
            int i3 = goodyBagMessage.type;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return;
                        }
                        C0NB.LIZIZ("GoodyBagPresenter", "message is Winner");
                        GoodyBagBaseInfo goodyBagBaseInfo4 = br1.LJIIJ;
                        if (goodyBagBaseInfo4 == null || (str6 = goodyBagBaseInfo4.goodyBagId) == null) {
                            str6 = "";
                        }
                        GoodyBagBaseInfo goodyBagBaseInfo5 = goodyBagMessage.baseInfo;
                        if (goodyBagBaseInfo5 == null || (str7 = goodyBagBaseInfo5.goodyBagId) == null) {
                            str7 = "";
                        }
                        if (!o.LJ(str6, str7) || o.LJ(str6, "")) {
                            return;
                        }
                        br1.LJIIIZ = goodyBagMessage;
                        if (br1.LJIIL) {
                            return;
                        }
                        br1.LJIIL = true;
                        br1.LJIIJJI();
                        return;
                    }
                    C0NB.LIZIZ("GoodyBagPresenter", "message is Join");
                    GoodyBagBaseInfo goodyBagBaseInfo6 = goodyBagMessage.baseInfo;
                    if (goodyBagBaseInfo6 != null) {
                        GoodyBagBaseInfo goodyBagBaseInfo7 = br1.LJIIJ;
                        if (goodyBagBaseInfo7 != null) {
                            str5 = goodyBagBaseInfo7.goodyBagId;
                        } else {
                            str5 = null;
                        }
                        if (o.LJ(str5, goodyBagBaseInfo6.goodyBagId)) {
                            br1.LJIIJ = goodyBagMessage.baseInfo;
                        }
                        String str12 = br1.LJI;
                        HashMap hashMap2 = new HashMap();
                        Room room3 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room3 != null) {
                            String idStr2 = room3.getIdStr();
                            if (idStr2 == null) {
                                idStr2 = String.valueOf(room3.getId());
                            }
                            hashMap2.put("room_id", idStr2);
                            hashMap2.put("anchor_id", String.valueOf(room3.getOwnerUserId()));
                            User owner2 = room3.getOwner();
                            if (owner2 != null && (followInfo = owner2.getFollowInfo()) != null && (LIZJ = Q4K.LIZJ(followInfo)) != null) {
                                str10 = LIZJ;
                            }
                            hashMap2.put("follow_status", str10);
                        }
                        B83 LIZ4 = B83.LIZ();
                        if (LIZ4 != null && (LIZIZ = LIZ4.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                            UFE.LIZJ(interfaceC05190Ih, hashMap2, "user_id");
                        }
                        hashMap2.put(WM7.SCENE_SERVICE, BR4.LIZ());
                        hashMap2.put("online_watch_users", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
                        hashMap2.put("enter_from_merge", BJM.LJFF());
                        hashMap2.put("enter_method", BJM.LJIIIIZZ());
                        hashMap2.put("action_type", BJM.LIZLLL());
                        hashMap2.put("goody_bag_id", goodyBagBaseInfo6.goodyBagId);
                        GoodyBagCoinDetail goodyBagCoinDetail = goodyBagBaseInfo6.coinDetail;
                        if (goodyBagCoinDetail != null) {
                            hashMap2.put("set_coin", String.valueOf(goodyBagCoinDetail.totalCoin));
                        }
                        GoodyBagCommonDetail goodyBagCommonDetail2 = goodyBagBaseInfo6.commonDetail;
                        if (goodyBagCommonDetail2 != null) {
                            hashMap2.put("set_winner", String.valueOf(goodyBagCommonDetail2.winnerHeadcount));
                            hashMap2.put("set_countdown_min", String.valueOf(goodyBagCommonDetail2.countDownMinutes));
                            hashMap2.put("set_join_method", String.valueOf(goodyBagCommonDetail2.participateMethod));
                            hashMap2.put("left_countdown_s", String.valueOf(goodyBagCommonDetail2.openAt - (C30725C4b.LIZ() / 1000)));
                            if (str12 != null) {
                                hashMap2.put("share_platform", str12);
                            }
                        }
                        BZI LIZ5 = C28787BRn.LIZ("livesdk_goody_bag_join_success");
                        LIZ5.LJJIFFI(hashMap2);
                        LIZ5.LJIIZILJ();
                        LIZ5.LJIIL("click");
                        LIZ5.LJIIIZ("live");
                        LIZ5.LJJIIJZLJL();
                        br1.LJI = null;
                    }
                    br1.LJIILJJIL(true);
                    return;
                }
                C0NB.LIZIZ("GoodyBagPresenter", "message is send");
                if (br1.LIZJ) {
                    if (br1.LJFF || (LJIIIIZZ = br1.LJIIIIZZ(goodyBagMessage.baseInfo)) == null) {
                        return;
                    }
                    br1.LJFF = true;
                    InterfaceC28772BQy interfaceC28772BQy = br1.LIZIZ;
                    if (interfaceC28772BQy != null) {
                        interfaceC28772BQy.LJJIJL(LJIIIIZZ);
                    }
                    C0NB.LIZIZ("GoodyBagPresenter", "receive goodybag send msg: updateCurrentGoodyBag");
                    br1.LJIIJ = goodyBagMessage.baseInfo;
                    br1.LJIIJ("message");
                    br1.LJIILJJIL(false);
                    C28773BQz.LIZ = br1.LJIIJ;
                    return;
                }
                if (br1.LJIIJ != null || br1.LJFF) {
                    C0NB.LIZIZ("GoodyBagPresenter", "already have a goody bag");
                    br1.LJIIL();
                    ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.NAME, "shortTouchTypeGoodyBag");
                }
                C0NB.LIZIZ("GoodyBagPresenter", String.valueOf(C16880lQ.LLLLIIIILLL().getId()));
                String LJIIIIZZ2 = br1.LJIIIIZZ(goodyBagMessage.baseInfo);
                if (LJIIIIZZ2 == null) {
                    return;
                }
                br1.LJFF = true;
                InterfaceC28772BQy interfaceC28772BQy2 = br1.LIZIZ;
                if (interfaceC28772BQy2 != null) {
                    interfaceC28772BQy2.LJJIJL(LJIIIIZZ2);
                }
                C0NB.LIZIZ("GoodyBagPresenter", "receive goodybag send msg: updateCurrentGoodyBag");
                br1.LJIIJ = goodyBagMessage.baseInfo;
                br1.LJIIJ("message");
                br1.LJIILJJIL(false);
                C28773BQz.LIZ = br1.LJIIJ;
                return;
            }
            C0NB.LIZIZ("GoodyBagPresenter", "message is unknown");
        }
    }
}
