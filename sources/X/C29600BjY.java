package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import kotlin.jvm.internal.o;

/* renamed from: X.BjY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29600BjY extends TBS implements InterfaceC88472Yns<RoomDecoration, C76800UCe> {
    public C29600BjY(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "selectDonationSticker", "selectDonationSticker(Lcom/bytedance/android/livesdk/model/RoomDecoration;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(RoomDecoration roomDecoration) {
        RoomDecoration p0 = roomDecoration;
        o.LJIIIZ(p0, "p0");
        ((DecorationWrapperWidget) this.receiver).LJLZ(p0);
        return C76800UCe.LIZ;
    }
}
