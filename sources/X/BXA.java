package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BXA extends TBS implements InterfaceC88472Yns<Room, C76800UCe> {
    public BXA(Object obj) {
        super(1, obj, HandlerC29100BbU.class, "jumpToLive", "jumpToLive(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Room room) {
        Room p0 = room;
        o.LJIIIZ(p0, "p0");
        ((HandlerC29100BbU) this.receiver).LJIIJJI(p0);
        return C76800UCe.LIZ;
    }
}
