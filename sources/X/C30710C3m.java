package X;

import com.bytedance.android.live.broadcast.api.LiveStreamFpsReportData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* renamed from: X.C3m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30710C3m implements InterfaceC21030s7 {
    public final /* synthetic */ C30698C3a LJLIL;

    @Override // X.InterfaceC21030s7
    public final void Ec(float f) {
    }

    @Override // X.InterfaceC21030s7
    public final void G(int i, int i2, String str) {
    }

    @Override // X.InterfaceC21030s7
    public final void Wg(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC21030s7
    public final void Wk() {
    }

    @Override // X.InterfaceC21030s7
    public final void bh() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void ha(boolean z) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
    }

    @Override // X.InterfaceC21030s7
    public final void m7() {
    }

    @Override // X.InterfaceC21030s7
    public final void s2(LiveCore liveCore, Cert cert) {
    }

    @Override // X.InterfaceC21030s7
    public final void t8() {
    }

    @Override // X.InterfaceC21030s7
    public final void tl() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void u4(long j) {
    }

    @Override // X.InterfaceC21030s7
    public final void v3() {
    }

    @Override // X.InterfaceC21030s7
    public final void x() {
    }

    @Override // X.InterfaceC21030s7
    public final void xj(int i) {
    }

    @Override // X.InterfaceC21030s7
    public final void z0() {
    }

    public C30710C3m(C30698C3a c30698C3a) {
        this.LJLIL = c30698C3a;
    }

    @Override // X.InterfaceC21030s7
    public final void xb(C34941Ys c34941Ys) {
        DataChannel dataChannel = this.LJLIL.LJLLLL;
        if (dataChannel != null) {
            dataChannel.qv0(LiveStreamFpsReportData.class, c34941Ys);
        }
    }
}
