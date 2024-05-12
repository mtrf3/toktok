package X;

import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CY8 implements InterfaceC72822Si2 {
    public final /* synthetic */ OnlineAudienceRankWidget LJLIL;

    public CY8(OnlineAudienceRankWidget onlineAudienceRankWidget) {
        this.LJLIL = onlineAudienceRankWidget;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String string;
        if (o.LJ(c199097rd.LJLIL, "audience_ranking_pop_event")) {
            B4U.LIZ().LJJII("audience_list_lynx");
            return;
        }
        if (!o.LJ(c199097rd.LJLIL, "audience_ranking_data")) {
            return;
        }
        try {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns == null || (string = interfaceC78280Uns.getString("rank_data")) == null) {
                return;
            }
            DataChannel dataChannel = this.LJLIL.dataChannel;
            CY4.LIZIZ = string;
            OnlineRankListResponse response = (OnlineRankListResponse) new Gson().LJI(string, OnlineRankListResponse.class);
            o.LJIIIIZZ(response, "response");
            CY4.LIZIZ(response, dataChannel);
        } catch (Exception unused) {
        }
    }
}
