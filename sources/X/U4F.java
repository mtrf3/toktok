package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final /* synthetic */ class U4F extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public U4F(Object obj) {
        super(1, obj, AudienceBottomLeftLinkWidget.class, "adjustEnable", "adjustEnable(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int i;
        Drawable drawable;
        int intValue = num.intValue();
        AudienceBottomLeftLinkWidget audienceBottomLeftLinkWidget = (AudienceBottomLeftLinkWidget) this.receiver;
        if (intValue != 1) {
            if (intValue != 2) {
                audienceBottomLeftLinkWidget.getClass();
            } else {
                audienceBottomLeftLinkWidget.LJLZ();
            }
        } else {
            LiveIconView liveIconView = audienceBottomLeftLinkWidget.LJLILLLLZI;
            if (liveIconView != null) {
                if (audienceBottomLeftLinkWidget.LJLIL) {
                    i = R.drawable.cx3;
                } else {
                    i = R.drawable.cx1;
                }
                Drawable LIZ = C15400j2.LIZ(i);
                if (LIZ != null && (drawable = LIZ.mutate()) != null) {
                    drawable.setAlpha(128);
                } else {
                    drawable = null;
                }
                liveIconView.setImageDrawable(new C1Q4(drawable));
            }
        }
        return C76800UCe.LIZ;
    }
}
