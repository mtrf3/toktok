package X;

import android.content.DialogInterface;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B7B implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveHostWatch LJLIL;
    public final /* synthetic */ EnterRoomLinkSession LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ EnterRoomConfig LJLJJI;

    public B7B(LiveHostWatch liveHostWatch, EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        this.LJLIL = liveHostWatch;
        this.LJLILLLLZI = enterRoomLinkSession;
        this.LJLJI = room;
        this.LJLJJI = enterRoomConfig;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        String str;
        o.LJIIIZ(dialog, "dialog");
        LiveHostWatch liveHostWatch = this.LJLIL;
        EnterRoomLinkSession enterRoomLinkSession = this.LJLILLLLZI;
        o.LJIIIIZZ(enterRoomLinkSession, "enterRoomLinkSession");
        Room room = this.LJLJI;
        EnterRoomConfig enterRoomConfig = this.LJLJJI;
        long j = enterRoomConfig.mRoomsData.roomId;
        liveHostWatch.getClass();
        enterRoomConfig.mRoomsData.fromRoomId = room.getId();
        B3P b3p = new B3P(j);
        enterRoomLinkSession.LIZIZ(new Event("live_scheme_jump_to_other_room", 772, EnumC28203B5b.BussinessApiCall));
        b3p.LJ = enterRoomConfig;
        if (o.LJ("true", enterRoomConfig.mRoomsData.xtBackRoom)) {
            C73943T0h.LIZ().LIZIZ(new B5E(b3p));
        } else {
            if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt() && enterRoomConfig.mRoomsData.isShowBackRoom) {
                str = "jump_source_mic_room";
            } else {
                str = "jump_source_live_banner";
            }
            enterRoomConfig.mRoomsData.backRoomSource = str;
            C73943T0h.LIZ().LIZIZ(b3p);
        }
        dialog.dismiss();
    }
}
