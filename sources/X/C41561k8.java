package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C41561k8 implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        Boolean bool;
        boolean z;
        switch (this.LJLIL) {
            case 0:
                InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.LJLILLLLZI;
                return new OSZ(((OSZ) interfaceC65784Pro.invoke()).getFirst(), ((OSZ) interfaceC65784Pro.invoke()).getSecond());
            default:
                GameLinkControlWidget gameLinkControlWidget = (GameLinkControlWidget) this.LJLILLLLZI;
                gameLinkControlWidget.getClass();
                C78983UzD.LJLLILLLL = "connection_button";
                DataChannel dataChannel = gameLinkControlWidget.dataChannel;
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.kv0(BCW.class);
                } else {
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                Room room = gameLinkControlWidget.LJLJJI;
                if (room != null && gameLinkControlWidget.LJLJI != null) {
                    TWL.LJIJ(room.getOwner().getFollowInfo().getFollowStatus(), C74838TYs.LJ().LJIIIZ, z, "connection_button");
                    gameLinkControlWidget.LJLJI.onInteractIconClick();
                    return null;
                }
                C30868C9o.LIZJ(R.string.sp2);
                C0NB.LJIIIZ("GameLinkControlWidget", "onGameLinkClick error");
                return null;
        }
    }

    public /* synthetic */ C41561k8(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
