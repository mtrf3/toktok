package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.BbQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29096BbQ extends TBS implements InterfaceC88472Yns<Cert, C76800UCe> {
    public C29096BbQ(Object obj) {
        super(1, obj, LiveBroadcastFragment.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Cert cert) {
        Cert p0 = cert;
        o.LJIIIZ(p0, "p0");
        ((LiveBroadcastFragment) this.receiver).lm(p0);
        return C76800UCe.LIZ;
    }
}
