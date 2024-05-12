package com.bytedance.android.live;

import X.C31061Ju;
import X.InterfaceC06390Mx;
import X.InterfaceC09670Zn;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* loaded from: classes.dex */
public interface ICommentService extends InterfaceC06390Mx {
    void Em0(long j, String str, String str2, int i, ISendCommentEvent.Sender sender);

    void LLZLI();

    void Lt0(InterfaceC09670Zn interfaceC09670Zn);

    List<C31061Ju> Td();

    Class<? extends LiveRecyclableWidget> XC();

    void YJ(DataChannel dataChannel, EmoteModel emoteModel, FragmentManager fragmentManager, boolean z);

    void cn(InterfaceC09670Zn interfaceC09670Zn);

    Class<? extends LiveRecyclableWidget> de0();

    void o50(Context context, DataChannel dataChannel);

    void qr(long j, List list, ISendCommentEvent.Sender sender);

    void tD(Room room, DataChannel dataChannel);
}
