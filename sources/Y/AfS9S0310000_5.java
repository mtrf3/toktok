package Y;

import X.BAF;
import X.BAI;
import X.BIR;
import X.BZI;
import X.C06530Nl;
import X.C28787BRn;
import X.C30868C9o;
import X.C41071jL;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public class AfS9S0310000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS9S0310000_5 afS9S0310000_5, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        StartDrawGuessResponse startDrawGuessResponse = (StartDrawGuessResponse) baseResponse.data;
        if (startDrawGuessResponse == null) {
            ((InterfaceC88472Yns) afS9S0310000_5.l0).invoke(Boolean.FALSE);
            return;
        }
        DataChannel dataChannel = (DataChannel) afS9S0310000_5.l1;
        boolean z = afS9S0310000_5.z3;
        long j = startDrawGuessResponse.sessionId;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_start");
        LIZ.LJIILLIIL(dataChannel);
        BAI.LIZ(LIZ);
        if (z) {
            str = "play_again";
        } else {
            str = "start";
        }
        C06530Nl.LIZLLL(LIZ, str, "enter_from", j, "pictionary_session_id");
        LIZ.LJIJJ("draw_and_guess", "type");
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel2 = (DataChannel) afS9S0310000_5.l1;
        StartDrawGuessResponse startDrawGuessResponse2 = (StartDrawGuessResponse) baseResponse.data;
        BAF.LJIJ(startDrawGuessResponse2.pictionaryId, startDrawGuessResponse2.sessionId, (DrawGuessWord) afS9S0310000_5.l2, dataChannel2, false);
        ((InterfaceC88472Yns) afS9S0310000_5.l0).invoke(Boolean.TRUE);
    }

    public static final void accept$1(AfS9S0310000_5 afS9S0310000_5, Object obj) {
        if (((BaseResponse) obj).statusCode == 0) {
            Room room = (Room) afS9S0310000_5.l0;
            if (room != null) {
                room.liveSubOnlyUseMusic = 1L;
            }
            C41071jL c41071jL = (C41071jL) afS9S0310000_5.l1;
            if (c41071jL != null) {
                c41071jL.setChecked(afS9S0310000_5.z3);
            }
            InterfaceC30442Bx8.I3.LIZJ(Boolean.TRUE);
            ((BIR) afS9S0310000_5.l2).LJIIIZ((C41071jL) afS9S0310000_5.l1, false, null);
            return;
        }
        C41071jL c41071jL2 = (C41071jL) afS9S0310000_5.l1;
        if (c41071jL2 != null) {
            c41071jL2.setChecked(afS9S0310000_5.z3);
        }
        ((BIR) afS9S0310000_5.l2).LJIIIZ((C41071jL) afS9S0310000_5.l1, true, null);
        C30868C9o.LIZJ(R.string.mg2);
    }

    public AfS9S0310000_5(Room room, C41071jL c41071jL, BIR bir, int i) {
        this.$t = i;
        this.l0 = room;
        this.l1 = c41071jL;
        this.z3 = true;
        this.l2 = bir;
    }

    public AfS9S0310000_5(AqS171S0100000_5 aqS171S0100000_5, DataChannel dataChannel, boolean z, DrawGuessWord drawGuessWord, int i) {
        this.$t = i;
        this.l0 = aqS171S0100000_5;
        this.l1 = dataChannel;
        this.z3 = z;
        this.l2 = drawGuessWord;
    }
}
