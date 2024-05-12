package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BOb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28697BOb<T> implements Observer {
    public final /* synthetic */ C28698BOc LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ DataChannel LJLJJI;

    public C28697BOb(C28698BOc c28698BOc, boolean z, Room room, DataChannel dataChannel) {
        this.LJLIL = c28698BOc;
        this.LJLILLLLZI = z;
        this.LJLJI = room;
        this.LJLJJI = dataChannel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C28698BOc c28698BOc = this.LJLIL;
        if (booleanValue == c28698BOc.LIZ) {
            return;
        }
        c28698BOc.LIZ = booleanValue;
        Long l = null;
        int i = 1;
        if (this.LJLILLLLZI) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.personalizedChanged = true;
            roomsData.roomId = this.LJLJI.getId();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            User owner = this.LJLJI.getOwner();
            if (owner != null) {
                l = Long.valueOf(owner.getId());
            }
            logData.anchorId = String.valueOf(l);
            enterRoomConfig.mRoomsData.enterFromMerge = BJM.LJFF();
            enterRoomConfig.mRoomsData.enterMethod = BJM.LJIIIIZZ();
            C73943T0h.LIZ().LIZIZ(new C08700Vu(2));
            C73943T0h.LIZ().LIZIZ(new B3P(this.LJLJI.getId(), enterRoomConfig, false, true));
            return;
        }
        C73943T0h.LIZ().LIZIZ(new C08700Vu(3));
        if (BOT.LIZJ()) {
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Ji(this.LJLJI.getId(), C31309CQn.LJIJ(this.LJLJI.getId(), ((IHostPersonalized) CN1.LIZ(IHostPersonalized.class)).qY(3)), null);
            C77800Ug8.LJ("livesdk_manage_feeds_icon_show", this.LJLJJI);
            i = 0;
        }
        C30868C9o.LJFF(C15380j0.LIZLLL(), ((IHostPersonalized) CN1.LIZ(IHostPersonalized.class)).qY(i));
        C77800Ug8.LJ("livesdk_manage_feeds_information_banner_show", this.LJLJJI);
    }
}
