package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public final class TQK<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC88473Ynt<String, String, Integer, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI = "leave_normally";
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;

    public TQK(int i, DataChannel dataChannel, String str, InterfaceC88473Ynt interfaceC88473Ynt) {
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = str;
        this.LJLJJI = i;
        this.LJLJJL = dataChannel;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        GetGuestSettingResponse.ResponseData responseData = ((GetGuestSettingResponse) obj).data;
        if (responseData != null && responseData.rankListShowAction == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has chosen, so run regular logic");
            this.LJLIL.invoke(this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI));
        } else {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has not chosen, so show leave rank dialog");
            C74738TUw.LJIIIIZZ(this.LJLJI, this.LJLJJI, this.LJLJJL, false, 24);
        }
    }
}
