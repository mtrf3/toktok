package X;

import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import com.bytedance.android.widget.Widget;

/* loaded from: classes14.dex */
public final /* synthetic */ class U4G extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public U4G(Object obj) {
        super(1, obj, AudienceBottomLeftLinkWidget.class, "setVisible", "setVisible(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Widget widget = (Widget) this.receiver;
        if (booleanValue) {
            widget.show();
        } else {
            widget.hide();
        }
        return C76800UCe.LIZ;
    }
}
