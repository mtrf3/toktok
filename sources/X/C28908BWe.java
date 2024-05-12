package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.livesdk.broadcast.NormalNotifyEvent;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BWe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28908BWe extends AbstractC65781Prl implements InterfaceC88472Yns<C28907BWd, C76800UCe> {
    public final /* synthetic */ LiveBroadcastPreviewFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28908BWe(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment) {
        super(1);
        this.LJLIL = liveBroadcastPreviewFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C28907BWd c28907BWd) {
        boolean z;
        C28907BWd it = c28907BWd;
        o.LJIIIZ(it, "it");
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = this.LJLIL;
        CreateInfoPerceptionMessage createInfoPerceptionMessage = liveBroadcastPreviewFragment.LLFFF;
        if (createInfoPerceptionMessage != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o.LJI(createInfoPerceptionMessage);
            if (liveBroadcastPreviewFragment.LJLLLLLL != LiveMode.LIVE_STUDIO) {
                PunishEventInfo punishEventInfo = createInfoPerceptionMessage.punishInfo;
                if (punishEventInfo != null) {
                    DataChannel dataChannel = liveBroadcastPreviewFragment.LJLILLLLZI;
                    if (dataChannel != null) {
                        C0N7.LJJ(dataChannel, punishEventInfo.punishId, punishEventInfo.punishType, punishEventInfo.punishReason, Long.valueOf(punishEventInfo.violationUid));
                    } else {
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                }
                Context context = liveBroadcastPreviewFragment.getContext();
                if (context != null) {
                    DataChannel dataChannel2 = liveBroadcastPreviewFragment.LJLILLLLZI;
                    if (dataChannel2 != null) {
                        C28909BWf.LIZIZ(context, dataChannel2, createInfoPerceptionMessage, true);
                    } else {
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                }
            }
        } else if (liveBroadcastPreviewFragment.LJLLLLLL != LiveMode.LIVE_STUDIO) {
            DataChannel dataChannel3 = liveBroadcastPreviewFragment.LJLILLLLZI;
            if (dataChannel3 != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_banned_toast_show");
                LIZ.LJIILLIIL(dataChannel3);
                LIZ.LJIIL("show");
                LIZ.LJJIIJZLJL();
                Context context2 = liveBroadcastPreviewFragment.getContext();
                if (context2 != null) {
                    DataChannel dataChannel4 = liveBroadcastPreviewFragment.LJLILLLLZI;
                    if (dataChannel4 != null) {
                        String str = it.LJ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str);
                        LIZ2.append(C28909BWf.LIZ());
                        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ2));
                        spannableString.setSpan(new AbsoluteSizeSpan(C15380j0.LIZ(12.0f)), 0, spannableString.length(), 17);
                        spannableString.setSpan(new C28905BWb(context2, dataChannel4, it), spannableString.length() - C28909BWf.LIZ().length(), spannableString.length(), 17);
                        spannableString.setSpan(new AbsoluteSizeSpan(C15380j0.LIZ(12.0f)), spannableString.length() - C28909BWf.LIZ().length(), spannableString.length(), 17);
                        C23010vJ.LJFF(spannableString, spannableString.length() - C28909BWf.LIZ().length(), spannableString.length(), 17, 600);
                        dataChannel4.qv0(NormalNotifyEvent.class, new C28913BWj(0, BUW.NORMAL_BLOCK, spannableString, 8));
                    } else {
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
