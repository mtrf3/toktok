package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31979Cgp extends TBS implements InterfaceC88472Yns<EnumC06880Ou, Boolean> {
    public C31979Cgp(Object obj) {
        super(1, obj, ShortCutPanelWidget.class, "canShowSubPanel", "canShowSubPanel(Lcom/bytedance/android/live/broadcast/shortcutpanel/ShortCutPanel;)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(EnumC06880Ou enumC06880Ou) {
        EnumC06880Ou p0 = enumC06880Ou;
        o.LJIIIZ(p0, "p0");
        return Boolean.valueOf(((ShortCutPanelWidget) this.receiver).LJZ(p0));
    }
}
