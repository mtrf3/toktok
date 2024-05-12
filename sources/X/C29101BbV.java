package X;

import com.bytedance.android.live.room.OneTapGoLiveEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.BbV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29101BbV extends TBS implements InterfaceC88472Yns<Room, C76800UCe> {
    public C29101BbV(Object obj) {
        super(1, obj, HandlerC29100BbU.class, "handleCanLinkMic", "handleCanLinkMic(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Room p0) {
        o.LJIIIZ(p0, "p0");
        HandlerC29100BbU handlerC29100BbU = (HandlerC29100BbU) this.receiver;
        handlerC29100BbU.LJFF();
        DataChannelGlobal.LJLJJI.sv0(OneTapGoLiveEvent.class, new C31978Cgo(handlerC29100BbU.LJ, Integer.valueOf(handlerC29100BbU.LJFF)));
        return C76800UCe.LIZ;
    }
}
