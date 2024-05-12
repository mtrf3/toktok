package com.bytedance.android.live.liveinteract.multilive.guset.util;

import X.InterfaceC74802TXi;
import X.InterfaceC75560Tl6;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "DATA_MULTI_LIVE_INVITEE_SHARE_HELPER")
/* loaded from: classes14.dex */
public final class MultiLiveInviteeShareHelper implements InterfaceC74802TXi {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final LifecycleOwner LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJFF;
    public String LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // X.InterfaceC74802TXi
    public final void clear() {
        this.LJII = 0;
        this.LJIIIIZZ = 0;
    }

    @Override // X.InterfaceC74802TXi
    public final String LIZ() {
        int i = this.LJII;
        if (i == 3 || i == 2) {
            this.LJII = 0;
            return "outside_liveroom";
        }
        return "";
    }

    @Override // X.InterfaceC74802TXi
    public final int LIZIZ() {
        int i;
        if (o.LJ(this.LIZLLL, "deeplink_share_source")) {
            i = 2;
        } else if (o.LJ(this.LIZLLL, "private_message_share_source")) {
            i = 1;
        } else {
            i = 0;
        }
        this.LIZLLL = "";
        return i;
    }

    @Override // X.InterfaceC74802TXi
    public final String LIZJ() {
        if (this.LJ == 3 && this.LJI.length() > 0) {
            String str = this.LJI;
            this.LJI = "";
            return str;
        }
        return "room";
    }

    @Override // X.InterfaceC74802TXi
    public final String LIZLLL() {
        if (this.LJIIIIZZ == 3) {
            this.LJIIIIZZ = 0;
            return "outside_liveroom";
        }
        return "";
    }

    public MultiLiveInviteeShareHelper(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = "";
        this.LJFF = "";
        this.LJI = "";
    }
}
