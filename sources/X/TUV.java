package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

/* loaded from: classes14.dex */
public final class TUV<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ TUU LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public TUV(long j, TUU tuu, String str, InterfaceC88472Yns<? super TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns, String str2, InterfaceC88472Yns<? super TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = j;
        this.LJLILLLLZI = tuu;
        this.LJLJI = str;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = str2;
        this.LJLJJLL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        String str2;
        BaseResponse baseResponse = (BaseResponse) obj;
        long LIZIZ = C31012CFc.LIZIZ() - this.LJLIL;
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "list_by_type", str, null);
        if (baseResponse != null && (str2 = baseResponse.LIZIZ) != null) {
            str3 = str2;
        }
        C58578Mys.LIZ = str3;
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            TUU tuu = this.LJLILLLLZI;
            InterfaceC88472Yns<TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            String str4 = this.LJLJJL;
            InterfaceC88472Yns<TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns2 = this.LJLJJLL;
            tuu.LJIIJ().LJJIIJ(multiLiveGuestInfoList);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(tuu.LJIIJ());
            }
            tuu.LJIILIIL(multiLiveGuestInfoList, str4);
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(tuu.LJIIJ());
            }
        }
        TUU tuu2 = this.LJLILLLLZI;
        tuu2.LJLJJL = null;
        tuu2.LJLJJLL.remove(this.LJLJI);
    }
}
