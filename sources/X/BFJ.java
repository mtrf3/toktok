package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWordlistResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class BFJ<T> implements InterfaceC64592gB {
    public static final BFJ<T> LJLIL = new BFJ<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        ((ArrayList) BFI.LIZ.getValue()).addAll(((DrawGuessWordlistResponse) baseResponse.data).wordList);
        BFI.LIZJ = false;
        DataChannel dataChannel = BFI.LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessRoundDurationChannel.class, Long.valueOf(((DrawGuessWordlistResponse) baseResponse.data).duration));
        }
    }
}
