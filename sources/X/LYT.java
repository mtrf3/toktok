package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.feed.ui.LiveFollowFragment;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.feed.FollowRecommendItem;

/* loaded from: classes10.dex */
public final class LYT implements InterfaceC54736Le0 {
    public final /* synthetic */ LiveFollowFragment LIZ;

    public LYT(LiveFollowFragment liveFollowFragment) {
        this.LIZ = liveFollowFragment;
    }

    @Override // X.InterfaceC54736Le0
    public final void LIZIZ(FollowRecommendItem followRecommendItem) {
        int i;
        String str;
        ILiveOuterService LJJJLL;
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZIZ;
        Long l;
        User owner;
        List<FollowRecommendItem> list;
        List<FollowRecommendItem> list2;
        List<FollowRecommendItem> list3;
        LiveFollowFragment liveFollowFragment = this.LIZ;
        C31413CUn c31413CUn = liveFollowFragment.LJLJJI;
        List<?> items = c31413CUn.LJLIL;
        o.LJIIIIZZ(items, "items");
        int indexOf = items.indexOf(followRecommendItem);
        LYN lyn = liveFollowFragment.LJLJJLL;
        if (lyn != null && (list3 = lyn.LJ) != null) {
            i = ((ArrayList) list3).indexOf(followRecommendItem);
        } else {
            i = 0;
        }
        LYN lyn2 = liveFollowFragment.LJLJJLL;
        if (lyn2 != null && (list2 = lyn2.LJ) != null) {
            ((ArrayList) list2).remove(followRecommendItem);
        }
        List<?> items2 = c31413CUn.LJLIL;
        o.LJIIIIZZ(items2, "items");
        C65777Prh.LIZ(items2).remove(followRecommendItem);
        LYN lyn3 = liveFollowFragment.LJLJJLL;
        if (lyn3 != null && (list = lyn3.LJ) != null && ((ArrayList) list).size() == 0) {
            List<?> list4 = c31413CUn.LJLIL;
            ListProtector.remove(list4, list4.size() - 1);
            c31413CUn.notifyDataSetChanged();
        } else {
            c31413CUn.notifyItemRemoved(indexOf);
        }
        LYN lyn4 = liveFollowFragment.LJLJJLL;
        Integer num = null;
        if (lyn4 != null) {
            Room room = followRecommendItem.data;
            if (room != null && (owner = room.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            if (((RBX) HG3.LJIILL()).isLogin()) {
                LiveOuterService.LJJJLL().LJJIJIL().LJJL().removeRecommendUser(valueOf).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Er
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.9Es
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
            }
        }
        Room room2 = followRecommendItem.data;
        if (room2 != null) {
            String roomId = String.valueOf(room2.getId());
            String anchorId = String.valueOf(room2.getOwnerUserId());
            String str2 = followRecommendItem.recommendReason;
            o.LJIIIZ(roomId, "roomId");
            o.LJIIIZ(anchorId, "anchorId");
            if (str2 != null) {
                num = Integer.valueOf(CastIntegerProtector.parseInt(str2));
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    str = "Recently watched";
                } else if (num.intValue() == 2) {
                    str = "Recently sent Gifts to";
                }
                LJJJLL = LiveOuterService.LJJJLL();
                if (LJJJLL == null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_live_cover_second_list_dislike")) != null && (LIZIZ = LJJLIIJ.LIZIZ(C113554cx.LJJL(new OSZ("enter_from_merge", "homepage_follow"), new OSZ("enter_method", "live_cover"), new OSZ("room_id", roomId), new OSZ("anchor_id", anchorId), new OSZ("recommend_type", str), new OSZ("room_position", String.valueOf(i))))) != null) {
                    LIZIZ.LJJIIJZLJL();
                    return;
                }
                return;
            }
            str = "";
            LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL == null) {
            }
        }
    }

    @Override // X.InterfaceC54736Le0
    public final void LIZ(View view, Object obj) {
        List<FollowRecommendItem> list;
        String str;
        int i = 0;
        if (obj instanceof FollowingInterestUser) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            FollowingInterestUser followingInterestUser = (FollowingInterestUser) obj;
            List<FollowingInterestUser> list2 = FollowSkyLightHelper.LJIJJLI;
            if (list2 != null) {
                i = ((ArrayList) list2).indexOf(obj);
            }
            LYU.LJIILJJIL(context, followingInterestUser, list2, i, view, 1);
            return;
        }
        if (!(obj instanceof FollowRecommendItem)) {
            return;
        }
        FollowRecommendItem followRecommendItem = (FollowRecommendItem) obj;
        LYN lyn = this.LIZ.LJLJJLL;
        ArrayList<String> arrayList = null;
        if (lyn != null) {
            list = lyn.LJ;
        } else {
            list = null;
        }
        Room room = followRecommendItem.data;
        if (room == null) {
            return;
        }
        long id = room.getId();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<FollowRecommendItem> it = list.iterator();
            while (it.hasNext()) {
                Room room2 = it.next().data;
                if (room2 != null) {
                    long id2 = room2.getId();
                    if (id2 == id) {
                        ListProtector.add(arrayList2, 0, Long.valueOf(id2));
                    } else {
                        arrayList2.add(Long.valueOf(id2));
                    }
                }
            }
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mRoomsData.enterSourcePosition = LYU.LJI(view);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.forceUseMultiListProvider = true;
        roomsData.roomIds = ORZ.LLJIJIL(arrayList2);
        enterRoomConfig.mRoomsData.enterMethod = "live_cover_recommend";
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.liveRecommendReason = followRecommendItem.recommendReason;
        Room room3 = followRecommendItem.data;
        if (room3 == null || (str = Long.valueOf(room3.getOwnerUserId()).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logData.anchorId = str;
        enterRoomConfig.mRoomsData.enterType = "click";
        Room room4 = followRecommendItem.data;
        if (room4 != null) {
            if (room4.getCover() != null && !C32151Nz.LJJIIJZLJL(room4.getCover().getUrls())) {
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                List<String> urls = room4.getCover().getUrls();
                if (urls instanceof ArrayList) {
                    arrayList = (ArrayList) urls;
                }
                roomsData2.bgUrls = arrayList;
            } else if (room4.getOwner().getAvatarThumb() != null && !C32151Nz.LJJIIJZLJL(room4.getOwner().getAvatarThumb().getUrls())) {
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                List<String> urls2 = room4.getOwner().getAvatarThumb().getUrls();
                if (urls2 instanceof ArrayList) {
                    arrayList = (ArrayList) urls2;
                }
                roomsData3.bgUrls = arrayList;
            }
        }
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        roomsData4.roomId = id;
        roomsData4.enterFromMerge = "homepage_follow";
        roomsData4.roomIds = ORZ.LLJIJIL(arrayList2);
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        if (list != null) {
            i = list.indexOf(followRecommendItem);
        }
        logData2.positionOutsideLiveRoom = i;
        enterRoomConfig.mRoomsData.followStatus = CardStruct.IStatusCode.DEFAULT;
        LiveOuterService.LJJJLL().LJIILL().LJIILJJIL(view.getContext(), enterRoomConfig);
    }
}
