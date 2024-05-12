package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Tde, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC75098Tde implements View.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C75093TdZ LJLJI;
    public final /* synthetic */ LinkPlayerInfo LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public ViewOnClickListenerC75098Tde(boolean z, boolean z2, C75093TdZ c75093TdZ, LinkPlayerInfo linkPlayerInfo, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c75093TdZ;
        this.LJLJJI = linkPlayerInfo;
        this.LJLJJL = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && ((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(room.getId()))) {
            C30868C9o.LIZJ(R.string.n0n);
            return;
        }
        if (!this.LJLIL && !this.LJLILLLLZI) {
            InterfaceC75119Tdz interfaceC75119Tdz = this.LJLJI.LJLILLLLZI;
            if (interfaceC75119Tdz != null) {
                interfaceC75119Tdz.LJIIIIZZ(this.LJLJJL, this.LJLJJI);
                return;
            }
            return;
        }
        C30868C9o.LIZJ(R.string.n0n);
    }
}
