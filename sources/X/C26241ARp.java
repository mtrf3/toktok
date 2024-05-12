package X;

import android.app.Dialog;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("feed_survey_tux_pop")
/* renamed from: X.ARp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26241ARp extends AbstractC56327M8t<Dialog> {
    public final InterfaceC56322M8o LJLIL;
    public final C26231ARf LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 240;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        return this.LJLILLLLZI.LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26241ARp(InterfaceC56322M8o pagePopupScene, C26231ARf tuxDialog) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        o.LJIIIZ(tuxDialog, "tuxDialog");
        this.LJLIL = pagePopupScene;
        this.LJLILLLLZI = tuxDialog;
    }
}
