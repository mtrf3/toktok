package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30415Bwh extends BZU {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;

    public C30415Bwh(LiveBroadcastFragment liveBroadcastFragment) {
        this.LJLIL = liveBroadcastFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLIL.LLIIIZ == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("live_take_beauty_click");
        LIZ.LJIILLIIL(this.LJLIL.LJIIL());
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("click");
        LIZ.LJJIIJZLJL();
        if (BeautyPanelMemoryOptSetting.INSTANCE.enable() && view.getContext() == null) {
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LiveDialogFragment LIZ2 = C30355Bvj.LIZ(context, this.LJLIL.LJIIL());
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        LIZ2.show(childFragmentManager, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (X.C1KS.LIZJ() != false) goto L8;
     */
    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(X.InterfaceC30237Btp r3, com.bytedance.ies.sdk.datachannel.DataChannel r4) {
        /*
            r2 = this;
            super.i(r3, r4)
            com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto L24
            X.C30355Bvj.LJFF()
            boolean r0 = X.C1KS.LIZIZ()
            if (r0 != 0) goto L1d
            X.C30355Bvj.LJFF()
            boolean r0 = X.C1KS.LIZJ()
            if (r0 == 0) goto L24
        L1d:
            X.BtI r1 = X.EnumC30204BtI.BEAUTY
            r0 = 1
            r1.setRedDotVisible(r4, r0)
        L23:
            return
        L24:
            X.BtI r1 = X.EnumC30204BtI.BEAUTY
            r0 = 0
            r1.setRedDotVisible(r4, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30415Bwh.i(X.Btp, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
