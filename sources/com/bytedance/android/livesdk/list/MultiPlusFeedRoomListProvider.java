package com.bytedance.android.livesdk.list;

import X.AbstractC28221B5t;
import X.BJN;
import X.BL6;
import X.BPN;
import X.C28238B6k;
import X.C29162BcU;
import X.C73318Sq2;
import X.C73969T1h;
import X.CN1;
import X.InterfaceC28262B7i;
import X.JBR;
import X.T16;
import X.X1D;
import Y.AfS31S0201000_5;
import Y.AfS36S0101000_5;
import Y.AfS3S1100100_5;
import Y.AfS57S0100000_5;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class MultiPlusFeedRoomListProvider extends AbstractC28221B5t implements GenericLifecycleObserver {
    public final HashMap<Long, String> LJLILLLLZI = new HashMap<>();
    public final List<RoomInfo> LJLJI;
    public final List<Room> LJLJJI;
    public final List<EnterRoomConfig> LJLJJL;
    public final EnterRoomConfig LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public DrawRoomListModel LJLJLLL;
    public FeedExtra LJLL;
    public final boolean LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final EnterRoomConfig.DrawParams LJLLL;
    public final Long LJLLLL;
    public final List<Room> LJLLLLLL;
    public final List<EnterRoomConfig> LJLZ;
    public final C73318Sq2 LJZ;
    public String LJZI;
    public final HashSet<Long> LJZL;
    public final long[] LL;
    public int LLD;
    public int LLF;
    public boolean LLFF;
    public final boolean LLFFF;
    public String LLFII;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.AbstractC28221B5t
    public final List<Room> LJIILJJIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJLJJI);
        arrayList.addAll(this.LJLLLLLL);
        return arrayList;
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILL() {
        if (this.LJLL != null && !this.LLFFF && BL6.LIZ(this.LJLJJLL)) {
            return this.LJLL.hasMore;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJZ.LIZLLL();
        BJN.LIZLLL(null);
    }

    @Override // X.InterfaceC28220B5s
    public final int size() {
        return this.LJLLLLLL.size() + this.LJLJI.size();
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILLIIL() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC28220B5s
    public final EnterRoomConfig LIZLLL(int i) {
        EnterRoomConfig enterRoomConfig;
        if (i < ((ArrayList) this.LJLJI).size()) {
            if (BPN.LIZIZ(this.LJLJJLL.mRoomsData.enterMethod) != RankTypeV2.LJIILL) {
                BJN.LIZLLL(BPN.LIZIZ(this.LJLJJLL.mRoomsData.enterMethod).rankName);
            } else {
                BJN.LIZLLL(this.LJLJJLL.mRoomsData.enterMethod);
            }
        } else {
            BJN.LIZLLL("live_merge_content");
        }
        EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
        if (i >= 0 && i < size()) {
            if (i < ((ArrayList) this.LJLJI).size()) {
                if (i < ((ArrayList) this.LJLJJL).size() && ListProtector.get(this.LJLJJL, i) != null) {
                    enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LJLJJL, i);
                } else {
                    enterRoomConfig2.mRoomsData.roomId = ((RoomInfo) ListProtector.get(this.LJLJI, i)).getRoomId();
                    enterRoomConfig2.mLogData.anchorId = ((RoomInfo) ListProtector.get(this.LJLJI, i)).getAnchorId();
                }
                if (this.LJLJJLL.mRoomsData.roomId > 0 && ListProtector.get(this.LJLJI, i) != null && this.LJLJJLL.mRoomsData.roomId == ((RoomInfo) ListProtector.get(this.LJLJI, i)).getRoomId()) {
                    enterRoomConfig2 = this.LJLJJLL;
                }
            } else if (i < size()) {
                if (i < ((ArrayList) this.LJLZ).size() + ((ArrayList) this.LJLJI).size()) {
                    enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(this.LJLZ, i - ((ArrayList) this.LJLJI).size());
                } else {
                    C28238B6k.LIZLLL((Room) ListProtector.get(this.LJLLLLLL, i - ((ArrayList) this.LJLJI).size()), enterRoomConfig2);
                    ((ArrayList) this.LJLZ).add(enterRoomConfig2);
                }
                if (!BL6.LIZ(this.LJLJJLL)) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
                    roomsData.enterFromMerge = this.LJLJJLL.mRoomsData.enterMethod;
                    roomsData.enterMethod = "draw_loadmore";
                }
            }
            EnterRoomConfig enterRoomConfig3 = this.LJLJJLL;
            if (enterRoomConfig3 != null) {
                if (!TextUtils.isEmpty(enterRoomConfig3.mLogData.requestId)) {
                    enterRoomConfig2.mLogData.requestId = this.LJLJJLL.mLogData.requestId;
                }
                if (!TextUtils.isEmpty(this.LJLJJLL.mLogData.logPb)) {
                    enterRoomConfig2.mLogData.logPb = this.LJLJJLL.mLogData.logPb;
                }
            }
            enterRoomConfig2.mRoomsData.fromNewStyle = this.LJLLI;
            enterRoomConfig2.drawParams = this.LJLLL;
            if (BL6.LIZ(this.LJLJJLL) && (enterRoomConfig = this.LJLJJLL) != null) {
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData2.gameLiveExtra = roomsData3.gameLiveExtra;
                roomsData2.roomIds = roomsData3.roomIds;
            }
        }
        return enterRoomConfig2;
    }

    @Override // X.InterfaceC28220B5s
    public final int LJ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        for (int i = 0; i < size(); i++) {
            if (i < ((ArrayList) this.LJLJI).size() && j == ((RoomInfo) ListProtector.get(this.LJLJI, i)).getRoomId()) {
                return i;
            }
            int size = i - ((ArrayList) this.LJLJI).size();
            if (size >= 0 && size < ((ArrayList) this.LJLLLLLL).size() && j == ((Room) ListProtector.get(this.LJLLLLLL, size)).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final Room LJIIIIZZ(int i) {
        if (i >= 0 && i < size()) {
            if (i < ((ArrayList) this.LJLJJI).size()) {
                if (i < this.LLD || i > this.LLF) {
                    LJIJJLI(this.LLD, LJIJJ(i));
                    return null;
                }
                return (Room) ListProtector.get(this.LJLJJI, i);
            }
            if (this.LJLLLLLL != null && ((ArrayList) this.LJLZ).size() > i - ((ArrayList) this.LJLJJI).size()) {
                return (Room) ListProtector.get(this.LJLLLLLL, i - ((ArrayList) this.LJLJJI).size());
            }
        }
        return null;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i) {
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        Iterator it2 = ((ArrayList) this.LJLJJL).iterator();
        Iterator it3 = ((ArrayList) this.LJLJI).iterator();
        boolean z = false;
        while (it.hasNext() && it2.hasNext() && it3.hasNext()) {
            Room room = (Room) it.next();
            it2.next();
            it3.next();
            if (interfaceC28262B7i.LIZ(room)) {
                it.remove();
                it2.remove();
                it3.remove();
                z = true;
            }
        }
        Iterator it4 = ((ArrayList) this.LJLLLLLL).iterator();
        Iterator it5 = ((ArrayList) this.LJLZ).iterator();
        while (it4.hasNext() && it5.hasNext()) {
            Room room2 = (Room) it4.next();
            it5.next();
            if (interfaceC28262B7i.LIZ(room2)) {
                it4.remove();
                it5.remove();
                z = true;
            }
        }
        if (z) {
            LJIIJJI();
        }
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIZILJ(int i) {
        String str;
        Map<String, String> map;
        long j;
        if (this.LJLJL) {
            return;
        }
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new DrawRoomListModel();
        }
        if (this.LJLJJLL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJLL.mRoomsData.enterFromMerge);
            LIZ.append("_");
            LIZ.append(this.LJLJJLL.mRoomsData.enterMethod);
            str = X1D.LIZIZ(LIZ);
            map = this.LJLJJLL.mRoomsData.gameLiveExtra;
        } else {
            str = "";
            map = null;
        }
        String LJ = a1.LJ("weekly_explore", "_", "draw_loadmore");
        if (BL6.LIZIZ(str) && !this.LLFFF) {
            LJ = this.LLFF ? "related_empty_loadmore" : "related_live_loadmore";
        }
        if (!TextUtils.isEmpty(this.LJZI) && this.LJZI.contains("/webcast/feed/") && ((((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) && !this.LJZI.contains("&debug=true"))) {
            StringBuilder LIZ2 = X1D.LIZ();
            this.LJZI = JBR.LJFF(LIZ2, this.LJZI, "&debug=true", LIZ2);
        }
        this.LJLJL = true;
        long currentTimeMillis = System.currentTimeMillis();
        DrawRoomListModel drawRoomListModel = this.LJLJLLL;
        FeedExtra feedExtra = this.LJLL;
        if (feedExtra == null) {
            j = 0;
        } else {
            j = feedExtra.maxTime;
        }
        String channelId = LiveFeedDraw.getChannelId("weekly_explore", "draw_loadmore");
        EnterRoomConfig.RoomsData roomsData = this.LJLJJLL.mRoomsData;
        this.LJZ.LIZ(drawRoomListModel.getRoomList(j, LJ, channelId, roomsData.roomId, CastLongProtector.parseLong(roomsData.userId), this.LJZI, null, LIZLLL(0), null, false, map).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS3S1100100_5(this, LJ, currentTimeMillis, 2), new AfS57S0100000_5(this, 184)));
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJI(long j) {
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            Room room = (Room) it.next();
            if (room == null || room.getId() == j) {
                it.remove();
            }
        }
        Iterator it2 = ((ArrayList) this.LJLJJL).iterator();
        while (it2.hasNext()) {
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) it2.next();
            if (enterRoomConfig != null && enterRoomConfig.mRoomsData.roomId == j) {
                it2.remove();
            }
        }
        Iterator it3 = ((ArrayList) this.LJLJI).iterator();
        while (it3.hasNext()) {
            RoomInfo roomInfo = (RoomInfo) it3.next();
            if (roomInfo == null || roomInfo.getRoomId() == j) {
                it3.remove();
            }
        }
        Iterator it4 = ((ArrayList) this.LJLLLLLL).iterator();
        while (it4.hasNext()) {
            Room room2 = (Room) it4.next();
            if (room2 == null || room2.getId() == j) {
                it4.remove();
            }
        }
        Iterator it5 = ((ArrayList) this.LJLZ).iterator();
        while (it5.hasNext()) {
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) it5.next();
            if (enterRoomConfig2 == null || enterRoomConfig2.mRoomsData.roomId == j) {
                it5.remove();
            }
        }
        this.LJZL.remove(Long.valueOf(j));
        LJIIJJI();
    }

    public final long[] LJIJJ(int i) {
        int size = ((ArrayList) this.LJLJI).size();
        long[] jArr = new long[0];
        if (i >= this.LLF) {
            int min = Math.min(size - i, 30);
            int i2 = (i + min) - 1;
            jArr = new long[min];
            for (int i3 = i; i3 <= i2; i3++) {
                jArr[i3 - i] = this.LL[i3];
            }
            if (this.LLD == -1) {
                this.LLD = i;
            }
            this.LLF = i2;
        } else if (i <= this.LLD) {
            int min2 = Math.min(30, i);
            int i4 = (i - min2) + 1;
            jArr = new long[min2];
            for (int i5 = i4; i5 <= i; i5++) {
                jArr[i5 - i4] = this.LL[i5];
            }
            if (this.LLF == -1) {
                this.LLF = i;
            }
            this.LLD = i4;
        }
        return jArr;
    }

    @Override // X.AbstractC28221B5t
    public final String LJIIL(int i, long j) {
        if (i == 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("logId=");
            LIZ.append(this.LLFII);
            LIZ.append(", hasMore");
            LIZ.append(LJIILL());
            return X1D.LIZIZ(LIZ);
        }
        String str = this.LJLILLLLZI.get(Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    public final void LJIJJLI(int i, long[] jArr) {
        if (jArr == null || jArr.length == 0 || this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        this.LJZ.LIZ(C29162BcU.LIZJ(jArr).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS31S0201000_5(i, this, jArr, 1), new AfS36S0101000_5(4, this, 30)));
    }

    public MultiPlusFeedRoomListProvider(Lifecycle lifecycle, List<RoomInfo> list, int i, EnterRoomConfig enterRoomConfig, String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.LJLJI = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJLJJI = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.LJLJJL = arrayList3;
        this.LJLLLLLL = new ArrayList();
        this.LJLZ = new ArrayList();
        this.LJZ = new C73318Sq2();
        this.LJZL = new HashSet<>();
        this.LLFF = false;
        this.LLFFF = false;
        this.LJLJJLL = enterRoomConfig;
        arrayList.addAll(list);
        this.LJZI = str;
        ArrayList arrayList4 = (ArrayList) list;
        this.LL = new long[arrayList4.size()];
        int size = arrayList4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        int size2 = arrayList4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(null);
        }
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            if (ListProtector.get(list, i4) != null) {
                this.LL[i4] = ((RoomInfo) ListProtector.get(list, i4)).getRoomId();
            } else {
                this.LL[i4] = 0;
            }
        }
        this.LJLLLL = Long.valueOf(this.LJLJJLL.mRoomsData.roomId);
        EnterRoomConfig enterRoomConfig2 = this.LJLJJLL;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
        this.LJLLI = roomsData.fromNewStyle;
        this.LJLLILLLL = roomsData.fromDrawerStyle;
        this.LJLLJ = roomsData.enterFromLiveSource;
        EnterRoomConfig.DrawParams clone = enterRoomConfig2.drawParams.clone();
        this.LJLLL = clone;
        if (clone.openLiveFromDrawer || clone.openLiveFromGameDrawer) {
            z = true;
        } else {
            z = false;
        }
        this.LLFFF = z;
        lifecycle.addObserver(this);
        this.LLD = i;
        this.LLF = i;
        if (BL6.LIZ(this.LJLJJLL)) {
            LJIJJLI(0, this.LL);
        } else {
            LJIJJLI(i, LJIJJ(i));
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2 == null || roomsData2.debugInfos == null) {
            return;
        }
        if (!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
            return;
        }
        for (Map.Entry<Long, String> entry : enterRoomConfig.mRoomsData.debugInfos.entrySet()) {
            this.LJLILLLLZI.put(entry.getKey(), entry.getValue());
        }
    }
}
