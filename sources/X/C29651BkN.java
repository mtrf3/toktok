package X;

import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.BkN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29651BkN extends TBS implements InterfaceC88472Yns<C32208CkW, C76800UCe> {
    public C29651BkN(Object obj) {
        super(1, obj, StickerEditFragment.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C32208CkW c32208CkW) {
        C32208CkW p0 = c32208CkW;
        o.LJIIIZ(p0, "p0");
        StickerEditFragment stickerEditFragment = (StickerEditFragment) this.receiver;
        stickerEditFragment.getClass();
        if (p0.LIZ == 0) {
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = stickerEditFragment.LJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            stickerEditFragment.vl();
        }
        return C76800UCe.LIZ;
    }
}
