package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

/* loaded from: classes14.dex */
public final class TZ9 implements C0K7 {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ LinkPlayerInfo LJLILLLLZI;
    public final /* synthetic */ C73318Sq2 LJLJI;
    public final /* synthetic */ InterfaceC31805Ce1 LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ MultiGuestDataHolder LJLJJLL;

    public TZ9(int i, Context context, MultiGuestDataHolder multiGuestDataHolder, InterfaceC31805Ce1 interfaceC31805Ce1, LinkPlayerInfo linkPlayerInfo, C73318Sq2 c73318Sq2) {
        this.LJLIL = context;
        this.LJLILLLLZI = linkPlayerInfo;
        this.LJLJI = c73318Sq2;
        this.LJLJJI = interfaceC31805Ce1;
        this.LJLJJL = i;
        this.LJLJJLL = multiGuestDataHolder;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        User user;
        long j;
        User user2;
        InterfaceC30442Bx8.d2.LIZ(Boolean.FALSE);
        liveDialog.dismiss();
        String str = null;
        C74947TbD.LJJ(this.LJLIL, this.LJLILLLLZI, 3, this.LJLJI, null);
        C74824TYe c74824TYe = C74824TYe.LIZ;
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLJJI;
        long j2 = 0;
        if (interfaceC31805Ce1 != null) {
            LinkPlayerInfo linkPlayerInfo = this.LJLILLLLZI;
            if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                j = user2.getId();
            } else {
                j = 0;
            }
            str = interfaceC31805Ce1.LIZIZ(j);
        }
        int i = this.LJLJJL;
        int LIZ = C74947TbD.LIZ(this.LJLILLLLZI, this.LJLJJLL);
        String str2 = C74824TYe.LJIILL;
        LinkPlayerInfo linkPlayerInfo2 = this.LJLILLLLZI;
        if (linkPlayerInfo2 != null && (user = linkPlayerInfo2.mUser) != null) {
            j2 = user.getId();
        }
        c74824TYe.LJIILLIIL(i, LIZ, str, str2, "click", true, j2);
    }
}
