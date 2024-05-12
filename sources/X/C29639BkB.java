package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;

/* renamed from: X.BkB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29639BkB extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C29639BkB(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        if (booleanValue) {
            decorationWrapperWidget.LJZI = true;
            decorationWrapperWidget.LLFFF();
        } else {
            decorationWrapperWidget.LJZI = false;
            decorationWrapperWidget.LLFFF();
        }
        return C76800UCe.LIZ;
    }
}
