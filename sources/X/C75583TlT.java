package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TlT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75583TlT implements InterfaceC76416Tyu {
    public final /* synthetic */ MultiCoHostWidget LIZ;
    public final /* synthetic */ Room LIZIZ;

    @Override // X.InterfaceC76416Tyu
    public final void LIZ() {
        Long l;
        Long l2;
        if (this.LIZ.LJZI().getChildCount() != 0 || this.LIZ.getContext() == null) {
            return;
        }
        Context context = this.LIZ.context;
        o.LJIIIIZZ(context, "context");
        C51779KTv c51779KTv = new C51779KTv(context);
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l3 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        hashMap.put("room_id", String.valueOf(l2));
        AnonymousClass172.LIZ("livesdk_topic_explation_toast_show", hashMap);
        this.LIZ.LJZI().setVisibility(0);
        this.LIZ.LJZI().addView(c51779KTv);
        List<String> LIZJ = InterfaceC30442Bx8.LLJIJIL.LIZJ();
        Room room2 = this.LIZIZ;
        if (room2 != null) {
            l3 = Long.valueOf(room2.getId());
        }
        LIZJ.add(String.valueOf(l3));
    }

    public C75583TlT(MultiCoHostWidget multiCoHostWidget, Room room) {
        this.LIZ = multiCoHostWidget;
        this.LIZIZ = room;
    }
}
