package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TsU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76018TsU implements InterfaceC86939YAd {
    public final /* synthetic */ BaseMultiHostInviteListFragment LIZ;

    @Override // X.InterfaceC86939YAd
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC86939YAd
    public final void LIZ() {
        Object value = this.LIZ.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLoadingView>(...)");
        ((View) value).setVisibility(8);
    }

    @Override // X.InterfaceC86939YAd
    public final void LIZJ() {
        Object value = this.LIZ.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLoadingView>(...)");
        if (((View) value).getVisibility() != 0) {
            Object value2 = this.LIZ.LJZL.getValue();
            o.LJIIIIZZ(value2, "<get-mRefreshLoadingView>(...)");
            ((View) value2).setVisibility(0);
        }
    }

    @Override // X.InterfaceC86939YAd
    public final void LJ() {
        String str;
        long j;
        BaseMultiHostInviteListFragment baseMultiHostInviteListFragment = this.LIZ;
        if (baseMultiHostInviteListFragment.LJLLLL) {
            return;
        }
        baseMultiHostInviteListFragment.LJLLLL = true;
        JSONObject LIZLLL = FT5.LIZLLL("from", "refresh");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str2 = null;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        C05630Jz.LJI(LIZLLL, "room_id", str);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            str2 = room2.getIdStr();
        }
        C05630Jz.LJI(LIZLLL, "record_id", str2);
        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room3 != null) {
            j = room3.getOwnerUserId();
        } else {
            j = 0;
        }
        C05630Jz.LJFF(LIZLLL, "user_id", j);
        C58418MwI.LIZLLL.LJIIJ(LIZLLL);
        C75642TmQ c75642TmQ = C75642TmQ.LIZ;
        HashMap hashMap = new HashMap();
        C75642TmQ.LJII(c75642TmQ, hashMap);
        C75642TmQ.LJJLIIJ("livesdk_connection_list_refresh", hashMap);
        BaseMultiHostInviteListFragment baseMultiHostInviteListFragment2 = this.LIZ;
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) baseMultiHostInviteListFragment2.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            abstractC76019TsV.LJFF(baseMultiHostInviteListFragment2.LJLLL.getValue());
        }
    }

    public C76018TsU(BaseMultiHostInviteListFragment baseMultiHostInviteListFragment) {
        this.LIZ = baseMultiHostInviteListFragment;
    }
}
