package X;

import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final /* synthetic */ class U5X extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public U5X(HotWordGiftViewModel hotWordGiftViewModel) {
        super(1, hotWordGiftViewModel, HotWordGiftViewModel.class, "onRechargeDialogDismissed", "onRechargeDialogDismissed(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        HotWordGiftViewModel hotWordGiftViewModel = (HotWordGiftViewModel) this.receiver;
        hotWordGiftViewModel.getClass();
        if (C96Q.LIZ(str)) {
            hotWordGiftViewModel.LJZ = true;
            C30926CBu c30926CBu = new C30926CBu();
            DataChannel dataChannel = hotWordGiftViewModel.LJLJJL;
            if (dataChannel != null) {
                dataChannel.qv0(UserWannaSendMessageEvent.class, c30926CBu);
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
