package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Jjk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49996Jjk implements IEvent {
    public final LiveRoomStruct LJLIL;
    public final ArrayList<LiveRoomStruct> LJLILLLLZI;
    public final long LJLJI;
    public final EnterRoomConfig LJLJJI;
    public final Boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49996Jjk)) {
            return false;
        }
        C49996Jjk c49996Jjk = (C49996Jjk) obj;
        return o.LJ(this.LJLIL, c49996Jjk.LJLIL) && o.LJ(this.LJLILLLLZI, c49996Jjk.LJLILLLLZI) && this.LJLJI == c49996Jjk.LJLJI && o.LJ(this.LJLJJI, c49996Jjk.LJLJJI) && o.LJ(this.LJLJJL, c49996Jjk.LJLJJL);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        LiveRoomStruct liveRoomStruct = this.LJLIL;
        int i = 0;
        if (liveRoomStruct == null) {
            hashCode = 0;
        } else {
            hashCode = liveRoomStruct.hashCode();
        }
        int i2 = hashCode * 31;
        ArrayList<LiveRoomStruct> arrayList = this.LJLILLLLZI;
        if (arrayList == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJI, (i2 + hashCode2) * 31, 31);
        EnterRoomConfig enterRoomConfig = this.LJLJJI;
        if (enterRoomConfig == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enterRoomConfig.hashCode();
        }
        int i3 = (LIZJ + hashCode3) * 31;
        Boolean bool = this.LJLJJL;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterLiveRoomEvent(curRawData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", rawDataList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", startCursor=");
        LIZ.append(this.LJLJI);
        LIZ.append(", config=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", hasMore=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C49996Jjk(LiveRoomStruct liveRoomStruct, ArrayList<LiveRoomStruct> arrayList, long j, EnterRoomConfig enterRoomConfig, Boolean bool) {
        this.LJLIL = liveRoomStruct;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = j;
        this.LJLJJI = enterRoomConfig;
        this.LJLJJL = bool;
    }
}
