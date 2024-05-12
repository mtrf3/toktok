package com.bytedance.android.livesdk.liveroom;

import X.AbstractC28221B5t;
import X.AbstractC73672Svk;
import X.BLL;
import X.BOG;
import X.BOH;
import X.BZI;
import X.C09650Zl;
import X.C0NB;
import X.C16880lQ;
import X.C28668BMy;
import X.C28787BRn;
import X.C32151Nz;
import X.C38354F3m;
import X.C73969T1h;
import X.C79004UzY;
import X.C80797VnN;
import X.InterfaceC28262B7i;
import X.InterfaceC73592SuS;
import X.InterfaceC92693kP;
import X.Q7L;
import X.T16;
import X.X1D;
import Y.AObserverS64S0101000_14;
import Y.ARunnableS41S0100000_5;
import Y.AfS0S0100200_5;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import android.os.Handler;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.live.model.RoomMultiStatsModel;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveLoopCheckRoomTimeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveDrawLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNoStreamLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNotRecommendLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemovePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ResumeLiveCheckIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class RoomStatusController implements ISubController {
    public InterfaceC92693kP disposable;
    public long mLastPauseTime;
    public AbstractC28221B5t mListProvider;
    public RoomStatsViewModel mRoomStatsViewModel;
    public C80797VnN mViewPager;
    public static final long ROOM_REFRESH_TIME = LiveFeedRefreshTimeSetting.INSTANCE.getValue() * 1000;
    public static final long RECOMMEND_REFRESH_TIME = LiveLoopCheckRoomTimeSetting.INSTANCE.getValue() * 1000;
    public final Handler mHandler = new Handler(C16880lQ.LLJJJJ());
    public List<String> currentStatus = new ArrayList();
    public final Runnable mRefreshRoomStatsTimer = new ARunnableS41S0100000_5(this, 164);
    public final Runnable mRefreshRoomNRTimer = new ARunnableS41S0100000_5(this, 165);

    public static /* synthetic */ void lambda$checkRoom$9(Throwable th) {
    }

    public static /* synthetic */ void lambda$refreshRoomRecommendStats$7(Throwable th) {
    }

    public static /* synthetic */ void lambda$refreshRoomStats$3(Throwable th) {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    private void resetRefreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
        this.mHandler.removeCallbacks(this.mRefreshRoomNRTimer);
    }

    public List<Room> collectAllRoom() {
        int currentItem;
        if (this.mListProvider == null || this.mViewPager == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(this.mListProvider.LJIILJJIL());
        if (!C32151Nz.LJJIIJZLJL(arrayList2)) {
            try {
                if (this.mListProvider.size() > 0) {
                    currentItem = this.mViewPager.getCurrentItem() % this.mListProvider.size();
                } else {
                    currentItem = -1;
                }
                if (currentItem < 0 || currentItem >= arrayList2.size()) {
                    arrayList.addAll(arrayList2);
                } else {
                    arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                    arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public List<Room> collectUnreadRoom() {
        int currentItem;
        if (this.mListProvider == null || this.mViewPager == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(50);
        ArrayList arrayList2 = new ArrayList(this.mListProvider.LJIILJJIL());
        if (!C32151Nz.LJJIIJZLJL(arrayList2)) {
            if (this.mListProvider.size() <= 0 || (currentItem = this.mViewPager.getCurrentItem() % this.mListProvider.size()) < 0 || currentItem >= arrayList2.size()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Room room = (Room) it.next();
                    if (room != null && !room.isShow) {
                        arrayList.add(room);
                    }
                }
            } else {
                int min = Math.min(arrayList2.size(), currentItem + 50);
                int i = currentItem + 1;
                if (i < min) {
                    while (i < min) {
                        Room room2 = (Room) ListProtector.get(arrayList2, i);
                        if (room2 != null && !room2.isShow) {
                            arrayList.add(room2);
                        }
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
        if (this.mLastPauseTime > 0 && RemoveDrawLiveEndSetting.INSTANCE.getValue() && System.currentTimeMillis() - this.mLastPauseTime >= ResumeLiveCheckIntervalSetting.INSTANCE.getValue() * 1000) {
            this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
            this.mRefreshRoomStatsTimer.run();
        }
    }

    public void refreshRecommendTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomNRTimer);
        this.mHandler.postDelayed(this.mRefreshRoomNRTimer, RECOMMEND_REFRESH_TIME);
    }

    public void refreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
        this.mHandler.postDelayed(this.mRefreshRoomStatsTimer, ROOM_REFRESH_TIME);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        resetRefreshTimer();
        InterfaceC92693kP interfaceC92693kP = this.disposable;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.disposable.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
        this.mLastPauseTime = System.currentTimeMillis();
    }

    public RoomStatusController(LiveRoomFragment liveRoomFragment) {
        RoomStatsViewModel roomStatsViewModel = (RoomStatsViewModel) ViewModelProviders.of(liveRoomFragment, new BOG()).get(RoomStatsViewModel.class);
        this.mRoomStatsViewModel = roomStatsViewModel;
        roomStatsViewModel.LJLJJI.observe(liveRoomFragment, new AObserverS64S0101000_14(0, this, 0));
        this.mRoomStatsViewModel.LJLJJL.observe(liveRoomFragment, new AObserverS64S0101000_14(0, this, 1));
    }

    public /* synthetic */ void lambda$refreshRoomRecommendStats$6(Room room) {
        AbstractC28221B5t abstractC28221B5t = this.mListProvider;
        if (abstractC28221B5t != null) {
            abstractC28221B5t.LJIJI(room.getId());
        }
    }

    public /* synthetic */ void lambda$refreshRoomStats$2(Room room) {
        long j;
        AbstractC28221B5t abstractC28221B5t = this.mListProvider;
        if (abstractC28221B5t != null) {
            abstractC28221B5t.LJIJI(room.getId());
        }
        if (room.getOwner() != null) {
            j = room.getOwner().getId();
        } else {
            j = 0;
        }
        reportDeleteRoom(room.getId(), j, "fixedtime_inspection");
    }

    public void refreshRoomRecommendStats(final Map<String, RoomMultiStatsModel> map) {
        AbstractC28221B5t abstractC28221B5t = this.mListProvider;
        if (abstractC28221B5t == null || abstractC28221B5t.LJIILJJIL() == null) {
            return;
        }
        AbstractC28221B5t abstractC28221B5t2 = this.mListProvider;
        if (abstractC28221B5t2 instanceof BLL) {
            abstractC28221B5t2.LJIIJ(new InterfaceC28262B7i() { // from class: X.BOI
                @Override // X.InterfaceC28262B7i
                public final boolean LIZ(Room room) {
                    boolean lambda$refreshRoomRecommendStats$4;
                    lambda$refreshRoomRecommendStats$4 = RoomStatusController.this.lambda$refreshRoomRecommendStats$4(room, map);
                    return lambda$refreshRoomRecommendStats$4;
                }
            });
        } else {
            AbstractC73672Svk.LJJIIZ(new ArrayList(this.mListProvider.LJIILJJIL())).LJJIFFI(new InterfaceC73592SuS() { // from class: X.BOJ
                @Override // X.InterfaceC73592SuS
                public final boolean test(Object obj) {
                    boolean lambda$refreshRoomRecommendStats$5;
                    lambda$refreshRoomRecommendStats$5 = RoomStatusController.this.lambda$refreshRoomRecommendStats$5(map, (Room) obj);
                    return lambda$refreshRoomRecommendStats$5;
                }
            }).LJJJLIIL(new AfS36S0101000_5(1, this, 12), new AfS17S0001000_5(1, 5));
        }
        refreshRecommendTimer();
    }

    public void refreshRoomStats(final Map<String, RoomStatsModel> map) {
        AbstractC28221B5t abstractC28221B5t = this.mListProvider;
        if (abstractC28221B5t == null || abstractC28221B5t.LJIILJJIL() == null) {
            return;
        }
        AbstractC28221B5t abstractC28221B5t2 = this.mListProvider;
        if (abstractC28221B5t2 instanceof BLL) {
            abstractC28221B5t2.LJIIJ(new InterfaceC28262B7i() { // from class: X.BOK
                @Override // X.InterfaceC28262B7i
                public final boolean LIZ(Room room) {
                    boolean lambda$refreshRoomStats$0;
                    lambda$refreshRoomStats$0 = RoomStatusController.this.lambda$refreshRoomStats$0(map, room);
                    return lambda$refreshRoomStats$0;
                }
            });
        } else {
            AbstractC73672Svk.LJJIIZ(new ArrayList(this.mListProvider.LJIILJJIL())).LJJIFFI(new InterfaceC73592SuS() { // from class: X.BOL
                @Override // X.InterfaceC73592SuS
                public final boolean test(Object obj) {
                    return RoomStatusController.lambda$refreshRoomStats$1(map, (Room) obj);
                }
            }).LJJJLIIL(new AfS36S0101000_5(0, this, 16), new AfS37S0000000_5(6));
        }
        refreshTimer();
    }

    public void checkRoom(int i) {
        Room LJIIIIZZ;
        InterfaceC92693kP interfaceC92693kP = this.disposable;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.disposable.dispose();
        }
        AbstractC28221B5t abstractC28221B5t = this.mListProvider;
        if (abstractC28221B5t == null) {
            return;
        }
        int size = abstractC28221B5t.size();
        if (i < 0 || i >= size || (LJIIIIZZ = this.mListProvider.LJIIIIZZ(i)) == null) {
            return;
        }
        long j = 0;
        if (LJIIIIZZ.getId() == 0) {
            return;
        }
        long id = LJIIIIZZ.getId();
        if (LJIIIIZZ.getOwner() != null) {
            j = LJIIIIZZ.getOwner().getId();
        }
        this.disposable = ((RoomStatApi) Q7L.LIZIZ(RoomStatApi.class)).checkRoom(String.valueOf(id), "toplive_inspection").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S0100200_5(id, j, this, 1), new AfS17S0001000_5(1, 9));
    }

    public boolean getCurrentCheckConfig(EnterRoomConfig enterRoomConfig) {
        this.currentStatus.clear();
        boolean LIZ = C28668BMy.LIZ(enterRoomConfig);
        if (RemoveNotRecommendLiveSetting.INSTANCE.enable() && LIZ) {
            this.currentStatus.add("nr");
        }
        if (RemovePauseLiveSetting.INSTANCE.enable() && LIZ) {
            this.currentStatus.add("pause");
        }
        if (RemoveNoStreamLiveSetting.INSTANCE.enable()) {
            this.currentStatus.add("nostream");
        }
        return !C79004UzY.LJJIFFI(this.currentStatus);
    }

    public void setListProvider(AbstractC28221B5t abstractC28221B5t) {
        this.mListProvider = abstractC28221B5t;
    }

    public void setViewPager(C80797VnN c80797VnN) {
        this.mViewPager = c80797VnN;
    }

    public void startCheckTimer(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && getCurrentCheckConfig(enterRoomConfig)) {
            refreshRecommendTimer();
        }
    }

    /* renamed from: checkNR */
    public boolean lambda$refreshRoomRecommendStats$4(Room room, Map<String, RoomMultiStatsModel> map) {
        FilterInfoData filterInfoData;
        RoomMultiStatsModel roomMultiStatsModel = map.get(String.valueOf(room.getId()));
        if (roomMultiStatsModel != null && (filterInfoData = roomMultiStatsModel.filterInfo) != null && filterInfoData.isFiltered) {
            String str = filterInfoData.reason;
            if (C38354F3m.LIZJ(str, "nostream")) {
                logLiveDelete(room, str);
                return true;
            }
            if (!room.isShow) {
                logLiveDelete(room, str);
            }
            return !room.isShow;
        }
        return false;
    }

    public /* synthetic */ boolean lambda$refreshRoomRecommendStats$5(Map map, Room room) {
        FilterInfoData filterInfoData;
        RoomMultiStatsModel roomMultiStatsModel = (RoomMultiStatsModel) map.get(String.valueOf(room.getId()));
        if (roomMultiStatsModel != null && (filterInfoData = roomMultiStatsModel.filterInfo) != null && filterInfoData.isFiltered) {
            String str = filterInfoData.reason;
            if (C38354F3m.LIZJ(str, "nostream")) {
                logLiveDelete(room, str);
                return true;
            }
            if (!room.isShow) {
                logLiveDelete(room, str);
            }
            return !room.isShow;
        }
        return false;
    }

    public /* synthetic */ boolean lambda$refreshRoomStats$0(Map map, Room room) {
        long j;
        if (room != null) {
            String valueOf = String.valueOf(room.getId());
            if (map.containsKey(valueOf) && !((RoomStatsModel) map.get(valueOf)).alive) {
                if (room.getOwner() != null) {
                    j = room.getOwner().getId();
                } else {
                    j = 0;
                }
                reportDeleteRoom(room.getId(), j, "fixedtime_inspection");
                return true;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$refreshRoomStats$1(Map map, Room room) {
        String valueOf = String.valueOf(room.getId());
        if (map.containsKey(valueOf) && !((RoomStatsModel) map.get(valueOf)).alive) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void logLiveDelete(com.bytedance.android.livesdkapi.depend.model.live.Room r7, java.lang.String r8) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting r2 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.INSTANCE
            double r0 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.getSAMPLE_100()
            java.lang.String r3 = "livesdk_live_delete"
            boolean r0 = r2.isReport(r3, r0)
            if (r0 != 0) goto Lf
            return
        Lf:
            r8.getClass()
            int r2 = r8.hashCode()
            r0 = 3524(0xdc4, float:4.938E-42)
            r5 = 2
            r1 = 1
            java.lang.String r4 = "nr"
            if (r2 == r0) goto L82
            r0 = 106440182(0x65825f6, float:4.0652974E-35)
            if (r2 == r0) goto L77
            r0 = 1567246465(0x5d6a4881, float:1.0551178E18)
            if (r2 == r0) goto L6c
        L28:
            r0 = -1
        L29:
            r2 = 0
            if (r0 == 0) goto L31
            if (r0 == r1) goto L69
            if (r0 == r5) goto L66
            r4 = r2
        L31:
            com.bytedance.android.live.base.model.user.User r0 = r7.getOwner()
            if (r0 == 0) goto L43
            com.bytedance.android.live.base.model.user.User r0 = r7.getOwner()
            long r0 = r0.getId()
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L43:
            X.BZI r3 = X.C28787BRn.LIZ(r3)
            r3.LJIIZILJ()
            long r0 = r7.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "del_room_id"
            r3.LJIJJ(r1, r0)
            java.lang.String r0 = "del_anchor_id"
            r3.LJIJJ(r2, r0)
            java.lang.String r2 = "del_type"
            java.lang.String r1 = "draw"
            java.lang.String r0 = "del_reason"
            X.C06490Nh.LIZLLL(r3, r1, r2, r4, r0)
            return
        L66:
            java.lang.String r4 = "disconnected"
            goto L31
        L69:
            java.lang.String r4 = "paused"
            goto L31
        L6c:
            java.lang.String r0 = "nostream"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L75
            goto L28
        L75:
            r0 = 2
            goto L29
        L77:
            java.lang.String r0 = "pause"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L80
            goto L28
        L80:
            r0 = 1
            goto L29
        L82:
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L89
            goto L28
        L89:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.liveroom.RoomStatusController.logLiveDelete(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public void lambda$checkRoom$8(long j, long j2, BOH boh) {
        AbstractC28221B5t abstractC28221B5t;
        if (!C32151Nz.LJJIIJZLJL(boh.data)) {
            RoomStatsModel roomStatsModel = (RoomStatsModel) ListProtector.get(boh.data, 0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ttlivesdk room status controller check room status, model:");
            LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, roomStatsModel));
            C0NB.LIZ(X1D.LIZIZ(LIZ));
            if (roomStatsModel != null && !roomStatsModel.alive && (abstractC28221B5t = this.mListProvider) != null) {
                abstractC28221B5t.LJIJI(roomStatsModel.roomId);
                reportDeleteRoom(j, j2, "inspection");
            }
        }
    }

    private void reportDeleteRoom(long j, long j2, String str) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_finish_delete", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_finish_delete");
        LIZ.LJIJJ(Long.valueOf(j), "delete_room_id");
        LIZ.LJIJJ(Long.valueOf(j2), "delete_anchor_id");
        LIZ.LJIJJ(str, "delete_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJI();
            LIZ.LJJIIZI();
        }
    }
}
