package X;

import Y.IDcS17S0300000_13;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Tgc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75282Tgc implements C0WQ {
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.C0WQ
    public final void onFail() {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
        multiGuestSharedBgAnchorViewModel.kv0(this.LIZIZ, multiGuestSharedBgAnchorViewModel.LJLIL);
    }

    @Override // X.C0WQ
    public final void LIZ(LiveEffect liveEffect) {
        if (!this.LIZ.getState().LJLJI) {
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
            Context context = this.LIZIZ;
            DataChannel dataChannel = multiGuestSharedBgAnchorViewModel.LJLIL;
            C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog");
            C75285Tgf.LJ("grid_shared_panel_used", "show");
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJIILLIIL(R.string.n8c);
            c47071t1.LJFF(R.string.n8b);
            c47071t1.LJIIIZ(R.string.n8a, new IDcS17S0300000_13(multiGuestSharedBgAnchorViewModel, context, dataChannel, 4));
            c47071t1.LJIIL(R.string.n8d, new C75281Tgb(liveEffect, dataChannel, multiGuestSharedBgAnchorViewModel, context));
            c47071t1.LJIILJJIL = false;
            LiveDialog LIZ = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6785969780452111148")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = this.LIZ;
        multiGuestSharedBgAnchorViewModel2.kv0(this.LIZIZ, multiGuestSharedBgAnchorViewModel2.LJLIL);
    }

    public C75282Tgc(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context) {
        this.LIZ = multiGuestSharedBgAnchorViewModel;
        this.LIZIZ = context;
    }
}
