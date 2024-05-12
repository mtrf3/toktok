package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BUj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28861BUj implements InterfaceC28903BVz {
    public View LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.msr;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.at8;
        }
        return R.attr.at0;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_qa_quick_mode_entrance_show"), this.LJLILLLLZI, "interaction_panel", "enter_from");
    }

    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        if (context != null) {
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 11);
            if (C1I.LIZJ) {
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LJIILL = true;
                c47071t1.LJIILLIIL(R.string.msd);
                c47071t1.LJFF(R.string.msc);
                c47071t1.LJIIIZ(R.string.msa, new C28862BUk(aqS155S0100000_5));
                c47071t1.LJIIJJI(R.string.msb);
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "2368817254053113625")).LIZ) {
                    LIZ.show();
                }
            } else {
                aqS155S0100000_5.invoke();
            }
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.pv0(DismissToolbarPopEvent.class);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_qa_quick_mode_click");
        LIZ2.LJIILLIIL(this.LJLILLLLZI);
        LIZ2.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28903BVz
    public final void LIZIZ(View view, DataChannel dataChannel) {
        this.LJLIL = view;
        this.LJLILLLLZI = dataChannel;
    }
}
