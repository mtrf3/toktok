package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel.TryModeMultiGuestAnchorManageSheet;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BTt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28845BTt implements InterfaceViewOnClickListenerC30227Btf {
    public long LJLIL = -1;
    public DataChannel LJLILLLLZI;

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
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final void LIZ() {
        FragmentManager fragmentManager;
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII("ToolbarTryModeMultiGuestBehavior", "showTryModeMultiGuestAnchorManageDialog");
        if (C12840eu.LIZ.LIZ(this.LJLIL)) {
            C28733BPl.LJIILIIL().getClass();
            C0NE.LJII("ToolbarTryModeMultiGuestBehavior", "tryModeMultiGuestAnchorManageSheetOpened, so return");
            return;
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        } else {
            fragmentManager = null;
        }
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        this.LJLIL = C32044Chs.LJIIIZ(fragmentManager, TryModeMultiGuestAnchorManageSheet.class, "try_mode_multi_guest_anchor_manage_dialog", sheetOptions, null);
        C74824TYe.LJLL("livesdk_trymode_anchor_guest_connection_entrance_click", C77123UOp.LJJIIZ());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClick, showTryModeNewAnchor=");
        LIZ.append(C78540Us4.LJJIII());
        LIZ.append(", TRY_MODE_MULTI_GUEST_WEBP_SHOW=");
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.t3;
        LIZ.append(c48459J0d.LIZJ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LJII("ToolbarTryModeMultiGuestBehavior", LIZIZ);
        if (C78540Us4.LJJIII()) {
            Boolean LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "TRY_MODE_MULTI_GUEST_WEBP_SHOW.value");
            if (LIZJ.booleanValue()) {
                C28733BPl.LJIILIIL().getClass();
                C0NE.LJII("ToolbarTryModeMultiGuestBehavior", "show educationSheetFragment");
                LiveDialogFragment createTryModeEducationDialogFragment = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createTryModeEducationDialogFragment("multi_guest", new ACListenerS25S0100000_5(this, 284));
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    createTryModeEducationDialogFragment.show(fragmentManager, "try_mode_education_multi_guest_sheet");
                    return;
                }
                return;
            }
        }
        LIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII("ToolbarTryModeMultiGuestBehavior", "onLoad");
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        W5G w5g = (W5G) interfaceC30237Btp.LIZ(R.id.ext);
        if (w5g != null) {
            if (z) {
                w5g.setImageResource(R.drawable.cx3);
            } else {
                w5g.setImageResource(R.drawable.cx1);
            }
        }
    }
}
