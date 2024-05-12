package Y;

import X.A9Z;
import X.B7I;
import X.BAF;
import X.BAI;
import X.BOH;
import X.BZI;
import X.C05630Jz;
import X.C28787BRn;
import X.C29306Beo;
import X.C30159BsZ;
import X.C30160Bsa;
import X.C30162Bsc;
import X.C30929CBx;
import X.C31086CHy;
import X.C32201Oe;
import X.CI5;
import X.CN1;
import X.InterfaceC64592gB;
import com.bytedance.android.live.base.model.roomcomponents.RoomComponentsResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.api.eco.CaptchaCheckResponse;

/* loaded from: classes6.dex */
public class AfS0S0100200_5 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    public static final void accept$1(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        ((RoomStatusController) afS0S0100200_5.l0).lambda$checkRoom$8(afS0S0100200_5.j1, afS0S0100200_5.j2, (BOH) obj);
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        C31086CHy c31086CHy = (C31086CHy) afS0S0100200_5.l0;
        long j = afS0S0100200_5.j1;
        long j2 = afS0S0100200_5.j2;
        Throwable th = (Throwable) obj;
        if (c31086CHy.mView == 0) {
            return;
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).bt(c31086CHy.LJLILLLLZI.getId(), j);
        if (th instanceof Exception) {
            ((CI5) c31086CHy.mView).Bn0((Exception) th);
        }
        JSONObject jSONObject = new JSONObject();
        C30929CBx.LIZ.LJIIIZ(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - j2);
        C30929CBx.LJIIZILJ("subscription_send_emote_chat_failed", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        Boolean bool;
        BaseResponse baseResponse = (BaseResponse) obj;
        GuessResponse guessResponse = (GuessResponse) baseResponse.data;
        if (guessResponse != null) {
            bool = Boolean.valueOf(guessResponse.correct);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            DataChannel dataChannel = (DataChannel) afS0S0100200_5.l0;
            long j = afS0S0100200_5.j1;
            long j2 = afS0S0100200_5.j2;
            o.LJIIIZ(dataChannel, "dataChannel");
            BZI LIZ = C28787BRn.LIZ("livesdk_audience_pictionary_answer_correct");
            LIZ.LJIILLIIL(dataChannel);
            BAI.LIZ(LIZ);
            LIZ.LJIJJ(Long.valueOf(j2), "pictionary_session_id");
            LIZ.LJIJJ(Long.valueOf(j), "pictionary_id");
            LIZ.LJJIIJZLJL();
            BAF.LJIILLIIL(afS0S0100200_5.j1, (DataChannel) afS0S0100200_5.l0, ((GuessResponse) baseResponse.data).word);
        }
    }

    public static final void accept$3(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        C30159BsZ c30159BsZ = (C30159BsZ) afS0S0100200_5.l0;
        long j = afS0S0100200_5.j1;
        long j2 = afS0S0100200_5.j2;
        CaptchaCheckResponse captchaCheckResponse = (CaptchaCheckResponse) obj;
        c30159BsZ.getClass();
        if (captchaCheckResponse == null || captchaCheckResponse.data == null) {
            return;
        }
        ((BroadcastTunnelVM) C30162Bsc.LIZ(c30159BsZ.LJLIL.mo49getActivity(), BroadcastTunnelVM.class)).LJLIL.setValue(A9Z.STREAM_ON);
        c30159BsZ.LJLJLJ = false;
        c30159BsZ.LJLJL = false;
        String str = captchaCheckResponse.data.captchaDecision;
        ((IHostUser) CN1.LIZ(IHostUser.class)).popCaptchaV2(c30159BsZ.LJLIL.mo49getActivity(), str, new C30160Bsa(c30159BsZ, j, str, j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        ((IRankService) CN1.LIZ(IRankService.class)).uh(afS0S0100200_5.j1, afS0S0100200_5.j2);
        ((B7I) afS0S0100200_5.l0).LIZIZ(new C32201Oe((RoomComponentsResponse) ((BaseResponse) obj).data, null));
    }

    public static final void accept$5(AfS0S0100200_5 afS0S0100200_5, Object obj) {
        C32201Oe c32201Oe;
        Throwable th = (Throwable) obj;
        B7I b7i = (B7I) afS0S0100200_5.l0;
        if (th != null) {
            ((IRankService) CN1.LIZ(IRankService.class)).vy(afS0S0100200_5.j1, afS0S0100200_5.j2, th);
            c32201Oe = new C32201Oe(null, th);
        } else {
            Throwable th2 = new Throwable("throwable is null");
            ((IRankService) CN1.LIZ(IRankService.class)).vy(afS0S0100200_5.j1, afS0S0100200_5.j2, th2);
            c32201Oe = new C32201Oe(null, th2);
        }
        b7i.LIZIZ(c32201Oe);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0100200_5(long r2, long r4, X.B7I r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r6
            r0.j1 = r2
            r0.j2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.j1 = r2
            r0.j2 = r4
            r0.l0 = r6
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0100200_5.<init>(long, long, X.B7I, int):void");
    }

    public AfS0S0100200_5(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
        this.j2 = j2;
    }
}
