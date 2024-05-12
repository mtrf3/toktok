package com.bytedance.android.live.liveinteract.platform.common.monitor;

import X.C29423Bgh;
import X.C30868C9o;
import X.C73943T0h;
import X.C74838TYs;
import X.C76800UCe;
import X.CL9;
import X.InterfaceC65784Pro;
import X.InterfaceC75560Tl6;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM")
/* loaded from: classes14.dex */
public final class DeepLinkEnterMultiLiveRoomDataHandler implements CL9 {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;
    public boolean LJ = true;
    public int LJFF;

    public final String LIZIZ() {
        if (2 == this.LIZLLL) {
            if (this.LJ) {
                return "from_activitypage_redirect";
            }
            return "from_activitypage";
        }
        return "";
    }

    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        int i = 1;
        int i2 = this.LJFF + 1;
        this.LJFF = i2;
        if (this.LIZLLL == 0 && i2 == 1) {
            this.LIZIZ = true;
        } else {
            this.LIZ = null;
            this.LJFF = 0;
            i = -1;
            this.LIZLLL = -1;
        }
        this.LIZLLL = i;
    }

    public final void LJFF() {
        String str = this.LIZ;
        if (str == null || this.LIZLLL != -1 || !o.LJ(str, "1") || this.LIZ == null) {
            return;
        }
        this.LIZLLL = 0;
        this.LJFF = 0;
        if (C74838TYs.LJ().LJIIIIZZ) {
            C73943T0h.LIZ().LIZIZ(new C29423Bgh());
            return;
        }
        this.LIZ = null;
        this.LJFF = 0;
        this.LIZLLL = -1;
    }

    @Override // X.CL9
    public final void LIZ(Room room) {
        LIZLLL(room, false, "1");
        LJFF();
    }

    public final void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str = this.LIZ;
        int i = -1;
        if (str == null) {
            return;
        }
        if (this.LIZIZ && this.LIZLLL == 1 && !this.LIZJ && o.LJ(str, "1")) {
            if (this.LIZ != null) {
                this.LIZ = null;
                this.LIZJ = true;
                if (this.LIZLLL == 1) {
                    i = 2;
                } else {
                    this.LIZ = null;
                    this.LJFF = 0;
                    this.LIZLLL = -1;
                }
                this.LIZLLL = i;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        this.LIZ = null;
        this.LJFF = 0;
        this.LIZLLL = -1;
    }

    public final void LIZLLL(Room room, boolean z, String str) {
        if (room == null || str == null) {
            return;
        }
        if (!room.isWithLinkMic() && !C74838TYs.LJ().LJIIIIZZ && o.LJ(str, "1")) {
            this.LIZ = null;
            C30868C9o.LIZJ(R.string.kgx);
        } else {
            if (room.isWithLinkMic() && o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                this.LIZ = null;
                return;
            }
            this.LIZLLL = -1;
            this.LIZIZ = false;
            this.LIZJ = false;
            this.LJ = z;
            this.LIZ = str;
        }
    }
}
