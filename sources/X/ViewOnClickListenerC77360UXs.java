package X;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlSetting;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;

/* renamed from: X.UXs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC77360UXs implements View.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ SheetDemoFragment LJLILLLLZI;

    public ViewOnClickListenerC77360UXs(String str, SheetDemoFragment sheetDemoFragment) {
        this.LJLIL = str;
        this.LJLILLLLZI = sheetDemoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String sparkOverlay = LiveSheetDemoLynxUrlSetting.sparkOverlay();
        new C32364Cn2(sparkOverlay).LIZJ("loading_height", this.LJLIL);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLILLLLZI.getContext(), sparkOverlay);
    }
}
