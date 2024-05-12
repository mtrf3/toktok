package X;

import Y.IDcS172S0100000_13;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TX5 implements InterfaceC14120gy {
    public final /* synthetic */ VoiceChatWatchWidget LJLIL;

    public TX5(VoiceChatWatchWidget voiceChatWatchWidget) {
        this.LJLIL = voiceChatWatchWidget;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        User user;
        Room room;
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        VoiceChatWatchWidget voiceChatWatchWidget = this.LJLIL;
        Object[] objArr = new Object[1];
        DataChannel dataChannel = voiceChatWatchWidget.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        objArr[0] = C05170If.LIZLLL(user);
        String LJIILL = C15380j0.LJIILL(R.string.kv7, objArr);
        C47071t1 c47071t1 = new C47071t1(C8E.LIZ().getTopActivity());
        c47071t1.LIZJ = LJIILL;
        c47071t1.LJFF(R.string.m7x);
        c47071t1.LJIIL(R.string.now, new IDcS172S0100000_13(voiceChatWatchWidget, 10));
        c47071t1.LJIIIZ(R.string.np2, TXA.LJLIL);
        VoiceChatWatchWidget.LJZI(c47071t1.LIZ());
    }
}
