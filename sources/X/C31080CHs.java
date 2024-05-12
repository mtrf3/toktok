package X;

import Y.AfS0S0100200_5;
import Y.AfS1S0200200_5;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CHs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31080CHs implements CS2 {
    public final /* synthetic */ C31086CHy LIZ;
    public final /* synthetic */ C31084CHw LIZIZ;

    public /* synthetic */ C31080CHs(C31086CHy c31086CHy, C31084CHw c31084CHw) {
        this.LIZ = c31086CHy;
        this.LIZIZ = c31084CHw;
    }

    @Override // X.CS2
    public final void LIZ(long j) {
        boolean z;
        String str;
        String str2;
        C31086CHy c31086CHy = this.LIZ;
        C31084CHw c31084CHw = this.LIZIZ;
        ((CI5) c31086CHy.mView).Sk();
        DataChannel dataChannel = c31086CHy.dataChannel;
        List<EmoteModel> emotes2 = c31084CHw.LIZ;
        if (ISendCommentEvent.Sender.QUICKEMOTECOMMENT == c31084CHw.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(emotes2, "emotes");
        if (dataChannel != null) {
            String str3 = (String) DataChannelGlobal.LJLJJI.mv0(C54832Df.class);
            if (str3 == null) {
                str3 = "comment";
            }
            if (ujb.o.LJJJJJL(str3)) {
                str3 = "comment";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_audience_live_emote");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            if (z) {
                str = "1";
            } else {
                str = "";
            }
            LIZ.LJIJJ(str, "quick_comment_subscribe_type");
            LIZ.LJIJJ(ORZ.LLD(emotes2, ",", null, null, CIH.LJLIL, 30), "privilege_emotes_label");
            if (emotes2.size() == 1) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "4";
            }
            LIZ.LJIJJ(str2, "show_type");
            LIZ.LJIJJ(str3, "show_entrance");
            LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "connection_type");
            LIZ.LJJIIJZLJL();
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "start_time", currentTimeMillis);
        C30929CBx.LJIIZILJ("subscription_send_emote_chat_request", jSONObject);
        C73318Sq2 c73318Sq2 = c31086CHy.LJLJI;
        long id = c31086CHy.LJLILLLLZI.getId();
        List<EmoteModel> emotes3 = c31084CHw.LIZ;
        o.LJIIIZ(emotes3, "emotes");
        C65814PsI.LIZ().getClass();
        c73318Sq2.LIZ(C1EW.LIZ(((CommentApi) C65814PsI.LIZJ(CommentApi.class)).sendEmote(id, ORZ.LLD(emotes3, ",", null, null, CII.LJLIL, 30))).LJJJLIIL(new AfS1S0200200_5(c31086CHy, c31084CHw, j, currentTimeMillis, 0), new AfS0S0100200_5(j, currentTimeMillis, c31086CHy, 0)));
    }
}
