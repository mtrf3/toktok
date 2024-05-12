package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bwb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30409Bwb extends BZU {
    public final /* synthetic */ VideoWidget LJLIL;

    public C30409Bwb(VideoWidget videoWidget) {
        this.LJLIL = videoWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.showStickerPanel(LiveEffectShortcutPanelTypeSetting.INSTANCE.canShowShortCutPanelWhenClickEntrance(), false, true, false, false);
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        super.i(interfaceC30237Btp, dataChannel);
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.STICKER;
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            C30355Bvj.LJFF();
            if (C1KS.LIZLLL()) {
                z = true;
                enumC30204BtI.setRedDotVisible(dataChannel, z);
            }
        }
        z = false;
        enumC30204BtI.setRedDotVisible(dataChannel, z);
    }
}
