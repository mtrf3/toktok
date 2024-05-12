package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.TVz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74767TVz implements InterfaceC14120gy {
    public final /* synthetic */ GameLinkWidget LJLIL;

    public C74767TVz(GameLinkWidget gameLinkWidget) {
        this.LJLIL = gameLinkWidget;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        this.LJLIL.showDisconnectSecondWindow();
    }
}
