package X;

import X.CR6;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CHn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31075CHn<MESSAGE extends CR6> extends CQK<MESSAGE> implements InterfaceC31380CTg {
    public boolean LJJIIJZLJL;
    public Room LJJIIZ;

    public abstract String LLIIJLIL();

    public abstract int LLIIL();

    public abstract boolean LLIILII();

    public abstract void LLIIZ();

    @Override // X.CQK, X.CQL, X.InterfaceC31368CSu
    public final void LJJJJLI() {
        super.LJJJJLI();
        LJLIIL();
        if (this.LJJIIJZLJL && LLIILII()) {
            this.LJJIIJZLJL = false;
            int LIZ = C31076CHo.LIZ(LLIIL(), LLIIJLIL());
            if (LIZ != -1) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_privilege_emote_show");
                LIZ2.LJIILLIIL(LJLIIL().LJIIIIZZ);
                LIZ2.LJIJJ("comment_area", "show_entrance");
                LIZ2.LJIJJ(String.valueOf(LIZ), "show_type");
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31075CHn(MESSAGE message) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJJIIJZLJL = true;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public void LJII(boolean z) {
        super.LJII(z);
        this.LJJIIJZLJL = true;
    }

    @Override // X.CQK, X.CQL, X.InterfaceC31341CRt
    public void LJIILLIIL(CQQ publicScreenContext) {
        Room room;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJIILLIIL(publicScreenContext);
        DataChannel dataChannel = publicScreenContext.LJIIIIZZ;
        if (dataChannel != null && (room = publicScreenContext.LJI) != null) {
            this.LJJIIZ = room;
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).CF(publicScreenContext.LIZ, room, dataChannel);
        }
        LLIIZ();
    }

    public final void LLIILZL(EmoteModel emoteModel) {
        Long l;
        String str;
        String str2;
        FragmentManager fragmentManager;
        Room room;
        o.LJIIIZ(emoteModel, "emoteModel");
        LJLIIL();
        if (LJLIIL().LIZLLL) {
            DataChannel dataChannel = LJLIIL().LJIIIIZZ;
            if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || !room.getOwner().isSubscribed()) {
                DataChannel dataChannel2 = LJLIIL().LJIIIIZZ;
                if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) != null) {
                    ((ICommentService) CN1.LIZ(ICommentService.class)).YJ(LJLIIL().LJIIIIZZ, emoteModel, fragmentManager, C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(LJLIIL().LJIIIIZZ))));
                }
            } else {
                C30926CBu c30926CBu = new C30926CBu(4, "", "emote", false);
                c30926CBu.LJIIJ = emoteModel;
                DataChannel dataChannel3 = LJLIIL().LJIIIIZZ;
                if (dataChannel3 != null) {
                    dataChannel3.qv0(UserWannaSendMessageEvent.class, c30926CBu);
                }
            }
        } else {
            C73943T0h.LIZ().LIZIZ(new B3N(1));
            DataChannel dataChannel4 = LJLIIL().LJIIIIZZ;
            if (dataChannel4 != null && (l = (Long) dataChannel4.kv0(AudienceShowOrientationBeginTime.class)) != null) {
                IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
                Room room2 = this.LJJIIZ;
                if (room2 == null || (str = C17280m4.LIZ(room2)) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                iDefinitionService.Hu(1, l.longValue(), str, 0, "click_sub");
            }
        }
        User user = getUser();
        if (user != null && user.getId() == LJLIIL().LJIILLIIL) {
            if (LJLIIL().LJFF) {
                str2 = "live_anchor_c_anchor";
            } else {
                str2 = "live_audience_c_anchor";
            }
        } else if (LJLIIL().LJFF) {
            str2 = "live_anchor_c_audience";
        } else {
            str2 = "live_audience_c_audience";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_privilege_emote_click");
        LIZ.LJIILLIIL(LJLIIL().LJIIIIZZ);
        LIZ.LJIJJ(str2, "request_page");
        LIZ.LJIJJ("comment_area", "click_position");
        LIZ.LJIJJ(Long.valueOf(this.LJIJJLI.getMessageId()), "message_id");
        LIZ.LJIJJ(Long.valueOf(this.LJIILLIIL.LIZ), "message_release_id");
        int LIZ2 = C31076CHo.LIZ(LLIIL(), LLIIJLIL());
        if (LIZ2 != -1) {
            LIZ.LJIJJ(String.valueOf(LIZ2), "show_type");
        }
        LIZ.LJJIIJZLJL();
        C30929CBx.LJIIZILJ("subscription_publicscreen_emote_click", new JSONObject());
    }
}
