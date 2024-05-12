package com.bytedance.android.livesdk.list;

import X.AbstractC28221B5t;
import X.C29162BcU;
import X.C59661NbF;
import X.C73411SrX;
import X.C73969T1h;
import X.C79004UzY;
import X.InterfaceC28262B7i;
import Y.AfS37S0000000_5;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MultiRoomIdListProvider extends AbstractC28221B5t implements GenericLifecycleObserver {
    public final List<RoomInfo> LJLILLLLZI;
    public List<Room> LJLJI;
    public final List<EnterRoomConfig> LJLJJI;
    public final EnterRoomConfig LJLJJL;
    public C73411SrX LJLJJLL;

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final Room LJIIIIZZ(int i) {
        return null;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i) {
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIZILJ(int i) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.AbstractC28221B5t
    public final List<Room> LJIILJJIL() {
        return new ArrayList();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C73411SrX c73411SrX = this.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJLJJLL = null;
        }
    }

    @Override // X.InterfaceC28220B5s
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r7 >= 0) goto L20;
     */
    @Override // X.InterfaceC28220B5s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdkapi.session.EnterRoomConfig LIZLLL(int r7) {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LJLJJI
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 != 0) goto L19
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LJLJJI
            int r0 = r0.size()
            if (r0 <= r7) goto L19
            java.util.List<com.bytedance.android.livesdkapi.session.EnterRoomConfig> r0 = r6.LJLJJI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = (com.bytedance.android.livesdkapi.session.EnterRoomConfig) r0
            return r0
        L19:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = new com.bytedance.android.livesdkapi.session.EnterRoomConfig
            r3.<init>()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            if (r0 == 0) goto Laf
            if (r7 < 0) goto Lae
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            int r0 = r0.size()
            if (r7 >= r0) goto L52
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            long r4 = r0.roomId
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L52
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            if (r0 == 0) goto L52
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            long r1 = r0.getRoomId()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = r6.LJLJJL
        L52:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            int r0 = r0.size()
            if (r7 >= r0) goto Lae
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.requestId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L78
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r3.mLogData
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.requestId
            r1.requestId = r0
        L78:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.logPb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8e
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r3.mLogData
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r6.LJLJJL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            java.lang.String r0 = r0.logPb
            r1.logPb = r0
        L8e:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r2 = r3.mRoomsData
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            long r0 = r0.getRoomId()
            r2.roomId = r0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r3.mLogData
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> r0 = r6.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.RoomInfo) r0
            java.lang.String r0 = r0.getAnchorId()
            r1.anchorId = r0
        Lae:
            return r3
        Laf:
            if (r7 < 0) goto Lae
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.list.MultiRoomIdListProvider.LIZLLL(int):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }

    @Override // X.InterfaceC28220B5s
    public final int LJ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
            if (((RoomInfo) ListProtector.get(this.LJLILLLLZI, i)).getRoomId() == j) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC28221B5t
    public final List LJIILIIL(int i) {
        List<Room> list = this.LJLJI;
        if (list != null && !C79004UzY.LJJIFFI(list) && ((ArrayList) this.LJLJI).size() > i) {
            ArrayList arrayList = new ArrayList();
            int i2 = 6;
            while (i < ((ArrayList) this.LJLJI).size() && i2 > 0) {
                Room room = (Room) ListProtector.get(this.LJLJI, i);
                if (room != null) {
                    arrayList.add(Long.valueOf(room.getId()));
                }
                i2--;
                i++;
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJI(long j) {
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            if (ListProtector.get(this.LJLILLLLZI, i) != null && ((RoomInfo) ListProtector.get(this.LJLILLLLZI, i)).getRoomId() == j) {
                ListProtector.remove(this.LJLILLLLZI, i);
                return;
            }
        }
    }

    public MultiRoomIdListProvider(Lifecycle lifecycle, List<RoomInfo> list, EnterRoomConfig enterRoomConfig) {
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = enterRoomConfig;
        arrayList.addAll(list);
        ArrayList arrayList2 = (ArrayList) list;
        long[] jArr = new long[arrayList2.size()];
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (ListProtector.get(list, i2) != null) {
                jArr[i2] = ((RoomInfo) ListProtector.get(list, i2)).getRoomId();
            } else {
                jArr[i2] = 0;
            }
        }
        lifecycle.addObserver(this);
        this.LJLJJLL = (C73411SrX) C29162BcU.LIZJ(jArr).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C59661NbF(i, this, list), new AfS37S0000000_5(7));
    }
}
