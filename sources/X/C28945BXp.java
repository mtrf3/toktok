package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BXp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28945BXp implements InterfaceViewOnClickListenerC30227Btf {
    public InterfaceC30237Btp LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ DecorationWrapperWidget LJLJI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        return !this.LJLJI.LJLZ;
    }

    public C28945BXp(DecorationWrapperWidget decorationWrapperWidget) {
        this.LJLJI = decorationWrapperWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        DecorationWrapperWidget decorationWrapperWidget = this.LJLJI;
        if (decorationWrapperWidget.LJLZ) {
            C30868C9o.LIZLLL(R.string.o79, decorationWrapperWidget.getContext());
        } else if (DecorationWrapperWidget.LL) {
            C30868C9o.LIZLLL(R.string.o1d, decorationWrapperWidget.getContext());
        } else {
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(decorationWrapperWidget.context);
            if (LIZIZ != null) {
                LiveStickerDonationListDialog liveStickerDonationListDialog = new LiveStickerDonationListDialog();
                Bundle bundle = new Bundle();
                bundle.putString("event_page", "live_take_detail");
                liveStickerDonationListDialog.setArguments(bundle);
                BaseDialogFragment.wl(LIZIZ, liveStickerDonationListDialog);
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_donation_click");
        LIZ.LJIILLIIL(this.LJLJI.dataChannel);
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ(C28949BXt.LIZIZ(), "powered_by");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        int i;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = interfaceC30237Btp;
        boolean z = this.LJLILLLLZI;
        this.LJLILLLLZI = z;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        interfaceC30237Btp.setVisibility(i);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_donation_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ(C28949BXt.LIZIZ(), "powered_by");
        LIZ.LJJIIJZLJL();
    }
}
