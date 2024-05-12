package X;

import Y.AfS36S0101000_5;
import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.performance.TopLiveDelayCreateFragmentSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowFeedDrawLoopSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.PreLiveDnsOptimizeSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.google.gson.p;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public final class BLL extends AbstractC28221B5t implements InterfaceC28602BKk {
    public DrawRoomListModel LJLILLLLZI;
    public final ArrayList<Room> LJLJI;
    public final ArrayList<EnterRoomConfig> LJLJJI;
    public final HashMap<Long, String> LJLJJL;
    public final HashSet<Long> LJLJJLL;
    public final HashMap<String, HashSet<Long>> LJLJL;
    public FeedExtra LJLJLJ;
    public FeedExtra LJLJLLL;
    public final long LJLL;
    public final long LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public final C73318Sq2 LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public String LJZI;
    public String LJZL;
    public final String LL;
    public final String LLD;
    public final String LLF;
    public EnterRoomConfig.DrawParams LLFF;
    public final boolean LLFFF;
    public long LLFII;
    public int LLFZ;
    public final EnterRoomConfig.ECWrapData LLI;
    public final boolean LLIFFJFJJ;
    public List<FeedItem> LLII;
    public int LLIIII;
    public C73411SrX LLIIIILZ;
    public final AtomicBoolean LLIIIJ;
    public boolean LLIIIL;
    public final String LLIIIZ;
    public final String LLIIJI;
    public final String LLIIJLIL;
    public String LLIIL;

    @Override // X.InterfaceC28602BKk
    public final int LIZJ() {
        int i;
        List<FeedItem> list = this.LLII;
        int i2 = 0;
        if (list == null || list.isEmpty() || (i = this.LLIIII) < 0) {
            return -1;
        }
        List<FeedItem> list2 = this.LLII;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILL() {
        FeedExtra feedExtra = this.LJLJLJ;
        boolean z = false;
        if (feedExtra != null && !feedExtra.hasMore) {
            z = true;
        }
        return !z;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJ() {
        this.LJLJJLL.clear();
        this.LJLJL.clear();
        this.LJLJJI.clear();
        this.LJLJI.clear();
        this.LJLLLLLL.LIZLLL();
        this.LJLLLL = false;
    }

    @Override // X.InterfaceC28220B5s
    public final int size() {
        FeedExtra feedExtra = this.LJLJLJ;
        if (feedExtra != null && !feedExtra.hasMore && this.LJLJI.size() > 0) {
            FollowFeedDrawLoopSetting followFeedDrawLoopSetting = FollowFeedDrawLoopSetting.INSTANCE;
            if (C29306Beo.LJJIFFI(Boolean.valueOf(followFeedDrawLoopSetting.getValue().isEnable())) && this.LJLJI.size() >= followFeedDrawLoopSetting.getValue().getThreshold()) {
                BLP blp = LiveFeedDraw.Companion;
                String str = this.LL;
                String str2 = this.LLD;
                blp.getClass();
                if (BLP.LIZJ(str, str2).isFollow) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC28221B5t
    public final List<Room> LJIILJJIL() {
        return this.LJLJI;
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILLIIL() {
        return this.LJLLLL;
    }

    public static final String LJIJJLI(String str) {
        if (!TextUtils.isEmpty(str) && s.LJJJLZIJ(str, "/webcast/feed/", false)) {
            if ((((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) && !s.LJJJLZIJ(str, "&debug=true", false)) {
                return i0.LJFF(str, "&debug=true");
            }
            return str;
        }
        return str;
    }

    public static final void LJJ(FeedItem feedItem) {
        int i = feedItem.type;
        if (i == 1 || i == 2) {
            BLG blg = feedItem.item;
            if (blg instanceof Room) {
                o.LJII(blg, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                Room room = (Room) blg;
                room.setLog_pb(feedItem.logPb);
                User owner = room.getOwner();
                if (owner != null) {
                    owner.setLogPb(feedItem.logPb);
                }
                room.setRequestId(feedItem.resId);
                room.isFromRecommendCard = feedItem.isRecommendCard;
            }
        }
    }

    public static boolean LJJI(EnterRoomConfig enterRoomConfig) {
        if (o.LJ("live_merge", enterRoomConfig.mRoomsData.enterFromMerge) && o.LJ("live_cover", enterRoomConfig.mRoomsData.enterMethod)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28602BKk
    public final void LIZ(int i) {
        LJJIFFI(i, LIZJ(), "landscape_loadmore");
    }

    @Override // X.InterfaceC28602BKk
    public final void LIZIZ(int i) {
        this.LLII = new ArrayList();
        this.LLIIII = i;
        FeedExtra feedExtra = this.LJLJLJ;
        this.LJLJLLL = feedExtra;
        if (feedExtra != null) {
            feedExtra.hasMore = true;
        }
        this.LLIIIJ.set(true);
        LJJIFFI(i, this.LLIIII, "landscape_refresh");
    }

    @Override // X.InterfaceC28220B5s
    public final EnterRoomConfig LIZLLL(int i) {
        int size;
        if (this.LJLJJI.size() <= 0 || (size = i % this.LJLJJI.size()) < 0 || size >= this.LJLJJI.size()) {
            return new EnterRoomConfig();
        }
        Object obj = ListProtector.get(this.LJLJJI, size);
        o.LJIIIIZZ(obj, "mRoomArgList[idx]");
        return (EnterRoomConfig) obj;
    }

    @Override // X.InterfaceC28220B5s
    public final int LJ(EnterRoomConfig enterRoomConfig) {
        long j;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData != null) {
            j = roomsData.roomId;
        } else {
            j = -1;
        }
        int size = this.LJLJJI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLJJI, i);
            if (((EnterRoomConfig) obj).mRoomsData.roomId == j && obj != null) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC28602BKk
    public final void LJI(int i) {
        boolean z;
        List<FeedItem> list;
        Long l;
        FeedExtra feedExtra = this.LJLJLLL;
        if (feedExtra != null) {
            this.LJLJLJ = feedExtra;
        }
        C73411SrX c73411SrX = this.LLIIIILZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLLLL = false;
        this.LLIIIJ.set(true);
        if (i >= 0 && i < this.LJLJI.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (list = this.LLII) == null || ((ArrayList) list).isEmpty()) {
            this.LLII = null;
            this.LLIIII = -1;
            return;
        }
        long id = ((Room) ListProtector.get(this.LJLJI, i)).getId();
        List<FeedItem> list2 = this.LLII;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                Room room = ((FeedItem) it.next()).getRoom();
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                arrayList.add(l);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Long l2 = (Long) next;
                if (l2 == null || l2.longValue() != id) {
                    arrayList2.add(next);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Long l3 = (Long) it3.next();
                if (l3 != null) {
                    LJJIIJZLJL(l3.longValue(), false);
                }
            }
        }
        LJIIJJI();
        this.LLII = null;
        this.LLIIII = -1;
    }

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final void LJII(Room room) {
        if (room != null) {
            int size = this.LJLJI.size();
            for (int i = 0; i < size; i++) {
                if (((Room) ListProtector.get(this.LJLJI, i)).getId() == room.getId()) {
                    ListProtector.set(this.LJLJI, i, room);
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final Room LJIIIIZZ(int i) {
        int size;
        if (this.LJLJI.size() <= 0 || (size = i % this.LJLJI.size()) < 0 || size >= this.LJLJI.size()) {
            return null;
        }
        return (Room) ListProtector.get(this.LJLJI, size);
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i) {
        if (C79004UzY.LJJIFFI(this.LJLJI) || C79004UzY.LJJIFFI(this.LJLJJI)) {
            return;
        }
        Iterator<Room> it = this.LJLJI.iterator();
        o.LJIIIIZZ(it, "mRoomList.iterator()");
        Iterator<EnterRoomConfig> it2 = this.LJLJJI.iterator();
        o.LJIIIIZZ(it2, "mRoomArgList.iterator()");
        boolean z = false;
        while (it.hasNext() && it2.hasNext()) {
            Room next = it.next();
            o.LJIIIIZZ(next, "listIterator.next()");
            Room room = next;
            it2.next();
            if (interfaceC28262B7i.LIZ(room)) {
                it.remove();
                it2.remove();
                this.LJLJJL.remove(Long.valueOf(room.getId()));
                z = true;
            }
        }
        if (!z) {
            return;
        }
        LJIIJJI();
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIZILJ(int i) {
        long j;
        String str;
        if (this.LJLL <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadMore enterRoomId ");
            LIZ.append(this.LJLL);
            LIZ.append(" return");
            C0NB.LIZIZ("DrawRoomListProvider", X1D.LIZIZ(LIZ));
            return;
        }
        FeedExtra feedExtra = this.LJLJLJ;
        if (feedExtra != null && !feedExtra.hasMore && !BKU.LIZJ(BKU.LIZIZ())) {
            C0NB.LIZIZ("DrawRoomListProvider", "loadMore not hasMore return");
            return;
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new DrawRoomListModel();
        }
        if (this.LJLLLL) {
            C0NB.LIZIZ("DrawRoomListProvider", "loadMore isLoadMoreRunning return");
            return;
        }
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        ArrayList<EnterRoomConfig> arrayList = enterRoomConfig.mLogData.moreConfig;
        C2UU c2uu = null;
        if (LJJI(enterRoomConfig) && TopLiveDelayCreateFragmentSetting.INSTANCE.getDelayCreate() && !C79004UzY.LJJIFFI(arrayList)) {
            LJIL(enterRoomConfig);
            enterRoomConfig.mLogData.moreConfig = null;
            C0NB.LIZIZ("DrawRoomListProvider", "loadMore delayCreate return");
            return;
        }
        String LJIJJLI = LJIJJLI(this.LJLLILLLL);
        this.LJLLILLLL = LJIJJLI;
        if (i > 0) {
            String LIZ2 = B82.LIZ(LJIJJLI, "bubble_room_id");
            o.LJIIIIZZ(LIZ2, "removeUrlParam(mUrl, \"bubble_room_id\")");
            this.LJLLILLLL = LIZ2;
            String LIZ3 = B82.LIZ(LIZ2, "bubble_owner_id");
            o.LJIIIIZZ(LIZ3, "removeUrlParam(mUrl, \"bubble_owner_id\")");
            this.LJLLILLLL = LIZ3;
        }
        DrawRoomListModel drawRoomListModel = this.LJLILLLLZI;
        if (drawRoomListModel != null) {
            FeedExtra feedExtra2 = this.LJLJLJ;
            if (feedExtra2 != null) {
                j = feedExtra2.maxTime;
            } else {
                j = 0;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LJLLJ);
            if (this.LLIIIL) {
                str = "_no_more";
            } else {
                FeedExtra feedExtra3 = this.LJLJLJ;
                if (feedExtra3 == null || feedExtra3.maxTime == 0) {
                    str = "_refresh";
                } else {
                    str = "_loadmore";
                }
            }
            LIZ4.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ4);
            String str2 = this.LJLLL;
            long j2 = this.LJLL;
            long j3 = this.LJLLI;
            String str3 = this.LJLLILLLL;
            if (this.LLFFF) {
                c2uu = new C2UU(Integer.valueOf(this.LLFZ), Long.valueOf(this.LLFII));
            }
            AbstractC73672Svk roomList$default = DrawRoomListModel.getRoomList$default(drawRoomListModel, j, LIZIZ, str2, j2, j3, str3, c2uu, LIZLLL(0), this.LLF, BOT.LIZJ(), null, 1024, null);
            if (roomList$default != null) {
                this.LJLLLL = true;
                this.LJLLLLLL.LIZ(roomList$default.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS4S0100100_5(System.currentTimeMillis(), this, 11), new AfS57S0100000_5(this, 209)));
            }
        }
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJI(long j) {
        if (C79004UzY.LJJIFFI(this.LJLJI) || C79004UzY.LJJIFFI(this.LJLJJI)) {
            return;
        }
        LJJIIJZLJL(j, true);
    }

    public final void LJIJJ(FeedItem feedItem) {
        if ((((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) && !TextUtils.isEmpty(feedItem.debugInfo)) {
            HashMap<Long, String> hashMap = this.LJLJJL;
            Long valueOf = Long.valueOf(feedItem.getRoom().getId());
            String str = feedItem.debugInfo;
            o.LJIIIIZZ(str, "item.debugInfo");
            hashMap.put(valueOf, str);
        }
    }

    public final void LJIL(EnterRoomConfig enterRoomConfig) {
        Room room;
        long j;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        Long LJJIZ;
        ArrayList<EnterRoomConfig> arrayList = enterRoomConfig.mLogData.moreConfig;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(arrayList, i);
            o.LJIIIIZZ(obj, "configSparseArray[i]");
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) obj;
            LJJIIJ(enterRoomConfig2);
            LJJIII(enterRoomConfig2, C113554cx.LJJJLIIL());
            this.LJLJJI.add(enterRoomConfig2);
            if (this.LLIFFJFJJ || PreLiveDnsOptimizeSetting.INSTANCE.isEnable()) {
                room = (Room) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, enterRoomConfig2.mRoomsData.preLoadRoomInfo, Room.class);
                if (room == null) {
                    room = new Room();
                }
            } else {
                room = new Room();
            }
            ArrayList<Room> arrayList3 = this.LJLJI;
            room.setId(enterRoomConfig2.mRoomsData.roomId);
            room.setIdStr(String.valueOf(room.getId()));
            room.isFromRecommendCard = !TextUtils.isEmpty(enterRoomConfig2.mRoomsData.enterFromMergeRecommend);
            User user = new User();
            String str = enterRoomConfig2.mLogData.anchorId;
            if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            user.setId(j);
            user.setIdStr(String.valueOf(user.getId()));
            room.setOwner(user);
            arrayList3.add(room);
            if ((this.LLIFFJFJJ || PreLiveDnsOptimizeSetting.INSTANCE.isEnable()) && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                arrayList2.add(C38393F4z.LJFF(pullData));
            }
        }
        if (this.LLIFFJFJJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("toplives feed data, size=");
            LIZ.append(arrayList2.size());
            LIZ.append(",\n");
            C0NB.LIZIZ("preDownloadStreamData", X1D.LIZIZ(LIZ));
            String str2 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str2);
            if (LIZIZ != null) {
                LIZIZ.LJ(arrayList2);
            }
        }
    }

    public final void LJJIIJ(EnterRoomConfig enterRoomConfig) {
        boolean z = this.LJZ;
        if (z) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.fromNewStyle = z;
            roomsData.fromDrawerStyle = this.LJZI;
            roomsData.enterFromLiveSource = this.LJZL;
            EnterRoomConfig.DrawParams drawParams = this.LLFF;
            enterRoomConfig.drawParams = drawParams;
            roomsData.feedUrl = this.LJLLILLLL;
            if (drawParams.openLiveFromGameDrawer) {
                roomsData.windowMode = "small_picture";
            } else if (drawParams.openLiveFromDrawer) {
                roomsData.windowMode = "small_picture";
            } else {
                roomsData.windowMode = "full_screen";
            }
        }
    }

    @Override // X.InterfaceC28602BKk
    public final boolean LJFF(int i, int i2) {
        int LIZJ = LIZJ();
        if (LIZJ <= 0 || LIZJ < i2 || LIZJ - i2 > i) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC28221B5t
    public final String LJIIL(int i, long j) {
        if (i == 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LogId:");
            LIZ.append(this.LLIIL);
            LIZ.append(". hasMore = ");
            LIZ.append(LJIILL());
            return X1D.LIZIZ(LIZ);
        }
        String str = this.LJLJJL.get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIII(EnterRoomConfig enterRoomConfig, java.util.Map<String, String> map) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll(this.LLI.ecCommonExtraParam);
        hashMap.putAll(map);
        int i = 0;
        EnterRoomConfig.ECWrapData eCWrapData = new EnterRoomConfig.ECWrapData(i, i, null, 0 == true ? 1 : 0, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
        eCWrapData.isFromECContext = this.LLI.isFromECContext;
        eCWrapData.ecCommonExtraParam = hashMap;
        hashMap.remove("source_module");
        String str = this.LLIIJLIL;
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("_inner_flow");
            hashMap.put("source_module", X1D.LIZIZ(LIZ));
        }
        enterRoomConfig.mECData = eCWrapData;
    }

    public final void LJJIIJZLJL(long j, boolean z) {
        int size = this.LJLJI.size();
        for (int i = 0; i < size; i++) {
            if (((Room) ListProtector.get(this.LJLJI, i)).getId() == j) {
                if (this.LJLJJI.size() > i) {
                    ListProtector.remove(this.LJLJJI, i);
                }
                if (this.LJLJI.size() > i) {
                    ListProtector.remove(this.LJLJI, i);
                }
                this.LJLJJL.remove(Long.valueOf(j));
                List<FeedItem> list = this.LLII;
                if (list != null) {
                    int i2 = this.LLIIII;
                    int i3 = -1;
                    if (i <= i2 && i2 > 0) {
                        this.LLIIII = i2 - 1;
                    }
                    Iterator<FeedItem> it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Room room = it.next().getRoom();
                        if (room != null && room.getId() == j) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                    if (!list.isEmpty() && i3 >= 0 && i3 < list.size()) {
                        ListProtector.remove(list, i3);
                    }
                }
                C0NB.LJIIIZ("removeAndSwipeItem", "remove");
                if (z) {
                    LJIIJJI();
                    return;
                }
                return;
            }
        }
    }

    public final void LJJIFFI(int i, int i2, String str) {
        C2UU c2uu;
        long j = 0;
        if (this.LJLL <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("landscapeRefresh enterRoomId ");
            LIZ.append(this.LJLL);
            LIZ.append(" return");
            C0NB.LIZIZ("DrawRoomListProvider", X1D.LIZIZ(LIZ));
            return;
        }
        FeedExtra feedExtra = this.LJLJLJ;
        if (feedExtra != null && !feedExtra.hasMore) {
            C0NB.LIZIZ("DrawRoomListProvider", "landscapeRefresh not hasMore return");
            return;
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new DrawRoomListModel();
        }
        if (this.LJLLLL) {
            C0NB.LIZIZ("DrawRoomListProvider", "landscapeRefresh isLoadMoreRunning return");
            return;
        }
        EnterRoomConfig config = B57.LIZ.LIZ().mEnterRoomConfig;
        o.LJIIIIZZ(config, "config");
        LJIL(config);
        String LJIJJLI = LJIJJLI(this.LJLLILLLL);
        this.LJLLILLLL = LJIJJLI;
        if (i > 0) {
            String LIZ2 = B82.LIZ(LJIJJLI, "bubble_room_id");
            o.LJIIIIZZ(LIZ2, "removeUrlParam(mUrl, \"bubble_room_id\")");
            this.LJLLILLLL = LIZ2;
            String LIZ3 = B82.LIZ(LIZ2, "bubble_owner_id");
            o.LJIIIIZZ(LIZ3, "removeUrlParam(mUrl, \"bubble_owner_id\")");
            this.LJLLILLLL = LIZ3;
        }
        DrawRoomListModel drawRoomListModel = this.LJLILLLLZI;
        if (drawRoomListModel != null) {
            FeedExtra feedExtra2 = this.LJLJLJ;
            if (feedExtra2 != null) {
                j = feedExtra2.maxTime;
            }
            String str2 = this.LJLLL;
            long j2 = this.LJLL;
            long j3 = this.LJLLI;
            String str3 = this.LJLLILLLL;
            if (this.LLFFF) {
                c2uu = new C2UU(Integer.valueOf(this.LLFZ), Long.valueOf(this.LLFII));
            } else {
                c2uu = null;
            }
            AbstractC73672Svk roomList$default = DrawRoomListModel.getRoomList$default(drawRoomListModel, j, str, str2, j2, j3, str3, c2uu, LIZLLL(0), null, false, null, 1536, null);
            if (roomList$default != null) {
                this.LJLLLL = true;
                InterfaceC92693kP LJJJLIIL = roomList$default.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(i2, this, 35), new AfS57S0100000_5(this, 210));
                this.LLIIIILZ = (C73411SrX) LJJJLIIL;
                this.LJLLLLLL.LIZ(LJJJLIIL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void LJJII(List<? extends FeedItem> list, FeedExtra feedExtra, int i) {
        String str;
        String str2;
        Room room;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String str3;
        String str4;
        String str5;
        EnterRoomConfig.RoomsData roomsData;
        OSZ LIZLLL;
        String str6;
        CommerceStruct commerceStruct;
        String str7;
        m LIZ;
        p LJJIJL;
        m LIZ2;
        p LJJIJL2;
        int i2 = i;
        if (list == null || list.isEmpty()) {
            return;
        }
        long j = 0;
        if (this.LLFII == 0) {
            if (feedExtra != null && (LIZ2 = feedExtra.LIZ()) != null && (LJJIJL2 = LIZ2.LJJIJL("session_id")) != null) {
                j = LJJIJL2.LJIJJLI();
            }
            this.LLFII = j;
        }
        if (feedExtra != null && (LIZ = feedExtra.LIZ()) != null && (LJJIJL = LIZ.LJJIJL("impr_id")) != null) {
            str = LJJIJL.LJJIFFI();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.LLFZ++;
        HashSet<Long> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        ?? r8 = 0;
        ?? r6 = 1;
        boolean z = false;
        for (FeedItem feedItem : list) {
            if (feedItem.item == null) {
                try {
                    feedItem.item = feedItem.getRoom();
                    LJJ(feedItem);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            BLG blg = feedItem.item;
            if ((blg instanceof Room) && (room = (Room) blg) != null) {
                User owner = room.getOwner();
                if (owner != null && this.LJLL == owner.getLiveRoomId()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Remove duplicate room ");
                    LIZ3.append(this.LJLL);
                    C0NB.LIZIZ("DrawRoomListProvider", X1D.LIZIZ(LIZ3));
                } else {
                    room.isFromRecommendCard = feedItem.isRecommendCard;
                    if (C28668BMy.LIZIZ(r6, room)) {
                        C28668BMy.LIZLLL(room);
                    } else {
                        EnterRoomConfig LIZJ = C28238B6k.LIZJ(r6, room);
                        LIZJ.mRoomsData.anchorRelationType = feedItem.anchorRelationType;
                        if (C38354F3m.LJ(LIZJ.mStreamData.pullStreamData) && C38354F3m.LJ(LIZJ.mStreamData.pullStreamUrl)) {
                            z = true;
                        }
                        FlareInfo flareInfo = feedItem.flareInfo;
                        if (flareInfo != null) {
                            EnterRoomConfig.RoomsData roomsData2 = LIZJ.mRoomsData;
                            roomsData2.isShowFlare = flareInfo.isFlare;
                            roomsData2.flareTaskId = flareInfo.taskId;
                        }
                        LIZJ.mRoomsData.isFresh = feedItem.isFresh;
                        String str8 = this.LLIIJI;
                        if (str8 != null) {
                            LIZJ.mLogData.enterRoomViaPreviewGuide = str8;
                        }
                        if ((this.LLIFFJFJJ || PreLiveDnsOptimizeSetting.INSTANCE.isEnable()) && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                            arrayList.add(C38393F4z.LJFF(pullData));
                        }
                        String str9 = feedItem.debugInfo;
                        LJJIIJ(LIZJ);
                        OSZ[] oszArr = new OSZ[4];
                        oszArr[r8] = new OSZ("rec_params", str9);
                        oszArr[1] = new OSZ("request_id", str);
                        oszArr[2] = new OSZ("source_page_type", "live");
                        oszArr[3] = new OSZ("rec_session_id", String.valueOf(this.LLFII));
                        LJJIII(LIZJ, C113554cx.LJJL(oszArr));
                        if (TextUtils.equals(this.LL, "homepage_hot")) {
                            EnterRoomConfig.ECWrapData eCWrapData = LIZJ.mECData;
                            Room room2 = feedItem.getRoom();
                            if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null && (str7 = commerceStruct.oecInitDataString) != null) {
                                try {
                                    str6 = JSONObjectProtectorUtils.getString(new JSONObject(str7), "recommend_info");
                                } catch (Exception unused) {
                                }
                                eCWrapData.ecRecommendInfo = str6;
                            }
                            str6 = null;
                            eCWrapData.ecRecommendInfo = str6;
                        }
                        if (ujb.o.LJJJLIIL(this.LJLLJ, "vertical_", false) && ujb.o.LJJJJ(this.LJLLJ, "_draw", false)) {
                            EnterRoomConfig.RoomsData roomsData3 = LIZJ.mRoomsData;
                            roomsData3.drawerTabInnerFeedSuggest = this.LLIIIL ? 1 : 0;
                            roomsData3.openLiveFromDrawerTab = this.LLIIIZ;
                        }
                        if (i2 >= 0) {
                            if (B7P.LJ(room) && (LIZLLL = B7P.LIZLLL(true, room)) != null && ((Number) LIZLLL.getFirst()).intValue() > ((Number) LIZLLL.getSecond()).intValue()) {
                                ListProtector.add(this.LJLJI, i2, room);
                                ListProtector.add(this.LJLJJI, i2, LIZJ);
                                List<FeedItem> list2 = this.LLII;
                                if (list2 != null) {
                                    ((ArrayList) list2).add(feedItem);
                                }
                                i2++;
                            }
                        } else {
                            this.LJLJI.add(room);
                            this.LJLJJI.add(LIZJ);
                        }
                        if (feedExtra != null) {
                            str3 = feedExtra.unreadExtra;
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            EnterRoomConfig.RoomsData roomsData4 = LIZJ.mRoomsData;
                            if (roomsData4 != null) {
                                if (feedExtra != null) {
                                    str4 = feedExtra.unreadExtra;
                                } else {
                                    str4 = null;
                                }
                                roomsData4.unreadExtra = str4;
                            }
                            if (feedExtra != null && (str5 = feedExtra.unreadExtra) != null && s.LJJJLZIJ(str5, "follow_live_empty_loadmore", false) && (roomsData = LIZJ.mRoomsData) != null) {
                                roomsData.enterFromMerge = BKU.LIZJ;
                                roomsData.enterMethod = BKU.LIZLLL;
                            }
                        }
                        hashSet.add(Long.valueOf(room.getId()));
                        LJIJJ(feedItem);
                    }
                }
            }
            r6 = 1;
            r8 = 0;
        }
        if (i2 >= 0 && feedExtra != null && !feedExtra.hasMore) {
            LJJIIJZLJL(Long.MIN_VALUE, r8);
            Room room3 = new Room();
            room3.setId(Long.MIN_VALUE);
            ListProtector.add(this.LJLJI, i2, room3);
            ListProtector.add(this.LJLJJI, i2, C28238B6k.LIZJ(r6, room3));
            FeedItem feedItem2 = new FeedItem();
            feedItem2.setRoom(room3);
            List<FeedItem> list3 = this.LLII;
            if (list3 != null) {
                ((ArrayList) list3).add(feedItem2);
            }
            hashSet.add(Long.valueOf(room3.getId()));
            LJIJJ(feedItem2);
            this.LLIIIJ.set(r8);
        }
        if (this.LLIFFJFJJ) {
            C0NB.LIZIZ("preDownloadStreamData", "inner feed data, size=" + arrayList.size() + ", \n ");
            String str10 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str10 == null) {
                str10 = "";
            }
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str10);
            if (LIZIZ != null) {
                LIZIZ.LJ(arrayList);
            }
        }
        if (PreLiveDnsOptimizeSetting.INSTANCE.isEnable()) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new BMT(arrayList, null), 2);
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str11 = C28259B7f.LIZIZ.LIZ.get("/webcast/feed/");
            if (str11 == null) {
                str11 = "";
            }
            linkedHashMap.put("logid", str11);
            C0K2.LJII(r8, "ttlive_webcast_feed_empty_stream", linkedHashMap);
        }
        if (feedExtra == null || (str2 = feedExtra.unreadExtra) == null || str2.length() == 0 || str2 == null) {
            return;
        }
        HashMap<String, HashSet<Long>> hashMap = this.LJLJL;
        StringBuilder LJFF = C72972SkS.LJFF(str2, '_');
        LJFF.append(this.LJLZ);
        hashMap.put(X1D.LIZIZ(LJFF), hashSet);
        this.LJLZ++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BLL(com.bytedance.android.livesdkapi.session.EnterRoomConfig r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLL.<init>(com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
