package X;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* renamed from: X.TbP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74959TbP implements InterfaceC21030s7 {
    public final /* synthetic */ AbsMultiGuestNewPreviewFragment LJLIL;

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Ec(float f) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void G(int i, int i2, String str) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Wg(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Wk() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void bh() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void ha(boolean z) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void m7() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void s2(LiveCore liveCore, Cert cert) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void t8() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void tl() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void u4(long j) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void v3() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void x() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xb(C34941Ys c34941Ys) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xj(int i) {
    }

    @Override // X.InterfaceC21030s7
    public final void z0() {
        Integer value;
        View view;
        View view2;
        AbsMultiGuestNewPreviewViewModel Kl = this.LJLIL.Kl();
        if (Kl == null || (value = Kl.hv0().getValue()) == null || value.intValue() != 2) {
            return;
        }
        AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment = this.LJLIL;
        C47061t0 c47061t0 = absMultiGuestNewPreviewFragment.LJLJJL;
        if (c47061t0 != null) {
            C87277YNd.LJJIIZ(c47061t0);
        }
        C47061t0 c47061t02 = absMultiGuestNewPreviewFragment.LJLJJLL;
        if (c47061t02 != null) {
            C87277YNd.LJJIIZ(c47061t02);
        }
        C2A4 c2a4 = absMultiGuestNewPreviewFragment.LJLJL;
        if (c2a4 != null) {
            C87277YNd.LJJIIZI(c2a4);
        }
        C2A4 c2a42 = absMultiGuestNewPreviewFragment.LJLJL;
        if (c2a42 != null) {
            c2a42.LJ();
        }
        AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment2 = this.LJLIL;
        Object Hl = absMultiGuestNewPreviewFragment2.Hl();
        if ((Hl instanceof SurfaceView) && (view2 = (View) Hl) != null) {
            C87277YNd.LJJIJ(view2);
        }
        Object Hl2 = absMultiGuestNewPreviewFragment2.Hl();
        if (!(Hl2 instanceof TextureView) || (view = (View) Hl2) == null) {
            return;
        }
        C87277YNd.LJJIJ(view);
    }

    public C74959TbP(AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment) {
        this.LJLIL = absMultiGuestNewPreviewFragment;
    }
}
