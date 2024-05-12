package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.api.LiveEventDescCardApi;
import com.bytedance.android.livesdk.api.LiveEventDescCardMApi;
import com.bytedance.android.livesdk.api.LiveEventResponse;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMO implements InterfaceViewOnClickListenerC30227Btf {
    public final Context LJLIL;
    public DataChannel LJLILLLLZI;
    public Room LJLJI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onShow() {
        J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_event_promotion"), this.LJLILLLLZI, "show", "type");
    }

    public CMO(Context context) {
        this.LJLIL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        int i;
        Long l;
        AbstractC73672Svk<LiveEventResponse> anchorSelectionResponse;
        Long l2;
        Long l3;
        o.LJIIIZ(v, "v");
        J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_event_promotion"), this.LJLILLLLZI, "click", "type");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (l3 = (Long) dataChannel.kv0(LiveEventCardStartTimeChannel.class)) != null) {
            i = (int) l3.longValue();
        } else {
            i = 0;
        }
        Long l4 = null;
        if (CN1.LIZ(IHostAppContext.class) != null && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            LiveEventDescCardApi liveEventDescCardApi = (LiveEventDescCardApi) Q7L.LIZIZ(LiveEventDescCardApi.class);
            Room room = this.LJLJI;
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            String valueOf = String.valueOf(l2);
            Room room2 = this.LJLJI;
            if (room2 != null) {
                l4 = Long.valueOf(room2.getId());
            }
            anchorSelectionResponse = liveEventDescCardApi.getAnchorSelectionResponse(valueOf, 4, 0, 2, i, String.valueOf(l4));
        } else {
            LiveEventDescCardMApi liveEventDescCardMApi = (LiveEventDescCardMApi) Q7L.LIZIZ(LiveEventDescCardMApi.class);
            Room room3 = this.LJLJI;
            if (room3 != null) {
                l = Long.valueOf(room3.getOwnerUserId());
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            Room room4 = this.LJLJI;
            if (room4 != null) {
                l4 = Long.valueOf(room4.getId());
            }
            anchorSelectionResponse = liveEventDescCardMApi.getAnchorSelectionResponse(valueOf2, 4, 0, 2, i, String.valueOf(l4));
        }
        anchorSelectionResponse.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 285), CMP.LJLIL);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = C1DH.LJIILL(dataChannel);
    }
}
