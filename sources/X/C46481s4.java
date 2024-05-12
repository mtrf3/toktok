package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.1s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46481s4 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46481s4(DataChannel dataChannel, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = z2;
        this.LJLJJL = str2;
        this.LJLJJLL = z3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        String str;
        Room room;
        LiveMode streamType;
        if (C29306Beo.LJIIJ(this.LJLIL) || this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        if (C79146V4k.LJJJI(this.LJLIL)) {
            str = "livesdk_moderator_custom_poll_entrance_show";
        } else if (z) {
            str = "livesdk_anchor_custom_poll_entrance_show";
        } else {
            str = "livesdk_custom_poll_entrance_show";
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable(str)) {
            BZI LIZ = C28787BRn.LIZ(str);
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJIJJ(this.LJLJI, "enter_from");
            DataChannel dataChannel = this.LJLIL;
            boolean z2 = this.LJLJJI;
            String str2 = this.LJLJJL;
            boolean z3 = this.LJLJJLL;
            boolean z4 = this.LJLILLLLZI;
            String str3 = null;
            Object obj = null;
            str3 = null;
            str3 = null;
            if (C79146V4k.LJJJI(dataChannel)) {
                User LIZIZ = C05200Ii.LIZIZ();
                if (LIZIZ != null) {
                    obj = Long.valueOf(LIZIZ.getId());
                }
                LIZ.LJIJJ(obj, "moderator_id");
            } else if (z) {
                LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "has_red_dot");
                LIZ.LJIJ(str2);
                LIZ.LJIJJ(Integer.valueOf(z3 ? 1 : 0), "has_bubble_guidance");
                if (z4) {
                    LIZ.LJIJ(str2);
                } else {
                    if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
                        str3 = C28509BGv.LIZ(streamType);
                    }
                    LIZ.LJIJ(str3);
                }
            }
            LIZ.LJJIIJZLJL();
        }
        return C76800UCe.LIZ;
    }
}
