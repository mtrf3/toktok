package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import java.util.List;

/* renamed from: X.BkC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29640BkC extends TBS implements InterfaceC88472Yns<List<? extends RoomDecoration>, C76800UCe> {
    public C29640BkC(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "updateDonationDecoration", "updateDonationDecoration(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends RoomDecoration> list) {
        ((DecorationWrapperWidget) this.receiver).yN(list);
        return C76800UCe.LIZ;
    }
}
