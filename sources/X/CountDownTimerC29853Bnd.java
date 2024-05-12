package X;

import android.net.Uri;
import android.os.CountDownTimer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalDetailWebLinkSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bnd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC29853Bnd extends CountDownTimer {
    public final /* synthetic */ LiveGoalPinCardWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String str;
        long j;
        String str2;
        long j2;
        Long LJJIZ;
        LiveGoalPinCardWidget liveGoalPinCardWidget = this.LIZ;
        liveGoalPinCardWidget.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        long j3 = 0;
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            User owner = room.getOwner();
            if (owner != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            long id = room.getId();
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            if (C29306Beo.LJIIJ(liveGoalPinCardWidget.dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            String LIZ = C29854Bne.LIZ("stream_goal_id");
            if (LIZ != null && (LJJIZ = C38350F3i.LJJIZ(LIZ)) != null) {
                j2 = LJJIZ.longValue();
            } else {
                j2 = 0;
            }
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqa);
            if (LJIILJJIL != null) {
                str3 = LJIILJJIL;
            }
            C29852Bnc.LIZIZ(str, j, id, currentUserId, j2, str2, "invite_pin", str3);
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            j3 = room2.getId();
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        this.LIZ.getClass();
        String value = LiveStreamGoalDetailWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            buildUpon.appendQueryParameter("capsule_message_from", "invite_pin");
            buildUpon.appendQueryParameter("entrance", "stream_goal_im");
            value = buildUpon.build().toString();
        } catch (Exception unused) {
        }
        o.LJIIIIZZ(value, "try {\n            val bu… originalSchema\n        }");
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        Text text = new Text();
        text.defaultPattern = C15380j0.LJIILJJIL(R.string.lqa);
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.defaultPattern = C15380j0.LJIILJJIL(R.string.lqb);
        capsuleMessage.buttonText = text2;
        capsuleMessage.schema = value;
        iPublicScreenService.OF(j3, new C29846BnW(capsuleMessage, Integer.valueOf(R.drawable.cyl), new AqS155S0100000_5(this.LIZ, 326)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC29853Bnd(LiveGoalPinCardWidget liveGoalPinCardWidget) {
        super(120000L, 120000L);
        this.LIZ = liveGoalPinCardWidget;
    }
}
